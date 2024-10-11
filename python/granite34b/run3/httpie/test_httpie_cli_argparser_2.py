import unittest
import target_module


class TestClassName(unittest.TestCase):
    def test_public_method(self):
        instance = ClassName()
        result = instance.public_method(1, 2)
        self.assertEqual(result, 3)

    def test_protected_method(self):
        instance = ClassName()
        result = instance._protected_method(3, 4)
        self.assertEqual(result, 7)

    def test_private_method(self):
        instance = ClassName()
        result = instance.__private_method(5, 6)
        self.assertEqual(result, 11)

    def test_magic_method(self):
        instance = ClassName()
        result = instance.__str__()
        self.assertEqual(result, "ClassName")

if __name__ == '__main__':
    unittest.main()