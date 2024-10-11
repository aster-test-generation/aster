import unittest
from pymonet.validation import Validation


class TestValidation(unittest.TestCase):
    def test_init(self):
        v = Validation(1, [2, 3])
        self.assertEqual(v.value, 1)
        self.assertEqual(v.errors, [2, 3])

    def test_eq(self):
        v1 = Validation(1, [2, 3])
        v2 = Validation(1, [2, 3])
        self.assertEqual(v1, v2)

    def test_str(self):
        v1 = Validation(1, [2, 3])
        v2 = Validation(None, [2, 3])
        self.assertEqual(str(v1), 'Validation.fail[1, [2, 3]]')
        self.assertEqual(str(v2), 'Validation.fail[, [2, 3]]')

    def test_success(self):
        v = Validation.success(1)
        self.assertEqual(v.value, 1)
        self.assertEqual(v.errors, [])

    def test_fail(self):
        v = Validation.fail([1, 2])
        self.assertEqual(v.value, None)
        self.assertEqual(v.errors, [1, 2])

    def test_is_success(self):
        v1 = Validation(1, [2, 3])
        v2 = Validation(None, [2, 3])
        self.assertTrue(v1.is_success())
        self.assertFalse(v2.is_success())

    def test_is_fail(self):
        v1 = Validation(1, [2, 3])
        v2 = Validation(None, [2, 3])
        self.assertFalse(v1.is_fail())
        self.assertTrue(v2.is_fail())

    def test_map(self):
        v = Validation(1, [2, 3])
        v2 = v.map(lambda x: x + 1)
        self.assertEqual(v2.value, 2)
        self.assertEqual(v2.errors, [2, 3])

    def test_bind(self):
        v = Validation(1, [2, 3])
        v2 = v.bind(lambda x: Validation(x + 1, []))
        self.assertEqual(v2.value, 2)
        self.assertEqual(v2.errors, [])

    def test_ap(self):
        v = Validation(1, [2, 3])
        v2 = v.ap(lambda x: Validation(x + 1, []))
        self.assertEqual(v2.value, 1)
        self.assertEqual(v2.errors, [2, 3])

    def test_to_either(self):
        v1 = Validation(1, [2, 3])
        v2 = Validation(None, [2, 3])
        from pymonet.either import Right, Left
        self.assertEqual(v1.to_either(), Right(1))
        self.assertEqual(v2.to_either(), Left([2, 3]))

    def test_to_maybe(self):
        v1 = Validation(1, [2, 3])
        v2 = Validation(None, [2, 3])
        from pymonet.maybe import Just
        self.assertEqual(v1.to_maybe(), Just(1))
        self.assertEqual(v2.to_maybe(), Nothing())

    def test_to_box(self):
        v = Validation(1, [2, 3])
        from pymonet.box import Box
        self.assertEqual(v.to_box(), Box(1))

    def test_to_lazy(self):
        v = Validation(1, [2, 3])
        from pymonet.lazy import Lazy
        self.assertEqual(v.to_lazy().force(), 2)

    def test_to_try(self):
        v1 = Validation(1, [2, 3])
        v2 = Validation(None, [2, 3])
        from pymonet.monad_try import Try
        self.assertEqual(v1.to_try(), Try(1))
        self.assertEqual(v2.to_try(), Try(None, is_success=False))

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