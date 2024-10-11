import unittest
from pymonet.lazy import Lazy


class TestLazy(unittest.TestCase):
    def test_init(self):
        lazy = Lazy(lambda x: x + 1)
        self.assertEqual(lazy.constructor_fn(1), 2)
        self.assertFalse(lazy.is_evaluated)
        self.assertIsNone(lazy.value)

    def test_str(self):
        lazy = Lazy(lambda x: x + 1)
        self.assertEqual(str(lazy), 'Lazy[fn=<function <lambda> at 0x7f4a1e2d4e10>, value=None, is_evaluated=False]')

    def test_eq(self):
        lazy1 = Lazy(lambda x: x + 1)
        lazy2 = Lazy(lambda x: x + 1)
        self.assertEqual(lazy1, lazy2)

    def test_of(self):
        lazy = Lazy.of(1)
        self.assertEqual(lazy.get(), 1)

    def test_map(self):
        lazy = Lazy(lambda x: x + 1).map(lambda x: x * 2)
        self.assertEqual(lazy.get(1), 4)

    def test_ap(self):
        lazy1 = Lazy(lambda x: x + 1)
        lazy2 = Lazy(lambda x: x * 2)
        lazy3 = lazy1.ap(lazy2)
        self.assertEqual(lazy3.get(1), 3)

    def test_bind(self):
        lazy1 = Lazy(lambda x: x + 1)
        lazy2 = Lazy(lambda x: x * 2)
        lazy3 = lazy1.bind(lambda x: lazy2)
        self.assertEqual(lazy3.get(1), 4)

    def test_get(self):
        lazy = Lazy(lambda x: x + 1)
        self.assertEqual(lazy.get(1), 2)
        self.assertTrue(lazy.is_evaluated)
        self.assertEqual(lazy.get(1), 2)

    def test_to_box(self):
        lazy = Lazy(lambda x: x + 1)
        self.assertEqual(lazy.to_box(1).get(), 2)

    def test_to_either(self):
        lazy = Lazy(lambda x: x + 1)
        self.assertEqual(lazy.to_either(1).get(), 2)

    def test_to_maybe(self):
        lazy = Lazy(lambda x: x + 1)
        self.assertEqual(lazy.to_maybe(1).get(), 2)

    def test_to_try(self):
        lazy = Lazy(lambda x: x + 1)
        self.assertEqual(lazy.to_try(1).get(), 2)

    def test_to_validation(self):
        lazy = Lazy(lambda x: x + 1)
        self.assertEqual(lazy.to_validation(1).get(), 2)

if __name__ == '__main__':
    unittest.main()