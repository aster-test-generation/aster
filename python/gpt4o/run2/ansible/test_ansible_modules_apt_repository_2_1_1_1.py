import unittest
from ansible.modules.apt_repository import SourcesList
from ansible.module_utils.basic import AnsibleModule
import os
import glob
import re


class TestSourcesList(unittest.TestCase):
    def setUp(self):
        self.module = AnsibleModule(argument_spec={})
        self.sources_list = SourcesList(self.module)

    def test_init(self):
        self.assertIsInstance(self.sources_list, SourcesList)
        self.assertEqual(self.sources_list.module, self.module)
        self.assertIsInstance(self.sources_list.files, dict)
        self.assertIsInstance(self.sources_list.new_repos, set)

    def test_iter(self):
        self.sources_list.files = {
            'file1': [(0, True, True, 'deb http://example.com/repo', 'comment')],
            'file2': [(1, True, False, 'deb-src http://example.com/repo', 'comment')]
        }
        result = list(self.sources_list.__iter__())
        self.assertEqual(result, [('file1', 0, True, 'deb http://example.com/repo', 'comment')])

    def test_expand_path_with_slash(self):
        result = self.sources_list._expand_path('/path/to/file')
        self.assertEqual(result, '/path/to/file')

    def test_expand_path_without_slash(self):
        result = self.sources_list._expand_path('file')
        expected_path = os.path.abspath(os.path.join(self.sources_list._apt_cfg_dir('Dir::Etc::sourceparts'), 'file'))
        self.assertEqual(result, expected_path)

    def test_suggest_filename(self):
        line = 'deb http://example.com/repo'
        result = self.sources_list._suggest_filename(line)
        self.assertEqual(result, 'example_com_repo.list')

    def test_parse_valid_line(self):
        line = 'deb http://example.com/repo'
        result = self.sources_list._parse(line)
        self.assertEqual(result, (True, True, 'deb http://example.com/repo', ''))

    def test_parse_invalid_line(self):
        line = '# deb http://example.com/repo'
        result = self.sources_list._parse(line)
        self.assertEqual(result, (False, False, '', 'deb http://example.com/repo'))

    def test_parse_with_comment(self):
        line = 'deb http://example.com/repo # comment'
        result = self.sources_list._parse(line)
        self.assertEqual(result, (True, True, 'deb http://example.com/repo', 'comment'))

    def test_parse_raise_if_invalid_or_disabled(self):
        line = '# deb http://example.com/repo'
        with self.assertRaises(InvalidSource):
            self.sources_list._parse(line, raise_if_invalid_or_disabled=True)

    def test_apt_cfg_file(self):
        result = self.sources_list._apt_cfg_file('Dir::Etc::sourcelist')
        self.assertIsInstance(result, str)

    def test_cleanup_filename(self):
        line = 'deb http://example.com/repo'
        result = self.sources_list._suggest_filename(line)
        self.assertEqual(result, 'example_com_repo.list')

    def test_strip_username_password(self):
        line = 'deb http://user:pass@example.com/repo'
        result = self.sources_list._suggest_filename(line)
        self.assertEqual(result, 'example_com_repo.list')

if __name__ == '__main__':
    unittest.main()