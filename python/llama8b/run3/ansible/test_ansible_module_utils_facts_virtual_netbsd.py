import unittest
from ansible.module_utils.facts.virtual.netbsd import NetBSDVirtual, NetBSDVirtualCollector


class TestNetBSDVirtual(unittest.TestCase):
    def test_get_virtual_facts(self):
        instance = NetBSDVirtual()
        virtual_facts = instance.get_virtual_facts()
        self.assertIn('virtualization_type', virtual_facts)
        self.assertIn('virtualization_role', virtual_facts)
        self.assertIn('virtualization_tech_guest', virtual_facts)
        self.assertIn('virtualization_tech_host', virtual_facts)

    def test_detect_virt_product(self):
        instance = NetBSDVirtual()
        product_facts = instance.detect_virt_product('machdep.dmi.system-product')
        self.assertIn('virtualization_tech_guest', product_facts)
        self.assertIn('virtualization_tech_host', product_facts)

    def test_detect_virt_vendor(self):
        instance = NetBSDVirtual()
        vendor_facts = instance.detect_virt_vendor('machdep.dmi.system-vendor')
        self.assertIn('virtualization_tech_guest', vendor_facts)
        self.assertIn('virtualization_tech_host', vendor_facts)

    def test_detect_virt_vendor_hypervisor(self):
        instance = NetBSDVirtual()
        vendor_facts = instance.detect_virt_vendor('machdep.hypervisor')
        self.assertIn('virtualization_tech_guest', vendor_facts)
        self.assertIn('virtualization_tech_host', vendor_facts)

    def test_str_method(self):
        instance = NetBSDVirtual()
        result = str(instance)
        self.assertEqual(result, 'NetBSDVirtual')

    def test_repr_method(self):
        instance = NetBSDVirtual()
        result = repr(instance)
        self.assertEqual(result, 'NetBSDVirtual()')

class TestNetBSDVirtualCollector(unittest.TestCase):
    def test_get_fact_class(self):
        instance = NetBSDVirtualCollector()
        self.assertEqual(instance._fact_class, NetBSDVirtual)

    def test_get_platform(self):
        instance = NetBSDVirtualCollector()
        self.assertEqual(instance._platform, 'NetBSD')

if __name__ == '__main__':
    unittest.main()