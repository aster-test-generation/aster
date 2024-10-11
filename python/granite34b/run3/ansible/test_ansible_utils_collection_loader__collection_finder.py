import unittest
from ansible.utils.collection_loader._collection_finder import _get_collection_playbook_path, _get_collection_role_path, _get_collection_resource_path, _get_collection_name_from_path, _get_import_redirect, _get_ancestor_redirect, _nested_dict_get, _iter_modules_impl, _get_collection_metadata


class TestCollectionFinder(unittest.TestCase):
    def test_get_collection_playbook_path(self):
        playbook = "playbook.yml"
        result = _get_collection_playbook_path(playbook)
        self.assertIsNotNone(result)

    def test_get_collection_role_path(self):
        role_name = "role_name"
        collection_list = ["collection1", "collection2"]
        result = _get_collection_role_path(role_name, collection_list)
        self.assertIsNotNone(result)

    def test_get_collection_resource_path(self):
        name = "resource_name"
        ref_type = "resource_type"
        collection_list = ["collection1", "collection2"]
        result = _get_collection_resource_path(name, ref_type, collection_list)
        self.assertIsNotNone(result)

    def test_get_collection_name_from_path(self):
        path = "/path/to/collection"
        result = _get_collection_name_from_path(path)
        self.assertIsNotNone(result)

    def test_get_import_redirect(self):
        collection_meta_dict = {"import_redirection": {"fullname": {"redirect": "redirected_fullname"}}}
        fullname = "fullname"
        result = _get_import_redirect(collection_meta_dict, fullname)
        self.assertEqual(result, "redirected_fullname")

    def test_get_ancestor_redirect(self):
        redirected_package_map = {"cur_pkg": "redirected_cur_pkg"}
        fullname = "fullname"
        result = _get_ancestor_redirect(redirected_package_map, fullname)
        self.assertEqual(result, "redirected_cur_pkgfullname")

    def test_nested_dict_get(self):
        root_dict = {"key1": {"key2": "value"}}
        key_list = ["key1", "key2"]
        result = _nested_dict_get(root_dict, key_list)
        self.assertEqual(result, "value")

    def test_iter_modules_impl(self):
        paths = ["/path/to/modules"]
        prefix = "prefix"
        result = _iter_modules_impl(paths, prefix)
        self.assertIsNotNone(result)

    def test_get_collection_metadata(self):
        collection_name = "namespace.collection"
        result = _get_collection_metadata(collection_name)
        self.assertIsNotNone(result)

if __name__ == '__main__':
    unittest.main()