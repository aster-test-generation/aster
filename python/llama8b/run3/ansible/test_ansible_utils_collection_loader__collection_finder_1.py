import unittest
from ansible.utils.collection_loader import CollectionFinde


class TestAnsibleCollectionFinder(unittest.TestCase):
    def test_init(self):
        finder = _AnsibleCollectionFinder()
        self.assertEqual(finder._ansible_pkg_path, os.path.dirname(os.path.dirname(__file__)))
        self.assertEqual(finder._n_configured_paths, [])

    def test_install(self):
        finder = _AnsibleCollectionFinder()
        finder._install()
        self.assertIn(finder, sys.meta_path)
        self.assertIn(finder._ansible_collection_path_hook, sys.path_hooks)
        AnsibleCollectionConfig.collection_finder = None

    def test_remove(self):
        finder = _AnsibleCollectionFinder()
        finder._install()
        finder._remove()
        self.assertNotIn(finder, sys.meta_path)
        self.assertNotIn(finder._ansible_collection_path_hook, sys.path_hooks)
        AnsibleCollectionConfig.collection_finder = None

    def test_set_playbook_paths(self):
        finder = _AnsibleCollectionFinder()
        finder.set_playbook_paths(['path1', 'path2'])
        self.assertEqual(finder._n_playbook_paths, ['path1/collections', 'path2/collections'])
        self.assertEqual(finder._n_cached_collection_paths, None)

    def test_find_module(self):
        finder = _AnsibleCollectionFinder()
        result = finder.find_module('ansible_collections.ansible.ansible')
        self.assertIsInstance(result, _AnsibleCollectionRootPkgLoader)

    def test_private_method(self):
        finder = _AnsibleCollectionFinder()
        with self.assertRaises(ImportError):
            finder._remove()

    def test_str_method(self):
        finder = _AnsibleCollectionFinder()
        result = str(finder)
        self.assertEqual(result, '<_AnsibleCollectionFinder object at 0x...>')

    def test_repr_method(self):
        finder = _AnsibleCollectionFinder()
        result = repr(finder)
        self.assertEqual(result, '_AnsibleCollectionFinder()')

if __name__ == '__main__':
    unittest.main()