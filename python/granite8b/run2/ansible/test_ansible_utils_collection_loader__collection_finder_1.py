import unittest
from ansible.utils.collection_loader._collection_finder import AnsibleCollectionRef


class TestAnsibleCollectionFinder(unittest.TestCase):
    def test_find_module(self):
        finder = _AnsibleCollectionFinder()
        self.assertIsNotNone(finder.find_module('ansible.utils.collection_loader._collection_finder'))
        self.assertIsNotNone(finder.find_module('ansible_collections.ansible.utils.collection_loader._collection_finder'))
        self.assertIsNone(finder.find_module('ansible_collections.ansible.utils.collection_loader._not_a_module'))

    def test_set_playbook_paths(self):
        finder = _AnsibleCollectionFinder()
        finder.set_playbook_paths('tests/units/modules/collection_mock')
        self.assertIsNotNone(finder.find_module('ansible.utils.collection_loader._collection_finder'))
        self.assertIsNotNone(finder.find_module('ansible_collections.ansible.utils.collection_loader._collection_finder'))
        self.assertIsNone(finder.find_module('ansible_collections.ansible.utils.collection_loader._not_a_module'))

if __name__ == '__main__':
    unittest.main()