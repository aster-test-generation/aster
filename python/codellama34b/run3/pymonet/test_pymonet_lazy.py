import unittest
from pymonet.lazy import *
from pymonet.lazy import Lazy


class TestLazy(unittest.TestCase):
    def test_init(self):
        instance = Lazy(lambda x: x + 1)
        self.assertEqual(instance.constructor_fn(1), 2)

    def test_of(self):
        instance = Lazy.of(1)
        self.assertEqual(instance.constructor_fn(1), 1)

    def test_str(self):
        instance = Lazy(lambda x: x + 1)
        self.assertEqual(instance.__str__(), 'Lazy[fn=<function TestLazy.test_str.<locals>.<lambda> at 0x7f33df045d80>, value=None, is_evaluated=False]')

    def test_eq(self):
        instance = Lazy(lambda x: x + 1)
        self.assertEqual(instance, Lazy(lambda x: x + 1))

    def test_map(self):
        instance = Lazy(lambda x: x + 1)
        self.assertEqual(instance.map(lambda x: x + 1), Lazy(lambda x: x + 1))

    def test_ap(self):
        instance = Lazy(lambda x: x + 1)
        self.assertEqual(instance.ap(Lazy(lambda x: x + 1)), Lazy(lambda x: x + 1))

    def test_bind(self):
        instance = Lazy(lambda x: x + 1)
        self.assertEqual(instance.bind(lambda x: Lazy(lambda x: x + 1)), Lazy(lambda x: x + 1))

    def test_get(self):
        instance = Lazy(lambda x: x + 1)
        self.assertEqual(instance.get(1), 2)

    def test_to_box(self):
        instance = Lazy(lambda x: x + 1)
        self.assertEqual(instance.to_box(1), Box(2))

    def test_to_either(self):
        instance = Lazy(lambda x: x + 1)
        self.assertEqual(instance.to_either(1), Right(2))

    def test_to_maybe(self):
        instance = Lazy(lambda x: x + 1)
        self.assertEqual(instance.to_maybe(1), Maybe.just(2))

    def test_to_try(self):
        instance = Lazy(lambda x: x + 1)
        self.assertEqual(instance.to_try(1), Try.pure(2))

    def test_to_validation(self):
        instance = Lazy(lambda x: x + 1)
        self.assertEqual(instance.to_validation(1), Validation(1))

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
        result = str(lazy)
        self.assertEqual(result, 'Lazy[fn={}, value={}, is_evaluated={}]'.format(constructor_fn, None, False))

    def test_eq(self):
        constructor_fn = lambda x: x + 1
        lazy = Lazy(constructor_fn)
        other = Lazy(constructor_fn)
        self.assertEqual(lazy, other)

    def test_map(self):
        constructor_fn = lambda x: x + 1
        lazy = Lazy(constructor_fn)
        mapper = lambda x: x * 2
        result = lazy.map(mapper)
        self.assertEqual(result.constructor_fn(1), 4)

    def test_ap(self):
        constructor_fn = lambda x: x + 1
        lazy = Lazy(constructor_fn)
        applicative = Lazy(lambda x: x * 2)
        result = lazy.ap(applicative)
        self.assertEqual(result.constructor_fn(1), 4)

    def test_bind(self):
        constructor_fn = lambda x: x + 1
        lazy = Lazy(constructor_fn)
        fn = lambda x: Lazy(lambda y: x * y)
        result = lazy.bind(fn)
        self.assertEqual(result.constructor_fn(2), 6)

    def test_get(self):
        constructor_fn = lambda x: x + 1
        lazy = Lazy(constructor_fn)
        result = lazy.get(1)
        self.assertEqual(result, 2)

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

    def test_to_maybe(self):
        constructor_fn = lambda x: x + 1
        lazy = Lazy(constructor_fn)
        from pymonet.maybe import Maybe
        result = lazy.to_maybe(1)
        self.assertEqual(result, Maybe.just(2))

    def test_to_try(self):
        constructor_fn = lambda x: x + 1
        lazy = Lazy(constructor_fn)
        from pymonet.monad_try import Try
        result = lazy.to_try(1)
        self.assertEqual(result, Try.of(constructor_fn, 1))

    def test_to_validation(self):
        constructor_fn = lambda x: x + 1
        lazy = Lazy(constructor_fn)
        from pymonet.validation import Validation
        result = lazy.to_validation(1)
        self.assertEqual(result, Validation.success(2))

if __name__ == '__main__':
    unittest.main()