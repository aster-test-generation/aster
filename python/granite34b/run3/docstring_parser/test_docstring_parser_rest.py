import unittest
from docstring_parser.rest import _build_meta, parse


class TestDocstringParser(unittest.TestCase):
    def test_build_meta(self):
        meta = _build_meta(["param", "x", "int"], "Description of x")
        self.assertEqual(meta.args, ["param", "x", "int"])
        self.assertEqual(meta.description, "Description of x")
        self.assertEqual(meta.arg_name, "int")
        self.assertEqual(meta.type_name, "int")
        self.assertEqual(meta.is_optional, None)
        self.assertEqual(meta.default, None)

if __name__ == '__main__':
    unittest.main()