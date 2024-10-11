import unittest
import collections
import os
from pytutils.env import expand, parse_env_file_contents, load_env_file

class TestExpandFunction(unittest.TestCase):
    def test_expand_with_env_var(self):
        os.environ['TEST_VAR'] = 'test_value'
        result = expand('$TEST_VAR')
        self.assertEqual(result, 'test_value')

    def test_expand_with_user_home(self):
        result = expand('~')
        self.assertEqual(result, os.path.expanduser('~'))

class TestParseEnvFileContentsFunction(unittest.TestCase):
    def test_parse_env_file_contents_single_line(self):
        lines = ["KEY=value"]
        result = list(parse_env_file_contents(lines))
        self.assertEqual(result, [("KEY", "value")])

    def test_parse_env_file_contents_single_quoted(self):
        lines = ["KEY='value'"]
        result = list(parse_env_file_contents(lines))
        self.assertEqual(result, [("KEY", "value")])

    def test_parse_env_file_contents_double_quoted(self):
        lines = ['KEY="value"']
        result = list(parse_env_file_contents(lines))
        self.assertEqual(result, [("KEY", "value")])

    def test_parse_env_file_contents_escaped_double_quoted(self):
        lines = ['KEY="val\\\"ue"']
        result = list(parse_env_file_contents(lines))
        self.assertEqual(result, [("KEY", 'val"ue')])

class TestLoadEnvFileFunction(unittest.TestCase):
    def test_load_env_file(self):
        lines = ["KEY=value"]
        result = load_env_file(lines)
        self.assertEqual(result, collections.OrderedDict([("KEY", "value")]))
        self.assertEqual(os.environ["KEY"], "value")

    def test_load_env_file_with_expansion(self):
        os.environ['TEST_VAR'] = 'test_value'
        lines = ["KEY=$TEST_VAR"]
        result = load_env_file(lines)
        self.assertEqual(result, collections.OrderedDict([("KEY", "test_value")]))
        self.assertEqual(os.environ["KEY"], "test_value")

    def test_load_env_file_no_write_environ(self):
        lines = ["KEY=value"]
        result = load_env_file(lines, write_environ=None)
        self.assertEqual(result, collections.OrderedDict([("KEY", "value")]))
        self.assertIn("KEY", os.environ)

if __name__ == '__main__':
    unittest.main()