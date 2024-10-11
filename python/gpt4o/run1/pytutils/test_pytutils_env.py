import unittest
import collections
import os
from unittest.mock import patch
from pytutils.env import expand, parse_env_file_contents, load_env_file


class TestExpandFunction(unittest.TestCase):
    @patch('os.path.expandvars')
    @patch('os.path.expanduser')
    def test_expand(self, mock_expanduser, mock_expandvars):
        mock_expandvars.return_value = 'expanded_vars'
        mock_expanduser.return_value = 'expanded_user'
        
        result = expand('test')
        
        mock_expandvars.assert_called_once_with('test')
        mock_expanduser.assert_called_once_with('expanded_vars')
        self.assertEqual(result, 'expanded_user')

class TestParseEnvFileContentsFunction(unittest.TestCase):
    def test_parse_env_file_contents_single_quotes(self):
        lines = ["KEY='value'"]
        result = list(parse_env_file_contents(lines))
        self.assertEqual(result, [('KEY', 'value')])

    def test_parse_env_file_contents_double_quotes(self):
        lines = ['KEY="value"']
        result = list(parse_env_file_contents(lines))
        self.assertEqual(result, [('KEY', 'value')])

    def test_parse_env_file_contents_no_quotes(self):
        lines = ["KEY=value"]
        result = list(parse_env_file_contents(lines))
        self.assertEqual(result, [('KEY', 'value')])

    def test_parse_env_file_contents_escaped_quotes(self):
        lines = ['KEY="val\\"ue"']
        result = list(parse_env_file_contents(lines))
        self.assertEqual(result, [('KEY', 'val"ue')])

class TestLoadEnvFileFunction(unittest.TestCase):
    @patch('pytutils.env.expand')
    def test_load_env_file(self, mock_expand):
        mock_expand.side_effect = lambda x: x
        lines = ["KEY=value"]
        write_environ = {}
        
        result = load_env_file(lines, write_environ)
        
        self.assertEqual(result, collections.OrderedDict([('KEY', 'value')]))
        self.assertEqual(write_environ, {'KEY': 'value'})

    @patch('pytutils.env.expand')
    def test_load_env_file_with_os_environ(self, mock_expand):
        mock_expand.side_effect = lambda x: x
        lines = ["KEY=value"]
        
        with patch.dict(os.environ, {}, clear=True):
            result = load_env_file(lines)
            self.assertEqual(result, collections.OrderedDict([('KEY', 'value')]))
            self.assertEqual(os.environ['KEY'], 'value')

if __name__ == '__main__':
    unittest.main()