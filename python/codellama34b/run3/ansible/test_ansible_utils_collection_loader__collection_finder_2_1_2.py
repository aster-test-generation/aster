from ansible.utils.collection_loader._collection_finder import AnsibleCollectionRef
import unittest
from ansible.utils.collection_loader._collection_finder import *



class Test_AnsibleCollectionPkgLoaderBase(unittest.TestCase):
    def test_init(self):
        instance = _AnsibleCollectionPkgLoaderBase('ansible_collections.my_namespace.my_collection.plugins.modules.my_module', path_list=None)
        self.assertEqual(instance._fullname, 'ansible_collections.my_namespace.my_collection.plugins.modules.my_module')
        self.assertEqual(instance._redirect_module, None)
        self.assertEqual(instance._split_name, ['ansible_collections', 'my_namespace', 'my_collection', 'plugins', 'modules', 'my_module'])
        self.assertEqual(instance._rpart_name, ('ansible_collections.my_namespace.my_collection.plugins.modules', 'my_module'))
        self.assertEqual(instance._parent_package_name, 'ansible_collections.my_namespace.my_collection.plugins.modules')
        self.assertEqual(instance._package_to_load, 'my_module')
        self.assertEqual(instance._source_code_path, None)
        self.assertEqual(instance._decoded_source, None)
        self.assertEqual(instance._compiled_code, None)

    def test_validate_args(self):
        instance = _AnsibleCollectionPkgLoaderBase('ansible_collections.my_namespace.my_collection.plugins.modules.my_module', path_list=None)
        instance._validate_args()
        instance = _AnsibleCollectionPkgLoaderBase('my_namespace.my_collection.plugins.modules.my_module', path_list=None)
        self.assertRaises(ImportError, instance._validate_args)

    def test_get_candidate_paths(self):
        instance = _AnsibleCollectionPkgLoaderBase('ansible_collections.my_namespace.my_collection.plugins.modules.my_module', path_list=None)
        self.assertEqual(instance._get_candidate_paths([to_native('/path/to/ansible_collections')]), ['/path/to/ansible_collections/my_namespace/my_collection/plugins/modules/my_module'])

    def test_get_subpackage_search_paths(self):
        instance = _AnsibleCollectionPkgLoaderBase('ansible_collections.my_namespace.my_collection.plugins.modules.my_module', path_list=None)
        self.assertEqual(instance._get_subpackage_search_paths(['/path/to/ansible_collections/my_namespace/my_collection/plugins/modules/my_module']), ['/path/to/ansible_collections/my_namespace/my_collection/plugins/modules/my_module'])

    def test_validate_final(self):
        instance = _AnsibleCollectionPkgLoaderBase('ansible_collections.my_namespace.my_collection.plugins.modules.my_module', path_list=None)
        instance._validate_final()

    def test_new_or_existing_module(self):
        instance = _AnsibleCollectionPkgLoaderBase('ansible_collections.my_namespace.my_collection.plugins.modules.my_module', path_list=None)
        with instance._new_or_existing_module('ansible_collections.my_namespace.my_collection.plugins.modules.my_module', __loader__=instance, __file__='/path/to/ansible_collections/my_namespace/my_collection/plugins/modules/my_module', __package__='ansible_collections.my_namespace.my_collection.plugins.modules') as module:
            self.assertEqual(module.__loader__, instance)
            self.assertEqual(module.__file__, '/path/to/ansible_collections/my_namespace/my_collection/plugins/modules/my_module')
            self.assertEqual(module.__package__, 'ansible_collections.my_namespace.my_collection.plugins.modules')

if __name__ == '__main__':
    unittest.main()