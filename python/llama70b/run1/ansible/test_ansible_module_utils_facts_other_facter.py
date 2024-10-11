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
        self.assertIsInstance(facter_path, str)

    def test_run_facter(self):
        collector = FacterFactCollector()
        module = MockModule()  # mock module object
        facter_path = '/path/to/facter'
        rc, out, err = collector.run_facter(module, facter_path)
        self.assertIsInstance(rc, int)
        self.assertIsInstance(out, str)
        self.assertIsInstance(err, str)

    def test_get_facter_output(self):
        collector = FacterFactCollector()
        module = MockModule()  # mock module object
        facter_output = collector.get_facter_output(module)
        self.assertIsInstance(facter_output, str)

    def test_collect(self):
        collector = FacterFactCollector()
        module = MockModule()  # mock module object
        facter_dict = collector.collect(module)
        self.assertIsInstance(facter_dict, dict)

    def test_collect_no_module(self):
        collector = FacterFactCollector()
        facter_dict = collector.collect()
        self.assertIsInstance(facter_dict, dict)

    def test___str__(self):
        collector = FacterFactCollector()
        str_repr = collector.__str__()
        self.assertIsInstance(str_repr, str)

    def test___repr__(self):
        collector = FacterFactCollector()
        repr_repr = collector.__repr__()
        self.assertIsInstance(repr_repr, str)

    def test___eq__(self):
        collector1 = FacterFactCollector()
        collector2 = FacterFactCollector()
        self.assertTrue(collector1 == collector2)

    def test__private_method(self):
        collector = FacterFactCollector()
        result = collector._FacterFactCollector__private_method()  # no private method in this class
        self.assertIsNone(result)  # or assertRaises( AttributeError )

class MockModule:
    def get_bin_path(self, *args, **kwargs):
        return '/path/to/facter'

if __name__ == '__main__':
    unittest.main()