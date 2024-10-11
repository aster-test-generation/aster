import unittest
from docstring_parser.rest import _build_meta, parse


class TestDocstringParser(unittest.TestCase):
    def test_build_meta(self):
        meta = _build_meta(["param", "type", "name"], "description")
        self.assertEqual(meta.args, ["param", "type", "name"])
        self.assertEqual(meta.description, "description")
        self.assertEqual(meta.arg_name, "name")
        self.assertEqual(meta.type_name, "type")
        self.assertEqual(meta.is_optional, False)
        self.assertEqual(meta.default, None)

if __name__ == '__main__':
    unittest.main()