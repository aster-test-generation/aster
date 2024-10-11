from docstring_parser.numpydoc import DEFAULT_SECTIONS
import unittest
from docstring_parser.numpydoc import NumpydocParser, Docstring, DocstringMeta, DocstringParam, DocstringRaises, DocstringReturns, DocstringDeprecated, Section, _KVSection, _SphinxSection, ParamSection, RaisesSection, ReturnsSection, YieldsSection, DeprecationSection


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
        x : int
            Description of x
        y : str
            Description of y

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

    def test_str_method(self):
        parser = NumpydocParser()
        self.assertEqual(str(parser), "NumpydocParser")

    def test_repr_method(self):
        parser = NumpydocParser()
        self.assertEqual(repr(parser), "NumpydocParser()")

    def test_eq_method(self):
        parser1 = NumpydocParser()
        parser2 = NumpydocParser()
        self.assertEqual(parser1, parser2)

if __name__ == '__main__':
    unittest.main()