import unittest
from ansible.utils.collection_loader._collection_finder import AnsibleCollectionRef


class TestAnsibleInternalRedirectLoader(unittest.TestCase):

    def test_init(self):
        loader = _AnsibleInternalRedirectLoader('ansible.module_utils', [])
        self.assertEqual(loader._redirect, None)

    def test_load_module(self):
        loader = _AnsibleInternalRedirectLoader('ansible.module_utils', [])
        with self.assertRaises(ImportError) as context:
            loader.load_module('ansible.module_utils')
        self.assertTrue('not interested' in str(context.exception))

if __name__ == '__main__':
    unittest.main()