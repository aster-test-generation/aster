import unittest
from ansible.module_utils.facts.virtual import LinuxVirtualCollecto


class TestLinuxVirtual(unittest.TestCase):
    def test_get_virtual_facts(self):
        instance = LinuxVirtual()
        virtual_facts = instance.get_virtual_facts()
        self.assertIsInstance(virtual_facts, dict)
        self.assertIn('virtualization_type', virtual_facts)
        self.assertIn('virtualization_role', virtual_facts)
        self.assertIn('virtualization_tech_guest', virtual_facts)
        self.assertIn('virtualization_tech_host', virtual_facts)

    def test_get_virtual_facts_private_method(self):
        instance = LinuxVirtual()
        virtual_facts = instance._get_virtual_facts_private_method()
        self.assertIsInstance(virtual_facts, dict)
        self.assertIn('virtualization_type', virtual_facts)
        self.assertIn('virtualization_role', virtual_facts)
        self.assertIn('virtualization_tech_guest', virtual_facts)
        self.assertIn('virtualization_tech_host', virtual_facts)

    def test_get_file_content(self):
        instance = LinuxVirtual()
        content = instance._get_file_content('/sys/devices/virtual/dmi/id/product_name')
        self.assertIsInstance(content, str)

    def test_get_file_lines(self):
        instance = LinuxVirtual()
        lines = instance._get_file_lines('/proc/1/cgroup')
        self.assertIsInstance(lines, list)

    def test_get_file_lines_private_method(self):
        instance = LinuxVirtual()
        lines = instance._get_file_lines_private_method('/proc/1/cgroup')
        self.assertIsInstance(lines, list)

    def test_get_bin_path(self):
        instance = LinuxVirtual()
        bin_path = instance._get_bin_path('dmidecode')
        self.assertIsInstance(bin_path, str)

    def test_run_command(self):
        instance = LinuxVirtual()
        rc, out, err = instance._run_command(['dmidecode', '-s', 'system-product-name'])
        self.assertIsInstance(rc, int)
        self.assertIsInstance(out, str)
        self.assertIsInstance(err, str)

    def test_str_method(self):
        instance = LinuxVirtual()
        result = str(instance)
        self.assertEqual(result, 'LinuxVirtual')

    def test_repr_method(self):
        instance = LinuxVirtual()
        result = repr(instance)
        self.assertEqual(result, 'LinuxVirtual()')

    def test_eq_method(self):
        instance1 = LinuxVirtual()
        instance2 = LinuxVirtual()
        self.assertTrue(instance1 == instance2)

if __name__ == '__main__':
    unittest.main()