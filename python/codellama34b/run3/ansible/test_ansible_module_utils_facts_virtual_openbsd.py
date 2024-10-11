import unittest
from ansible.module_utils.facts.virtual.openbsd import *


class TestOpenBSDVirtual(unittest.TestCase):
    def test_get_virtual_facts(self):
        instance = OpenBSDVirtual('test')
        result = instance.get_virtual_facts()
        self.assertEqual(result, {})

    def test_detect_virt_product(self):
        instance = OpenBSDVirtual(module)
        result = instance.detect_virt_product('hw.product')
        self.assertEqual(result, {})

    def test_detect_virt_vendor(self):
        instance = OpenBSDVirtual(module)
        result = instance.detect_virt_vendor('hw.vendor')
        self.assertEqual(result, {})

    def test_OpenBSDVirtual(self):
        instance = OpenBSDVirtual(module)
        self.assertEqual(instance.platform, 'OpenBSD')

    def test_OpenBSDVirtual_DMESG_BOOT(self):
        instance = OpenBSDVirtual('test')
        self.assertEqual(instance.DMESG_BOOT, '/var/run/dmesg.boot')

class TestOpenBSDVirtualCollector(unittest.TestCase):
    def test_OpenBSDVirtualCollector(self):
        instance = OpenBSDVirtualCollector()
        self.assertEqual(instance._fact_class, OpenBSDVirtual)
        self.assertEqual(instance._platform, 'OpenBSD')

if __name__ == '__main__':
    unittest.main()