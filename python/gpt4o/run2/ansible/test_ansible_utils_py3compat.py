import unittest
import os
from ansible.utils.py3compat import _TextEnviron, environ
from ansible.module_utils.six import PY3
from ansible.module_utils._text import to_bytes, to_text


class TestTextEnviron(unittest.TestCase):
    def setUp(self):
        self.env = {'TEST_KEY': 'TEST_VALUE'}
        self.text_environ = _TextEnviron(env=self.env, encoding='utf-8')

    def test_init(self):
        self.assertEqual(self.text_environ._raw_environ, self.env)
        self.assertEqual(self.text_environ.encoding, 'utf-8')

    def test_delitem(self):
        del self.text_environ['TEST_KEY']
        self.assertNotIn('TEST_KEY', self.text_environ._raw_environ)

    def test_getitem(self):
        result = self.text_environ['TEST_KEY']
        self.assertEqual(result, 'TEST_VALUE')

    def test_setitem(self):
        self.text_environ['NEW_KEY'] = 'NEW_VALUE'
        self.assertEqual(self.text_environ._raw_environ['NEW_KEY'], to_bytes('NEW_VALUE', encoding='utf-8'))

    def test_iter(self):
        keys = list(iter(self.text_environ))
        self.assertIn('TEST_KEY', keys)

    def test_len(self):
        length = len(self.text_environ)
        self.assertEqual(length, len(self.env))

    def test_getitem_cache(self):
        if not PY3:
            self.text_environ['TEST_KEY']
            self.assertIn('TEST_VALUE', self.text_environ._value_cache)

    def test_setitem_nonstring(self):
        with self.assertRaises(TypeError):
            self.text_environ['NEW_KEY'] = 123

    def test_delitem_nonexistent_key(self):
        with self.assertRaises(KeyError):
            del self.text_environ['NON_EXISTENT_KEY']

    def test_getitem_nonexistent_key(self):
        with self.assertRaises(KeyError):
            _ = self.text_environ['NON_EXISTENT_KEY']

if __name__ == '__main__':
    unittest.main()