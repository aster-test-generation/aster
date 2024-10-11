import unittest
from ansible.utils.collection_loader._collection_finder import AnsibleCollectionRef


class TestAnsibleCollectionRef(unittest.TestCase):
    def test___init__(self):
        instance = AnsibleCollectionRef("namespace.collection", None, "resource", "module")
        self.assertEqual(instance.collection, "namespace.collection")
        self.assertEqual(instance.subdirs, "")
        self.assertEqual(instance.resource, "resource")
        self.assertEqual(instance.ref_type, "module")

    def test___repr__(self):
        instance = AnsibleCollectionRef("namespace.collection", None, "resource", "module")
        result = instance.__repr__()
        self.assertEqual(result, "AnsibleCollectionRef(collection='namespace.collection', subdirs='', resource='resource')")

    def test_fqcr(self):
        instance = AnsibleCollectionRef("namespace.collection", None, "resource", "module")
        result = instance.fqcr
        self.assertEqual(result, "namespace.collection.resource")

    def test_from_fqcr(self):
        ref = "namespace.collection.resource"
        ref_type = "module"
        instance = AnsibleCollectionRef.from_fqcr(ref, ref_type)
        self.assertEqual(instance.collection, "namespace.collection")
        self.assertEqual(instance.subdirs, "")
        self.assertEqual(instance.resource, "resource")
        self.assertEqual(instance.ref_type, "module")

    def test_try_parse_fqcr(self):
        ref = "namespace.collection.resource"
        ref_type = "module"
        instance = AnsibleCollectionRef.try_parse_fqcr(ref, ref_type)
        self.assertEqual(instance.collection, "namespace.collection")
        self.assertEqual(instance.subdirs, "")
        self.assertEqual(instance.resource, "resource")
        self.assertEqual(instance.ref_type, "module")

    def test_legacy_plugin_dir_to_plugin_type(self):
        legacy_plugin_dir_name = "library_plugins"
        result = AnsibleCollectionRef.legacy_plugin_dir_to_plugin_type(legacy_plugin_dir_name)
        self.assertEqual(result, "modules")

    def test_is_valid_fqcr(self):
        ref = "namespace.collection.resource"
        result = AnsibleCollectionRef.is_valid_fqcr(ref)
        self.assertTrue(result)

    def test_is_valid_collection_name(self):
        collection_name = "namespace.collection"
        result = AnsibleCollectionRef.is_valid_collection_name(collection_name)
        self.assertTrue(result)

    def test_private_method__fqcr(self):
        instance = AnsibleCollectionRef("namespace.collection", None, "resource", "module")
        result = instance._AnsibleCollectionRef__fqcr
        self.assertEqual(result, "namespace.collection.resource")

if __name__ == '__main__':
    unittest.main()