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

    def test_is_success(self):
        validation = Validation(1, [])
        self.assertTrue(validation.is_success())
        validation = Validation(None, ['error'])
        self.assertFalse(validation.is_success())

    def test_is_fail(self):
        validation = Validation(1, [])
        self.assertFalse(validation.is_fail())
        validation = Validation(None, ['error'])
        self.assertTrue(validation.is_fail())

    def test_map(self):
        validation = Validation(1, [])
        mapped_validation = validation.map(lambda x: x * 2)
        self.assertEqual(mapped_validation.value, 2)
        self.assertEqual(mapped_validation.errors, [])

    def test_bind(self):
        validation = Validation(1, [])
        bound_validation = validation.bind(lambda x: x * 2)
        self.assertEqual(bound_validation.value, 2)
        self.assertEqual(bound_validation.errors, [])

    def test_ap(self):
        validation = Validation(1, [])
        fn = lambda x: Validation(x * 2, [])
        result = validation.ap(fn)
        self.assertEqual(result.value, 2)
        self.assertEqual(result.errors, [])

    def test_to_either(self):
        validation = Validation(1, [])
        either = validation.to_either()
        self.assertIsInstance(either, object)

    def test_to_maybe(self):
        validation = Validation(1, [])
        maybe = validation.to_maybe()
        self.assertIsInstance(maybe, object)

    def test_to_box(self):
        validation = Validation(1, [])
        box = validation.to_box()
        self.assertIsInstance(box, object)

    def test_to_lazy(self):
        validation = Validation(1, [])
        lazy = validation.to_lazy()
        self.assertIsInstance(lazy, object)

    def test_to_try(self):
        validation = Validation(1, [])
        try_ = validation.to_try()
        self.assertIsInstance(try_, object)

    def test_success(self):
        validation = Validation.success(1)
        self.assertEqual(validation.value, 1)
        self.assertEqual(validation.errors, [])

    def test_fail(self):
        validation = Validation.fail(['error'])
        self.assertIsNone(validation.value)
        self.assertEqual(validation.errors, ['error'])

    def test_private_methods(self):
        validation = Validation(1, [])
        with self.assertRaises(AttributeError):
            validation.__private_method()
        with self.assertRaises(AttributeError):
            validation._Validation__private_method()

if __name__ == '__main__':
    unittest.main()