import unittest
from ansible.utils.py3compat import environ


class TestPy3Compat(unittest.TestCase):
    def test_environ_get(self):
        environ[b'TEST_KEY'] = b'test_value'
        self.assertEqual(environ.get('TEST_KEY'), 'test_value')

    def test_environ_setdefault(self):
        self.assertEqual(environ.setdefault('TEST_KEY', 'default_value'), b'default_value')
        self.assertEqual(environ.setdefault('TEST_KEY', 'new_value'), 'default_value')

    def test_environ_pop(self):
        environ['TEST_KEY'] = 'test_value'
        self.assertEqual(environ.pop('TEST_KEY'), 'test_value')
        with self.assertRaises(KeyError):
            environ.pop('TEST_KEY')

    def test_environ_del(self):
        environ['TEST_KEY'] = b'test_value'
        del environ['TEST_KEY']
        with self.assertRaises(KeyError):
            environ['TEST_KEY']

    def test_environ_update(self):
        environ.update({'TEST_KEY1': b'test_value1', 'TEST_KEY2': b'test_value2'})
        self.assertEqual(environ['TEST_KEY1'], 'test_value1')
        self.assertEqual(environ['TEST_KEY2'], 'test_value2')

    def test_environ_clear(self):
        environ[b'TEST_KEY'] = b'test_value'
        environ.clear()
        with self.assertRaises(KeyError):
            environ['TEST_KEY']

if __name__ == '__main__':
    unittest.main()