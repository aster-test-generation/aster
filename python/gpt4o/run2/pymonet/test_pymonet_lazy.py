import unittest
from pymonet.lazy import Lazy


class TestLazy(unittest.TestCase):
    def test_init(self):
        def constructor_fn(x):
            return x + 1
        instance = Lazy(constructor_fn)
        self.assertFalse(instance.is_evaluated)
        self.assertIsNone(instance.value)
        self.assertEqual(instance.constructor_fn, constructor_fn)

    def test_str_method(self):
        def constructor_fn(x):
            return x + 1
        instance = Lazy(constructor_fn)
        result = instance.__str__()
        self.assertEqual(result, 'Lazy[fn={}, value=None, is_evaluated=False]'.format(constructor_fn))

    def test_eq_method(self):
        def constructor_fn(x):
            return x + 1
        instance1 = Lazy(constructor_fn)
        instance2 = Lazy(constructor_fn)
        self.assertTrue(instance1.__eq__(instance2))

    def test_of_classmethod(self):
        instance = Lazy.of(5)
        self.assertFalse(instance.is_evaluated)
        self.assertIsNone(instance.value)
        self.assertEqual(instance.constructor_fn(), 5)

    def test_protected_compute_value(self):
        def constructor_fn(x):
            return x + 1
        instance = Lazy(constructor_fn)
        result = instance._compute_value(1)
        self.assertTrue(instance.is_evaluated)
        self.assertEqual(instance.value, 2)
        self.assertEqual(result, 2)

    def test_map_method(self):
        def constructor_fn(x):
            return x + 1
        instance = Lazy(constructor_fn)
        mapped_instance = instance.map(lambda y: y * 2)
        self.assertFalse(mapped_instance.is_evaluated)
        self.assertIsNone(mapped_instance.value)
        self.assertEqual(mapped_instance.constructor_fn(1), 4)

    def test_ap_method(self):
        def constructor_fn(x):
            return x + 1
        instance = Lazy(constructor_fn)
        applicative = Lazy(lambda: 2)
        applied_instance = instance.ap(applicative)
        self.assertFalse(applied_instance.is_evaluated)
        self.assertIsNone(applied_instance.value)
        self.assertEqual(applied_instance.constructor_fn(), 3)

    def test_bind_method(self):
        def constructor_fn(x):
            return x + 1
        instance = Lazy(constructor_fn)
        bound_instance = instance.bind(lambda y: Lazy(lambda: y * 2))
        self.assertFalse(bound_instance.is_evaluated)
        self.assertIsNone(bound_instance.value)
        self.assertEqual(bound_instance.constructor_fn(1), 2)

    def test_get_method(self):
        def constructor_fn(x):
            return x + 1
        instance = Lazy(constructor_fn)
        result = instance.get(1)
        self.assertTrue(instance.is_evaluated)
        self.assertEqual(instance.value, 2)
        self.assertEqual(result, 2)

    def test_to_box_method(self):
        def constructor_fn(x):
            return x + 1
        instance = Lazy(constructor_fn)
        box = instance.to_box(1)
        self.assertEqual(box.value, 2)

    def test_to_either_method(self):
        def constructor_fn(x):
            return x + 1
        instance = Lazy(constructor_fn)
        either = instance.to_either(1)
        self.assertEqual(either.value, 2)

    def test_to_maybe_method(self):
        def constructor_fn(x):
            return x + 1
        instance = Lazy(constructor_fn)
        maybe = instance.to_maybe(1)
        self.assertEqual(maybe.value, 2)

    def test_to_try_method(self):
        def constructor_fn(x):
            return x + 1
        instance = Lazy(constructor_fn)
        try_instance = instance.to_try(1)
        self.assertEqual(try_instance.get(), 2)

    def test_to_validation_method(self):
        def constructor_fn(x):
            return x + 1
        instance = Lazy(constructor_fn)
        validation = instance.to_validation(1)
        self.assertEqual(validation.validate(), 2)

if __name__ == '__main__':
    unittest.main()