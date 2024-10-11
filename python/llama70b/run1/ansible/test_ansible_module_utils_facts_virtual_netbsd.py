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

    def test_str_method(self):
        instance = NetBSDVirtual()
        result = instance.__str__()
        self.assertIsInstance(result, str)

    def test_repr_method(self):
        instance = NetBSDVirtual()
        result = instance.__repr__()
        self.assertIsInstance(result, str)

    def test_eq_method(self):
        instance1 = NetBSDVirtual()
        instance2 = NetBSDVirtual()
        self.assertTrue(instance1 == instance2)

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

    def test_str_method(self):
        instance = NetBSDVirtualCollector()
        result = instance.__str__()
        self.assertIsInstance(result, str)

    def test_repr_method(self):
        instance = NetBSDVirtualCollector()
        result = instance.__repr__()
        self.assertIsInstance(result, str)

    def test_eq_method(self):
        instance1 = NetBSDVirtualCollector()
        instance2 = NetBSDVirtualCollector()
        self.assertTrue(instance1 == instance2)

if __name__ == '__main__':
    unittest.main()