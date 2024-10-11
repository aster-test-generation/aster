import os
import unittest
from pytutils.env import expand, parse_env_file_contents, load_env_file


class TestExpand(unittest.TestCase):
    def test_expand(self):
        result = expand("${USER}")
        self.assertEqual(result, os.environ["USER"])

    def test_expand_with_spaces(self):
        result = expand("${USER} ${HOME}")
        self.assertEqual(result, f"{os.environ['USER']} {os.environ['HOME']}")

class TestParseEnvFileContents(unittest.TestCase):
    def test_parse_env_file_contents(self):
        lines = ["FOO=bar", "BAZ='hello world'", "QUX=\"hello\\ world\""]
        expected = [("FOO", "bar"), ("BAZ", "hello world"), ("QUX", "hello world")]
        self.assertEqual(list(parse_env_file_contents(lines)), expected)

    def test_parse_env_file_contents_with_empty_lines(self):
        lines = ["", "FOO=bar", "BAZ='hello world'", "QUX=\"hello\\ world\""]
        expected = [("FOO", "bar"), ("BAZ", "hello world"), ("QUX", "hello world")]
        self.assertEqual(list(parse_env_file_contents(lines)), expected)

class TestLoadEnvFile(unittest.TestCase):
    def test_load_env_file(self):
        lines = ["FOO=bar", "BAZ='hello world'", "QUX=\"hello\\ world\""]
        changes = load_env_file(lines)
        self.assertEqual(changes, {"FOO": "bar", "BAZ": "hello world", "QUX": "hello world"})

    def test_load_env_file_with_write_environ(self):
        lines = ["FOO=bar", "BAZ='hello world'", "QUX=\"hello\\ world\""]
        changes = load_env_file(lines, write_environ={"FOO": "old_value"})
        self.assertEqual(changes, {"FOO": "bar", "BAZ": "hello world", "QUX": "hello world"})
        self.assertEqual(os.environ["FOO"], "bar")

if __name__ == '__main__':
    unittest.main()