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
    def test_init(self):
        section = _KVSection("title", "key")
        self.assertEqual(section.title, "title")
        self.assertEqual(section.key, "key")

    def test_parse_item(self):
        section = _KVSection("title", "key")
        key = "key"
        value = "value"
        result = section._parse_item(key, value)
        self.assertIsInstance(result, DocstringMeta)

    def test_parse(self):
        section = _KVSection("title", "key")
        text = "key: value\nkey2: value2"
        result = list(section.parse(text))
        self.assertEqual(len(result), 2)
        self.assertIsInstance(result[0], DocstringMeta)

class TestParamSection(unittest.TestCase):
    def test_init(self):
        section = ParamSection("title", "key")
        self.assertEqual(section.title, "title")
        self.assertEqual(section.key, "key")

    def test_parse_item(self):
        section = ParamSection("title", "key")
        key = "param"
        value = "description"
        result = section._parse_item(key, value)
        self.assertIsInstance(result, DocstringParam)

    def test_parse(self):
        section = ParamSection("title", "key")
        text = "param: description\nparam2: description2"
        result = list(section.parse(text))
        self.assertEqual(len(result), 2)
        self.assertIsInstance(result[0], DocstringParam)

class TestRaisesSection(unittest.TestCase):
    def test_init(self):
        section = RaisesSection("title", "key")
        self.assertEqual(section.title, "title")
        self.assertEqual(section.key, "key")

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
    def test_init(self):
        section = ReturnsSection("title", "key")
        self.assertEqual(section.title, "title")
        self.assertEqual(section.key, "key")

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
    def test_init(self):
        section = YieldsSection("title", "key")
        self.assertEqual(section.title, "title")
        self.assertEqual(section.key, "key")

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
    def test_init(self):
        section = DeprecationSection("title", "key")
        self.assertEqual(section.title, "title")
        self.assertEqual(section.key, "key")

    def test_parse(self):
        section = DeprecationSection("title", "key")
        text = "version\n description"
        result = list(section.parse(text))
        self.assertEqual(len(result), 1)
        self.assertIsInstance(result[0], DocstringDeprecated)


if __name__ == '__main__':
    unittest.main()