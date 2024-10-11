from ansible.module_utils.facts.other.facter import FacterFactCollector
import json
import unittest

class TestFacterFactCollector(unittest.TestCase):
    def test_find_facter(self):
        # Test finding facter
        collector = FacterFactCollector()
        module = Mock()
        module.get_bin_path.return_value = '/usr/bin/facter'
        facter_path = collector.find_facter(module)
        self.assertEqual(facter_path, '/usr/bin/facter')

    def test_run_facter(self):
        # Test running facter
        collector = FacterFactCollector()
        module = Mock()
        module.run_command.return_value = (0, '{"key": "value"}', '')
        facter_path = '/usr/bin/facter'
        rc, out, err = collector.run_facter(module, facter_path)
        self.assertEqual(rc, 0)
        self.assertEqual(out, '{"key": "value"}')
        self.assertEqual(err, '')

    def test_get_facter_output(self):
        # Test getting facter output
        collector = FacterFactCollector()
        module = Mock()
        module.get_bin_path.return_value = '/usr/bin/facter'
        facter_output = collector.get_facter_output(module)
        self.assertEqual(facter_output, '{"key": "value"}')

    def test_collect(self):
        # Test collecting facts
        collector = FacterFactCollector()
        module = Mock()
        module.get_bin_path.return_value = '/usr/bin/facter'
        module.run_command.return_value = (0, '{"key": "value"}', '')
        facter_dict = collector.collect(module)
        self.assertEqual(facter_dict, {'facter_key': 'value'})

if __name__ == '__main__':
    unittest.main()