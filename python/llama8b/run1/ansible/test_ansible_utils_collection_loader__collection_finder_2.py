import unittest
from ansible.utils.collection_loader._collection_finder import AnsibleCollectionRef


class TestAnsibleCollectionRef(unittest.TestCase):
    def test_init(self):
        collection_name = 'namespace.collection'
        subdirs = 'subdir1.subdir2'
        resource = 'resource.yml'
        ref_type = 'role'
        instance = AnsibleCollectionRef(collection_name, subdirs, resource, ref_type)
        self.assertEqual(instance.collection, 'namespace.collection')
        self.assertEqual(instance.subdirs, 'subdir1.subdir2')
        self.assertEqual(instance.resource, 'resource.yml')
        self.assertEqual(instance.ref_type, 'role')

    def test_is_valid_collection_name(self):
        self.assertTrue(AnsibleCollectionRef.is_valid_collection_name('namespace.collection'))
        self.assertFalse(AnsibleCollectionRef.is_valid_collection_name('namespace'))
        self.assertFalse(AnsibleCollectionRef.is_valid_collection_name('namespace.collection1.collection2'))

    def test_is_valid_fqcr(self):
        self.assertTrue(AnsibleCollectionRef.is_valid_fqcr('namespace.collection.subdir1.resource.yml'))
        self.assertFalse(AnsibleCollectionRef.is_valid_fqcr('namespace.collection'))
        self.assertFalse(AnsibleCollectionRef.is_valid_fqcr('namespace.collection.subdir1'))

    def test_from_fqcr(self):
        ref = 'namespace.collection.subdir1.resource.yml'
        ref_type = 'role'
        instance = AnsibleCollectionRef.from_fqcr(ref, ref_type)
        self.assertEqual(instance.collection, 'namespace.collection')
        self.assertEqual(instance.subdirs, 'subdir1')
        self.assertEqual(instance.resource, 'resource.yml')
        self.assertEqual(instance.ref_type, 'role')

    def test_try_parse_fqcr(self):
        ref = 'namespace.collection.subdir1.resource.yml'
        ref_type = 'role'
        instance = AnsibleCollectionRef.try_parse_fqcr(ref, ref_type)
        self.assertEqual(instance.collection, 'namespace.collection')
        self.assertEqual(instance.subdirs, 'subdir1')
        self.assertEqual(instance.resource, 'resource.yml')
        self.assertEqual(instance.ref_type, 'role')

    def test_legacy_plugin_dir_to_plugin_type(self):
        self.assertEqual(AnsibleCollectionRef.legacy_plugin_dir_to_plugin_type('plugins.library'), 'modules')
        self.assertEqual(AnsibleCollectionRef.legacy_plugin_dir_to_plugin_type('plugins'), 'plugins')

    def test_repr(self):
        collection_name = 'namespace.collection'
        subdirs = 'subdir1.subdir2'
        resource = 'resource.yml'
        ref_type = 'role'
        instance = AnsibleCollectionRef(collection_name, subdirs, resource, ref_type)
        self.assertEqual(instance.__repr__(), 'AnsibleCollectionRef(collection={0!r}, subdirs={1!r}, resource={2!r})'.format(instance.collection, instance.subdirs, instance.resource))

    def test_fqcr(self):
        collection_name = 'namespace.collection'
        subdirs = 'subdir1.subdir2'
        resource = 'resource.yml'
        ref_type = 'role'
        instance = AnsibleCollectionRef(collection_name, subdirs, resource, ref_type)
        self.assertEqual(instance.fqcr, 'namespace.collection.subdir1.resource.yml')

if __name__ == '__main__':
    unittest.main()