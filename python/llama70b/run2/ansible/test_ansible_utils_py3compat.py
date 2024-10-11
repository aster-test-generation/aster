import unittest
from ansible.utils.py3compat import _TextEnviron, environ


class Test_TextEnviron(unittest.TestCase):
    def test_init(self):
        instance = _TextEnviron()
        self.assertIsNotNone(instance)

    def test_init_with_env(self):
        env = {'KEY': 'VALUE'}
        instance = _TextEnviron(env)
        self.assertEqual(instance._raw_environ, env)

    def test_init_with_encoding(self):
        instance = _TextEnviron(encoding='latin-1')
        self.assertEqual(instance.encoding, 'latin-1')

    def test_delitem(self):
        instance = _TextEnviron()
        instance._raw_environ['KEY'] = 'VALUE'
        del instance['KEY']
        self.assertNotIn('KEY', instance._raw_environ)

    def test_getitem(self):
        instance = _TextEnviron()
        instance._raw_environ['KEY'] = 'VALUE'
        self.assertEqual(instance['KEY'], 'VALUE')

    def test_setitem(self):
        instance = _TextEnviron()
        instance['KEY'] = 'VALUE'
        self.assertIn('KEY', instance._raw_environ)

    def test_iter(self):
        instance = _TextEnviron()
        instance._raw_environ['KEY1'] = 'VALUE1'
        instance._raw_environ['KEY2'] = 'VALUE2'
        self.assertEqual(list(instance), ['KEY1', 'KEY2'])

    def test_len(self):
        instance = _TextEnviron()
        instance._raw_environ['KEY1'] = 'VALUE1'
        instance._raw_environ['KEY2'] = 'VALUE2'
        self.assertEqual(len(instance), 2)

    def test_private__value_cache(self):
        instance = _TextEnviron()
        instance._raw_environ['KEY'] = 'VALUE'
        instance._value_cache['VALUE'] = 'Cached VALUE'
        self.assertIn('VALUE', instance._value_cache)

    def test_magic_str(self):
        instance = _TextEnviron()
        self.assertIsInstance(str(instance), str)

    def test_magic_repr(self):
        instance = _TextEnviron()
        self.assertIsInstance(repr(instance), str)

class Test_environ(unittest.TestCase):
    def test_environ_instance(self):
        self.assertIsInstance(environ, _TextEnviron)

    def test_environ_encoding(self):
        self.assertEqual(environ.encoding, 'utf-8')

if __name__ == '__main__':
    unittest.main()