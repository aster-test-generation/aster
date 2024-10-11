import unittest
from docstring_parser.rest import _build_meta, parse

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