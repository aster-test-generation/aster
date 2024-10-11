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
        self.assertEqual(str(lazy), 'Lazy[fn=<lambda>, value=None, is_evaluated=False]')

    def test_eq(self):
        lazy1 = Lazy(lambda x: x + 1)
        lazy2 = Lazy(lambda x: x + 1)
        self.assertEqual(lazy1, lazy2)

    def test_of(self):
        lazy = Lazy.of(1)
        self.assertEqual(lazy.get(), 1)

    def test_map(self):
        lazy = Lazy(lambda x: x + 1)
        mapped_lazy = lazy.map(lambda x: x * 2)
        self.assertEqual(mapped_lazy.get(1), 4)

    def test_ap(self):
        lazy1 = Lazy(lambda x: x + 1)
        lazy2 = Lazy(lambda x: x * 2)
        applied_lazy = lazy1.ap(lazy2)
        self.assertEqual(applied_lazy.get(1), 3)

    def test_bind(self):
        lazy = Lazy(lambda x: x + 1)
        bound_lazy = lazy.bind(lambda x: Lazy(lambda y: x * y))
        self.assertEqual(bound_lazy.get(2), 4)

    def test_get(self):
        lazy = Lazy(lambda x: x + 1)
        self.assertEqual(lazy.get(1), 2)
        self.assertTrue(lazy.is_evaluated)
        self.assertEqual(lazy.get(2), 3)

    def test_to_box(self):
        lazy = Lazy(lambda x: x + 1)
        box = lazy.to_box(1)
        self.assertEqual(box.value, 2)

    def test_to_either(self):
        lazy = Lazy(lambda x: x + 1)
        either = lazy.to_either(1)
        self.assertEqual(either.value, 2)

    def test_to_maybe(self):
        lazy = Lazy(lambda x: x + 1)
        maybe = lazy.to_maybe(1)
        self.assertEqual(maybe.value, 2)

    def test_to_try(self):
        lazy = Lazy(lambda x: x + 1)
        try_ = lazy.to_try(1)
        self.assertEqual(try_.value, 2)

    def test_to_validation(self):
        lazy = Lazy(lambda x: x + 1)
        validation = lazy.to_validation(1)
        self.assertEqual(validation.value, 2)

if __name__ == '__main__':
    unittest.main()