import unittest
from ansible.module_utils.facts.virtual.openbsd import *



class TestOpenBSDVirtual(unittest.TestCase):
    def test_get_virtual_facts(self):
        instance = OpenBSDVirtual(module)
        result = instance.get_virtual_facts()
        self.assertIsNotNone(result)

    def test_detect_virt_product(self):
        instance = OpenBSDVirtual(module)
        result = instance.detect_virt_product('hw.product')
        self.assertIsNotNone(result)

    def test_detect_virt_vendor(self):
        instance = OpenBSDVirtual(module)
        result = instance.detect_virt_vendor('hw.vendor')
        self.assertIsNotNone(result)

    def test_virtualization_type(self):
        instance = OpenBSDVirtual(module)
        result = instance.virtualization_type
        self.assertIsNotNone(result)

    def test_virtualization_role(self):
        instance = OpenBSDVirtual(module)
        result = instance.virtualization_role
        self.assertIsNotNone(result)

    def test_virtualization_tech_guest(self):
        instance = OpenBSDVirtual(module)
        result = instance.virtualization_tech_guest
        self.assertIsNotNone(result)

    def test_virtualization_tech_host(self):
        instance = OpenBSDVirtual(module)
        result = instance.virtualization_tech_host
        self.assertIsNotNone(result)

    def test_DMESG_BOOT(self):
        instance = OpenBSDVirtual(module)
        result = instance.DMESG_BOOT
        self.assertIsNotNone(result)

    def test_platform(self):
        instance = OpenBSDVirtual(module)
        result = instance.platform
        self.assertIsNotNone(result)

    def test_detect_virt_product_hw_product(self):
        instance = OpenBSDVirtual('test')
        result = instance._OpenBSDVirtual__detect_virt_product_hw_product('hw.product')
        self.assertIsNotNone(result)

    def test_detect_virt_product_hw_vendor(self):
        instance = OpenBSDVirtual(module)
        result = instance._OpenBSDVirtual__detect_virt_product_hw_vendor('hw.vendor')
        self.assertIsNotNone(result)

    def test_detect_virt_vendor_hw_product(self):
        instance = OpenBSDVirtual(module)
        result = instance._OpenBSDVirtual__detect_virt_vendor_hw_product('hw.product')
        self.assertIsNotNone(result)

    def test_detect_virt_vendor_hw_vendor(self):
        instance = OpenBSDVirtual(module)
        result = instance._OpenBSDVirtual__detect_virt_vendor_hw_vendor('hw.vendor')
        self.assertIsNotNone(result)

    def test_get_dmesg_boot(self):
        instance = OpenBSDVirtual(module)
        result = instance._OpenBSDVirtual__get_dmesg_boot()
        self.assertIsNotNone(result)

    def test_get_dmesg_boot_content(self):
        instance = OpenBSDVirtual(module)
        result = instance._OpenBSDVirtual__get_dmesg_boot_content()
        self.assertIsNotNone(result)

    def test_get_dmesg_boot_lines(self):
        instance = OpenBSDVirtual(module)
        result = instance._OpenBSDVirtual__get_dmesg_boot_lines()
        self.assertIsNotNone(result)

    def test_get_dmesg_boot_match(self):
        instance = OpenBSDVirtual(module)
        result = instance._OpenBSDVirtual__get_dmesg_boot_match()
        self.assertIsNotNone(result)

    def test_get_dmesg_boot_match_group(self):
        instance = OpenBSDVirtual(module)
        result = instance._OpenBSDVirtual__get_dmesg_boot_match_group()
        self.assertIsNotNone(result)

if __name__ == '__main__':
    unittest.main()