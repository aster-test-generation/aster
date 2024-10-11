import json
import unittest
from ansible.module_utils.facts.other.ohai import OhaiFactCollector


class TestOhaiFactCollector(unittest.TestCase):
    def test_find_ohai(self):
        collector = OhaiFactCollector()
        module = MagicMock()
        module.get_bin_path.return_value = '/path/to/ohai'
        ohai_path = collector.find_ohai(module)
        self.assertEqual(ohai_path, '/path/to/ohai')

    def test_run_ohai(self):
        collector = OhaiFactCollector()
        module = MagicMock()
        module.run_command.return_value = (0, 'ohai output', 'error output')
        rc, out, err = collector.run_ohai(module, '/path/to/ohai')
        self.assertEqual(rc, 0)
        self.assertEqual(out, 'ohai output')
        self.assertEqual(err, 'error output')

    def test_get_ohai_output(self):
        collector = OhaiFactCollector()
        module = MagicMock()
        module.get_bin_path.return_value = '/path/to/ohai'
        module.run_command.return_value = (0, 'ohai output', 'error output')
        ohai_output = collector.get_ohai_output(module)
        self.assertEqual(ohai_output, 'ohai output')

    def test_collect(self):
        collector = OhaiFactCollector()
        module = MagicMock()
        module.get_bin_path.return_value = '/path/to/ohai'
        module.run_command.return_value = (0, '{"key": "value"}', 'error output')
        ohai_facts = collector.collect(module)
        self.assertEqual(ohai_facts, {'ohai_key': 'value'})

if __name__ == '__main__':
    unittest.main()