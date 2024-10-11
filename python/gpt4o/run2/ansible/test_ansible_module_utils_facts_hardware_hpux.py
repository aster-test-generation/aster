import unittest
from unittest.mock import MagicMock
from ansible.module_utils.facts.hardware.hpux import HPUXHardware, HPUXHardwareCollector


class TestHPUXHardware(unittest.TestCase):
    def setUp(self):
        self.instance = HPUXHardware(module=MagicMock())

    def test_populate(self):
        self.instance.get_cpu_facts = MagicMock(return_value={'cpu': 'facts'})
        self.instance.get_memory_facts = MagicMock(return_value={'memory': 'facts'})
        self.instance.get_hw_facts = MagicMock(return_value={'hw': 'facts'})
        result = self.instance.populate()
        self.assertEqual(result, {'cpu': 'facts', 'memory': 'facts', 'hw': 'facts'})

    def test_get_cpu_facts(self):
        self.instance.module.run_command = MagicMock(return_value=(0, '4', ''))
        collected_facts = {'ansible_architecture': '9000/800'}
        result = self.instance.get_cpu_facts(collected_facts)
        self.assertEqual(result, {'processor_count': 4})

if __name__ == '__main__':
    unittest.main()