import unittest
from ansible.playbook.taggable import Taggable


class TestTaggable(unittest.TestCase):
    def test_load_tags(self):
        taggable = Taggable()
        self.assertEqual(taggable._load_tags(None, ['tag1', 'tag2']), ['tag1', 'tag2'])
        self.assertEqual(taggable._load_tags(None, 'tag1,tag2'), ['tag1', 'tag2'])
        with self.assertRaises(AnsibleError):
            taggable._load_tags(None, 123)

    def test_evaluate_tags(self):
        taggable = Taggable()
        taggable.tags = ['tag1', 'tag2']
        all_vars = {'var1': 'value1', 'var2': 'value2'}
        templar = Templar(loader=None, variables=all_vars)
        should_run = taggable.evaluate_tags(['tag1'], ['tag2'], all_vars)
        self.assertTrue(should_run)
        should_run = taggable.evaluate_tags(['tag3'], ['tag2'], all_vars)
        self.assertFalse(should_run)

if __name__ == '__main__':
    unittest.main()