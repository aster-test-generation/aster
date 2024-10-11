import unittest
from pymonet.box import Box
from pymonet.maybe import Maybe
from pymonet.either import Right
from pymonet.lazy import Lazy
from pymonet.monad_try import Try
from pymonet.validation import Validation


class TestBox(unittest.TestCase):
    def test_init(self):
        box = Box(10)
        self.assertEqual(box.value, 10)

    def test_eq(self):
        box1 = Box(10)
        box2 = Box(10)
        box3 = Box(20)
        self.assertTrue(box1 == box2)
        self.assertFalse(box1 == box3)
        self.assertFalse(box1 == 10)

    def test_str(self):
        box = Box(10)
        self.assertEqual(str(box), 'Box[value=10]')

    def test_map(self):
        box = Box(10)
        mapped_box = box.map(lambda x: x + 5)
        self.assertEqual(mapped_box.value, 15)

    def test_bind(self):
        box = Box(10)
        result = box.bind(lambda x: x + 5)
        self.assertEqual(result, 15)

    def test_ap(self):
        box = Box(lambda x: x + 5)
        applicative = Box(10)
        result = box.ap(applicative)
        self.assertEqual(result.value, 15)

    def test_to_maybe(self):
        box = Box(10)
        maybe = box.to_maybe()
        self.assertIsInstance(maybe, Maybe)
        self.assertEqual(maybe.get_or_else(None), 10)

    def test_to_either(self):
        box = Box(10)
        either = box.to_either()
        self.assertIsInstance(either, Right)
        self.assertEqual(either.value, 10)

    def test_to_lazy(self):
        box = Box(10)
        lazy = box.to_lazy()
        self.assertIsInstance(lazy, Lazy)
        self.assertEqual(lazy.value, 10)

    def test_to_try(self):
        box = Box(10)
        try_monad = box.to_try()
        self.assertIsInstance(try_monad, Try)
        self.assertTrue(try_monad.is_success)
        self.assertEqual(try_monad.get_or_else(None), 10)

    def test_to_validation(self):
        box = Box(10)
        validation = box.to_validation()
        self.assertIsInstance(validation, Validation)
        self.assertTrue(validation.is_success())
        self.assertEqual(validation.success().value, 10)

if __name__ == '__main__':
    unittest.main()