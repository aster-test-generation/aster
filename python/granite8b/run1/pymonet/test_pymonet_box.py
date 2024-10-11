import unittest
from pymonet.box import Box


class TestBox(unittest.TestCase):
    def test_init(self):
        box = Box(1)
        self.assertEqual(box.value, 1)

    def test_eq(self):
        box1 = Box(1)
        box2 = Box(1)
        box3 = Box(2)
        self.assertEqual(box1, box2)
        self.assertNotEqual(box1, box3)

    def test_str(self):
        box = Box(1)
        self.assertEqual(str(box), 'Box[value=1]')

    def test_map(self):
        box = Box(1)
        mapped_box = box.map(lambda x: x + 1)
        self.assertEqual(mapped_box.value, 2)

    def test_bind(self):
        box = Box(1)
        bound_value = box.bind(lambda x: x + 1)
        self.assertEqual(bound_value, 2)

    def test_ap(self):
        box = Box(lambda x: x + 1)
        applicative = Box(1)
        applied_box = box.ap(applicative)
        self.assertEqual(applied_box.value, 2)

    def test_to_maybe(self):
        box = Box(1)
        maybe = box.to_maybe()
        self.assertEqual(maybe.value, 1)

    def test_to_either(self):
        box = Box(1)
        either = box.to_either()
        self.assertEqual(either.value, 1)

    def test_to_lazy(self):
        box = Box(1)
        lazy = box.to_lazy()
        self.assertEqual(lazy.value, 1)

    def test_to_try(self):
        box = Box(1)
        try_ = box.to_try()
        self.assertEqual(try_.value, 1)

    def test_to_validation(self):
        box = Box(1)
        validation = box.to_validation()
        self.assertEqual(validation.value, 1)

if __name__ == '__main__':
    unittest.main()