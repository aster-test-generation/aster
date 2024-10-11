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
        self.assertEqual(docstring.short_description, "This is a short description.")
        self.assertEqual(docstring.long_description, "This is a long description.")

    def test_parse_sections(self):
        parser = NumpydocParser()
        docstring = parser.parse("""
        This is a short description.

        Parameters
        ----------
        param1 : int
            Description of param1.
        param2 : str
            Description of param2.

        Returns
        -------
        int
            Description of the return value.
        """)
        self.assertEqual(len(docstring.meta), 3)
        self.assertEqual(docstring.meta[0].args, ["Parameters", "param1"])
        self.assertEqual(docstring.meta[0].description, "Description of param1.")
        self.assertEqual(docstring.meta[1].args, ["Parameters", "param2"])
        self.assertEqual(docstring.meta[1].description, "Description of param2.")
        self.assertEqual(len(docstring.meta[1].type_name), 0)
        self.assertEqual(docstring.meta[2].args, ["Returns"])
        self.assertEqual(docstring.meta[2].description, "Description of the return value.")
        self.assertEqual(len(docstring.meta[2].type_name), 0)

    def test_parse_private_method(self):
        parser = NumpydocParser()
        class ExampleClass:
            def __init__(self):
                self._private_attribute = 1

            def _private_method(self):
                return self._private_attribute

        instance = ExampleClass()
        docstring = parser.parse(ExampleClass._private_method.__doc__)
        self.assertEqual(len(docstring.meta), 0)
        self.assertEqual(docstring.meta[0].args, ["_private_method"])
        self.assertEqual(docstring.meta[0].description, "Description of the return value.")
        self.assertEqual(len(docstring.meta[0].type_name), 0)

    def test_parse_protected_method(self):
        parser = NumpydocParser()
        class ExampleClass:
            def __init__(self):
                self._protected_attribute = 1

            def _protected_method(self):
                return self._protected_attribute

        instance = ExampleClass()
        docstring = parser.parse(ExampleClass._protected_method.__doc__)
        self.assertEqual(len(docstring.meta), 0)
        self.assertEqual(docstring.meta[0].args, ["_protected_method"])
        self.assertEqual(docstring.meta[0].description, "Description of the return value.")
        self.assertEqual(len(docstring.meta[0].type_name), 0)

    def test_parse_magic_method(self):
        parser = NumpydocParser()
        class ExampleClass:
            def __init__(self):
                self._magic_attribute = 1

            def __str__(self):
                return str(self._magic_attribute)

        instance = ExampleClass()
        docstring = parser.parse(ExampleClass.__str__.__doc__)
        self.assertEqual(len(docstring.meta), 0)
        self.assertEqual(docstring.meta[0].args, ["__str__"])
        self.assertEqual(docstring.meta[0].description, "Description of the return value.")
        self.assertEqual(len(docstring.meta[0].type_name), 0)

if __name__ == '__main__':
    unittest.main()