import re
import os
import unittest
from pytutils.env import expand, parse_env_file_contents, load_env_file


class TestExpand(unittest.TestCase):
    def test_expand(self):
        result = expand("${HOME}/path/to/file")
        self.assertEqual(result, os.path.expanduser("/home/myeongsoo/path/to/file")

    def test_expand_no_vars(self):
        result = expand("path/to/file")
        self.assertEqual(result, "path/to/file")

class TestParseEnvFileContents(unittest.TestCase):
    def test_parse_env_file_contents(self):
        lines = ["KEY1=value1", "KEY2='value2'", "KEY3=\"value3\""]
        result = list(parse_env_file_contents(lines))
        self.assertEqual(result, [("KEY1", "value1"), ("KEY2", "value2"), ("KEY3", "value3")])

    def test_parse_env_file_contents_empty_lines(self):
        lines = ["", "KEY1=value1", "KEY2='value2'", "KEY3=\"value3\""]
        result = list(parse_env_file_contents(lines))
        self.assertEqual(result, [("KEY1", "value1"), ("KEY2", "value2"), ("KEY3", "value3")])

    def test_parse_env_file_contents_invalid_line(self):
        lines = ["KEY1=value1", "KEY2='value2'", "KEY3=invalid"]
        with self.assertRaises(SyntaxError)
            list(parse_env_file_contents(lines))

class TestLoadEnvFile(unittest.TestCase):
    def test_load_env_file(self):
        lines = ["KEY1=value1", "KEY2='value2'", "KEY3=\"value3\""]
        result = load_env_file(lines)
        self.assertEqual(result, {"KEY1": "value1", "KEY2": "value2", "KEY3": "value3"})

    def test_load_env_file_write_environ(self):
        lines = ["KEY1=value1", "KEY2='value2'", "KEY3=\"value3\""]
        environ = {}
        result = load_env_file(lines, environ)
        self.assertEqual(result, {"KEY1": "value1", "KEY2": "value2", "KEY3": "value3"})
        self.assertEqual(environ, {"KEY1": "value1", "KEY2": "value2", "KEY3": "value3"})

    def test_load_env_file_empty_lines(self):
        lines = ["", "KEY1=value1", "KEY2='value2'", "KEY3=\"value3\""]
        result = load_env_file(lines)
        self.assertEqual(result, {"KEY1": "value1", "KEY2": "value2", "KEY3": "value3"})

    def test_load_env_file_invalid_line(self):
        lines = ["KEY1=value1", "KEY2='value2'", "KEY3=invalid"]
        with self.assertRaises(Exception)
            load_env_file(lines)

if __name__ == '__main__':
    unittest.main()