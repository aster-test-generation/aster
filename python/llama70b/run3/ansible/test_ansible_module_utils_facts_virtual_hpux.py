import unittest
from ansible.module_utils.facts.virtual.hpux import HPUXVirtual, HPUXVirtualCollector


class TestHPUXVirtual(unittest.TestCase):
    def test_init(self):
        instance = HPUXVirtual()
        self.assertIsInstance(instance, HPUXVirtual)

    def test_get_virtual_facts(self):
        instance = HPUXVirtual()
        result = instance.get_virtual_facts()
        self.assertIsInstance(result, dict)

    def test_platform(self):
        instance = HPUXVirtual()
        self.assertEqual(instance.platform, 'HP-UX')

    def test___str__(self):
        instance = HPUXVirtual()
        result = instance.__str__()
        self.assertEqual(result, 'HPUXVirtual')

    def test___repr__(self):
        instance = HPUXVirtual()
        result = instance.__repr__()
        self.assertEqual(result, 'HPUXVirtual()')

class TestHPUXVirtualCollector(unittest.TestCase):
    def test_init(self):
        instance = HPUXVirtualCollector()
        self.assertIsInstance(instance, HPUXVirtualCollector)

    def test_fact_class(self):
        instance = HPUXVirtualCollector()
        self.assertEqual(instance._fact_class, HPUXVirtual)

    def test_platform(self):
        instance = HPUXVirtualCollector()
        self.assertEqual(instance._platform, 'HP-UX')

    def test___str__(self):
        instance = HPUXVirtualCollector()
        result = instance.__str__()
        self.assertEqual(result, 'HPUXVirtualCollector')

    def test___repr__(self):
        instance = HPUXVirtualCollector()
        result = instance.__repr__()
        self.assertEqual(result, 'HPUXVirtualCollector()')

if __name__ == '__main__':
    unittest.main()