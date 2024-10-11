import unittest
from ansible.playbook.taggable import Taggable


class TestTaggable(unittest.TestCase):
    def test_load_tags(self):
        taggable = Taggable()
        self.assertEqual(taggable._load_tags(None, ['tag1', 'tag2']), ['tag1', 'tag2'])
        self.assertEqual(taggable._load_tags(None, 'tag1,tag2'), ['tag1', 'tag2'])
        with self.assertRaises(AnsibleError):
            taggable._load_tags(None, {'tag1': 'value1', 'tag2': 'value2'})

    def test_evaluate_tags(self):
        taggable = Taggable()
        taggable.tags = ['tag1', 'tag2']
        all_vars = {'var1': 'value1', 'var2': 'value2'}
        templar = Templar(loader=self._loader, variables=all_vars)
        self.assertTrue(taggable.evaluate_tags(only_tags=None, skip_tags=None, all_vars=all_vars))
        self.assertTrue(taggable.evaluate_tags(only_tags=['tag1', 'tag2'], skip_tags=None, all_vars=all_vars))
        self.assertFalse(taggable.evaluate_tags(only_tags=['tag3'], skip_tags=None, all_vars=all_vars))
        self.assertFalse(taggable.evaluate_tags(only_tags=None, skip_tags=['tag1', 'tag2'], all_vars=all_vars))
        self.assertFalse(taggable.evaluate_tags(only_tags=['tag1', 'tag2'], skip_tags=['tag1', 'tag2'], all_vars=all_vars))

if __name__ == '__main__':
    unittest.main()