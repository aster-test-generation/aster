import unittest
from pymonet.maybe import Maybe


class TestMaybe(unittest.TestCase):
    def test_init(self):
        instance = Maybe(5, False)
        self.assertFalse(instance.is_nothing)
        self.assertEqual(instance.value, 5)

    def test_eq(self):
        instance1 = Maybe(5, False)
        instance2 = Maybe(5, False)
        self.assertTrue(instance1 == instance2)

    def test_just(self):
        instance = Maybe.just(5)
        self.assertFalse(instance.is_nothing)
        self.assertEqual(instance.value, 5)

    def test_nothing(self):
        instance = Maybe.nothing()
        self.assertTrue(instance.is_nothing)

    def test_map(self):
        instance = Maybe.just(5)
        result = instance.map(lambda x: x + 1)
        self.assertEqual(result.value, 6)

    def test_map_nothing(self):
        instance = Maybe.nothing()
        result = instance.map(lambda x: x + 1)
        self.assertTrue(result.is_nothing)

    def test_bind(self):
        instance = Maybe.just(5)
        result = instance.bind(lambda x: Maybe.just(x + 1))
        self.assertEqual(result.value, 6)

    def test_bind_nothing(self):
        instance = Maybe.nothing()
        result = instance.bind(lambda x: Maybe.just(x + 1))
        self.assertTrue(result.is_nothing)

    def test_ap(self):
        instance = Maybe.just(5)
        applicative = Maybe.just(lambda x: x + 1)
        result = instance.ap(applicative)
        self.assertEqual(result.value, 6)

    def test_ap_nothing(self):
        instance = Maybe.nothing()
        applicative = Maybe.just(lambda x: x + 1)
        result = instance.ap(applicative)
        self.assertTrue(result.is_nothing)

    def test_filter(self):
        instance = Maybe.just(5)
        result = instance.filter(lambda x: x > 3)
        self.assertEqual(result.value, 5)

    def test_filter_nothing(self):
        instance = Maybe.nothing()
        result = instance.filter(lambda x: x > 3)
        self.assertTrue(result.is_nothing)

    def test_filter_false(self):
        instance = Maybe.just(2)
        result = instance.filter(lambda x: x > 3)
        self.assertTrue(result.is_nothing)

    def test_get_or_else(self):
        instance = Maybe.just(5)
        result = instance.get_or_else(10)
        self.assertEqual(result, 5)

    def test_get_or_else_nothing(self):
        instance = Maybe.nothing()
        result = instance.get_or_else(10)
        self.assertEqual(result, 10)

    def test_to_either(self):
        from pymonet.either import Right
        instance = Maybe.just(5)
        result = instance.to_either()
        self.assertIsInstance(result, Right)
        self.assertEqual(result.value, 5)

    def test_to_either_nothing(self):
        from pymonet.either import Left
        instance = Maybe.nothing()
        result = instance.to_either()
        self.assertIsInstance(result, Left)

    def test_to_box(self):
        from pymonet.box import Box
        instance = Maybe.just(5)
        result = instance.to_box()
        self.assertIsInstance(result, Box)
        self.assertEqual(result.value, 5)

    def test_to_box_nothing(self):
        from pymonet.box import Box
        instance = Maybe.nothing()
        result = instance.to_box()
        self.assertIsInstance(result, Box)

    def test_to_lazy(self):
        from pymonet.lazy import Lazy
        instance = Maybe.just(5)
        result = instance.to_lazy()
        self.assertIsInstance(result, Lazy)
        self.assertEqual(result, 5)

    def test_to_lazy_nothing(self):
        from pymonet.lazy import Lazy
        instance = Maybe.nothing()
        result = instance.to_lazy()
        self.assertIsInstance(result, Lazy)
        self.assertIsNone(result)

    def test_to_try(self):
        from pymonet.monad_try import Try
        instance = Maybe.just(5)
        result = instance.to_try()
        self.assertIsInstance(result, Try)
        self.assertTrue(result.is_success)
        self.assertEqual(result.value, 5)

    def test_to_try_nothing(self):
        from pymonet.monad_try import Try
        instance = Maybe.nothing()
        result = instance.to_try()
        self.assertIsInstance(result, Try)
        self.assertFalse(result.is_success)

    def test_to_validation(self):
        from pymonet.validation import Validation
        instance = Maybe.just(5)
        result = instance.to_validation()
        self.assertIsInstance(result, Validation)
        self.assertTrue(result.is_success)
        self.assertEqual(result.value, 5)

    def test_to_validation_nothing(self):
        from pymonet.validation import Validation
        instance = Maybe.nothing()
        result = instance.to_validation()
        self.assertIsInstance(result, Validation)
        self.assertTrue(result.is_success)

if __name__ == '__main__':
    unittest.main()