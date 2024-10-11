import unittest
from ansible.utils.collection_loader._collection_finder import AnsibleCollectionRef



class TestAnsibleCollectionRef(unittest.TestCase):
    def test_try_parse_fqcr(self):
        result = AnsibleCollectionRef.try_parse_fqcr('playbook', u'playbook')
        self.assertEqual(result, None)

    def test_n_python_collection_package_name(self):
        acr = AnsibleCollectionRef(collection_name='collection_name', subdirs='subdirs', resource='resource', ref_type='ref_type')
        result = acr.n_python_collection_package_name
        self.assertEqual(result, 'ansible_collections.collection_name.subdirs.resource')

    def test_n_python_package_name(self):
        acr = AnsibleCollectionRef(collection_name='collection_name', subdirs='subdirs', resource='resource', ref_type='ref_type')
        result = acr.n_python_package_name
        self.assertEqual(result, 'ansible_collections.collection_name.subdirs.resource')

    def test_fqcr(self):
        acr = AnsibleCollectionRef(collection_name='collection_name', subdirs='subdirs', resource='resource', ref_type='ref_type')
        result = acr.fqcr
        self.assertEqual(result, 'namespace.collection.subdirs.resource')

    def test_fqcr_no_subdirs(self):
        acr = AnsibleCollectionRef(collection_name='collection_name', subdirs='', resource='resource', ref_type='ref_type')
        result = acr.fqcr
        self.assertEqual(result, 'namespace.collection.resource')

    def test_fqcr_no_resource(self):
        acr = AnsibleCollectionRef(collection_name='collection_name', subdirs='subdirs', resource='', ref_type='ref_type')
        result = acr.fqcr
        self.assertEqual(result, 'namespace.collection.subdirs')

    def test_fqcr_no_subdirs_no_resource(self):
        acr = AnsibleCollectionRef(collection_name='collection_name', subdirs='', resource='', ref_type='ref_type')
        result = acr.fqcr
        self.assertEqual(result, 'namespace.collection')

    def test_fqcr_no_collection(self):
        acr = AnsibleCollectionRef(collection_name='', subdirs='subdirs', resource='resource', ref_type='ref_type')
        result = acr.fqcr
        self.assertEqual(result, 'subdirs.resource')

    def test_fqcr_no_collection_no_subdirs(self):
        acr = AnsibleCollectionRef(collection_name='', subdirs='', resource='resource', ref_type='ref_type')
        result = acr.fqcr
        self.assertEqual(result, 'resource')

    def test_fqcr_no_collection_no_subdirs_no_resource(self):
        acr = AnsibleCollectionRef(collection_name='', subdirs='', resource='', ref_type='ref_type')
        result = acr.fqcr
        self.assertEqual(result, '')

    def test_fqcr_no_collection_no_resource(self):
        acr = AnsibleCollectionRef(collection_name='', subdirs='subdirs', resource='', ref_type='ref_type')
        result = acr.fqcr
        self.assertEqual(result, 'subdirs')

    def test_fqcr_no_collection_no_subdirs_no_resource_no_ref_type(self):
        acr = AnsibleCollectionRef(collection_name='', subdirs='', resource='', ref_type='')
        result = acr.fqcr
        self.assertEqual(result, '')

if __name__ == '__main__':
    unittest.main()