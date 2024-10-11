import unittest
from docstring_parser.rest import parse


class TestDocstringParserRest(unittest.TestCase):
    def test_parse_short_description(self):
        docstring = "This is a short description."
        expected_short_description = "This is a short description."
        parsed_docstring = parse(docstring)
        self.assertEqual(parsed_docstring.short_description, expected_short_description)

    def test_parse_long_description(self):
        docstring = "This is a short description.\n\nThis is a long description."
        expected_long_description = "This is a long description."
        parsed_docstring = parse(docstring)
        self.assertEqual(parsed_docstring.long_description, expected_long_description)

    def test_parse_meta_info(self):
        docstring = ":param x: This is a parameter.\n:return: This is a return value."
        expected_meta_info = [
            DocstringParam(name="param", type="x", description="This is a parameter."),
            DocstringReturns(args=["return"], description="This is a return value."),
        ]
        parsed_docstring = parse(docstring)
        self.assertEqual(parsed_docstring.meta, expected_meta_info)

    def test_parse_private_method(self):
        docstring = ":param x: This is a parameter.\n:return: This is a return value."
        expected_meta_info = [
            DocstringParam(name="param", type="x", description="This is a parameter."),
            DocstringReturns(args=["return"], description="This is a return value."),
        ]
        parsed_docstring = parse(docstring)
        self.assertEqual(parsed_docstring.meta, expected_meta_info)

    def test_parse_protected_method(self):
        docstring = ":param x: This is a parameter.\n:return: This is a return value."
        expected_meta_info = [
            DocstringParam(name="param", type="x", description="This is a parameter."),
            DocstringReturns(args=["return"], description="This is a return value."),
        ]
        parsed_docstring = parse(docstring)
        self.assertEqual(parsed_docstring.meta, expected_meta_info)

    def test_parse_magic_method(self):
        docstring = ":param x: This is a parameter.\n:return: This is a return value."
        expected_meta_info = [
            DocstringParam(name="param", type="x", description="This is a parameter."),
            DocstringReturns(args=["return"], description="This is a return value."),
        ]
        parsed_docstring = parse(docstring)
        self.assertEqual(parsed_docstring.meta, expected_meta_info)

if __name__ == '__main__':
    unittest.main()