from ansible.module_utils.facts.other.facter import PrefixFactNamespace
import unittest
from ansible.module_utils.facts.other.facter import FacterFactCollector


class TestFacterFactCollector(unittest.TestCase):
    def test___init__(self):
        collector = FacterFactCollector()
        self.assertIsInstance(collector.namespace, PrefixFactNamespace)

    def test_name(self):
        collector = FacterFactCollector()
        self.assertEqual(collector.name, 'facter')

    def test__fact_ids(self):
        collector = FacterFactCollector()
        self.assertEqual(collector._fact_ids, set(['facter']))

    def test_find_facter(self):
        collector = FacterFactCollector()
        module = MockModule()  # mock module object
        facter_path = collector.find_facter(module)
        self.assertIsNotNone(facter_path)

    def test_run_facter(self):
        collector = FacterFactCollector()
        module = MockModule()  # mock module object
        facter_path = '/path/to/facter'
        rc, out, err = collector.run_facter(module, facter_path)
        self.assertIsNotNone(out)

    def test_get_facter_output(self):
        collector = FacterFactCollector()
        module = MockModule()  # mock module object
        facter_output = collector.get_facter_output(module)
        self.assertIsNotNone(facter_output)

    def test_collect(self):
        collector = FacterFactCollector()
        module = MockModule()  # mock module object
        facter_dict = collector.collect(module)
        self.assertIsInstance(facter_dict, dict)

    def test_collect_no_module(self):
        collector = FacterFactCollector()
        facter_dict = collector.collect()
        self.assertEqual(facter_dict, {})

    def test___str__(self):
        collector = FacterFactCollector()
        self.assertEqual(str(collector), 'FacterFactCollector')

    def test___repr__(self):
        collector = FacterFactCollector()
        self.assertEqual(repr(collector), 'FacterFactCollector()')

class MockModule:
    def get_bin_path(self, *args, **kwargs):
        return '/path/to/facter'

if __name__ == '__main__':
    unittest.main()