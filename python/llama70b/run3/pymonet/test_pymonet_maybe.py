import unittest
from pymonet.maybe import Maybe


class TestMaybe(unittest.TestCase):
    def test_init(self):
        maybe = Maybe(1, False)
        self.assertFalse(maybe.is_nothing)
        self.assertEqual(maybe.value, 1)

    def test_init_nothing(self):
        maybe = Maybe(None, True)
        self.assertTrue(maybe.is_nothing)
        with self.assertRaises(AttributeError):
            maybe.value

    def test_eq(self):
        maybe1 = Maybe(1, False)
        maybe2 = Maybe(1, False)
        self.assertTrue(maybe1 == maybe2)

    def test_eq_nothing(self):
        maybe1 = Maybe(None, True)
        maybe2 = Maybe(None, True)
        self.assertTrue(maybe1 == maybe2)

    def test_eq_different(self):
        maybe1 = Maybe(1, False)
        maybe2 = Maybe(2, False)
        self.assertFalse(maybe1 == maybe2)

    def test_just(self):
        maybe = Maybe.just(1)
        self.assertFalse(maybe.is_nothing)
        self.assertEqual(maybe.value, 1)

    def test_nothing(self):
        maybe = Maybe.nothing()
        self.assertTrue(maybe.is_nothing)
        with self.assertRaises(AttributeError):
            maybe.value

    def test_map(self):
        maybe = Maybe.just(1)
        result = maybe.map(lambda x: x * 2)
        self.assertFalse(result.is_nothing)
        self.assertEqual(result.value, 2)

    def test_map_nothing(self):
        maybe = Maybe.nothing()
        result = maybe.map(lambda x: x * 2)
        self.assertTrue(result.is_nothing)
        with self.assertRaises(AttributeError):
            result.value

    def test_bind(self):
        maybe = Maybe.just(1)
        result = maybe.bind(lambda x: Maybe.just(x * 2))
        self.assertFalse(result.is_nothing)
        self.assertEqual(result.value, 2)

    def test_bind_nothing(self):
        maybe = Maybe.nothing()
        result = maybe.bind(lambda x: Maybe.just(x * 2))
        self.assertTrue(result.is_nothing)
        with self.assertRaises(AttributeError):
            result.value

    def test_ap(self):
        maybe = Maybe.just(1)
        applicative = Maybe.just(lambda x: x * 2)
        result = maybe.ap(applicative)
        self.assertFalse(result.is_nothing)
        self.assertEqual(result.value, 2)

    def test_ap_nothing(self):
        maybe = Maybe.nothing()
        applicative = Maybe.just(lambda x: x * 2)
        result = maybe.ap(applicative)
        self.assertTrue(result.is_nothing)
        with self.assertRaises(AttributeError):
            result.value

    def test_filter(self):
        maybe = Maybe.just(1)
        result = maybe.filter(lambda x: x > 0)
        self.assertFalse(result.is_nothing)
        self.assertEqual(result.value, 1)

    def test_filter_nothing(self):
        maybe = Maybe.just(1)
        result = maybe.filter(lambda x: x < 0)
        self.assertTrue(result.is_nothing)
        with self.assertRaises(AttributeError):
            result.value

    def test_get_or_else(self):
        maybe = Maybe.just(1)
        result = maybe.get_or_else(2)
        self.assertEqual(result, 1)

    def test_get_or_else_nothing(self):
        maybe = Maybe.nothing()
        result = maybe.get_or_else(2)
        self.assertEqual(result, 2)

    def test_to_either(self):
        maybe = Maybe.just(1)
        result = maybe.to_either()
        self.assertIsInstance(result, Right)
        self.assertEqual(result.value, 1)

    def test_to_either_nothing(self):
        maybe = Maybe.nothing()
        result = maybe.to_either()
        self.assertIsInstance(result, Left)
        self.assertIsNone(result.value)

    def test_to_box(self):
        maybe = Maybe.just(1)
        result = maybe.to_box()
        self.assertIsInstance(result, Box)
        self.assertEqual(result.value, 1)

    def test_to_box_nothing(self):
        maybe = Maybe.nothing()
        result = maybe.to_box()
        self.assertIsInstance(result, Box)
        self.assertIsNone(result.value)

    def test_to_lazy(self):
        maybe = Maybe.just(1)
        result = maybe.to_lazy()
        self.assertIsInstance(result, Lazy)
        self.assertEqual(result.value, 1)

    def test_to_lazy_nothing(self):
        maybe = Maybe.nothing()
        result = maybe.to_lazy()
        self.assertIsInstance(result, Lazy)
        self.assertIsNone(result.value)

    def test_to_try(self):
        maybe = Maybe.just(1)
        result = maybe.to_try()
        self.assertIsInstance(result, Try)
        self.assertEqual(result.value, 1)
        self.assertTrue(result.is_success)

if __name__ == '__main__':
    unittest.main()