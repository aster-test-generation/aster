import unittest
from docstring_parser.parser import parse


class TestParse(unittest.TestCase):
    def test_parse_with_style(self):
        style = Style.numpy
        text = "This is a docstring"
        result = parse(text, style)
        self.assertEqual(result.text, text)
        self.assertEqual(result.style, style)

    def test_parse_with_auto_style(self):
        text = "This is a docstring"
        result = parse(text)
        self.assertEqual(result.text, 'Hello, World!')
        self.assertEqual(result.style, Style.google)

    def test_parse_with_invalid_style(self):
        style = "invalid_style"
        text = "This is a docstring"
        with self.assertRaises(NameError):
            parse(text, style)

    def test_parse_with_numpy_style(self):
        style = Style.numpy
        text = """
        This is a docstring

        Parameters
        ----------
        param1 : int
            Description of param1.
        param2 : str
            Description of param2.

        Returns
        -------
        int
            Description of the return value.
        """
        result = parse(text, style)
        self.assertEqual(result.params["param1"].arg_type, "int")
        self.assertEqual(result.params["param2"].arg_type, "str")
        self.assertEqual(result.returns.arg_type, "int")

    def test_parse_with_google_style(self):
        style = style.google
        text = """
        This is a docstring

        Args:
            param1 (int): Description of param1.
            param2 (str): Description of param2.

        Returns:
            int: Description of the return value.
        """
        result = parse(text, style)
        self.assertEqual(result.params["param1"].arg_type, "int")
        self.assertEqual(result.params["param2"].arg_type, "str")
        self.assertEqual(result.returns.arg_type, "int")

    def test_parse_with_google_style_and_default_values(self):
        style = style.google
        text = """
        This is a docstring

        Args:
            param1 (int, optional): Description of param1. Defaults to 0.
            param2 (str, optional): Description of param2. Defaults to "default".

        Returns:
            int: Description of the return value.
        """
        result = parse(text, style)
        self.assertEqual(result.params["param1"].arg_type, "int")
        self.assertEqual(result.params["param1"].default, 0)
        self.assertEqual(result.params["param2"].arg_type, "str")
        self.assertEqual(result.params["param2"].default, "default")
        self.assertEqual(result.returns.arg_type, "int")

    def test_parse_with_google_style_and_multiple_default_values(self):
        style = style.google
        text = """
        This is a docstring

        Args:
            param1 (int, optional): Description of param1. Defaults to 0.
            param2 (str, optional): Description of param2. Defaults to "default".
            param3 (list, optional): Description of param3. Defaults to [1, 2, 3].

        Returns:
            int: Description of the return value.
        """
        result = parse(text, style)
        self.assertEqual(result.params["param1"].arg_type, "int")
        self.assertEqual(result.params["param1"].default, 0)
        self.assertEqual(result.params["param2"].arg_type, "str")
        self.assertEqual(result.params["param2"].default, "default")
        self.assertEqual(result.params["param3"].arg_type, "list")
        self.assertEqual(result.params["param3"].default, [1, 2, 3])
        self.assertEqual(result.returns.arg_type, "int")

if __name__ == '__main__':
    unittest.main()