import os
import unittest
from ansible.utils.collection_loader._collection_finder import (
    _get_collection_playbook_path,
    _get_collection_role_path,
    _get_collection_resource_path,
    _get_collection_name_from_path,
    _get_import_redirect,
    _get_ancestor_redirect,
    _nested_dict_get,
    _iter_modules_impl,
    _get_collection_metadata,
)


class TestCollectionFinder(unittest.TestCase):
    def test_get_collection_playbook_path(self):
        # Test case 1: playbook path exists
        playbook = "namespace.collection.playbook"
        resource, path, collection = _get_collection_playbook_path(playbook)
        self.assertEqual(resource, "playbook")
        self.assertTrue(os.path.exists(path))
        self.assertEqual(collection, "namespace.collection")

        # Test case 2: playbook path does not exist
        playbook = "namespace.collection.invalid_playbook"
        resource, path, collection = _get_collection_playbook_path(playbook)
        self.assertIsNone(resource)
        self.assertIsNone(path)
        self.assertIsNone(collection)

    def test_get_collection_role_path(self):
        # Test case 1: role path exists
        role_name = "namespace.collection.role"
        collection_list = ["namespace.collection"]
        resource, path, collection = _get_collection_role_path(role_name, collection_list)
        self.assertEqual(resource, "role")
        self.assertTrue(os.path.exists(path))
        self.assertEqual(collection, "namespace.collection")

        # Test case 2: role path does not exist
        role_name = "namespace.collection.invalid_role"
        collection_list = ["namespace.collection"]
        resource, path, collection = _get_collection_role_path(role_name, collection_list)
        self.assertIsNone(resource)
        self.assertIsNone(path)
        self.assertIsNone(collection)

    def test_get_collection_resource_path(self):
        # Test case 1: resource path exists
        name = "namespace.collection.resource"
        ref_type = "type"
        collection_list = ["namespace.collection"]
        resource, path, collection = _get_collection_resource_path(name, ref_type, collection_list)
        self.assertEqual(resource, "resource")
        self.assertTrue(os.path.exists(path))
        self.assertEqual(collection, "namespace.collection")

        # Test case 2: resource path does not exist
        name = "namespace.collection.invalid_resource"
        ref_type = "type"
        collection_list = ["namespace.collection"]
        resource, path, collection = _get_collection_resource_path(name, ref_type, collection_list)
        self.assertIsNone(resource)
        self.assertIsNone(path)
        self.assertIsNone(collection)

    def test_get_collection_name_from_path(self):
        # Test case 1: collection name can be extracted from path
        path = "/path/to/ansible_collections/namespace/collection"
        collection_name = _get_collection_name_from_path(path)
        self.assertEqual(collection_name, "namespace.collection")

        # Test case 2: collection name cannot be extracted from path
        path = "/path/to/invalid_collection"
        collection_name = _get_collection_name_from_path(path)
        self.assertIsNone(collection_name)

    def test_get_import_redirect(self):
        # Test case 1: import redirect exists
        collection_meta_dict = {
            "import_redirection": {
                "fullname": {
                    "redirect": "redirected_fullname"
                }
            }
        }
        fullname = "namespace.collection.fullname"
        redirect = _get_import_redirect(collection_meta_dict, fullname)
        self.assertEqual(redirect, "redirected_fullname")

        # Test case 2: import redirect does not exist
        collection_meta_dict = {
            "import_redirection": {
                "invalid_fullname": {
                    "redirect": "redirected_fullname"
                }
            }
        }
        fullname = "namespace.collection.fullname"
        redirect = _get_import_redirect(collection_meta_dict, fullname)
        self.assertIsNone(redirect)

if __name__ == '__main__':
    unittest.main()