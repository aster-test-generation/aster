import unittest
from ansible.utils.collection_loader import _AnsibleCollectionPkgLoader
from ansible.module_utils.common.text.converters import to_native
from ansible.module_utils.six import string_types, PY3
from ansible.module_utils.collection_loader import _meta_yml_to_dict


class TestAnsibleCollectionPkgLoader(unittest.TestCase):
    def test_init(self):
        loader = _AnsibleCollectionPkgLoader()
        self.assertEqual(loader.__class__, _AnsibleCollectionPkgLoader)

    def test_validate_args(self):
        loader = _AnsibleCollectionPkgLoader()
        loader._split_name = ['ansible', 'collection', 'name']
        loader._validate_args()
        self.assertEqual(len(loader._split_name), 3)

    def test_validate_final(self):
        loader = _AnsibleCollectionPkgLoader()
        loader._split_name = ['ansible', 'collection', 'name']
        loader._validate_final()
        self.assertEqual(loader._subpackage_search_paths, [])

    def test_load_module(self):
        loader = _AnsibleCollectionPkgLoader()
        module = loader.load_module('ansible.collection.name')
        self.assertEqual(module.__class__, ModuleType)

    def test_canonicalize_meta(self):
        loader = _AnsibleCollectionPkgLoader()
        meta_dict = {'key': 'value'}
        result = loader._canonicalize_meta(meta_dict)
        self.assertEqual(result, meta_dict)

    def test_str_method(self):
        loader = _AnsibleCollectionPkgLoader()
        result = str(loader)
        self.assertEqual(result, '<_AnsibleCollectionPkgLoader object at 0x...>')

    def test_repr_method(self):
        loader = _AnsibleCollectionPkgLoader()
        result = repr(loader)
        self.assertEqual(result, '<_AnsibleCollectionPkgLoader object at 0x...>')

    def test_eq_method(self):
        loader1 = _AnsibleCollectionPkgLoader()
        loader2 = _AnsibleCollectionPkgLoader()
        self.assertEqual(loader1, loader2)

if __name__ == '__main__':
    unittest.main()