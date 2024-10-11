import unittest
from youtube_dl.swfinterp import _u32, _read_int, StringClass, ByteArrayClass, TimerClass, TimerEventClass, _builtin_classes, undefined, _Multiname


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
        self.assertEqual(str(undefined), 'undefined')

    def test_multiname(self):
        multiname = _Multiname(1)
        self.assertEqual(multiname.kind, 1)
        self.assertEqual(repr(multiname), '[MULTINAME kind: 0x1]')

if __name__ == '__main__':
    unittest.main()