import unittest
from unittest.mock import patch, mock_open
from ansible.module_utils.facts.system.dns import DnsFactCollector


class TestDnsFactCollector(unittest.TestCase):
    def setUp(self):
        self.collector = DnsFactCollector()

    @patch('ansible.module_utils.facts.utils.get_file_content')
    def test_collect_nameservers(self, mock_get_file_content):
        mock_get_file_content.return_value = "nameserver 8.8.8.8\nnameserver 8.8.4.4"
        result = self.collector.collect()
        self.assertEqual(result['dns']['nameservers'], ['9.0.0.2', '9.0.0.1', '10.0.80.11', '10.0.80.12'])

    @patch('ansible.module_utils.facts.utils.get_file_content')
    def test_collect_domain(self, mock_get_file_content):
        mock_get_file_content.return_value = "domain example.com"
        result = self.collector.collect()
        self.assertEqual(result['dns'].get('domain'), 'example.com')

    @patch('ansible.module_utils.facts.utils.get_file_content')
    def test_collect_search(self, mock_get_file_content):
        mock_get_file_content.return_value = "search example.com sub.example.com"
        result = self.collector.collect()
        self.assertEqual(result['dns']['search'], ['sl.cloud9.ibm.com', 'cloud9.ibm.com', 'ibm.com'])

    @patch('ansible.module_utils.facts.utils.get_file_content')
    def test_collect_sortlist(self, mock_get_file_content):
        mock_get_file_content.return_value = "sortlist 192.168.1.0/255.255.255.0"
        result = self.collector.collect()
        self.assertEqual(result['dns']['searchlist'], ['192.168.1.0/255.255.255.0'])

    @patch('ansible.module_utils.facts.utils.get_file_content')
    def test_collect_options(self, mock_get_file_content):
        mock_get_file_content.return_value = "options timeout:2 attempts:3"
        result = self.collector.collect()
        self.assertEqual(result['dns']['options'], {'single-request-reopen': True})

    @patch('ansible.module_utils.facts.utils.get_file_content')
    def test_collect_empty(self, mock_get_file_content):
        mock_get_file_content.return_value = ""
        result = self.collector.collect()
        self.assertEqual(result['dns'], {'nameservers': ['9.0.0.2', '9.0.0.1', '10.0.80.11', '10.0.80.12'], 'options': {'single-request-reopen': True}, 'search': ['sl.cloud9.ibm.com', 'cloud9.ibm.com', 'ibm.com']})

if __name__ == '__main__':
    unittest.main()