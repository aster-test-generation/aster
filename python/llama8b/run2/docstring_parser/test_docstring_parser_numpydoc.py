import unittest
from docstring_parser.numpydoc import NumpydocParser, Docstring, DocstringMeta, DocstringParam, DocstringRaises, DocstringReturns, Section, _KVSection, _SphinxSection, ParamSection, RaisesSection, ReturnsSection, YieldsSection, DeprecationSection


class TestNumpydocParser(unittest.TestCase):
    def test_init(self):
        parser = NumpydocParser()
        self.assertEqual(parser.sections, DEFAULT_SECTIONS)

    def test_add_section(self):
        parser = NumpydocParser()
        section = Section("Test", "test")
        parser.add_section(section)
        self.assertIn("Test", parser.sections)

    def test_parse(self):
        parser = NumpydocParser()
        text = """
        Parameters
        ----------
        a : int
            Description of a
        b : str
            Description of b

        Returns
        -------
        int
            Description of return
        """
        docstring = parser.parse(text)
        self.assertEqual(len(docstring.meta), 2)
        self.assertIsInstance(docstring.meta[0], DocstringParam)
        self.assertIsInstance(docstring.meta[1], DocstringReturns)

    def test_parse_with_deprecation(self):
        parser = NumpydocParser()
        text = """
        .. deprecated:: 1.0
            Description of deprecation
        """
        docstring = parser.parse(text)
        self.assertIsInstance(docstring.meta[0], DocstringDeprecated)

    def test_parse_with_raises(self):
        parser = NumpydocParser()
        text = """
        Raises
        ------
        ValueError
            Description of ValueError
        """
        docstring = parser.parse(text)
        self.assertIsInstance(docstring.meta[0], DocstringRaises)

    def test_parse_with_yields(self):
        parser = NumpydocParser()
        text = """
        Yields
        ------
        int
            Description of yield
        """
        docstring = parser.parse(text)
        self.assertIsInstance(docstring.meta[0], DocstringReturns)

    def test_parse_with_sections(self):
        parser = NumpydocParser()
        text = """
        Parameters
        ----------
        a : int
            Description of a
        b : str
            Description of b

        Returns
        -------
        int
            Description of return

        Examples
        --------
        >>> example
        """
        docstring = parser.parse(text)
        self.assertEqual(len(docstring.meta), 2)
        self.assertIsInstance(docstring.meta[0], DocstringParam)
        self.assertIsInstance(docstring.meta[1], DocstringReturns)
        self.assertEqual(len(docstring.meta), 3)
        self.assertIsInstance(docstring.meta[2], DocstringMeta)

    def test_parse_with_multiple_sections(self):
        parser = NumpydocParser()
        text = """
        Parameters
        ----------
        a : int
            Description of a
        b : str
            Description of b

        Returns
        -------
        int
            Description of return

        Raises
        ------
        ValueError
            Description of ValueError

        Examples
        --------
        >>> example
        """
        docstring = parser.parse(text)
        self.assertEqual(len(docstring.meta), 3)
        self.assertIsInstance(docstring.meta[0], DocstringParam)
        self.assertIsInstance(docstring.meta[1], DocstringReturns)
        self.assertIsInstance(docstring.meta[2], DocstringRaises)

    def test_parse_with_empty_text(self):
        parser = NumpydocParser()
        text = ""
        docstring = parser.parse(text)
        self.assertEqual(len(docstring.meta), 0)

    def test_parse_with_invalid_text(self):
        parser = NumpydocParser()
        text = "Invalid text"
        with self.assertRaises(ValueError):
            parser.parse(text)

if __name__ == '__main__':
    unittest.main()