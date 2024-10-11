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
        module.get_bin_path.side_effect = lambda x, opt_dirs: '/opt/puppetlabs/bin/' + x
        result = self.collector.find_facter(module)
        self.assertEqual(result, '/opt/puppetlabs/bin/cfacter')

    def test_run_facter(self):
        module = Mock()
        module.run_command.return_value = (0, '{"key": "value"}', '')
        facter_path = '/opt/puppetlabs/bin/facter'
        rc, out, err = self.collector.run_facter(module, facter_path)
        self.assertEqual(rc, 0)
        self.assertEqual(out, '{"key": "value"}')
        self.assertEqual(err, '')

    def test_get_facter_output_no_facter_path(self):
        module = Mock()
        self.collector.find_facter = Mock(return_value=None)
        result = self.collector.get_facter_output(module)
        self.assertIsNone(result)

    def test_get_facter_output_with_facter_path(self):
        module = Mock()
        self.collector.find_facter = Mock(return_value='/opt/puppetlabs/bin/facter')
        self.collector.run_facter = Mock(return_value=(0, '{"key": "value"}', ''))
        result = self.collector.get_facter_output(module)
        self.assertEqual(result, '{"key": "value"}')

    def test_get_facter_output_with_error(self):
        module = Mock()
        self.collector.find_facter = Mock(return_value='/opt/puppetlabs/bin/facter')
        self.collector.run_facter = Mock(return_value=(1, '', 'error'))
        result = self.collector.get_facter_output(module)
        self.assertIsNone(result)

    def test_collect_no_module(self):
        result = self.collector.collect()
        self.assertEqual(result, {})

    def test_collect_with_module(self):
        module = Mock()
        self.collector.get_facter_output = Mock(return_value='{"key": "value"}')
        result = self.collector.collect(module)
        self.assertEqual(result, {"key": "value"})

    def test_collect_with_invalid_json(self):
        module = Mock()
        self.collector.get_facter_output = Mock(return_value='invalid json')
        result = self.collector.collect(module)
        self.assertEqual(result, {})

if __name__ == '__main__':
    unittest.main()