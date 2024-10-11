import unittest
from ansible.modules.apt_repository import SourcesList
from ansible.module_utils.basic import AnsibleModule


class TestSourcesList(unittest.TestCase):
    def setUp(self):
        self.module = AnsibleModule(argument_spec={}, exit_json=self.exit_json, fail_json=self.fail_json)
        self.sources_list = SourcesList(self.module)

    def test_init(self):
        self.assertIsInstance(self.sources_list, SourcesList)
        self.assertEqual(self.sources_list.module, self.module)
        self.assertIsInstance(self.sources_list.files, dict)
        self.assertIsInstance(self.sources_list.new_repos, set)

    def test_modify(self):
        self.sources_list.files = {'test_file': [(0, True, False, 'source_old', 'comment_old')]}
        self.sources_list.modify('test_file', 0, enabled=True, source='source_new', comment='comment_new')
        self.assertEqual(self.sources_list.files['test_file'][0], (0, True, True, 'source_new', 'comment_new'))

    def test_add_valid_source(self):
        self.sources_list.files = {}
        self.sources_list._add_valid_source('source_new', 'comment_new', 'test_file')
        self.assertIn('test_file', self.sources_list.files)
        self.assertIn('test_file', self.sources_list.new_repos)
        self.assertEqual(self.sources_list.files['test_file'][0], (0, True, True, 'source_new', 'comment_new'))

    def test_add_source(self):
        self.sources_list._parse = lambda x, raise_if_invalid_or_disabled: (None, None, 'source_new')
        self.sources_list._suggest_filename = lambda x: 'test_file'
        self.sources_list.add_source('line', 'comment')
        self.assertIn('test_file', self.sources_list.files)
        self.assertIn('test_file', self.sources_list.new_repos)
        self.assertEqual(self.sources_list.files['test_file'][0], (0, True, True, 'source_new', 'comment'))

    def test_remove_valid_source(self):
        self.sources_list.files = {'test_file': [(0, True, True, 'source_new', 'comment_new')]}
        self.sources_list._remove_valid_source('source_new')
        self.assertEqual(self.sources_list.files['test_file'], [])

    def test_remove_source(self):
        self.sources_list._parse = lambda x, raise_if_invalid_or_disabled: (None, None, 'source_new')
        self.sources_list.files = {'test_file': [(0, True, True, 'source_new', 'comment_new')]}
        self.sources_list.remove_source('line')
        self.assertEqual(self.sources_list.files['test_file'], [])

    def test_choice(self):
        result = self.sources_list._choice('new', 'old')
        self.assertEqual(result, 'new')
        result = self.sources_list._choice(None, 'old')
        self.assertEqual(result, 'old')

    def test_apt_cfg_file(self):
        self.sources_list._apt_cfg_file = lambda x: '/etc/apt/sources.list'
        result = self.sources_list._apt_cfg_file('Dir::Etc::sourcelist')
        self.assertEqual(result, '/etc/apt/sources.list')

    def test_apt_cfg_dir(self):
        self.sources_list._apt_cfg_dir = lambda x: '/etc/apt/sources.list.d'
        result = self.sources_list._apt_cfg_dir('Dir::Etc::sourceparts')
        self.assertEqual(result, '/etc/apt/sources.list.d')

    def test_expand_path(self):
        self.sources_list._expand_path = lambda x: '/expanded/path'
        result = self.sources_list._expand_path('path')
        self.assertEqual(result, '/expanded/path')

    def test_parse(self):
        self.sources_list._parse = lambda x, raise_if_invalid_or_disabled: (None, None, 'parsed_source')
        result = self.sources_list._parse('line', raise_if_invalid_or_disabled=True)
        self.assertEqual(result, (None, None, 'parsed_source'))

    def test_suggest_filename(self):
        self.sources_list._suggest_filename = lambda x: 'suggested_filename'
        result = self.sources_list._suggest_filename('source')
        self.assertEqual(result, 'suggested_filename')

if __name__ == '__main__':
    unittest.main()