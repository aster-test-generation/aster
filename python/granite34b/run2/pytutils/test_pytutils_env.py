import unittest
import os
import re
import typing
import collections
from pytutils.env import expand, parse_env_file_contents, load_env_file


class TestExpand(unittest.TestCase):
    def test_expand_user(self):
        result = expand("~")
        self.assertEqual(result, os.path.expanduser("~"))

    def test_expand_vars(self):
        result = expand("$HOME")
        self.assertEqual(result, os.path.expandvars("$HOME"))

class TestParseEnvFileContents(unittest.TestCase):
    def test_parse_env_file_contents(self):
        lines = ["key=value", "key2=value2"]
        result = list(parse_env_file_contents(lines))
        self.assertEqual(result, [("key", "value"), ("key2", "value2")])

class TestLoadEnvFile(unittest.TestCase):
    def test_load_env_file(self):
        lines = ["key=value", "key2=value2"]
        result = load_env_file(lines)
        self.assertEqual(result, collections.OrderedDict([("key", "value"), ("key2", "value2")]))

if __name__ == '__main__':
    unittest.main()