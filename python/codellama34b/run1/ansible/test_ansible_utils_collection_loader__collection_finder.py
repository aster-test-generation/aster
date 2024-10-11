import unittest
from ansible.utils.collection_loader._collection_finder import AnsibleCollectionRef


class Test_collection_finder(unittest.TestCase):
    def test_get_collection_playbook_path(self):
        playbook = None
        result = _get_collection_playbook_path(playbook)
        self.assertEqual(result, None)

    def test_get_collection_role_path(self):
        role_name = None
        collection_list = None
        result = _get_collection_role_path(role_name, collection_list)
        self.assertEqual(result, None)

    def test_get_collection_resource_path(self):
        name = None
        ref_type = None
        collection_list = None
        result = _get_collection_resource_path(name, ref_type, collection_list)
        self.assertEqual(result, None)

    def test_get_collection_name_from_path(self):
        path = None
        result = _get_collection_name_from_path(path)
        self.assertEqual(result, None)

    def test_get_import_redirect(self):
        collection_meta_dict = None
        fullname = None
        result = _get_import_redirect(collection_meta_dict, fullname)
        self.assertEqual(result, None)

    def test_get_ancestor_redirect(self):
        redirected_package_map = None
        fullname = None
        result = _get_ancestor_redirect(redirected_package_map, fullname)
        self.assertEqual(result, None)

    def test_nested_dict_get(self):
        root_dict = None
        key_list = None
        result = _nested_dict_get(root_dict, key_list)
        self.assertEqual(result, None)

    def test_iter_modules_impl(self):
        paths = None
        prefix = None
        result = _iter_modules_impl(paths, prefix)
        self.assertEqual(result, None)

    def test_get_collection_metadata(self):
        collection_name = None
        result = _get_collection_metadata(collection_name)
        self.assertEqual(result, None)

if __name__ == '__main__':
    unittest.main()