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
        result = list(iter(self.sources_list))
        self.assertEqual(result, [
            ('file1', 0, True, 'deb http://example.com/ubuntu bionic main', ''),
            ('file2', 1, True, 'deb http://example.com/ubuntu focal main', '')
        ])

    def test_expand_path(self):
        result = self.sources_list._expand_path('filename')
        expected = os.path.abspath(os.path.join(self.sources_list._apt_cfg_dir('Dir::Etc::sourceparts'), 'filename'))
        self.assertEqual(result, expected)

    def test_suggest_filename(self):
        line = 'deb http://example.com/ubuntu bionic main'
        result = self.sources_list._suggest_filename(line)
        self.assertEqual(result, 'example_com_ubuntu.list')

    def test_parse_valid(self):
        line = 'deb http://example.com/ubuntu bionic main'
        result = self.sources_list._parse(line)
        self.assertEqual(result, (True, True, 'deb http://example.com/ubuntu bionic main', ''))

    def test_parse_invalid(self):
        line = '# deb http://example.com/ubuntu bionic main'
        result = self.sources_list._parse(line)
        self.assertEqual(result, (False, False, '', 'deb http://example.com/ubuntu bionic main'))

    def test_parse_raise_if_invalid_or_disabled(self):
        line = '# deb http://example.com/ubuntu bionic main'
        with self.assertRaises(InvalidSource):
            self.sources_list._parse(line, raise_if_invalid_or_disabled=True)

    def test_apt_cfg_file(self):
        result = self.sources_list._apt_cfg_file('Dir::Etc::sourcelist')
        self.assertIsInstance(result, str)

if __name__ == '__main__':
    unittest.main()