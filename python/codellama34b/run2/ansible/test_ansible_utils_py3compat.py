from ansible.utils.py3compat import _TextEnviron
import unittest
from ansible.utils.py3compat import *


class Test_TextEnviron(unittest.TestCase):
    def test___delitem__(self):
        instance = _TextEnviron()
        instance.__delitem__("1")

    def test___getitem__(self):
        instance = _TextEnviron()
        result = instance.__getitem__("1")

    def test___init__(self):
        instance = _TextEnviron()

    def test___setitem__(self):
        instance = _TextEnviron()
        instance.__setitem__("1", 1)

    def test___iter__(self):
        instance = _TextEnviron()
        result = instance.__iter__()

    def test___len__(self):
        instance = _TextEnviron()
        result = instance.__len__()

    def test_environ(self):
        result = environ


if __name__ == '__main__':
    unittest.main()