import unittest
from ansible.utils.collection_loader._collection_finder import AnsibleCollectionRef


class TestAnsibleCollectionRef(unittest.TestCase):
    def test_init(self):
        instance = AnsibleCollectionRef('namespace.collection', 'subdirs', 'resource', 'role')
        self.assertEqual(instance.collection, 'namespace.collection')
        self.assertEqual(instance.subdirs, 'subdirs')
        self.assertEqual(instance.resource, 'resource')
        self.assertEqual(instance.ref_type, 'role')

    def test_is_valid_collection_name(self):
        self.assertTrue(AnsibleCollectionRef.is_valid_collection_name('namespace.collection'))
        self.assertFalse(AnsibleCollectionRef.is_valid_collection_name('namespace'))
        self.assertFalse(AnsibleCollectionRef.is_valid_collection_name('namespace.collection.subdir'))

    def test_is_valid_fqcr(self):
        self.assertTrue(AnsibleCollectionRef.is_valid_fqcr('namespace.collection.subdirs.resource'))
        self.assertFalse(AnsibleCollectionRef.is_valid_fqcr('namespace.collection'))
        self.assertFalse(AnsibleCollectionRef.is_valid_fqcr('namespace.collection.subdirs'))

    def test_from_fqcr(self):
        instance = AnsibleCollectionRef.from_fqcr('namespace.collection.subdirs.resource', 'role')
        self.assertEqual(instance.collection, 'namespace.collection')
        self.assertEqual(instance.subdirs, 'subdirs')
        self.assertEqual(instance.resource, 'resource')
        self.assertEqual(instance.ref_type, 'role')

    def test_try_parse_fqcr(self):
        self.assertEqual(AnsibleCollectionRef.try_parse_fqcr('namespace.collection.subdirs.resource', 'role'), AnsibleCollectionRef.from_fqcr('namespace.collection.subdirs.resource', 'role'))
        self.assertIsNone(AnsibleCollectionRef.try_parse_fqcr('namespace.collection', 'role'))

    def test_legacy_plugin_dir_to_plugin_type(self):
        self.assertEqual(AnsibleCollectionRef.legacy_plugin_dir_to_plugin_type('namespace.collection.roles.subdir'), 'role')
        self.assertEqual(AnsibleCollectionRef.legacy_plugin_dir_to_plugin_type('namespace.collection.playbooks.subdir'), 'playbook')
        self.assertEqual(AnsibleCollectionRef.legacy_plugin_dir_to_plugin_type('namespace.collection.plugins.subdir'), 'plugins')
        self.assertRaises(ValueError, AnsibleCollectionRef.legacy_plugin_dir_to_plugin_type, 'namespace.collection.subdir')

    def test_fqcr(self):
        instance = AnsibleCollectionRef('namespace.collection', 'subdirs', 'resource', 'role')
        self.assertEqual(instance.fqcr, 'namespace.collection.subdirs.resource')

    def test_repr(self):
        instance = AnsibleCollectionRef('namespace.collection', 'subdirs', 'resource', 'role')
        self.assertEqual(instance.__repr__(), 'AnsibleCollectionRef(collection=namespace.collection, subdirs=subdirs, resource=resource)')

    def test_str(self):
        instance = AnsibleCollectionRef('namespace.collection', 'subdirs', 'resource', 'role')
        self.assertEqual(instance.__str__(), 'AnsibleCollectionRef(collection=namespace.collection, subdirs=subdirs, resource=resource)')

if __name__ == '__main__':
    unittest.main()