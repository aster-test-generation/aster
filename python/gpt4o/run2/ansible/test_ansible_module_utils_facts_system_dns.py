import unittest
from unittest.mock import patch
from ansible.module_utils.facts.system.dns import DnsFactCollector
from ansible.module_utils.facts.utils import get_file_content


class TestDnsFactCollector(unittest.TestCase):
    def setUp(self):
        self.collector = DnsFactCollector()

    @patch('ansible.module_utils.facts.utils.get_file_content')
    def test_collect_with_nameserver(self, mock_get_file_content):
        mock_get_file_content.return_value = "nameserver 8.8.8.8\n"
        result = self.collector.collect()
        self.assertEqual(result['dns']['nameservers'], ['8.8.8.8'])

    @patch('ansible.module_utils.facts.utils.get_file_content')
    def test_collect_with_domain(self, mock_get_file_content):
        mock_get_file_content.return_value = "domain example.com\n"
        result = self.collector.collect()
        self.assertEqual(result['dns']['domain'], 'example.com')

    @patch('ansible.module_utils.facts.utils.get_file_content')
    def test_collect_with_search(self, mock_get_file_content):
        mock_get_file_content.return_value = "search example.com sub.example.com\n"
        result = self.collector.collect()
        self.assertEqual(result['dns']['search'], ['example.com', 'sub.example.com'])

    @patch('ansible.module_utils.facts.utils.get_file_content')
    def test_collect_with_sortlist(self, mock_get_file_content):
        mock_get_file_content.return_value = "sortlist 192.168.1.0/24\n"
        result = self.collector.collect()
        self.assertEqual(result['dns']['sortlist'], ['192.168.1.0/24'])

    @patch('ansible.module_utils.facts.utils.get_file_content')
    def test_collect_with_options(self, mock_get_file_content):
        mock_get_file_content.return_value = "options timeout:2 attempts:3\n"
        result = self.collector.collect()
        self.assertEqual(result['dns']['options'], {'timeout': '2', 'attempts': '3'})

    @patch('ansible.module_utils.facts.utils.get_file_content')
    def test_collect_with_empty_file(self, mock_get_file_content):
        mock_get_file_content.return_value = ""
        result = self.collector.collect()
        self.assertEqual(result['dns'], {})

    @patch('ansible.module_utils.facts.utils.get_file_content')
    def test_collect_with_invalid_lines(self, mock_get_file_content):
        mock_get_file_content.return_value = "invalid line\n"
        result = self.collector.collect()
        self.assertEqual(result['dns'], {})

if __name__ == '__main__':
    unittest.main()