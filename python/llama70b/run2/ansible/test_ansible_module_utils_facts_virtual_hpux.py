import unittest
from ansible.module_utils.facts.virtual.hpux import HPUXVirtual, HPUXVirtualCollector


class TestHPUXVirtual(unittest.TestCase):
    def test_get_virtual_facts(self):
        instance = HPUXVirtual()
        result = instance.get_virtual_facts()
        self.assertIsInstance(result, dict)

    def test___init__(self):
        instance = HPUXVirtual()
        self.assertIsNotNone(instance)

    def test___str__(self):
        instance = HPUXVirtual()
        result = instance.__str__()
        self.assertEqual(result, "HPUXVirtual")

    def test___repr__(self):
        instance = HPUXVirtual()
        result = instance.__repr__()
        self.assertEqual(result, "HPUXVirtual()")

class TestHPUXVirtualCollector(unittest.TestCase):
    def test___init__(self):
        instance = HPUXVirtualCollector()
        self.assertIsNotNone(instance)

    def test___str__(self):
        instance = HPUXVirtualCollector()
        result = instance.__str__()
        self.assertEqual(result, "HPUXVirtualCollector")

    def test___repr__(self):
        instance = HPUXVirtualCollector()
        result = instance.__repr__()
        self.assertEqual(result, "HPUXVirtualCollector()")

    def test__fact_class(self):
        instance = HPUXVirtualCollector()
        result = instance._fact_class
        self.assertEqual(result, HPUXVirtual)

    def test__platform(self):
        instance = HPUXVirtualCollector()
        result = instance._platform
        self.assertEqual(result, 'HP-UX')

if __name__ == '__main__':
    unittest.main()