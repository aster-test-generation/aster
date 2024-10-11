import unittest
from ansible.utils.collection_loader._collection_finder import AnsibleCollectionRef

class TestAnsibleCollectionRef(unittest.TestCase):
    def test_init(self):
        ref = AnsibleCollectionRef('ansible.example', 'subdirs', 'resource', 'role')
        self.assertEqual(ref.collection, 'ansible.example')
        self.assertEqual(ref.subdirs, 'subdirs')
        self.assertEqual(ref.resource, 'resource')
        self.assertEqual(ref.ref_type, 'role')
        self.assertEqual(ref.n_python_collection_package_name, 'ansible_collections.ansible.example')
        self.assertEqual(ref.n_python_package_name, 'ansible_collections.ansible.example.roles.subdirs.resource')
        self.assertEqual(ref.fqcr, 'ansible.example:subdirs.resource')

    def test_from_fqcr(self):
        ref = AnsibleCollectionRef.from_fqcr('ansible.example:subdirs.resource', 'role')
        self.assertEqual(ref.collection, 'ansible.example')
        self.assertEqual(ref.subdirs, 'subdirs')
        self.assertEqual(ref.resource, 'resource')
        self.assertEqual(ref.ref_type, 'role')
        self.assertEqual(ref.n_python_collection_package_name, 'ansible_collections.ansible.example')
        self.assertEqual(ref.n_python_package_name, 'ansible_collections.ansible.example.roles.subdirs.resource')
        self.assertEqual(ref.fqcr, 'ansible.example:subdirs.resource')

    def test_try_parse_fqcr(self):
        ref = AnsibleCollectionRef.try_parse_fqcr('ansible.example:subdirs.resource', 'role')
        self.assertEqual(ref.collection, 'ansible.example')
        self.assertEqual(ref.subdirs, 'subdirs')
        self.assertEqual(ref.resource, 'resource')
        self.assertEqual(ref.ref_type, 'role')
        self.assertEqual(ref.n_python_collection_package_name, 'ansible_collections.ansible.example')
        self.assertEqual(ref.n_python_package_name, 'ansible_collections.ansible.example.roles.subdirs.resource')
        self.assertEqual(ref.fqcr, 'ansible.example:subdirs.resource')

    def test_legacy_plugin_dir_to_plugin_type(self):
        plugin_type = AnsibleCollectionRef.legacy_plugin_dir_to_plugin_type('action_plugins')
        self.assertEqual(plugin_type, 'actions')

    def test_is_valid_fqcr(self):
        self.assertTrue(AnsibleCollectionRef.is_valid_fqcr('ansible.example:subdirs.resource', 'role'))
        self.assertFalse(AnsibleCollectionRef.is_valid_fqcr('ansible.example:subdirs.resource', 'foo'))

    def test_is_valid_collection_name(self):
        self.assertTrue(AnsibleCollectionRef.is_valid_collection_name('ansible.example'))
        self.assertFalse(AnsibleCollectionRef.is_valid_collection_name('ansible_example'))

if __name__ == '__main__':
    unittest.main()