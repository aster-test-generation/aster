import unittest
from blib2to3.pgen2.literals import *


class TestLiterals(unittest.TestCase):
    def test_escape(self):
        m = re.match("\\\\(\'|\"|\\\\|[abfnrtv]|x.{0,2}|[0-7]{1,3})", "\\\\")
        result = escape(m)
        self.assertEqual(result, "\\")

    def test_evalString(self):
        s = "''"
        result = evalString(s)
        self.assertEqual(result, "")

    def test_test(self):
        test()

if __name__ == '__main__':
    unittest.main()