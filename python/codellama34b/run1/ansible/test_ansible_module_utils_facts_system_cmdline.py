import unittest
from ansible.module_utils.facts.system.cmdline import *


class TestCmdLineFactCollector(unittest.TestCase):
    def test_get_proc_cmdline(self):
        instance = CmdLineFactCollector()
        result = instance._get_proc_cmdline()
        self.assertIsNotNone(result)

    def test_parse_proc_cmdline(self):
        instance = CmdLineFactCollector()
        data = 'test=data'
        result = instance._parse_proc_cmdline(data)
        self.assertIsNotNone(result)

    def test_parse_proc_cmdline_facts(self):
        instance = CmdLineFactCollector()
        data = 'test=data'
        result = instance._parse_proc_cmdline_facts(data)
        self.assertIsNotNone(result)

    def test_collect(self):
        instance = CmdLineFactCollector()
        result = instance.collect()
        self.assertIsNotNone(result)

if __name__ == '__main__':
    unittest.main()