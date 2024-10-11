import unittest
from ansible.module_utils.facts.system.cmdline import CmdLineFactCollector


class TestCmdLineFactCollector(unittest.TestCase):
    def test_get_proc_cmdline(self):
        collector = CmdLineFactCollector()
        result = collector._get_proc_cmdline()
        self.assertIsNotNone(result)

    def test_parse_proc_cmdline(self):
        collector = CmdLineFactCollector()
        data = "foo=bar baz=qux"
        result = collector._parse_proc_cmdline(data)
        self.assertEqual(result, {'foo': 'bar', 'baz': 'qux'})

    def test_parse_proc_cmdline_facts(self):
        collector = CmdLineFactCollector()
        data = "foo=bar baz=qux"
        result = collector._parse_proc_cmdline_facts(data)
        self.assertEqual(result, {'foo': 'bar', 'baz': 'qux'})

    def test_collect(self):
        collector = CmdLineFactCollector()
        result = collector.collect()
        self.assertIsNotNone(result)

if __name__ == '__main__':
    unittest.main()