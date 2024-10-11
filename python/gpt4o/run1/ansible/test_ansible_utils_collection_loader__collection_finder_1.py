import unittest
from ansible.utils.collection_loader._collection_finder import AnsibleCollectionRef
from ansible.module_utils.common.text.converters import to_native, to_bytes
import os
import sys


class TestAnsibleCollectionFinder(unittest.TestCase):
    def setUp(self):
        self.instance = _AnsibleCollectionFinder(paths=['/fake/path'], scan_sys_paths=False)

    def test_init(self):
        self.assertEqual(self.instance._n_playbook_paths, [])
        self.assertEqual(self.instance._n_cached_collection_paths, None)
        self.assertEqual(self.instance._n_cached_collection_qualified_paths, None)
        self.assertEqual(self.instance._n_configured_paths, ['/fake'])

    def test_remove(self):
        _AnsibleCollectionFinder._remove()
        self.assertIsNone(AnsibleCollectionConfig._collection_finder)

    def test_install(self):
        self.instance._install()
        self.assertEqual(sys.meta_path[0], self.instance)
        self.assertEqual(sys.path_hooks[0], self.instance._ansible_collection_path_hook)
        self.assertEqual(AnsibleCollectionConfig.collection_finder, self.instance)

    def test_ansible_collection_path_hook(self):
        self.instance._n_cached_collection_qualified_paths = ['/fake/path']
        result = self.instance._ansible_collection_path_hook('/fake/path')
        self.assertIsInstance(result, _AnsiblePathHookFinder)

    def test_ansible_collection_path_hook_import_error(self):
        self.instance._n_cached_collection_qualified_paths = ['/fake/path']
        with self.assertRaises(ImportError):
            self.instance._ansible_collection_path_hook('/not/interesting/path')

    def test_n_collection_paths(self):
        self.instance._n_cached_collection_paths = None
        result = self.instance._n_collection_paths
        self.assertEqual(result, ['/fake'])

    def test_set_playbook_paths(self):
        self.instance.set_playbook_paths(['/playbook/path'])
        self.assertEqual(self.instance._n_playbook_paths, ['/playbook/path/collections'])
        self.assertIsNone(self.instance._n_cached_collection_paths)

    def test_reload_hack(self):
        sys.modules['ansible_collections'] = ModuleType('ansible_collections')
        self.instance._reload_hack('ansible_collections')
        self.assertIn('ansible_collections', sys.modules)

    def test_find_module(self):
        result = self.instance.find_module('ansible', None)
        self.assertIsInstance(result, _AnsibleInternalRedirectLoader)

    def test_find_module_with_path(self):
        with self.assertRaises(ValueError):
            self.instance.find_module('ansible', '/some/path')

    def test_find_module_subpackage(self):
        with self.assertRaises(ValueError):
            self.instance.find_module('ansible.subpackage')

if __name__ == '__main__':
    unittest.main()