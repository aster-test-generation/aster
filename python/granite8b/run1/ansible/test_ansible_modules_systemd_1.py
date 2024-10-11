import unittest
from ansible.modules.systemd import *


class TestExampleClass(unittest.TestCase):
    def test_method_one(self):
        instance = ExampleClass()
        result = instance.method_one(1)
        self.assertEqual(result, 2)

    def test_method_two(self):
        instance = ExampleClass()
        result = instance.method_two(2)
        self.assertEqual(result, 4)

if __name__ == '__main__':
    unittest.main()