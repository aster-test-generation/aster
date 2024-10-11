import unittest
from blib2to3.pgen2.literals import escape, evalString


class TestLiterals(unittest.TestCase):
    def test_escape(self):
        self.assertEqual(escape(r"\a"), r"\a")
        self.assertEqual(escape(r"\b"), "\b")
        self.assertEqual(escape(r"\f"), "\f")
        self.assertEqual(escape(r"\n"), "\n")
        self.assertEqual(escape(r"\r"), "\r")
        self.assertEqual(escape(r"\t"), "\t")
        self.assertEqual(escape(r"\v"), "\v")
        self.assertEqual(escape(r"\'"), "\'")
        self.assertEqual(escape(r'\"'), '\"')
        self.assertEqual(escape(r"\\"), "\\")
        self.assertEqual(escape(r"\x12"), "\x12")
        self.assertEqual(escape(r"\123"), "\123")

if __name__ == '__main__':
    unittest.main()