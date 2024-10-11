import unittest
from ansible.utils.collection_loader.collection_finder import CollectionFinde


class TestAnsibleCollectionFinder(unittest.TestCase):
    def test_init(self):
        finder = _AnsibleCollectionFinder()
        self.assertEqual(finder._ansible_pkg_path, os.path.dirname(to_bytes(sys.modules['ansible'].__file__)))

    def test_set_playbook_paths(self):
        finder = _AnsibleCollectionFinder()
        finder.set_playbook_paths(['path1', 'path2'])
        self.assertEqual(finder._n_playbook_paths, [os.path.join(to_native(p), 'collections') for p in ['path1', 'path2']])

    def test_find_module(self):
        finder = _AnsibleCollectionFinder()
        result = finder.find_module('ansible_collections.ansible.collection')
        self.assertIsInstance(result, _AnsibleCollectionLoader)

    def test_remove(self):
        finder = _AnsibleCollectionFinder()
        finder._remove()
        self.assertIsNone(AnsibleCollectionConfig.collection_finder)

    def test_install(self):
        finder = _AnsibleCollectionFinder()
        finder._install()
        self.assertEqual(AnsibleCollectionConfig.collection_finder, finder)

    def test_ansible_collection_path_hook(self):
        finder = _AnsibleCollectionFinder()
        result = finder._ansible_collection_path_hook('path')
        self.assertIsInstance(result, _AnsiblePathHookFinder)

    def test_n_collection_paths(self):
        finder = _AnsibleCollectionFinder()
        self.assertEqual(finder._n_collection_paths, [])

    def test_reload_hack(self):
        finder = _AnsibleCollectionFinder()
        m = sys.modules.get('ansible_collections')
        finder._reload_hack('ansible_collections')
        self.assertEqual(m, sys.modules.get('ansible_collections'))

    def test_str(self):
        finder = _AnsibleCollectionFinder()
        self.assertEqual(str(finder), 'AnsibleCollectionFinder')

    def test_repr(self):
        finder = _AnsibleCollectionFinder()
        self.assertEqual(repr(finder), 'AnsibleCollectionFinder()')

    def test_eq(self):
        finder1 = _AnsibleCollectionFinder()
        finder2 = _AnsibleCollectionFinder()
        self.assertEqual(finder1, finder2)

if __name__ == '__main__':
    unittest.main()