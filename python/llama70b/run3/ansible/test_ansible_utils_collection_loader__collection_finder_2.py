import unittest
from ansible.utils.collection_loader._collection_finder import AnsibleCollectionRef


class TestAnsibleCollectionRef(unittest.TestCase):
    def test___init__(self):
        instance = AnsibleCollectionRef('namespace.collection', None, 'resource', 'module')
        self.assertEqual(instance.collection, 'namespace.collection')
        self.assertEqual(instance.subdirs, '')
        self.assertEqual(instance.resource, 'resource')
        self.assertEqual(instance.ref_type, 'module')

    def test___repr__(self):
        instance = AnsibleCollectionRef('namespace.collection', None, 'resource', 'module')
        result = instance.__repr__()
        self.assertEqual(result, "AnsibleCollectionRef(collection='namespace.collection', subdirs='', resource='resource')")

    def test_fqcr(self):
        instance = AnsibleCollectionRef('namespace.collection', None, 'resource', 'module')
        result = instance.fqcr
        self.assertEqual(result, 'namespace.collection.resource')

    def test_from_fqcr(self):
        ref = 'namespace.collection.resource'
        ref_type = 'module'
        instance = AnsibleCollectionRef.from_fqcr(ref, ref_type)
        self.assertEqual(instance.collection, 'namespace.collection')
        self.assertEqual(instance.subdirs, '')
        self.assertEqual(instance.resource, 'resource')
        self.assertEqual(instance.ref_type, 'module')

    def test_try_parse_fqcr(self):
        ref = 'namespace.collection.resource'
        ref_type = 'module'
        instance = AnsibleCollectionRef.try_parse_fqcr(ref, ref_type)
        self.assertEqual(instance.collection, 'namespace.collection')
        self.assertEqual(instance.subdirs, '')
        self.assertEqual(instance.resource, 'resource')
        self.assertEqual(instance.ref_type, 'module')

    def test_legacy_plugin_dir_to_plugin_type(self):
        legacy_plugin_dir_name = 'library_plugins'
        result = AnsibleCollectionRef.legacy_plugin_dir_to_plugin_type(legacy_plugin_dir_name)
        self.assertEqual(result, 'modules')

    def test_is_valid_fqcr(self):
        ref = 'namespace.collection.resource'
        result = AnsibleCollectionRef.is_valid_fqcr(ref)
        self.assertTrue(result)

    def test_is_valid_collection_name(self):
        collection_name = 'namespace.collection'
        result = AnsibleCollectionRef.is_valid_collection_name(collection_name)
        self.assertTrue(result)

    def test__AnsibleCollectionRef__private_method(self):
        # This is a private method, so we need to access it using the class name
        result = AnsibleCollectionRef._AnsibleCollectionRef__private_method('namespace.collection')
        self.assertEqual(result, 'namespace.collection')

class TestAnsibleCollectionRef(unittest.TestCase):
    def test___init__(self):
        instance = AnsibleCollectionRef("namespace.collection", None, "resource", "module")
        self.assertEqual(instance.collection, "namespace.collection")
        self.assertEqual(instance.subdirs, "")
        self.assertEqual(instance.resource, "resource")
        self.assertEqual(instance.ref_type, "module")

    def test_is_valid_collection_name(self):
        instance = AnsibleCollectionRef("namespace.collection", None, "resource", "module")
        self.assertTrue(instance.is_valid_collection_name("namespace.collection"))
        self.assertFalse(instance.is_valid_collection_name("invalid.collection"))

    def test___repr__(self):
        instance = AnsibleCollectionRef("namespace.collection", None, "resource", "module")
        self.assertEqual(instance.__repr__(), "AnsibleCollectionRef(collection='namespace.collection', subdirs='', resource='resource')")

    def test_fqcr(self):
        instance = AnsibleCollectionRef("namespace.collection", None, "resource", "module")
        self.assertEqual(instance.fqcr, "namespace.collection.resource")

    def test_from_fqcr(self):
        instance = AnsibleCollectionRef.from_fqcr("namespace.collection.resource", "module")
        self.assertEqual(instance.collection, "namespace.collection")
        self.assertEqual(instance.subdirs, "")
        self.assertEqual(instance.resource, "resource")
        self.assertEqual(instance.ref_type, "module")

    def test_try_parse_fqcr(self):
        instance = AnsibleCollectionRef.try_parse_fqcr("namespace.collection.resource", "module")
        self.assertIsNotNone(instance)
        self.assertIsNone(AnsibleCollectionRef.try_parse_fqcr("invalid.collection.resource", "module"))

    def test_legacy_plugin_dir_to_plugin_type(self):
        self.assertEqual(AnsibleCollectionRef.legacy_plugin_dir_to_plugin_type("library_plugins"), "modules")
        self.assertEqual(AnsibleCollectionRef.legacy_plugin_dir_to_plugin_type("network_plugins"), "network")

    def test_is_valid_fqcr(self):
        self.assertTrue(AnsibleCollectionRef.is_valid_fqcr("namespace.collection.resource"))
        self.assertFalse(AnsibleCollectionRef.is_valid_fqcr("invalid.collection.resource"))

    def test_is_valid_fqcr_with_ref_type(self):
        self.assertTrue(AnsibleCollectionRef.is_valid_fqcr("namespace.collection.resource", "module"))
        self.assertFalse(AnsibleCollectionRef.is_valid_fqcr("namespace.collection.resource", "invalid"))

    def test___str__(self):
        instance = AnsibleCollectionRef("namespace.collection", None, "resource", "module")
        self.assertEqual(instance.__str__(), "AnsibleCollectionRef(collection='namespace.collection', subdirs='', resource='resource')")

    def test___eq__(self):
        instance1 = AnsibleCollectionRef("namespace.collection", None, "resource", "module")
        instance2 = AnsibleCollectionRef("namespace.collection", None, "resource", "module")
        self.assertTrue(instance1 == instance2)
        instance3 = AnsibleCollectionRef("namespace.collection", None, "resource", "role")
        self.assertFalse(instance1 == instance3)

class TestAnsibleCollectionRef(unittest.TestCase):
    def test_init(self):
        instance = AnsibleCollectionRef("namespace.collection", None, "resource", "module")
        self.assertEqual(instance.collection, "namespace.collection")
        self.assertEqual(instance.subdirs, "")
        self.assertEqual(instance.resource, "resource")
        self.assertEqual(instance.ref_type, "module")

    def test_init_invalid_collection_name(self):
        with self.assertRaises(ValueError):
            AnsibleCollectionRef("invalid_collection", None, "resource", "module")

    def test_init_invalid_ref_type(self):
        with self.assertRaises(ValueError):
            AnsibleCollectionRef("namespace.collection", None, "resource", "invalid_ref_type")

    def test_repr(self):
        instance = AnsibleCollectionRef("namespace.collection", None, "resource", "module")
        self.assertEqual(instance.__repr__(), "AnsibleCollectionRef(collection='namespace.collection', subdirs='', resource='resource')")

    def test_fqcr(self):
        instance = AnsibleCollectionRef("namespace.collection", None, "resource", "module")
        self.assertEqual(instance.fqcr, "namespace.collection.resource")

    def test_from_fqcr(self):
        instance = AnsibleCollectionRef.from_fqcr("namespace.collection.resource", "module")
        self.assertEqual(instance.collection, "namespace.collection")
        self.assertEqual(instance.subdirs, "")
        self.assertEqual(instance.resource, "resource")
        self.assertEqual(instance.ref_type, "module")

    def test_from_fqcr_invalid_fqcr(self):
        with self.assertRaises(ValueError):
            AnsibleCollectionRef.from_fqcr("invalid_fqcr", "module")

    def test_try_parse_fqcr(self):
        instance = AnsibleCollectionRef.try_parse_fqcr("namespace.collection.resource", "module")
        self.assertEqual(instance.collection, "namespace.collection")
        self.assertEqual(instance.subdirs, "")
        self.assertEqual(instance.resource, "resource")
        self.assertEqual(instance.ref_type, "module")

    def test_legacy_plugin_dir_to_plugin_type(self):
        self.assertEqual(AnsibleCollectionRef.legacy_plugin_dir_to_plugin_type("library_plugins"), "modules")

    def test_is_valid_fqcr(self):
        self.assertTrue(AnsibleCollectionRef.is_valid_fqcr("namespace.collection.resource"))
        self.assertFalse(AnsibleCollectionRef.is_valid_fqcr("invalid_fqcr"))

    def test_is_valid_collection_name(self):
        self.assertTrue(AnsibleCollectionRef.is_valid_collection_name("namespace.collection"))
        self.assertFalse(AnsibleCollectionRef.is_valid_collection_name("invalid_collection"))

    def test_private_method__init__(self):
        instance = AnsibleCollectionRef("namespace.collection", None, "resource", "module")
        self.assertEqual(instance._AnsibleCollectionRef__init__("namespace.collection", None, "resource", "module"), None)

    def test_private_method_n_python_collection_package_name(self):
        instance = AnsibleCollectionRef("namespace.collection", None, "resource", "module")
        self.assertEqual(instance._AnsibleCollectionRef__n_python_collection_package_name, "ansible_collections.namespace.collection")

    def test_private_method_n_python_package_name(self):
        instance = AnsibleCollectionRef("namespace.collection", None, "resource", "module")
        self.assertEqual(instance._AnsibleCollectionRef__n_python_package_name, "ansible_collections.namespace.collection.plugins.module")

if __name__ == '__main__':
    unittest.main()