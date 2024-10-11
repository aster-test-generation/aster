from ansible.parsing.utils.addresses import AnsibleError
import unittest
from ansible.parsing.utils.addresses import parse_address


class TestParseAddress(unittest.TestCase):
    def test_parse_address_bracketed_hostport(self):
        address = "[127.0.0.1]:80"
        expected_host = "127.0.0.1"
        expected_port = 80
        (host, port) = parse_address(address)
        self.assertEqual(host, expected_host)
        self.assertEqual(port, expected_port)

    def test_parse_address_hostport(self):
        address = "example.com:80"
        expected_host = "example.com"
        expected_port = 80
        (host, port) = parse_address(address)
        self.assertEqual(host, expected_host)
        self.assertEqual(port, expected_port)

    def test_parse_address_ipv4(self):
        address = "127.0.0.1"
        expected_host = "127.0.0.1"
        expected_port = None
        (host, port) = parse_address(address)
        self.assertEqual(host, expected_host)
        self.assertEqual(port, expected_port)

    def test_parse_address_ipv6(self):
        address = "[2001:db8::1]"
        expected_host = "2001:db8::1"
        expected_port = None
        (host, port) = parse_address("[2001:db8::1]")
        self.assertEqual(host, expected_host)
        self.assertEqual(port, expected_port)

    def test_parse_address_hostname(self):
        address = "example.com"
        expected_host = "example.com"
        expected_port = None
        (host, port) = parse_address(address)
        self.assertEqual(host, expected_host)
        self.assertEqual(port, expected_port)

    def test_parse_address_invalid(self):
        address = "invalid_address"
        with self.assertRaises(AnsibleError):
            parse_address(address)

if __name__ == '__main__':
    unittest.main()