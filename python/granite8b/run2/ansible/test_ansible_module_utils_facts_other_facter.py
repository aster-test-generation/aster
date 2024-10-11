import json
import unittest
from ansible.module_utils.facts.other.facter import FacterFactCollector
from unittest.mock import Mock


class TestFacterFactCollector(unittest.TestCase):
    def test_find_facter(self):
        module = Mock()
        facter_path = FacterFactCollector.find_facter(module)
        self.assertEqual(facter_path, '/path/to/facter')

    def test_run_facter(self):
        module = Mock()
        rc, out, err = FacterFactCollector.run_facter(module, '/path/to/facter')
        self.assertEqual(rc, 0)
        self.assertEqual(out, '{"key": "value"}')
        self.assertEqual(err, '')

    def test_get_facter_output(self):
        module = Mock()
        facter_output = FacterFactCollector.get_facter_output(module, facter_bin)
        self.assertEqual(facter_output, '{"key": "value"}')

    def test_collect(self):
        module = Mock()
        collected_facts = {}
        facter_dict = FacterFactCollector.collect(module, collected_facts)
        self.assertEqual(facter_dict, {'facter.key': 'value'})

class TestFacterFactCollector(unittest.TestCase):
    def test_find_facter(self):
        # Test finding facter executable
        collector = FacterFactCollector()
        module = Mock()
        module.get_bin_path.return_value = '/path/to/facter'
        facter_path = collector.find_facter(module)
        self.assertEqual(facter_path, '/path/to/facter')

    def test_run_facter(self):
        # Test running facter command
        collector = FacterFactCollector()
        module = Mock()
        rc, out, err = collector.run_facter(module, '/path/to/facter')
        self.assertEqual(rc, 0)
        self.assertEqual(out, 'facter output')
        self.assertEqual(err, '')

    def test_get_facter_output(self):
        # Test getting facter output
        collector = FacterFactCollector()
        module = Mock()
        module.run_command.return_value = (0, 'facter output', '')
        facter_output = collector.get_facter_output(module)
        self.assertEqual(facter_output, 'facter output')

    def test_collect(self):
        # Test collecting facter facts
        collector = FacterFactCollector()
        module = Mock()
        facter_dict = {'fact1': 'value1', 'fact2': 'value2'}
        module.get_bin_path.return_value = '/path/to/facter'
        module.run_command.return_value = (0, json.dumps(facter_dict), '')
        collected_facts = {}
        facts = collector.collect(module, collected_facts)
        self.assertEqual(facts, {'facter.fact1': 'value1', 'facter.fact2': 'value2'})

if __name__ == '__main__':
    unittest.main()