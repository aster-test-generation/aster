import unittest
from ansible.module_utils.facts.system.cmdline import CmdLineFactCollector
from ansible.module_utils.facts.utils import get_file_content


class TestCmdLineFactCollector(unittest.TestCase):
    def test_name(self):
        instance = CmdLineFactCollector()
        result = instance.name
        self.assertEqual(result, 'cmdline')

    def test_get_proc_cmdline(self):
        instance = CmdLineFactCollector()
        result = instance._get_proc_cmdline()
        self.assertEqual(result, get_file_content('/proc/cmdline'))

    def test_parse_proc_cmdline(self):
        instance = CmdLineFactCollector()
        data = 'test_data'
        result = instance._parse_proc_cmdline(data)
        self.assertEqual(result, {'test_data': True})

    def test_parse_proc_cmdline_facts(self):
        instance = CmdLineFactCollector()
        data = 'test_data'
        result = instance._parse_proc_cmdline_facts(data)
        self.assertEqual(result, {'test_data': True})

    def test_collect(self):
        instance = CmdLineFactCollector()
        result = instance.collect()
        self.assertEqual(result, {'cmdline': {'BOOT_IMAGE': '(hd0,msdos1)/boot/vmlinuz-4.15.0-101-generic root=UUID=d647874e-4e08-4b38-9848-23118f560f92 ro quiet splash vt.handoff=1'}})

if __name__ == '__main__':
    unittest.main()