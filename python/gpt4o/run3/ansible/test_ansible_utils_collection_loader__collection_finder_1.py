import unittest
import os
import sys
from ansible.utils.collection_loader._collection_finder import AnsibleCollectionRef
from ansible.module_utils.common.text.converters import to_native, to_bytes
from ansible.module_utils.six import string_types


class TestAnsibleCollectionFinder(unittest.TestCase):

    def setUp(self):
        self.paths = ['/fake/path']
        self.finder = _AnsibleCollectionFinder(paths=self.paths, scan_sys_paths=False)

    def test_init(self):
        self.assertEqual(self.finder._n_configured_paths, [])
        self.assertEqual(self.finder._n_cached_collection_paths, None)
        self.assertEqual(self.finder._n_cached_collection_qualified_paths, None)
        self.assertEqual(self.finder._n_playbook_paths, [])

    def test_remove(self):
        _AnsibleCollectionFinder._remove()
        self.assertIsNone(AnsibleCollectionConfig.collection_finder)

    def test_install(self):
        self.finder._install()
        self.assertEqual(sys.meta_path[0], self.finder)
        self.assertEqual(sys.path_hooks[0], self.finder._ansible_collection_path_hook)
        self.assertEqual(AnsibleCollectionConfig.collection_finder, self.finder)

    def test_ansible_collection_path_hook(self):
        self.finder._n_cached_collection_qualified_paths = ['/fake/path/ansible_collections']
        result = self.finder._ansible_collection_path_hook('/fake/path/ansible_collections')
        self.assertIsInstance(result, _AnsiblePathHookFinder)

    def test_ansible_collection_path_hook_import_error(self):
        with self.assertRaises(ImportError):
            self.finder._ansible_collection_path_hook('/unrelated/path')

    def test_n_collection_paths(self):
        self.finder._n_cached_collection_paths = None
        self.finder._n_playbook_paths = ['/playbook/path']
        self.finder._n_configured_paths = ['/configured/path']
        result = self.finder._n_collection_paths
        self.assertEqual(result, ['/playbook/path', '/configured/path'])

    def test_set_playbook_paths(self):
        self.finder.set_playbook_paths('/playbook/path')
        self.assertEqual(self.finder._n_playbook_paths, ['/playbook/path/collections'])
        self.assertIsNone(self.finder._n_cached_collection_paths)

    def test_reload_hack(self):
        sys.modules['ansible_collections'] = ModuleType('ansible_collections')
        self.finder._reload_hack('ansible_collections')
        self.assertIn('ansible_collections', sys.modules)

    def test_find_module(self):
        result = self.finder.find_module('ansible')
        self.assertIsInstance(result, _AnsibleInternalRedirectLoader)

    def test_find_module_invalid_toplevel(self):
        result = self.finder.find_module('invalid_pkg')
        self.assertIsNone(result)

    def test_find_module_invalid_path(self):
        with self.assertRaises(ValueError):
            self.finder.find_module('ansible', path='invalid_path')

    def test_find_module_import_error(self):
        with self.assertRaises(ImportError):
            self.finder.find_module('ansible_collections.invalid_pkg')

if __name__ == '__main__':
    unittest.main()