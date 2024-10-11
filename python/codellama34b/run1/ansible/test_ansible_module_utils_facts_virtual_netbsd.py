import unittest
from ansible.module_utils.facts.virtual.netbsd import *



class TestNetBSDVirtual(unittest.TestCase):
    def test_get_virtual_facts(self):
        instance = NetBSDVirtual(module)
        result = instance.get_virtual_facts()
        self.assertIsInstance(result, dict)

    def test_detect_virt_product(self):
        instance = NetBSDVirtual()
        result = instance.detect_virt_product('machdep.dmi.system-product')
        self.assertIsInstance(result, dict)

    def test_detect_virt_vendor(self):
        instance = NetBSDVirtual()
        result = instance.detect_virt_vendor('machdep.dmi.system-vendor')
        self.assertIsInstance(result, dict)

    def test_detect_virt_vendor(self):
        instance = NetBSDVirtual()
        result = instance.detect_virt_vendor('machdep.hypervisor')
        self.assertIsInstance(result, dict)

    def test_detect_virt_product(self):
        instance = NetBSDVirtual()
        result = instance.detect_virt_product('machdep.dmi.system-product')
        self.assertIsInstance(result, dict)

    def test_detect_virt_vendor(self):
        instance = NetBSDVirtual()
        result = instance.detect_virt_vendor('machdep.dmi.system-vendor')
        self.assertIsInstance(result, dict)

    def test_detect_virt_vendor(self):
        instance = NetBSDVirtual()
        result = instance.detect_virt_vendor('machdep.hypervisor')
        self.assertIsInstance(result, dict)

    def test_detect_virt_product(self):
        instance = NetBSDVirtual()
        result = instance.detect_virt_product('machdep.dmi.system-product')
        self.assertIsInstance(result, dict)

    def test_detect_virt_vendor(self):
        instance = NetBSDVirtual()
        result = instance.detect_virt_vendor('machdep.dmi.system-vendor')
        self.assertIsInstance(result, dict)

    def test_detect_virt_vendor(self):
        instance = NetBSDVirtual()
        result = instance.detect_virt_vendor('machdep.hypervisor')
        self.assertIsInstance(result, dict)

    def test_detect_virt_product(self):
        instance = NetBSDVirtual()
        result = instance.detect_virt_product('machdep.dmi.system-product')
        self.assertIsInstance(result, dict)

    def test_detect_virt_vendor(self):
        instance = NetBSDVirtual()
        result = instance.detect_virt_vendor('machdep.dmi.system-vendor')
        self.assertIsInstance(result, dict)

    def test_detect_virt_vendor(self):
        instance = NetBSDVirtual()
        result = instance.detect_virt_vendor('machdep.hypervisor')
        self.assertIsInstance(result, dict)

    def test_detect_virt_product(self):
        instance = NetBSDVirtual(module)
        result = instance.detect_virt_product('machdep.dmi.system-product')
        self.assertIsInstance(result, dict)

    def test_detect_virt_vendor(self):
        instance = NetBSDVirtual()
        result = instance.detect_virt_vendor('machdep.dmi.system-vendor')
        self.assertIsInstance(result, dict)

    def test_detect_virt_vendor(self):
        instance = NetBSDVirtual(module)
        result = instance.detect_virt_vendor('machdep.hypervisor')
        self.assertIsInstance(result, dict)

if __name__ == '__main__':
    unittest.main()