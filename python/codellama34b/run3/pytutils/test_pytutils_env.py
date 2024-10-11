import unittest
from pytutils.env import *


class TestExpand(unittest.TestCase):
    def test_expand(self):
        result = expand("test")
        self.assertEqual(result, "test")

class TestParseEnvFileContents(unittest.TestCase):
    def test_parse_env_file_contents(self):
        result = parse_env_file_contents(["test"])
        self.assertEqual(result, parse_env_file_contents(file_contents))

class TestLoadEnvFile(unittest.TestCase):
    def test_load_env_file(self):
        result = load_env_file(["test"])
        self.assertEqual(result, OrderedDict())

if __name__ == '__main__':
    unittest.main()