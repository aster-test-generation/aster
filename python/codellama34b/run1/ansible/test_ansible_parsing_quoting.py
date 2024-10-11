import unittest
from ansible.parsing.quoting import *


class TestQuoting(unittest.TestCase):
    def test_is_quoted(self):
        result = is_quoted("'string'")
        self.assertTrue(result)

    def test_unquote(self):
        result = unquote("'string'")
        self.assertEqual(result, "string")

if __name__ == '__main__':
    unittest.main()