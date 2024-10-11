import unittest
from ansible.parsing.utils import jsonify


class TestJsonify(unittest.TestCase):
    def test_jsonify(self):
        result = jsonify(None, format=True)
        self.assertEqual(result, "{}")

    def test_jsonify_format(self):
        result = jsonify(None, indent=4)
        self.assertEqual(result, "{}")

if __name__ == '__main__':
    unittest.main()