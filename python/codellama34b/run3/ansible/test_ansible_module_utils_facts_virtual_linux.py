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
        result = instance.get_file_content('/proc/1/cgroup')
        self.assertIsInstance(result, str)

    def test_get_file_lines(self):
        instance = LinuxVirtual()
        result = instance.get_file_lines('/proc/1/cgroup')
        self.assertIsInstance(result, list)

    def test_get_file_content(self):
        instance = LinuxVirtual()
        result = instance.get_file_content('/proc/1/environ')
        self.assertIsInstance(result, str)

    def test_get_file_lines(self):
        instance = LinuxVirtual()
        result = instance.get_file_lines('/proc/1/environ')
        self.assertIsInstance(result, list)

    def test_get_file_content(self):
        instance = LinuxVirtual()
        result = instance.get_file_content('/sys/devices/virtual/dmi/id/product_name')
        self.assertIsInstance(result, str)

    def test_get_file_content(self):
        instance = LinuxVirtual()
        result = instance.get_file_content('/sys/devices/virtual/dmi/id/sys_vendor')
        self.assertIsInstance(result, str)

    def test_get_file_content(self):
        instance = LinuxVirtual()
        result = instance.get_file_content('/sys/devices/virtual/dmi/id/product_family')
        self.assertIsInstance(result, str)

    def test_get_file_content(self):
        instance = LinuxVirtual()
        result = instance.get_file_content('/sys/devices/virtual/dmi/id/bios_vendor')
        self.assertIsInstance(result, str)

    def test_get_file_content(self):
        instance = LinuxVirtual()
        result = instance.get_file_content('/proc/self/status')
        self.assertIsInstance(result, str)

    def test_get_file_lines(self):
        instance = LinuxVirtual()
        result = instance.get_file_lines('/proc/self/status')
        self.assertIsInstance(result, list)

    def test_get_file_content(self):
        instance = LinuxVirtual()
        result = instance.get_file_content('/proc/cpuinfo')
        self.assertIsInstance(result, str)

    def test_get_file_lines(self):
        instance = LinuxVirtual()
        result = instance.get_file_lines('/proc/cpuinfo')
        self.assertIsInstance(result, list)

    def test_get_file_content(self):
        instance = LinuxVirtual()
        result = instance.get_file_content('/proc/modules')
        self.assertIsInstance(result, str)

    def test_get_file_lines(self):
        instance = LinuxVirtual()
        result = instance.get_file_lines('/proc/modules')
        self.assertIsInstance(result, list)

    def test_get_bin_path(self):
        instance = LinuxVirtual()
        result = instance.get_bin_path('dmidecode')
        self.assertIsInstance(result, str)

    def test_run_command(self):
        instance = LinuxVirtual()
        result = instance.run_command('dmidecode -s system-product-name')
        self.assertIsInstance(result, tuple)

    def test_get_file_content(self):
        instance = LinuxVirtual()
        result = instance.get_file_content('/rhev/')
        self.assertIsInstance(result, str)

if __name__ == '__main__':
    unittest.main()