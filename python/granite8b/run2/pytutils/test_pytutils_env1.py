import os
import re
import typing
import unittest
from pytutils.env import expand, parse_env_file_contents, load_env_file

class TestExpand(unittest.TestCase):
    def test_expand(self):
        os.environ['HOME'] = '/home/user'
        self.assertEqual(expand('$HOME'), '/home/user')
        self.assertEqual(expand('~/Documents'), '/home/user/Documents')

class TestParseEnvFileContents(unittest.TestCase):
    def test_parse_env_file_contents(self):
        lines = [
            'VAR1=value1',
            'VAR2="value2"',
            "VAR3='value3'",
            'VAR4=value4',
            'VAR5="value5 with spaces"',
            "VAR6='value6 with spaces'",
        ]
        expected = {
            'VAR1': 'value1',
            'VAR2': 'value2',
            'VAR3': 'value3',
            'VAR4': 'value4',
            'VAR5': 'value5 with spaces',
            'VAR6': 'value6 with spaces',
        }
        actual = dict(parse_env_file_contents(lines))
        self.assertEqual(actual, expected)

class TestLoadEnvFile(unittest.TestCase):
    def test_load_env_file(self):
        lines = [
            'VAR1=value1',
            'VAR2="value2"',
            "VAR3='value3'",
            'VAR4=value4',
            'VAR5="value5 with spaces"',
            "VAR6='value6 with spaces'",
        ]
        os.environ.pop('VAR1', None)
        os.environ.pop('VAR2', None)
        os.environ.pop('VAR3', None)
        os.environ.pop('VAR4', None)
        os.environ.pop('VAR5', None)
        os.environ.pop('VAR6', None)
        expected = {
            'VAR1': 'value1',
            'VAR2': 'value2',
            'VAR3': 'value3',
            'VAR4': 'value4',
            'VAR5': 'value5 with spaces',
            'VAR6': 'value6 with spaces',
        }
        actual = load_env_file(lines)
        self.assertEqual(actual, expected)
        self.assertEqual(os.environ['VAR1'], 'value1')
        self.assertEqual(os.environ['VAR2'], 'value2')
        self.assertEqual(os.environ['VAR3'], 'value3')
        self.assertEqual(os.environ['VAR4'], 'value4')
        self.assertEqual(os.environ['VAR5'], 'value5 with spaces')
        self.assertEqual(os.environ['VAR6'], 'value6 with spaces')

if __name__ == '__main__':
    unittest.main()