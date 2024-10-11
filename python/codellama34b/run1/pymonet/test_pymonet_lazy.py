import unittest
from pymonet.lazy import *



class TestLazy(unittest.TestCase):
    def test_init(self):
        instance = Lazy(lambda x: x)
        self.assertEqual(instance.constructor_fn, lambda x: x)
        self.assertEqual(instance.is_evaluated, False)
        self.assertEqual(instance.value, None)

    def test_of(self):
        result = Lazy.of(1)
        self.assertEqual(result.constructor_fn, lambda *args: 1)
        self.assertEqual(result.is_evaluated, False)
        self.assertEqual(result.value, None)

    def test_str(self):
        instance = Lazy(lambda x: x)
        result = instance.__str__()
        self.assertEqual(result, 'Lazy[fn=<function TestLazy.test_str.<locals>.<lambda> at 0x7f7fb81e96c0>, value=None, is_evaluated=False]')

    def test_eq(self):
        instance = Lazy(lambda x: x)
        result = instance.__eq__(instance)
        self.assertEqual(result, True)

    def test_compute_value(self):
        instance = Lazy(lambda x: x)
        result = instance._compute_value(1)
        self.assertEqual(result, 1)
        self.assertEqual(instance.is_evaluated, True)
        self.assertEqual(instance.value, 1)

    def test_map(self):
        instance = Lazy(lambda x: x)
        result = instance.map(lambda x: x + 1)
        self.assertEqual(result.constructor_fn, lambda *args: (lambda x: x + 1)(1))
        self.assertEqual(result.is_evaluated, False)
        self.assertEqual(result.value, None)

    def test_ap(self):
        instance = Lazy(lambda x: x)
        result = instance.ap(1)
        self.assertEqual(result.constructor_fn, lambda *args: 1)
        self.assertEqual(result.is_evaluated, False)
        self.assertEqual(result.value, None)

    def test_bind(self):
        instance = Lazy(lambda x: x)
        result = instance.bind(lambda x: Lazy(lambda y: y))
        self.assertEqual(result.constructor_fn, lambda *args: (lambda x: x)(1))
        self.assertEqual(result.is_evaluated, False)
        self.assertEqual(result.value, None)

    def test_get(self):
        instance = Lazy(lambda x: x)
        result = instance.get(1)
        self.assertEqual(result, 1)
        self.assertEqual(instance.is_evaluated, True)
        self.assertEqual(instance.value, 1)

    def test_to_box(self):
        from pymonet.box import Box
        instance = Lazy(lambda x: x)
        result = instance.to_box(1)
        self.assertEqual(result, Box(1))

    def test_to_either(self):
        from pymonet.either import Right
        instance = Lazy(lambda x: x)
        result = instance.to_either(1)
        self.assertEqual(result, Right(1))

    def test_to_maybe(self):
        from pymonet.maybe import Maybe
        instance = Lazy(lambda x: x)
        result = instance.to_maybe(1)
        self.assertEqual(result, Maybe.just(1))

    def test_to_try(self):
        from pymonet.monad_try import Try
        instance = Lazy(lambda x: x)
        result = instance.to_try(1)
        self.assertEqual(result, Try.of(lambda x: x, 1))

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


class TestLazy(unittest.TestCase):
    def test_lazy_of(self):
        result = Lazy.of(1)
        self.assertEqual(result, Lazy(lambda *args: 1))

    def test_lazy_map(self):
        result = Lazy.of(1).map(lambda x: x + 1)
        self.assertEqual(result, Lazy(lambda *args: 2))

    def test_lazy_ap(self):
        result = Lazy.of(1).ap(Lazy.of(lambda x: x + 1))
        self.assertEqual(result, Lazy(lambda *args: 2))

    def test_lazy_bind(self):
        result = Lazy.of(1).bind(lambda x: Lazy.of(x + 1))
        self.assertEqual(result, Lazy(lambda *args: 2))

    def test_lazy_get(self):
        result = Lazy.of(1).get()
        self.assertEqual(result, 1)

    def test_lazy_to_box(self):
        from pymonet.box import Box
        result = Lazy.of(1).to_box()
        self.assertEqual(result, Box(1))

    def test_lazy_to_either(self):
        from pymonet.either import Right
        result = Lazy.of(1).to_either()
        self.assertEqual(result, Right(1))

    def test_lazy_to_maybe(self):
        from pymonet.maybe import Maybe
        result = Lazy.of(1).to_maybe()
        self.assertEqual(result, Maybe.just(1))

    def test_lazy_to_try(self):
        from pymonet.monad_try import Try
        result = Lazy.of(1).to_try()
        self.assertEqual(result, Try.of(lambda: 1))

    def test_lazy_to_validation(self):
        from pymonet.validation import Validation
        result = Lazy.of(1).to_validation()
        self.assertEqual(result, Validation.success(1))

    def test_lazy_eq(self):
        result = Lazy.of(1) == Lazy.of(1)
        self.assertTrue(result)

    def test_lazy_str(self):
        result = str(Lazy.of(1))
        self.assertEqual(result, 'Lazy[fn=<function <lambda> at 0x1056873a8>, value=None, is_evaluated=False]')

    def test_lazy_repr(self):
        result = repr(Lazy.of(1))
        self.assertEqual(result, 'Lazy[fn=<function <lambda> at 0x1056873a8>, value=None, is_evaluated=False]')

    def test_lazy_init(self):
        result = Lazy(lambda x: x + 1)
        self.assertEqual(result, Lazy(lambda x: x + 1))

    def test_lazy_private_method(self):
        result = Lazy(lambda x: x + 1)._Lazy__compute_value(1)
        self.assertEqual(result, 2)

if __name__ == '__main__':
    unittest.main()