import unittest
from ansible.utils.collection_loader._collection_finder import AnsibleCollectionRef


class TestAnsibleCollectionRef(unittest.TestCase):
    def test_init_valid(self):
        instance = AnsibleCollectionRef('namespace.collection', 'subdir1.subdir2', 'resource', 'plugin')
        self.assertEqual(instance.collection, 'namespace.collection')

    def test_init_invalid_collection_name(self):
        with self.assertRaises(ValueError):
            AnsibleCollectionRef('invalid_collection', 'subdir1.subdir2', 'resource', 'plugin')

    def test_init_invalid_ref_type(self):
        with self.assertRaises(ValueError):
            AnsibleCollectionRef('namespace.collection', 'subdir1.subdir2', 'resource', 'invalid_type')

    def test_init_invalid_subdirs(self):
        with self.assertRaises(ValueError):
            AnsibleCollectionRef('namespace.collection', 'invalid/subdir', 'resource', 'plugin')

    def test_repr(self):
        instance = AnsibleCollectionRef('namespace.collection', 'subdir1.subdir2', 'resource', 'plugin')
        self.assertEqual(repr(instance), "AnsibleCollectionRef(collection='namespace.collection', subdirs='subdir1.subdir2', resource='resource')")

    def test_fqcr_property(self):
        instance = AnsibleCollectionRef('namespace.collection', 'subdir1.subdir2', 'resource', 'plugin')
        self.assertEqual(instance.fqcr, 'namespace.collection.subdir1.subdir2.resource')

    def test_from_fqcr_valid(self):
        instance = AnsibleCollectionRef.from_fqcr('namespace.collection.subdir1.subdir2.resource', 'plugin')
        self.assertEqual(instance.collection, 'namespace.collection')

    def test_from_fqcr_invalid(self):
        with self.assertRaises(ValueError):
            AnsibleCollectionRef.from_fqcr('invalid_collection.subdir1.subdir2.resource', 'plugin')

    def test_try_parse_fqcr_valid(self):
        instance = AnsibleCollectionRef.try_parse_fqcr('namespace.collection.subdir1.subdir2.resource', 'plugin')
        self.assertIsNotNone(instance)

    def test_try_parse_fqcr_invalid(self):
        instance = AnsibleCollectionRef.try_parse_fqcr('invalid_collection.subdir1.subdir2.resource', 'plugin')
        self.assertIsNone(instance)

    def test_legacy_plugin_dir_to_plugin_type_valid(self):
        result = AnsibleCollectionRef.legacy_plugin_dir_to_plugin_type('action_plugins')
        self.assertEqual(result, 'action')

    def test_legacy_plugin_dir_to_plugin_type_invalid(self):
        with self.assertRaises(ValueError):
            AnsibleCollectionRef.legacy_plugin_dir_to_plugin_type('invalid_plugins')

    def test_is_valid_fqcr_valid(self):
        result = AnsibleCollectionRef.is_valid_fqcr('namespace.collection.subdir1.subdir2.resource', 'plugin')
        self.assertTrue(result)

    def test_is_valid_fqcr_invalid(self):
        result = AnsibleCollectionRef.is_valid_fqcr('invalid_collection.subdir1.subdir2.resource', 'plugin')
        self.assertFalse(result)

    def test_is_valid_collection_name_valid(self):
        result = AnsibleCollectionRef.is_valid_collection_name('namespace.collection')
        self.assertTrue(result)

    def test_is_valid_collection_name_invalid(self):
        result = AnsibleCollectionRef.is_valid_collection_name('invalid_collection')
        self.assertFalse(result)

if __name__ == '__main__':
    unittest.main()