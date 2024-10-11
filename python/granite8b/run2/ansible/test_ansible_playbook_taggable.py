import unittest
from ansible.module_utils.common.collections import ImmutableDict


class TestTaggable(unittest.TestCase):
    def test_evaluate_tags(self):
        taggable = Taggable()
        taggable.tags = ['tag1', 'tag2']
        only_tags = ['tag1', 'tag2']
        skip_tags = []
        all_vars = {}
        should_run = taggable.evaluate_tags(only_tags, skip_tags, all_vars)
        self.assertTrue(should_run)
        only_tags = ['tag3']
        skip_tags = []
        should_run = taggable.evaluate_tags(only_tags, skip_tags, all_vars)
        self.assertFalse(should_run)
        only_tags = []
        skip_tags = ['tag1']
        should_run = taggable.evaluate_tags(only_tags, skip_tags, all_vars)
        self.assertFalse(should_run)
        only_tags = []
        skip_tags = ['tag3']
        should_run = taggable.evaluate_tags(only_tags, skip_tags, all_vars)
        self.assertTrue(should_run)
        only_tags = ['tag1', 'tag3']
        skip_tags = ['tag2']
        should_run = taggable.evaluate_tags(only_tags, skip_tags, all_vars)
        self.assertFalse(should_run)
        only_tags = ['tag1', 'tag3']
        skip_tags = ['tag1']
        should_run = taggable.evaluate_tags(only_tags, skip_tags, all_vars)
        self.assertFalse(should_run)
        only_tags = ['tag1', 'tag3']
        skip_tags = ['tag3']
        should_run = taggable.evaluate_tags(only_tags, skip_tags, all_vars)
        self.assertFalse(should_run)
        only_tags = ['tag1', 'tag3']
        skip_tags = ['tag1', 'tag3']
        should_run = taggable.evaluate_tags(only_tags, skip_tags, all_vars)
        self.assertFalse(should_run)

if __name__ == '__main__':
    unittest.main()