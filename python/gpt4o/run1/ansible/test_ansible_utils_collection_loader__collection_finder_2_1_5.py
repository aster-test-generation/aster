from ansible.utils.collection_loader import _AnsibleCollectionPkgLoaderBase as ModuleType
import unittest
from ansible.utils.collection_loader._collection_finder import _AnsibleCollectionPkgLoader
from ansible.module_utils.common.text.converters import to_bytes
from unittest.mock import patch, mock_open, MagicMock


class TestAnsibleCollectionPkgLoader(unittest.TestCase):
    def setUp(self):
        self.loader = _AnsibleCollectionPkgLoader()
        self.loader._split_name = ['namespace', 'ansible', 'builtin']
        self.loader._fullname = 'namespace.ansible.builtin'
        self.loader._subpackage_search_paths = ['path1', 'path2']
        self.loader._package_to_load = 'package'
        self.loader._candidate_paths = ['candidate_path1', 'candidate_path2']

    def test_init(self):
        loader = _AnsibleCollectionPkgLoader()
        self.assertIsInstance(loader, _AnsibleCollectionPkgLoader)

    def test_validate_args(self):
        with patch('ansible.utils.collection_loader._collection_finder._AnsibleCollectionPkgLoaderBase._validate_args') as mock_validate_args:
            self.loader._validate_args()
            mock_validate_args.assert_called_once()

    def test_validate_args_invalid(self):
        self.loader._split_name = ['namespace', 'ansible']
        with self.assertRaises(ImportError):
            self.loader._validate_args()

    def test_validate_final_builtin(self):
        self.loader._split_name = ['namespace', 'ansible', 'builtin']
        self.loader._validate_final()
        self.assertEqual(self.loader._subpackage_search_paths, [])

    def test_validate_final_no_subpackage(self):
        self.loader._split_name = ['namespace', 'ansible', 'custom']
        self.loader._subpackage_search_paths = []
        with self.assertRaises(ImportError):
            self.loader._validate_final()

    def test_validate_final_with_subpackage(self):
        self.loader._split_name = ['namespace', 'ansible', 'custom']
        self.loader._subpackage_search_paths = ['path1', 'path2']
        self.loader._validate_final()
        self.assertEqual(self.loader._subpackage_search_paths, ['path1'])

    @patch('ansible.utils.collection_loader._collection_finder._meta_yml_to_dict', return_value={})
    @patch('ansible.utils.collection_loader._collection_finder.open', new_callable=mock_open, read_data='data')
    @patch('ansible.utils.collection_loader._collection_finder.os.path.isfile', return_value=True)
    @patch('ansible.utils.collection_loader._collection_finder.os.path.dirname', return_value='dirname')
    @patch('ansible.utils.collection_loader._collection_finder.import_module')
    def test_load_module_builtin(self, mock_import_module, mock_dirname, mock_isfile, mock_open, mock_meta_yml_to_dict):
        mock_import_module.return_value.__file__ = 'ansible/__init__.py'
        self.loader._split_name = ['namespace', 'ansible', 'builtin']
        module = self.loader.load_module('namespace.ansible.builtin')
        self.assertIsInstance(module, ModuleType)

    @patch('ansible.utils.collection_loader._collection_finder._meta_yml_to_dict', return_value={})
    @patch('ansible.utils.collection_loader._collection_finder.open', new_callable=mock_open, read_data='data')
    @patch('ansible.utils.collection_loader._collection_finder.os.path.isfile', return_value=True)
    @patch('ansible.utils.collection_loader._collection_finder.os.path.dirname', return_value='dirname')
    def test_load_module_custom(self, mock_dirname, mock_isfile, mock_open, mock_meta_yml_to_dict):
        self.loader._split_name = ['namespace', 'ansible', 'custom']
        module = self.loader.load_module('namespace.ansible.custom')
        self.assertIsInstance(module, ModuleType)

    @patch('ansible.utils.collection_loader._collection_finder._meta_yml_to_dict', return_value={})
    @patch('ansible.utils.collection_loader._collection_finder.open', new_callable=mock_open, read_data='data')
    @patch('ansible.utils.collection_loader._collection_finder.os.path.isfile', return_value=False)
    @patch('ansible.utils.collection_loader._collection_finder.os.path.dirname', return_value='dirname')
    def test_load_module_no_meta(self, mock_dirname, mock_isfile, mock_open, mock_meta_yml_to_dict):
        self.loader._split_name = ['namespace', 'ansible', 'custom']
        module = self.loader.load_module('namespace.ansible.custom')
        self.assertIsInstance(module, ModuleType)

    def test_canonicalize_meta(self):
        meta_dict = {'key': 'value'}
        result = self.loader._canonicalize_meta(meta_dict)
        self.assertEqual(result, meta_dict)

if __name__ == '__main__':
    unittest.main()