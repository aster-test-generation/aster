import unittest
from ansible.module_utils.facts.virtual.openbsd import OpenBSDVirtual, OpenBSDVirtualCollector


class TestOpenBSDVirtual(unittest.TestCase):
    def test_get_virtual_facts(self):
        instance = OpenBSDVirtual()
        virtual_facts = instance.get_virtual_facts()
        self.assertIn('virtualization_type', virtual_facts)
        self.assertIn('virtualization_role', virtual_facts)
        self.assertIn('virtualization_tech_guest', virtual_facts)
        self.assertIn('virtualization_tech_host', virtual_facts)

    def test_detect_virt_product(self):
        instance = OpenBSDVirtual()
        virtual_product_facts = instance.detect_virt_product('hw.product')
        self.assertIn('virtualization_tech_guest', virtual_product_facts)
        self.assertIn('virtualization_tech_host', virtual_product_facts)

    def test_detect_virt_vendor(self):
        instance = OpenBSDVirtual()
        virtual_vendor_facts = instance.detect_virt_vendor('hw.vendor')
        self.assertIn('virtualization_tech_guest', virtual_vendor_facts)
        self.assertIn('virtualization_tech_host', virtual_vendor_facts)

    def test_get_file_content(self):
        instance = OpenBSDVirtual()
        dmesg_boot = instance.get_file_content(OpenBSDVirtual.DMESG_BOOT)
        self.assertIsInstance(dmesg_boot, str)

    def test_match_dmesg_boot(self):
        instance = OpenBSDVirtual()
        dmesg_boot = 'vmm0 at mainbus0: SVM/RVI'
        match = instance.match_dmesg_boot(dmesg_boot)
        self.assertEqual(match.group(1), 'SVM/RVI')

    def test_init(self):
        instance = OpenBSDVirtual()
        self.assertEqual(instance.platform, 'OpenBSD')

    def test_str(self):
        instance = OpenBSDVirtual()
        self.assertEqual(str(instance), 'OpenBSDVirtual')

    def test_repr(self):
        instance = OpenBSDVirtual()
        self.assertEqual(repr(instance), 'OpenBSDVirtual()')

class TestOpenBSDVirtualCollector(unittest.TestCase):
    def test_init(self):
        instance = OpenBSDVirtualCollector()
        self.assertEqual(instance._fact_class, OpenBSDVirtual)
        self.assertEqual(instance._platform, 'OpenBSD')

if __name__ == '__main__':
    unittest.main()