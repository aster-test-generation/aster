import unittest
from pymonet.box import Box


class TestBox(unittest.TestCase):
    def test_init(self):
        box = Box(42)
        self.assertEqual(box.value, 42)

    def test_eq(self):
        box1 = Box(42)
        box2 = Box(42)
        self.assertTrue(box1 == box2)

    def test_str(self):
        box = Box(42)
        self.assertEqual(str(box), 'Box[value=42]')

    def test_map(self):
        box = Box(42)
        result = box.map(lambda x: x * 2)
        self.assertEqual(result.value, 84)

    def test_bind(self):
        box = Box(42)
        result = box.bind(lambda x: x * 2)
        self.assertEqual(result, 84)

    def test_ap(self):
        box = Box(42)
        applicative = Box(lambda x: x * 2)
        result = box.ap(applicative)
        self.assertEqual(result.value, 84)

    def test_to_maybe(self):
        box = Box(42)
        result = box.to_maybe()
        self.assertEqual(result.value, 42)

    def test_to_either(self):
        box = Box(42)
        result = box.to_either()
        self.assertEqual(result.value, 42)

    def test_to_lazy(self):
        box = Box(42)
        result = box.to_lazy()
        self.assertEqual(result.value, 42)

    def test_to_try(self):
        box = Box(42)
        result = box.to_try()
        self.assertEqual(result.value, 42)

    def test_to_validation(self):
        box = Box(42)
        result = box.to_validation()
        self.assertEqual(result.value, 42)

    def test_private_methods(self):
        box = Box(42)
        # No private methods in this class

    def test_protected_methods(self):
        box = Box(42)
        # No protected methods in this class

if __name__ == '__main__':
    unittest.main()