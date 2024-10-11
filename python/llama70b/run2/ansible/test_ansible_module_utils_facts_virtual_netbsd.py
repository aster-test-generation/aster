import unittest
from ansible.module_utils.facts.virtual.netbsd import NetBSDVirtual, NetBSDVirtualCollector


class TestNetBSDVirtual(unittest.TestCase):
    def test_init(self):
        instance = NetBSDVirtual()
        self.assertIsInstance(instance, NetBSDVirtual)

    def test_platform(self):
        instance = NetBSDVirtual()
        self.assertEqual(instance.platform, 'NetBSD')

    def test_get_virtual_facts(self):
        instance = NetBSDVirtual()
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

    def test___str__(self):
        instance = NetBSDVirtual()
        result = instance.__str__()
        self.assertEqual(result, 'NetBSDVirtual')

    def test___repr__(self):
        instance = NetBSDVirtual()
        result = instance.__repr__()
        self.assertEqual(result, 'NetBSDVirtual()')

class TestNetBSDVirtualCollector(unittest.TestCase):
    def test_init(self):
        instance = NetBSDVirtualCollector()
        self.assertIsInstance(instance, NetBSDVirtualCollector)

    def test_fact_class(self):
        instance = NetBSDVirtualCollector()
        self.assertEqual(instance._fact_class, NetBSDVirtual)

    def test_platform(self):
        instance = NetBSDVirtualCollector()
        self.assertEqual(instance._platform, 'NetBSD')

    def test___str__(self):
        instance = NetBSDVirtualCollector()
        result = instance.__str__()
        self.assertEqual(result, 'NetBSDVirtualCollector')

    def test___repr__(self):
        instance = NetBSDVirtualCollector()
        result = instance.__repr__()
        self.assertEqual(result, 'NetBSDVirtualCollector()')

if __name__ == '__main__':
    unittest.main()