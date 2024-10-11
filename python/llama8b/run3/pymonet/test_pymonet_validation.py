import unittest
from pymonet.validation import Validation


class TestValidation(unittest.TestCase):
    def test_init(self):
        validation = Validation(1, [])
        self.assertEqual(validation.value, 1)
        self.assertEqual(validation.errors, [])

    def test_eq(self):
        validation1 = Validation(1, [])
        validation2 = Validation(1, [])
        self.assertTrue(validation1 == validation2)

    def test_str_success(self):
        validation = Validation(1, [])
        self.assertEqual(str(validation), 'Validation.success[1]')

    def test_str_fail(self):
        validation = Validation(None, ['error'])
        self.assertEqual(str(validation), 'Validation.fail[None, [\'error\']]')

    def test_success(self):
        validation = Validation(1, [])
        self.assertTrue(validation.is_success())

    def test_fail(self):
        validation = Validation(None, ['error'])
        self.assertFalse(validation.is_success())

    def test_is_fail(self):
        validation = Validation(None, ['error'])
        self.assertTrue(validation.is_fail())

    def test_map(self):
        validation = Validation(1, [])
        mapped_validation = validation.map(lambda x: x * 2)
        self.assertEqual(mapped_validation.value, 2)

    def test_bind(self):
        validation = Validation(1, [])
        bound_validation = validation.bind(lambda x: x * 2)
        self.assertEqual(bound_validation.value, 2)

    def test_ap(self):
        validation = Validation(1, [])
        ap_validation = validation.ap(lambda x: Validation(x * 2, []))
        self.assertEqual(ap_validation.value, 2)

    def test_to_either(self):
        validation = Validation(1, [])
        either = validation.to_either()
        from pymonet.either import Right
        self.assertIsInstance(either, Right)

    def test_to_maybe(self):
        validation = Validation(1, [])
        maybe = validation.to_maybe()
        from pymonet.maybe import Maybe
        self.assertIsInstance(maybe, Maybe)

    def test_to_box(self):
        validation = Validation(1, [])
        box = validation.to_box()
        from pymonet.box import Box
        self.assertIsInstance(box, Box)

    def test_to_lazy(self):
        validation = Validation(1, [])
        lazy = validation.to_lazy()
        from pymonet.lazy import Lazy
        self.assertIsInstance(lazy, Lazy)

    def test_to_try(self):
        validation = Validation(1, [])
        try_ = validation.to_try()
        from pymonet.monad_try import Try
        self.assertIsInstance(try_, Try)

class TestValidation(unittest.TestCase):
    def test_init(self):
        value = 'test_value'
        errors = ['test_error']
        instance = Validation(value, errors)
        self.assertEqual(instance.value, value)
        self.assertEqual(instance.errors, errors)

    def test_eq(self):
        value = 'test_value'
        errors = ['test_error']
        instance1 = Validation(value, errors)
        instance2 = Validation(value, errors)
        self.assertTrue(instance1 == instance2)

    def test_str(self):
        value = 'test_value'
        errors = ['test_error']
        instance = Validation(value, errors)
        self.assertEqual(instance.__str__(), 'Validation.fail[test_value, [\'test_error\']]')

    def test_str_success(self):
        value = 'test_value'
        instance = Validation(value, [])
        self.assertEqual(instance.__str__(), 'Validation.success[test_value]')

    def test_repr(self):
        value = 'test_value'
        instance = Validation(value, [])
        self.assertEqual(instance.__repr__(), 'Validation(success[test_value])')

    @classmethod
    def setUpClass(cls):
        cls.success_instance = Validation.success('test_value')
        cls.fail_instance = Validation.fail(['test_error'])

    def test_is_success(self):
        self.assertTrue(self.success_instance.is_success())
        self.assertFalse(self.fail_instance.is_success())

    def test_is_fail(self):
        self.assertFalse(self.success_instance.is_fail())
        self.assertTrue(self.fail_instance.is_fail())

    def test_map(self):
        value = 'test_value'
        mapper = lambda x: x + ' mapped'
        instance = self.success_instance.map(mapper)
        self.assertEqual(instance.value, value + ' mapped')

    def test_bind(self):
        value = 'test_value'
        folder = lambda x: x + ' bound'
        instance = self.success_instance.bind(folder)
        self.assertEqual(instance.value, value + ' bound')

    def test_ap(self):
        value = 'test_value'
        fn = lambda x: Validation(value, ['test_error'])
        instance = self.success_instance.ap(fn)
        self.assertEqual(instance.errors, ['test_error'])

    def test_to_either(self):
        from pymonet.either import Left, Right
        instance = self.fail_instance.to_either()
        self.assertIsInstance(instance, Left)

    def test_to_maybe(self):
        from pymonet.maybe import Maybe
        instance = self.fail_instance.to_maybe()
        self.assertIsInstance(instance, Maybe.nothing())

    def test_to_box(self):
        from pymonet.box import Box
        instance = self.success_instance.to_box()
        self.assertIsInstance(instance, Box)

    def test_to_lazy(self):
        from pymonet.lazy import Lazy
        instance = self.success_instance.to_lazy()
        self.assertIsInstance(instance, Lazy)

    def test_to_try(self):
        from pymonet.monad_try import Try
        instance = self.success_instance.to_try()
        self.assertIsInstance(instance, Try)

    def test_private_method(self):
        value = 'test_value'
        errors = ['test_error']
        instance = Validation(value, errors)
        result = instance._Validation__private_method(value)
        self.assertEqual(result, value)

    def test_protected_method(self):
        value = 'test_value'
        errors = ['test_error']
        instance = Validation(value, errors)
        result = instance._Validation__is_success()
        self.assertFalse(result)

if __name__ == '__main__':
    unittest.main()