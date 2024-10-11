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

    def test__private_method(self):
        instance = LinuxVirtual()
        result = instance._LinuxVirtual__private_method()  # Note: Python's name mangling
        self.assertRaises(NotImplementedError, instance._LinuxVirtual__private_method)

    def test__str__(self):
        instance = LinuxVirtual()
        result = str(instance)
        self.assertIsInstance(result, str)

    def test__repr__(self):
        instance = LinuxVirtual()
        result = repr(instance)
        self.assertIsInstance(result, str)

    def test_get_file_content(self):
        instance = LinuxVirtual()
        result = instance.get_file_content('/sys/devices/virtual/dmi/id/product_name')
        self.assertIsInstance(result, str)

    def test_get_file_lines(self):
        instance = LinuxVirtual()
        result = instance.get_file_lines('/proc/1/cgroup')
        self.assertIsInstance(result, list)

    def test_module_get_bin_path(self):
        instance = LinuxVirtual()
        result = instance.module.get_bin_path('dmidecode')
        self.assertIsInstance(result, str)

    def test_module_run_command(self):
        instance = LinuxVirtual()
        result = instance.module.run_command(['lscpu'])
        self.assertIsInstance(result, tuple)

if __name__ == '__main__':
    unittest.main()