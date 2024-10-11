import unittest
from ansible.utils.py3compat import environ

class TestEnviron(unittest.TestCase):
    def test_environ_delitem(self):
        del environ['PATH']

    def test_environ_getitem(self):
        value = environ['PATH']
        self.assertIsInstance(value, str)

    def test_environ_setitem(self):
        environ['TEST_ENV'] = 'test_value'
        self.assertEqual(environ['TEST_ENV'], 'test_value')

    def test_environ_iter(self):
        for key in environ:
            self.assertIsInstance(key, str)

    def test_environ_len(self):
        self.assertGreater(len(environ), 0)

if __name__ == '__main__':
    unittest.main()