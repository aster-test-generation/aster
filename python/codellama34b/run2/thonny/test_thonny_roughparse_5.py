import unittest
from thonny.roughparse import *


class TestHyperParser(unittest.TestCase):
    def test_get_expression(self):
        instance = HyperParser("text", index)
        result = instance.get_expression()
        self.assertEqual(result, "expression")

class TestHyperParser(unittest.TestCase):
    def test_get_expression(self):
        instance = HyperParser(None, None)
        result = instance.get_expression()
        self.assertEqual(result, None)

if __name__ == '__main__':
    unittest.main()