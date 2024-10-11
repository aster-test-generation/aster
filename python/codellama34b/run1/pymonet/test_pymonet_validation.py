import unittest
from pymonet.validation import Validation


class TestValidation(unittest.TestCase):
    def test_init(self):
        result = Validation(1, [])
        self.assertEqual(result.value, 1)
        self.assertEqual(result.errors, [])

    def test_eq(self):
        result = Validation(1, []) == Validation(1, [])
        self.assertTrue(result)

    def test_str(self):
        result = Validation(1, []).__str__()
        self.assertEqual(result, 'Validation.success[1]')

    def test_repr(self):
        result = Validation(1, []).__repr__()
        self.assertEqual(result, Validation.success[1])

    def test_is_success(self):
        result = Validation(1, []).is_success()
        self.assertTrue(result)

    def test_is_fail(self):
        result = Validation(1, []).is_fail()
        self.assertFalse(result)

    def test_map(self):
        result = Validation(1, []).map(lambda x: x + 1)
        self.assertEqual(result.value, 2)

    def test_bind(self):
        result = Validation(1, []).bind(lambda x: Validation(x + 1, []))
        self.assertEqual(result.value, 2)

    def test_ap(self):
        result = Validation(1, []).ap(lambda x: Validation(x + 1, []))
        self.assertEqual(result.value, 1)

    def test_to_either(self):
        from pymonet.either import Left, Right
        result = Validation(1, []).to_either()
        self.assertEqual(result, Right(1))

    def test_to_maybe(self):
        from pymonet.maybe import Maybe
        result = Validation(1, []).to_maybe()
        self.assertEqual(result, Maybe.just(1))

    def test_to_box(self):
        from pymonet.box import Box
        result = Validation(1, []).to_box()
        self.assertEqual(result, Box(1))

    def test_to_lazy(self):
        from pymonet.lazy import Lazy
        result = Validation(1, []).to_lazy()
        self.assertEqual(result, Lazy(lambda: 2))

    def test_to_try(self):
        from pymonet.monad_try import Try
        result = Validation(1, []).to_try()
        self.assertEqual(result, Try(1, is_success=True))

    def test_success(self):
        result = Validation.success(1)
        self.assertEqual(result.value, 1)
        self.assertEqual(result.errors, [])

    def test_fail(self):
        result = Validation.fail([1])
        self.assertEqual(result.value, None)
        self.assertEqual(result.errors, [1])

if __name__ == '__main__':
    unittest.main()