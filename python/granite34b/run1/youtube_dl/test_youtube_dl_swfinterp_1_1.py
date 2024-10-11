import unittest
from youtube_dl.swfinterp import _u32, _read_int, StringClass, ByteArrayClass, TimerClass, TimerEventClass, _builtin_classes, undefined, _AVMClass_Object, _read_int


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
        string_obj = StringClass()
        self.assertEqual(string_obj.name, '(no name idx)')
        self.assertEqual(string_obj.super_name, 'String')

    def test_byte_array_class(self):
        byte_array_obj = ByteArrayClass()
        self.assertEqual(byte_array_obj.name, '(no name idx)')
        self.assertEqual(byte_array_obj.super_name, 'ByteArray')

    def test_timer_class(self):
        timer_obj = TimerClass()
        self.assertEqual(timer_obj.name, '(no name idx)')
        self.assertEqual(timer_obj.super_name, 'Timer')

    def test_timer_event_class(self):
        timer_event_obj = TimerEventClass()
        self.assertEqual(timer_event_obj.name, '(no name idx)')
        self.assertEqual(timer_event_obj.super_name, 'TimerEvent')
        self.assertEqual(timer_event_obj.event_type, 'timer')

    def test_builtin_classes(self):
        self.assertEqual(_builtin_classes[StringClass.name], StringClass)
        self.assertEqual(_builtin_classes[ByteArrayClass.name], ByteArrayClass)
        self.assertEqual(_builtin_classes[TimerClass.name], TimerClass)
        self.assertEqual(_builtin_classes[TimerEventClass.name], TimerEventClass)

    def test_undefined(self):
        self.assertEqual(str(undefined), 'undefined')

    def test_avm_class_object(self):
        avm_class_obj = _AVMClass_Object(StringClass)
        self.assertEqual(avm_class_obj.avm_class, StringClass)
        self.assertEqual(repr(avm_class_obj), "StringClass()")

if __name__ == '__main__':
    unittest.main()