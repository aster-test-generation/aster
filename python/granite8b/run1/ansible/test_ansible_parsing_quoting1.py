import unittest
from ansible.parsing.quoting import is_quoted, unquote

class TestQuoting(unittest.TestCase):
    def test_is_quoted(self):
        self.assertTrue(is_quoted('"hello"'))
        self.assertTrue(is_quoted("'hello'"))
        self.assertFalse(is_quoted('hello'))
        self.assertFalse(is_quoted('"hello'))
        self.assertFalse(is_quoted('hello"'))

    def test_unquote(self):
        self.assertEqual(unquote('"hello"'), 'hello')
        self.assertEqual(unquote("'hello'"), 'hello')
        self.assertEqual(unquote('hello'), 'hello')

if __name__ == '__main__':
    unittest.main()