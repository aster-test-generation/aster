import unittest
from ansible.module_utils.facts.virtual.netbsd import NetBSDVirtual, NetBSDVirtualCollector


class TestNetBSDVirtual(unittest.TestCase):
    def test_get_virtual_facts(self):
        instance = NetBSDVirtual()
        virtual_facts = instance.get_virtual_facts()
        self.assertIsInstance(virtual_facts, dict)

    def test_detect_virt_product(self):
        instance = NetBSDVirtual()
        product_facts = instance.detect_virt_product('machdep.dmi.system-product')
        self.assertIsInstance(product_facts, dict)

    def test_detect_virt_vendor(self):
        instance = NetBSDVirtual()
        vendor_facts = instance.detect_virt_vendor('machdep.dmi.system-vendor')
        self.assertIsInstance(vendor_facts, dict)

    def test_detect_virt_vendor_hypervisor(self):
        instance = NetBSDVirtual()
        vendor_facts = instance.detect_virt_vendor('machdep.hypervisor')
        self.assertIsInstance(vendor_facts, dict)

    def test_str_method(self):
        instance = NetBSDVirtual()
        result = instance.__str__()
        self.assertEqual(result, 'NetBSDVirtual')

    def test_repr_method(self):
        instance = NetBSDVirtual()
        result = instance.__repr__()
        self.assertEqual(result, 'NetBSDVirtual()')

    def test_eq_method(self):
        instance1 = NetBSDVirtual()
        instance2 = NetBSDVirtual()
        self.assertEqual(instance1, instance2)

    def test_init_method(self):
        instance = NetBSDVirtual()
        self.assertIsInstance(instance, NetBSDVirtual)

class TestNetBSDVirtualCollector(unittest.TestCase):
    def test_init_method(self):
        instance = NetBSDVirtualCollector()
        self.assertIsInstance(instance, NetBSDVirtualCollector)

    def test_fact_class_method(self):
        instance = NetBSDVirtualCollector()
        self.assertEqual(instance._fact_class, NetBSDVirtual)

    def test_platform_method(self):
        instance = NetBSDVirtualCollector()
        self.assertEqual(instance._platform, 'NetBSD')

if __name__ == '__main__':
    unittest.main()