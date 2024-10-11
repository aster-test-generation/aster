import unittest
from ansible.utils.collection_loader import _AnsibleCollectionFinder


class TestAnsibleCollectionFinder(unittest.TestCase):
    def test_find_module(self):
        finder = _AnsibleCollectionFinder()
        self.assertIsNotNone(finder.find_module('ansible.utils.collection_loader._collection_finder'))
        self.assertIsNone(finder.find_module('ansible.utils.collection_loader._not_a_module'))

if __name__ == '__main__':
    unittest.main()