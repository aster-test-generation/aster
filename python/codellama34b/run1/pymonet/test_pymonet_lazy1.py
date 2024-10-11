
import unittest
from pymonet.lazy import *

class TestLazy(unittest.TestCase):
    def test_init(self):
        constructor_fn = lambda x: x + 1
        lazy = Lazy(constructor_fn)
        self.assertEqual(lazy.constructor_fn, constructor_fn)
        self.assertEqual(lazy.is_evaluated, False)
        self.assertEqual(lazy.value, None)

    def test_of(self):
        value = 1
        lazy = Lazy.of(value)
        self.assertEqual(lazy.constructor_fn(value), value)

    def test_str(self):
        constructor_fn = lambda x: x + 1
        lazy = Lazy(constructor_fn)
        self.assertEqual(str(lazy), 'Lazy[fn=<function <lambda> at 0x00000224569931D0>, value=None, is_evaluated=False]')

    def test_eq(self):
        constructor_fn = lambda x: x + 1
        lazy = Lazy(constructor_fn)
        other = Lazy(constructor_fn)
        self.assertEqual(lazy, other)

    def test_compute_value(self):
        constructor_fn = lambda x: x + 1
        lazy = Lazy(constructor_fn)
        self.assertEqual(lazy._compute_value(1), 2)
        self.assertEqual(lazy.is_evaluated, True)
        self.assertEqual(lazy.value, 2)

    def test_map(self):
        constructor_fn = lambda x: x + 1
        lazy = Lazy(constructor_fn)
        mapper = lambda x: x + 1
        lazy_mapped = lazy.map(mapper)
        self.assertEqual(lazy_mapped.constructor_fn(1), 3)

    def test_ap(self):
        constructor_fn = lambda x: x + 1
        lazy = Lazy(constructor_fn)
        applicative = Lazy(lambda x: x + 1)
        lazy_ap = lazy.ap(applicative)
        self.assertEqual(lazy_ap.constructor_fn(1), 3)

    def test_bind(self):
        constructor_fn = lambda x: x + 1
        lazy = Lazy(constructor_fn)
        fn = lambda x: Lazy(lambda y: x + y)
        lazy_bound = lazy.bind(fn)
        self.assertEqual(lazy_bound.constructor_fn(1), 3)

    def test_get(self):
        constructor_fn = lambda x: x + 1
        lazy = Lazy(constructor_fn)
        self.assertEqual(lazy.get(1), 2)
        self.assertEqual(lazy.is_evaluated, True)
        self.assertEqual(lazy.value, 2)

    def test_to_box(self):
        constructor_fn = lambda x: x + 1
        lazy = Lazy(constructor_fn)
        from pymonet.box import Box
        box = lazy.to_box(1)
        self.assertEqual(box.get(), 2)

    def test_to_either(self):
        constructor_fn = lambda x: x + 1
        lazy = Lazy(constructor_fn)
        from pymonet.either import Right
        either = lazy.to_either(1)
        self.assertEqual(either.get(), 2)

    def test_to_maybe(self):
        constructor_fn = lambda x: x + 1
        lazy = Lazy(constructor_fn)
        from pymonet.maybe import Maybe
        maybe = lazy.to_maybe(1)
        self.assertEqual(maybe.get(), 2)

if __name__ == '__main__':
    unittest.main()