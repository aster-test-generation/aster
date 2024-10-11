import unittest
from unittest.mock import MagicMock, patch, mock_open
from ansible.module_utils.facts.system.local import LocalFactCollector
import os
import stat
import json
from ansible.module_utils._text import to_text
from ansible.module_utils.facts.utils import get_file_content
from ansible.module_utils.six.moves import configparser, StringIO

class TestLocalFactCollector(unittest.TestCase):
    def setUp(self):
        self.collector = LocalFactCollector()

    def test_collect_no_module(self):
        result = self.collector.collect()
        self.assertEqual(result, {'local': {}})

    @patch('os.path.exists', return_value=False)
    def test_collect_no_fact_path(self, mock_exists):
        module = MagicMock()
        module.params = {'fact_path': None}
        result = self.collector.collect(module=module)
        self.assertEqual(result, {'local': {}})

    @patch('os.path.exists', return_value=True)
    @patch('glob.glob', return_value=[])
    def test_collect_empty_fact_path(self, mock_glob, mock_exists):
        module = MagicMock()
        module.params = {'fact_path': '/fake/path'}
        result = self.collector.collect(module=module)
        self.assertEqual(result, {'local': {}})

    @patch('os.path.exists', return_value=True)
    @patch('glob.glob', return_value=['/fake/path/test.fact'])
    @patch('os.stat')
    @patch('ansible.module_utils.facts.utils.get_file_content', return_value='{}')
    def test_collect_fact_file(self, mock_get_file_content, mock_stat, mock_glob, mock_exists):
        mock_stat.return_value = MagicMock(st_mode=stat.S_IRUSR)
        module = MagicMock()
        module.params = {'fact_path': '/fake/path'}
        result = self.collector.collect(module=module)
        self.assertEqual(result, {'local': {'test': {}}})

    @patch('os.path.exists', return_value=True)
    @patch('glob.glob', return_value=['/fake/path/test.fact'])
    @patch('os.stat')
    @patch('ansible.module_utils.facts.utils.get_file_content', return_value='{"key": "value"}')
    def test_collect_fact_file_with_content(self, mock_get_file_content, mock_stat, mock_glob, mock_exists):
        mock_stat.return_value = MagicMock(st_mode=stat.S_IRUSR)
        module = MagicMock()
        module.params = {'fact_path': '/fake/path'}
        result = self.collector.collect(module=module)
        self.assertEqual(result, {'local': {'test': {'key': 'value'}}})

    @patch('os.path.exists', return_value=True)
    @patch('glob.glob', return_value=['/fake/path/test.fact'])
    @patch('os.stat')
    @patch('ansible.module_utils.facts.utils.get_file_content', return_value='invalid json')
    def test_collect_invalid_json(self, mock_get_file_content, mock_stat, mock_glob, mock_exists):
        mock_stat.return_value = MagicMock(st_mode=stat.S_IRUSR)
        module = MagicMock()
        module.params = {'fact_path': '/fake/path'}
        with patch('ansible.module_utils.six.moves.configparser.ConfigParser.readfp', side_effect=configparser.Error):
            result = self.collector.collect(module=module)
            self.assertIn('test', result['local'])
            self.assertIn('error loading facts as JSON or ini', result['local']['test'])

    @patch('os.path.exists', return_value=True)
    @patch('glob.glob', return_value=['/fake/path/test.fact'])
    @patch('os.stat')
    @patch('ansible.module_utils.facts.utils.get_file_content', return_value='[section]\nkey=value')
    def test_collect_ini_file(self, mock_get_file_content, mock_stat, mock_glob, mock_exists):
        mock_stat.return_value = MagicMock(st_mode=stat.S_IRUSR)
        module = MagicMock()
        module.params = {'fact_path': '/fake/path'}
        result = self.collector.collect(module=module)
        self.assertEqual(result, {'local': {'test': {'section': {'key': 'value'}}}})

    @patch('os.path.exists', return_value=True)
    @patch('glob.glob', return_value=['/fake/path/test.fact'])
    @patch('os.stat')
    @patch('ansible.module_utils.facts.utils.get_file_content', return_value='invalid ini')
    def test_collect_invalid_ini(self, mock_get_file_content, mock_stat, mock_glob, mock_exists):
        mock_stat.return_value = MagicMock(st_mode=stat.S_IRUSR)
        module = MagicMock()
        module.params = {'fact_path': '/fake/path'}
        with patch('ansible.module_utils.six.moves.configparser.ConfigParser.readfp', side_effect=configparser.Error):
            result = self.collector.collect(module=module)
            self.assertIn('test', result['local'])
            self.assertIn('error loading facts as JSON or ini', result['local']['test'])

    @patch('os.path.exists', return_value=True)
    @patch('glob.glob', return_value=['/fake/path/test.fact'])
    @patch('os.stat')
    @patch('ansible.module_utils.facts.utils.get_file_content', return_value='{}')
    @patch('ansible.module_utils._text.to_text', side_effect=UnicodeError)
    def test_collect_unicode_error(self, mock_to_text, mock_get_file_content, mock_stat, mock_glob, mock_exists):
        mock_stat.return_value = MagicMock(st_mode=stat.S_IRUSR)
        module = MagicMock()
        module.params = {'fact_path': '/fake/path'}
        result = self.collector.collect(module=module)
        self.assertIn('test', result['local'])
        self.assertIn('error loading fact', result['local']['test'])

    @patch('os.path.exists', return_value=True)
    @patch('glob.glob', return_value=['/fake/path/test.fact'])
    @patch('os.stat')
    @patch('ansible.module_utils.facts.utils.get_file_content', return_value='{}')
    @patch('ansible.module_utils._text.to_text', side_effect=Exception)
    def test_collect_generic_exception(self, mock_to_text, mock_get_file_content, mock_stat, mock_glob, mock_exists):
        mock_stat.return_value = MagicMock(st_mode=stat.S_IRUSR)
        module = MagicMock()
        module.params = {'fact_path': '/fake/path'}
        result = self.collector.collect(module=module)
        self.assertIn('test', result['local'])
        self.assertIn('Failed to convert', result['local']['test'])

if __name__ == '__main__':
    unittest.main()