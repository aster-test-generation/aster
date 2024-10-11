import collections
import os
import unittest
from pytutils.env import expand, parse_env_file_contents, load_env_file


class TestExpandFunction(unittest.TestCase):
    def test_expand(self):
        result = expand("$HOME/test")
        self.assertEqual(result, "/home/myeongsoo/test"

class TestParseEnvFileContentsFunction(unittest.TestCase):
    def test_parse_env_file_contents(self):
        lines = ["KEY=VALUE", "OTHER_KEY='OTHER_VALUE'", "THIRD_KEY=\"THIRD_VALUE\""]
        result = list(parse_env_file_contents(lines))
        self.assertEqual(result, [("KEY", "VALUE"), ("OTHER_KEY", "OTHER_VALUE"), ("THIRD_KEY", "THIRD_VALUE")])

class TestLoadEnvFileFunction(unittest.TestCase):
    def test_load_env_file(self):
        lines = ["KEY=VALUE", "OTHER_KEY='OTHER_VALUE'", "THIRD_KEY=\"THIRD_VALUE\""]
        result = load_env_file(lines)
        self.assertEqual(result, collections.OrderedDict([("KEY", "VALUE"), ("OTHER_KEY", "OTHER_VALUE"), ("THIRD_KEY", "THIRD_VALUE")]))

if __name__ == '__main__':
    unittest.main()