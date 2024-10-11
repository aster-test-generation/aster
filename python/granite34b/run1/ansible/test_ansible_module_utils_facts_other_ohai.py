import unittest
from ansible.module_utils.facts.other.ohai import OhaiFactCollector


class TestOhaiFactCollector(unittest.TestCase):
    def test_find_ohai(self):
        module = None
        collector = OhaiFactCollector()
        ohai_path = collector.find_ohai(module)
        self.assertEqual(ohai_path, '/path/to/ohai')

    def test_run_ohai(self):
        module = mock.Mock()
        collector = OhaiFactCollector()
        rc, out, err = collector.run_ohai(module, '/path/to/ohai')
        self.assertEqual(rc, 0)
        self.assertEqual(out, '{"key": "value"}')
        self.assertEqual(err, '')

    def test_get_ohai_output(self):
        module = mock.Mock()
        collector = OhaiFactCollector()
        ohai_output = collector.get_ohai_output(module)
        self.assertEqual(ohai_output, '{"key": "value"}')

    def test_collect(self):
        module = mock.Mock()
        collector = OhaiFactCollector()
        collected_facts = collector.collect(module)
        self.assertEqual(collected_facts, {'ohai': {'key': 'value'}})

if __name__ == '__main__':
    unittest.main()