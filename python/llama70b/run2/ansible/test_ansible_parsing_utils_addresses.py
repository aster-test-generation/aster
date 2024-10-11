import unittest
from ansible.parsing.utils.addresses import parse_address, patterns


class TestParseAddress(unittest.TestCase):
    def test_parse_address_ipv4(self):
        result = parse_address("192.168.1.1:80")
        self.assertEqual(result, ("192.168.1.1", 80))

    def test_parse_address_ipv6(self):
        result = parse_address("[2001:0db8:85a3:0000:0000:8a2e:0370:7334]:80")
        self.assertEqual(result, ("[2001:0db8:85a3:0000:0000:8a2e:0370:7334]", 80))

    def test_parse_address_hostname(self):
        result = parse_address("example.com:80")
        self.assertEqual(result, ("example.com", 80))

    def test_parse_address_bracketed_hostport(self):
        result = parse_address("[example.com]:80")
        self.assertEqual(result, ("[example.com]", 80))

    def test_parse_address_hostport(self):
        result = parse_address("example.com:80")
        self.assertEqual(result, ("example.com", 80))

    def test_parse_address_invalid(self):
        with self.assertRaises(AnsibleError):
            parse_address("invalid address")

    def test_parse_address_range(self):
        with self.assertRaises(AnsibleParserError):
            parse_address("192.168.1.[1:10]:80", allow_ranges=False)

class TestPatterns(unittest.TestCase):
    def test_bracketed_hostport_pattern(self):
        pattern = patterns['bracketed_hostport']
        match = pattern.match("[example.com]:80")
        self.assertIsNotNone(match)

    def test_hostport_pattern(self):
        pattern = patterns['hostport']
        match = pattern.match("example.com:80")
        self.assertIsNotNone(match)

    def test_ipv4_pattern(self):
        pattern = patterns['ipv4']
        match = pattern.match("192.168.1.1")
        self.assertIsNotNone(match)

    def test_ipv6_pattern(self):
        pattern = patterns['ipv6']
        match = pattern.match("2001:0db8:85a3:0000:0000:8a2e:0370:7334")
        self.assertIsNotNone(match)

    def test_hostname_pattern(self):
        pattern = patterns['hostname']
        match = pattern.match("example.com")
        self.assertIsNotNone(match)

if __name__ == '__main__':
    unittest.main()