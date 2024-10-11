import unittest
from pymonet.box import Box
from typing import Callable


class TestBox(unittest.TestCase):
    def test_init(self):
        box = Box(1)
        self.assertEqual(box.value, 1)

    def test_eq(self):
        box1 = Box(1)
        box2 = Box(1)
        self.assertTrue(box1 == box2)
        self.assertFalse(box1 == Box(2))

    def test_str(self):
        box = Box(1)
        self.assertEqual(str(box), 'Box[value=1]')

    def test_map(self):
        box = Box(1)
        mapped_box = box.map(lambda x: x * 2)
        self.assertEqual(mapped_box.value, 2)

    def test_bind(self):
        box = Box(1)
        bound_value = box.bind(lambda x: x * 2)
        self.assertEqual(bound_value, 2)

    def test_ap(self):
        box = Box(1)
        applicative = Box(lambda x: x * 2)
        result = box.ap(applicative)
        self.assertEqual(result.value, 2)

    def test_to_maybe(self):
        box = Box(1)
        maybe = box.to_maybe()
        self.assertIsInstance(maybe, Box)
        self.assertEqual(maybe.value, 1)

    def test_to_either(self):
        box = Box(1)
        either = box.to_either()
        self.assertIsInstance(either, Box)
        self.assertEqual(either.value, 1)

    def test_to_lazy(self):
        box = Box(1)
        lazy = box.to_lazy()
        self.assertIsInstance(lazy, Box)
        self.assertEqual(lazy.value, 1)

    def test_to_try(self):
        box = Box(1)
        try_ = box.to_try()
        self.assertIsInstance(try_, Box)
        self.assertEqual(try_.value, 1)

    def test_to_validation(self):
        box = Box(1)
        validation = box.to_validation()
        self.assertIsInstance(validation, Box)
        self.assertEqual(validation.value, 1)

    def test_private_method(self):
        box = Box(1)
        with self.assertRaises(AttributeError):
            box.__private_method()

    def test_protected_method(self):
        box = Box(1)
        with self.assertRaises(AttributeError):
            box._Box__protected_method()

if __name__ == '__main__':
    unittest.main()