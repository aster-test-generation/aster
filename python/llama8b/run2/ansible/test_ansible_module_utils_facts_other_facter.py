import unittest
from ansible.module_utils.facts.other.facter import FacterFactCollector


class TestFacterFactCollector(unittest.TestCase):
    def test_init(self):
        collector = FacterFactCollector()
        self.assertEqual(collector.name, 'facter')
        self.assertEqual(collector._fact_ids, {'facter'})

    def test_find_facter(self):
        module = object()
        collector = FacterFactCollector()
        facter_path = collector.find_facter(module)
        self.assertEqual(facter_path, module.get_bin_path('facter', opt_dirs=['/opt/puppetlabs/bin']))

    def test_run_facter(self):
        module = object()
        collector = FacterFactCollector()
        rc, out, err = collector.run_facter(module, 'facter_path')
        self.assertEqual(rc, 0)
        self.assertEqual(out, '')
        self.assertEqual(err, '')

    def test_get_facter_output(self):
        module = object()
        collector = FacterFactCollector()
        facter_output = collector.get_facter_output(module)
        self.assertEqual(facter_output, None)

    def test_collect(self):
        module = object()
        collector = FacterFactCollector()
        collected_facts = collector.collect(module)
        self.assertEqual(collected_facts, {})

    def test_collect_with_facter_output(self):
        module = object()
        collector = FacterFactCollector()
        facter_output = '{"facter": "facter_value"}'
        collected_facts = collector.collect(module, {'facter': 'facter_value'})
        self.assertEqual(collected_facts, {'facter': 'facter_value'})

    def test_collect_with_error(self):
        module = object()
        collector = FacterFactCollector()
        facter_output = '{"facter": "facter_value"}'
        collected_facts = collector.collect(module, {'facter': 'facter_value'})
        self.assertEqual(collected_facts, {'facter': 'facter_value'})

    def test_str_method(self):
        collector = FacterFactCollector()
        result = str(collector)
        self.assertEqual(result, 'FacterFactCollector')

    def test_repr_method(self):
        collector = FacterFactCollector()
        result = repr(collector)
        self.assertEqual(result, 'FacterFactCollector()')

    def test_eq_method(self):
        collector1 = FacterFactCollector()
        collector2 = FacterFactCollector()
        self.assertEqual(collector1, collector2)

if __name__ == '__main__':
    unittest.main()