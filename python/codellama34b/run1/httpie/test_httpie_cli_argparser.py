import unittest
from httpie.cli.argparser import *



class TestHTTPieArgumentParser(unittest.TestCase):
    def test_init(self):
        instance = HTTPieArgumentParser()
        self.assertEqual(instance.env, None)
        self.assertEqual(instance.args, None)
        self.assertEqual(instance.has_stdin_data, False)

if __name__ == '__main__':
    unittest.main()