import unittest
from ansible.utils.collection_loader._collection_finder import AnsibleCollectionRef


class TestAnsibleCollectionRef(unittest.TestCase):
    def test_init(self):
        instance = AnsibleCollectionRef('namespace.collection', None, 'resource', 'module')
        self.assertEqual(instance.collection, 'namespace.collection')
        self.assertEqual(instance.subdirs, '')
        self.assertEqual(instance.resource, 'resource')
        self.assertEqual(instance.ref_type, 'module')

    def test_repr(self):
        instance = AnsibleCollectionRef('namespace.collection', None, 'resource', 'module')
        result = instance.__repr__()
        self.assertEqual(result, "AnsibleCollectionRef(collection='namespace.collection', subdirs='', resource='resource')")

    def test_fqcr(self):
        instance = AnsibleCollectionRef('namespace.collection', None, 'resource', 'module')
        result = instance.fqcr
        self.assertEqual(result, 'namespace.collection.resource')

    def test_from_fqcr(self):
        result = AnsibleCollectionRef.from_fqcr('namespace.collection.resource', 'module')
        self.assertEqual(result.collection, 'namespace.collection')
        self.assertEqual(result.subdirs, '')
        self.assertEqual(result.resource, 'resource')
        self.assertEqual(result.ref_type, 'module')

    def test_try_parse_fqcr(self):
        result = AnsibleCollectionRef.try_parse_fqcr('namespace.collection.resource', 'module')
        self.assertEqual(result.collection, 'namespace.collection')
        self.assertEqual(result.subdirs, '')
        self.assertEqual(result.resource, 'resource')
        self.assertEqual(result.ref_type, 'module')

    def test_legacy_plugin_dir_to_plugin_type(self):
        result = AnsibleCollectionRef.legacy_plugin_dir_to_plugin_type('library_plugins')
        self.assertEqual(result, 'modules')

    def test_is_valid_fqcr(self):
        self.assertTrue(AnsibleCollectionRef.is_valid_fqcr('namespace.collection.resource'))
        self.assertFalse(AnsibleCollectionRef.is_valid_fqcr('invalid.fqcr'))

    def test_is_valid_collection_name(self):
        self.assertTrue(AnsibleCollectionRef.is_valid_collection_name('namespace.collection'))
        self.assertFalse(AnsibleCollectionRef.is_valid_collection_name('invalid.collection.name'))

    def test_private_method__init__(self):
        instance = AnsibleCollectionRef('namespace.collection', None, 'resource', 'module')
        result = instance._AnsibleCollectionRef__init__('namespace.collection', None, 'resource', 'module')
        self.assertEqual(result, None)

    def test_protected_method_fqcr(self):
        instance = AnsibleCollectionRef('namespace.collection', None, 'resource', 'module')
        result = instance._fqcr
        self.assertEqual(result, 'namespace.collection.resource')

if __name__ == '__main__':
    unittest.main()