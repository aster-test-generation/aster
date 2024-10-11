import unittest
from ansible.parsing.utils.addresses import parse_address


class TestParseAddress(unittest.TestCase):
    def test_parse_address_ipv4(self):
        host, port = parse_address('192.168.0.1')
        self.assertEqual(host, '192.168.0.1')
        self.assertIsNone(port)

    def test_parse_address_ipv6(self):
        host, port = parse_address('2001:0db8:85a3:0000:0000:8a2e:0370:7334')
        self.assertEqual(host, '2001:0db8:85a3:0000:0000:8a2e:0370:7334')
        self.assertIsNone(port)

    def test_parse_address_hostname(self):
        host, port = parse_address('example.com')
        self.assertEqual(host, 'example.com')
        self.assertIsNone(port)

    def test_parse_address_bracketed_hostport(self):
        host, port = parse_address('[2001:0db8:85a3:0000:0000:8a2e:0370:7334]:8080')
        self.assertEqual(host, '2001:0db8:85a3:0000:0000:8a2e:0370:7334')
        self.assertEqual(port, 8080)

    def test_parse_address_hostport(self):
        host, port = parse_address('example.com:8080')
        self.assertEqual(host, 'example.com')
        self.assertEqual(port, 8080)

    def test_parse_address_allow_ranges(self):
        host, port = parse_address('192.168.0.1-192.168.0.10', allow_ranges=True)
        self.assertEqual(host, '192.168.0.1-192.168.0.10')
        self.assertIsNone(port)

if __name__ == '__main__':
    unittest.main()