import unittest
from pymonet.box import Box


class TestBox(unittest.TestCase):
    def test_init(self):
        instance = Box(1)
        self.assertEqual(instance.value, 1)

    def test_eq(self):
        instance = Box(1)
        result = instance.__eq__(Box(1))
        self.assertTrue(result)

    def test_str(self):
        instance = Box(1)
        result = instance.__str__()
        self.assertEqual(result, 'Box[value=1]')

    def test_map(self):
        instance = Box(1)
        result = instance.map(lambda x: x + 1)
        self.assertEqual(result.value, 2)

    def test_bind(self):
        instance = Box(1)
        result = instance.bind(lambda x: x + 1)
        self.assertEqual(result, 2)

    def test_ap(self):
        instance = Box(1)
        result = instance.ap(Box(lambda x: x + 1))
        self.assertEqual(result.value, 2)

    def test_to_maybe(self):
        instance = Box(1)
        result = instance.to_maybe()
        self.assertEqual(result.value, 1)

    def test_to_either(self):
        instance = Box(1)
        result = instance.to_either()
        self.assertEqual(result.value, 1)

    def test_to_lazy(self):
        instance = Box(1)
        result = instance.to_lazy()
        self.assertEqual(result.value, None)

    def test_to_try(self):
        instance = Box(1)
        result = instance.to_try()
        self.assertEqual(result.value, 1)

    def test_to_validation(self):
        instance = Box(1)
        result = instance.to_validation()
        self.assertEqual(result.value, 1)

if __name__ == '__main__':
    unittest.main()