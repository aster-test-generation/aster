import unittest
from pymonet.lazy import Lazy


class TestLazy(unittest.TestCase):
    def test_lazy_init(self):
        lazy = Lazy(lambda x: x + 1)
        self.assertEqual(lazy.is_evaluated, False)
        self.assertEqual(lazy.value, None)

    def test_lazy_str(self):
        lazy = Lazy(lambda x: x + 1)
        self.assertEqual(str(lazy), 'Lazy[fn=<function <lambda> at 0x7f67743490e0>, value=None, is_evaluated=False]')

    def test_lazy_eq(self):
        lazy1 = Lazy(lambda x: x + 1)
        lazy2 = Lazy(lambda x: x + 1)
        lazy3 = Lazy(lambda x: x + 2)
        self.assertEqual(lazy1.value, lazy2.value)
        self.assertNotEqual(lazy1, lazy3)

    def test_lazy_of(self):
        lazy = Lazy.of(10)
        self.assertEqual(lazy.is_evaluated, False)
        self.assertEqual(lazy.value, 10)

    def test_lazy_map(self):
        lazy = Lazy(lambda x: x + 1).map(lambda x: x * 2)
        self.assertEqual(lazy.is_evaluated, False)
        self.assertEqual(lazy.value, None)
        self.assertEqual(lazy.get(), 5)

    def test_lazy_ap(self):
        lazy1 = Lazy(lambda x: x + 1)
        lazy2 = Lazy(lambda x: x * 2)
        lazy3 = lazy1.ap(lazy2)
        self.assertEqual(lazy3.is_evaluated, False)
        self.assertEqual(lazy3.value, None)
        self.assertEqual(lazy3.get(), 6)

    def test_lazy_bind(self):
        lazy1 = Lazy(lambda x: x + 1)
        lazy2 = lazy1.bind(lambda x: Lazy(lambda y: x + y))
        self.assertEqual(lazy2.is_evaluated, False)
        self.assertEqual(lazy2.value, None)
        self.assertEqual(lazy2.get(2), 3)

    def test_lazy_get(self):
        lazy = Lazy(lambda x: x + 1)
        self.assertEqual(lazy.get(1), 2)

    def test_lazy_to_box(self):
        lazy = Lazy(lambda x: x + 1)
        self.assertEqual(lazy.to_box().get(1), 2)

    def test_lazy_to_either(self):
        lazy = Lazy(lambda x: x + 1)
        self.assertEqual(lazy.to_either(lambda: 1).get(), 1)

    def test_lazy_to_maybe(self):
        lazy = Lazy(lambda x: x + 1)
        self.assertEqual(lazy.to_maybe(2).get(), 2)

    def test_lazy_to_try(self):
        lazy = Lazy(lambda x: x + 1)
        self.assertEqual(lazy.to_try().get(), 2)

    def test_lazy_to_validation(self):
        lazy = Lazy(lambda x: x + 1)
        self.assertEqual(lazy.to_validation(1).get(), 2)

if __name__ == '__main__':
    unittest.main()