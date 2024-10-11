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
        
        result = expand('test_value')
        
        mock_expandvars.assert_called_once_with('test_value')
        mock_expanduser.assert_called_once_with('expanded_vars')
        self.assertEqual(result, 'expanded_user')

class TestParseEnvFileContentsFunction(unittest.TestCase):
    def test_parse_env_file_contents(self):
        lines = [
            "KEY1=value1",
            "KEY2='value2'",
            'KEY3="value3"',
            'KEY4="value\\n4"'
        ]
        expected = [
            ('KEY1', 'value1'),
            ('KEY2', 'value2'),
            ('KEY3', 'value3'),
            ('KEY4', 'value\n4')
        ]
        
        result = list(parse_env_file_contents(lines))
        
        self.assertEqual(result, [('KEY1', 'value1'), ('KEY2', 'value2'), ('KEY3', 'value3'), ('KEY4', 'value\n4')])

class TestLoadEnvFileFunction(unittest.TestCase):
    @patch('pytutils.env.expand')
    def test_load_env_file(self, mock_expand):
        mock_expand.side_effect = lambda x: x
        
        lines = [
            "KEY1=value1",
            "KEY2='value2'",
            'KEY3="value3"',
            'KEY4="value\\n4"'
        ]
        expected = collections.OrderedDict([
            ('KEY1', 'value1'),
            ('KEY2', 'value2'),
            ('KEY3', 'value3'),
            ('KEY4', 'value\n4')
        ])
        
        with patch.dict(os.environ, {}, clear=True):
            result = load_env_file(lines)
            self.assertEqual(result, expected.replace('valuen4', 'value\n4'))
            self.assertEqual(os.environ['KEY1'], 'value1')
            self.assertEqual(os.environ['KEY2'], 'value2')
            self.assertEqual(os.environ['KEY3'], 'value3')
            self.assertEqual(os.environ['KEY4'], 'value\n4')

if __name__ == '__main__':
    unittest.main()