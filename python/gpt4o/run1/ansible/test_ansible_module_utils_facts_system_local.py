import unittest
from unittest.mock import Mock, patch
from ansible.module_utils.facts.system.local import LocalFactCollector
import os
import glob
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
        module = Mock()
        module.params = {'fact_path': None}
        result = self.collector.collect(module=module)
        self.assertEqual(result, {'local': {}})

    @patch('os.path.exists', return_value=True)
    @patch('glob.glob', return_value=[])
    def test_collect_empty_fact_path(self, mock_glob, mock_exists):
        module = Mock()
        module.params = {'fact_path': '/fake/path'}
        result = self.collector.collect(module=module)
        self.assertEqual(result, {'local': {}})

    @patch('os.path.exists', return_value=True)
    @patch('glob.glob', return_value=['/fake/path/test.fact'])
    @patch('os.stat')
    @patch('ansible.module_utils.facts.utils.get_file_content', return_value='{}')
    def test_collect_fact_file(self, mock_get_file_content, mock_stat, mock_glob, mock_exists):
        mock_stat.return_value = Mock(st_mode=stat.S_IRUSR)
        module = Mock()
        module.params = {'fact_path': '/fake/path'}
        result = self.collector.collect(module=module)()
        self.assertEqual(result, {'local': {'test': {}}})

    @patch('os.path.exists', return_value=True)
    @patch('glob.glob', return_value=['/fake/path/test.fact'])
    @patch('os.stat')
    @patch('ansible.module_utils.facts.utils.get_file_content', return_value='{"key": "value"}')
    def test_collect_fact_file_with_content(self, mock_get_file_content, mock_stat, mock_glob, mock_exists):
        mock_stat.return_value = Mock(st_mode=stat.S_IRUSR)
        module = Mock()
        module.params = {'fact_path': '/fake/path'}
        result = self.collector.collect(module=module)
        self.assertEqual(result, {'local': {'test': {'key': 'value'}}})

    @patch('os.path.exists', return_value=True)
    @patch('glob.glob', return_value=['/fake/path/test.fact'])
    @patch('os.stat')
    @patch('ansible.module_utils.facts.utils.get_file_content', return_value='invalid json')
    def test_collect_invalid_json(self, mock_get_file_content, mock_stat, mock_glob, mock_exists):
        mock_stat.return_value = Mock(st_mode=stat.S_IRUSR)
        module = Mock()
        module.params = {'fact_path': '/fake/path'}
        with patch.object(module, 'warn') as mock_warn:
            result = self.collector.collect(module=module)
            self.assertIn('test', result['local'])
            self.assertTrue('error loading facts as JSON or ini' in result['local']['test'])
            mock_warn.assert_called()

    @patch('os.path.exists', return_value=True)
    @patch('glob.glob', return_value=['/fake/path/test.fact'])
    @patch('os.stat')
    @patch('ansible.module_utils.facts.utils.get_file_content', return_value='[section]\nkey=value')
    def test_collect_ini_file(self, mock_get_file_content, mock_stat, mock_glob, mock_exists):
        mock_stat.return_value = Mock(st_mode=stat.S_IRUSR)
        module = Mock()
        module.params = {'fact_path': '/fake/path'}
        result = self.collector.collect(module=module)()
        self.assertEqual(result, {'local': {'test': {'section': {'key': 'value'}}}})

    @patch('os.path.exists', return_value=True)
    @patch('glob.glob', return_value=['/fake/path/test.fact'])
    @patch('os.stat')
    def test_collect_executable_fact_file(self, mock_stat, mock_glob, mock_exists):
        mock_stat.return_value = Mock(st_mode=stat.S_IXUSR)
        module = Mock()
        module.params = {'fact_path': '/fake/path'}
        module.run_command = Mock(return_value=(0, '{"key": "value"}', ''))
        result = self.collector.collect(module=module)
        self.assertEqual(result, {'local': {'test': {'key': 'value'}}})

    @patch('os.path.exists', return_value=True)
    @patch('glob.glob', return_value=['/fake/path/test.fact'])
    @patch('os.stat')
    def test_collect_executable_fact_file_failure(self, mock_stat, mock_glob, mock_exists):
        mock_stat.return_value = Mock(st_mode=stat.S_IXUSR)
        module = Mock()
        module.params = {'fact_path': '/fake/path'}
        module.run_command = Mock(return_value=(1, '', 'error'))
        with patch.object(module, 'warn') as mock_warn:
            result = self.collector.collect(module=module)()
            self.assertIn('test', result['local'])
            self.assertTrue('Failure executing fact script' in result['local']['test'])
            mock_warn.assert_called()

if __name__ == '__main__':
    unittest.main()