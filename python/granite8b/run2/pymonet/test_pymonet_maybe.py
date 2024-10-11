import unittest
from pymonet.maybe import Maybe


class TestMaybe(unittest.TestCase):
    def test_just_method(self):
        maybe_value = Maybe.just(5)
        self.assertEqual(maybe_value.is_nothing, False)
        self.assertEqual(maybe_value.value, 5)

    def test_nothing_method(self):
        maybe_value = Maybe.nothing()
        self.assertEqual(maybe_value.is_nothing, True)
        self.assertEqual(maybe_value.value, 10)

    def test_eq_method(self):
        maybe_value1 = Maybe.just(5)
        maybe_value2 = Maybe.just(5)
        maybe_value3 = Maybe.just(10)
        maybe_value4 = Maybe.nothing()
        self.assertEqual(maybe_value1, maybe_value2)
        self.assertNotEqual(maybe_value1, maybe_value3)
        self.assertNotEqual(maybe_value1, maybe_value4)
        self.assertNotEqual(maybe_value4, maybe_value2)

    def test_map_method(self):
        maybe_value = Maybe.just(5).map(lambda x: x * 2)
        self.assertEqual(maybe_value.is_nothing, False)
        self.assertEqual(maybe_value.value, 10)

    def test_bind_method(self):
        maybe_value = Maybe.just(5).bind(lambda x: Maybe.just(x * 2))
        self.assertEqual(maybe_value.is_nothing, False)
        self.assertEqual(maybe_value.value, 10)

    def test_ap_method(self):
        maybe_value = Maybe.just(5).ap(Maybe.just(lambda x: x + 10))
        self.assertEqual(maybe_value.is_nothing, False)
        self.assertEqual(maybe_value.value, 10)

    def test_filter_method(self):
        maybe_value = Maybe.just(5).filter(lambda x: x > 3)
        self.assertEqual(maybe_value.is_nothing, False)
        self.assertEqual(maybe_value.value, 5)
        maybe_value2 = Maybe.just(3).filter(lambda x: x > 3)
        self.assertEqual(maybe_value2.is_nothing, True)
        self.assertEqual(maybe_value2.value, 10)

    def test_get_or_else_method(self):
        maybe_value = Maybe.just(5).get_or_else(10)
        self.assertEqual(maybe_value, 5)
        maybe_value2 = Maybe.nothing().get_or_else(10)
        self.assertEqual(maybe_value2, 10)

    def test_to_either_method(self):
        from pymonet.either import Left, Right
        maybe_value = Maybe.just(5).to_either()
        self.assertEqual(maybe_value, Right(5))
        maybe_value2 = Maybe.nothing().to_either()
        self.assertEqual(maybe_value2, Left(None))

    def test_to_box_method(self):
        from pymonet.box import Box
        maybe_value = Maybe.just(5).to_box()
        self.assertEqual(maybe_value, Box(5))
        maybe_value2 = Maybe.nothing().to_box()
        self.assertEqual(maybe_value2, Box(None))

    def test_to_lazy_method(self):
        from pymonet.lazy import Lazy
        maybe_value = Maybe.just(5).to_lazy()
        self.assertEqual(maybe_value.force(), 5)
        maybe_value2 = Maybe.nothing().to_lazy()
        self.assertEqual(maybe_value2(), None)

    def test_to_try_method(self):
        from pymonet.monad_try import Try
        maybe_value = Maybe.just(5).to_try()
        self.assertEqual(maybe_value.is_success, True)
        self.assertEqual(maybe_value.value, 5)
        maybe_value2 = Maybe.nothing().to_try()
        self.assertEqual(maybe_value2.is_success, False)
        self.assertEqual(maybe_value2.value, None)

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