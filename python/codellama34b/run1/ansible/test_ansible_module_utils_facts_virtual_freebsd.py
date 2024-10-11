import unittest
from ansible.module_utils.facts.virtual.freebsd import *



class TestFreeBSDVirtual(unittest.TestCase):
    def test_get_virtual_facts(self):
        instance = FreeBSDVirtual('test')
        result = instance.get_virtual_facts()
        self.assertEqual(result, {})

    def test_detect_virt_product(self):
        instance = FreeBSDVirtual(module)
        result = instance.detect_virt_product('kern.vm_guest')
        self.assertEqual(result, {})

    def test_detect_virt_vendor(self):
        instance = FreeBSDVirtual(module)
        result = instance.detect_virt_vendor('hw.model')
        self.assertEqual(result, {})

    def test_virtualization_type(self):
        instance = FreeBSDVirtual(module)
        result = instance.virtualization_type
        self.assertEqual(result, '')

    def test_virtualization_role(self):
        instance = FreeBSDVirtual('test')
        result = instance.virtualization_role
        self.assertEqual(result, '')

    def test_virtualization_tech_guest(self):
        instance = FreeBSDVirtual(module)
        result = instance.virtualization_tech_guest
        self.assertEqual(result, set())

    def test_virtualization_tech_host(self):
        instance = FreeBSDVirtual(module)
        result = instance.virtualization_tech_host
        self.assertEqual(result, set())

    def test_virtualization_tech_guest_add(self):
        instance = FreeBSDVirtual(module)
        instance.virtualization_tech_guest.add('xen')
        result = instance.virtualization_tech_guest
        self.assertEqual(result, {'xen'})

    def test_virtualization_tech_host_add(self):
        instance = FreeBSDVirtual(module)
        instance.virtualization_tech_host.add('xen')
        result = instance.virtualization_tech_host
        self.assertEqual(result, {'xen'})

    def test_virtualization_tech_guest_update(self):
        instance = FreeBSDVirtual(module)
        instance.virtualization_tech_guest.update(['xen'])
        result = instance.virtualization_tech_guest
        self.assertEqual(result, {'xen'})

    def test_virtualization_tech_host_update(self):
        instance = FreeBSDVirtual(module)
        instance.virtualization_tech_host.update(['xen'])
        result = instance.virtualization_tech_host
        self.assertEqual(result, {'xen'})

    def test_virtualization_tech_guest_clear(self):
        instance = FreeBSDVirtual(module)
        instance.virtualization_tech_guest.clear()
        result = instance.virtualization_tech_guest
        self.assertEqual(result, set())

    def test_virtualization_tech_host_clear(self):
        instance = FreeBSDVirtual(module)
        instance.virtualization_tech_host.clear()
        result = instance.virtualization_tech_host
        self.assertEqual(result, set())

    def test_virtualization_tech_guest_discard(self):
        instance = FreeBSDVirtual(module)
        instance.virtualization_tech_guest.discard('xen')
        result = instance.virtualization_tech_guest
        self.assertEqual(result, set())

    def test_virtualization_tech_host_discard(self):
        instance = FreeBSDVirtual(module)
        instance.virtualization_tech_host.discard('xen')
        result = instance.virtualization_tech_host
        self.assertEqual(result, set())

    def test_virtualization_tech_guest_remove(self):
        instance = FreeBSDVirtual(module)
        instance.virtualization_tech_guest.remove('xen')
        result = instance.virtualization_tech_guest
        self.assertEqual(result, set())

if __name__ == '__main__':
    unittest.main()