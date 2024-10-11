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
        self.assertEqual(result, 'Lazy[fn=<function TestLazy.test_str_method.<locals>.constructor_fn at 0x7ffaec776170>, value=None, is_evaluated=False]')

    def test_eq_method(self):
        def constructor_fn(x):
            return x + 1
        instance1 = Lazy(constructor_fn)
        instance2 = Lazy(constructor_fn)
        self.assertTrue(instance1.__eq__(instance2))

    def test_of_classmethod(self):
        instance = Lazy.of(5)
        self.assertEqual(instance.constructor_fn(), 5)

    def test_protected_compute_value(self):
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
        mapped_instance = instance.map(lambda y: y * 2)
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
        bound_instance = instance.bind(lambda y: Lazy(lambda z: y * 2))
        self.assertEqual(bound_instance.constructor_fn(1)(), 4)

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
        box = instance.to_box(1)
        self.assertEqual(box.value, 2)

    def test_to_either(self):
        def constructor_fn(x):
            return x + 1
        instance = Lazy(constructor_fn)
        either = instance.to_either(1)
        self.assertEqual(either.value, 2)

    def test_to_maybe(self):
        def constructor_fn(x):
            return x + 1
        instance = Lazy(constructor_fn)
        maybe = instance.to_maybe(1)
        self.assertEqual(maybe.value, 2)

    def test_to_try(self):
        def constructor_fn(x):
            return x + 1
        instance = Lazy(constructor_fn)
        try_instance = instance.to_try(1)
        self.assertEqual(try_instance.get(), 2)

    def test_to_validation(self):
        def constructor_fn(x):
            return x + 1
        instance = Lazy(constructor_fn)
        validation = instance.to_validation(1)
        self.assertEqual(validation.value, 2)

if __name__ == '__main__':
    unittest.main()