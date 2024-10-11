import unittest
from ansible.utils.collection_loader._collection_finder import AnsibleCollectionRef



class Test_AnsibleCollectionFinder(unittest.TestCase):
    def test_init(self):
        instance = _AnsibleCollectionFinder()
        self.assertEqual(instance._ansible_pkg_path, to_native(os.path.dirname(to_bytes(sys.modules['ansible'].__file__))))
        self.assertEqual(instance._n_configured_paths, [])
        self.assertEqual(instance._n_cached_collection_paths, None)
        self.assertEqual(instance._n_cached_collection_qualified_paths, None)
        self.assertEqual(instance._n_playbook_paths, [])

    def test_remove(self):
        instance = _AnsibleCollectionFinder()
        instance._remove()
        self.assertEqual(sys.meta_path, [])
        self.assertEqual(sys.path_hooks, [])
        self.assertEqual(sys.path_importer_cache, {})
        self.assertEqual(AnsibleCollectionConfig.collection_finder, None)

    def test_install(self):
        instance = _AnsibleCollectionFinder()
        instance._install()
        self.assertEqual(sys.meta_path[0], instance)
        self.assertEqual(sys.path_hooks[0], instance._ansible_collection_path_hook)
        self.assertEqual(AnsibleCollectionConfig.collection_finder, instance)

    def test_n_collection_paths(self):
        instance = _AnsibleCollectionFinder()
        self.assertEqual(instance._n_collection_paths, [])

    def test_set_playbook_paths(self):
        instance = _AnsibleCollectionFinder()
        instance.set_playbook_paths('test_playbook_path')
        self.assertEqual(instance._n_playbook_paths, [os.path.join(to_native('test_playbook_path'), 'collections')])
        self.assertEqual(instance._n_cached_collection_paths, None)

    def test_n_collection_paths(self):
        instance = _AnsibleCollectionFinder()
        self.assertEqual(instance._n_collection_paths, [])

    def test_reload_hack(self):
        instance = _AnsibleCollectionFinder()
        instance._reload_hack('test_fullname')

    def test_find_module(self):
        instance = _AnsibleCollectionFinder()
        self.assertEqual(instance.find_module('test_fullname', 'test_path'), None)


class Test_AnsiblePathHookFinder(unittest.TestCase):
    def test_init(self):
        instance = _AnsiblePathHookFinder('test_path_hook', 'test_path')
        self.assertEqual(instance._path_hook, 'test_path_hook')
        self.assertEqual(instance._path, 'test_path')

    def test_find_module(self):
        instance = _AnsiblePathHookFinder('test_path_hook', 'test_path')
        self.assertEqual(instance.find_module('test_fullname'), None)


class Test_AnsibleInternalRedirectLoader(unittest.TestCase):
    def test_init(self):
        instance = _AnsibleInternalRedirectLoader('test_fullname', 'test_path_list')
        self.assertEqual(instance.fullname, 'test_fullname')
        self.assertEqual(instance.path_list, 'test_path_list')

    def test_load_module(self):
        instance = _AnsibleInternalRedirectLoader('test_fullname', 'test_path_list')
        self.assertEqual(instance.load_module('test_fullname'), None)

    def test_get_source(self):
        instance = _AnsibleInternalRedirectLoader('test_fullname', 'test_path_list')
        self.assertEqual(instance.get_source('test_fullname'), None)

if __name__ == '__main__':
    unittest.main()