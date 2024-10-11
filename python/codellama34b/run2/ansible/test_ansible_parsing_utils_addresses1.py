
import unittest
from ansible.parsing.utils.addresses import *

class TestParseAddress(unittest.TestCase):
    def test_parse_address(self):
        result = parse_address("127.0.0.1:8080")
        self.assertEqual(result, ("127.0.0.1", 8080))

    def test_parse_address_2(self):
        result = parse_address("[::1]:8080")
        self.assertEqual(result, ("::1", 8080))

    def test_parse_address_3(self):
        result = parse_address("localhost:8080")
        self.assertEqual(result, ("localhost", 8080))

    def test_parse_address_4(self):
        result = parse_address("127.0.0.1")
        self.assertEqual(result, ("127.0.0.1", None))

    def test_parse_address_5(self):
        result = parse_address("[::1]")
        self.assertEqual(result, ("::1", None))

    def test_parse_address_6(self):
        result = parse_address("localhost")
        self.assertEqual(result, ("localhost", None))

    def test_parse_address_7(self):
        result = parse_address("127.0.0.1:8080", True)
        self.assertEqual(result, ("127.0.0.1", 8080))

    def test_parse_address_8(self):
        result = parse_address("[::1]:8080", True)
        self.assertEqual(result, ("::1", 8080))

    def test_parse_address_9(self):
        result = parse_address("localhost:8080", True)
        self.assertEqual(result, ("localhost", 8080))

    def test_parse_address_10(self):
        result = parse_address("127.0.0.1", True)
        self.assertEqual(result, ("127.0.0.1", None))

    def test_parse_address_11(self):
        result = parse_address("[::1]", True)
        self.assertEqual(result, ("::1", None))

    def test_parse_address_12(self):
        result = parse_address("localhost", True)
        self.assertEqual(result, ("localhost", None))

    def test_parse_address_13(self):
        result = parse_address("127.0.0.1:8080", False)
        self.assertEqual(result, ("127.0.0.1", 8080))

    def test_parse_address_14(self):
        result = parse_address("[::1]:8080", False)
        self.assertEqual(result, ("::1", 8080))

    def test_parse_address_15(self):
        result = parse_address("localhost:8080", False)
        self.assertEqual(result, ("localhost", 8080))

    def test_parse_address_16(self):
        result = parse_address("127.0.0.1", False)
        self.assertEqual(result, ("127.0.0.1", None))

    def test_parse_address_17(self):
        result = parse_address("[::1]", False)
        self.assertEqual(result, ("::1", None))

    def test_parse_address_18(self):
        result = parse_address("localhost", False)
        self.assertEqual(result, ("localhost", None))

    def test_parse_address_19(self):
        result = parse_address("127.0.0.1:8080", True)
        self.assertEqual(result, ("127.0.0.1", 8080))

if __name__ == '__main__':
    unittest.main()