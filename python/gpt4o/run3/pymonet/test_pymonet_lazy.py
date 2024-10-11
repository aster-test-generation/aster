import unittest
from pymonet.lazy import Lazy


class TestLazy(unittest.TestCase):
    def test_init(self):
        def constructor_fn(x):
            return x + 1
        instance = Lazy(constructor_fn)
        self.assertEqual(instance.constructor_fn, constructor_fn)
        self.assertFalse(instance.is_evaluated)
        self.assertIsNone(instance.value)

    def test_str(self):
        def constructor_fn(x):
            return x + 1
        instance = Lazy(constructor_fn)
        result = instance.__str__()
        self.assertEqual(result, 'Lazy[fn={}, value=None, is_evaluated=False]'.format(constructor_fn))

    def test_eq(self):
        def constructor_fn(x):
            return x + 1
        instance1 = Lazy(constructor_fn)
        instance2 = Lazy(constructor_fn)
        self.assertTrue(instance1.__eq__(instance2))

    def test_of(self):
        instance = Lazy.of(5)
        self.assertEqual(instance.constructor_fn(), 5)

    def test_compute_value(self):
        def constructor_fn(x):
            return x + 1
        instance = Lazy(constructor_fn)
        result = instance._compute_value(1)
        self.assertEqual(result, 2)
        self.assertTrue(instance.is_evaluated)
        self.assertEqual(instance.value, 2)

    def test_map(self):
        def constructor_fn(x):
            return x + 1
        instance = Lazy(constructor_fn)
        mapped_instance = instance.map(lambda x: x * 2)
        self.assertEqual(mapped_instance.constructor_fn(1), 4)

    def test_ap(self):
        def constructor_fn(x):
            return x + 1
        instance = Lazy(constructor_fn)
        applicative = Lazy(lambda x: x * 2)
        applied_instance = instance.ap(applicative)
        self.assertEqual(applied_instance.constructor_fn(2), 5)

    def test_bind(self):
        def constructor_fn(x):
            return x + 1
        instance = Lazy(constructor_fn)
        bound_instance = instance.bind(lambda x: Lazy(lambda y: x * y))
        self.assertEqual(bound_instance.constructor_fn(2)(), 4)

    def test_get(self):
        def constructor_fn(x):
            return x + 1
        instance = Lazy(constructor_fn)
        result = instance.get(1)
        self.assertEqual(result, 2)
        self.assertTrue(instance.is_evaluated)
        self.assertEqual(instance.value, 2)

    def test_to_box(self):
        def constructor_fn(x):
            return x + 1
        instance = Lazy(constructor_fn)
        from pymonet.box import Box
        box = instance.to_box(1)
        self.assertIsInstance(box, Box)
        self.assertEqual(box.value, 2)

    def test_to_either(self):
        def constructor_fn(x):
            return x + 1
        instance = Lazy(constructor_fn)
        from pymonet.either import Right
        either = instance.to_either(1)
        self.assertIsInstance(either, Right)
        self.assertEqual(either.value, 2)

    def test_to_maybe(self):
        def constructor_fn(x):
            return x + 1
        instance = Lazy(constructor_fn)
        from pymonet.maybe import Maybe
        maybe = instance.to_maybe(1)
        self.assertIsInstance(maybe, Maybe)
        self.assertEqual(maybe.value, 2)

    def test_to_try(self):
        def constructor_fn(x):
            return x + 1
        instance = Lazy(constructor_fn)
        from pymonet.monad_try import Try
        try_instance = instance.to_try(1)
        self.assertIsInstance(try_instance, Try)
        self.assertEqual(try_instance.get(), 2)

    def test_to_validation(self):
        def constructor_fn(x):
            return x + 1
        instance = Lazy(constructor_fn)
        from pymonet.validation import Validation
        validation = instance.to_validation(1)
        self.assertIsInstance(validation, Validation)
        self.assertEqual(validation.value, 2)

if __name__ == '__main__':
    unittest.main()