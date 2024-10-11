import unittest
from pymonet.maybe import Maybe

class TestMaybe(unittest.TestCase):
    def test_just(self):
        maybe = Maybe.just(1)
        self.assertEqual(maybe.value, 1)
        self.assertFalse(maybe.is_nothing)

    def test_nothing(self):
        maybe = Maybe.nothing()
        self.assertIsNone(maybe.value)
        self.assertTrue(maybe.is_nothing)

    def test_eq(self):
        maybe1 = Maybe.just(1)
        maybe2 = Maybe.just(1)
        maybe3 = Maybe.just(2)
        maybe4 = Maybe.nothing()
        self.assertEqual(maybe1, maybe2)
        self.assertNotEqual(maybe1, maybe3)
        self.assertNotEqual(maybe1, maybe4)
        self.assertNotEqual(maybe4, maybe1)

    def test_map(self):
        maybe = Maybe.just(1).map(lambda x: x + 1)
        self.assertEqual(maybe.value, 2)

    def test_bind(self):
        maybe = Maybe.just(1).bind(lambda x: Maybe.just(x + 1))
        self.assertEqual(maybe.value, 2)

    def test_ap(self):
        maybe = Maybe.just(lambda x: x + 1).ap(Maybe.just(1))
        self.assertEqual(maybe.value, 2)

    def test_filter(self):
        maybe = Maybe.just(1).filter(lambda x: x > 0)
        self.assertEqual(maybe.value, 1)
        maybe = Maybe.just(-1).filter(lambda x: x > 0)
        self.assertTrue(maybe.is_nothing)

    def test_get_or_else(self):
        maybe = Maybe.just(1).get_or_else(2)
        self.assertEqual(maybe, 1)
        maybe = Maybe.nothing().get_or_else(2)
        self.assertEqual(maybe, 2)

    def test_to_either(self):
        maybe = Maybe.just(1).to_either()
        self.assertEqual(maybe.value, 1)
        self.assertFalse(maybe.is_left)
        maybe = Maybe.nothing().to_either()
        self.assertIsNone(maybe.value)
        self.assertTrue(maybe.is_left)

    def test_to_box(self):
        maybe = Maybe.just(1).to_box()
        self.assertEqual(maybe.value, 1)
        maybe = Maybe.nothing().to_box()
        self.assertIsNone(maybe.value)

    def test_to_lazy(self):
        maybe = Maybe.just(1).to_lazy()
        self.assertEqual(maybe.value, 1)
        maybe = Maybe.nothing().to_lazy()
        self.assertIsNone(maybe.value)

    def test_to_try(self):
        maybe = Maybe.just(1).to_try()
        self.assertEqual(maybe.value, 1)
        self.assertTrue(maybe.is_success)
        maybe = Maybe.nothing().to_try()
        self.assertIsNone(maybe.value)
        self.assertFalse(maybe.is_success)

    def test_to_validation(self):
        maybe = Maybe.just(1).to_validation()
        self.assertEqual(maybe.value, 1)
        self.assertTrue(maybe.is_success)
        maybe = Maybe.nothing().to_validation()
        self.assertIsNone(maybe.value)
        self.assertFalse(maybe.is_success)

if __name__ == '__main__':
    unittest.main()