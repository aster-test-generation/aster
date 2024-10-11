import unittest
from pymonet.validation import Validation


class TestValidation(unittest.TestCase):
    def test_init(self):
        validation = Validation(42, [])
        self.assertEqual(validation.value, 42)
        self.assertEqual(validation.errors, [])

    def test_eq(self):
        v1 = Validation(42, [])
        v2 = Validation(42, [])
        self.assertTrue(v1 == v2)

    def test_str_success(self):
        validation = Validation(42, [])
        self.assertEqual(str(validation), 'Validation.success[42]')

    def test_str_fail(self):
        validation = Validation(None, ['error1', 'error2'])
        self.assertEqual(str(validation), 'Validation.fail[None, ["error1", "error2"]]')

    def test_success(self):
        validation = Validation.success(42)
        self.assertEqual(validation.value, 42)
        self.assertEqual(validation.errors, [])

    def test_fail(self):
        validation = Validation.fail(['error1', 'error2'])
        self.assertEqual(validation.value, None)
        self.assertEqual(validation.errors, ['error1', 'error2'])

    def test_is_success(self):
        validation = Validation(42, [])
        self.assertTrue(validation.is_success())

    def test_is_fail(self):
        validation = Validation(None, ['error1', 'error2'])
        self.assertTrue(validation.is_fail())

    def test_map(self):
        validation = Validation(42, [])
        mapped_validation = validation.map(lambda x: x * 2)
        self.assertEqual(mapped_validation.value, 84)
        self.assertEqual(mapped_validation.errors, [])

    def test_bind(self):
        validation = Validation(42, [])
        bound_validation = validation.bind(lambda x: Validation(x * 2, []))
        self.assertEqual(bound_validation.value, 84)
        self.assertEqual(bound_validation.errors, [])

    def test_ap(self):
        validation = Validation(42, [])
        fn_validation = Validation(lambda x: x * 2, [])
        ap_validation = validation.ap(fn_validation)
        self.assertEqual(ap_validation.value, 42)
        self.assertEqual(ap_validation.errors, [])

    def test_to_either(self):
        validation = Validation(42, [])
        either = validation.to_either()
        self.assertIsInstance(either, Right)
        self.assertEqual(either.value, 42)

    def test_to_maybe(self):
        validation = Validation(42, [])
        maybe = validation.to_maybe()
        self.assertIsInstance(maybe, Maybe)
        self.assertEqual(maybe.value, 42)

    def test_to_box(self):
        validation = Validation(42, [])
        box = validation.to_box()
        self.assertIsInstance(box, Box)
        self.assertEqual(box.value, 42)

    def test_to_lazy(self):
        validation = Validation(42, [])
        lazy = validation.to_lazy()
        self.assertIsInstance(lazy, Lazy)
        self.assertEqual(lazy.value, 42)

    def test_to_try(self):
        validation = Validation(42, [])
        try_ = validation.to_try()
        self.assertIsInstance(try_, Try)
        self.assertEqual(try_.value, 42)

if __name__ == '__main__':
    unittest.main()