import unittest
from ansible.utils.py3compat import _TextEnviron, environ


class TestTextEnviron(unittest.TestCase):
    def test_environ_is_mutable_mapping(self):
        self.assertIsInstance(environ, dict)

    def test_environ_can_be_accessed_as_dict(self):
        self.assertIsInstance(dict(environ), dict)

    def test_environ_can_be_iterated_over(self):
        self.assertIsInstance(iter(environ), type(iter(environ)))

    def test_environ_can_be_checked_for_length(self):
        self.assertIsInstance(len(environ), int)

    def test_environ_can_get_item(self):
        self.assertEqual(environ['PATH'], os.environ['PATH'])

    def test_environ_can_set_item(self):
        key = 'TEST_ENV_VAR'
        value = 'test_value'
        environ[key.encode()] = value.encode()
        self.assertEqual(environ[key], value)
        del environ[key]

    def test_environ_can_delete_item(self):
        key = 'TEST_ENV_VAR'
        value = 'test_value'
        environ[key.encode('ascii')] = value.encode('ascii')
        del environ[key]
        with self.assertRaises(KeyError):
            environ[key]

    def test_environ_can_be_checked_for_item(self):
        key = 'PATH'
        self.assertIn(key, environ)

    def test_environ_can_be_checked_for_not_item(self):
        key = 'NOT_EXISTS'
        self.assertNotIn(key, environ)

if __name__ == '__main__':
    unittest.main()