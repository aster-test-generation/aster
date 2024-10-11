import unittest
import re
from typing import Dict, Match, Text
from blib2to3.pgen2.literals import escape, evalString

simple_escapes: Dict[Text, Text] = {
    "a": "\a",
    "b": "\b",
    "f": "\f",
    "n": "\n",
    "r": "\r",
    "t": "\t",
    "v": "\v",
    "'": "'",
    '"': '"',
    "\\": "\\",
}
def escape(m: Match[Text]) -> Text:
    all, tail = m.group(0, 1)
    assert all.startswith("\\")
    esc = simple_escapes.get(tail)
    if esc is not None:
        return esc
    if tail.startswith("x"):
        hexes = tail[1:]
        if len(hexes) < 2:
            raise ValueError("invalid hex string escape ('\\%s')" % tail)
        try:
            i = int(hexes, 16)
        except ValueError:
            raise ValueError("invalid hex string escape ('\\%s')" % tail) from None
    else:
        try:
            i = int(tail, 8)
        except ValueError:
            raise ValueError("invalid octal string escape ('\\%s')" % tail) from None
    return chr(i)
def evalString(s: Text) -> Text:
    assert s.startswith("'") or s.startswith('"'), repr(s[:1])
    q = s[0]
    if s[:3] == q * 3:
        q = q * 3
    assert s.endswith(q), repr(s[-len(q) :])
    assert len(s) >= 2 * len(q)
    s = s[len(q) : -len(q)]
    return re.sub(r"\\(\'|\"|\\|[abfnrtv]|x.{0,2}|[0-7]{1,3})", escape, s)


class TestEscape(unittest.TestCase):
    def test_simple_escapes(self):
        for char, escaped in simple_escapes.items():
            self.assertEqual(escape(rf"\{char}"), escaped)

    def test_invalid_hex_escape(self):
        with self.assertRaises(ValueError):
            escape(r"\x")

    def test_invalid_octal_escape(self):
        with self.assertRaises(ValueError):
            escape(r"\7")

class TestEvalString(unittest.TestCase):
    def test_simple_strings(self):
        self.assertEqual(evalString("'a'"), "a")
        self.assertEqual(evalString('"b"'), "b")

    def test_triple_quoted_strings(self):
        self.assertEqual(evalString("'''c'''"), "c")
        self.assertEqual(evalString('"""d"""'), "d")

    def test_unicode_escapes(self):
        self.assertEqual(evalString(r"'\u0061'"), "a")
        self.assertEqual(evalString(r"'\U00010000'"), "\U00010000")

    def test_octal_escapes(self):
        self.assertEqual(evalString(r"'\101'"), "A")
        self.assertEqual(evalString(r"'\777'"), "\777")

    def test_invalid_unicode_escape(self):
        with self.assertRaises(ValueError):
            evalString(r"'\u00000'")

if __name__ == '__main__':
    unittest.main()