import unittest
from ansible.module_utils.facts.virtual.linux import LinuxVirtualCollector


class TestLinuxVirtual(unittest.TestCase):
    def test_init(self):
        instance = LinuxVirtual()
        self.assertIsInstance(instance, LinuxVirtual)

if __name__ == '__main__':
    unittest.main()