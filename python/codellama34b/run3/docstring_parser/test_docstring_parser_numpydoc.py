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

    def test_setup(self):
        instance = NumpydocParser()
        instance._setup()
        self.assertEqual(instance.titles_re.pattern, "")

    def test_init(self):
        instance = NumpydocParser()
        self.assertEqual(instance.sections, {})

    def test_init_1(self):
        instance = NumpydocParser(sections=DEFAULT_SECTIONS)
        self.assertEqual(instance.sections, {})

    def test__clean_str(self):
        result = _clean_str("test")
        self.assertEqual(result, "test")

    def test__clean_str_1(self):
        result = _clean_str("")
        self.assertEqual(result, None)

    def test__pairwise(self):
        result = _pairwise("test")
        self.assertEqual(result, [])

    def test__pairwise_1(self):
        result = _pairwise("test", end="test")
        self.assertEqual(result, [])

    def test__parse_item(self):
        instance = ParamSection("test", "test")
        result = instance._parse_item("test", "test")
        self.assertEqual(result.description, "test")

    def test__parse_item_1(self):
        instance = ParamSection("test", "test")
        result = instance._parse_item("test", "test")
        self.assertEqual(result.type_name, None)

    def test__parse_item_2(self):
        instance = ParamSection("test", "test")
        result = instance._parse_item("test", "test")
        self.assertEqual(result.is_optional, None)

    def test__parse_item_3(self):
        instance = ParamSection("test", "test")
        result = instance._parse_item("test", "test")
        self.assertEqual(result.default, None)

    def test__parse_item_4(self):
        instance = ParamSection("test", "test")
        result = instance._parse_item("test", "test")
        self.assertEqual(result.arg_name, None)

    def test__parse_item_5(self):
        instance = RaisesSection("test", "test")
        result = instance._parse_item("test", "test")
        self.assertEqual(result.description, "test")

    def test__parse_item_6(self):
        instance = RaisesSection("test", "test")
        result = instance._parse_item("test", "test")
        self.assertEqual(result.type_name, "test")

    def test__parse_item_7(self):
        instance = ReturnsSection("test", "test")
        result = instance._parse_item("test", "test")
        self.assertEqual(result.description, "test")

    def test__parse_item_8(self):
        instance = ReturnsSection("test", "test")
        result = instance._parse_item("test", "test")
        self.assertEqual(result.type_name, None)

    def test__parse_item_9(self):
        instance = ReturnsSection("test", "test")
        result = instance._parse_item("test", "test")
        self.assertEqual(result.is_generator, False)

    def test__parse_item_10(self):
        instance = ReturnsSection("test", "test")
        result = instance._parse_item("test", "test")
        self.assertEqual(result.return_name, None)

if __name__ == '__main__':
    unittest.main()