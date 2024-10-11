import unittest
from ansible.module_utils.facts.virtual.netbsd import *



class TestNetBSDVirtual(unittest.TestCase):
    def test_get_virtual_facts(self):
        instance = NetBSDVirtual(module)
        result = instance.get_virtual_facts()
        self.assertIsInstance(result, dict)

    def test_detect_virt_product(self):
        instance = NetBSDVirtual(module)
        result = instance.detect_virt_product('machdep.dmi.system-product')
        self.assertIsInstance(result, dict)

    def test_detect_virt_vendor(self):
        instance = NetBSDVirtual(module)
        result = instance.detect_virt_vendor('machdep.dmi.system-vendor')
        self.assertIsInstance(result, dict)

    def test_virtualization_tech_guest(self):
        instance = NetBSDVirtual(module)
        result = instance.virtualization_tech_guest
        self.assertIsInstance(result, set)

    def test_virtualization_tech_host(self):
        instance = NetBSDVirtual(module)
        result = instance.virtualization_tech_host
        self.assertIsInstance(result, set)

    def test_virtualization_type(self):
        instance = NetBSDVirtual(module)
        result = instance.virtualization_type
        self.assertIsInstance(result, str)

    def test_virtualization_role(self):
        instance = NetBSDVirtual(module)
        result = instance.virtualization_role
        self.assertIsInstance(result, str)

    def test_platform(self):
        instance = NetBSDVirtual(module)
        result = instance.platform
        self.assertIsInstance(result, str)

    def test_detect_virt_product_machdep_dmi_system_product(self):
        instance = NetBSDVirtual(module)
        result = instance._NetBSDVirtual__detect_virt_product_machdep_dmi_system_product('machdep.dmi.system-product')
        self.assertIsInstance(result, dict)

    def test_detect_virt_product_machdep_hypervisor(self):
        instance = NetBSDVirtual(module)
        result = instance._NetBSDVirtual__detect_virt_product_machdep_hypervisor('machdep.hypervisor')
        self.assertIsInstance(result, dict)

    def test_detect_virt_vendor_machdep_dmi_system_vendor(self):
        instance = NetBSDVirtual(module)
        result = instance._NetBSDVirtual__detect_virt_vendor_machdep_dmi_system_vendor('machdep.dmi.system-vendor')
        self.assertIsInstance(result, dict)

    def test_detect_virt_vendor_machdep_hypervisor(self):
        instance = NetBSDVirtual(module)
        result = instance._NetBSDVirtual__detect_virt_vendor_machdep_hypervisor('machdep.hypervisor')
        self.assertIsInstance(result, dict)

    def test_detect_virt_product_machdep_dmi_system_product_machdep_dmi_system_product(self):
        instance = NetBSDVirtual(module)
        result = instance._NetBSDVirtual__detect_virt_product_machdep_dmi_system_product_machdep_dmi_system_product('machdep.dmi.system-product')
        self.assertIsInstance(result, dict)

    def test_detect_virt_product_machdep_dmi_system_product_machdep_hypervisor(self):
        instance = NetBSDVirtual(module)
        result = instance._NetBSDVirtual__detect_virt_product_machdep_dmi_system_product_machdep_hypervisor('machdep.hypervisor')
        self.assertIsInstance(result, dict)

if __name__ == '__main__':
    unittest.main()