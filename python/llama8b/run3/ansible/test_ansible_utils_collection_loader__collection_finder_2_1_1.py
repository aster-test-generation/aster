import unittest
from unittest.mock import patch
from ansible.utils.collection_loader.collection_finder import AnsibleCollectionRe


class TestAnsiblePathHookFinder(unittest.TestCase):
    @patch('ansible.utils.collection_loader._collection_finder._AnsiblePathHookFinder._get_filefinder_path_hook')
    def test_get_filefinder_path_hook(self, mock_get_filefinder_path_hook):
        instance = _AnsiblePathHookFinder(None, None)
        result = instance._get_filefinder_path_hook()
        self.assertEqual(result, mock_get_filefinder_path_hook.return_value)

    def test_find_module(self):
        instance = _AnsiblePathHookFinder(None, None)
        result = instance.find_module('ansible_collections', None)
        self.assertEqual(result, instance._collection_finder.find_module.return_value)

    def test_iter_modules(self):
        instance = _AnsiblePathHookFinder(None, None)
        result = instance.iter_modules('prefix')
        self.assertEqual(result, _AnsiblePathHookFinder.iter_modules_impl.return_value)

    def test_repr(self):
        instance = _AnsiblePathHookFinder(None, None)
        result = instance.__repr__()
        self.assertEqual(result, "{0}(path='{1}')".format(instance.__class__.__name__, instance._pathctx))

if __name__ == '__main__':
    unittest.main()