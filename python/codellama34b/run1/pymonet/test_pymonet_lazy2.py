import unittest
from pymonet.lazy import *

class TestLazy(unittest.TestCase):
    def test_lazy_of(self):
        result = Lazy.of(1)
        self.assertEqual(result, Lazy(lambda *args: 1))

    def test_lazy_map(self):
        result = Lazy.of(1).map(lambda x: x + 1)
        self.assertEqual(result, Lazy(lambda *args: 2))

    def test_lazy_ap(self):
        result = Lazy.of(1).ap(Lazy.of(lambda x: x + 1))
        self.assertEqual(result, Lazy(lambda *args: 2))

    def test_lazy_bind(self):
        result = Lazy.of(1).bind(lambda x: Lazy.of(x + 1))
        self.assertEqual(result, Lazy(lambda *args: 2))

    def test_lazy_get(self):
        result = Lazy.of(1).get()
        self.assertEqual(result, 1)

    def test_lazy_to_box(self):
        from pymonet.box import Box
        result = Lazy.of(1).to_box()
        self.assertEqual(result, Box(1))

    def test_lazy_to_either(self):
        from pymonet.either import Right
        result = Lazy.of(1).to_either()
        self.assertEqual(result, Right(1))

    def test_lazy_to_maybe(self):
        from pymonet.maybe import Maybe
        result = Lazy.of(1).to_maybe()
        self.assertEqual(result, Maybe.just(1))

    def test_lazy_to_try(self):
        from pymonet.monad_try import Try
        result = Lazy.of(1).to_try()
        self.assertEqual(result, Try.of(lambda: 1))

    def test_lazy_to_validation(self):
        from pymonet.validation import Validation
        result = Lazy.of(1).to_validation()
        self.assertEqual(result, Validation.success(1))

    def test_lazy_eq(self):
        result = Lazy.of(1) == Lazy.of(1)
        self.assertTrue(result)

    def test_lazy_str(self):
        result = str(Lazy.of(1))
        self.assertEqual(result, 'Lazy[fn=<function <lambda> at 0x1056873a8>, value=None, is_evaluated=False]')

    def test_lazy_repr(self):
        result = repr(Lazy.of(1))
        self.assertEqual(result, 'Lazy[fn=<function <lambda> at 0x1056873a8>, value=None, is_evaluated=False]')

    def test_lazy_init(self):
        result = Lazy(lambda x: x + 1)
        self.assertEqual(result, Lazy(lambda x: x + 1))

    def test_lazy_private_method(self):
        result = Lazy(lambda x: x + 1)._Lazy__compute_value(1)
        self.assertEqual(result, 2)

if __name__ == '__main__':
    unittest.main()