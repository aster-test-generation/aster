import unittest
from docstring_parser.numpydoc import *


class TestNumpydocParser(unittest.TestCase):
    def test_add_section(self):
        instance = NumpydocParser()
        instance.add_section(Section("test", "test"))
        self.assertEqual(instance.sections["test"].title, "test")

    def test_parse(self):
        instance = NumpydocParser()
        result = instance.parse("test")
        self.assertEqual(result.short_description, "test")

class TestSection(unittest.TestCase):
    def test_parse(self):
        instance = Section("test", "test")
        result = instance.parse("test")
        self.assertEqual(result[0].args, ("test",))

class Test_KVSection(unittest.TestCase):
    def test_parse(self):
        instance = KVSection("test", "test")
        result = instance.parse("test")
        self.assertEqual(result[0].args, ["test"])

    def test__parse_item(self):
        instance = KVSection("test", "test")
        result = instance._parse_item("test", "test")
        self.assertEqual(result.args, ["test"])

class Test_SphinxSection(unittest.TestCase):
    def test_parse(self):
        instance = SphinxSection("test", "test")
        result = instance.parse("test")
        self.assertEqual(result[0].args, ["test"])

class TestParamSection(unittest.TestCase):
    def test_parse(self):
        instance = ParamSection("test", "test")
        result = instance.parse("test")
        self.assertEqual(result[0].args, ("test",))

    def test__parse_item(self):
        instance = ParamSection("test", "test")
        result = instance._parse_item("test", "test")
        self.assertEqual(result.args, ["test", "test"])

class TestRaisesSection(unittest.TestCase):
    def test_parse(self):
        instance = RaisesSection("test", "test")
        result = instance.parse("test")
        self.assertEqual(result[0].args, ["test"])

    def test__parse_item(self):
        instance = RaisesSection("test", "test")
        result = instance._parse_item("test", "test")
        self.assertEqual(result.args, ["test", "test"])

class TestReturnsSection(unittest.TestCase):
    def test_parse(self):
        instance = ReturnsSection("test", "test")
        result = instance.parse("test")
        self.assertEqual(result[0].args, ("test",))

    def test__parse_item(self):
        instance = ReturnsSection("test", "test")
        result = instance._parse_item("test", "test")
        self.assertEqual(result.args, ["test"])

class TestYieldsSection(unittest.TestCase):
    def test_parse(self):
        instance = YieldsSection("test", "test")
        result = instance.parse("test")
        self.assertEqual(result[0].args, ("test",))

    def test__parse_item(self):
        instance = YieldsSection("test", "test")
        result = instance._parse_item("test", "test")
        self.assertEqual(result.args, ["test"])

class TestDeprecationSection(unittest.TestCase):
    def test_parse(self):
        instance = DeprecationSection("test", "test")
        result = instance.parse("test")
        self.assertEqual(result[0].args, ["test"])

if __name__ == '__main__':
    unittest.main()