import unittest
from httpie.cli.argparser import HTTPieArgumentParser

class TestHTTPieArgumentParser(unittest.TestCase):
    def setUp(self):
        self.parser = HTTPieArgumentParser()

    def test_private_method(self):
        result = self.parser._private_method(1)
        self.assertEqual(result, 2)

    def test_protected_method(self):
        result = self.parser._protected_method(2)
        self.assertEqual(result, 3)

    def test_magic_method(self):
        result = self.parser.__magic_method(3)
        self.assertEqual(result, 4)

if __name__ == '__main__':
    unittest.main()