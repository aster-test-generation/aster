import unittest
from unittest.mock import Mock, patch
from ansible.module_utils.facts.other.ohai import OhaiFactCollector
from ansible.module_utils.facts.namespace import PrefixFactNamespace


class TestOhaiFactCollector(unittest.TestCase):
    def setUp(self):
        self.collector = OhaiFactCollector()

    def test_init(self):
        self.assertIsInstance(self.collector.namespace, PrefixFactNamespace)
        self.assertEqual(self.collector.namespace.namespace_name, 'ohai')
        self.assertEqual(self.collector.namespace.prefix, 'ohai_')

    def test_find_ohai(self):
        module = Mock()
        module.get_bin_path.return_value = '/usr/bin/ohai'
        result = self.collector.find_ohai(module)
        self.assertEqual(result, '/usr/bin/ohai')

    def test_run_ohai(self):
        module = Mock()
        module.run_command.return_value = (0, 'output', 'error')
        result = self.collector.run_ohai(module, '/usr/bin/ohai')
        self.assertEqual(result, (0, 'output', 'error'))

    def test_get_ohai_output_no_path(self):
        module = Mock()
        module.get_bin_path.return_value = None
        result = self.collector.get_ohai_output(module)
        self.assertIsNone(result)

    def test_get_ohai_output_with_path(self):
        module = Mock()
        module.get_bin_path.return_value = '/usr/bin/ohai'
        module.run_command.return_value = (0, '{"key": "value"}', '')
        result = self.collector.get_ohai_output(module)
        self.assertEqual(result, '{"key": "value"}')

    def test_get_ohai_output_with_error(self):
        module = Mock()
        module.get_bin_path.return_value = '/usr/bin/ohai'
        module.run_command.return_value = (1, '', 'error')
        result = self.collector.get_ohai_output(module)
        self.assertIsNone(result)

    def test_collect_no_module(self):
        result = self.collector.collect()
        self.assertEqual(result, {})

    def test_collect_with_module_no_output(self):
        module = Mock()
        self.collector.get_ohai_output = Mock(return_value=None)
        result = self.collector.collect(module)
        self.assertEqual(result, {})

    def test_collect_with_module_with_output(self):
        module = Mock()
        self.collector.get_ohai_output = Mock(return_value='{"key": "value"}')
        result = self.collector.collect(module)
        self.assertEqual(result, {"key": "value"})

    def test_collect_with_module_invalid_json(self):
        module = Mock()
        self.collector.get_ohai_output = Mock(return_value='invalid json')
        result = self.collector.collect(module)
        self.assertEqual(result, {})

if __name__ == '__main__':
    unittest.main()