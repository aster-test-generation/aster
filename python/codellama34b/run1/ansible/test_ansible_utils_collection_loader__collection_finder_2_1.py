import unittest
from ansible.utils.collection_loader import AnsibleCollectionRef



class Test_AnsibleInternalRedirectLoader(unittest.TestCase):
    def test_init(self):
        fullname = ''
        path_list = []
        instance = _AnsibleInternalRedirectLoader(fullname, path_list)
        self.assertEqual(instance._redirect, None)

    def test_load_module(self):
        fullname = ''
        path_list = []
        instance = _AnsibleInternalRedirectLoader(fullname, path_list)
        result = instance.load_module(fullname)
        self.assertEqual(result, None)

class Test_get_collection_metadata(unittest.TestCase):
    def test_get_collection_metadata(self):
        collection_name = ''
        result = _get_collection_metadata(collection_name)
        self.assertEqual(result, None)

class Test_nested_dict_get(unittest.TestCase):
    def test_nested_dict_get(self):
        data = {}
        keys = []
        result = _nested_dict_get(data, keys)
        self.assertEqual(result, None)

class Test_get_collection_metadata(unittest.TestCase):
    def test_get_collection_metadata(self):
        collection_name = ''
        result = _get_collection_metadata(collection_name)
        self.assertEqual(result, None)


if __name__ == '__main__':
    unittest.main()