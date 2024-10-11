import unittest
from docstring_parser.numpydoc import *



class TestNumpydocParser(unittest.TestCase):
    def test_add_section(self):
        instance = NumpydocParser()
        instance.add_section(Section("Example", "example"))
        self.assertEqual(instance.sections["Example"].title, "Example")

    def test_parse(self):
        instance = NumpydocParser()
        result = instance.parse("Example")
        self.assertEqual(result.short_description, "Example")

    def test_parse_2(self):
        instance = NumpydocParser()
        result = instance.parse("Example\n\nExample")
        self.assertEqual(result.long_description, "Example")

    def test_parse_3(self):
        instance = NumpydocParser()
        result = instance.parse("Example\n\nExample\n\nExample")
        self.assertEqual(result.blank_after_long_description, True)

    def test_parse_4(self):
        instance = NumpydocParser()
        result = instance.parse("Example\n\nExample\n\nExample")
        self.assertEqual(result.blank_after_short_description, True)

    def test_parse_5(self):
        instance = NumpydocParser()
        result = instance.parse("Example\n\nExample\n\nExample")
        self.assertEqual(result.meta, [])

    def test_parse_6(self):
        instance = NumpydocParser()
        result = instance.parse("Example\n\nExample\n\nExample")
        self.assertEqual(result.short_description, "Example")

    def test_parse_7(self):
        instance = NumpydocParser()
        result = instance.parse("Example\n\nExample\n\nExample")
        self.assertEqual(result.long_description, "Example")

    def test_parse_8(self):
        instance = NumpydocParser()
        result = instance.parse("Example\n\nExample\n\nExample")
        self.assertEqual(result.blank_after_long_description, True)

    def test_parse_9(self):
        instance = NumpydocParser()
        result = instance.parse("Example\n\nExample\n\nExample")
        self.assertEqual(result.blank_after_short_description, True)

    def test_parse_10(self):
        instance = NumpydocParser()
        result = instance.parse("Example\n\nExample\n\nExample")
        self.assertEqual(result.meta, [])

    def test_parse_11(self):
        instance = NumpydocParser()
        result = instance.parse("Example\n\nExample\n\nExample")
        self.assertEqual(result.short_description, "Example")

    def test_parse_12(self):
        instance = NumpydocParser()
        result = instance.parse("Example\n\nExample\n\nExample")
        self.assertEqual(result.long_description, "Example")

    def test_parse_13(self):
        instance = NumpydocParser()
        result = instance.parse("Example\n\nExample\n\nExample")
        self.assertEqual(result.blank_after_long_description, True)

    def test_parse_14(self):
        instance = NumpydocParser()
        result = instance.parse("Example\n\nExample\n\nExample")
        self.assertEqual(result.blank_after_short_description, True)

    def test_parse_15(self):
        instance = NumpydocParser()
        result = instance.parse("Example\n\nExample\n\nExample")
        self.assertEqual(result.meta, [])

    def test_parse_16(self):
        instance = NumpydocParser()
        result = instance.parse("Example\n\nExample\n\nExample")
        self.assertEqual(result.short_description, "Example")

if __name__ == '__main__':
    unittest.main()