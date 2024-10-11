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
        self.assertEqual(instance1, instance2)

    def test_init_method(self):
        instance = FreeBSDVirtual()
        self.assertIsInstance(instance, FreeBSDVirtual)

class TestFreeBSDVirtualCollector(unittest.TestCase):
    def test_init_method(self):
        instance = FreeBSDVirtualCollector()
        self.assertIsInstance(instance, FreeBSDVirtualCollector)

    def test_get_fact_class(self):
        instance = FreeBSDVirtualCollector()
        result = instance._fact_class
        self.assertEqual(result, FreeBSDVirtual)

    def test_get_platform(self):
        instance = FreeBSDVirtualCollector()
        result = instance._platform
        self.assertEqual(result, 'FreeBSD')

if __name__ == '__main__':
    unittest.main()