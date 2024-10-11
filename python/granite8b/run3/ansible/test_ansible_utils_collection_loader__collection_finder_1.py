import unittest
from ansible.utils.collection_loader import AnsibleCollectionRef


class TestAnsibleCollectionFinder(unittest.TestCase):
    def test_find_module(self):
        finder = _AnsibleCollectionFinder()
        self.assertIsNotNone(finder.find_module('ansible.module_utils.common.text.converters'))
        self.assertIsNotNone(finder.find_module('ansible_collections.ansible.module_utils.common.text.converters'))
        self.assertIsNone(finder.find_module('ansible.module_utils.common.text.converters.not_a_real_module'))
        self.assertIsNone(finder.find_module('ansible_collections.ansible.module_utils.common.text.converters.not_a_real_module'))

    def test_set_playbook_paths(self):
        finder = _AnsibleCollectionFinder()
        finder.set_playbook_paths(['/path/to/playbook'])
        self.assertIn('/path/to/playbook/collections', finder._n_collection_paths)

    def test_reload_hack(self):
        finder = _AnsibleCollectionFinder()
        self.assertIsNotNone(finder._reload_hack('ansible.module_utils.common.text.converters'))
        self.assertIsNotNone(finder._reload_hack('ansible_collections.ansible.module_utils.common.text.converters'))
        with self.assertRaises(ImportError):
            finder._reload_hack('ansible.module_utils.common.text.converters.not_a_real_module')
        with self.assertRaises(ImportError):
            finder._reload_hack('ansible_collections.ansible.module_utils.common.text.converters.not_a_real_module')

if __name__ == '__main__':
    unittest.main()