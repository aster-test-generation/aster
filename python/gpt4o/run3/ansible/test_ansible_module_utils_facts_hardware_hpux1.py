import unittest
from unittest.mock import MagicMock
from ansible.module_utils.facts.hardware.hpux import HPUXHardware, HPUXHardwareCollector

class TestHPUXHardware(unittest.TestCase):
    def setUp(self):
        self.module = MagicMock()
        self.hpux_hardware = HPUXHardware(self.module)

    def test_populate(self):
        self.hpux_hardware.get_cpu_facts = MagicMock(return_value={'cpu': 'facts'})
        self.hpux_hardware.get_memory_facts = MagicMock(return_value={'memory': 'facts'})
        self.hpux_hardware.get_hw_facts = MagicMock(return_value={'hw': 'facts'})
        result = self.hpux_hardware.populate()
        self.assertEqual(result, {'cpu': 'facts', 'memory': 'facts', 'hw': 'facts'})

    def test_get_cpu_facts(self):
        self.module.run_command = MagicMock(return_value=(0, '4', ''))
        collected_facts = {'ansible_architecture': '9000/800'}
        result = self.hpux_hardware.get_cpu_facts(collected_facts)
        self.assertEqual(result, {'processor_count': 4})

    def test_get_memory_facts(self):
        self.module.run_command = MagicMock(return_value=(0, ' 0 0 0 0 0 1000', ''))
        collected_facts = {'ansible_architecture': '9000/800'}
        result = self.hpux_hardware.get_memory_facts(collected_facts)
        self.assertEqual(result['memfree_mb'], 4)

    def test_get_hw_facts(self):
        self.module.run_command = MagicMock(return_value=(0, 'model_name', ''))
        collected_facts = {'ansible_architecture': 'ia64', 'ansible_distribution_version': 'B.11.23'}
        result = self.hpux_hardware.get_hw_facts(collected_facts)
        self.assertEqual(result['model'], 'model_name')

class TestHPUXHardwareCollector(unittest.TestCase):
    def test_fact_class(self):
        collector = HPUXHardwareCollector()
        self.assertEqual(collector._fact_class, HPUXHardware)

    def test_platform(self):
        collector = HPUXHardwareCollector()
        self.assertEqual(collector._platform, 'HP-UX')

    def test_required_facts(self):
        collector = HPUXHardwareCollector()
        self.assertEqual(collector.required_facts, {'platform', 'distribution'})

if __name__ == '__main__':
    unittest.main()