import re
import unittest
from blib2to3.pgen2.literals import simple_escapes, escape, evalString, test


class TestLiterals(unittest.TestCase):
    def test_simple_escapes(self):
        self.assertEqual(simple_escapes["a"], "\a")
        self.assertEqual(simple_escapes["b"], "\b")
        self.assertEqual(simple_escapes["f"], "\f")
        self.assertEqual(simple_escapes["n"], "\n")
        self.assertEqual(simple_escapes["r"], "\r")
        self.assertEqual(simple_escapes["t"], "\t")
        self.assertEqual(simple_escapes["v"], "\v")
        self.assertEqual(simple_escapes["'"], "'")
        self.assertEqual(simple_escapes['"'], '"')
        self.assertEqual(simple_escapes["\\"], "\\")

    def test_escape(self):
        m = re.match(r"\\(.)", r"\a")
        self.assertEqual(escape(m), "\a")
        m = re.match(r"\\(.)", r"\x12")
        self.assertEqual(escape(m), "\x12")
        m = re.match(r"\\(.)", r"\123")
        self.assertEqual(escape(m), "\123")

    def test_evalString(self):
        self.assertEqual(evalString("'abc'"), "abc")
        self.assertEqual(evalString('"abc"'), "abc")
        self.assertEqual(evalString("'''abc'''"), "abc")
        self.assertEqual(evalString('"""abc"""'), "abc")

    def test_test(self):
        test()  # This test case is a bit tricky since test() doesn't return anything

if __name__ == '__main__':
    unittest.main()