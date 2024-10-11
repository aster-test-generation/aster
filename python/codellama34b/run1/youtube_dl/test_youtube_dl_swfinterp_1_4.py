from youtube_dl.swfinterp import _Multiname, _read_int
import unittest
from youtube_dl.swfinterp import *


class TestMultiname(unittest.TestCase):
    def test_init(self):
        result = _Multiname(0x00)
        self.assertEqual(result.kind, 0x00)

    def test_repr(self):
        result = _Multiname(0x00)
        self.assertEqual(result.__repr__(), '[MULTINAME kind: 0x00]')

class TestBuiltinClasses(unittest.TestCase):
    def test_StringClass(self):
        result = StringClass.name
        self.assertEqual(result, '(no name idx)')

    def test_ByteArrayClass(self):
        result = ByteArrayClass.name
        self.assertEqual(result, '(no name idx)')

    def test_TimerClass(self):
        result = TimerClass.name
        self.assertEqual(result, '(no name idx)')

    def test_TimerEventClass(self):
        result = TimerEventClass.name
        self.assertEqual(result, '(no name idx)')

class TestUndefined(unittest.TestCase):
    def test_undefined(self):
        result = undefined
        self.assertEqual(result, undefined)

if __name__ == '__main__':
    unittest.main()