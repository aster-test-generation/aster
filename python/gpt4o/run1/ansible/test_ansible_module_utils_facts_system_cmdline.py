import unittest
from unittest.mock import patch, mock_open
from ansible.module_utils.facts.system.cmdline import CmdLineFactCollector


class TestCmdLineFactCollector(unittest.TestCase):
    def setUp(self):
        self.collector = CmdLineFactCollector()

    @patch('ansible.module_utils.facts.system.cmdline.get_file_content', return_value='BOOT_IMAGE=/vmlinuz-4.15.0-20-generic root=/dev/sda1 ro quiet splash')
    def test_get_proc_cmdline(self, mock_get_file_content):
        result = self.collector._get_proc_cmdline()
        self.assertEqual(result, 'BOOT_IMAGE=/vmlinuz-4.15.0-20-generic root=/dev/sda1 ro quiet splash')

    def test_parse_proc_cmdline(self):
        data = 'BOOT_IMAGE=/vmlinuz-4.15.0-20-generic root=/dev/sda1 ro quiet splash'
        result = self.collector._parse_proc_cmdline(data)
        expected = {
            'BOOT_IMAGE': '/vmlinuz-4.15.0-20-generic',
            'root': '/dev/sda1',
            'ro': True,
            'quiet': True,
            'splash': True
        }
        self.assertEqual(result, expected)

    def test_parse_proc_cmdline_facts(self):
        data = 'BOOT_IMAGE=/vmlinuz-4.15.0-20-generic root=/dev/sda1 ro quiet splash'
        result = self.collector._parse_proc_cmdline_facts(data)
        expected = {
            'BOOT_IMAGE': '/vmlinuz-4.15.0-20-generic',
            'root': '/dev/sda1',
            'ro': True,
            'quiet': True,
            'splash': True
        }
        self.assertEqual(result, expected)

    @patch('ansible.module_utils.facts.system.cmdline.get_file_content', return_value='BOOT_IMAGE=/vmlinuz-4.15.0-20-generic root=/dev/sda1 ro quiet splash')
    def test_collect(self, mock_get_file_content):
        result = self.collector.collect()
        expected = {
            'cmdline': {
                'BOOT_IMAGE': '/vmlinuz-4.15.0-20-generic',
                'root': '/dev/sda1',
                'ro': True,
                'quiet': True,
                'splash': True
            },
            'proc_cmdline': {
                'BOOT_IMAGE': '/vmlinuz-4.15.0-20-generic',
                'root': '/dev/sda1',
                'ro': True,
                'quiet': True,
                'splash': True
            }
        }
        self.assertEqual(result, expected)

    @patch('ansible.module_utils.facts.system.cmdline.get_file_content', return_value='')
    def test_collect_no_data(self, mock_get_file_content):
        result = self.collector.collect()
        expected = {}
        self.assertEqual(result, expected)

if __name__ == '__main__':
    unittest.main()