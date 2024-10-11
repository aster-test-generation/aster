import unittest
from docstring_parser.numpydoc import NumpydocParser


class TestNumpydocParser(unittest.TestCase):
    def test_parse_short_description(self):
        parser = NumpydocParser()
        docstring = parser.parse('"""Short description."""')
        self.assertEqual(docstring.short_description, '"""Short description."""')

    def test_parse_long_description(self):
        parser = NumpydocParser()
        docstring = parser.parse('"""\n\nLong description.\n\n"""')
        self.assertEqual(docstring.long_description, 'Long description.\n\n"""')

    def test_parse_blank_after_short_description(self):
        parser = NumpydocParser()
        docstring = parser.parse('"""Short description."""')
        self.assertFalse(docstring.blank_after_short_description)

    def test_parse_blank_after_long_description(self):
        parser = NumpydocParser()
        docstring = parser.parse('"""\n\nLong description.\n\n"""')
        self.assertFalse(docstring.blank_after_long_description)

    def test_parse_param_section(self):
        parser = NumpydocParser()
        docstring = parser.parse("""
            Parameters
            ----------
            x : int
                Description of x.
            y : float
                Description of y.
        """)
        self.assertEqual(len(docstring.meta), 2)
        self.assertEqual(docstring.meta[0].args, ['param', 'x'])
        self.assertEqual(docstring.meta[0].description, 'Description of x.')
        self.assertEqual(docstring.meta[1].args, ['Parameters', 'y'])
        self.assertEqual(docstring.meta[1].description, 'Description of y.')

    def test_parse_private_method(self):
        parser = NumpydocParser()
        instance = ExampleClass()
        result = instance._ExampleClass__private_method(3)
        self.assertEqual(result, 9)

    def test_parse_protected_method(self):
        parser = NumpydocParser()
        instance = ExampleClass()
        result = instance._protected_method(3)
        self.assertEqual(result, 6)

    def test_parse_magic_method(self):
        parser = NumpydocParser()
        instance = ExampleClass()
        result = instance.__str__()
        self.assertEqual(result, "ExampleClass")
        result = instance.__repr__()
        self.assertEqual(result, "ExampleClass(1)")

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

class TestNumpydocParser(unittest.TestCase):
    def test_parse_short_description(self):
        parser = NumpydocParser()
        docstring = parser.parse("This is a short description.")
        self.assertEqual(docstring.short_description, "This is a short description.")

    def test_parse_long_description(self):
        parser = NumpydocParser()
        docstring = parser.parse("This is a short description.\n\nThis is a long description.")
        self.assertEqual(docstring.long_description, "This is a long description.")

    def test_parse_blank_after_short_description(self):
        parser = NumpydocParser()
        docstring = parser.parse("This is a short description.\n\nThis is a long description.")
        self.assertTrue(docstring.blank_after_short_description)

    def test_parse_blank_after_long_description(self):
        parser = NumpydocParser()
        docstring = parser.parse("This is a short description.\n\nThis is a long description.")
        self.assertTrue(docstring.blank_after_long_description)

    def test_parse_meta_sections(self):
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
        self.assertEqual(docstring.meta[1].args, ["Parameters", "param2"])
        self.assertEqual(docstring.meta[0].description, "Description of param1.")
        self.assertEqual(docstring.meta[1].description, "Description of param2.")
        self.assertEqual(docstring.meta[0].type_name, "str")
        self.assertEqual(docstring.meta[1].type_name, "int")

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

        Raises
        ------
        ValueError
            If param1 is empty.
        """)
        self.assertEqual(len(docstring.meta), 3)
        self.assertEqual(docstring.meta[2].args, ["raises", "ValueError"])
        self.assertEqual(docstring.meta[2].description, "If param1 is empty.")

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

        Warns
        -----
        UserWarning
            If param1 is too long.
        """)
        self.assertEqual(len(docstring.meta), 3)
        self.assertEqual(docstring.meta[2].args, ["warns", "UserWarning"])
        self.assertEqual(docstring.meta[2].description, "If param1 is too long.")

if __name__ == '__main__':
    unittest.main()