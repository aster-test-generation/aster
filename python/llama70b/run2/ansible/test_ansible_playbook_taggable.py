from ansible.errors import AnsibleErro
import unittest
from ansible.playbook.taggable import Taggable


class TestTaggable(unittest.TestCase):
    def test_init(self):
        instance = Taggable()
        self.assertIsInstance(instance, Taggable)

    def test_tags(self):
        instance = Taggable()
        instance._tags = ['tag1', 'tag2']
        self.assertEqual(instance.tags, ['tag1', 'tag2'])

    def test_load_tags_list(self):
        instance = Taggable()
        result = instance._load_tags('attr', ['tag1', 'tag2'])
        self.assertEqual(result, ['tag1', 'tag2'])

    def test_load_tags_string(self):
        instance = Taggable()
        result = instance._load_tags('attr', 'tag1,tag2')
        self.assertEqual(result, ['tag1', 'tag2'])

    def test_load_tags_invalid(self):
        instance = Taggable()
        with self.assertRaises(AnsibleError):
            instance._load_tags('attr', {'tag1': 'tag2'})

    def test_evaluate_tags_only_tags(self):
        instance = Taggable()
        instance.tags = ['tag1', 'tag2']
        all_vars = {}
        self.assertTrue(instance.evaluate_tags(['tag1'], [], all_vars))

    def test_evaluate_tags_skip_tags(self):
        instance = Taggable()
        instance.tags = ['tag1', 'tag2']
        all_vars = {}
        self.assertFalse(instance.evaluate_tags([], ['tag1'], all_vars))

    def test_evaluate_tags_all_vars(self):
        instance = Taggable()
        instance.tags = ['tag1', 'tag2']
        all_vars = {'tag1': True}
        self.assertTrue(instance.evaluate_tags(['tag1'], [], all_vars))

    def test_evaluate_tags_untagged(self):
        instance = Taggable()
        instance.tags = []
        all_vars = {}
        self.assertTrue(instance.evaluate_tags([], [], all_vars))

    def test_str_method(self):
        instance = Taggable()
        result = instance.__str__()
        self.assertEqual(result, 'Taggable')

    def test_repr_method(self):
        instance = Taggable()
        result = instance.__repr__()
        self.assertEqual(result, 'Taggable(tags=[])')

if __name__ == '__main__':
    unittest.main()