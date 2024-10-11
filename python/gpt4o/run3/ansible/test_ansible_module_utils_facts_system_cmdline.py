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
        self.assertEqual(result, {})

class TestCmdLineFactCollector(unittest.TestCase):
    def setUp(self):
        self.collector = CmdLineFactCollector()

    @patch('ansible.module_utils.facts.system.cmdline.get_file_content')
    def test_get_proc_cmdline(self, mock_get_file_content):
        mock_get_file_content.return_value = 'mocked content'
        result = self.collector._get_proc_cmdline()
        self.assertEqual(result, 'mocked content')

    def test_parse_proc_cmdline(self):
        data = 'key1=value1 key2=value2 key3'
        expected_result = {
            'key1': 'value1',
            'key2': 'value2',
            'key3': True
        }
        result = self.collector._parse_proc_cmdline(data)
        self.assertEqual(result, expected_result)

    def test_parse_proc_cmdline_facts(self):
        data = 'key1=value1 key2=value2 key3 key1=value3'
        expected_result = {
            'key1': ['value1', 'value3'],
            'key2': 'value2',
            'key3': True
        }
        result = self.collector._parse_proc_cmdline_facts(data)
        self.assertEqual(result, expected_result)

    @patch.object(CmdLineFactCollector, '_get_proc_cmdline')
    @patch.object(CmdLineFactCollector, '_parse_proc_cmdline')
    @patch.object(CmdLineFactCollector, '_parse_proc_cmdline_facts')
    def test_collect(self, mock_parse_proc_cmdline_facts, mock_parse_proc_cmdline, mock_get_proc_cmdline):
        mock_get_proc_cmdline.return_value = 'mocked data'
        mock_parse_proc_cmdline.return_value = {'key1': 'value1'}
        mock_parse_proc_cmdline_facts.return_value = {'key2': 'value2'}

        expected_result = {
            'cmdline': {'key1': 'value1'},
            'proc_cmdline': {'key2': 'value2'}
        }
        result = self.collector.collect()
        self.assertEqual(result, expected_result)

    @patch.object(CmdLineFactCollector, '_get_proc_cmdline')
    def test_collect_no_data(self, mock_get_proc_cmdline):
        mock_get_proc_cmdline.return_value = ''
        result = self.collector.collect()
        self.assertEqual(result, {})

if __name__ == '__main__':
    unittest.main()