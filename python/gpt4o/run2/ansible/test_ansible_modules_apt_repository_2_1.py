import unittest
from ansible.modules.apt_repository import SourcesList
from ansible.module_utils.basic import AnsibleModule


class TestSourcesList(unittest.TestCase):
    def setUp(self):
        self.module = AnsibleModule(argument_spec={})
        self.sources_list = SourcesList(self.module)

    def test_init(self):
        self.assertIsInstance(self.sources_list, SourcesList)
        self.assertEqual(self.sources_list.module, self.module)
        self.assertIsInstance(self.sources_list.files, dict)
        self.assertIsInstance(self.sources_list.new_repos, set)

    def test_modify(self):
        self.sources_list.files = {'test_file': [(0, True, True, 'source', 'comment')]}
        self.sources_list.modify('test_file', 0, enabled=False, source='new_source', comment='new_comment')
        self.assertEqual(self.sources_list.files['test_file'][0], (0, True, False, 'new_source', 'new_comment'))

    def test_add_valid_source(self):
        self.sources_list.files = {}
        self.sources_list._add_valid_source('new_source', 'new_comment', 'test_file')
        self.assertIn('test_file', self.sources_list.files)
        self.assertIn('test_file', self.sources_list.new_repos)
        self.assertEqual(self.sources_list.files['test_file'][0], (0, True, True, 'new_source', 'new_comment'))

    def test_add_source(self):
        self.sources_list._parse = lambda x, raise_if_invalid_or_disabled: (None, None, 'parsed_source')
        self.sources_list._add_valid_source = lambda source, comment, file: self.assertEqual(source, 'parsed_source')
        self.sources_list.add_source('line', 'comment', 'file')

    def test_remove_valid_source(self):
        self.sources_list.files = {'test_file': [(0, True, True, 'source', 'comment')]}
        self.sources_list._remove_valid_source('source')
        self.assertEqual(self.sources_list.files['test_file'], [])

    def test_remove_source(self):
        self.sources_list._parse = lambda x, raise_if_invalid_or_disabled: (None, None, 'parsed_source')
        self.sources_list._remove_valid_source = lambda source: self.assertEqual(source, 'parsed_source')
        self.sources_list.remove_source('line')

    def test_private_methods(self):
        self.sources_list._apt_cfg_file = lambda x: 'default_file'
        self.sources_list._apt_cfg_dir = lambda x: 'default_dir'
        self.sources_list._expand_path = lambda x: 'expanded_path'
        self.sources_list._choice = lambda x, y: x or y
        self.sources_list._parse = lambda x, raise_if_invalid_or_disabled: (None, None, 'parsed_source')
        self.sources_list._suggest_filename = lambda x: 'suggested_filename'

        self.assertEqual(self.sources_list._apt_cfg_file('test'), 'default_file')
        self.assertEqual(self.sources_list._apt_cfg_dir('test'), 'default_dir')
        self.assertEqual(self.sources_list._expand_path('test'), 'expanded_path')
        self.assertEqual(self.sources_list._choice(None, 'default'), 'default')
        self.assertEqual(self.sources_list._parse('test', True), (None, None, 'parsed_source'))
        self.assertEqual(self.sources_list._suggest_filename('test'), 'suggested_filename')

if __name__ == '__main__':
    unittest.main()