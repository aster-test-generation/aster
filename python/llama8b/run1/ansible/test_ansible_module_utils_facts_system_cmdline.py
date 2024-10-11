import unittest
from ansible.module_utils.facts.system.cmdline import CmdLineFactCollector


class TestCmdLineFactCollector(unittest.TestCase):
    def test_get_proc_cmdline(self):
        collector = CmdLineFactCollector()
        result = collector._get_proc_cmdline()
        self.assertIsInstance(result, str)

    def test_parse_proc_cmdline(self):
        collector = CmdLineFactCollector()
        data = "kernel cmdline=abc"
        result = collector._parse_proc_cmdline(data)
        self.assertEqual(result, {"cmdline": "abc"})

    def test_parse_proc_cmdline_facts(self):
        collector = CmdLineFactCollector()
        data = "kernel cmdline=abc kernel cmdline=def"
        result = collector._parse_proc_cmdline_facts(data)
        self.assertEqual(result, {"cmdline": ["abc", "def"]})

    def test_collect(self):
        collector = CmdLineFactCollector()
        result = collector.collect()
        self.assertIsInstance(result, dict)
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