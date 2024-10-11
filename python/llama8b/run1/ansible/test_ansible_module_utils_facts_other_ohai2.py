import unittest
from unittest.mock import patch, Mock
from ansible.module_utils.facts.other.ohai import OhaiFactCollector

class TestOhaiFactCollector(unittest.TestCase):
    @patch('ansible.module_utils.facts.other.ohai.PrefixFactNamespace')
    @patch('ansible.module_utils.facts.other.ohai.BaseFactCollector')
    def test_init(self, mock_BaseFactCollector, mock_PrefixFactNamespace):
        collectors = Mock()
        namespace = Mock()
        ohai_fact_collector = OhaiFactCollector(collectors, namespace)
        self.assertEqual(ohai_fact_collector.name, 'ohai')
        self.assertEqual(ohai_fact_collector._fact_ids, set())

    @patch('ansible.module_utils.facts.other.ohai.PrefixFactNamespace')
    @patch('ansible.module_utils.facts.other.ohai.BaseFactCollector')
    def test_find_ohai(self, mock_BaseFactCollector, mock_PrefixFactNamespace):
        module = Mock()
        ohai_fact_collector = OhaiFactCollector(None, None)
        ohai_path = ohai_fact_collector.find_ohai(module)
        self.assertEqual(ohai_path, module.get_bin_path('ohai'))

    @patch('ansible.module_utils.facts.other.ohai.PrefixFactNamespace')
    @patch('ansible.module_utils.facts.other.ohai.BaseFactCollector')
    def test_run_ohai(self, mock_BaseFactCollector, mock_PrefixFactNamespace):
        module = Mock()
        ohai_fact_collector = OhaiFactCollector(None, None)
        ohai_path = Mock()
        rc, out, err = ohai_fact_collector.run_ohai(module, ohai_path)
        self.assertEqual(rc, 0)
        self.assertEqual(out, '')
        self.assertEqual(err, '')

    @patch('ansible.module_utils.facts.other.ohai.PrefixFactNamespace')
    @patch('ansible.module_utils.facts.other.ohai.BaseFactCollector')
    def test_get_ohai_output(self, mock_BaseFactCollector, mock_PrefixFactNamespace):
        module = Mock()
        ohai_fact_collector = OhaiFactCollector(None, None)
        ohai_path = Mock()
        rc, out, err = ohai_fact_collector.run_ohai(module, ohai_path)
        ohai_output = ohai_fact_collector.get_ohai_output(module)
        self.assertEqual(ohai_output, out)

    @patch('ansible.module_utils.facts.other.ohai.PrefixFactNamespace')
    @patch('ansible.module_utils.facts.other.ohai.BaseFactCollector')
    def test_collect(self, mock_BaseFactCollector, mock_PrefixFactNamespace):
        module = Mock()
        ohai_fact_collector = OhaiFactCollector(None, None)
        ohai_facts = ohai_fact_collector.collect(module, None)
        self.assertEqual(ohai_facts, {})

    @patch('ansible.module_utils.facts.other.ohai.PrefixFactNamespace')
    @patch('ansible.module_utils.facts.other.ohai.BaseFactCollector')
    def test_collect_with_output(self, mock_BaseFactCollector, mock_PrefixFactNamespace):
        module = Mock()
        ohai_fact_collector = OhaiFactCollector(None, None)
        ohai_output = '{"key": "value"}'
        ohai_fact_collector.get_ohai_output = Mock(return_value=ohai_output)
        ohai_facts = ohai_fact_collector.collect(module, None)
        self.assertEqual(ohai_facts, json.loads(ohai_output))

if __name__ == '__main__':
    unittest.main()