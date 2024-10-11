import unittest
from ansible.utils.collection_loader._collection_finder import AnsibleCollectionRef


class TestAnsibleCollectionFinder(unittest.TestCase):
    def setUp(self):
        self.finder = _AnsibleCollectionFinder()

    def test_init(self):
        self.assertEqual(self.finder._ansible_pkg_path, os.path.dirname(os.path.abspath(sys.modules['ansible'].__file__)))
        self.assertEqual(self.finder._n_configured_paths, [])
        self.assertEqual(self.finder._n_cached_collection_paths, None)
        self.assertEqual(self.finder._n_cached_collection_qualified_paths, None)
        self.assertEqual(self.finder._n_playbook_paths, [])

    def test_remove(self):
        self.finder._remove()
        self.assertNotIn(self.finder, sys.meta_path)
        self.assertNotIn(self.finder._ansible_collection_path_hook, sys.path_hooks)
        self.assertEqual(AnsibleCollectionConfig.collection_finder, None)

    def test_install(self):
        self.finder._install()
        self.assertIn(self.finder, sys.meta_path)
        self.assertIn(self.finder._ansible_collection_path_hook, sys.path_hooks)
        self.assertEqual(AnsibleCollectionConfig.collection_finder, self.finder)

    def test_ansible_collection_path_hook(self):
        path = os.path.join(self.finder._ansible_pkg_path, 'ansible_collections')
        result = self.finder._ansible_collection_path_hook(path)
        self.assertIsInstance(result, _AnsiblePathHookFinder)

    def test_set_playbook_paths(self):
        playbook_paths = ['/path/to/playbook']
        self.finder.set_playbook_paths(playbook_paths)
        self.assertEqual(self.finder._n_playbook_paths, [os.path.join(p, 'collections') for p in playbook_paths])
        self.assertEqual(self.finder._n_cached_collection_paths, None)

    def test_reload_hack(self):
        fullname = 'ansible_collections'
        self.finder._reload_hack(fullname)
        self.assertIsNotNone(sys.modules.get(fullname))

if __name__ == '__main__':
    unittest.main()