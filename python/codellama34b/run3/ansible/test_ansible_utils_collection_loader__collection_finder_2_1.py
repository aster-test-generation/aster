import unittest
from ansible.utils.collection_loader import AnsibleCollectionRef



class Test_AnsibleInternalRedirectLoader(unittest.TestCase):
    def test_init(self):
        fullname = 'ansible.builtin'
        path_list = []
        instance = _AnsibleInternalRedirectLoader(fullname, path_list)
        self.assertEqual(instance._redirect, None)

    def test_load_module(self):
        fullname = 'ansible.builtin'
        path_list = []
        instance = _AnsibleInternalRedirectLoader(fullname, path_list)
        result = instance.load_module(fullname)
        self.assertEqual(result, None)

class Test_collection_finder(unittest.TestCase):
    def test_init(self):
        instance = _collection_finder()
        self.assertEqual(instance.path, None)

    def test_find_module(self):
        instance = _collection_finder()
        fullname = 'ansible.builtin'
        path = None
        result = instance.find_module(fullname, path)
        self.assertEqual(result, None)

    def test_find_spec(self):
        instance = _collection_finder()
        fullname = 'ansible.builtin'
        path = None
        target = None
        result = instance.find_spec(fullname, path, target)
        self.assertEqual(result, None)

    def test_invalidate_caches(self):
        instance = _collection_finder()
        result = instance.invalidate_caches()
        self.assertEqual(result, None)

    def test_create_module(self):
        instance = _collection_finder()
        spec = None
        result = instance.create_module(spec)
        self.assertEqual(result, None)

    def test_exec_module(self):
        instance = _collection_finder()
        module = None
        result = instance.exec_module(module)
        self.assertEqual(result, None)

    def test_get_code(self):
        instance = _collection_finder()
        module = None
        result = instance.get_code(module)
        self.assertEqual(result, None)

    def test_get_source(self):
        instance = _collection_finder()
        module = None
        result = instance.get_source(module)
        self.assertEqual(result, None)

    def test_is_package(self):
        instance = _collection_finder()
        module = None
        result = instance.is_package(module)
        self.assertEqual(result, None)

    def test_iter_modules(self):
        instance = _collection_finder()
        prefix = None
        result = instance.iter_modules(prefix)
        self.assertEqual(result, None)

    def test_load_module(self):
        instance = _collection_finder()
        fullname = 'ansible.builtin'
        result = instance.load_module(fullname)
        self.assertEqual(result, None)

    def test_module_repr(self):
        instance = _collection_finder()
        module = None
        result = instance.module_repr(module)
        self.assertEqual(result, None)

    def test_path_hook_for_FileFinder(self):
        instance = _collection_finder()
        path = None
        result = instance.path_hook_for_FileFinder(path)
        self.assertEqual(result, None)

    def test_path_hook_for_PathFinder(self):
        instance = _collection_finder()
        path = None
        result = instance.path_hook_for_PathFinder(path)
        self.assertEqual(result, None)

    def test_path_hook(self):
        instance = _collection_finder()
        path = None
        result = instance.path_hook(path)
        self.assertEqual(result, None)

if __name__ == '__main__':
    unittest.main()