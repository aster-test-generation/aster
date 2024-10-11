import unittest
from pytutils.env import *


class TestExpand(unittest.TestCase):
    def test_expand(self):
        val = "test"
        result = expand(val)
        self.assertEqual(result, "test")

class TestParseEnvFileContents(unittest.TestCase):
    def test_parse_env_file_contents(self):
        lines = ["test"]
        result = parse_env_file_contents(lines)
        self.assertEqual(result, parse_env_file_contents(file_contents))

class TestLoadEnvFile(unittest.TestCase):
    def test_load_env_file(self):
        lines = ["test"]
        result = load_env_file(lines)
        self.assertEqual(result, OrderedDict())

if __name__ == '__main__':
    unittest.main()