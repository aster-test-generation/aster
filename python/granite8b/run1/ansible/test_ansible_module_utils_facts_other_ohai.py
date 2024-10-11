import json
import unittest
from ansible.module_utils.facts.other.ohai import OhaiFactCollector
from unittest.mock import Mock


class TestOhaiFactCollector(unittest.TestCase):
    def test_find_ohai(self):
        collector = OhaiFactCollector()
        module = Mock()
        ohai_path = collector.find_ohai(module)
        self.assertEqual(ohai_path, '/usr/bin/ohai')

    def test_run_ohai(self):
        collector = OhaiFactCollector()
        module = Mock()
        rc, out, err = collector.run_ohai(module, '/usr/bin/ohai')
        self.assertEqual(rc, 0)
        self.assertEqual(out, '{"ohai_test": "test"}')
        self.assertEqual(err, '')

    def test_get_ohai_output(self):
        collector = OhaiFactCollector()
        module = Mock()
        ohai_output = collector.get_ohai_output(module)
        self.assertEqual(ohai_output, '{"ohai_test": "test"}')

    def test_collect(self):
        collector = OhaiFactCollector()
        module = Mock()
        ohai_facts = collector.collect(module)
        self.assertEqual(ohai_facts, {'ohai_test': 'test'})

if __name__ == '__main__':
    unittest.main()