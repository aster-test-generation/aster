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
        result = box.map(lambda x: x + 5)
        self.assertEqual(result.value, 15)

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
        result = box.to_maybe()
        self.assertIsInstance(result, Maybe)
        self.assertEqual(result.get_or_else(None), 10)

    def test_to_either(self):
        box = Box(10)
        result = box.to_either()
        self.assertIsInstance(result, Right)
        self.assertEqual(result.right, 10)

    def test_to_lazy(self):
        box = Box(10)
        result = box.to_lazy()
        self.assertIsInstance(result, Lazy)
        self.assertEqual(result, 10)

    def test_to_try(self):
        box = Box(10)
        result = box.to_try()
        self.assertIsInstance(result, Try)
        self.assertTrue(result.is_success)
        self.assertEqual(result.get_or_else(None), 10)

    def test_to_validation(self):
        box = Box(10)
        result = box.to_validation()
        self.assertIsInstance(result, Validation)
        self.assertTrue(result.is_success())
        self.assertEqual(result.success().value, 10)

if __name__ == '__main__':
    unittest.main()