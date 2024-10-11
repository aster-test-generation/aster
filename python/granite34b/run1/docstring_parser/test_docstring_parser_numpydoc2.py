import unittest
from docstring_parser.numpydoc import NumpydocParser

class TestNumpydocParser(unittest.TestCase):
    def test_parse_short_description(self):
        parser = NumpydocParser()
        docstring = parser.parse("This is a short description.")
        self.assertEqual(docstring.short_description, "This is a short description.")

    def test_parse_long_description(self):
        parser = NumpydocParser()
        docstring = parser.parse("This is a short description.\n\nThis is a long description.")
        self.assertEqual(docstring.long_description, "This is a long description.")

    def test_parse_meta_description(self):
        parser = NumpydocParser()
        docstring = parser.parse("This is a short description.\n\nThis is a meta description.")
        self.assertEqual(docstring.meta[0].description, "This is a meta description.")

    def test_parse_param_description(self):
        parser = NumpydocParser()
        docstring = parser.parse("This is a short description.\n\n:param x: This is a parameter description.")
        self.assertEqual(docstring.meta[0].description, "This is a parameter description.")

    def test_parse_raises_description(self):
        parser = NumpydocParser()
        docstring = parser.parse("This is a short description.\n\n:raises Exception: This is an exception description.")
        self.assertEqual(docstring.meta[0].description, "This is an exception description.")

    def test_parse_returns_description(self):
        parser = NumpydocParser()
        docstring = parser.parse("This is a short description.\n\n:returns: This is a return description.")
        self.assertEqual(docstring.meta[0].description, "This is a return description.")

    def test_parse_yields_description(self):
        parser = NumpydocParser()
        docstring = parser.parse("This is a short description.\n\n:yields: This is a yield description.")
        self.assertEqual(docstring.meta[0].description, "This is a yield description.")

    def test_parse_examples_description(self):
        parser = NumpydocParser()
        docstring = parser.parse("This is a short description.\n\n:examples: This is an example description.")
        self.assertEqual(docstring.meta[0].description, "This is an example description.")

    def test_parse_warnings_description(self):
        parser = NumpydocParser()
        docstring = parser.parse("This is a short description.\n\n:warnings: This is a warning description.")
        self.assertEqual(docstring.meta[0].description, "This is a warning description.")

    def test_parse_see_also_description(self):
        parser = NumpydocParser()
        docstring = parser.parse("This is a short description.\n\n:see_also: This is a see also description.")
        self.assertEqual(docstring.meta[0].description, "This is a see also description.")

    def test_parse_notes_description(self):
        parser = NumpydocParser()
        docstring = parser.parse("This is a short description.\n\n:notes: This is a notes description.")
        self.assertEqual(docstring.meta[0].description, "This is a notes description.")

    def test_parse_references_description(self):
        parser = NumpydocParser()
        docstring = parser.parse("This is a short description.\n\n:references: This is a references description.")
        self.assertEqual(docstring.meta[0].description, "This is a references description.")

    def test_parse_deprecation_description(self):
        parser = NumpydocParser()
        docstring = parser.parse("This is a short description.\n\n:deprecated: This is a deprecation description.")
        self.assertEqual(docstring.meta[0].description, "This is a deprecation description.")

if __name__ == '__main__':
    unittest.main()