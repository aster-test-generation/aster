import unittest
from ansible.module_utils.common.collections import ImmutableDict


class TestTaggable(unittest.TestCase):
    def test_evaluate_tags_with_only_tags(self):
        taggable = Taggable()
        taggable.tags = ['tag1', 'tag2']
        should_run = taggable.evaluate_tags(only_tags=['tag1'], skip_tags=None)
        self.assertTrue(should_run)

    def test_evaluate_tags_with_skip_tags(self):
        taggable = Taggable()
        taggable.tags = ['tag1', 'tag2']
        should_run = taggable.evaluate_tags(only_tags=None, skip_tags=['tag1'])
        self.assertFalse(should_run)

    def test_evaluate_tags_with_no_tags(self):
        taggable = Taggable()
        taggable.tags = []
        should_run = taggable.evaluate_tags(only_tags=None, skip_tags=None)
        self.assertTrue(should_run)

    def test_evaluate_tags_with_all_tags(self):
        taggable = Taggable()
        taggable.tags = ['tag1', 'tag2']
        should_run = taggable.evaluate_tags(only_tags=['all'], skip_tags=None)
        self.assertTrue(should_run)

    def test_evaluate_tags_with_never_tags(self):
        taggable = Taggable()
        taggable.tags = ['tag1', 'tag2']
        should_run = taggable.evaluate_tags(only_tags=None, skip_tags=['never'])
        self.assertFalse(should_run)

    def test_evaluate_tags_with_tagged_tags(self):
        taggable = Taggable()
        taggable.tags = ['tag1', 'tag2']
        should_run = taggable.evaluate_tags(only_tags=['tagged'], skip_tags=None)
        self.assertTrue(should_run)

    def test_evaluate_tags_with_always_tags(self):
        taggable = Taggable()
        taggable.tags = ['tag1', 'tag2']
        should_run = taggable.evaluate_tags(only_tags=['always'], skip_tags=None)
        self.assertTrue(should_run)

    def test_evaluate_tags_with_always_and_never_tags(self):
        taggable = Taggable()
        taggable.tags = ['tag1', 'tag2']
        should_run = taggable.evaluate_tags(only_tags=['always'], skip_tags=['never'])
        self.assertTrue(should_run)

    def test_evaluate_tags_with_always_and_tagged_tags(self):
        taggable = Taggable()
        taggable.tags = ['tag1', 'tag2']
        should_run = taggable.evaluate_tags(only_tags=['always'], skip_tags=['tagged'])
        self.assertTrue(should_run)

    def test_evaluate_tags_with_always_and_all_tags(self):
        taggable = Taggable()
        taggable.tags = ['tag1', 'tag2']
        should_run = taggable.evaluate_tags(only_tags=['always'], skip_tags=['all'])
        self.assertTrue(should_run)

if __name__ == '__main__':
    unittest.main()