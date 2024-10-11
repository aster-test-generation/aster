from ansible.playbook import AnsibleErro
import unittest
from ansible.playbook.taggable import Taggable


class TestTaggable(unittest.TestCase):
    def test_init(self):
        instance = Taggable()
        self.assertEqual(instance._tags, [])

    def test_load_tags(self):
        instance = Taggable()
        instance._load_tags('tag1,tag2', 'tag1,tag2')
        self.assertEqual(instance._tags, ['tag1', 'tag2'])

    def test_load_tags_list(self):
        instance = Taggable()
        instance._load_tags(['tag1', 'tag2'], ['tag1', 'tag2'])
        self.assertEqual(instance._tags, ['tag1', 'tag2'])

    def test_load_tags_invalid(self):
        instance = Taggable()
        with self.assertRaises(AnsibleError):
            instance._load_tags('invalid', 'invalid')

    def test_evaluate_tags_only_tags(self):
        instance = Taggable()
        instance._tags = ['tag1', 'tag2']
        instance.evaluate_tags(['tag1'], [], {})
        self.assertTrue(instance.evaluate_tags(['tag1'], [], {}))

    def test_evaluate_tags_skip_tags(self):
        instance = Taggable()
        instance._tags = ['tag1', 'tag2']
        instance.evaluate_tags([], ['tag1'], {})
        self.assertFalse(instance.evaluate_tags([], ['tag1'], {}))

    def test_evaluate_tags_all_vars(self):
        instance = Taggable()
        instance._tags = ['tag1', 'tag2']
        instance.evaluate_tags(['tag1'], [], {'tags': 'tag1,tag2'})
        self.assertTrue(instance.evaluate_tags(['tag1'], [], {'tags': 'tag1,tag2'}))

    def test_str_method(self):
        instance = Taggable()
        result = str(instance)
        self.assertEqual(result, 'Taggable')

    def test_repr_method(self):
        instance = Taggable()
        result = repr(instance)
        self.assertEqual(result, 'Taggable()')

if __name__ == '__main__':
    unittest.main()