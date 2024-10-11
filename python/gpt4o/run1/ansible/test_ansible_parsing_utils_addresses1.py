import unittest
from ansible.parsing.utils.addresses import parse_address, patterns
from ansible.errors import AnsibleParserError, AnsibleError

class TestParseAddress(unittest.TestCase):
    def test_parse_address_bracketed_hostport(self):
        result = parse_address("[127.0.0.1]:8080")
        self.assertEqual(result, ("127.0.0.1", 8080))

    def test_parse_address_hostport(self):
        result = parse_address("127.0.0.1:8080")
        self.assertEqual(result, ("127.0.0.1", 8080))

    def test_parse_address_ipv4(self):
        result = parse_address("192.168.1.1")
        self.assertEqual(result, ("192.168.1.1", None))

    def test_parse_address_ipv6(self):
        result = parse_address("2001:0db8:85a3:0000:0000:8a2e:0370:7334")
        self.assertEqual(result, ("2001:0db8:85a3:0000:0000:8a2e:0370:7334", None))

    def test_parse_address_hostname(self):
        result = parse_address("example.com")
        self.assertEqual(result, ("example.com", None))

    def test_parse_address_invalid_hostname(self):
        with self.assertRaises(AnsibleError):
            parse_address("invalid_hostname")

    def test_parse_address_with_range_not_allowed(self):
        with self.assertRaises(AnsibleParserError):
            parse_address("[192.168.1.1:192.168.1.10]", allow_ranges=False)

    def test_parse_address_with_range_allowed(self):
        result = parse_address("[192.168.1.1:192.168.1.10]", allow_ranges=True)
        self.assertEqual(result, ("[192.168.1.1:192.168.1.10]", None))

    def test_patterns_bracketed_hostport(self):
        self.assertTrue(patterns['bracketed_hostport'].match("[127.0.0.1]:8080"))

    def test_patterns_hostport(self):
        self.assertTrue(patterns['hostport'].match("127.0.0.1:8080"))

    def test_patterns_ipv4(self):
        self.assertTrue(patterns['ipv4'].match("192.168.1.1"))

    def test_patterns_ipv6(self):
        self.assertTrue(patterns['ipv6'].match("2001:0db8:85a3:0000:0000:8a2e:0370:7334"))

    def test_patterns_hostname(self):
        self.assertTrue(patterns['hostname'].match("example.com"))

if __name__ == '__main__':
    unittest.main()