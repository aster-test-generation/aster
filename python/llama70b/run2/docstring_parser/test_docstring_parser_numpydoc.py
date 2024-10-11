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
        kv_section = _KVSection("title", "key")
        self.assertEqual(kv_section.title, "title")
        self.assertEqual(kv_section.key, "key")

    def test_parse_item(self):
        kv_section = _KVSection("title", "key")
        key = "key"
        value = "value"
        result = kv_section._parse_item(key, value)
        self.assertIsInstance(result, DocstringMeta)

    def test_parse(self):
        kv_section = _KVSection("title", "key")
        text = "key: value\nkey2: value2"
        result = list(kv_section.parse(text))
        self.assertEqual(len(result), 2)
        self.assertIsInstance(result[0], DocstringMeta)

class TestParamSection(unittest.TestCase):
    def test_init(self):
        param_section = ParamSection("title", "key")
        self.assertEqual(param_section.title, "title")
        self.assertEqual(param_section.key, "key")

    def test_parse_item(self):
        param_section = ParamSection("title", "key")
        key = "arg"
        value = "description"
        result = param_section._parse_item(key, value)
        self.assertIsInstance(result, DocstringParam)

    def test_parse(self):
        param_section = ParamSection("title", "key")
        text = "arg: type\ndescription\narg2: type2\ndescription2"
        result = list(param_section.parse(text))
        self.assertEqual(len(result), 2)
        self.assertIsInstance(result[0], DocstringParam)

class TestRaisesSection(unittest.TestCase):
    def test_init(self):
        raises_section = RaisesSection("title", "key")
        self.assertEqual(raises_section.title, "title")
        self.assertEqual(raises_section.key, "key")

    def test_parse_item(self):
        raises_section = RaisesSection("title", "key")
        key = "exception"
        value = "description"
        result = raises_section._parse_item(key, value)
        self.assertIsInstance(result, DocstringRaises)

    def test_parse(self):
        raises_section = RaisesSection("title", "key")
        text = "exception: description\nexception2: description2"
        result = list(raises_section.parse(text))
        self.assertEqual(len(result), 2)
        self.assertIsInstance(result[0], DocstringRaises)

class TestReturnsSection(unittest.TestCase):
    def test_init(self):
        returns_section = ReturnsSection("title", "key")
        self.assertEqual(returns_section.title, "title")
        self.assertEqual(returns_section.key, "key")

    def test_parse_item(self):
        returns_section = ReturnsSection("title", "key")
        key = "return"
        value = "description"
        result = returns_section._parse_item(key, value)
        self.assertIsInstance(result, DocstringReturns)

    def test_parse(self):
        returns_section = ReturnsSection("title", "key")
        text = "return: type\ndescription\nreturn2: type2\ndescription2"
        result = list(returns_section.parse(text))
        self.assertEqual(len(result), 2)
        self.assertIsInstance(result[0], DocstringReturns)

class TestYieldsSection(unittest.TestCase):
    def test_init(self):
        yields_section = YieldsSection("title", "key")
        self.assertEqual(yields_section.title, "title")
        self.assertEqual(yields_section.key, "key")

    def test_parse_item(self):
        yields_section = YieldsSection("title", "key")
        key = "yield"
        value = "description"
        result = yields_section._parse_item(key, value)
        self.assertIsInstance(result, DocstringReturns)

    def test_parse(self):
        yields_section = YieldsSection("title", "key")
        text = "yield: type\ndescription\nyield2: type2\ndescription2"
        result = list(yields_section.parse(text))
        self.assertEqual(len(result), 2)
        self.assertIsInstance(result[0], DocstringReturns)


if __name__ == '__main__':
    unittest.main()