import unittest
from ansible.module_utils.facts.virtual.openbsd import *



class TestOpenBSDVirtual(unittest.TestCase):
    def test_get_virtual_facts(self):
        instance = OpenBSDVirtual(module)
        result = instance.get_virtual_facts()
        self.assertIsInstance(result, dict)

    def test_detect_virt_product(self):
        instance = OpenBSDVirtual(module)
        result = instance.detect_virt_product('hw.product')
        self.assertIsInstance(result, dict)

    def test_detect_virt_vendor(self):
        instance = OpenBSDVirtual(module)
        result = instance.detect_virt_vendor('hw.vendor')
        self.assertIsInstance(result, dict)

    def test_virtualization_type(self):
        instance = OpenBSDVirtual(module)
        result = instance.virtualization_type
        self.assertEqual(result, '')

    def test_virtualization_role(self):
        instance = OpenBSDVirtual(module)
        result = instance.virtualization_role
        self.assertEqual(result, '')

    def test_virtualization_tech_guest(self):
        instance = OpenBSDVirtual(module)
        result = instance.virtualization_tech_guest
        self.assertIsInstance(result, set)

    def test_virtualization_tech_host(self):
        instance = OpenBSDVirtual('test')
        result = instance.virtualization_tech_host
        self.assertIsInstance(result, set)

    def test_DMESG_BOOT(self):
        result = OpenBSDVirtual.DMESG_BOOT
        self.assertEqual(result, '/var/run/dmesg.boot')

    def test_platform(self):
        result = OpenBSDVirtual.platform
        self.assertEqual(result, 'OpenBSD')

    def test_get_file_content(self):
        result = get_file_content(OpenBSDVirtual.DMESG_BOOT)
        self.assertIsInstance(result, None)

    def test_re_match(self):
        line = 'vmm0 at mainbus0: SVM/RVI'
        match = re.match('^vmm0 at mainbus0: (SVM/RVI|VMX/EPT)$', line)
        self.assertIsNotNone(match)

    def test_OpenBSDVirtualCollector(self):
        instance = OpenBSDVirtualCollector()
        self.assertIsInstance(instance, VirtualCollector)

    def test_OpenBSDVirtualCollector_fact_class(self):
        result = OpenBSDVirtualCollector._fact_class
        self.assertEqual(result, OpenBSDVirtual)

if __name__ == '__main__':
    unittest.main()