import unittest
from ansible.module_utils.facts.virtual.openbsd import OpenBSDVirtual, OpenBSDVirtualCollector


class TestOpenBSDVirtual(unittest.TestCase):
    def test_init(self):
        instance = OpenBSDVirtual()
        self.assertIsInstance(instance, OpenBSDVirtual)

    def test_get_virtual_facts(self):
        instance = OpenBSDVirtual()
        result = instance.get_virtual_facts()
        self.assertIsInstance(result, dict)

    def test_detect_virt_product(self):
        instance = OpenBSDVirtual()
        result = instance.detect_virt_product('hw.product')
        self.assertIsInstance(result, dict)

    def test_detect_virt_vendor(self):
        instance = OpenBSDVirtual()
        result = instance.detect_virt_vendor('hw.vendor')
        self.assertIsInstance(result, dict)

    def test___init__(self):
        instance = OpenBSDVirtual()
        self.assertIsInstance(instance, OpenBSDVirtual)

    def test___str__(self):
        instance = OpenBSDVirtual()
        result = instance.__str__()
        self.assertEqual(result, "OpenBSDVirtual")

    def test___repr__(self):
        instance = OpenBSDVirtual()
        result = instance.__repr__()
        self.assertEqual(result, "OpenBSDVirtual()")

class TestOpenBSDVirtualCollector(unittest.TestCase):
    def test_init(self):
        instance = OpenBSDVirtualCollector()
        self.assertIsInstance(instance, OpenBSDVirtualCollector)

    def test__fact_class(self):
        instance = OpenBSDVirtualCollector()
        self.assertEqual(instance._fact_class, OpenBSDVirtual)

    def test__platform(self):
        instance = OpenBSDVirtualCollector()
        self.assertEqual(instance._platform, 'OpenBSD')

    def test___init__(self):
        instance = OpenBSDVirtualCollector()
        self.assertIsInstance(instance, OpenBSDVirtualCollector)

    def test___str__(self):
        instance = OpenBSDVirtualCollector()
        result = instance.__str__()
        self.assertEqual(result, "OpenBSDVirtualCollector")

    def test___repr__(self):
        instance = OpenBSDVirtualCollector()
        result = instance.__repr__()
        self.assertEqual(result, "OpenBSDVirtualCollector()")

if __name__ == '__main__':
    unittest.main()