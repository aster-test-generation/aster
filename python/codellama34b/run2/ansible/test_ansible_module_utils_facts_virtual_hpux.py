import unittest
from ansible.module_utils.facts.virtual.hpux import HPUXVirtual, HPUXVirtualCollector


class TestHPUXVirtual(unittest.TestCase):
    def test_get_virtual_facts(self):
        instance = HPUXVirtual(module)
        result = instance.get_virtual_facts()
        self.assertIsInstance(result, dict)

    def test_platform(self):
        instance = HPUXVirtual(module)
        result = instance.platform
        self.assertEqual(result, 'HP-UX')

    def test_virtualization_tech_guest(self):
        instance = HPUXVirtual(module)
        result = instance.virtualization_tech_guest
        self.assertIsInstance(result, set)

    def test_virtualization_tech_host(self):
        instance = HPUXVirtual(module)
        result = instance.virtualization_tech_host
        self.assertIsInstance(result, set)

    def test_virtualization_type(self):
        instance = HPUXVirtual(module)
        result = instance.virtualization_type
        self.assertIsInstance(result, str)

    def test_virtualization_role(self):
        instance = HPUXVirtual(module)
        result = instance.virtualization_role
        self.assertIsInstance(result, str)

class TestHPUXVirtualCollector(unittest.TestCase):
    def test_fact_class(self):
        instance = HPUXVirtualCollector()
        result = instance._fact_class
        self.assertEqual(result, HPUXVirtual)

    def test_platform(self):
        instance = HPUXVirtualCollector()
        result = instance._platform
        self.assertEqual(result, 'HP-UX')

if __name__ == '__main__':
    unittest.main()