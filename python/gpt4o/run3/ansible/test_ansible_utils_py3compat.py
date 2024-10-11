import unittest
import os
from ansible.utils.py3compat import _TextEnviron, environ
from ansible.module_utils.six import PY3
from ansible.module_utils._text import to_bytes, to_text


class TestTextEnviron(unittest.TestCase):
    def setUp(self):
        self.env = {'TEST_KEY': 'TEST_VALUE'}
        self.instance = _TextEnviron(env=self.env, encoding='utf-8')

    def test_init(self):
        self.assertEqual(self.instance._raw_environ, self.env)
        self.assertEqual(self.instance.encoding, 'utf-8')

    def test_delitem(self):
        del self.instance['TEST_KEY']
        self.assertNotIn('TEST_KEY', self.instance._raw_environ)

    def test_getitem(self):
        result = self.instance['TEST_KEY']
        self.assertEqual(result, 'TEST_VALUE')

    def test_setitem(self):
        self.instance['NEW_KEY'] = 'NEW_VALUE'
        self.assertEqual(self.instance._raw_environ['NEW_KEY'], to_bytes('NEW_VALUE', encoding='utf-8'))

    def test_iter(self):
        result = list(iter(self.instance))
        self.assertEqual(result, list(self.env.keys()))

    def test_len(self):
        result = len(self.instance)
        self.assertEqual(result, len(self.env))

    def test_getitem_with_cache(self):
        if not PY3:
            self.instance._value_cache['TEST_VALUE'] = 'CACHED_VALUE'
            result = self.instance['TEST_KEY']
            self.assertEqual(result, 'CACHED_VALUE')

    def test_getitem_without_cache(self):
        if not PY3:
            del self.instance._value_cache['TEST_VALUE']
            result = self.instance['TEST_KEY']
            self.assertEqual(result, to_text('TEST_VALUE', encoding='utf-8', nonstring='passthru', errors='surrogate_or_strict'))

if __name__ == '__main__':
    unittest.main()