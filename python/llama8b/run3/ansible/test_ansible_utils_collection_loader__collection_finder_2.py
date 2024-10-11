import unittest
from ansible.utils.collection_loader._collection_finder import AnsibleCollectionRef


class TestAnsibleCollectionRef(unittest.TestCase):
    def test_init(self):
        collection_name = 'namespace.collection'
        subdirs = 'subdir1.subdir2'
        resource = 'resource.yml'
        ref_type = 'role'
        instance = AnsibleCollectionRef(collection_name, subdirs, resource, ref_type)
        self.assertEqual(instance.collection, collection_name)
        self.assertEqual(instance.subdirs, subdirs)
        self.assertEqual(instance.resource, resource)
        self.assertEqual(instance.ref_type, ref_type)

    def test_is_valid_collection_name(self):
        self.assertTrue(AnsibleCollectionRef.is_valid_collection_name('namespace.collection'))
        self.assertFalse(AnsibleCollectionRef.is_valid_collection_name('namespace'))
        self.assertFalse(AnsibleCollectionRef.is_valid_collection_name('namespace.collection.'))
        self.assertFalse(AnsibleCollectionRef.is_valid_collection_name('namespace.collection.collection'))

    def test_is_valid_fqcr(self):
        self.assertTrue(AnsibleCollectionRef.is_valid_fqcr('namespace.collection.subdir1.resource.yml'))
        self.assertFalse(AnsibleCollectionRef.is_valid_fqcr('namespace.collection'))
        self.assertFalse(AnsibleCollectionRef.is_valid_fqcr('namespace.collection.subdir1'))
        self.assertFalse(AnsibleCollectionRef.is_valid_fqcr('namespace.collection.subdir1.resource'))

    def test_from_fqcr(self):
        ref = 'namespace.collection.subdir1.resource.yml'
        ref_type = 'role'
        instance = AnsibleCollectionRef.from_fqcr(ref, ref_type)
        self.assertEqual(instance.collection, 'namespace.collection')
        self.assertEqual(instance.subdirs, 'subdir1')
        self.assertEqual(instance.resource, 'resource.yml')
        self.assertEqual(instance.ref_type, ref_type)

    def test_try_parse_fqcr(self):
        ref = 'namespace.collection.subdir1.resource.yml'
        ref_type = 'role'
        instance = AnsibleCollectionRef.try_parse_fqcr(ref, ref_type)
        self.assertEqual(instance.collection, 'namespace.collection')
        self.assertEqual(instance.subdirs, 'subdir1')
        self.assertEqual(instance.resource, 'resource.yml')
        self.assertEqual(instance.ref_type, ref_type)

    def test_legacy_plugin_dir_to_plugin_type(self):
        self.assertEqual(AnsibleCollectionRef.legacy_plugin_dir_to_plugin_type('plugins.library'), 'modules')
        self.assertEqual(AnsibleCollectionRef.legacy_plugin_dir_to_plugin_type('plugins'), 'plugins')
        self.assertRaises(ValueError, AnsibleCollectionRef.legacy_plugin_dir_to_plugin_type, 'plugins.invalid')

    def test_repr(self):
        instance = AnsibleCollectionRef('namespace.collection', 'subdir1', 'resource.yml', 'role')
        self.assertEqual(instance.__repr__(), 'AnsibleCollectionRef(collection=namespace.collection, subdirs=subdir1, resource=resource.yml)')

    def test_str(self):
        instance = AnsibleCollectionRef('namespace.collection', 'subdir1', 'resource.yml', 'role')
        self.assertEqual(instance.__str__(), 'AnsibleCollectionRef(collection=namespace.collection, subdirs=subdir1, resource=resource.yml)')

if __name__ == '__main__':
    unittest.main()