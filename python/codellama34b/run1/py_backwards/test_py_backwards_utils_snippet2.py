import unittest
from py_backwards.utils.snippet import *

class TestSnippet(unittest.TestCase):
    def test_snippet(self):
        fn = lambda: None
        instance = snippet(fn)
        result = instance.get_body()
        self.assertEqual(result, [])

if __name__ == '__main__':
    unittest.main()