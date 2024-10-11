import unittest
from ansible.utils.py3compat import _TextEnviron, environ


class Test_TextEnviron(unittest.TestCase):
    def test_init(self):
        instance = _TextEnviron()
        self.assertIsNotNone(instance)

    def test_init_with_env(self):
        env = {'FOO': 'bar'}
        instance = _TextEnviron(env)
        self.assertEqual(instance._raw_environ, env)

    def test_init_with_encoding(self):
        instance = _TextEnviron(encoding='latin-1')
        self.assertEqual(instance.encoding, 'latin-1')

    def test_delitem(self):
        instance = _TextEnviron()
        instance._raw_environ['FOO'] = 'bar'
        del instance['FOO']
        self.assertNotIn('FOO', instance._raw_environ)

    def test_getitem(self):
        instance = _TextEnviron()
        instance._raw_environ['FOO'] = 'bar'
        self.assertEqual(instance['FOO'], 'bar')

    def test_setitem(self):
        instance = _TextEnviron()
        instance['FOO'] = 'bar'
        self.assertIn('FOO', instance._raw_environ)

    def test_iter(self):
        instance = _TextEnviron()
        instance._raw_environ['FOO'] = 'bar'
        instance._raw_environ['BAZ'] = 'qux'
        self.assertEqual(list(instance), ['FOO', 'BAZ'])

    def test_len(self):
        instance = _TextEnviron()
        instance._raw_environ['FOO'] = 'bar'
        instance._raw_environ['BAZ'] = 'qux'
        self.assertEqual(len(instance), 2)

    def test_str_method(self):
        instance = _TextEnviron()
        self.assertEqual(str(instance), "_TextEnviron({'': ''})")

    def test_repr_method(self):
        instance = _TextEnviron()
        self.assertEqual(repr(instance), "_TextEnviron({'': ''})")

    def test_eq_method(self):
        instance1 = _TextEnviron()
        instance2 = _TextEnviron()
        self.assertEqual(instance1, instance2)

    def test_private_method__value_cache(self):
        instance = _TextEnviron()
        instance._value_cache['foo'] = 'bar'
        self.assertIn('foo', instance._value_cache)

class Test_environ(unittest.TestCase):
    def test_environ_instance(self):
        self.assertIsInstance(environ, _TextEnviron)

    def test_environ_encoding(self):
        self.assertEqual(environ.encoding, 'utf-8')

if __name__ == '__main__':
    unittest.main()