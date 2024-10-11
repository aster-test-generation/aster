import unittest
from ansible.module_utils.facts.virtual.freebsd import FreeBSDVirtual, FreeBSDVirtualCollector


class TestFreeBSDVirtual(unittest.TestCase):
    def test_get_virtual_facts(self):
        instance = FreeBSDVirtual()
        virtual_facts = instance.get_virtual_facts()
        self.assertEqual(virtual_facts, {})

    def test_detect_virt_product(self):
        instance = FreeBSDVirtual()
        result = instance.detect_virt_product('kern.vm_guest')
        self.assertEqual(result, {'virtualization_tech_guest': set(), 'virtualization_tech_host': set()})

    def test_detect_virt_vendor(self):
        instance = FreeBSDVirtual()
        result = instance.detect_virt_vendor('hw.model')
        self.assertEqual(result, {'virtualization_tech_guest': set(), 'virtualization_tech_host': set()})

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

class TestFreeBSDVirtualCollector(unittest.TestCase):
    def test_get_fact_class(self):
        instance = FreeBSDVirtualCollector()
        self.assertEqual(instance._fact_class, FreeBSDVirtual)

    def test_get_platform(self):
        instance = FreeBSDVirtualCollector()
        self.assertEqual(instance._platform, 'FreeBSD')

if __name__ == '__main__':
    unittest.main()