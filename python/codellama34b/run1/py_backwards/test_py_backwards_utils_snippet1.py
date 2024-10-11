import unittest
from py_backwards.utils.snippet import *

class Testsnippet(unittest.TestCase):
    def test_snippet(self):
        self.assertEqual(snippet(None), None)

    def test_get_variables(self):
        self.assertEqual(snippet(None)._get_variables(None, None), None)

    def test_get_body(self):
        self.assertEqual(snippet(None).get_body(), None)

    def test_VariablesReplacer(self):
        self.assertEqual(VariablesReplacer(None), None)

    def test_replace(self):
        self.assertEqual(VariablesReplacer.replace(None, None), None)

    def test_extend_tree(self):
        self.assertEqual(extend_tree(None, None), None)

    def test_find_variables(self):
        self.assertEqual(find_variables(None), None)

    def test_let(self):
        self.assertEqual(let(None), None)

    def test_extend(self):
        self.assertEqual(extend(None), None)

if __name__ == '__main__':
    unittest.main()