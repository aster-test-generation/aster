import unittest
from pymonet.maybe import Maybe


class TestMaybe(unittest.TestCase):
    def test_just(self):
        maybe = Maybe.just(1)
        self.assertEqual(maybe.is_nothing, False)
        self.assertEqual(maybe.value, 1)

    def test_nothing(self):
        maybe = Maybe.nothing()
        self.assertEqual(maybe.is_nothing, True)
        self.assertEqual(maybe.value, 10)

    def test_eq(self):
        maybe1 = Maybe.just(1)
        maybe2 = Maybe.just(1)
        maybe3 = Maybe.just(2)
        maybe4 = Maybe.nothing()
        self.assertEqual(maybe1, maybe2)
        self.assertNotEqual(maybe1, maybe3)
        self.assertNotEqual(maybe1, maybe4)
        self.assertNotEqual(maybe4, maybe3)

    def test_map(self):
        maybe = Maybe.just(1).map(lambda x: x + 1)
        self.assertEqual(maybe.is_nothing, False)
        self.assertEqual(maybe.value, 2)

    def test_bind(self):
        maybe = Maybe.just(1).bind(lambda x: Maybe.just(x + 1))
        self.assertEqual(maybe.is_nothing, False)
        self.assertEqual(maybe.value, 2)

    def test_ap(self):
        maybe = Maybe.just(lambda x: x + 1).ap(Maybe.just(1))
        self.assertEqual(maybe.is_nothing, False)
        self.assertEqual(maybe.value, 2)

    def test_filter(self):
        maybe = Maybe.just(1).filter(lambda x: x > 0)
        self.assertEqual(maybe.is_nothing, False)
        self.assertEqual(maybe.value, 1)

    def test_get_or_else(self):
        maybe = Maybe.just(1).get_or_else(2)
        self.assertEqual(maybe, 1)
        maybe = Maybe.nothing().get_or_else(2)
        self.assertEqual(maybe, 2)

    def test_to_either(self):
        maybe = Maybe.just(1).to_either()
        self.assertEqual(maybe.is_left, True)
        self.assertEqual(maybe.value, 1)
        maybe = Maybe.nothing().to_either()
        self.assertEqual(maybe.is_left, True)
        self.assertEqual(maybe.value, None)

    def test_to_box(self):
        maybe = Maybe.just(1).to_box()
        self.assertEqual(maybe.is_nothing, True)
        self.assertEqual(maybe.value, 1)
        maybe = Maybe.nothing().to_box()
        self.assertEqual(maybe.is_nothing, True)
        self.assertEqual(maybe.value, None)

    def test_to_lazy(self):
        maybe = Maybe.just(1).to_lazy()
        self.assertEqual(maybe.is_nothing, True)
        self.assertEqual(maybe.value(), 1)
        maybe = Maybe.nothing().to_lazy()
        self.assertEqual(maybe.is_nothing, True)
        self.assertEqual(maybe.value(), None)

    def test_to_try(self):
        maybe = Maybe.just(1).to_try()
        self.assertEqual(maybe.is_success, True)
        self.assertEqual(maybe.value, 1)
        maybe = Maybe.nothing().to_try()
        self.assertEqual(maybe.is_success, False)
        self.assertEqual(maybe.value, None)

    def test_to_validation(self):
        maybe = Maybe.just(1).to_validation()
        self.assertEqual(maybe.is_success, True)
        self.assertEqual(maybe.value, 1)
        maybe = Maybe.nothing().to_validation()
        self.assertEqual(maybe.is_success, True)
        self.assertEqual(maybe.value, None)

if __name__ == '__main__':
    unittest.main()