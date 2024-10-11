import unittest
from youtube_dl.swfinterp import _u32, _read_int, StringClass, ByteArrayClass, TimerClass, TimerEventClass, _builtin_classes, undefined, _ScopeDict


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
        string = StringClass()
        self.assertEqual(string.name, '(no name idx)')
        self.assertEqual(string.super_name, 'String')

    def test_byte_array_class(self):
        byte_array = ByteArrayClass()
        self.assertEqual(byte_array.name, '(no name idx)')
        self.assertEqual(byte_array.super_name, 'ByteArray')

    def test_timer_class(self):
        timer = TimerClass()
        self.assertEqual(timer.name, '(no name idx)')
        self.assertEqual(timer.super_name, 'Timer')

    def test_timer_event_class(self):
        timer_event = TimerEventClass()
        self.assertEqual(timer_event.name, '(no name idx)')
        self.assertEqual(timer_event.super_name, 'TimerEvent')
        self.assertEqual(timer_event.event_type, 'timer')

    def test_builtin_classes(self):
        self.assertEqual(_builtin_classes[StringClass.name], StringClass)
        self.assertEqual(_builtin_classes[ByteArrayClass.name], ByteArrayClass)
        self.assertEqual(_builtin_classes[TimerClass.name], TimerClass)
        self.assertEqual(_builtin_classes[TimerEventClass.name], TimerEventClass)

    def test_undefined(self):
        self.assertEqual(str(undefined), 'undefined')

    def test_scope_dict(self):
        avm_class = _AVMClass('(no name idx)', 'String')
        scope = _ScopeDict(avm_class)
        self.assertEqual(scope.avm_class, avm_class)
        self.assertEqual(str(scope), '(no name idx)__Scope({})')

if __name__ == '__main__':
    unittest.main()