import unittest
import os
import sys
from types import ModuleType
from ansible.utils.collection_loader._collection_finder import AnsibleCollectionRef


class TestAnsibleCollectionPkgLoaderBase(unittest.TestCase):

    def setUp(self):
        self.fullname = 'ansible_collections.test_collection'
        self.path_list = ['/fake/path']
        self.loader = _AnsibleCollectionPkgLoaderBase(self.fullname, self.path_list)

    def test_init(self):
        self.assertEqual(self.loader._fullname, self.fullname)
        self.assertIsNone(self.loader._redirect_module)
        self.assertEqual(self.loader._split_name, self.fullname.split('.'))
        self.assertEqual(self.loader._rpart_name, self.fullname.rpartition('.'))
        self.assertEqual(self.loader._parent_package_name, self.fullname.rpartition('.')[0])
        self.assertEqual(self.loader._package_to_load, self.fullname.rpartition('.')[2])
        self.assertIsNone(self.loader._source_code_path)
        self.assertIsNone(self.loader._decoded_source)
        self.assertIsNone(self.loader._compiled_code)

    def test_validate_args(self):
        with self.assertRaises(ImportError):
            invalid_loader = _AnsibleCollectionPkgLoaderBase('invalid_package', self.path_list)

    def test_get_candidate_paths(self):
        result = self.loader._get_candidate_paths(self.path_list)
        self.assertEqual(result, [os.path.join(self.path_list[0], self.loader._package_to_load)])

    def test_get_subpackage_search_paths(self):
        candidate_paths = self.loader._get_candidate_paths(self.path_list)
        result = self.loader._get_subpackage_search_paths(candidate_paths)
        self.assertEqual(result, [])

    def test_validate_final(self):
        self.assertIsNone(self.loader._validate_final())

    def test_new_or_existing_module(self):
        with self.loader._new_or_existing_module('test_module') as module:
            self.assertIsInstance(module, ModuleType)
            self.assertIn('test_module', sys.modules)

    def test_module_file_from_path(self):
        with self.assertRaises(ImportError):
            self.loader._module_file_from_path('nonexistent', '/fake/path')

    def test_load_module(self):
        with self.assertRaises(ImportError):
            self.loader.load_module('nonexistent')

    def test_is_package(self):
        self.assertTrue(self.loader.is_package(self.fullname))
        with self.assertRaises(ValueError):
            self.loader.is_package('invalid_package')

    def test_get_source(self):
        self.assertIsNone(self.loader.get_source(self.fullname))
        with self.assertRaises(ValueError):
            self.loader.get_source('invalid_package')

    def test_get_data(self):
        with self.assertRaises(ValueError):
            self.loader.get_data('')
        with self.assertRaises(ValueError):
            self.loader.get_data('relative/path')

    def test_synthetic_filename(self):
        result = self.loader._synthetic_filename(self.fullname)
        self.assertEqual(result, '<ansible_synthetic_collection_package>')

    def test_get_filename(self):
        self.assertIsNone(self.loader.get_filename(self.fullname))
        with self.assertRaises(ValueError):
            self.loader.get_filename('invalid_package')

    def test_get_code(self):
        self.assertIsNone(self.loader.get_code(self.fullname))
        with self.assertRaises(ValueError):
            self.loader.get_code('invalid_package')

    def test_iter_modules(self):
        result = list(self.loader.iter_modules('prefix'))
        self.assertEqual(result, [])

    def test_repr(self):
        result = repr(self.loader)
        self.assertEqual(result, '{0}(path={1})'.format(self.loader.__class__.__name__, self.loader._subpackage_search_paths or self.loader._source_code_path))

if __name__ == '__main__':
    unittest.main()