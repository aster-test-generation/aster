import unittest
from ansible.utils.collection_loader._collection_finder import AnsibleCollectionRef


class TestAnsibleCollectionRef(unittest.TestCase):
    def test_init(self):
        ref = AnsibleCollectionRef('ansible.example', 'subdirs', 'resource', 'role')
        self.assertEqual(ref.collection, 'ansible.example')
        self.assertEqual(ref.subdirs, 'subdirs')
        self.assertEqual(ref.resource, 'resource')
        self.assertEqual(ref.ref_type, 'role')

    def test_from_fqcr(self):
        ref = AnsibleCollectionRef.from_fqcr('ansible.example.roles.resource', 'role')
        self.assertEqual(ref.collection, 'ansible.example')
        self.assertEqual(ref.subdirs, 'roles')
        self.assertEqual(ref.resource, 'resource')
        self.assertEqual(ref.ref_type, 'role')

    def test_try_parse_fqcr(self):
        ref = AnsibleCollectionRef.try_parse_fqcr('ansible.example.roles.resource', 'role')
        self.assertEqual(ref.collection, 'ansible.example')
        self.assertEqual(ref.subdirs, 'roles')
        self.assertEqual(ref.resource, 'resource')
        self.assertEqual(ref.ref_type, 'role')

    def test_legacy_plugin_dir_to_plugin_type(self):
        plugin_type = AnsibleCollectionRef.legacy_plugin_dir_to_plugin_type('action_plugins')
        self.assertEqual(plugin_type, 'actions')

    def test_is_valid_fqcr(self):
        self.assertTrue(AnsibleCollectionRef.is_valid_fqcr('ansible.example.roles.resource', 'role'))
        self.assertFalse(AnsibleCollectionRef.is_valid_fqcr('ansible.example.roles.resource', 'not_a_valid_ref_type'))

    def test_is_valid_collection_name(self):
        self.assertTrue(AnsibleCollectionRef.is_valid_collection_name('ansible.example'))
        self.assertFalse(AnsibleCollectionRef.is_valid_collection_name('ansible_example'))
        self.assertFalse(AnsibleCollectionRef.is_valid_collection_name('ansible.example.roles.resource'))

if __name__ == '__main__':
    unittest.main()