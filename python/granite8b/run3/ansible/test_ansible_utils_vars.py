import unittest
from ansible.utils.vars import *


class TestExampleClass(unittest.TestCase):
    def test_method_one(self):
        instance = ExampleClass()
        result = instance.method_one(1)
        self.assertEqual(result, 2)

    def test_method_two(self):
        instance = ExampleClass()
        result = instance.method_two(2)
        self.assertEqual(result, 4)

    def test_protected_method(self):
        instance = ExampleClass()
        result = instance._protected_method(3)
        self.assertEqual(result, 6)

    def test_private_method(self):
        instance = ExampleClass()
        result = instance._ExampleClass__private_method(3)
        self.assertEqual(result, 9)

    def test_str_method(self):
        instance = ExampleClass()
        result = instance.__str__()
        self.assertEqual(result, "ExampleClass")

    def test_repr_method(self):
        instance = ExampleClass()
        result = instance.__repr__()
        self.assertEqual(result, "ExampleClass(1)")

class TestExampleFunction(unittest.TestCase):
    def test_example_function(self):
        result = example_function(3)
        self.assertEqual(result, 2)

if __name__ == '__main__':
    unittest.main()