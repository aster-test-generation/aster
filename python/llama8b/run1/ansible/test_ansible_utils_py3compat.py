from ansible.utils.py3compat import to_bytes
import sys
import os
import unittest
from ansible.utils.py3compat import _TextEnviron, environ
from ansible.utils.py3compat import _TextEnviron


class TestTextEnviron(unittest.TestCase):
    def test_init(self):
        env = _TextEnviron()
        self.assertIsInstance(env, _TextEnviron)
        self.assertEqual(env._raw_environ, os.environ)
        self.assertEqual(env._value_cache, {})
        self.assertEqual(env.encoding, sys.getfilesystemencoding())

    def test_delitem(self):
        env = _TextEnviron()
        key = 'TEST_KEY'
        env[key] = 'TEST_VALUE'
        del env[key]
        self.assertNotIn(key, env._raw_environ)

    def test_getitem(self):
        env = _TextEnviron()
        key = 'TEST_KEY'
        env[key] = 'TEST_VALUE'
        self.assertEqual(env[key], 'TEST_VALUE')

    def test_setitem(self):
        env = _TextEnviron()
        key = 'TEST_KEY'
        value = 'TEST_VALUE'
        env[key] = value
        self.assertEqual(env._raw_environ[key], to_bytes(value, encoding=env.encoding, nonstring='strict', errors='surrogate_or_strict'))

    def test_iter(self):
        env = _TextEnviron()
        keys = list(env._raw_environ.keys())
        self.assertIsInstance(keys, list)
        for key in keys:
            self.assertIn(key, env)

    def test_len(self):
        env = _TextEnviron()
        self.assertEqual(len(env), len(os.environ))

    def test_str_method(self):
        env = _TextEnviron()
        result = str(env)
        self.assertEqual(result, str(_TextEnviron()))

    def test_repr_method(self):
        env = _TextEnviron()
        result = repr(env)
        self.assertEqual(result, f"_TextEnviron({env._raw_environ})")

    def test_eq_method(self):
        env1 = _TextEnviron()
        env2 = _TextEnviron()
        self.assertEqual(env1, env2)

    def test_ne_method(self):
        env1 = _TextEnviron()
        env2 = _TextEnviron({'TEST_KEY': 'TEST_VALUE'})
        self.assertNotEqual(env1, env2)

class TestTextEnviron(unittest.TestCase):
    def test_init(self):
        env = _TextEnviron()
        self.assertIsInstance(env, _TextEnviron)

    def test_init_with_env(self):
        env = _TextEnviron({'key': 'value'})
        self.assertEqual(env._raw_environ, {'key': 'value'})

    def test_init_with_encoding(self):
        env = _TextEnviron(encoding='utf-16')
        self.assertEqual(env.encoding, 'utf-16')

    def test_delitem(self):
        env = _TextEnviron({'key': 'value'})
        del env['key']
        self.assertNotIn('key', env._raw_environ)

    def test_getitem(self):
        env = _TextEnviron({'key': 'value'})
        self.assertEqual(env['key'], 'value')

    def test_setitem(self):
        env = _TextEnviron()
        env['key'] = 'value'
        self.assertEqual(env._raw_environ, {'key': 'value'})

    def test_iter(self):
        env = _TextEnviron({'key1': 'value1', 'key2': 'value2'})
        self.assertEqual(list(env), ['key1', 'key2'])

    def test_len(self):
        env = _TextEnviron({'key1': 'value1', 'key2': 'value2'})
        self.assertEqual(len(env), 2)

    def test_str(self):
        env = _TextEnviron()
        self.assertEqual(str(env), 'ansible.utils.py3compat._TextEnviron')

    def test_repr(self):
        env = _TextEnviron()
        self.assertEqual(repr(env), 'ansible.utils.py3compat._TextEnviron()')

if __name__ == '__main__':
    unittest.main()