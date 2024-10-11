import unittest
from ansible.module_utils.pycompat24 import *


class TestPycompat24(unittest.TestCase):
    def test_get_exception(self):
        result = get_exception()
        self.assertEqual(result, None)

    def test_literal_eval(self):
        result = literal_eval("1")
        self.assertEqual(result, 1)

if __name__ == '__main__':
    unittest.main()