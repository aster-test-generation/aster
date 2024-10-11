import unittest
from pymonet.lazy import Lazy


class TestLazy(unittest.TestCase):
    def test_lazy_init(self):
        lazy = Lazy(lambda x: x + 1)
        self.assertEqual(lazy.is_evaluated, False)
        self.assertEqual(lazy.value, None)
        self.assertEqual(lazy.constructor_fn(5), 6)

    def test_lazy_str(self):
        lazy = Lazy(lambda x: x + 1)
        self.assertEqual(str(lazy), 'Lazy[fn=<function <lambda> at 0x7f1633027300>, value=None, is_evaluated=False]')

    def test_lazy_eq(self):
        lazy1 = Lazy(lambda x: x + 1)
        lazy2 = Lazy(lambda x: x + 1)
        lazy3 = Lazy(lambda x: x + 2)
        self.assertEqual(lazy1.force(), lazy2.force())
        self.assertNotEqual(lazy1, lazy3)

    def test_lazy_of(self):
        lazy = Lazy.of(10)
        self.assertEqual(lazy.is_evaluated, False)
        self.assertEqual(lazy.value, 10)
        self.assertEqual(lazy.constructor_fn, lambda *args: 10)

    def test_lazy_map(self):
        lazy = Lazy(lambda x: x + 1).map(lambda x: x * 2)
        self.assertEqual(lazy.is_evaluated, False)
        self.assertEqual(lazy.value, None)
        self.assertEqual(lazy.constructor_fn, lambda x: x + 1)

    def test_lazy_ap(self):
        lazy1 = Lazy(lambda x: x + 1)
        lazy2 = Lazy.of(2)
        lazy3 = lazy1.ap(lazy2)
        self.assertEqual(lazy3.is_evaluated, False)
        self.assertEqual(lazy3.value, None)
        self.assertEqual(lazy3.constructor_fn(5), 6)

    def test_lazy_bind(self):
        lazy1 = Lazy(lambda x: x + 1)
        lazy2 = lazy1.bind(lambda x: Lazy(lambda y: x + y))
        self.assertEqual(lazy2.is_evaluated, False)
        self.assertEqual(lazy2.value, None)
        self.assertEqual(lazy2.constructor_fn(5), 6)

    def test_lazy_get(self):
        lazy = Lazy(lambda x: x + 1)
        self.assertEqual(lazy.get(10), 11)

    def test_lazy_to_box(self):
        lazy = Lazy(lambda x: x + 1)
        self.assertEqual(lazy.to_box(10), 10)

    def test_lazy_to_either(self):
        lazy = Lazy(lambda x: x + 1)
        self.assertEqual(lazy.to_either(10), Right(10))

    def test_lazy_to_maybe(self):
        lazy = Lazy(lambda x: x + 1)
        self.assertEqual(lazy.to_maybe(10), maybe.Just(10))

    def test_lazy_to_try(self):
        lazy = Lazy(lambda x: x + 1)
        self.assertEqual(lazy.to_try(10), 10)

    def test_lazy_to_validation(self):
        lazy = Lazy(lambda x: x + 1)
        self.assertEqual(lazy.to_validation(10), 10)

class TestLazy(unittest.TestCase):
    def test_lazy_init(self):
        lazy = Lazy(lambda x: x + 1)
        self.assertEqual(lazy.constructor_fn, lambda x: x + 1)
        self.assertFalse(lazy.is_evaluated)
        self.assertIsNone(lazy.value)

    def test_lazy_str(self):
        lazy = Lazy(lambda x: x + 1)
        self.assertEqual(str(lazy), 'Lazy[fn=<function <lambda> at 0x7f25526070d0>, value=None, is_evaluated=False]')

    def test_lazy_eq(self):
        lazy1 = Lazy(lambda x: x + 1)
        lazy2 = Lazy(lambda x: x + 1)
        lazy3 = Lazy(lambda x: x - 1)
        self.assertEqual(lazy1, lazy2)
        self.assertNotEqual(lazy1, lazy3)

    def test_lazy_of(self):
        lazy = Lazy.of(10)
        self.assertEqual(lazy.constructor_fn, lambda *args: 10)
        self.assertTrue(lazy.is_evaluated)
        self.assertEqual(lazy.value, 10)

    def test_lazy_map(self):
        lazy = Lazy(lambda x: x + 1).map(lambda x: x * 2)
        self.assertEqual(lazy.constructor_fn, lambda x: (x + 1) * 2)
        self.assertFalse(lazy.is_evaluated)
        self.assertIsNone(lazy.value)

    def test_lazy_ap(self):
        lazy1 = Lazy(lambda x: x + 1)
        lazy2 = Lazy(lambda x: x * 2)
        lazy3 = lazy1.ap(lazy2)
        self.assertEqual(lazy3.constructor_fn, lambda x: (x + 1) * 2)
        self.assertFalse(lazy3.is_evaluated)
        self.assertIsNone(lazy3.value)

    def test_lazy_bind(self):
        lazy1 = Lazy(lambda x: x + 1)
        lazy2 = lazy1.bind(lambda x: Lazy(lambda y: x + y))
        self.assertEqual(lazy2.constructor_fn, lambda x: (x + 1) + 2)
        self.assertFalse(lazy2.is_evaluated)
        self.assertIsNone(lazy2.value)

    def test_lazy_get(self):
        lazy = Lazy(lambda x: x + 1)
        self.assertEqual(lazy.get(10), 11)
        self.assertTrue(lazy.is_evaluated)
        self.assertEqual(lazy.value, 11)

    def test_lazy_to_box(self):
        lazy = Lazy(lambda x: x + 1)
        box = lazy.to_box(10)
        self.assertEqual(box.unwrap(), 11)

    def test_lazy_to_either(self):
        lazy = Lazy(lambda x: x + 1)
        either = lazy.to_either(10)
        self.assertEqual(either.unwrap(), 11)

    def test_lazy_to_maybe(self):
        lazy = Lazy(lambda x: x + 1)
        maybe = lazy.to_maybe(10)
        self.assertEqual(maybe.unwrap(), 11)

    def test_lazy_to_try(self):
        lazy = Lazy(lambda x: x + 1)
        try_ = lazy.to_try(10)
        self.assertEqual(try_.unwrap(), 11)

    def test_lazy_to_validation(self):
        lazy = Lazy(lambda x: x + 1)
        validation = lazy.to_validation(10)
        self.assertEqual(validation.unwrap(), 11)

if __name__ == '__main__':
    unittest.main()