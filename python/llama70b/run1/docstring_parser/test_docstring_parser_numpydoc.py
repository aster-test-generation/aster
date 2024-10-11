import unittest
from docstring_parser.numpydoc import *


class TestSection(unittest.TestCase):
    def test_init(self):
        section = Section("title", "key")
        self.assertEqual(section.title, "title")
        self.assertEqual(section.key, "key")

    def test_title_pattern(self):
        section = Section("title", "key")
        self.assertEqual(section.title_pattern, r"^title\s*?\n-*$")

    def test_parse(self):
        section = Section("title", "key")
        text = "description"
        result = list(section.parse(text))
        self.assertEqual(len(result), 1)
        self.assertIsInstance(result[0], DocstringMeta)

class TestKVSection(unittest.TestCase):
    def test_parse(self):
        section = _KVSection("title", "key")
        text = "key: value\nkey2: value2"
        result = list(section.parse(text))
        self.assertEqual(len(result), 2)
        self.assertIsInstance(result[0], DocstringMeta)

class TestParamSection(unittest.TestCase):
    def test_parse_item(self):
        section = ParamSection("title", "key")
        key = "arg"
        value = "description"
        result = section._parse_item(key, value)
        self.assertIsInstance(result, DocstringParam)

    def test_parse(self):
        section = ParamSection("title", "key")
        text = "arg: description\narg2: description2"
        result = list(section.parse(text))
        self.assertEqual(len(result), 2)
        self.assertIsInstance(result[0], DocstringParam)

class TestRaisesSection(unittest.TestCase):
    def test_parse_item(self):
        section = RaisesSection("title", "key")
        key = "exception"
        value = "description"
        result = section._parse_item(key, value)
        self.assertIsInstance(result, DocstringRaises)

    def test_parse(self):
        section = RaisesSection("title", "key")
        text = "exception: description\nexception2: description2"
        result = list(section.parse(text))
        self.assertEqual(len(result), 2)
        self.assertIsInstance(result[0], DocstringRaises)

class TestReturnsSection(unittest.TestCase):
    def test_parse_item(self):
        section = ReturnsSection("title", "key")
        key = "return"
        value = "description"
        result = section._parse_item(key, value)
        self.assertIsInstance(result, DocstringReturns)

    def test_parse(self):
        section = ReturnsSection("title", "key")
        text = "return: description\nreturn2: description2"
        result = list(section.parse(text))
        self.assertEqual(len(result), 2)
        self.assertIsInstance(result[0], DocstringReturns)

class TestYieldsSection(unittest.TestCase):
    def test_parse_item(self):
        section = YieldsSection("title", "key")
        key = "yield"
        value = "description"
        result = section._parse_item(key, value)
        self.assertIsInstance(result, DocstringReturns)

    def test_parse(self):
        section = YieldsSection("title", "key")
        text = "yield: description\nyield2: description2"
        result = list(section.parse(text))
        self.assertEqual(len(result), 2)
        self.assertIsInstance(result[0], DocstringReturns)

class TestDeprecationSection(unittest.TestCase):
    def test_parse(self):
        section = DeprecationSection("title", "key")
        text = "version\ndescription"
        result = list(section.parse(text))
        self.assertEqual(len(result), 1)
        self.assertIsInstance(result[0], DocstringDeprecated)

class TestNumpydocParser(unittest.TestCase):
    def test_init(self):
        parser = NumpydocParser()
        self.assertIsNotNone(parser.sections)

    def test_add_section(self):
        parser = NumpydocParser()
        section = Section("title", "key")
        parser.add_section(section)
        self.assertIn(section.title, parser.sections)

    def test_parse(self):
        parser = NumpydocParser()
        text = "short description\n\nlong description\n\nParameters\narg: description"
        result = parser.parse(text)
        self.assertIsInstance(result, Docstring)

class TestFunctions(unittest.TestCase):
    def test_pairwise(self):
        iterable = [1, 2, 3, 4]
        result = list(_pairwise(iterable))
        self.assertEqual(result, [(1, 2), (2, 3), (3, 4)])

    def test_clean_str(self):
        string = "  hello  "
        result = _clean_str(string)
        self.assertEqual(result, "hello")

    def test_parse(self):
        text = "short description\n\nlong description\n\nParameters\narg: description"
        result = parse(text)
        self.assertIsInstance(result, Docstring)

if __name__ == '__main__':
    unittest.main()