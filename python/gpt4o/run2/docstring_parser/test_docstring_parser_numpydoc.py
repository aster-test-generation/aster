import unittest
from docstring_parser.numpydoc import (
    _pairwise, _clean_str, Section, _KVSection, _SphinxSection, ParamSection,
    RaisesSection, ReturnsSection, YieldsSection, DeprecationSection, NumpydocParser, parse
)
from docstring_parser.common import (
    Docstring, DocstringMeta, DocstringParam, DocstringRaises, DocstringReturns, DocstringDeprecated
)


class TestPairwise(unittest.TestCase):
    def test_pairwise(self):
        result = list(_pairwise([1, 2, 3], end=None))
        self.assertEqual(result, [(1, 2), (2, 3), (3, None)])

class TestCleanStr(unittest.TestCase):
    def test_clean_str(self):
        result = _clean_str("  test  ")
        self.assertEqual(result, "test")

    def test_clean_str_empty(self):
        result = _clean_str("  ")
        self.assertIsNone(result)

class TestSection(unittest.TestCase):
    def test_section_init(self):
        section = Section("Title", "key")
        self.assertEqual(section.title, "Title")
        self.assertEqual(section.key, "key")

    def test_section_title_pattern(self):
        section = Section("Title", "key")
        self.assertEqual(section.title_pattern, r"^(Title)\s*?\n-----\s*$")

    def test_section_parse(self):
        section = Section("Title", "key")
        result = list(section.parse("Some text"))
        self.assertEqual(result[0].args, ["key"])
        self.assertEqual(result[0].description, "Some text")

class TestKVSection(unittest.TestCase):
    def test_kvsection_parse(self):
        section = _KVSection("Title", "key")
        section._parse_item = lambda key, value: DocstringMeta([key], description=value)
        result = list(section.parse("key1\nvalue1\nkey2\nvalue2"))
        self.assertEqual(result[0].args, ["key1"])
        self.assertEqual(result[0].description, '')
        self.assertEqual(result[1].args, ["key2"])
        self.assertEqual(result[1].description, "value2")

class TestSphinxSection(unittest.TestCase):
    def test_sphinxsection_title_pattern(self):
        section = _SphinxSection("Title", "key")
        self.assertEqual(section.title_pattern, r"^\.\.\s*(Title)\s*::")

class TestParamSection(unittest.TestCase):
    def test_paramsection_parse_item(self):
        section = ParamSection("Parameters", "param")
        result = section._parse_item("param1 : int", "default is 5")
        self.assertEqual(result.arg_name, "param1")
        self.assertEqual(result.type_name, "int")
        self.assertEqual(result.default, "5")

class TestRaisesSection(unittest.TestCase):
    def test_raisessection_parse_item(self):
        section = RaisesSection("Raises", "raises")
        result = section._parse_item("ValueError", "If the value is wrong")
        self.assertEqual(result.type_name, "ValueError")
        self.assertEqual(result.description, "If the value is wrong")

class TestReturnsSection(unittest.TestCase):
    def test_returnssection_parse_item(self):
        section = ReturnsSection("Returns", "returns")
        result = section._parse_item("int", "The result")
        self.assertEqual(result.type_name, "int")
        self.assertEqual(result.description, "The result")

class TestYieldsSection(unittest.TestCase):
    def test_yieldssection_parse_item(self):
        section = YieldsSection("Yields", "yields")
        result = section._parse_item("int", "The result")
        self.assertTrue(result.is_generator)

class TestDeprecationSection(unittest.TestCase):
    def test_deprecationsection_parse(self):
        section = DeprecationSection("deprecated", "deprecation")
        result = list(section.parse("1.0\nThis is deprecated"))
        self.assertEqual(result[0].version, "1.0")
        self.assertEqual(result[0].description, "This is deprecated")

class TestNumpydocParser(unittest.TestCase):
    def test_numpydocparser_init(self):
        parser = NumpydocParser()
        self.assertIn("Parameters", parser.sections)

    def test_numpydocparser_add_section(self):
        parser = NumpydocParser()
        section = Section("Custom", "custom")
        parser.add_section(section)
        self.assertIn("Custom", parser.sections)

    def test_numpydocparser_parse(self):
        parser = NumpydocParser()
        docstring = """
        Short description.

        Parameters
        ----------
        param1 : int
            Description of param1.
        """
        result = parser.parse(docstring)
        self.assertEqual(result.short_description, "Short description.")
        self.assertEqual(result.meta[0].arg_name, "param1")

class TestParseFunction(unittest.TestCase):
    def test_parse_function(self):
        docstring = """
        Short description.

        Parameters
        ----------
        param1 : int
            Description of param1.
        """
        result = parse(docstring)
        self.assertEqual(result.short_description, "Short description.")
        self.assertEqual(result.meta[0].arg_name, "param1")

if __name__ == '__main__':
    unittest.main()