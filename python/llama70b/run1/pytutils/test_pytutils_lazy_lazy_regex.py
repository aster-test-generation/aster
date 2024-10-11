import unittest
from pytutils.lazy.lazy_regex import *


class TestInvalidPattern(unittest.TestCase):
    def test_init(self):
        ip = InvalidPattern("test message")
        self.assertEqual(ip.msg, "test message")

    def test_format(self):
        ip = InvalidPattern("test message")
        e = Exception("test message")

    def test_unicode(self):
        ip = InvalidPattern("test message")
        self.assertEqual(ip.__unicode__(), u"Invalid pattern(s) found. test message")

    def test_str(self):
        ip = InvalidPattern("test message")
        e = InvalidInputPattern("test message")

    def test_repr(self):
        ip = InvalidPattern("test message")
        e = InvalidPattern("test message")

    def test_get_format_string(self):
        ip = InvalidPattern("test message")
        try:

    def test_eq(self):
        ip1 = InvalidPattern("test message")
        ip2 = InvalidPattern("test message")
        self.assertTrue(ip1 == ip2)

class TestLazyRegex(unittest.TestCase):
    def test_init(self):
        lr = LazyRegex()
        self.assertIsNone(lr._real_regex)

    def test_compile_and_collapse(self):
        lr = LazyRegex("pattern", flags=re.IGNORECASE)
        lr._compile_and_collapse()
        self.assertIsNotNone(lr._real_regex)

    def test_real_re_compile(self):
        lr = LazyRegex("pattern", flags=re.IGNORECASE)
        self.assertRaises(re.error, lr._real_re_compile, "invalid pattern")

    def test_getstate(self):
        lr = LazyRegex("pattern", flags=re.IGNORECASE)
        state = lr.__getstate__()
        self.assertEqual(state, {"args": ("pattern",), "kwargs": {"flags": re.IGNORECASE}})

    def test_setstate(self):
        lr = LazyRegex()
        state = {"args": ("pattern",), "kwargs": {"flags": re.IGNORECASE}}
        lr.__setstate__(state)
        self.assertEqual(lr._regex_args, ("pattern",))
        self.assertEqual(lr._regex_kwargs, {"flags": re.IGNORECASE})

    def test_getattr(self):
        lr = LazyRegex("pattern", flags=re.IGNORECASE)
        lr._compile_and_collapse()
        self.assertIsNotNone(lr.findall("string"))

    def test_private_methods(self):
        lr = LazyRegex("pattern", flags=re.IGNORECASE)
        self.assertIsNotNone(lr._LazyRegex__compile_and_collapse())

class TestFunctions(unittest.TestCase):
    def test_lazy_compile(self):
        lr = lazy_compile("pattern", flags=re.IGNORECASE)
        self.assertIsInstance(lr, LazyRegex)

    def test_install_lazy_compile(self):
        install_lazy_compile()
        self.assertEqual(re.compile, lazy_compile)

    def test_reset_compile(self):
        reset_compile()
        self.assertEqual(re.compile, _real_re_compile)

if __name__ == '__main__':
    unittest.main()