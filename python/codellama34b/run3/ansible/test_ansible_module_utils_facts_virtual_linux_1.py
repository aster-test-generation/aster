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

    def test_get_product_facts(self):
        instance = LinuxVirtual()
        result = instance.get_product_facts()
        self.assertIsInstance(result, dict)

    def test_get_virtual_facts_from_file(self):
        instance = LinuxVirtual()
        result = instance.get_virtual_facts_from_file()
        self.assertIsInstance(result, dict)

    def test_get_product_facts_from_file(self):
        instance = LinuxVirtual()
        result = instance.get_product_facts_from_file()
        self.assertIsInstance(result, dict)

    def test_get_virtual_facts_from_dmi(self):
        instance = LinuxVirtual()
        result = instance.get_virtual_facts_from_dmi()
        self.assertIsInstance(result, dict)

    def test_get_product_facts_from_dmi(self):
        instance = LinuxVirtual()
        result = instance.get_product_facts_from_dmi()
        self.assertIsInstance(result, dict)

    def test_get_virtual_facts_from_lspci(self):
        instance = LinuxVirtual()
        result = instance.get_virtual_facts_from_lspci()
        self.assertIsInstance(result, dict)

    def test_get_product_facts_from_lspci(self):
        instance = LinuxVirtual()
        result = instance.get_product_facts_from_lspci()
        self.assertIsInstance(result, dict)

    def test_get_virtual_facts_from_dmidecode(self):
        instance = LinuxVirtual()
        result = instance.get_virtual_facts_from_dmidecode()
        self.assertIsInstance(result, dict)

    def test_get_product_facts_from_dmidecode(self):
        instance = LinuxVirtual()
        result = instance.get_product_facts_from_dmidecode()
        self.assertIsInstance(result, dict)

    def test_get_virtual_facts_from_sysfs(self):
        instance = LinuxVirtual()
        result = instance.get_virtual_facts_from_sysfs()
        self.assertIsInstance(result, dict)

    def test_get_product_facts_from_sysfs(self):
        instance = LinuxVirtual()
        result = instance.get_product_facts_from_sysfs()
        self.assertIsInstance(result, dict)

    def test_get_virtual_facts_from_cpuinfo(self):
        instance = LinuxVirtual()
        result = instance.get_virtual_facts_from_cpuinfo()
        self.assertIsInstance(result, dict)

    def test_get_product_facts_from_cpuinfo(self):
        instance = LinuxVirtual()
        result = instance.get_product_facts_from_cpuinfo()
        self.assertIsInstance(result, dict)

    def test_get_virtual_facts_from_cmdline(self):
        instance = LinuxVirtual()
        result = instance.get_virtual_facts_from_cmdline()
        self.assertIsInstance(result, dict)

    def test_get_product_facts_from_cmdline(self):
        instance = LinuxVirtual()
        result = instance.get_product_facts_from_cmdline()
        self.assertIsInstance(result, dict)

    def test_get_virtual_facts_from_virt_what(self):
        instance = LinuxVirtual()
        result = instance.get_virtual_facts_from_virt_what()
        self.assertIsInstance(result, dict)

if __name__ == '__main__':
    unittest.main()