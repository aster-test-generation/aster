import unittest
from ansible.parsing.yaml.objects import Taggable


class TestTaggable(unittest.TestCase):
    def test_untagged(self):
        self.assertEqual(Taggable.untagged, frozenset(['untagged']))

    def test_tags(self):
        instance = Taggable()
        self.assertEqual(instance.tags, list())

    def test_load_tags(self):
        instance = Taggable()
        result = instance._load_tags('attr', ['tag1', 'tag2'])
        self.assertEqual(result, ['tag1', 'tag2'])

    def test_evaluate_tags(self):
        instance = Taggable()
        result = instance.evaluate_tags(['tag1'], ['tag2'], {})
        self.assertEqual(result, True)


if __name__ == '__main__':
    unittest.main()