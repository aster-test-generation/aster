from ansible.parsing.utils.addresses import AnsibleParserError
import unittest
from ansible.parsing.utils.addresses import parse_address


class TestParseAddress(unittest.TestCase):
    def test_bracketed_hostport(self):
        address = "[192.168.1.1]:80"
        expected_host = "192.168.1.1"
        expected_port = 80
        host, port = parse_address(address)
        self.assertEqual(host, expected_host)
        self.assertEqual(port, expected_port)

    def test_hostport(self):
        address = "example.com:8080"
        expected_host = "example.com"
        expected_port = 8080
        host, port = parse_address(address)
        self.assertEqual(host, expected_host)
        self.assertEqual(port, expected_port)

    def test_ipv4(self):
        address = "192.168.1.1"
        expected_host = "192.168.1.1"
        expected_port = None
        host, port = parse_address(address)
        self.assertEqual(host, expected_host)
        self.assertEqual(port, expected_port)

    def test_ipv6(self):
        address = "2001:0db8:85a3:0000:0000:8a2e:0370:7334"
        expected_host = "2001:0db8:85a3:0000:0000:8a2e:0370:7334"
        expected_port = None
        host, port = parse_address(address)
        self.assertEqual(host, expected_host)
        self.assertEqual(port, expected_port)

    def test_hostname(self):
        address = "example.com"
        expected_host = "example.com"
        expected_port = None
        host, port = parse_address(address)
        self.assertEqual(host, expected_host)
        self.assertEqual(port, expected_port)

    def test_range_in_host(self):
        address = "example.com[1:10]"
        with self.assertRaises(AnsibleParserError):
            parse_address(address, allow_ranges=False)

if __name__ == '__main__':
    unittest.main()