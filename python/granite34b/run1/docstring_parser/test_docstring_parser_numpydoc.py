import unittest
from docstring_parser.numpydoc import NumpydocParser


class TestNumpydocParser(unittest.TestCase):
    def test_parse_short_description(self):
        text = """
        This is a short description.
        """
        expected = Docstring(short_description="This is a short description.")
        actual = NumpydocParser().parse(text)
        self.assertEqual(actual, expected)

    def test_parse_long_description(self):
        text = """
        This is a short description.

        This is a long description.
        """
        expected = Docstring(
            short_description="This is a short description.",
            long_description="This is a long description.",
        )
        actual = NumpydocParser().parse(text)
        self.assertEqual(actual, expected)

    def test_parse_blank_after_short_description(self):
        text = """
        This is a short description.

        This is a long description.
        """
        expected = Docstring(
            short_description="This is a short description.",
            blank_after_short_description=True,
            long_description="This is a long description.",
        )
        actual = NumpydocParser().parse(text)
        self.assertEqual(actual, expected)

    def test_parse_blank_after_long_description(self):
        text = """
        This is a short description.

        This is a long description.

        """
        expected = Docstring(
            short_description="This is a short description.",
            blank_after_long_description=True,
            long_description="This is a long description.",
        )
        actual = NumpydocParser().parse(text)
        self.assertEqual(actual, expected)

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

class TestNumpydocParser(unittest.TestCase):
    def test_parse_short_description(self):
        parser = NumpydocParser()
        docstring = parser.parse("This is a short description.")
        self.assertEqual(docstring.short_description, "This is a short description.")

    def test_parse_long_description(self):
        parser = NumpydocParser()
        docstring = parser.parse("This is a short description.\n\nThis is a long description.")
        self.assertEqual(docstring.long_description, "This is a long description.")

    def test_parse_meta_description(self):
        parser = NumpydocParser()
        docstring = parser.parse("This is a short description.\n\nThis is a meta description.")
        self.assertEqual(docstring.meta[0].description, "This is a meta description.")

    def test_parse_param_description(self):
        parser = NumpydocParser()
        docstring = parser.parse("This is a short description.\n\n:param x: This is a parameter description.")
        self.assertEqual(docstring.meta[0].description, "This is a parameter description.")

    def test_parse_raises_description(self):
        parser = NumpydocParser()
        docstring = parser.parse("This is a short description.\n\n:raises Exception: This is an exception description.")
        self.assertEqual(docstring.meta[0].description, "This is an exception description.")

    def test_parse_returns_description(self):
        parser = NumpydocParser()
        docstring = parser.parse("This is a short description.\n\n:returns: This is a return description.")
        self.assertEqual(docstring.meta[0].description, "This is a return description.")

    def test_parse_yields_description(self):
        parser = NumpydocParser()
        docstring = parser.parse("This is a short description.\n\n:yields: This is a yield description.")
        self.assertEqual(docstring.meta[0].description, "This is a yield description.")

    def test_parse_examples_description(self):
        parser = NumpydocParser()
        docstring = parser.parse("This is a short description.\n\n:examples: This is an example description.")
        self.assertEqual(docstring.meta[0].description, "This is an example description.")

    def test_parse_warnings_description(self):
        parser = NumpydocParser()
        docstring = parser.parse("This is a short description.\n\n:warnings: This is a warning description.")
        self.assertEqual(docstring.meta[0].description, "This is a warning description.")

    def test_parse_see_also_description(self):
        parser = NumpydocParser()
        docstring = parser.parse("This is a short description.\n\n:see_also: This is a see also description.")
        self.assertEqual(docstring.meta[0].description, "This is a see also description.")

    def test_parse_notes_description(self):
        parser = NumpydocParser()
        docstring = parser.parse("This is a short description.\n\n:notes: This is a notes description.")
        self.assertEqual(docstring.meta[0].description, "This is a notes description.")

    def test_parse_references_description(self):
        parser = NumpydocParser()
        docstring = parser.parse("This is a short description.\n\n:references: This is a references description.")
        self.assertEqual(docstring.meta[0].description, "This is a references description.")

    def test_parse_deprecation_description(self):
        parser = NumpydocParser()
        docstring = parser.parse("This is a short description.\n\n:deprecated: This is a deprecation description.")
        self.assertEqual(docstring.meta[0].description, "This is a deprecation description.")

if __name__ == '__main__':
    unittest.main()