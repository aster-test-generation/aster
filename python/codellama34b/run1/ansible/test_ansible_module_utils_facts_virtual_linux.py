import unittest
from ansible.module_utils.facts.virtual.linux import LinuxVirtualCollector


class TestLinuxVirtual(unittest.TestCase):
    def test_init(self):
        instance = LinuxVirtual()
        self.assertIsInstance(instance, LinuxVirtual)

    def test_get_virtual_facts(self):
        instance = LinuxVirtual()
        result = instance.get_virtual_facts()
        self.assertIsInstance(result, dict)

    def test_get_file_content(self):
        instance = LinuxVirtual()
        result = instance.get_file_content('')
        self.assertIsInstance(result, str)

    def test_get_file_lines(self):
        instance = LinuxVirtual()
        result = instance.get_file_lines('')
        self.assertIsInstance(result, list)

    def test_get_bin_path(self):
        instance = LinuxVirtual()
        result = instance.get_bin_path('')
        self.assertIsInstance(result, str)

    def test_run_command(self):
        instance = LinuxVirtual()
        result = instance.run_command('')
        self.assertIsInstance(result, tuple)

if __name__ == '__main__':
    unittest.main()