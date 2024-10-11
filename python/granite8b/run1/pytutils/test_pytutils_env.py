import os
import unittest
from pytutils.env import expand, parse_env_file_contents, load_env_file


class TestExpand(unittest.TestCase):
    def test_expand_with_vars(self):
        os.environ['TEST_VAR'] = 'test_value'
        result = expand('$TEST_VAR')
        self.assertEqual(result, 'test_value')

    def test_expand_with_user(self):
        result = expand('~/test_dir')
        self.assertEqual(result, os.path.expanduser('~/test_dir'))

class TestParseEnvFileContents(unittest.TestCase):
    def test_parse_env_file_contents_with_single_line(self):
        lines = ['TEST_KEY=test_value']
        result = list(parse_env_file_contents(lines))
        self.assertEqual(result, [('TEST_KEY', 'test_value')])

    def test_parse_env_file_contents_with_multiple_lines(self):
        lines = ['TEST_KEY_1=test_value_1', 'TEST_KEY_2=test_value_2']
        result = list(parse_env_file_contents(lines))
        self.assertEqual(result, [('TEST_KEY_1', 'test_value_1'), ('TEST_KEY_2', 'test_value_2')])

    def test_parse_env_file_contents_with_quotes(self):
        lines = ['TEST_KEY="test value"']
        result = list(parse_env_file_contents(lines))
        self.assertEqual(result, [('TEST_KEY', 'test value')])

    def test_parse_env_file_contents_with_escaped_quotes(self):
        lines = ['TEST_KEY="test \"value\""']
        result = list(parse_env_file_contents(lines))
        self.assertEqual(result, [('TEST_KEY', 'test "value"')])

class TestLoadEnvFile(unittest.TestCase):
    def test_load_env_file_with_single_line(self):
        lines = ['TEST_KEY=test_value']
        result = load_env_file(lines)
        self.assertEqual(result, {'TEST_KEY': 'test_value'})

    def test_load_env_file_with_multiple_lines(self):
        lines = ['TEST_KEY_1=test_value_1', 'TEST_KEY_2=test_value_2']
        result = load_env_file(lines)
        self.assertEqual(result, {'TEST_KEY_1': 'test_value_1', 'TEST_KEY_2': 'test_value_2'})

    def test_load_env_file_with_quotes(self):
        lines = ['TEST_KEY="test value"']
        result = load_env_file(lines)
        self.assertEqual(result, {'TEST_KEY': 'test value'})

    def test_load_env_file_with_escaped_quotes(self):
        lines = ['TEST_KEY="test \"value\""']
        result = load_env_file(lines)
        self.assertEqual(result, {'TEST_KEY': 'test "value"'})

if __name__ == '__main__':
    unittest.main()