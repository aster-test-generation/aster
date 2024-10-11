import unittest
from ansible.modules.yum_repository import YumRepository


class TestYumRepository(unittest.TestCase):
    def test_method_one(self):
        instance = YumRepository()
        result = instance.method_one(1)
        self.assertEqual(result, 2)

    def test_method_two(self):
        instance = YumRepository()
        result = instance.method_two(2)
        self.assertEqual(result, 4)

    def test_protected_method(self):
        instance = YumRepository()
        result = instance._protected_method(3)
        self.assertEqual(result, 6)

    def test_private_method(self):
        instance = YumRepository()
        result = instance._YumRepository__private_method(3)
        self.assertEqual(result, 9)

    def test_str_method(self):
        instance = YumRepository()
        result = instance.__str__()
        self.assertEqual(result, "ExampleClass")

    def test_repr_method(self):
        instance = YumRepository()
        result = instance.__repr__()
        self.assertEqual(result, "ExampleClass(1)")

if __name__ == '__main__':
    unittest.main()