import unittest
from ansible.utils.py3compat import _TextEnviron, environ

class TestTextEnviron(unittest.TestCase):
    def test_init(self):
        env = _TextEnviron()
        self.assertIsInstance(env, _TextEnviron)
        self.assertEqual(env._raw_environ, os.environ)
        self.assertEqual(env._value_cache, {})
        self.assertEqual(env.encoding, sys.getfilesystemencoding())

    def test_init_with_env(self):
        env = _TextEnviron({'A': '1', 'B': '2'})
        self.assertEqual(env._raw_environ, {'A': '1', 'B': '2'})
        self.assertEqual(env._value_cache, {})

    def test_init_with_encoding(self):
        env = _TextEnviron(encoding='utf-16')
        self.assertEqual(env.encoding, 'utf-16')

    def test_delitem(self):
        env = _TextEnviron()
        env._raw_environ['A'] = '1'
        del env['A']
        self.assertNotIn('A', env._raw_environ)

    def test_getitem(self):
        env = _TextEnviron()
        env._raw_environ['A'] = '1'
        self.assertEqual(env['A'], '1')

    def test_setitem(self):
        env = _TextEnviron()
        env['A'] = '1'
        self.assertEqual(env._raw_environ['A'], '1')

    def test_iter(self):
        env = _TextEnviron()
        env._raw_environ['A'] = '1'
        env._raw_environ['B'] = '2'
        self.assertEqual(list(env), ['A', 'B'])

    def test_len(self):
        env = _TextEnviron()
        env._raw_environ['A'] = '1'
        env._raw_environ['B'] = '2'
        self.assertEqual(len(env), 2)

    def test_str(self):
        env = _TextEnviron()
        self.assertEqual(str(env), 'ansible.utils.py3compat._TextEnviron')

    def test_repr(self):
        env = _TextEnviron()
        self.assertEqual(repr(env), 'ansible.utils.py3compat._TextEnviron()')

if __name__ == '__main__':
    unittest.main()