import unittest
from ansible.module_utils.facts.virtual.linux import LinuxVirtualCollecto


class TestLinuxVirtual(unittest.TestCase):
    def test___init__(self):
        instance = LinuxVirtual()
        self.assertIsInstance(instance, LinuxVirtual)

    def test___str__(self):
        instance = LinuxVirtual()
        result = instance.__str__()
        self.assertIsInstance(result, str)

    def test___repr__(self):
        instance = LinuxVirtual()
        result = instance.__repr__()
        self.assertIsInstance(result, str)

    def test___eq__(self):
        instance1 = LinuxVirtual()
        instance2 = LinuxVirtual()
        result = instance1 == instance2
        self.assertTrue(result)

if __name__ == '__main__':
    unittest.main()