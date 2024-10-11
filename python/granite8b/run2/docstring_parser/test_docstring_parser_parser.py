from docstring_parser.parser import ParseError
import unittest
from docstring_parser.parser import parse


class TestDocstringParser(unittest.TestCase):
    def test_parse_with_style(self):
        docstring = """This is a docstring with a style.

Parameters:
    param1 (int): The first parameter.
    param2 (str): The second parameter.

Returns:
    str: The parsed docstring.
"""
        parsed_docstring = parse(docstring, style='numpy')
        self.assertEqual(parsed_docstring.params['param1'].arg_type, 'int')
        self.assertEqual(parsed_docstring.params['param2'].arg_type, 'str')
        self.assertEqual(parsed_docstring.returns.type_name, 'str')

    def test_parse_with_auto_style(self):
        docstring = """This is a docstring with a style.

Parameters:
    param1 (int): The first parameter.
    param2 (str): The second parameter.

Returns:
    str: The parsed docstring.
"""
        parsed_docstring = parse(docstring, style='numpy')
        self.assertEqual(parsed_docstring.params['param1'].arg_type, 'int')
        self.assertEqual(parsed_docstring.params['param2'].arg_type, 'str')
        self.assertEqual(parsed_docstring.returns.type_name, 'str')

    def test_parse_with_invalid_style(self):
        docstring = """This is a docstring with a style.

Parameters:
    param1 (int): The first parameter.
    param2 (str): The second parameter.

Returns:
    str: The parsed docstring.
"""
        with self.assertRaises(ParseError):
            parse(docstring, style='numpy')

class TestDocstringParser(unittest.TestCase):
    def test_parse_auto_style(self):
        docstring = """
        This is a docstring.

        Args:
            param1 (int): The first parameter.
            param2 (str): The second parameter.

        Returns:
            str: The parsed docstring.
        """
        result = parse(docstring)
        self.assertEqual(result.short_description, "This is a docstring.")
        self.assertEqual(result.params["param1"].arg_type, "int")
        self.assertEqual(result.params["param2"].arg_type, "str")
        self.assertEqual(result.returns.arg_type, "str")

    def test_parse_specific_style(self):
        docstring = """
        This is a docstring.

        Args:
            param1 (int): The first parameter.
            param2 (str): The second parameter.

        Returns:
            str: The parsed docstring.
        """
        result = parse(docstring, style="numpy")
        self.assertEqual(result.short_description, "This is a docstring.")
        self.assertEqual(result.params["param1"].arg_type, "int")
        self.assertEqual(result.params["param2"].arg_type, "str")
        self.assertEqual(result.returns.arg_type, "str")

    def test_parse_invalid_style(self):
        docstring = """
        This is a docstring.

        Args:
            param1 (int): The first parameter.
            param2 (str): The second parameter.

        Returns:
            str: The parsed docstring.
        """
        with self.assertRaises(ParseError):
            parse(docstring, style="invalid_style")

if __name__ == '__main__':
    unittest.main()