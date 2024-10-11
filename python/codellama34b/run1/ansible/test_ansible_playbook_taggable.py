import unittest
from ansible.playbook.taggable import *


class TestTaggable(unittest.TestCase):
    def test_untagged(self):
        self.assertEqual(Taggable.untagged, frozenset(['untagged']))

    def test__load_tags(self):
        instance = Taggable()
        result = instance._load_tags('attr', ['ds'])
        self.assertEqual(result, ['ds'])

    def test_evaluate_tags(self):
        instance = Taggable()
        result = instance.evaluate_tags('only_tags', 'skip_tags', 'all_vars')
        self.assertEqual(result, True)


if __name__ == '__main__':
    unittest.main()