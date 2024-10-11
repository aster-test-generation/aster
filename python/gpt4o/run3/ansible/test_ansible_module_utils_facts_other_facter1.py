import unittest
from unittest.mock import Mock, patch
from ansible.module_utils.facts.other.facter import FacterFactCollector
from ansible.module_utils.facts.namespace import PrefixFactNamespace
from ansible.module_utils.facts.collector import BaseFactCollector

class TestFacterFactCollector(unittest.TestCase):
    def setUp(self):
        self.collector = FacterFactCollector()

    def test_init(self):
        self.assertIsInstance(self.collector.namespace, PrefixFactNamespace)
        self.assertEqual(self.collector.namespace.namespace_name, 'facter')
        self.assertEqual(self.collector.namespace.prefix, 'facter_')

    def test_find_facter(self):
        module = Mock()
        module.get_bin_path.side_effect = lambda name, opt_dirs: '/opt/puppetlabs/bin/' + name if name == 'facter' else None
        result = self.collector.find_facter(module)
        self.assertEqual(result, '/opt/puppetlabs/bin/facter')

    def test_find_cfacter(self):
        module = Mock()
        module.get_bin_path.side_effect = lambda name, opt_dirs: '/opt/puppetlabs/bin/' + name if name == 'cfacter' else None
        result = self.collector.find_facter(module)
        self.assertEqual(result, '/opt/puppetlabs/bin/cfacter')

    def test_run_facter(self):
        module = Mock()
        module.run_command.return_value = (0, '{"key": "value"}', '')
        rc, out, err = self.collector.run_facter(module, '/opt/puppetlabs/bin/facter')
        self.assertEqual(rc, 0)
        self.assertEqual(out, '{"key": "value"}')
        self.assertEqual(err, '')

    def test_get_facter_output_no_facter_path(self):
        module = Mock()
        module.get_bin_path.return_value = None
        result = self.collector.get_facter_output(module)
        self.assertIsNone(result)

    def test_get_facter_output_with_facter_path(self):
        module = Mock()
        module.get_bin_path.return_value = '/opt/puppetlabs/bin/facter'
        module.run_command.return_value = (0, '{"key": "value"}', '')
        result = self.collector.get_facter_output(module)
        self.assertEqual(result, '{"key": "value"}')

    def test_get_facter_output_with_error(self):
        module = Mock()
        module.get_bin_path.return_value = '/opt/puppetlabs/bin/facter'
        module.run_command.return_value = (1, '', 'error')
        result = self.collector.get_facter_output(module)
        self.assertIsNone(result)

    def test_collect_no_module(self):
        result = self.collector.collect()
        self.assertEqual(result, {})

    def test_collect_with_module(self):
        module = Mock()
        module.get_bin_path.return_value = '/opt/puppetlabs/bin/facter'
        module.run_command.return_value = (0, '{"key": "value"}', '')
        result = self.collector.collect(module)
        self.assertEqual(result, {"key": "value"})

    def test_collect_with_invalid_json(self):
        module = Mock()
        module.get_bin_path.return_value = '/opt/puppetlabs/bin/facter'
        module.run_command.return_value = (0, 'invalid json', '')
        result = self.collector.collect(module)
        self.assertEqual(result, {})

if __name__ == '__main__':
    unittest.main()