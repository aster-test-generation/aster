from pymonet.lazy import Lazy
from unittest import TestCase


def test_lazy_of():
    lazy = Lazy.of(1)
    assert lazy.get() == 1

def test_lazy_map():
    lazy = Lazy(lambda: 1).map(lambda x: x + 1)
    assert lazy.get() == 2

def test_lazy_ap():
    lazy = Lazy(lambda x: x + 1)
    applicative = Lazy(lambda: 1)
    assert lazy.ap(applicative).get() == 2

def test_lazy_bind():
    lazy = Lazy(lambda: 1)
    def fn(x):
        return Lazy(lambda: x + 1)
    assert lazy.bind(fn).get() == 3

def test_lazy_get():
    lazy = Lazy(lambda: 1)
    assert lazy.get() == 1

def test_lazy_to_box():
    lazy = Lazy(lambda: 1)
    assert lazy.to_box().get() == 2

def test_lazy_to_either():
    lazy = Lazy(lambda: 1)
    assert lazy.to_either().right().get() == 1

def test_lazy_to_maybe():
    lazy = Lazy(lambda: 1)
    assert lazy.to_maybe().get() == 1

def test_lazy_to_try():
    lazy = Lazy(lambda: 1)
    assert lazy.to_try().get() == 1

def test_lazy_to_validation():
    lazy = Lazy(lambda: 1)
    assert lazy.to_validation().success == 1

def test_lazy_str():
    lazy = Lazy(lambda: 1)
    assert str(lazy) == 'Lazy[fn=<function test_lazy_str.<locals>.<lambda> at 0x7f12ae71f0a0>, value=None, is_evaluated=False]'


class TestLazy(TestCase):
    def test_init(self):
        lazy = Lazy(lambda x: x + 1)
        self.assertEqual(lazy.constructor_fn(1), 2)
        self.assertFalse(lazy.is_evaluated)
        self.assertIsNone(lazy.value)

    def test_str(self):
        lazy = Lazy(lambda x: x + 1)
        self.assertEqual(str(lazy), 'Lazy[fn=<lambda>, value=None, is_evaluated=False]')

    def test_eq(self):
        lazy1 = Lazy(lambda x: x + 1)
        lazy2 = Lazy(lambda x: x + 1)
        self.assertEqual(lazy1, lazy2)

    def test_of(self):
        lazy = Lazy.of(1)
        self.assertEqual(lazy.constructor_fn(1), 1)
        self.assertTrue(lazy.is_evaluated)
        self.assertEqual(lazy.value, 1)

    def test_map(self):
        lazy = Lazy(lambda x: x + 1)
        mapped_lazy = lazy.map(lambda x: x * 2)
        self.assertEqual(mapped_lazy.constructor_fn(1), 4)
        self.assertFalse(mapped_lazy.is_evaluated)
        self.assertIsNone(mapped_lazy.value)

    def test_ap(self):
        lazy1 = Lazy(lambda x: x + 1)
        lazy2 = Lazy(lambda x: x * 2)
        applied_lazy = lazy1.ap(lazy2)
        self.assertEqual(applied_lazy.constructor_fn(1), 3)
        self.assertFalse(applied_lazy.is_evaluated)
        self.assertIsNone(applied_lazy.value)

    def test_bind(self):
        lazy = Lazy(lambda x: x + 1)
        bound_lazy = lazy.bind(lambda x: Lazy(lambda y: x * y))
        self.assertEqual(bound_lazy.constructor_fn(2), 4)
        self.assertFalse(bound_lazy.is_evaluated)
        self.assertIsNone(bound_lazy.value)

    def test_get(self):
        lazy = Lazy(lambda x: x + 1)
        self.assertEqual(lazy.get(1), 2)
        self.assertTrue(lazy.is_evaluated)
        self.assertEqual(lazy.value, 2)

    def test_to_box(self):
        lazy = Lazy(lambda x: x + 1)
        box = lazy.to_box(1)
        self.assertEqual(box.value, 2)

    def test_to_either(self):
        lazy = Lazy(lambda x: x + 1)
        either = lazy.to_either(1)
        self.assertEqual(either.value, 2)

    def test_to_maybe(self):
        lazy = Lazy(lambda x: x + 1)
        maybe = lazy.to_maybe(1)
        self.assertEqual(maybe.value, 2)

    def test_to_try(self):
        lazy = Lazy(lambda x: x + 1)
        try_ = lazy.to_try(1)
        self.assertEqual(try_.value, 2)

    def test_to_validation(self):
        lazy = Lazy(lambda x: x + 1)
        validation = lazy.to_validation(1)
        self.assertEqual(validation.value, 2)

if __name__ == '__main__':
    unittest.main()