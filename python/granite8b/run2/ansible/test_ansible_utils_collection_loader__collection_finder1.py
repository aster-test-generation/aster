import unittest
from ansible.utils.collection_loader._collection_finder import AnsibleCollectionRef, _get_collection_name_from_path, _get_collection_playbook_path, _get_collection_role_path, _get_collection_resource_path, _get_import_redirect, _get_ancestor_redirect, _nested_dict_get, _iter_modules_impl, _get_collection_metadata

class TestAnsibleCollectionRef(unittest.TestCase):
    def test_try_parse_fqcr(self):
        acr = AnsibleCollectionRef.try_parse_fqcr('ansible.builtin.copy', 'module')
        self.assertEqual(acr.collection, 'ansible.builtin')
        self.assertEqual(acr.resource, 'copy')
        self.assertEqual(acr.ref_type, 'module')
        self.assertEqual(acr.n_python_package_name, 'ansible_collections.ansible.builtin')
        self.assertEqual(acr.n_python_collection_package_name, 'ansible_collections.ansible.builtin')
        self.assertEqual(acr.n_python_collection_module_name, 'ansible_collections.ansible.builtin.plugins.module_utils.common.copy')
        self.assertEqual(acr.subdirs, '')

class TestGetCollectionNameFromPath(unittest.TestCase):
    def test_get_collection_name_from_path(self):
        collection_name = _get_collection_name_from_path('/path/to/ansible_collections/ansible/builtin')
        self.assertEqual(collection_name, 'ansible.builtin')

class TestGetCollectionPlaybookPath(unittest.TestCase):
    def test_get_collection_playbook_path(self):
        result = _get_collection_playbook_path('ansible.builtin.copy')
        self.assertEqual(result, ('copy', '/path/to/ansible_collections/ansible/builtin/playbooks/copy.yml', 'ansible.builtin'))

class TestGetCollectionRolePath(unittest.TestCase):
    def test_get_collection_role_path(self):
        result = _get_collection_role_path('ansible.builtin.copy')
        self.assertEqual(result, ('copy', '/path/to/ansible_collections/ansible/builtin/roles/copy', 'ansible.builtin'))

class TestGetCollectionResourcePath(unittest.TestCase):
    def test_get_collection_resource_path(self):
        result = _get_collection_resource_path('ansible.builtin.copy', 'role')
        self.assertEqual(result, ('copy', '/path/to/ansible_collections/ansible/builtin/roles/copy', 'ansible.builtin'))

class TestGetImportRedirect(unittest.TestCase):
    def test_get_import_redirect(self):
        collection_meta_dict = {
            'import_redirection': {
                'ansible.builtin.copy': {
                    'redirect': 'ansible.builtin.copy_module'
                }
            }
        }
        result = _get_import_redirect(collection_meta_dict, 'ansible.builtin.copy')
        self.assertEqual(result, 'ansible.builtin.copy_module')

class TestGetAncestorRedirect(unittest.TestCase):
    def test_get_ancestor_redirect(self):
        redirected_package_map = {
            'ansible.builtin': 'ansible.builtin.redirected'
        }
        result = _get_ancestor_redirect(redirected_package_map, 'ansible.builtin.copy')
        self.assertEqual(result, 'ansible.builtin.redirected.copy')

class TestNestedDictGet(unittest.TestCase):
    def test_nested_dict_get(self):
        root_dict = {
            'a': {
                'b': {
                    'c': 1
                }
            }
        }
        result = _nested_dict_get(root_dict, ['a', 'b', 'c'])
        self.assertEqual(result, 1)

class TestIterModulesImpl(unittest.TestCase):
    def test_iter_modules_impl(self):
        paths = ['/path/to/ansible_collections/ansible/builtin/plugins/module_utils/common']
        result = list(_iter_modules_impl(paths))
        self.assertEqual(result, [('ansible.builtin.plugins.module_utils.common.copy', False), ('ansible.builtin.plugins.module_utils.common.file', False), ('ansible.builtin.plugins.module_utils.common.text', False)])


if __name__ == '__main__':
    unittest.main()