import unittest
from docstring_parser.numpydoc import NumpydocParser

class TestNumpydocParser(unittest.TestCase):
    def test_parse_param_section(self):
        parser = NumpydocParser()
        text = """
        Parameters
        ----------
        x : int
            The first parameter.
        y : str
            The second parameter.
        """
        expected = [
            DocstringParam(
                args=["param", "x"],
                description="The first parameter.",
                arg_name="x",
                type_name="int",
                is_optional=False,
                default=None,
            ),
            DocstringParam(
                args=["param", "y"],
                description="The second parameter.",
                arg_name="y",
                type_name="str",
                is_optional=False,
                default=None,
            ),
        ]
        actual = list(parser.sections["Parameters"].parse(text))
        self.assertEqual(actual, expected)

    def test_parse_raises_section(self):
        parser = NumpydocParser()
        text = """
        Raises
        ------
        ValueError
            If the input is invalid.
        """
        expected = [
            DocstringRaises(
                args=["raises", "ValueError"],
                description="If the input is invalid.",
                type_name="ValueError",
            )
        ]
        actual = list(parser.sections["Raises"].parse(text))
        self.assertEqual(actual, expected)

    def test_parse_returns_section(self):
        parser = NumpydocParser()
        text = """
        Returns
        -------
        int
            The result of the operation.
        """
        expected = [
            DocstringReturns(
                args=["returns"],
                description="The result of the operation.",
                type_name="int",
                is_generator=False,
                return_name=None,
            )
        ]
        actual = list(parser.sections["Returns"].parse(text))
        self.assertEqual(actual, expected)

    def test_parse_yields_section(self):
        parser = NumpydocParser()
        text = """
        Yields
        ------
        int
            The next number in the sequence.
        """
        expected = [
            DocstringReturns(
                args=["yields"],
                description="The next number in the sequence.",
                type_name="int",
                is_generator=True,
                return_name=None,
            )
        ]
        actual = list(parser.sections["Yields"].parse(text))
        self.assertEqual(actual, expected)

    def test_parse_deprecation_section(self):
        parser = NumpydocParser()
        text = """
        Deprecated
        ----------
        1.0.0
            The old way of doing things is deprecated.
        """
        expected = [
            DocstringDeprecated(
                args=["deprecation"],
                description="The old way of doing things is deprecated.",
                version="1.0.0",
            )
        ]
        actual = list(parser.sections["Deprecated"].parse(text))
        self.assertEqual(actual, expected)

    def test_parse_examples_section(self):
        parser = NumpydocParser()
        text = """
        Examples
        --------
        >>> print("Hello, world!")
        Hello, world!
        """
        expected = [
            DocstringMeta(args=["examples"], description=">>> print(\"Hello, world!\")\nHello, world!")
        ]
        actual = list(parser.sections["Examples"].parse(text))
        self.assertEqual(actual, expected)

    def test_parse_see_also_section(self):
        parser = NumpydocParser()
        text = """
        See Also
        --------
        https://www.example.com
        """
        expected = [
            DocstringMeta(args=["see_also"], description="https://www.example.com")
        ]
        actual = list(parser.sections["See Also"].parse(text))
        self.assertEqual(actual, expected)

    def test_parse_notes_section(self):
        parser = NumpydocParser()
        text = """
        Notes
        -----
        This is a note.
        """
        expected = [
            DocstringMeta(args=["notes"], description="This is a note.")
        ]
        actual = list(parser.sections["Notes"].parse(text))
        self.assertEqual(actual, expected)

if __name__ == '__main__':
    unittest.main()