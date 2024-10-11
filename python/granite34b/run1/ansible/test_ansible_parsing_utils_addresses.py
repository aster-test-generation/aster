import unittest
from ansible.parsing.utils.addresses import parse_address


class TestParseAddress(unittest.TestCase):
    def test_parse_address_with_port(self):
        address = "example.com:80"
        (host, port) = parse_address(address)
        self.assertEqual(host, "example.com")
        self.assertEqual(port, 80)

    def test_parse_address_without_port(self):
        address = "example.com"
        (host, port) = parse_address(address)
        self.assertEqual(host, "example.com")
        self.assertEqual(port, None)

    def test_parse_address_with_ipv4(self):
        address = "192.168.1.1"
        (host, port) = parse_address(address)
        self.assertEqual(host, "192.168.1.1")
        self.assertEqual(port, None)

    def test_parse_address_with_ipv6(self):
        address = "2001:0db8:85a3:0000:0000:8a2e:0370:7334"
        (host, port) = parse_address(address)
        self.assertEqual(host, "2001:0db8:85a3:0000:0000:8a2e:0370:7334")
        self.assertEqual(port, None)

    def test_parse_address_with_hostname(self):
        address = "www.example.com"
        (host, port) = parse_address(address)
        self.assertEqual(host, "www.example.com")
        self.assertEqual(port, None)

    def test_parse_address_with_range(self):
        address = "example[01:03].com"
        with self.assertRaises(AnsibleParserError):
            parse_address(address, allow_ranges=False)

    def test_parse_address_with_invalid_address(self):
        address = "invalid_address"
        with self.assertRaises(AnsibleError):
            parse_address(address)

if __name__ == '__main__':
    unittest.main()