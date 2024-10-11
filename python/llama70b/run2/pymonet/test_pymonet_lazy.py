import unittest
from pymonet.lazy import Lazy


class TestLazy(unittest.TestCase):
    def test_init(self):
        lazy = Lazy(lambda x: x + 1)
        self.assertIsNotNone(lazy.constructor_fn)
        self.assertFalse(lazy.is_evaluated)
        self.assertIsNone(lazy.value)

    def test_str_method(self):
        lazy = Lazy(lambda x: x + 1)
        result = lazy.__str__()
        self.assertEqual(result, 'Lazy[fn=<function <lambda> at 0x...>, value=None, is_evaluated=False]')

    def test_eq_method(self):
        lazy1 = Lazy(lambda x: x + 1)
        lazy2 = Lazy(lambda x: x + 1)
        self.assertTrue(lazy1 == lazy2)

    def test_of_method(self):
        lazy = Lazy.of(42)
        self.assertIsNotNone(lazy.constructor_fn)
        self.assertFalse(lazy.is_evaluated)
        self.assertIsNone(lazy.value)

    def test_compute_value_method(self):
        lazy = Lazy(lambda x: x + 1)
        result = lazy._compute_value(1)
        self.assertTrue(lazy.is_evaluated)
        self.assertEqual(result, 2)

    def test_map_method(self):
        lazy = Lazy(lambda x: x + 1)
        mapped_lazy = lazy.map(lambda x: x * 2)
        result = mapped_lazy.get(1)
        self.assertEqual(result, 4)

    def test_ap_method(self):
        lazy = Lazy(lambda x: x + 1)
        applicative = Lazy(lambda x: x * 2)
        result = lazy.ap(applicative).get(1)
        self.assertEqual(result, 3)

    def test_bind_method(self):
        lazy = Lazy(lambda x: x + 1)
        bound_lazy = lazy.bind(lambda x: Lazy(lambda y: x + y))
        result = bound_lazy.get(1)
        self.assertEqual(result, 3)

    def test_get_method(self):
        lazy = Lazy(lambda x: x + 1)
        result = lazy.get(1)
        self.assertEqual(result, 2)

    def test_to_box_method(self):
        lazy = Lazy(lambda x: x + 1)
        box = lazy.to_box(1)
        self.assertIsNotNone(box)

    def test_to_either_method(self):
        lazy = Lazy(lambda x: x + 1)
        either = lazy.to_either(1)
        self.assertIsNotNone(either)

    def test_to_maybe_method(self):
        lazy = Lazy(lambda x: x + 1)
        maybe = lazy.to_maybe(1)
        self.assertIsNotNone(maybe)

    def test_to_try_method(self):
        lazy = Lazy(lambda x: x + 1)
        try_ = lazy.to_try(1)
        self.assertIsNotNone(try_)

    def test_to_validation_method(self):
        lazy = Lazy(lambda x: x + 1)
        validation = lazy.to_validation(1)
        self.assertIsNotNone(validation)

if __name__ == '__main__':
    unittest.main()