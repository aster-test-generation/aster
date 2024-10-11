import unittest
from pymonet.validation import Validation


class TestValidation(unittest.TestCase):
    def test_init(self):
        value = 'test_value'
        errors = ['test_error']
        instance = Validation(value, errors)
        self.assertEqual(instance.value, value)
        self.assertEqual(instance.errors, errors)

    def test_eq(self):
        value1 = 'test_value1'
        errors1 = ['test_error1']
        value2 = 'test_value2'
        errors2 = ['test_error2']
        instance1 = Validation(value1, errors1)
        instance2 = Validation(value2, errors2)
        self.assertEqual(instance1, instance1)
        self.assertNotEqual(instance1, instance2)
        self.assertEqual(instance1, Validation(value1, errors1))
        self.assertNotEqual(instance1, Validation(value2, errors2))

    def test_str(self):
        value = 'test_value'
        errors = ['test_error']
        instance = Validation(value, errors)
        self.assertEqual(instance.__str__(), 'Validation.fail[{}, {}]'.format(value, errors))

    def test_repr(self):
        value = 'test_value'
        errors = ['test_error']
        instance = Validation(value, errors)
        self.assertEqual(instance.__repr__(), 'Validation(value={}, errors={})'.format(value, errors))

    def test_success(self):
        value = 'test_value'
        instance = Validation.success(value)
        self.assertEqual(instance.value, value)
        self.assertEqual(instance.errors, [])

    def test_fail(self):
        errors = ['test_error']
        instance = Validation.fail(errors)
        self.assertIsNone(instance.value)
        self.assertEqual(instance.errors, errors)

    def test_is_success(self):
        value = 'test_value'
        errors = ['test_error']
        instance = Validation(value, errors)
        self.assertFalse(instance.is_success())
        instance = Validation.success(value)
        self.assertTrue(instance.is_success())

    def test_is_fail(self):
        value = 'test_value'
        errors = ['test_error']
        instance = Validation(value, errors)
        self.assertTrue(instance.is_fail())
        instance = Validation.success(value)
        self.assertFalse(instance.is_fail())

    def test_map(self):
        value = 'test_value'
        errors = ['test_error']
        instance = Validation(value, errors)
        mapper = lambda x: x + ' mapped'
        result = instance.map(mapper)
        self.assertEqual(result.value, value + ' mapped')
        self.assertEqual(result.errors, errors)

    def test_bind(self):
        value = 'test_value'
        errors = ['test_error']
        instance = Validation(value, errors)
        folder = lambda x: x + ' bound'
        result = instance.bind(folder)
        self.assertEqual(result.value, value + ' bound')
        self.assertEqual(result.errors, errors)

    def test_ap(self):
        value = 'test_value'
        errors = ['test_error']
        instance = Validation(value, errors)
        fn = lambda x: Validation('fn result', ['fn error'])
        result = instance.ap(fn)
        self.assertEqual(result.value, 'fn result')
        self.assertEqual(result.errors, errors + ['fn error'])

    def test_to_either(self):
        value = 'test_value'
        errors = ['test_error']
        instance = Validation(value, errors)
        from pymonet.either import Left, Right
        self.assertEqual(instance.to_either(), Left(errors))

    def test_to_maybe(self):
        value = 'test_value'
        errors = ['test_error']
        instance = Validation(value, errors)
        from pymonet.maybe import Maybe
        self.assertEqual(instance.to_maybe(), Maybe.nothing())

    def test_to_box(self):
        value = 'test_value'
        errors = ['test_error']
        instance = Validation(value, errors)
        from pymonet.box import Box
        self.assertEqual(instance.to_box(), Box(value))

    def test_to_lazy(self):
        value = 'test_value'
        errors = ['test_error']
        instance = Validation(value, errors)
        from pymonet.lazy import Lazy
        self.assertEqual(instance.to_lazy(), Lazy(lambda: value))

    def test_to_try(self):
        value = 'test_value'
        errors = ['test_error']
        instance = Validation(value, errors)
        from pymonet.monad_try import Try
        self.assertEqual(instance.to_try(), Try(value, is_success=False))

class TestValidation(unittest.TestCase):
    def test_init(self):
        value = "hello"
        errors = ["error1", "error2"]
        instance = Validation(value, errors)
        self.assertEqual(instance.value, value)
        self.assertEqual(instance.errors, errors)

    def test_eq(self):
        value1 = "hello"
        errors1 = ["error1", "error2"]
        value2 = "hello"
        errors2 = ["error1", "error2"]
        instance1 = Validation(value1, errors1)
        instance2 = Validation(value2, errors2)
        self.assertTrue(instance1 == instance2)

    def test_str_success(self):
        instance = Validation("hello", [])
        self.assertEqual(instance.__str__(), "Validation.success[hello]")

    def test_str_fail(self):
        instance = Validation("hello", ["error1", "error2"])
        self.assertEqual(instance.__str__(), "Validation.fail[hello, error1, error2]")

    def test_repr(self):
        instance = Validation("hello", [])
        self.assertEqual(instance.__repr__(), "Validation(hello)")

    def test_is_success(self):
        instance = Validation("hello", [])
        self.assertTrue(instance.is_success())
        instance = Validation("hello", ["error1"])
        self.assertFalse(instance.is_success())

    def test_is_fail(self):
        instance = Validation("hello", [])
        self.assertFalse(instance.is_fail())
        instance = Validation("hello", ["error1"])
        self.assertTrue(instance.is_fail())

    def test_map(self):
        instance = Validation("hello", [])
        mapper = lambda x: x.upper()
        result = instance.map(mapper)
        self.assertEqual(result.value, "HELLO")
        self.assertEqual(result.errors, [])

    def test_bind(self):
        instance = Validation("hello", [])
        folder = lambda x: x + " world"
        result = instance.bind(folder)
        self.assertEqual(result.value, "hello world")
        self.assertEqual(result.errors, [])

    def test_ap(self):
        instance = Validation("hello", [])
        fn = lambda x: Validation(x.upper(), [])
        result = instance.ap(fn)
        self.assertEqual(result.value, "HELLO")
        self.assertEqual(result.errors, [])

    def test_to_either(self):
        instance = Validation("hello", [])
        from pymonet.either import Left, Right
        result = instance.to_either()
        self.assertIsInstance(result, Right)
        self.assertEqual(result.value, "hello")

        instance = Validation("hello", ["error1"])
        result = instance.to_either()
        self.assertIsInstance(result, Left)
        self.assertEqual(result.value, ["error1"])

    def test_to_maybe(self):
        instance = Validation("hello", [])
        from pymonet.maybe import Maybe
        result = instance.to_maybe()
        self.assertIsInstance(result, Maybe)
        self.assertEqual(result.value, "hello")

        instance = Validation("hello", ["error1"])
        result = instance.to_maybe()
        self.assertIsInstance(result, Maybe)
        self.assertEqual(result.value, None)

    def test_to_box(self):
        instance = Validation("hello", [])
        from pymonet.box import Box
        result = instance.to_box()
        self.assertIsInstance(result, Box)
        self.assertEqual(result.value, "hello")

    def test_to_lazy(self):
        instance = Validation("hello", [])
        from pymonet.lazy import Lazy
        result = instance.to_lazy()
        self.assertIsInstance(result, Lazy)
        self.assertEqual(result.value, "hello")

    def test_to_try(self):
        instance = Validation("hello", [])
        from pymonet.monad_try import Try
        result = instance.to_try()
        self.assertIsInstance(result, Try)
        self.assertEqual(result.value, "hello")
        self.assertTrue(result.is_success())

        instance = Validation("hello", ["error1"])
        result = instance.to_try()
        self.assertIsInstance(result, Try)
        self.assertEqual(result.value, "hello")
        self.assertFalse(result.is_success())

if __name__ == '__main__':
    unittest.main()