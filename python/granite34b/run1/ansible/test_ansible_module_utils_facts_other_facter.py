import unittest
from ansible.module_utils.facts.other.facter import FacterFactCollector


class TestFacterFactCollector(unittest.TestCase):
    def test_find_facter(self):
        from unittest.mock import Mock
        collector = FacterFactCollector()
        facter_path = collector.find_facter(module)
        self.assertEqual(facter_path, '/path/to/facter')

    def test_run_facter(self):
        module = MockModule()
        collector = FacterFactCollector()
        rc, out, err = collector.run_facter(module, '/path/to/facter')
        self.assertEqual(rc, 0)
        self.assertEqual(out, '{"key": "value"}')
        self.assertEqual(err, '')

    def test_get_facter_output(self):
        module = MagicMock()
        collector = FacterFactCollector()
        facter_output = collector.get_facter_output(module)
        self.assertEqual(facter_output, '{"key": "value"}')

    def test_collect(self):
        module = mock.Mock()
        collector = FacterFactCollector()
        collected_facts = collector.collect(module)
        self.assertEqual(collected_facts, {'facter': {'key': 'value'}})

if __name__ == '__main__':
    unittest.main()