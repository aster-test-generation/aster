import unittest
from ansible.utils.py3compat import _TextEnviron


class TestTextEnviron(unittest.TestCase):
    def test_init(self):
        env = _TextEnviron()
        self.assertIsInstance(env, _TextEnviron)

    def test_init_with_env(self):
        env = _TextEnviron({'key': 'value'})
        self.assertEqual(env._raw_environ, {'key': 'value'})

    def test_init_with_encoding(self):
        env = _TextEnviron(encoding='utf-8')
        self.assertEqual(env.encoding, 'utf-8')

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
        self.assertEqual(str(env), str(_TextEnviron()))

    def test_repr(self):
        env = _TextEnviron()
        self.assertEqual(repr(env), 'ansible.utils.py3compat._TextEnviron()')

    def test_eq(self):
        env1 = _TextEnviron({'key': 'value'})
        env2 = _TextEnviron({'key': 'value'})
        self.assertEqual(env1, env2)

if __name__ == '__main__':
    unittest.main()