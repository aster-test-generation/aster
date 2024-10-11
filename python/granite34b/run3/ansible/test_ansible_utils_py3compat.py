import sys
import unittest
from ansible.utils.py3compat import _TextEnviron


class TestTextEnviron(unittest.TestCase):
    def setUp(self):
        self.environ = _TextEnviron()

    def test_init(self):
        self.assertEqual(self.environ.encoding, sys.getfilesystemencoding())

    def test_delitem(self):
        self.environ['key'] = b'value'
        del self.environ['key']
        self.assertNotIn('key', self.environ)

    def test_getitem(self):
        self.environ[b'key'] = b'value'
        self.assertEqual(self.environ['key'], 'value')

    def test_setitem(self):
        self.environ['key'] = b'value'
        self.assertEqual(self.environ._raw_environ['key'], b'value')

    def test_iter(self):
        self.environ[b'key'] = b'value'
        self.assertIn('key', self.environ)

    def test_len(self):
        self.environ['key'] = b'value'
        self.assertEqual(len(self.environ), 1)

if __name__ == '__main__':
    unittest.main()