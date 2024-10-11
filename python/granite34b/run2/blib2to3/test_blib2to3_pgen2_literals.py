import unittest
from blib2to3.pgen2.literals import escape, evalString




class TestLiterals(unittest.TestCase):
    def test_escape(self):
        self.assertEqual(escape(r"\a"), "\a")
        self.assertEqual(escape(r"\b"), "\b")
        self.assertEqual(escape(r"\f"), "\f")
        self.assertEqual(escape(r"\n"), "\n")
        self.assertEqual(escape(r"\r"), "\r")
        self.assertEqual(escape(r"\t"), "\t")
        self.assertEqual(escape(r"\v"), "\v")
        self.assertEqual(escape(r"\'"), "\'")
        self.assertEqual(escape(r'\"'), '\"')
        self.assertEqual(escape(r"\\"), "\\")
        self.assertEqual(escape(r"\x61"), "a")
        self.assertEqual(escape(r"\x62"), "b")
        self.assertEqual(escape(r"\x66"), "f")
        self.assertEqual(escape(r"\x6E"), "n")
        self.assertEqual(escape(r"\x72"), "r")
        self.assertEqual(escape(r"\x74"), "t")
        self.assertEqual(escape(r"\x76"), "v")
        self.assertEqual(escape(r"\101"), "A")
        self.assertEqual(escape(r"\102"), "B")
        self.assertEqual(escape(r"\106"), "J")
        self.assertEqual(escape(r"\110"), "N")
        self.assertEqual(escape(r"\112"), "P")
        self.assertEqual(escape(r"\114"), "R")
        self.assertEqual(escape(r"\116"), "T")
        self.assertEqual(escape(r"\117"), "U")
        self.assertEqual(escape(r"\120"), "X")
        self.assertEqual(escape(r"\121"), "Y")
        self.assertEqual(escape(r"\122"), "Z")
        self.assertEqual(escape(r"\123"), "{")
        self.assertEqual(escape(r"\124"), "|")
        self.assertEqual(escape(r"\125"), "}")
        self.assertEqual(escape(r"\126"), "~")

if __name__ == '__main__':
    unittest.main()