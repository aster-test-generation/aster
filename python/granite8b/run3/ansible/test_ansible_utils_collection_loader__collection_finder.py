import unittest
from ansible.utils.collection_loader._collection_finder import AnsibleCollectionRef, _get_collection_playbook_path, _get_collection_role_path, _get_collection_resource_path, _get_collection_name_from_path, _get_import_redirect, _get_ancestor_redirect, _nested_dict_get, _iter_modules_impl, _get_collection_metadata


class TestAnsibleCollectionRef(unittest.TestCase):
    def test_try_parse_fqcr(self):
        acr = AnsibleCollectionRef.try_parse_fqcr('ansible.builtin.debug', 'module')
        self.assertEqual(acr.collection, 'ansible.builtin')
        self.assertEqual(acr.resource, 'debug')
        self.assertEqual(acr.ref_type, 'module')
        self.assertEqual(acr.n_python_collection_package_name, 'ansible_collections.ansible.builtin')
        self.assertEqual(acr.n_python_package_name, 'ansible_collections.ansible.builtin.plugins.module_utils')
        self.assertEqual(acr.subdirs, '')
        acr = AnsibleCollectionRef.try_parse_fqcr('ansible.builtin.debug', 'role')
        self.assertEqual(acr.collection, 'ansible.builtin')
        self.assertEqual(acr.resource, 'debug')
        self.assertEqual(acr.ref_type, 'role')
        self.assertEqual(acr.n_python_collection_package_name, 'ansible_collections.ansible.builtin')
        self.assertEqual(acr.n_python_package_name, 'ansible_collections.ansible.builtin.plugins.module_utils')
        self.assertEqual(acr.subdirs, '')
        acr = AnsibleCollectionRef.try_parse_fqcr('ansible.builtin.debug', 'not_a_real_ref_type')
        self.assertIsNone(acr)


if __name__ == '__main__':
    unittest.main()