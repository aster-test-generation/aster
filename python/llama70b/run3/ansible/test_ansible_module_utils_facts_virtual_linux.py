import unittest
from ansible.module_utils.facts.virtual.linux import LinuxVirtualCollecto


class TestLinuxVirtual(unittest.TestCase):
    def test_init(self):
        instance = LinuxVirtual()
        self.assertIsInstance(instance, LinuxVirtual)

    def test_get_virtual_facts(self):
        instance = LinuxVirtual()
        result = instance.get_virtual_facts()
        self.assertIsInstance(result, dict)

    def test_private_method__get_file_lines(self):
        instance = LinuxVirtual()
        result = instance._LinuxVirtual__get_file_lines('/proc/1/cgroup')
        self.assertIsInstance(result, list)

    def test_private_method__get_file_content(self):
        instance = LinuxVirtual()
        result = instance._LinuxVirtual__get_file_content('/sys/devices/virtual/dmi/id/product_name')
        self.assertIsInstance(result, str)

    def test_protected_method__get_bin_path(self):
        instance = LinuxVirtual()
        result = instance._get_bin_path('dmidecode')
        self.assertIsInstance(result, str)

    def test_magic_method__str__(self):
        instance = LinuxVirtual()
        result = str(instance)
        self.assertIsInstance(result, str)

    def test_magic_method__repr__(self):
        instance = LinuxVirtual()
        result = repr(instance)
        self.assertIsInstance(result, str)

    def test_magic_method__eq__(self):
        instance1 = LinuxVirtual()
        instance2 = LinuxVirtual()
        result = instance1 == instance2
        self.assertIsInstance(result, bool)

if __name__ == '__main__':
    unittest.main()