import unittest
from thonny.roughparse import *


class TestRoughParser(unittest.TestCase):
    def test_init(self):
        instance = RoughParser(indent_width=1, tabwidth=1)
        self.assertEqual(instance.indent_width, 1)
        self.assertEqual(instance.tabwidth, 1)

    def test_set_str(self):
        instance = RoughParser(indent_width=1, tabwidth=1)
        instance.set_str("")
        self.assertEqual(instance.str, "")

    def test_find_good_parse_start(self):
        instance = RoughParser(indent_width=1, tabwidth=1)
        result = instance.find_good_parse_start()
        self.assertEqual(result, None)

    def test_set_lo(self):
        instance = RoughParser(indent_width=1, tabwidth=1)
        instance.set_lo(0)
        self.assertEqual(instance.str, "")

    def test_study1(self):
        instance = RoughParser(indent_width=1, tabwidth=1)
        instance._study1()
        self.assertEqual(instance.study_level, 1)

    def test_get_continuation_type(self):
        instance = RoughParser(indent_width=1, tabwidth=1)
        result = instance.get_continuation_type()
        self.assertEqual(result, C_NONE)

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