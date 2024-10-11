import unittest
from pymonet.box import Box


class TestBox(unittest.TestCase):
    def test_init(self):
        box = Box(5)
        self.assertEqual(box.value, 5)

    def test_eq(self):
        box1 = Box(5)
        box2 = Box(5)
        box3 = Box(10)
        self.assertEqual(box1, box2)
        self.assertNotEqual(box1, box3)

    def test_str(self):
        box = Box(5)
        self.assertEqual(str(box), "Box[value=5]")

    def test_map(self):
        box = Box(5)
        result = box.map(lambda x: x * 2)
        self.assertEqual(result.value, 10)

    def test_bind(self):
        box = Box(5)
        result = box.bind(lambda x: Box(x * 2))
        self.assertEqual(result.value, 10)

    def test_ap(self):
        box = Box(5)
        result = box.ap(Box(lambda x: x * 2))
        self.assertEqual(result.value, 10)

    def test_to_maybe(self):
        box = Box(5)
        result = box.to_maybe()
        self.assertEqual(result.value, 5)

    def test_to_either(self):
        box = Box(5)
        result = box.to_either()
        self.assertEqual(result.value, 5)

    def test_to_lazy(self):
        box = Box(5)
        result = box.to_lazy()
        self.assertEqual(result.value, 5)

    def test_to_try(self):
        box = Box(5)
        result = box.to_try()
        self.assertEqual(result.value, 5)

    def test_to_validation(self):
        box = Box(5)
        result = box.to_validation()
        self.assertEqual(result.value, 5)

if __name__ == '__main__':
    unittest.main()