import unittest
from ansible.module_utils.facts.other.facter import FacterFactCollector
from unittest.mock import Mock


class TestFacterFactCollector(unittest.TestCase):
    def test_find_facter(self):
        collector = FacterFactCollector()
        module = Mock()
        module.get_bin_path.return_value = 'facter'
        facter_path = collector.find_facter(module)
        self.assertEqual(facter_path, 'facter')

    def test_run_facter(self):
        collector = FacterFactCollector()
        module = Mock()
        rc, out, err = collector.run_facter(module, 'facter')
        self.assertEqual(rc, 0)
        self.assertEqual(out, 'output')
        self.assertEqual(err, 'error')

    def test_get_facter_output(self):
        collector = FacterFactCollector()
        module = Mock()
        module.get_bin_path.return_value = 'facter'
        facter_output = collector.get_facter_output(module)
        self.assertEqual(facter_output, 'output')

    def test_collect(self):
        collector = FacterFactCollector()
        module = Mock()
        collected_facts = {}
        facter_dict = {'key': 'value'}
        module.get_bin_path.return_value = 'facter'
        collector.get_facter_output.return_value = json.dumps(facter_dict)
        result = collector.collect(module, collected_facts)
        self.assertEqual(result, {'facter.key': 'value'})

if __name__ == '__main__':
    unittest.main()