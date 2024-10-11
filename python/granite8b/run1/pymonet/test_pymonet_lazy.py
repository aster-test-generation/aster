import unittest
from pymonet.lazy import Lazy


class TestLazy(unittest.TestCase):
    def test_lazy_init(self):
        lazy = Lazy(lambda x: x + 1)
        self.assertEqual(lazy.constructor_fn(5), 6)
        self.assertFalse(lazy.is_evaluated)
        self.assertIsNone(lazy.value)

    def test_lazy_str(self):
        lazy = Lazy(lambda x: x + 1)
        self.assertEqual(str(lazy), 'Lazy[fn=<function <lambda> at 0x7f12c594e2b0>, value=None, is_evaluated=False]')

    def test_lazy_eq(self):
        lazy1 = Lazy(lambda x: x + 1)
        lazy2 = Lazy(lambda x: x + 1)
        lazy3 = Lazy(lambda x: x + 2)
        self.assertEqual(lazy1.value, lazy2.value)
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
        lazy2 = Lazy.of(2)
        lazy3 = lazy1.ap(lazy2)
        self.assertEqual(lazy3.constructor_fn, lambda x: (x + 1)(2))
        self.assertFalse(lazy3.is_evaluated)
        self.assertIsNone(lazy3.value)

    def test_lazy_bind(self):
        lazy = Lazy(lambda x: x + 1).bind(lambda x: Lazy(lambda y: x + y))
        self.assertEqual(lazy.constructor_fn, lambda x: (x + 1)(x + 1))
        self.assertFalse(lazy.is_evaluated)
        self.assertIsNone(lazy.value)

    def test_lazy_get(self):
        lazy = Lazy(lambda x: x + 1)
        self.assertEqual(lazy.get(10), 11)
        self.assertTrue(lazy.is_evaluated)
        self.assertEqual(lazy.value, 11)

    def test_lazy_to_box(self):
        lazy = Lazy(lambda x: x + 1).to_box(10)
        self.assertEqual(lazy.value, 11)

    def test_lazy_to_either(self):
        lazy = Lazy(lambda x: x + 1).to_either(10)
        self.assertEqual(lazy.value, 11)

    def test_lazy_to_maybe(self):
        lazy = Lazy(lambda x: x + 1).to_maybe(10)
        self.assertEqual(lazy.value, 11)

    def test_lazy_to_try(self):
        lazy = Lazy(lambda x: x + 1).to_try(10)
        self.assertEqual(lazy.value, 11)

    def test_lazy_to_validation(self):
        lazy = Lazy(lambda x: x + 1).to_validation(10)
        self.assertEqual(lazy.value, 11)

if __name__ == '__main__':
    unittest.main()