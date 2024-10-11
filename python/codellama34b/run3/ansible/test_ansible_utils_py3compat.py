import unittest
from ansible.utils.py3compat import environ


class TestEnviron(unittest.TestCase):
    def test_environ(self):
        result = environ
        self.assertEqual(result, environ)

if __name__ == '__main__':
    unittest.main()