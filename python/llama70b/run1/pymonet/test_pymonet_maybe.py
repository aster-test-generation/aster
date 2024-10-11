import unittest
from pymonet.maybe import Maybe


class TestMaybe(unittest.TestCase):
    def test_init(self):
        maybe = Maybe(1, False)
        self.assertFalse(maybe.is_nothing)
        self.assertEqual(maybe.value, 1)

    def test_eq(self):
        maybe1 = Maybe(1, False)
        maybe2 = Maybe(1, False)
        self.assertTrue(maybe1 == maybe2)

    def test_just(self):
        maybe = Maybe.just(1)
        self.assertFalse(maybe.is_nothing)
        self.assertEqual(maybe.value, 1)

    def test_nothing(self):
        maybe = Maybe.nothing()
        self.assertTrue(maybe.is_nothing)
        self.assertIsNone(maybe.value)

    def test_map(self):
        maybe = Maybe.just(1)
        result = maybe.map(lambda x: x * 2)
        self.assertFalse(result.is_nothing)
        self.assertEqual(result.value, 2)

    def test_bind(self):
        maybe = Maybe.just(1)
        result = maybe.bind(lambda x: Maybe.just(x * 2))
        self.assertFalse(result.is_nothing)
        self.assertEqual(result.value, 2)

    def test_ap(self):
        maybe = Maybe.just(1)
        applicative = Maybe.just(lambda x: x * 2)
        result = maybe.ap(applicative)
        self.assertFalse(result.is_nothing)
        self.assertEqual(result.value, 2)

    def test_filter(self):
        maybe = Maybe.just(1)
        result = maybe.filter(lambda x: x > 0)
        self.assertFalse(result.is_nothing)
        self.assertEqual(result.value, 1)

    def test_get_or_else(self):
        maybe = Maybe.just(1)
        result = maybe.get_or_else(0)
        self.assertEqual(result, 1)

    def test_to_either(self):
        maybe = Maybe.just(1)
        result = maybe.to_either()
        self.assertIsInstance(result, Right)
        self.assertEqual(result.value, 1)

    def test_to_box(self):
        maybe = Maybe.just(1)
        result = maybe.to_box()
        self.assertIsInstance(result, Box)
        self.assertEqual(result.value, 1)

    def test_to_lazy(self):
        maybe = Maybe.just(1)
        result = maybe.to_lazy()
        self.assertIsInstance(result, Lazy)
        self.assertEqual(result.value, 1)

    def test_to_try(self):
        maybe = Maybe.just(1)
        result = maybe.to_try()
        self.assertIsInstance(result, Try)
        self.assertEqual(result.value, 1)

    def test_to_validation(self):
        maybe = Maybe.just(1)
        result = maybe.to_validation()
        self.assertIsInstance(result, Validation)
        self.assertEqual(result.value, 1)

    def test_private_init(self):
        maybe = Maybe.__init__(Maybe(1, False), 1, False)
        self.assertFalse(maybe.is_nothing)
        self.assertEqual(maybe.value, 1)

    def test_str_method(self):
        maybe = Maybe.just(1)
        result = maybe.__str__()
        self.assertEqual(result, "Maybe(1)")

    def test_repr_method(self):
        maybe = Maybe.just(1)
        result = maybe.__repr__()
        self.assertEqual(result, "Maybe(1)")

if __name__ == '__main__':
    unittest.main()