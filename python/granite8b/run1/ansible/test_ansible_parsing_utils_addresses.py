from ansible.parsing.utils.addresses import AnsibleError
import unittest
from ansible.parsing.utils.addresses import parse_address


class TestParseAddress(unittest.TestCase):
    def test_parse_address_ipv4(self):
        host, port = parse_address('192.168.1.1')
        self.assertEqual(host, '192.168.1.1')
        self.assertEqual(port, None)

    def test_parse_address_ipv6(self):
        host, port = parse_address('[2001:db8::1]:80')
        self.assertEqual(host, '2001:db8::1')
        self.assertEqual(port, None)

    def test_parse_address_hostname(self):
        host, port = parse_address('example.com')
        self.assertEqual(host, 'example.com')
        self.assertEqual(port, None)

    def test_parse_address_bracketed_hostport(self):
        host, port = parse_address('[example.com]:80')
        self.assertEqual(host, 'example.com')
        self.assertEqual(port, 80)

    def test_parse_address_hostport(self):
        host, port = parse_address('example.com:80')
        self.assertEqual(host, 'example.com')
        self.assertEqual(port, 80)

    def test_parse_address_allow_ranges(self):
        host, port = parse_address('[192.168.1.1:80-81]', allow_ranges=True)
        self.assertEqual(host, '192.168.1.1')
        self.assertEqual(port, 80)

    def test_parse_address_invalid_address(self):
        with self.assertRaises(AnsibleError):
            parse_address('example.com:8080:8081')

if __name__ == '__main__':
    unittest.main()