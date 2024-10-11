import unittest
from unittest.mock import patch, Mock
from ansible.module_utils.facts.other.ohai import OhaiFactCollector

class TestOhaiFactCollector(unittest.TestCase):
    def test_init(self):
        collector = OhaiFactCollector()
        self.assertEqual(collector.name, 'ohai')
        self.assertEqual(collector._fact_ids, set())

    @patch('ansible.module_utils.facts.other.ohai.PrefixFactNamespace')
    def test_init_namespace(self, mock_namespace):
        collector = OhaiFactCollector(collectors=None, namespace=None)
        mock_namespace.assert_called_once_with(namespace_name='ohai', prefix='ohai_')
        self.assertEqual(collector.namespace, mock_namespace.return_value)

    @patch('ansible.module_utils.facts.other.ohai.module')
    def test_find_ohai(self, mock_module):
        collector = OhaiFactCollector()
        ohai_path = collector.find_ohai(mock_module)
        mock_module.get_bin_path.assert_called_once_with('ohai')
        self.assertEqual(ohai_path, mock_module.get_bin_path.return_value)

    @patch('ansible.module_utils.facts.other.ohai.module')
    @patch('ansible.module_utils.facts.other.ohai.run_command')
    def test_run_ohai(self, mock_run_command, mock_module):
        collector = OhaiFactCollector()
        rc, out, err = collector.run_ohai(mock_module, 'ohai_path')
        mock_module.run_command.assert_called_once_with('ohai_path')
        self.assertEqual(rc, mock_module.run_command.return_value[0])
        self.assertEqual(out, mock_module.run_command.return_value[1])
        self.assertEqual(err, mock_module.run_command.return_value[2])

    @patch('ansible.module_utils.facts.other.ohai.module')
    @patch('ansible.module_utils.facts.other.ohai.run_ohai')
    def test_get_ohai_output(self, mock_run_ohai, mock_module):
        collector = OhaiFactCollector()
        ohai_path = 'ohai_path'
        out = collector.get_ohai_output(mock_module)
        mock_run_ohai.assert_called_once_with(mock_module, ohai_path)
        self.assertEqual(out, mock_run_ohai.return_value[1])

    @patch('ansible.module_utils.facts.other.ohai.module')
    @patch('ansible.module_utils.facts.other.ohai.get_ohai_output')
    def test_collect(self, mock_get_ohai_output, mock_module):
        collector = OhaiFactCollector()
        ohai_facts = collector.collect(mock_module)
        mock_get_ohai_output.assert_called_once_with(mock_module)
        self.assertEqual(ohai_facts, mock_get_ohai_output.return_value)

    def test_collect_none(self):
        collector = OhaiFactCollector()
        ohai_facts = collector.collect(None)
        self.assertEqual(ohai_facts, {})

    def test_collect_error(self):
        collector = OhaiFactCollector()
        module = Mock()
        module.get_bin_path.return_value = None
        ohai_facts = collector.collect(module)
        self.assertEqual(ohai_facts, {})

if __name__ == '__main__':
    unittest.main()