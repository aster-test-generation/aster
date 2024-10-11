import unittest
from ansible.utils.collection_loader._collection_finder import AnsibleCollectionRef, _get_collection_name_from_path, _get_collection_playbook_path, _get_collection_role_path, _get_collection_resource_path, _get_import_redirect, _get_ancestor_redirect, _nested_dict_get, _iter_modules_impl, _get_collection_metadata


class TestAnsibleCollectionRef(unittest.TestCase):
    def test_try_parse_fqcr(self):
        acr = AnsibleCollectionRef.try_parse_fqcr("ansible.builtin.debug", "task")
        self.assertEqual(acr.n_python_collection_package_name, "ansible_collections.ansible.builtin")
        self.assertEqual(acr.n_python_package_name, "ansible_collections.ansible.builtin.plugins.module_utils")
        self.assertEqual(acr.n_python_module_name, "debug")
        self.assertEqual(acr.collection, "ansible.builtin")
        self.assertEqual(acr.resource, "debug")
        self.assertEqual(acr.ref_type, "task")
        self.assertEqual(acr.subdirs, "")

class TestGetCollectionNameFromPath(unittest.TestCase):
    def test_get_collection_name_from_path(self):
        collection_name = _get_collection_name_from_path("/path/to/ansible_collections/ansible/builtin")
        self.assertEqual(collection_name, "ansible.builtin")

class TestGetCollectionPlaybookPath(unittest.TestCase):
    def test_get_collection_playbook_path(self):
        result = _get_collection_playbook_path("ansible.builtin.debug")
        self.assertEqual(result, ("debug", "/path/to/ansible_collections/ansible/builtin/playbooks/debug.yml", "ansible.builtin"))

class TestGetCollectionRolePath(unittest.TestCase):
    def test_get_collection_role_path(self):
        result = _get_collection_role_path("my_role", ["ansible.builtin", "ansible.foo"])
        self.assertEqual(result, ("my_role", "/path/to/ansible_collections/ansible/builtin/roles/my_role", "ansible.builtin"))

class TestGetCollectionResourcePath(unittest.TestCase):
    def test_get_collection_resource_path(self):
        result = _get_collection_resource_path("my_role", "role", ["ansible.builtin", "ansible.foo"])
        self.assertEqual(result, ("my_role", "/path/to/ansible_collections/ansible/builtin/roles/my_role", "ansible.builtin"))

class TestGetImportRedirect(unittest.TestCase):
    def test_get_import_redirect(self):
        collection_meta_dict = {
            "import_redirection": {
                "ansible.builtin.debug": {
                    "redirect": "ansible.builtin.my_debug"
                }
            }
        }
        result = _get_import_redirect(collection_meta_dict, "ansible.builtin.debug")
        self.assertEqual(result, "ansible.builtin.my_debug")

class TestGetAncestorRedirect(unittest.TestCase):
    def test_get_ancestor_redirect(self):
        redirected_package_map = {
            "ansible.builtin": "ansible.foo"
        }
        result = _get_ancestor_redirect(redirected_package_map, "ansible.builtin.debug")
        self.assertEqual(result, "ansible.foo.debug")

class TestNestedDictGet(unittest.TestCase):
    def test_nested_dict_get(self):
        root_dict = {
            "foo": {
                "bar": {
                    "baz": "qux"
                }
            }
        }
        result = _nested_dict_get(root_dict, ["foo", "bar", "baz"])
        self.assertEqual(result, "qux")

class TestIterModulesImpl(unittest.TestCase):
    def test_iter_modules_impl(self):
        paths = ["/path/to/ansible_collections/ansible/builtin/plugins/module_utils"]
        result = list(_iter_modules_impl(paths))
        self.assertEqual(result, [("ansible.builtin.debug", False), ("ansible.builtin.my_debug", False)])


if __name__ == '__main__':
    unittest.main()