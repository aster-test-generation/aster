import unittest
from docstring_parser.rest import *

class TestParse(unittest.TestCase):
    def test_parse(self):
        text = "Test"
        result = parse(text)
        self.assertIsInstance(result, Docstring)

class TestBuildMeta(unittest.TestCase):
    def test_build_meta(self):
        args = ["Test"]
        desc = "Test"
        result = _build_meta(args, desc)
        self.assertIsInstance(result, DocstringMeta)

if __name__ == '__main__':
    unittest.main()