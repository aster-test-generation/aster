import unittest
from ansible.module_utils.facts.system.cmdline import CmdLineFactCollector


class TestCmdLineFactCollector(unittest.TestCase):
    def test___init__(self):
        instance = CmdLineFactCollector()
        self.assertIsInstance(instance, CmdLineFactCollector)

    def test_name(self):
        instance = CmdLineFactCollector()
        self.assertEqual(instance.name, 'cmdline')

    def test__fact_ids(self):
        instance = CmdLineFactCollector()
        self.assertIsInstance(instance._fact_ids, set)

    def test__get_proc_cmdline(self):
        instance = CmdLineFactCollector()
        result = instance._get_proc_cmdline()
        self.assertIsInstance(result, str)

    def test__parse_proc_cmdline(self):
        instance = CmdLineFactCollector()
        data = 'foo=bar baz=qux'
        result = instance._parse_proc_cmdline(data)
        self.assertEqual(result, {'foo': 'bar', 'baz': 'qux'})

    def test__parse_proc_cmdline_facts(self):
        instance = CmdLineFactCollector()
        data = 'foo=bar baz=qux foo=quux'
        result = instance._parse_proc_cmdline_facts(data)
        self.assertEqual(result, {'foo': ['bar', 'quux'], 'baz': 'qux'})

    def test_collect(self):
        instance = CmdLineFactCollector()
        result = instance.collect()
        self.assertIsInstance(result, dict)

    def test___str__(self):
        instance = CmdLineFactCollector()
        result = instance.__str__()
        self.assertEqual(result, 'CmdLineFactCollector')

    def test___repr__(self):
        instance = CmdLineFactCollector()
        result = instance.__repr__()
        self.assertEqual(result, 'CmdLineFactCollector()')

if __name__ == '__main__':
    unittest.main()