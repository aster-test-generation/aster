import unittest
from ansible.module_utils.facts.virtual import linux


class TestLinuxVirtual(unittest.TestCase):
    def test_init(self):
        instance = LinuxVirtual()
        self.assertIsInstance(instance, LinuxVirtual)

    def test_private_method(self):
        instance = LinuxVirtual()
        result = instance._private_method()
        self.assertEqual(result, "private method")

    def test_protected_method(self):
        instance = LinuxVirtual()
        result = instance._protected_method()
        self.assertEqual(result, "protected method")

    def test_str_method(self):
        instance = LinuxVirtual()
        result = instance.__str__()
        self.assertEqual(result, "LinuxVirtual")

    def test_repr_method(self):
        instance = LinuxVirtual()
        result = instance.__repr__()
        self.assertEqual(result, "LinuxVirtual()")

    def test_eq_method(self):
        instance1 = LinuxVirtual()
        instance2 = LinuxVirtual()
        self.assertEqual(instance1, instance2)

if __name__ == '__main__':
    unittest.main()