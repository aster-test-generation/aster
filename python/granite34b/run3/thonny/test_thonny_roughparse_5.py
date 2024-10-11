import unittest
from thonny.roughparse import HyperParser


class TestHyperParser(unittest.TestCase):
    def test_get_expression(self):
        text = "a = 1\nb = 2\nc = a + b\n"
        hp = HyperParser(text, "3.0")
        self.assertEqual(hp.get_expression(), "a + b")

if __name__ == '__main__':
    unittest.main()