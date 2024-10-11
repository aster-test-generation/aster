import unittest
from ansible.modules.apt_repository import SourcesList
from ansible.module_utils.basic import AnsibleModule
import os
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
            'file1': [(0, True, True, 'deb http://example.com/ubuntu bionic main', '')],
            'file2': [(1, True, True, 'deb http://example.com/ubuntu focal main', '')]
        }
        result = list(self.sources_list.__iter__())
        self.assertEqual(result, [
            ('file1', 0, True, 'deb http://example.com/ubuntu bionic main', ''),
            ('file2', 1, True, 'deb http://example.com/ubuntu focal main', '')
        ])

    def test_expand_path_with_slash(self):
        result = self.sources_list._expand_path('/etc/apt/sources.list')
        self.assertEqual(result, '/etc/apt/sources.list')

    def test_expand_path_without_slash(self):
        self.sources_list._apt_cfg_dir = lambda x: '/etc/apt/sources.list.d'
        result = self.sources_list._expand_path('example.list')
        self.assertEqual(result, '/etc/apt/sources.list.d/example.list')

    def test_suggest_filename(self):
        self.sources_list.module.params['filename'] = None
        result = self.sources_list._suggest_filename('deb http://example.com/ubuntu bionic main')
        self.assertEqual(result, 'example_com_ubuntu.list')

    def test_parse_valid_source(self):
        line = 'deb http://example.com/ubuntu bionic main'
        result = self.sources_list._parse(line)
        self.assertEqual(result, (True, True, 'deb http://example.com/ubuntu bionic main', ''))

    def test_parse_invalid_source(self):
        line = 'invalid http://example.com/ubuntu bionic main'
        result = self.sources_list._parse(line)
        self.assertEqual(result, (False, True, '', ''))

    def test_parse_with_comment(self):
        line = 'deb http://example.com/ubuntu bionic main # comment'
        result = self.sources_list._parse(line)
        self.assertEqual(result, (True, True, 'deb http://example.com/ubuntu bionic main', 'comment'))

    def test_parse_disabled_source(self):
        line = '# deb http://example.com/ubuntu bionic main'
        result = self.sources_list._parse(line)
        self.assertEqual(result, (True, False, 'deb http://example.com/ubuntu bionic main', ''))

    def test_parse_raise_if_invalid_or_disabled(self):
        line = 'invalid http://example.com/ubuntu bionic main'
        with self.assertRaises(InvalidSource):
            self.sources_list._parse(line, raise_if_invalid_or_disabled=True)

    def test_apt_cfg_file(self):
        apt_pkg.config.find_file = lambda x: '/etc/apt/sources.list'
        result = self.sources_list._apt_cfg_file('Dir::Etc::sourcelist')
        self.assertEqual(result, '/etc/apt/sources.list')

if __name__ == '__main__':
    unittest.main()