import unittest
from ansible.utils.collection_loader._collection_finder import AnsibleCollectionRef


class Test_AnsibleCollectionPkgLoaderBase(unittest.TestCase):
    def test__validate_args(self):
        instance = _AnsibleCollectionPkgLoaderBase('ansible_collections.namespace.collection.plugins.module.mod')
        instance._validate_args()
    def test__get_candidate_paths(self):
        instance = _AnsibleCollectionPkgLoaderBase('ansible_collections.namespace.collection.plugins.module.mod')
        result = instance._get_candidate_paths(['/tmp/ansible_collections/namespace/collection'])
        self.assertEqual(result, ['/tmp/ansible_collections/namespace/collection/plugins/module/mod'])
    def test__get_subpackage_search_paths(self):
        instance = _AnsibleCollectionPkgLoaderBase('ansible_collections.namespace.collection.plugins.module.mod')
        result = instance._get_subpackage_search_paths(['/tmp/ansible_collections/namespace/collection/plugins/module/mod'])
        self.assertEqual(result, ['/tmp/ansible_collections/namespace/collection/plugins/module/mod'])
    def test__validate_final(self):
        instance = _AnsibleCollectionPkgLoaderBase('ansible_collections.namespace.collection.plugins.module.mod')
        instance._candidate_paths = ['/tmp/ansible_collections/namespace/collection/plugins/module/mod']
        instance._subpackage_search_paths = ['/tmp/ansible_collections/namespace/collection/plugins/module/mod']
        instance._validate_final()
    def test_load_module(self):
        instance = _AnsibleCollectionPkgLoaderBase('ansible_collections.namespace.collection.plugins.module.mod')
        instance._redirect_module = None
        result = instance.load_module('ansible_collections.namespace.collection.plugins.module.mod')
    def test_is_package(self):
        instance = _AnsibleCollectionPkgLoaderBase('ansible_collections.namespace.collection.plugins.module.mod')
        instance._subpackage_search_paths = ['/tmp/ansible_collections/namespace/collection/plugins/module/mod']
        result = instance.is_package('ansible_collections.namespace.collection.plugins.module.mod')
        self.assertEqual(result, True)
    def test_get_source(self):
        instance = _AnsibleCollectionPkgLoaderBase('ansible_collections.namespace.collection.plugins.module.mod')
        instance._decoded_source = None
        result = instance.get_source('ansible_collections.namespace.collection.plugins.module.mod')
    def test_get_data(self):
        instance = _AnsibleCollectionPkgLoaderBase('ansible_collections.namespace.collection.plugins.module.mod')
        result = instance.get_data('/tmp/ansible_collections/namespace/collection/plugins/module/mod')
    def test__synthetic_filename(self):
        instance = _AnsibleCollectionPkgLoaderBase('ansible_collections.namespace.collection.plugins.module.mod')
        result = instance._synthetic_filename('ansible_collections.namespace.collection.plugins.module.mod')
        self.assertEqual(result, '<ansible_synthetic_collection_package>')
    def test_get_filename(self):
        instance = _AnsibleCollectionPkgLoaderBase('ansible_collections.namespace.collection.plugins.module.mod')
        instance._source_code_path = None
        result = instance.get_filename('ansible_collections.namespace.collection.plugins.module.mod')
    def test_get_code(self):
        instance = _AnsibleCollectionPkgLoaderBase('ansible_collections.namespace.collection.plugins.module.mod')
        instance._compiled_code = None
        result = instance.get_code('ansible_collections.namespace.collection.plugins.module.mod')

if __name__ == '__main__':
    unittest.main()