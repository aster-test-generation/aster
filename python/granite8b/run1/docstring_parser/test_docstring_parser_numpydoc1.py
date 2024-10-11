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

    def test_parse_meta_data(self):
        parser = NumpydocParser()
        docstring = parser.parse("""
        This is a short description.

        Parameters
        ----------
        param1 : str
            Description of param1.
        param2 : int
            Description of param2.

        Returns
        -------
        str
            Description of the return value.
        """)
        self.assertEqual(len(docstring.meta), 2)
        self.assertEqual(docstring.meta[0].args, ["Parameters", "param1"])
        self.assertEqual(docstring.meta[0].description, "Description of param1.")
        self.assertEqual(docstring.meta[1].args, ["Parameters", "param2"])
        self.assertEqual(docstring.meta[1].description, "Description of param2.")
        self.assertEqual(len(docstring.meta[0].type_name), 0)
        self.assertEqual(len(docstring.meta[1].type_name), 0)
        self.assertEqual(docstring.meta[0].is_optional, False)
        self.assertEqual(docstring.meta[1].is_optional, False)
        self.assertEqual(docstring.meta[0].default, None)
        self.assertEqual(docstring.meta[1].default, None)

    def test_parse_private_method(self):
        parser = NumpydocParser()
        docstring = parser.parse("""
        This is a short description.

        Parameters
        ----------
        param1 : str
            Description of param1.

        Returns
        -------
        str
            Description of the return value.
        """)
        self.assertEqual(len(docstring.meta), 1)
        self.assertEqual(docstring.meta[0].args, ["Parameters", "param1"])
        self.assertEqual(docstring.meta[0].description, "Description of param1.")
        self.assertEqual(len(docstring.meta[0].type_name), 0)
        self.assertEqual(docstring.meta[0].is_optional, False)
        self.assertEqual(docstring.meta[0].default, None)

    def test_parse_protected_method(self):
        parser = NumpydocParser()
        docstring = parser.parse("""
        This is a short description.

        Parameters
        ----------
        param1 : str
            Description of param1.

        Returns
        -------
        str
            Description of the return value.
        """)
        self.assertEqual(len(docstring.meta), 1)
        self.assertEqual(docstring.meta[0].args, ["Parameters", "param1"])
        self.assertEqual(docstring.meta[0].description, "Description of param1.")
        self.assertEqual(len(docstring.meta[0].type_name), 0)
        self.assertEqual(docstring.meta[0].is_optional, False)
        self.assertEqual(docstring.meta[0].default, None)

    def test_parse_magic_method(self):
        parser = NumpydocParser()
        docstring = parser.parse("""
        This is a short description.

        Parameters
        ----------
        param1 : str
            Description of param1.

        Returns
        -------
        str
            Description of the return value.
        """)
        self.assertEqual(len(docstring.meta), 1)
        self.assertEqual(docstring.meta[0].args, ["Parameters", "param1"])
        self.assertEqual(docstring.meta[0].description, "Description of param1.")
        self.assertEqual(len(docstring.meta[0].type_name), 0)
        self.assertEqual(docstring.meta[0].is_optional, False)
        self.assertEqual(docstring.meta[0].default, None)

if __name__ == '__main__':
    unittest.main()