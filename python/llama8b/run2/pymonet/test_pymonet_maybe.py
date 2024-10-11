import unittest
from pymonet.maybe import Maybe


class TestMaybe(unittest.TestCase):
    def test_init(self):
        maybe = Maybe(1, False)
        self.assertFalse(maybe.is_nothing)
        self.assertEqual(maybe.value, 1)

    def test_init_is_nothing(self):
        maybe = Maybe(None, True)
        self.assertTrue(maybe.is_nothing)
        self.assertIsNone(maybe.value)

    def test_eq(self):
        maybe1 = Maybe(1, False)
        maybe2 = Maybe(1, False)
        maybe3 = Maybe(2, False)
        self.assertTrue(maybe1 == maybe2)
        self.assertFalse(maybe1 == maybe3)
        self.assertFalse(maybe1 == None)

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
        result = maybe.map(lambda x: x + 1)
        self.assertFalse(result.is_nothing)
        self.assertEqual(result.value, 2)

    def test_map_is_nothing(self):
        maybe = Maybe.nothing()
        result = maybe.map(lambda x: x + 1)
        self.assertTrue(result.is_nothing)
        self.assertIsNone(result.value)

    def test_bind(self):
        maybe = Maybe.just(1)
        result = maybe.bind(lambda x: Maybe.just(x + 1))
        self.assertFalse(result.is_nothing)
        self.assertEqual(result.value, 2)

    def test_bind_is_nothing(self):
        maybe = Maybe.nothing()
        result = maybe.bind(lambda x: Maybe.just(x + 1))
        self.assertTrue(result.is_nothing)
        self.assertIsNone(result.value)

    def test_ap(self):
        maybe = Maybe.just(1)
        applicative = Maybe.just(lambda x: x + 1)
        result = maybe.ap(applicative)
        self.assertFalse(result.is_nothing)
        self.assertEqual(result.value(), 2)

    def test_filter(self):
        maybe = Maybe.just(1)
        result = maybe.filter(lambda x: x > 0)
        self.assertFalse(result.is_nothing)
        self.assertEqual(result.value, 1)

    def test_filter_is_nothing(self):
        maybe = Maybe.nothing()
        result = maybe.filter(lambda x: x > 0)
        self.assertTrue(result.is_nothing)
        self.assertIsNone(result.value)

    def test_get_or_else(self):
        maybe = Maybe.just(1)
        result = maybe.get_or_else(2)
        self.assertEqual(result, 1)

        maybe = Maybe.nothing()
        result = maybe.get_or_else(2)
        self.assertEqual(result, 2)

    def test_to_either(self):
        maybe = Maybe.just(1)
        result = maybe.to_either()
        self.assertIsInstance(result, object)

    def test_to_box(self):
        maybe = Maybe.just(1)
        result = maybe.to_box()
        self.assertIsInstance(result, object)

    def test_to_lazy(self):
        maybe = Maybe.just(1)
        result = maybe.to_lazy()
        self.assertIsInstance(result, object)

    def test_to_try(self):
        maybe = Maybe.just(1)
        result = maybe.to_try()
        self.assertIsInstance(result, object)

    def test_to_validation(self):
        maybe = Maybe.just(1)
        result = maybe.to_validation()
        self.assertIsInstance(result, object)

if __name__ == '__main__':
    unittest.main()