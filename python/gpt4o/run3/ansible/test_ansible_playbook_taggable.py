import unittest
from ansible.playbook.taggable import Taggable
from ansible.errors import AnsibleError
from ansible.template import Templar
from unittest.mock import MagicMock


class TestTaggable(unittest.TestCase):
    def setUp(self):
        self.instance = Taggable()
        self.instance._loader = MagicMock()

    def test_load_tags_with_list(self):
        result = self.instance._load_tags('attr', ['tag1', 'tag2'])
        self.assertEqual(result, ['tag1', 'tag2'])

    def test_load_tags_with_string(self):
        result = self.instance._load_tags('attr', 'tag1, tag2')
        self.assertEqual(result, ['tag1', 'tag2'])

    def test_load_tags_with_invalid_type(self):
        with self.assertRaises(AnsibleError):
            self.instance._load_tags('attr', 123)

    def test_evaluate_tags_with_no_tags(self):
        self.instance.tags = []
        result = self.instance.evaluate_tags(only_tags=None, skip_tags=None, all_vars={})
        self.assertTrue(result)

    def test_evaluate_tags_with_only_tags(self):
        self.instance.tags = ['tag1']
        templar = Templar(loader=self.instance._loader, variables={})
        templar.template = MagicMock(return_value=['tag1'])
        self.instance._loader = templar
        result = self.instance._basedir.evaluate_tags(only_tags=['tag1'], skip_tags=None, all_vars={})
        self.assertTrue(result)

    def test_evaluate_tags_with_skip_tags(self):
        self.instance.tags = ['tag1']
        templar = Templar(loader=self.instance._loader, variables={})
        templar.template = MagicMock(return_value=['tag1'])
        self.instance._loader = templar
        result = self.instance._basedir.evaluate_tags(only_tags=None, skip_tags=['tag1'], all_vars={})
        self.assertFalse(result)

    def test_evaluate_tags_with_only_and_skip_tags(self):
        self.instance.tags = ['tag1']
        templar = Templar(loader=self.instance._loader, variables={})
        templar.template = MagicMock(return_value=['tag1'])
        self.instance._loader = templar
        result = self.instance._basedir.evaluate_tags(only_tags=['tag1'], skip_tags=['tag2'], all_vars={})
        self.assertTrue(result)

    def test_evaluate_tags_with_untagged(self):
        self.instance.tags = []
        result = self.instance.evaluate_tags(only_tags=['untagged'], skip_tags=None, all_vars={})
        self.assertTrue(result)

if __name__ == '__main__':
    unittest.main()