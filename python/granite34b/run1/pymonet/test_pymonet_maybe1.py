import unittest
from pymonet.maybe import Maybe

class TestMaybe(unittest.TestCase):
    def test_just(self):
        maybe = Maybe.just(5)
        self.assertEqual(maybe.value, 5)
        self.assertFalse(maybe.is_nothing)

    def test_nothing(self):
        maybe = Maybe.nothing()
        self.assertTrue(maybe.is_nothing)

    def test_map(self):
        maybe = Maybe.just(5)
        result = maybe.map(lambda x: x * 2)
        self.assertEqual(result.value, 10)
        self.assertFalse(result.is_nothing)

        maybe = Maybe.nothing()
        result = maybe.map(lambda x: x * 2)
        self.assertTrue(result.is_nothing)

    def test_bind(self):
        maybe = Maybe.just(5)
        result = maybe.bind(lambda x: Maybe.just(x * 2))
        self.assertEqual(result.value, 10)
        self.assertFalse(result.is_nothing)

        maybe = Maybe.nothing()
        result = maybe.bind(lambda x: Maybe.just(x * 2))
        self.assertTrue(result.is_nothing)

    def test_ap(self):
        maybe = Maybe.just(lambda x: x * 2)
        applicative = Maybe.just(5)
        result = maybe.ap(applicative)
        self.assertEqual(result.value, 10)
        self.assertFalse(result.is_nothing)

        maybe = Maybe.nothing()
        applicative = Maybe.just(5)
        result = maybe.ap(applicative)
        self.assertTrue(result.is_nothing)

    def test_filter(self):
        maybe = Maybe.just(5)
        result = maybe.filter(lambda x: x > 3)
        self.assertEqual(result.value, 5)
        self.assertFalse(result.is_nothing)

        maybe = Maybe.just(2)
        result = maybe.filter(lambda x: x > 3)
        self.assertTrue(result.is_nothing)

        maybe = Maybe.nothing()
        result = maybe.filter(lambda x: x > 3)
        self.assertTrue(result.is_nothing)

    def test_get_or_else(self):
        maybe = Maybe.just(5)
        result = maybe.get_or_else(10)
        self.assertEqual(result, 5)

        maybe = Maybe.nothing()
        result = maybe.get_or_else(10)
        self.assertEqual(result, 10)

    def test_to_either(self):
        maybe = Maybe.just(5)
        result = maybe.to_either()
        self.assertEqual(result.value, 5)

        maybe = Maybe.nothing()
        result = maybe.to_either()
        self.assertEqual(result.value, None)

    def test_to_box(self):
        maybe = Maybe.just(5)
        result = maybe.to_box()
        self.assertEqual(result.value, 5)

        maybe = Maybe.nothing()
        result = maybe.to_box()
        self.assertEqual(result.value, None)

    def test_to_lazy(self):
        maybe = Maybe.just(5)
        result = maybe.to_lazy()
        self.assertEqual(result.value, 5)

        maybe = Maybe.nothing()
        result = maybe.to_lazy()
        self.assertEqual(result.value, None)

    def test_to_try(self):
        maybe = Maybe.just(5)
        result = maybe.to_try()
        self.assertEqual(result.value, 5)
        self.assertTrue(result.is_success)

        maybe = Maybe.nothing()
        result = maybe.to_try()
        self.assertEqual(result.value, None)
        self.assertFalse(result.is_success)

    def test_to_validation(self):
        maybe = Maybe.just(5)
        result = maybe.to_validation()
        self.assertEqual(result.value, 5)

        maybe = Maybe.nothing()
        result = maybe.to_validation()
        self.assertEqual(result.value, None)

if __name__ == '__main__':
    unittest.main()