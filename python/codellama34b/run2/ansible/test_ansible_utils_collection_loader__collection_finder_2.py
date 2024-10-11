import unittest
from ansible.utils.collection_loader._collection_finder import *


class TestAnsibleCollectionRef(unittest.TestCase):
    def test_init(self):
        instance = AnsibleCollectionRef('collection_name', 'subdirs', 'resource', 'ref_type')
        self.assertEqual(instance.collection, 'collection_name')
        self.assertEqual(instance.subdirs, 'subdirs')
        self.assertEqual(instance.resource, 'resource')
        self.assertEqual(instance.ref_type, 'ref_type')

    def test_from_fqcr(self):
        result = AnsibleCollectionRef.from_fqcr('ref', 'ref_type')
        self.assertEqual(result, 'AnsibleCollectionRef(collection=ref, subdirs=ref_type)')

    def test_try_parse_fqcr(self):
        result = AnsibleCollectionRef.try_parse_fqcr('ref', 'ref_type')
        self.assertEqual(result, 'AnsibleCollectionRef(collection=ref, subdirs=ref_type)')

    def test_legacy_plugin_dir_to_plugin_type(self):
        result = AnsibleCollectionRef.legacy_plugin_dir_to_plugin_type('legacy_plugin_dir_name')
        self.assertEqual(result, 'legacy_plugin_dir_name')

    def test_is_valid_fqcr(self):
        result = AnsibleCollectionRef.is_valid_fqcr('ref', 'ref_type')
        self.assertEqual(result, True)

    def test_is_valid_collection_name(self):
        result = AnsibleCollectionRef.is_valid_collection_name('collection_name')
        self.assertEqual(result, True)

    def test_fqcr(self):
        instance = AnsibleCollectionRef('collection_name', 'subdirs', 'resource', 'ref_type')
        self.assertEqual(instance.fqcr, 'collection_name.subdirs.resource')

    def test_n_python_package_name(self):
        instance = AnsibleCollectionRef('collection_name', 'subdirs', 'resource', 'ref_type')
        self.assertEqual(instance.n_python_package_name, 'ansible_collections.collection_name.subdirs.resource')

    def test_n_python_collection_package_name(self):
        instance = AnsibleCollectionRef('collection_name', 'subdirs', 'resource', 'ref_type')
        self.assertEqual(instance.n_python_collection_package_name, 'ansible_collections.collection_name')

    def test_repr(self):
        instance = AnsibleCollectionRef('collection_name', 'subdirs', 'resource', 'ref_type')
        self.assertEqual(instance.__repr__(), 'AnsibleCollectionRef(collection=collection_name, subdirs=subdirs, resource=resource)')


if __name__ == '__main__':
    unittest.main()