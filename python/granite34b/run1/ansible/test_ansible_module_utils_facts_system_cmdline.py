import unittest
from ansible.module_utils.facts.system.cmdline import CmdLineFactCollector


class TestCmdLineFactCollector(unittest.TestCase):
    def test_get_proc_cmdline(self):
        collector = CmdLineFactCollector()
        data = collector._get_proc_cmdline()
        self.assertIsNotNone(data)

    def test_parse_proc_cmdline(self):
        collector = CmdLineFactCollector()
        data = collector._get_proc_cmdline()
        cmdline_dict = collector._parse_proc_cmdline(data)
        self.assertIsInstance(cmdline_dict, dict)

    def test_parse_proc_cmdline_facts(self):
        collector = CmdLineFactCollector()
        data = collector._get_proc_cmdline()
        cmdline_dict = collector._parse_proc_cmdline_facts(data)
        self.assertIsInstance(cmdline_dict, dict)

    def test_collect(self):
        collector = CmdLineFactCollector()
        cmdline_facts = collector.collect()
        self.assertIsInstance(cmdline_facts, dict)
        self.assertIn('cmdline', cmdline_facts)
        self.assertIn('proc_cmdline', cmdline_facts)

if __name__ == '__main__':
    unittest.main()