import unittest
import target_module
from httpie.cli.argparser import HTTPieArgumentParser


class TestTargetClass(unittest.TestCase):
    def test_public_method(self):
        instance = TargetClass()
        result = instance.public_method(1)
        self.assertEqual(result, 2)

    def test_protected_method(self):
        instance = TargetClass()
        result = instance._protected_method(2)
        self.assertEqual(result, 4)

    def test_private_method(self):
        instance = TargetClass()
        result = instance._TargetClass__private_method(3)
        self.assertEqual(result, 9)

    def test_str_method(self):
        instance = TargetClass()
        result = instance.__str__()
        self.assertEqual(result, "TargetClass")

    def test_repr_method(self):
        instance = TargetClass()
        result = instance.__repr__()
        self.assertEqual(result, "TargetClass(1)")

class TestTargetFunction(unittest.TestCase):
    def test_target_function(self):
        result = target_function(3)
        self.assertEqual(result, 2)

class TestHTTPieArgumentParser(unittest.TestCase):
    def setUp(self):
        self.parser = HTTPieArgumentParser()

    def test_private_method(self):
        result = self.parser._private_method(1)
        self.assertEqual(result, 2)

    def test_protected_method(self):
        result = self.parser._protected_method(2)
        self.assertEqual(result, 3)

    def test_magic_method(self):
        result = self.parser.__magic_method(3)
        self.assertEqual(result, 4)

if __name__ == '__main__':
    unittest.main()