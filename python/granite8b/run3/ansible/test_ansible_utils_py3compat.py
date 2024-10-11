import unittest
from ansible.utils.py3compat import _TextEnviron, environ
from ansible.utils.py3compat import environ


class TestTextEnviron(unittest.TestCase):
    def test_environ_get(self):
        environ[b'TEST_KEY'] = b'TEST_VALUE'
        self.assertEqual(environ['TEST_KEY'], 'TEST_VALUE')

    def test_environ_set(self):
        environ[b'TEST_KEY'] = b'TEST_VALUE'
        self.assertEqual(environ['TEST_KEY'], 'TEST_VALUE')

    def test_environ_del(self):
        environ[b'TEST_KEY'] = b'TEST_VALUE'
        del environ['TEST_KEY']
        self.assertNotIn('TEST_KEY', environ)

    def test_environ_contains(self):
        environ[b'TEST_KEY'] = b'TEST_VALUE'
        self.assertIn('TEST_KEY', environ)

    def test_environ_iter(self):
        environ[b'TEST_KEY_1'] = b'TEST_VALUE_1'
        environ['TEST_KEY_2'] = 'TEST_VALUE_2'
        self.assertIn('TEST_KEY_1', environ)
        self.assertIn('TEST_KEY_2', environ)

    def test_environ_len(self):
        environ['TEST_KEY_1'] = b'TEST_VALUE_1'
        environ['TEST_KEY_2'] = 'TEST_VALUE_2'
        self.assertEqual(len(environ), 2)

class TestEnviron(unittest.TestCase):
    def test_environ_get(self):
        result = environ.get('PATH')
        self.assertIsNotNone(result)

    def test_environ_set(self):
        environ['TEST_VAR'] = 'test_value'
        result = environ['TEST_VAR']
        self.assertEqual(result, 'test_value')

    def test_environ_del(self):
        environ['TEST_VAR'] = 'test_value'
        del environ['TEST_VAR']
        result = environ.get('TEST_VAR')
        self.assertIsNone(result)

    def test_environ_contains(self):
        self.assertTrue('PATH' in environ)

    def test_environ_iter(self):
        result = [key for key in environ]
        self.assertIn('PATH', result)

    def test_environ_len(self):
        result = len(environ)
        self.assertGreater(result, 0)

    def test_environ_repr(self):
        result = repr(environ)
        self.assertIn('ansible.utils.py3compat._TextEnviron', result)

    def test_environ_str(self):
        result = str(environ)
        self.assertIn('ansible.utils.py3compat._TextEnviron', result)

if __name__ == '__main__':
    unittest.main()