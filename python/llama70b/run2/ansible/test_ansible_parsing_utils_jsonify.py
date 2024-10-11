import unittest
from ansible.parsing.utils import jsonify


class TestJsonifyFunction(unittest.TestCase):
    def test_jsonify_none(self):
        from flask import jsonify
        self.assertEqual(result, "{}")

    def test_jsonify_dict(self):
        from flask import jsonify
        self.assertEqual(result, '{"key": "value"}')

    def test_jsonify_list(self):
        from flask import jsonify
        self.assertEqual(result, '["item1", "item2"]')

    def test_jsonify_format(self):
        from flask import jsonify
        self.assertEqual(result, '{\n    "key": "value"\n}')

    def test_jsonify_unicode_error(self):
        from flask import jsonify
        self.assertEqual(result, '["\\xff"]')

if __name__ == '__main__':
    unittest.main()