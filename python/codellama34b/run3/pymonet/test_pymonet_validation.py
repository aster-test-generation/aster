import unittest
from pymonet.validation import Validation


class TestValidation(unittest.TestCase):
    def test_init(self):
        validation = Validation(1, [])
        self.assertEqual(validation.value, 1)
        self.assertEqual(validation.errors, [])

    def test_success(self):
        validation = Validation.success(1)
        self.assertEqual(validation.value, 1)
        self.assertEqual(validation.errors, [])

    def test_fail(self):
        validation = Validation.fail([1])
        self.assertEqual(validation.value, None)
        self.assertEqual(validation.errors, [1])

    def test_is_success(self):
        validation = Validation.success(1)
        self.assertTrue(validation.is_success())

    def test_is_fail(self):
        validation = Validation.fail([1])
        self.assertTrue(validation.is_fail())

    def test_map(self):
        validation = Validation.success(1)
        result = validation.map(lambda x: x + 1)
        self.assertEqual(result.value, 2)
        self.assertEqual(result.errors, [])

    def test_bind(self):
        validation = Validation.success(1)
        result = validation.bind(lambda x: Validation.success(x + 1))
        self.assertEqual(result.value, 2)
        self.assertEqual(result.errors, [])

    def test_ap(self):
        validation = Validation.success(1)
        result = validation.ap(lambda x: Validation.fail([x + 1]))
        self.assertEqual(result.value, 1)
        self.assertEqual(result.errors, [2])

    def test_to_either(self):
        validation = Validation.success(1)
        result = validation.to_either()
        from pymonet.either import Right
        self.assertTrue(isinstance(result, Right))
        self.assertEqual(result.value, 1)

    def test_to_maybe(self):
        validation = Validation.success(1)
        result = validation.to_maybe()
        from pymonet.maybe import Maybe
        self.assertTrue(isinstance(result, Just))
        self.assertEqual(result.value, 1)

    def test_to_box(self):
        validation = Validation.success(1)
        result = validation.to_box()
        from pymonet.box import Box
        self.assertTrue(isinstance(result, Box))
        self.assertEqual(result.value, 1)

    def test_to_lazy(self):
        validation = Validation.success(1)
        result = validation.to_lazy()
        from pymonet.lazy import Lazy
        self.assertTrue(isinstance(result, Lazy))
        self.assertEqual(result.value, None)

    def test_to_try(self):
        validation = Validation.success(1)
        result = validation.to_try()
        from pymonet.monad_try import Try
        self.assertTrue(isinstance(result, Try))
        self.assertEqual(result.value, 1)
        self.assertTrue(result.is_success)

class TestValidation(unittest.TestCase):
    def test_init(self):
        instance = Validation(1, [])
        self.assertEqual(instance.value, 1)
        self.assertEqual(instance.errors, [])

    def test_eq(self):
        instance = Validation(1, [])
        self.assertEqual(instance, Validation(1, []))

    def test_str(self):
        instance = Validation(1, [])
        self.assertEqual(str(instance), 'Validation.success[1]')

    def test_repr(self):
        instance = Validation(1, [])
        self.assertEqual(repr(instance), 'Validation.success[1]')

    def test_is_success(self):
        instance = Validation(1, [])
        self.assertEqual(instance.is_success(), True)

    def test_is_fail(self):
        instance = Validation(1, [])
        self.assertEqual(instance.is_fail(), False)

    def test_map(self):
        instance = Validation(1, [])
        self.assertEqual(instance.map(lambda x: x + 1), Validation(2, []))

    def test_bind(self):
        instance = Validation(1, [])
        self.assertEqual(instance.bind(lambda x: Validation(x + 1, [])), Validation(2, []))

    def test_ap(self):
        instance = Validation(1, [])
        self.assertEqual(instance.ap(lambda x: Validation(x + 1, [])), Validation(2, []))

    def test_to_either(self):
        instance = Validation(1, [])
        from pymonet.either import Left, Right
        self.assertEqual(instance.to_either(), Right(1))

    def test_to_maybe(self):
        instance = Validation(1, [])
        from pymonet.maybe import Maybe
        self.assertEqual(instance.to_maybe(), Maybe.just(1))

    def test_to_box(self):
        instance = Validation(1, [])
        from pymonet.box import Box
        self.assertEqual(instance.to_box(), Box(1))

    def test_to_lazy(self):
        instance = Validation(1, [])
        from pymonet.lazy import Lazy
        self.assertEqual(instance.to_lazy(), Lazy(lambda: 1))

    def test_to_try(self):
        instance = Validation(1, [])
        from pymonet.monad_try import Try
        self.assertEqual(instance.to_try(), Try(1, is_success=True))

    def test_success(self):
        self.assertEqual(Validation.success(1), Validation(1, []))

    def test_fail(self):
        self.assertEqual(Validation.fail(1), Validation(None, [1]))

if __name__ == '__main__':
    unittest.main()