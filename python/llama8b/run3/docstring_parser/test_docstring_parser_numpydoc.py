import unittest
from docstring_parser import parse, DocstringParser, Docstring, DocstringMeta, DocstringParam, DocstringRaises, DocstringReturns, DocstringDeprecate
from docstring_parser.numpydoc import _pairwise, _clean_str, KV_REGEX, PARAM_KEY_REGEX, PARAM_OPTIONAL_REGEX, PARAM_DEFAULT_REGEX, RETURN_KEY_REGEX, Section, _KVSection, _SphinxSection, ParamSection, RaisesSection, ReturnsSection, YieldsSection, DeprecationSection, DEFAULT_SECTIONS


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
        param1 : int
            Description of param1
        param2 : str
            Description of param2

        Returns
        -------
        int
            Description of return
        """
        docstring = parser.parse(text)
        self.assertEqual(len(docstring.meta), 2)
        self.assertEqual(len(docstring.meta[0].args), 2)
        self.assertEqual(len(docstring.meta[1].args), 1)

    def test_parse_with_deprecation(self):
        parser = NumpydocParser()
        text = """
        .. deprecated:: 1.0
            Description of deprecation
        """
        docstring = parser.parse(text)
        self.assertEqual(len(docstring.meta), 1)
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
        self.assertEqual(len(docstring.meta), 1)
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
        self.assertEqual(len(docstring.meta), 1)
        self.assertIsInstance(docstring.meta[0], DocstringReturns)

    def test_parse_with_sections(self):
        parser = NumpydocParser()
        text = """
        Parameters
        ----------
        param1 : int
            Description of param1

        See Also
        --------
        See Also description
        """
        docstring = parser.parse(text)
        self.assertEqual(len(docstring.meta), 1)
        self.assertEqual(len(docstring.meta[0].args), 1)

    def test_pairwise(self):
        iterable = [1, 2, 3, 4, 5]
        end = None
        result = list(_pairwise(iterable, end))
        self.assertEqual(result, [(1, 2), (2, 3), (3, 4), (4, 5)])

    def test_clean_str(self):
        string = "   Hello, World!   "
        result = _clean_str(string)
        self.assertEqual(result, "Hello, World!")

    def test_kv_regex(self):
        text = "param1 : int\nparam2 : str"
        matches = KV_REGEX.finditer(text)
        self.assertEqual(len(list(matches)), 2)

    def test_param_key_regex(self):
        text = "param1 : int"
        match = PARAM_KEY_REGEX.match(text)
        self.assertEqual(match.group("name"), "param1")
        self.assertEqual(match.group("type"), "int")

    def test_param_optional_regex(self):
        text = "int, optional"
        match = PARAM_OPTIONAL_REGEX.match(text)
        self.assertEqual(match.group("type"), "int")

    def test_param_default_regex(self):
        text = "default is 1"
        match = PARAM_DEFAULT_REGEX.search(text)
        self.assertEqual(match.group("value"), "1")

    def test_return_key_regex(self):
        text = "return : int"
        match = RETURN_KEY_REGEX.match(text)
        self.assertEqual(match.group("name"), "return")
        self.assertEqual(match.group("type"), "int")

if __name__ == '__main__':
    unittest.main()