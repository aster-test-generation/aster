import unittest
from docstring_parser.numpydoc import NumpydocParser


class TestNumpydocParser(unittest.TestCase):
    def test_parse_method(self):
        parser = NumpydocParser()
        docstring = parser.parse("This is a test docstring")
        self.assertEqual(docstring.short_description, "This is a test docstring")

    def test_parse_private_method(self):
        parser = NumpydocParser()
        docstring = parser.parse("This is a test docstring")
        self.assertEqual(docstring._NumpydocParser__parse_method("private_method"), "private_method")

    def test_parse_protected_method(self):
        parser = NumpydocParser()
        docstring = parser.parse("This is a test docstring")
        self.assertEqual(docstring._parse_protected_method("protected_method"), "protected_method")

    def test_parse_magic_method(self):
        parser = NumpydocParser()
        docstring = parser.parse("This is a test docstring")
        self.assertEqual(docstring.__str__(), "This is a test docstring")

if __name__ == '__main__':
    unittest.main()