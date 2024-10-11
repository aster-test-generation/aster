import unittest
from thonny.roughparse import *

class TestRoughParser(unittest.TestCase):
    def test_set_str(self):
        rp = RoughParser(1, 1)
        rp.set_str("")
        self.assertEqual(rp.str, "")

    def test_find_good_parse_start(self):
        rp = RoughParser(1, 1)
        rp.set_str("")
        self.assertEqual(rp.find_good_parse_start(), None)

    def test_set_lo(self):
        rp = RoughParser(1, 1)
        rp.set_str("")
        rp.set_lo(0)
        self.assertEqual(rp.str, "")

    def test_get_continuation_type(self):
        rp = RoughParser(1, 1)
        rp.set_str("")
        self.assertEqual(rp.get_continuation_type(), C_NONE)

if __name__ == '__main__':
    unittest.main()