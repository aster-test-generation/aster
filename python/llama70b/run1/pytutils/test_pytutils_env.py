import collections
import os
import unittest
from pytutils.env import expand, parse_env_file_contents, load_env_file


class TestExpandFunction(unittest.TestCase):
    def test_expand_function(self):
        result = expand("$HOME/test")
        self.assertEqual(result, "/home/myeongsoo/test"

class TestParseEnvFileContentsFunction(unittest.TestCase):
    def test_parse_env_file_contents_function(self):
        lines = ["KEY=VALUE", "FOO=BAR"]
        result = list(parse_env_file_contents(lines))
        self.assertEqual(result, [("KEY", "VALUE"), ("FOO", "BAR")])

class TestLoadEnvFileFunction(unittest.TestCase):
    def test_load_env_file_function(self):
        lines = ["KEY=VALUE", "FOO=BAR"]
        result = load_env_file(lines)
        self.assertIsInstance(result, collections.OrderedDict)
        self.assertEqual(result, {"KEY": "VALUE", "FOO": "BAR"})

if __name__ == '__main__':
    unittest.main()