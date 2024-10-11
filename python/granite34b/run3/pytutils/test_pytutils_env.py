import os
import unittest
from pytutils.env import expand, parse_env_file_contents, load_env_file


class TestExpand(unittest.TestCase):
    def test_expand_user(self):
        self.assertEqual(expand("~"), os.path.expanduser("~"))

    def test_expand_vars(self):
        self.assertEqual(expand("$HOME"), os.path.expandvars("$HOME"))

class TestParseEnvFileContents(unittest.TestCase):
    def test_parse_env_file_contents(self):
        lines = ["key=value", "key2=value2"]
        expected = {"key": "value", "key2": "value2"}
        result = dict(parse_env_file_contents(lines))
        self.assertEqual(result, expected)


if __name__ == '__main__':
    unittest.main()