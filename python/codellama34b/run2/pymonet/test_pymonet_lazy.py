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
        self.assertEqual(lazy.constructor_fn, lambda *args: value)
        self.assertEqual(lazy.is_evaluated, False)
        self.assertEqual(lazy.value, None)

    def test_str(self):
        constructor_fn = lambda x: x + 1
        lazy = Lazy(constructor_fn)
        result = str(lazy)
        self.assertEqual(result, 'Lazy[fn={}, value={}, is_evaluated={}]'.format(constructor_fn, None, False))

    def test_eq(self):
        constructor_fn = lambda x: x + 1
        lazy = Lazy(constructor_fn)
        other = Lazy(constructor_fn)
        self.assertEqual(lazy, other)

    def test_compute_value(self):
        constructor_fn = lambda x: x + 1
        lazy = Lazy(constructor_fn)
        result = lazy._compute_value(1)
        self.assertEqual(result, 2)
        self.assertEqual(lazy.is_evaluated, True)
        self.assertEqual(lazy.value, 2)

    def test_map(self):
        constructor_fn = lambda x: x + 1
        lazy = Lazy(constructor_fn)
        mapper = lambda x: x * 2
        result = lazy.map(mapper)
        self.assertEqual(result.constructor_fn, mapper(constructor_fn))
        self.assertEqual(result.is_evaluated, False)
        self.assertEqual(result.value, None)

    def test_ap(self):
        constructor_fn = lambda x: x + 1
        lazy = Lazy(constructor_fn)
        applicative = Lazy(lambda x: x * 2)
        result = lazy.ap(applicative)
        self.assertEqual(result.constructor_fn, lambda *args: constructor_fn(applicative.get(*args)))
        self.assertEqual(result.is_evaluated, False)
        self.assertEqual(result.value, None)

    def test_bind(self):
        constructor_fn = lambda x: x + 1
        lazy = Lazy(constructor_fn)
        fn = lambda x: Lazy(lambda *args: x * 2)
        result = lazy.bind(fn)
        self.assertEqual(result.constructor_fn, lambda *args: fn(constructor_fn(*args)).constructor_fn)
        self.assertEqual(result.is_evaluated, False)
        self.assertEqual(result.value, None)

    def test_get(self):
        constructor_fn = lambda x: x + 1
        lazy = Lazy(constructor_fn)
        result = lazy.get(1)
        self.assertEqual(result, 2)
        self.assertEqual(lazy.is_evaluated, True)
        self.assertEqual(lazy.value, 2)

    def test_to_box(self):
        constructor_fn = lambda x: x + 1
        lazy = Lazy(constructor_fn)
        from pymonet.box import Box
        result = lazy.to_box(1)
        self.assertEqual(result, Box(2))

    def test_to_either(self):
        constructor_fn = lambda x: x + 1
        lazy = Lazy(constructor_fn)
        from pymonet.either import Right
        result = lazy.to_either(1)
        self.assertEqual(result, Right(2))


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

    def test_map(self):
        value = 1
        lazy = Lazy.of(value)
        mapper = lambda x: x + 1
        result = lazy.map(mapper)
        self.assertEqual(result.constructor_fn(value), mapper(value))

    def test_ap(self):
        value = 1
        lazy = Lazy.of(value)
        applicative = Lazy.of(value)
        result = lazy.ap(applicative)
        self.assertEqual(result.constructor_fn(value), value)

    def test_bind(self):
        value = 1
        lazy = Lazy.of(value)
        fn = lambda x: Lazy.of(x + 1)
        result = lazy.bind(fn)
        self.assertEqual(result.constructor_fn(value), fn(value).constructor_fn)

    def test_get(self):
        value = 1
        lazy = Lazy.of(value)
        result = lazy.get()
        self.assertEqual(result, value)

    def test_to_box(self):
        value = 1
        lazy = Lazy.of(value)
        result = lazy.to_box()
        self.assertEqual(result.get(), value)

    def test_to_either(self):
        value = 1
        lazy = Lazy.of(value)
        result = lazy.to_either()
        self.assertEqual(result.get(), value)

    def test_to_maybe(self):
        value = 1
        lazy = Lazy.of(value)
        result = lazy.to_maybe()
        self.assertEqual(result.get(), value)

    def test_to_try(self):
        value = 1
        lazy = Lazy.of(value)
        result = lazy.to_try()
        self.assertEqual(result.get(), value)

    def test_to_validation(self):
        value = 1
        lazy = Lazy.of(value)
        result = lazy.to_validation()
        self.assertEqual(result.get(), value)

    def test_str(self):
        value = 1
        lazy = Lazy.of(value)
        result = str(lazy)
        self.assertEqual(result, 'Lazy[fn=<function <lambda> at 0x0000019252D95370>, value=None, is_evaluated=False]')

    def test_eq(self):
        value = 1
        lazy = Lazy.of(value)
        result = lazy == lazy
        self.assertEqual(result, True)

if __name__ == '__main__':
    unittest.main()