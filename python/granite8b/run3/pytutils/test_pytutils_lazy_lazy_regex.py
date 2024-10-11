import unittest
from pytutils.lazy.lazy_regex import LazyRegex, install_lazy_compile, reset_compile


class TestLazyRegex(unittest.TestCase):
    def test_lazy_regex_init(self):
        lazy_regex = LazyRegex(args=(), kwargs={})
        self.assertIsNone(lazy_regex._real_regex)
        self.assertEqual(lazy_regex._regex_args, ())
        self.assertEqual(lazy_regex._regex_kwargs, {})

    def test_lazy_regex_compile(self):
        lazy_regex = LazyRegex(args=(), kwargs={})
        lazy_regex._compile_and_collapse(pattern)
        self.assertIsNotNone(lazy_regex._real_regex)

    def test_lazy_regex_getstate(self):
        lazy_regex = LazyRegex(args=(), kwargs={})
        lazy_regex._compile_and_collapse(pattern)
        state = lazy_regex.__getstate__()
        self.assertEqual(state["args"], ())
        self.assertEqual(state["kwargs"], {})

    def test_lazy_regex_setstate(self):
        lazy_regex = LazyRegex(args=(), kwargs={})
        lazy_regex._compile_and_collapse()
        state = lazy_regex.__getstate__()
        lazy_regex.__setstate__(state)
        self.assertIsNotNone(lazy_regex._real_regex)

    def test_lazy_regex_getattr(self):
        lazy_regex = LazyRegex(args=(), kwargs={})
        lazy_regex._compile_and_collapse(pattern)
        self.assertEqual(lazy_regex.findall("test"), ["test"])

    def test_lazy_regex_finditer(self):
        lazy_regex = LazyRegex(args=(), kwargs={})
        lazy_regex._compile_and_collapse(pattern)
        self.assertEqual(list(lazy_regex.finditer("test")), [])

class TestLazyCompile(unittest.TestCase):
    def test_lazy_compile(self):
        lazy_regex = lazy_compile("test")
        self.assertIsInstance(lazy_regex, LazyRegex)

    def test_install_lazy_compile(self):
        install_lazy_compile()
        self.assertEqual(re.compile("test"), LazyRegex(args=("test",), kwargs={}))

    def test_reset_compile(self):
        reset_compile()
        self.assertEqual(re.compile("test"), _real_re_compile("test"))

if __name__ == '__main__':
    unittest.main()