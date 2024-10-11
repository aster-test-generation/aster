import unittest
from ansible.modules.cron import *


class TestCronModule(unittest.TestCase):
    def setUp(self):
        self.module = cron_module.CronModule()

    def test_init(self):
        self.assertIsInstance(self.module, CronModule)

    def test_str_method(self):
        result = self.module.__str__()
        self.assertEqual(result, "CronModule")

    def test_repr_method(self):
        result = self.module.__repr__()
        self.assertEqual(result, "CronModule()")

    def test_private_method(self):
        result = self.module._CronModule__private_method()
        self.assertEqual(result, "Expected Result")

    def test_protected_method(self):
        result = self.module._protected_method()
        self.assertEqual(result, "Expected Result")

    def test_example_function(self):
        result = example_function(3)
        self.assertEqual(result, 2)

if __name__ == '__main__':
    unittest.main()