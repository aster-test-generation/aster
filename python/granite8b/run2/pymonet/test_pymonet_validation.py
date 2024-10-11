import unittest
from pymonet.validation import Validation


class TestValidation(unittest.TestCase):
    def test_success(self):
        validation = Validation.success(42)
        self.assertEqual(validation.value, 42)
        self.assertEqual(validation.errors, [])
        self.assertTrue(validation.is_success())
        self.assertFalse(validation.is_fail())

    def test_fail(self):
        validation = Validation.fail(['error1', 'error2'])
        self.assertEqual(validation.value, None)
        self.assertEqual(validation.errors, ['error1', 'error2'])
        self.assertFalse(validation.is_success())
        self.assertTrue(validation.is_fail())

    def test_map(self):
        validation = Validation.success(42).map(lambda x: x * 2)
        self.assertEqual(validation.value, 84)
        self.assertEqual(validation.errors, [])

    def test_bind(self):
        validation = Validation.success(42).bind(lambda x: Validation.success(x * 2))
        self.assertEqual(validation.value, 84)
        self.assertEqual(validation.errors, [])

    def test_ap(self):
        validation = Validation.success(42).ap(Validation.success(lambda x: x * 2))
        self.assertEqual(validation.value, 84)
        self.assertEqual(validation.errors, [])

    def test_to_either(self):
        from pymonet.either import Left, Right
        validation = Validation.success(42).to_either()
        self.assertIsInstance(validation, Right)
        self.assertEqual(validation.value, 42)

    def test_to_maybe(self):
        from pymonet.maybe import Maybe
        validation = Validation.success(42).to_maybe()
        self.assertIsInstance(validation, Maybe.Just)
        self.assertEqual(validation.value, 42)

    def test_to_box(self):
        from pymonet.box import Box
        validation = Validation.success(42).to_box()
        self.assertIsInstance(validation, Box)
        self.assertEqual(validation.value, 42)

    def test_to_lazy(self):
        from pymonet.lazy import Lazy
        validation = Validation.success(42).to_lazy()
        self.assertIsInstance(validation, Lazy)
        self.assertEqual(validation.value, None)

    def test_to_try(self):
        from pymonet.monad_try import Try
        validation = Validation.success(42).to_try()
        self.assertIsInstance(validation, Try)
        self.assertEqual(validation.value, 42)
        self.assertTrue(validation.is_success)

class TestValidation(unittest.TestCase):
    def test_init(self):
        validation = Validation(1, [])
        self.assertEqual(validation.value, 1)
        self.assertEqual(validation.errors, [])

    def test_eq(self):
        validation1 = Validation(1, [])
        validation2 = Validation(1, [])
        self.assertEqual(validation1, validation2)

    def test_str(self):
        validation = Validation(1, [])
        self.assertEqual(str(validation), 'Validation.success[1]')

    def test_success(self):
        validation = Validation.success(1)
        self.assertEqual(validation.value, 1)
        self.assertEqual(validation.errors, [])

    def test_fail(self):
        validation = Validation.fail([1, 2, 3])
        self.assertEqual(validation.value, None)
        self.assertEqual(validation.errors, [1, 2, 3])

    def test_is_success(self):
        validation1 = Validation(1, [])
        validation2 = Validation(None, [1, 2, 3])
        self.assertTrue(validation1.is_success())
        self.assertFalse(validation2.is_success())

    def test_is_fail(self):
        validation1 = Validation(1, [])
        validation2 = Validation(None, [1, 2, 3])
        self.assertFalse(validation1.is_fail())
        self.assertTrue(validation2.is_fail())

    def test_map(self):
        validation = Validation(1, []).map(lambda x: x + 1)
        self.assertEqual(validation.value, 2)
        self.assertEqual(validation.errors, [])

    def test_bind(self):
        validation = Validation(1, []).bind(lambda x: Validation(x + 1, []))
        self.assertEqual(validation.value, 2)
        self.assertEqual(validation.errors, [])

    def test_ap(self):
        validation1 = Validation(1, []).ap(Validation(lambda x: x + 1, []))
        validation2 = Validation(1, []).ap(Validation(None, [1, 2, 3]))
        self.assertEqual(validation1.value, 2)
        self.assertEqual(validation1.errors, [])
        self.assertEqual(validation2.value, None)
        self.assertEqual(validation2.errors, [1, 2, 3])

    def test_to_either(self):
        from pymonet.either import Left, Right
        validation1 = Validation(1, []).to_either()
        validation2 = Validation(None, [1, 2, 3]).to_either()
        self.assertTrue(isinstance(validation1, Right))
        self.assertEqual(validation1.value, 1)
        self.assertTrue(isinstance(validation2, Left))
        self.assertEqual(validation2.value, [1, 2, 3])

    def test_to_maybe(self):
        from pymonet.maybe import Maybe
        validation1 = Validation(1, []).to_maybe()
        validation2 = Validation(None, [1, 2, 3]).to_maybe()
        self.assertTrue(isinstance(validation1, Maybe.just))
        self.assertEqual(validation1.value, 1)
        self.assertTrue(isinstance(validation2, Maybe.nothing))

    def test_to_box(self):
        from pymonet.box import Box
        validation = Validation(1, []).to_box()
        self.assertTrue(isinstance(validation, Box))
        self.assertEqual(validation.value, 1)

    def test_to_lazy(self):
        from pymonet.lazy import Lazy
        validation = Validation(1, []).to_lazy()
        self.assertTrue(isinstance(validation, Lazy))
        self.assertEqual(validation.value, 1)

    def test_to_try(self):
        from pymonet.monad_try import Try
        validation1 = Validation(1, []).to_try()
        validation2 = Validation(None, [1, 2, 3]).to_try()
        self.assertTrue(isinstance(validation1, Try))
        self.assertEqual(validation1.value, 1)
        self.assertTrue(isinstance(validation2, Try))
        self.assertEqual(validation2.value, None)
        self.assertEqual(validation2.is_success, False)

if __name__ == '__main__':
    unittest.main()