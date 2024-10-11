from ansible.utils.py3compat import _TextEnviron
import unittest
from ansible.utils.py3compat import *
from ansible.utils.py3compat import environ


class TestAnsibleUtilsPy3Compat(unittest.TestCase):
    def test_text_environ_init(self):
        import os
        encoding = sys.getfilesystemencoding()
        text_environ = _TextEnviron(env, encoding)
        self.assertEqual(text_environ._raw_environ, env)
        self.assertEqual(text_environ.encoding, encoding)

    def test_text_environ_delitem(self):
        text_environ = _TextEnviron()
        key = 'TEST_KEY'
        text_environ[key] = b'TEST_VALUE'
        del text_environ[key]
        self.assertNotIn(key, text_environ)

    def test_text_environ_getitem(self):
        text_environ = _TextEnviron()
        key = 'TEST_KEY'
        value = 'TEST_VALUE'
        text_environ[key.decode('ascii')] = value.decode('ascii')
        self.assertEqual(text_environ[key], value)

    def test_text_environ_setitem(self):
        text_environ = _TextEnviron()
        key = 'TEST_KEY'
        value = 'TEST_VALUE'
        text_environ[key.decode('utf-8')] = value.decode('utf-8')
        self.assertEqual(text_environ._raw_environ[key], to_bytes(value, encoding=text_environ.encoding, nonstring='strict', errors='surrogate_or_strict'))

    def test_text_environ_iter(self):
        text_environ = _TextEnviron()
        key = 'TEST_KEY'
        value = 'TEST_VALUE'
        text_environ[key.decode('utf-8')] = value.decode('utf-8')
        self.assertIn(key, text_environ)

    def test_text_environ_len(self):
        text_environ = _TextEnviron()
        key = 'TEST_KEY'
        value = 'TEST_VALUE'
        text_environ[key.decode('utf-8')] = value.decode('utf-8')
        self.assertEqual(len(text_environ), 1)

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