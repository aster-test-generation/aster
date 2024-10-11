import unittest
from pymonet.box import Box
from unittest import TestCase


class TestBox(TestCase):
    def test_init(self):
        box = Box(5)
        self.assertEqual(box.value, 5)

    def test_eq(self):
        box1 = Box(5)
        box2 = Box(5)
        box3 = Box(6)
        self.assertEqual(box1, box2)
        self.assertNotEqual(box1, box3)

    def test_str(self):
        box = Box(5)
        self.assertEqual(str(box), 'Box[value=5]')

    def test_map(self):
        box = Box(5)
        box_mapped = box.map(lambda x: x + 1)
        self.assertEqual(box_mapped.value, 6)

    def test_bind(self):
        box = Box(5)
        result = box.bind(lambda x: x + 1)
        self.assertEqual(result, 6)

    def test_ap(self):
        box = Box(lambda x: x + 1)
        box_apped = box.ap(Box(5))
        self.assertEqual(box_apped.value, 6)

    def test_to_maybe(self):
        box = Box(5)
        maybe = box.to_maybe()
        self.assertEqual(maybe.value, 5)

    def test_to_either(self):
        box = Box(5)
        either = box.to_either()
        self.assertEqual(either.value, 5)

    def test_to_lazy(self):
        box = Box(5)
        lazy = box.to_lazy()
        self.assertEqual(lazy.value, 5)

    def test_to_try(self):
        box = Box(5)
        try_ = box.to_try()
        self.assertEqual(try_.value, 5)

    def test_to_validation(self):
        box = Box(5)
        validation = box.to_validation()
        self.assertEqual(validation.value, 5)

if __name__ == '__main__':
    unittest.main()