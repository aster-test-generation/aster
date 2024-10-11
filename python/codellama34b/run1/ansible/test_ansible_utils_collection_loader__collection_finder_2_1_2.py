from ansible.utils.collection_loader._collection_finder import AnsibleCollectionRef
import unittest
from ansible.utils.collection_loader._collection_finder import *



class Test_AnsibleCollectionPkgLoaderBase(unittest.TestCase):
    def test_init(self):
        instance = _AnsibleCollectionPkgLoaderBase('ansible_collections.namespace.collection.plugins.module_utils.module_name', path_list=None)
        self.assertEqual(instance._fullname, 'ansible_collections.namespace.collection.plugins.module_utils.module_name')
        self.assertEqual(instance._redirect_module, None)
        self.assertEqual(instance._split_name, ['ansible_collections', 'namespace', 'collection', 'plugins', 'module_utils', 'module_name'])
        self.assertEqual(instance._rpart_name, ('ansible_collections.namespace.collection.plugins.module_utils', '.', 'module_name'))
        self.assertEqual(instance._parent_package_name, 'ansible_collections.namespace.collection.plugins.module_utils')
        self.assertEqual(instance._package_to_load, 'module_name')
        self.assertEqual(instance._source_code_path, None)
        self.assertEqual(instance._decoded_source, None)
        self.assertEqual(instance._compiled_code, None)

if __name__ == '__main__':
    unittest.main()