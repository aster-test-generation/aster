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
        validation3 = Validation(2, [])
        self.assertEqual(validation1, validation2)
        self.assertNotEqual(validation1, validation3)

    def test_str(self):
        validation1 = Validation(1, [])
        validation2 = Validation(None, ['error1', 'error2'])
        self.assertEqual(str(validation1), 'Validation.success[1]')
        self.assertEqual(str(validation2), 'Validation.fail[None, [error1, error2]]')

    def test_success(self):
        validation = Validation.success(1)
        self.assertEqual(validation.value, 1)
        self.assertEqual(validation.errors, [])

    def test_fail(self):
        validation = Validation.fail(['error1', 'error2'])
        self.assertEqual(validation.value, None)
        self.assertEqual(validation.errors, ['error1', 'error2'])

    def test_is_success(self):
        validation1 = Validation(1, [])
        validation2 = Validation(None, ['error1', 'error2'])
        self.assertTrue(validation1.is_success())
        self.assertFalse(validation2.is_success())

    def test_is_fail(self):
        validation1 = Validation(1, [])
        validation2 = Validation(None, ['error1', 'error2'])
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
        validation1 = Validation(lambda x: x + 1, []).ap(Validation(1, []))
        validation2 = Validation(1, []).ap(Validation(None, ['error1']))
        self.assertEqual(validation1.value, 2)
        self.assertEqual(validation1.errors, [])
        self.assertEqual(validation2.value, None)
        self.assertEqual(validation2.errors, ['error1'])

    def test_to_either(self):
        from pymonet.either import Left, Right
        validation1 = Validation(1, []).to_either()
        validation2 = Validation(None, ['error1']).to_either()
        self.assertEqual(validation1, Right(1))
        self.assertEqual(validation2, Left(['error1']))

    def test_to_maybe(self):
        from pymonet.maybe import Maybe
        validation1 = Validation(1, []).to_maybe()
        validation2 = Validation(None, ['error1']).to_maybe()
        self.assertEqual(validation1, Maybe.just(1))
        self.assertEqual(validation2, Maybe.nothing())

    def test_to_box(self):
        from pymonet.box import Box
        validation = Validation(1, []).to_box()
        self.assertEqual(validation.value, 1)

    def test_to_lazy(self):
        from pymonet.lazy import Lazy
        validation = Validation(1, []).to_lazy()
        self.assertEqual(validation.value, None)

    def test_to_try(self):
        from pymonet.monad_try import Try
        validation1 = Validation(1, []).to_try()
        validation2 = Validation(None, ['error1']).to_try()
        self.assertEqual(validation1.value, 1)
        self.assertEqual(validation1.is_success(), True)
        self.assertEqual(validation2.value, None)
        self.assertFalse(validation2.is_success())

if __name__ == '__main__':
    unittest.main()