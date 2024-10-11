import unittest
from ansible.module_utils.facts.virtual.freebsd import FreeBSDVirtual, FreeBSDVirtualCollector


class TestFreeBSDVirtual(unittest.TestCase):
    def test_get_virtual_facts(self):
        instance = FreeBSDVirtual()
        result = instance.get_virtual_facts()
        self.assertIsInstance(result, dict)

    def test_detect_virt_product(self):
        instance = FreeBSDVirtual()
        result = instance.detect_virt_product('kern.vm_guest')
        self.assertIsInstance(result, dict)

    def test_detect_virt_vendor(self):
        instance = FreeBSDVirtual()
        result = instance.detect_virt_vendor('hw.model')
        self.assertIsInstance(result, dict)

    def test_str_method(self):
        instance = FreeBSDVirtual()
        result = instance.__str__()
        self.assertEqual(result, 'FreeBSDVirtual')

    def test_repr_method(self):
        instance = FreeBSDVirtual()
        result = instance.__repr__()
        self.assertEqual(result, 'FreeBSDVirtual()')

    def test_eq_method(self):
        instance1 = FreeBSDVirtual()
        instance2 = FreeBSDVirtual()
        self.assertTrue(instance1 == instance2)

    def test_init_method(self):
        instance = FreeBSDVirtual()
        self.assertIsInstance(instance, FreeBSDVirtual)

class TestFreeBSDVirtualCollector(unittest.TestCase):
    def test_init_method(self):
        instance = FreeBSDVirtualCollector()
        self.assertIsInstance(instance, FreeBSDVirtualCollector)

    def test_fact_class_method(self):
        instance = FreeBSDVirtualCollector()
        self.assertEqual(instance._fact_class, FreeBSDVirtual)

    def test_platform_method(self):
        instance = FreeBSDVirtualCollector()
        self.assertEqual(instance._platform, 'FreeBSD')

if __name__ == '__main__':
    unittest.main()