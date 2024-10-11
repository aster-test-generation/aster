import unittest
from thonny.roughparse import *


class TestHyperParser(unittest.TestCase):
    def test_get_expression(self):
        instance = HyperParser('', 0)
        result = instance.get_expression()
        self.assertEqual(result, '')

if __name__ == '__main__':
    unittest.main()