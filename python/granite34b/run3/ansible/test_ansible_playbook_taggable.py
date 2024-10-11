from ansible.playbook.taggable import AnsibleError
import unittest
from ansible.playbook.taggable import Taggable


class TestTaggable(unittest.TestCase):
    def setUp(self):
        self.taggable = Taggable()

    def test_load_tags(self):
        self.assertEqual(self.taggable._load_tags(None, ['tag1', 'tag2']), ['tag1', 'tag2'])
        self.assertEqual(self.taggable._load_tags(None, 'tag1,tag2'), ['tag1', 'tag2'])
        with self.assertRaises(AnsibleError):
            self.taggable._load_tags(None, 123)

    def test_evaluate_tags(self):
        all_vars = {'var1': 'value1', 'var2': 'value2'}
        self.assertTrue(self.taggable._evaluate_tags(None, None, all_vars))
        self.assertTrue(self.taggable.evaluate_tags(['all'], None, all_vars))
        self.assertFalse(self.taggable.evaluate_tags(['tag1'], None, all_vars))
        self.assertTrue(self.taggable.evaluate_tags(None, ['tag2'], all_vars))
        self.assertFalse(self.taggable.evaluate_tags(['tag1'], ['tag2'], all_vars))
        self.assertTrue(self.taggable.evaluate_tags(['all'], ['tag2'], all_vars))

if __name__ == '__main__':
    unittest.main()