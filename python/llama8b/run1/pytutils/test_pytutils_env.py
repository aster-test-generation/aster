import os
import unittest
from pytutils.env import expand, parse_env_file_contents, load_env_file


class TestExpand(unittest.TestCase):
    def test_expand(self):
        result = expand("${USER}")
        self.assertEqual(result, os.environ['USER'])

    def test_expand_multiple(self):
        result = expand("${USER}_test${PATH}")
        self.assertEqual(result, f"{os.environ['USER']}_test{os.environ['PATH']}")

class TestParseEnvFileContents(unittest.TestCase):
    def test_parse_env_file_contents(self):
        lines = ["FOO=bar", "BAZ='hello world'", "QUX=\"hello\\ world\""]
        result = list(parse_env_file_contents(lines))
        self.assertEqual(result, [("FOO", "bar"), ("BAZ", "hello world"), ("QUX", "hello world")])

    def test_parse_env_file_contents_empty(self):
        lines = []
        result = list(parse_env_file_contents(lines))
        self.assertEqual(result, [])

class TestLoadEnvFile(unittest.TestCase):
    def test_load_env_file(self):
        lines = ["FOO=bar", "BAZ=hello world"]
        result = load_env_file(lines)
        self.assertEqual(result, {"FOO": "bar", "BAZ": "hello world"})

    def test_load_env_file_write_environ(self):
        lines = ["FOO=bar", "BAZ=hello world"]
        write_environ = {}
        result = load_env_file(lines, write_environ)
        self.assertEqual(result, {"FOO": "bar", "BAZ": "hello world"})
        self.assertEqual(write_environ, {"FOO": "bar", "BAZ": "hello world"})

    def test_load_env_file_empty_lines(self):
        lines = []
        result = load_env_file(lines)
        self.assertEqual(result, {})

if __name__ == '__main__':
    unittest.main()