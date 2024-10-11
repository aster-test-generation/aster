from __future__ import unicode_literals
import collections
import io
import zlib
from . import compat_str, compat_struct_unpack
from .utils import ExtractorError
import unittest
from youtube_dl.swfinterp import _u32, _read_int, StringClass, ByteArrayClass, TimerClass, TimerEventClass, _builtin_classes, undefined

_u32 = _read_int
StringClass = _AVMClass('(no name idx)', 'String')
ByteArrayClass = _AVMClass('(no name idx)', 'ByteArray')
TimerClass = _AVMClass('(no name idx)', 'Timer')
TimerEventClass = _AVMClass('(no name idx)', 'TimerEvent', {'TIMER': 'timer'})
_builtin_classes = {StringClass.name: StringClass, ByteArrayClass.name: ByteArrayClass, TimerClass.name: TimerClass, TimerEventClass.name: TimerEventClass}
undefined = _Undefined()
class _Undefined(object):
    def __init__(self):
        pass
    def __bool__(self):
        return False
    def __hash__(self):
        return 0


class TestSwfInterp(unittest.TestCase):
    def test_u32(self):
        self.assertEqual(_u32(b'\x00\x00\x00\x01'), 1)
        self.assertEqual(_u32(b'\x00\x00\x01\x00'), 256)
        self.assertEqual(_u32(b'\x00\x01\x00\x00'), 65536)
        self.assertEqual(_u32(b'\x01\x00\x00\x00'), 16777216)

    def test_read_int(self):
        self.assertEqual(_read_int(b'\x00\x00\x00\x01'), 1)
        self.assertEqual(_read_int(b'\x00\x00\x01\x00'), 256)
        self.assertEqual(_read_int(b'\x00\x01\x00\x00'), 65536)
        self.assertEqual(_read_int(b'\x01\x00\x00\x00'), 16777216)

    def test_string_class(self):
        string_class = StringClass()
        self.assertEqual(string_class.name, '(no name idx)')
        self.assertEqual(string_class.super_name, 'String')

    def test_byte_array_class(self):
        byte_array_class = ByteArrayClass()
        self.assertEqual(byte_array_class.name, '(no name idx)')
        self.assertEqual(byte_array_class.super_name, 'ByteArray')

    def test_timer_class(self):
        timer_class = TimerClass()
        self.assertEqual(timer_class.name, '(no name idx)')
        self.assertEqual(timer_class.super_name, 'Timer')

    def test_timer_event_class(self):
        timer_event_class = TimerEventClass()
        self.assertEqual(timer_event_class.name, '(no name idx)')
        self.assertEqual(timer_event_class.super_name, 'TimerEvent')
        self.assertEqual(timer_event_class.event_type, 'timer')

    def test_builtin_classes(self):
        self.assertEqual(_builtin_classes[StringClass.name], StringClass)
        self.assertEqual(_builtin_classes[ByteArrayClass.name], ByteArrayClass)
        self.assertEqual(_builtin_classes[TimerClass.name], TimerClass)
        self.assertEqual(_builtin_classes[TimerEventClass.name], TimerEventClass)

    def test_undefined(self):
        self.assertFalse(undefined)
        self.assertEqual(hash(undefined), 0)
        self.assertEqual(str(undefined), 'undefined')

if __name__ == '__main__':
    unittest.main()