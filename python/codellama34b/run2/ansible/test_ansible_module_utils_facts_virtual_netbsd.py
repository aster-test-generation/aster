import unittest
from ansible.module_utils.facts.virtual.netbsd import *


class TestNetBSDVirtual(unittest.TestCase):
    def test_get_virtual_facts(self):
        instance = NetBSDVirtual(module)
        result = instance.get_virtual_facts()
        self.assertIsNotNone(result)

    def test_detect_virt_product(self):
        instance = NetBSDVirtual(module)
        result = instance.detect_virt_product('machdep.dmi.system-product')
        self.assertIsNotNone(result)

    def test_detect_virt_vendor(self):
        instance = NetBSDVirtual()
        result = instance.detect_virt_vendor('machdep.dmi.system-vendor')
        self.assertIsNotNone(result)

    def test_detect_virt_vendor(self):
        instance = NetBSDVirtual(module)
        result = instance.detect_virt_vendor('machdep.hypervisor')
        self.assertIsNotNone(result)

class TestNetBSDVirtualCollector(unittest.TestCase):
    def test_get_fact_class(self):
        instance = NetBSDVirtualCollector()
        result = instance.get_fact_class()
        self.assertEqual(result, NetBSDVirtual)

    def test_get_platform(self):
        instance = NetBSDVirtualCollector()
        result = instance.get_platform()
        self.assertEqual(result, 'NetBSD')

if __name__ == '__main__':
    unittest.main()