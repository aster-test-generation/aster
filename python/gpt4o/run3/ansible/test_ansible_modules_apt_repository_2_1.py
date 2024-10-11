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
        self.sources_list.files = {'file1': [(0, True, True, 'source1', 'comment1')]}
        self.sources_list.modify('file1', 0, enabled=False, source='source2', comment='comment2')
        self.assertEqual(self.sources_list.files['file1'][0], (0, True, False, 'source2', 'comment2'))

    def test_add_valid_source(self):
        self.sources_list._add_valid_source('source1', 'comment1', 'file1')
        self.assertIn('file1', self.sources_list.files)
        self.assertIn('file1', self.sources_list.new_repos)
        self.assertEqual(self.sources_list.files['file1'][0], (0, True, True, 'source1', 'comment1'))

    def test_add_source(self):
        self.sources_list._parse = lambda x, raise_if_invalid_or_disabled: (None, None, 'source1')
        self.sources_list._suggest_filename = lambda x: 'file1'
        self.sources_list.add_source('line1', 'comment1')
        self.assertIn('file1', self.sources_list.files)
        self.assertEqual(self.sources_list.files['file1'][0], (0, True, True, 'source1', 'comment1'))

    def test_remove_valid_source(self):
        self.sources_list.files = {'file1': [(0, True, True, 'source1', 'comment1')]}
        self.sources_list._remove_valid_source('source1')
        self.assertEqual(self.sources_list.files['file1'], [])

    def test_remove_source(self):
        self.sources_list._parse = lambda x, raise_if_invalid_or_disabled: (None, None, 'source1')
        self.sources_list.files = {'file1': [(0, True, True, 'source1', 'comment1')]}
        self.sources_list.remove_source('line1')
        self.assertEqual(self.sources_list.files['file1'], [])

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

class TestSourcesList(unittest.TestCase):
    def setUp(self):
        self.module = None  # Mock or create a dummy AnsibleModule if needed
        self.sources_list = SourcesList(self.module)

    def test_init(self):
        self.assertIsNotNone(self.sources_list.module)
        self.assertIsInstance(self.sources_list.files, dict)
        self.assertIsInstance(self.sources_list.new_repos, set)
        self.assertIsInstance(self.sources_list.default_file, str)

    def test_modify(self):
        self.sources_list.files = {'file1': [(0, True, True, 'source1', 'comment1')]}
        self.sources_list.modify('file1', 0, enabled=False, source='source2', comment='comment2')
        self.assertEqual(self.sources_list.files['file1'][0], (0, True, False, 'source2', 'comment2'))

    def test_add_valid_source(self):
        self.sources_list.files = {}
        self.sources_list._add_valid_source('source1', 'comment1', 'file1')
        self.assertIn('file1', self.sources_list.files)
        self.assertIn('file1', self.sources_list.new_repos)
        self.assertEqual(self.sources_list.files['file1'][0], (0, True, True, 'source1', 'comment1'))

    def test_add_source(self):
        self.sources_list._parse = lambda x, raise_if_invalid_or_disabled: (None, None, 'source1')
        self.sources_list._suggest_filename = lambda x: 'file1'
        self.sources_list._add_valid_source = lambda source, comment, file: self.sources_list.files.update({file: [(0, True, True, source, comment)]})
        self.sources_list.add_source('line1', 'comment1')
        self.assertIn('file1', self.sources_list.files)
        self.assertEqual(self.sources_list.files['file1'][0], (0, True, True, 'source1', 'comment1'))

    def test_remove_valid_source(self):
        self.sources_list.files = {'file1': [(0, True, True, 'source1', 'comment1')]}
        self.sources_list._remove_valid_source('source1')
        self.assertEqual(self.sources_list.files['file1'], [])

    def test_remove_source(self):
        self.sources_list._parse = lambda x, raise_if_invalid_or_disabled: (None, None, 'source1')
        self.sources_list._remove_valid_source = lambda source: self.sources_list.files.update({'file1': []})
        self.sources_list.files = {'file1': [(0, True, True, 'source1', 'comment1')]}
        self.sources_list.remove_source('line1')
        self.assertEqual(self.sources_list.files['file1'], [])

    def test_private_methods(self):
        self.sources_list._apt_cfg_file = lambda x: 'default_file'
        self.sources_list._apt_cfg_dir = lambda x: 'default_dir'
        self.sources_list._expand_path = lambda x: 'expanded_path'
        self.sources_list._choice = lambda x, y: x if x is not None else y
        self.sources_list._parse = lambda x, raise_if_invalid_or_disabled: (None, None, 'source1')
        self.sources_list._suggest_filename = lambda x: 'file1'

        self.assertEqual(self.sources_list._apt_cfg_file('test'), 'default_file')
        self.assertEqual(self.sources_list._apt_cfg_dir('test'), 'default_dir')
        self.assertEqual(self.sources_list._expand_path('test'), 'expanded_path')
        self.assertEqual(self.sources_list._choice('choice1', 'choice2'), 'choice1')
        self.assertEqual(self.sources_list._parse('line1', True), (None, None, 'source1'))
        self.assertEqual(self.sources_list._suggest_filename('source1'), 'file1')

if __name__ == '__main__':
    unittest.main()