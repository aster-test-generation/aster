import unittest
from ansible.module_utils.facts.virtual.openbsd import OpenBSDVirtual, OpenBSDVirtualCollector


class TestOpenBSDVirtual(unittest.TestCase):
    def test_get_virtual_facts(self):
        instance = OpenBSDVirtual()
        virtual_facts = instance.get_virtual_facts()
        self.assertEqual(virtual_facts['virtualization_type'], '')
        self.assertEqual(virtual_facts['virtualization_role'], '')
        self.assertEqual(virtual_facts['virtualization_tech_guest'], set())
        self.assertEqual(virtual_facts['virtualization_tech_host'], set())

    def test_detect_virt_product(self):
        instance = OpenBSDVirtual()
        virtual_product_facts = instance.detect_virt_product('hw.product')
        self.assertEqual(virtual_product_facts['virtualization_tech_guest'], set())
        self.assertEqual(virtual_product_facts['virtualization_tech_host'], set())

    def test_detect_virt_vendor(self):
        instance = OpenBSDVirtual()
        virtual_vendor_facts = instance.detect_virt_vendor('hw.vendor')
        self.assertEqual(virtual_vendor_facts['virtualization_tech_guest'], set())
        self.assertEqual(virtual_vendor_facts['virtualization_tech_host'], set())

    def test_get_file_content(self):
        instance = OpenBSDVirtual()
        dmesg_boot = instance.get_file_content(OpenBSDVirtual.DMESG_BOOT)
        self.assertEqual(dmesg_boot, '')

    def test_match_dmesg_boot(self):
        instance = OpenBSDVirtual()
        dmesg_boot = instance.get_file_content(OpenBSDVirtual.DMESG_BOOT)
        for line in dmesg_boot.splitlines():
            match = re.match('^vmm0 at mainbus0: (SVM/RVI|VMX/EPT)$', line)
            self.assertIsNone(match)

    def test_str_method(self):
        instance = OpenBSDVirtual()
        result = instance.__str__()
        self.assertEqual(result, 'OpenBSDVirtual')

    def test_repr_method(self):
        instance = OpenBSDVirtual()
        result = instance.__repr__()
        self.assertEqual(result, 'OpenBSDVirtual()')

class TestOpenBSDVirtualCollector(unittest.TestCase):
    def test_init(self):
        instance = OpenBSDVirtualCollector()
        self.assertEqual(instance._fact_class, OpenBSDVirtual)
        self.assertEqual(instance._platform, 'OpenBSD')

if __name__ == '__main__':
    unittest.main()