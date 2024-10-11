import unittest
from blib2to3.pgen2.literals import *



class TestLiterals(unittest.TestCase):
    def test_escape(self):
        m = Match[Text]
        all, tail = m.group(0), m.group(1)
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

    def test_evalString(self):
        s = Text
        assert s.startswith("'") or s.startswith('"'), repr(s[:1])
        q = s[0]
        if s[:3] == q * 3:
            q = q * 3
        assert s.endswith(q), repr(s[-len(q) :])
        assert len(s) >= 2 * len(q)
        s = s[len(q) : -len(q)]
        return re.sub(r"\\(\'|\"|\\|[abfnrtv]|x.{0,2}|[0-7]{1,3})", escape, s)


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