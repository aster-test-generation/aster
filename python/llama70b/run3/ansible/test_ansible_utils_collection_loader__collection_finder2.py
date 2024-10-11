import unittest
from ansible.utils.collection_loader._collection_finder import AnsibleCollectionRef

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