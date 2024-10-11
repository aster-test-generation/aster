import unittest
from ansible.parsing.utils.addresses import *


class TestAddresses(unittest.TestCase):
    def test_parse_address(self):
        address = "127.0.0.1:80"
        result = parse_address(address)
        self.assertEqual(result, ("127.0.0.1", 80))

    def test_parse_address_with_ranges(self):
        address = "127.0.0.1:80"
        result = parse_address(address, allow_ranges=True)
        self.assertEqual(result, ("127.0.0.1", 80))

    def test_parse_address_with_ranges_and_invalid_host(self):
        address = "127.0.0.1:80"
        with self.assertRaises(AnsibleError):
            parse_address(address, allow_ranges=True)

    def test_parse_address_with_invalid_host(self):
        address = "127.0.0.1:80"
        with self.assertRaises(AnsibleError):
            parse_address(address)

    def test_parse_address_with_invalid_port(self):
        address = "127.0.0.1:80"
        with self.assertRaises(AnsibleParserError):
            parse_address(address)

if __name__ == '__main__':
    unittest.main()