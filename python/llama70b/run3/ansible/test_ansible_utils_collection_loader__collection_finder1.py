import unittest
from ansible.utils.collection_loader._collection_finder import AnsibleCollectionRef

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

if __name__ == '__main__':
    unittest.main()