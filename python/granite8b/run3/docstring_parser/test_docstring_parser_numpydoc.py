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
        param1 : str
            Description of param1.
        param2 : int
            Description of param2.

        Returns
        -------
        str
            Description of the return value.
        """)
        self.assertEqual(len(docstring.meta), 3)
        self.assertEqual(docstring.meta[0].args, ["Parameters", "param1"])
        self.assertEqual(docstring.meta[0].description, "Description of param1.")
        self.assertEqual(docstring.meta[1].args, ["Parameters", "param2"])
        self.assertEqual(docstring.meta[1].description, "Description of param2.")
        self.assertEqual(docstring.meta[2].args, ["Returns"])
        self.assertEqual(docstring.meta[2].description, "Description of the return value.")

    def test_parse_private_method(self):
        parser = NumpydocParser()
        class ExampleClass:
            def __init__(self):
                self._private_attr = 1

            def _private_method(self):
                return self._private_attr

        instance = ExampleClass()
        docstring = parser.parse(ExampleClass._private_method.__doc__)
        self.assertEqual(docstring.meta[0].args, ["_private_method"])
        self.assertEqual(docstring.meta[0].description, "Description of the return value.")

    def test_parse_protected_method(self):
        parser = NumpydocParser()
        class ExampleClass:
            def __init__(self):
                self._protected_attr = 1

            def _protected_method(self):
                return self._protected_attr

        instance = ExampleClass()
        docstring = parser.parse(ExampleClass._protected_method.__doc__)
        self.assertEqual(docstring.meta[0].args, ["self"])
        self.assertEqual(docstring.meta[0].description, "Description of the return value.")

    def test_parse_magic_method(self):
        parser = NumpydocParser()
        class ExampleClass:
            def __init__(self):
                self._magic_attr = 1

            def __str__(self):
                return str(self._magic_attr)

        instance = ExampleClass()
        docstring = parser.parse(ExampleClass.__str__.__doc__)
        self.assertEqual(docstring.meta[0].args, ["self"])
        self.assertEqual(docstring.meta[0].description, "Description of the return value.")

if __name__ == '__main__':
    unittest.main()