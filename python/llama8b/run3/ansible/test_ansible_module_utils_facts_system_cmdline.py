import unittest
from ansible.module_utils.facts.system.cmdline import CmdLineFactCollector


class TestCmdLineFactCollector(unittest.TestCase):
    def test_get_proc_cmdline(self):
        collector = CmdLineFactCollector()
        result = collector._get_proc_cmdline()
        self.assertIsNotNone(result)

    def test_parse_proc_cmdline(self):
        collector = CmdLineFactCollector()
        data = "key1=value1 key2=value2"
        result = collector._parse_proc_cmdline(data)
        self.assertEqual(result, {"key1": "value1", "key2": "value2"})

    def test_parse_proc_cmdline_facts(self):
        collector = CmdLineFactCollector()
        data = "key1=value1 key2=value2 key2=value3"
        result = collector._parse_proc_cmdline_facts(data)
        self.assertEqual(result, {"key1": "value1", "key2": ["value2", "value3"]})

    def test_collect(self):
        collector = CmdLineFactCollector()
        result = collector.collect()
        self.assertIsNotNone(result)
        self.assertIn('cmdline', result)
        self.assertIn('proc_cmdline', result)

    def test_str_method(self):
        collector = CmdLineFactCollector()
        result = str(collector)
        self.assertEqual(result, "CmdLineFactCollector")

    def test_repr_method(self):
        collector = CmdLineFactCollector()
        result = repr(collector)
        self.assertEqual(result, "CmdLineFactCollector()")

    def test_eq_method(self):
        collector1 = CmdLineFactCollector()
        collector2 = CmdLineFactCollector()
        self.assertEqual(collector1, collector2)

if __name__ == '__main__':
    unittest.main()