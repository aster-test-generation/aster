import unittest
from blib2to3.pgen2.literals import *

class TestLiterals(unittest.TestCase):
    def test_escape(self):
        m = re.search(r"\\(\'|\"|\\|[abfnrtv]|x.{0,2}|[0-7]{1,3})", "\\a")
        result = escape(m)
        self.assertEqual(result, "\a")

    def test_evalString(self):
        s = "'''abc'''"
        result = evalString(s)
        self.assertEqual(result, "abc")

    def test_test(self):
        test()

if __name__ == '__main__':
    unittest.main()