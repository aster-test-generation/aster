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
        self.assertEqual(validation1, validation2)

    def test_str(self):
        validation_success = Validation(1, [])
        validation_fail = Validation(None, ['error'])
        self.assertEqual(str(validation_success), 'Validation.success[1]')
        self.assertEqual(str(validation_fail), 'Validation.fail[None, [\'error\']]')

    def test_success(self):
        validation = Validation.success(1)
        self.assertEqual(validation.value, 1)
        self.assertEqual(validation.errors, [])

    def test_fail(self):
        validation = Validation.fail(['error'])
        self.assertEqual(validation.value, None)
        self.assertEqual(validation.errors, ['error'])

    def test_is_success(self):
        validation_success = Validation(1, [])
        validation_fail = Validation(None, ['error'])
        self.assertTrue(validation_success.is_success())
        self.assertFalse(validation_fail.is_success())

    def test_is_fail(self):
        validation_success = Validation(1, [])
        validation_fail = Validation(None, ['error'])
        self.assertFalse(validation_success.is_fail())
        self.assertTrue(validation_fail.is_fail())

    def test_map(self):
        validation = Validation(1, [])
        mapped_validation = validation.map(lambda x: x + 1)
        self.assertEqual(mapped_validation.value, 2)
        self.assertEqual(mapped_validation.errors, [])

    def test_bind(self):
        validation = Validation(1, [])
        bound_validation = validation.bind(lambda x: Validation(x + 1, []))
        self.assertEqual(bound_validation.value, 2)
        self.assertEqual(bound_validation.errors, [])

    def test_ap(self):
        validation = Validation(1, [])
        fn_validation = Validation(lambda x: x + 1, [])
        ap_validation = validation.ap(fn_validation)
        self.assertEqual(ap_validation.value, 2)
        self.assertEqual(ap_validation.errors, [])

    def test_to_either(self):
        validation_success = Validation(1, [])
        validation_fail = Validation(None, ['error'])
        from pymonet.either import Right, Left
        self.assertEqual(validation_success.to_either(), Right(1))
        self.assertEqual(validation_fail.to_either(), Left(['error']))

    def test_to_maybe(self):
        validation_success = Validation(1, [])
        validation_fail = Validation(None, ['error'])
        from pymonet.maybe import Maybe
        self.assertEqual(validation_success.to_maybe(), Maybe.just(1))
        self.assertEqual(validation_fail.to_maybe(), Maybe.nothing())

    def test_to_box(self):
        validation = Validation(1, [])
        from pymonet.box import Box
        self.assertEqual(validation.to_box(), Box(1))

    def test_to_lazy(self):
        validation = Validation(1, [])
        from pymonet.lazy import Lazy
        self.assertEqual(validation.to_lazy(), Lazy(lambda: 1))

    def test_to_try(self):
        validation_success = Validation(1, [])
        validation_fail = Validation(None, ['error'])
        from pymonet.monad_try import Try
        self.assertEqual(validation_success.to_try(), Try(1, is_success=True))
        self.assertEqual(validation_fail.to_try(), Try(None, is_success=False))

if __name__ == '__main__':
    unittest.main()