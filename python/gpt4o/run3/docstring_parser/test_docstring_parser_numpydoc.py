import unittest
from docstring_parser.numpydoc import *


class TestPairwise(unittest.TestCase):
    def test_pairwise(self):
        result = list(pairwise([1, 2, 3], end=None))
        self.assertEqual(result, [(1, 2), (2, 3), (3, None)])

class TestCleanStr(unittest.TestCase):
    def test_clean_str(self):
        result = clean_str("  test string  ")
        self.assertEqual(result, "test string")

    def test_clean_str_empty(self):
        result = clean_str("  ")
        self.assertIsNone(result)

class TestSection(unittest.TestCase):
    def test_section_init(self):
        section = Section("Title", "key")
        self.assertEqual(section.title, "Title")
        self.assertEqual(section.key, "key")

    def test_section_title_pattern(self):
        section = Section("Title", "key")
        result = section.title_pattern
        self.assertEqual(result, r"^(Title)\s*?\n-----\s*$")

    def test_section_parse(self):
        section = Section("Title", "key")
        result = list(section.parse("Some text"))
        self.assertEqual(result[0].description, "Some text")

class TestKVSection(unittest.TestCase):
    def test_kvsection_parse(self):
        section = KVSection("Title", "key")
        section._parse_item = lambda key, value: DocstringMeta([key], description=value)
        result = list(section.parse("key1\nvalue1\nkey2\nvalue2"))
        self.assertEqual(result[0].description, "value1")
        self.assertEqual(result[1].description, "value2")

class TestSphinxSection(unittest.TestCase):
    def test_sphinxsection_title_pattern(self):
        section = SphinxSection("Title", "key")
        result = section.title_pattern
        self.assertEqual(result, r"^\.\.\s*(Title)\s*::")

class TestParamSection(unittest.TestCase):
    def test_paramsection_parse_item(self):
        section = ParamSection("Title", "param")
        result = section._parse_item("param1 : int", "default is 5")
        self.assertEqual(result.arg_name, "param1")
        self.assertEqual(result.type_name, "int")
        self.assertEqual(result.default, "5")

class TestRaisesSection(unittest.TestCase):
    def test_raisessection_parse_item(self):
        section = RaisesSection("Title", "raises")
        result = section._parse_item("ValueError", "Some error")
        self.assertEqual(result.type_name, "ValueError")
        self.assertEqual(result.description, "Some error")

class TestReturnsSection(unittest.TestCase):
    def test_returnssection_parse_item(self):
        section = ReturnsSection("Title", "returns")
        result = section._parse_item("int", "Some return value")
        self.assertEqual(result.type_name, "int")
        self.assertEqual(result.description, "Some return value")

class TestYieldsSection(unittest.TestCase):
    def test_yieldssection_parse_item(self):
        section = YieldsSection("Title", "yields")
        result = section._parse_item("int", "Some yield value")
        self.assertTrue(result.is_generator)
        self.assertEqual(result.type_name, "int")
        self.assertEqual(result.description, "Some yield value")

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
        section = Section("New Section", "new_section")
        parser.add_section(section)
        self.assertIn("New Section", parser.sections)

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
        self.assertEqual(result.meta[0].args[1], "param1")

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
        self.assertEqual(result.meta[0].args[1], "param1")

if __name__ == '__main__':
    unittest.main()