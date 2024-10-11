import unittest
from ansible.utils.collection_loader._collection_finder import AnsibleCollectionRef


class TestAnsibleCollectionRef(unittest.TestCase):

    def test_init(self):
        collection_name = "namespace.collection"
        subdirs = "subdir1.subdir2"
        resource = "resource"
        ref_type = "type"
        ref = AnsibleCollectionRef(collection_name, subdirs, resource, ref_type)
        self.assertEqual(ref.collection, collection_name)
        self.assertEqual(ref.subdirs, subdirs)
        self.assertEqual(ref.resource, resource)
        self.assertEqual(ref.ref_type, ref_type)

    def test_repr(self):
        collection_name = "namespace.collection"
        subdirs = "subdir1.subdir2"
        resource = "resource"
        ref_type = "type"
        ref = AnsibleCollectionRef(collection_name, subdirs, resource, ref_type)
        self.assertEqual(repr(ref), "AnsibleCollectionRef(collection='namespace.collection', subdirs='subdir1.subdir2', resource='resource', ref_type='type')")

    def test_from_fqcr(self):
        ref = "namespace.collection.subdir1.subdir2.resource"
        ref_type = "type"
        collection_ref = AnsibleCollectionRef.from_fqcr(ref, ref_type)
        self.assertEqual(collection_ref.collection, "namespace.collection")
        self.assertEqual(collection_ref.subdirs, "subdir1.subdir2")
        self.assertEqual(collection_ref.resource, "resource")
        self.assertEqual(collection_ref.ref_type, "type")

    def test_legacy_plugin_dir_to_plugin_type(self):
        legacy_plugin_dir_name = "legacy_plugin_dir"
        plugin_type = AnsibleCollectionRef.legacy_plugin_dir_to_plugin_type(legacy_plugin_dir_name)
        self.assertEqual(plugin_type, "legacy_plugin_dir")

    def test_is_valid_fqcr(self):
        ref = "namespace.collection.subdir1.subdir2.resource"
        ref_type = "type"
        is_valid = AnsibleCollectionRef.is_valid_fqcr(ref, ref_type)
        self.assertTrue(is_valid)

    def test_is_valid_collection_name(self):
        collection_name = "namespace.collection"
        is_valid = AnsibleCollectionRef.is_valid_collection_name(collection_name)
        self.assertTrue(is_valid)

class TestAnsibleCollectionRef(unittest.TestCase):
    def test_init(self):
        collection_name = "namespace.collection"
        subdirs = "subdir1.subdir2"
        resource = "resource"
        ref_type = "type"
        ref = AnsibleCollectionRef(collection_name, subdirs, resource, ref_type)
        self.assertEqual(ref.collection, collection_name)
        self.assertEqual(ref.subdirs, subdirs)
        self.assertEqual(ref.resource, resource)
        self.assertEqual(ref.ref_type, ref_type)

    def test_repr(self):
        collection_name = "namespace.collection"
        subdirs = "subdir1.subdir2"
        resource = "resource"
        ref_type = "type"
        ref = AnsibleCollectionRef(collection_name, subdirs, resource, ref_type)
        self.assertEqual(repr(ref), "AnsibleCollectionRef(collection='namespace.collection', subdirs='subdir1.subdir2', resource='resource', ref_type='type')")

    def test_from_fqcr(self):
        ref = "namespace.collection.subdir1.subdir2.resource"
        ref_type = "type"
        collection_name = "namespace.collection"
        subdirs = "subdir1.subdir2"
        resource = "resource"
        result = AnsibleCollectionRef.from_fqcr(ref, ref_type)
        self.assertEqual(result.collection, collection_name)
        self.assertEqual(result.subdirs, subdirs)
        self.assertEqual(result.resource, resource)
        self.assertEqual(result.ref_type, ref_type)

    def test_try_parse_fqcr(self):
        ref = "namespace.collection.subdir1.subdir2.resource"
        ref_type = "type"
        collection_name = "namespace.collection"
        subdirs = "subdir1.subdir2"
        resource = "resource"
        result = AnsibleCollectionRef.try_parse_fqcr(ref, ref_type)
        self.assertEqual(result.collection, collection_name)
        self.assertEqual(result.subdirs, subdirs)
        self.assertEqual(result.resource, resource)
        self.assertEqual(result.ref_type, ref_type)

    def test_legacy_plugin_dir_to_plugin_type(self):
        legacy_plugin_dir_name = "library_plugins"
        plugin_type = "modules"
        result = AnsibleCollectionRef.legacy_plugin_dir_to_plugin_type(legacy_plugin_dir_name)
        self.assertEqual(result, plugin_type)

    def test_is_valid_fqcr(self):
        ref = "namespace.collection.subdir1.subdir2.resource"
        ref_type = "type"
        result = AnsibleCollectionRef.is_valid_fqcr(ref, ref_type)
        self.assertTrue(result)

    def test_is_valid_collection_name(self):
        collection_name = "namespace.collection"
        result = AnsibleCollectionRef.is_valid_collection_name(collection_name)
        self.assertTrue(result)

if __name__ == '__main__':
    unittest.main()