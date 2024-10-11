import sys
import unittest
from ansible.utils.collection_loader._collection_finder import AnsibleCollectionRef
from unittest.mock import MagicMock, patch


class TestAnsiblePathHookFinder(unittest.TestCase):
    def setUp(self):
        self.collection_finder = MagicMock()
        self.pathctx = '/some/path'
        self.instance = _AnsiblePathHookFinder(self.collection_finder, self.pathctx)

    def test_init(self):
        self.assertEqual(self.instance._pathctx, self.pathctx)
        self.assertEqual(self.instance._collection_finder, self.collection_finder)
        if sys.version_info[0] == 3:
            self.assertIsNone(self.instance._file_finder)

    def test_get_filefinder_path_hook(self):
        with patch('sys.path_hooks', new=[MagicMock()]) as mock_path_hooks:
            mock_path_hooks[0].__repr__.return_value = 'FileFinder'
            result = self.instance._get_filefinder_path_hook()
            self.assertEqual(result, mock_path_hooks[0])

    def test_get_filefinder_path_hook_no_filefinder(self):
        with patch('sys.path_hooks', new=[]):
            with self.assertRaises(Exception) as context:
                self.instance._get_filefinder_path_hook()
            self.assertIn('need exactly one FileFinder import hook', str(context.exception))

    def test_find_module_ansible_collections(self):
        fullname = 'ansible_collections.some_module'
        self.instance._collection_finder.find_module.return_value = 'mock_loader'
        result = self.instance.find_module(fullname)
        self.assertEqual(result, 'mock_loader')

    def test_find_module_py3(self):
        fullname = 'some_module'
        with patch.object(self.instance, '_file_finder', None):
            with patch.object(_AnsiblePathHookFinder, '_filefinder_path_hook', return_value=MagicMock()) as mock_filefinder_path_hook:
                mock_filefinder_path_hook.return_value.find_spec.return_value = MagicMock(loader='mock_loader')
                result = self.instance.find_module(fullname)
                self.assertEqual(result, 'mock_loader')

    def test_find_module_py3_no_spec(self):
        fullname = 'some_module'
        with patch.object(self.instance, '_file_finder', None):
            with patch.object(_AnsiblePathHookFinder, '_filefinder_path_hook', return_value=MagicMock()) as mock_filefinder_path_hook:
                mock_filefinder_path_hook.return_value.find_spec.return_value = None
                result = self.instance.find_module(fullname)
                self.assertIsNone(result)

    def test_find_module_py2(self):
        fullname = 'some_module'
        with patch('pkgutil.ImpImporter') as mock_imp_importer:
            mock_imp_importer.return_value.find_module.return_value = 'mock_loader'
            result = self.instance.find_module(fullname)
            self.assertEqual(result, 'mock_loader')

    def test_iter_modules(self):
        prefix = 'some_prefix'
        with patch('ansible.utils.collection_loader._collection_finder._iter_modules_impl', return_value=['module1', 'module2']) as mock_iter_modules_impl:
            result = self.instance.iter_modules(prefix)
            self.assertEqual(result, ['module1', 'module2'])

    def test_repr(self):
        result = self.instance.__repr__()
        self.assertEqual(result, "_AnsiblePathHookFinder(path='/some/path')")

if __name__ == '__main__':
    unittest.main()