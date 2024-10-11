import unittest
from pymonet.maybe import Maybe


class TestMaybe(unittest.TestCase):
    def test_init(self):
        instance = Maybe(1, False)
        self.assertEqual(instance.is_nothing, False)
        self.assertEqual(instance.value, 1)

    def test_just(self):
        result = Maybe.just(1)
        self.assertEqual(result.is_nothing, False)
        self.assertEqual(result.value, 1)

    def test_nothing(self):
        result = Maybe.nothing()
        self.assertEqual(result.is_nothing, True)
        self.assertEqual(result.value, 10)

    def test_map(self):
        instance = Maybe.just(1)
        result = instance.map(lambda x: x + 1)
        self.assertEqual(result.is_nothing, False)
        self.assertEqual(result.value, 2)

    def test_bind(self):
        instance = Maybe.just(1)
        result = instance.bind(lambda x: Maybe.just(x + 1))
        self.assertEqual(result.is_nothing, False)
        self.assertEqual(result.value, 2)

    def test_ap(self):
        instance = Maybe.just(1)
        result = instance.ap(Maybe.just(lambda x: x + 1))
        self.assertEqual(result.is_nothing, False)
        self.assertEqual(result.value, 2)

    def test_filter(self):
        instance = Maybe.just(1)
        result = instance.filter(lambda x: x > 0)
        self.assertEqual(result.is_nothing, False)
        self.assertEqual(result.value, 1)

    def test_get_or_else(self):
        instance = Maybe.just(1)
        result = instance.get_or_else(0)
        self.assertEqual(result, 1)

    def test_to_either(self):
        instance = Maybe.just(1)
        result = instance.to_either()
        self.assertEqual(result.is_left(), False)
        self.assertEqual(result.value, 1)

    def test_to_box(self):
        instance = Maybe.just(1)
        result = instance.to_box()
        self.assertEqual(result.value, 1)

    def test_to_lazy(self):
        instance = Maybe.just(1)
        result = instance.to_lazy()
        self.assertEqual(result.value, None)

    def test_to_try(self):
        instance = Maybe.just(1)
        result = instance.to_try()
        self.assertEqual(result.is_success, True)
        self.assertEqual(result.value, 1)

    def test_to_validation(self):
        instance = Maybe.just(1)
        result = instance.to_validation()
        self.assertEqual(result.is_success(), True)
        self.assertEqual(result.value, 1)

if __name__ == '__main__':
    unittest.main()