from ansible.utils.py3compat import _TextEnviron
import unittest
from ansible.utils.py3compat import *


class Test_TextEnviron(unittest.TestCase):
    def test_init(self):
        instance = _TextEnviron()
        self.assertEqual(instance._raw_environ, os.environ)
        self.assertEqual(instance.encoding, sys.getfilesystemencoding())

    def test_delitem(self):
        instance = _TextEnviron()
        del instance['key']
        self.assertEqual(instance._raw_environ, os.environ)

    def test_getitem(self):
        instance = _TextEnviron()
        result = instance['key']
        self.assertEqual(result, os.environ['key'])

    def test_setitem(self):
        instance = _TextEnviron()
        instance['key'] = b'value'
        self.assertEqual(instance._raw_environ['key'], to_bytes('value', encoding=instance.encoding, nonstring='strict', errors='surrogate_or_strict'))

    def test_iter(self):
        instance = _TextEnviron()
        result = instance.__iter__()
        self.assertEqual(result, os.environ.items())

    def test_len(self):
        instance = _TextEnviron()
        result = instance.__len__()
        self.assertEqual(result, len(os.environ))

class Testenviron(unittest.TestCase):
    def test_environ(self):
        result = environ
        self.assertEqual(result, _TextEnviron(encoding='utf-8'))

if __name__ == '__main__':
    unittest.main()