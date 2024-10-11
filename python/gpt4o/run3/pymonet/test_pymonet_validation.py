import unittest
from pymonet.validation import Validation


class TestValidation(unittest.TestCase):
    def test_init(self):
        instance = Validation("value", ["error"])
        self.assertEqual(instance.value, "value")
        self.assertEqual(instance.errors, ["error"])

    def test_eq(self):
        instance1 = Validation("value", ["error"])
        instance2 = Validation("value", ["error"])
        self.assertTrue(instance1 == instance2)

    def test_str_success(self):
        instance = Validation.success("value")
        self.assertEqual(str(instance), 'Validation.success[value]')

    def test_str_fail(self):
        instance = Validation.fail(["error"])
        self.assertEqual(str(instance), 'Validation.fail[None, [\'error\']]')

    def test_success(self):
        instance = Validation.success("value")
        self.assertEqual(instance.value, "value")
        self.assertEqual(instance.errors, [])

    def test_fail(self):
        instance = Validation.fail(["error"])
        self.assertEqual(instance.value, None)
        self.assertEqual(instance.errors, ["error"])

    def test_is_success_true(self):
        instance = Validation.success("value")
        self.assertTrue(instance.is_success())

    def test_is_success_false(self):
        instance = Validation.fail(["error"])
        self.assertFalse(instance.is_success())

    def test_is_fail_true(self):
        instance = Validation.fail(["error"])
        self.assertTrue(instance.is_fail())

    def test_is_fail_false(self):
        instance = Validation.success("value")
        self.assertFalse(instance.is_fail())

    def test_map(self):
        instance = Validation.success(2)
        result = instance.map(lambda x: x * 2)
        self.assertEqual(result.value, 4)
        self.assertEqual(result.errors, [])

    def test_bind(self):
        instance = Validation.success(2)
        result = instance.bind(lambda x: x * 2)
        self.assertEqual(result, 4)

    def test_ap(self):
        instance1 = Validation.success(2)
        instance2 = Validation.fail(["error"])
        result = instance1.ap(lambda x: instance2)
        self.assertEqual(result.value, 2)
        self.assertEqual(result.errors, ["error"])

    def test_to_either_success(self):
        from pymonet.either import Right
        instance = Validation.success("value")
        result = instance.to_either()
        self.assertIsInstance(result, Right)
        self.assertEqual(result.value, "value")

    def test_to_either_fail(self):
        from pymonet.either import Left
        instance = Validation.fail(["error"])
        result = instance.to_either()
        self.assertIsInstance(result, Left)
        self.assertEqual(result.value, ["error"])

    def test_to_maybe_success(self):
        from pymonet.maybe import Maybe
        instance = Validation.success("value")
        result = instance.to_maybe()
        self.assertTrue(result.is_just)
        self.assertEqual(result.get(), "value")

    def test_to_maybe_fail(self):
        from pymonet.maybe import Maybe
        instance = Validation.fail(["error"])
        result = instance.to_maybe()
        self.assertTrue(result.is_nothing)

    def test_to_box(self):
        from pymonet.box import Box
        instance = Validation.success("value")
        result = instance.to_box()
        self.assertIsInstance(result, Box)
        self.assertEqual(result.unbox_value(), "value")

    def test_to_lazy(self):
        from pymonet.lazy import Lazy
        instance = Validation.success("value")
        result = instance.to_lazy()
        self.assertIsInstance(result, Lazy)
        self.assertEqual(result, "value")

    def test_to_try_success(self):
        from pymonet.monad_try import Try
        instance = Validation.success("value")
        result = instance.to_try()
        self.assertIsInstance(result, Try)
        self.assertTrue(result.is_success)
        self.assertEqual(result.get(), "value")

    def test_to_try_fail(self):
        from pymonet.monad_try import Try
        instance = Validation.fail(["error"])
        result = instance.to_try()
        self.assertIsInstance(result, Try)
        self.assertFalse(result.is_success)

if __name__ == '__main__':
    unittest.main()