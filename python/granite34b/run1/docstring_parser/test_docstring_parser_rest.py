import unittest
from docstring_parser.rest import _build_meta, parse


class TestDocstringParser(unittest.TestCase):
    def test_build_meta(self):
        meta = _build_meta(["param", "x", "int"], "Description of x.")
        self.assertEqual(meta.args, ["param", "x", "int"])
        self.assertEqual(meta.description, "Description of x.")
        self.assertEqual(meta.arg_name, "int")
        self.assertEqual(meta.type_name, "int")
        self.assertEqual(meta.is_optional, None)
        self.assertEqual(meta.default, None)

        meta = _build_meta(["param", "y", "str?"], "Description of y.")
        self.assertEqual(meta.args, ["param", "y", "str?"])
        self.assertEqual(meta.description, "Description of y.")
        self.assertEqual(meta.arg_name, "y")
        self.assertEqual(meta.type_name, "str")
        self.assertEqual(meta.is_optional, True)
        self.assertEqual(meta.default, None)

        meta = _build_meta([" raises", "Exception"], "Description of exception.")
        self.assertEqual(meta.args, ["raises", "Exception"])
        self.assertEqual(meta.description, "Description of exception.")
        self.assertEqual(meta.type_name, "Exception")

class TestDocstringParser(unittest.TestCase):
    def test_build_meta(self):
        # Test for normal parameter
        meta = _build_meta(["param", "type", "name"], "description")
        self.assertEqual(meta.arg_name, "name")
        self.assertEqual(meta.type_name, "type")
        self.assertEqual(meta.description, "description")

        # Test for optional parameter
        meta = _build_meta(["param", "type?", "name"], "description")
        self.assertEqual(meta.arg_name, "name")
        self.assertEqual(meta.type_name, "type")
        self.assertEqual(meta.is_optional, True)
        self.assertEqual(meta.description, "description")

        # Test for return parameter
        meta = _build_meta(["return", "type"], "description")
        self.assertEqual(meta.type_name, "type")
        self.assertEqual(meta.description, "description")

        # Test for raises parameter
        meta = _build_meta(["raise", "type"], "description")
        self.assertEqual(meta.type_name, "type")
        self.assertEqual(meta.description, "description")

if __name__ == '__main__':
    unittest.main()