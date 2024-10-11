import unittest
from youtube_dl.swfinterp import _read_int


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

    def test_scope_dict(self):
        scope = _ScopeDict(StringClass)
        scope['key'] = 'value'
        self.assertEqual(scope['key'], 'value')
        self.assertEqual(repr(scope), 'String__Scope({\'key\': \'value\'})')

    def test_undefined(self):
        self.assertEqual(str(undefined), 'undefined')
        self.assertEqual(repr(undefined), 'undefined')
        self.assertEqual(undefined, undefined)

    def test_string_class(self):
        string = StringClass()
        self.assertEqual(str(string), 'String')
        self.assertEqual(repr(string), 'String()')

    def test_byte_array_class(self):
        byte_array = ByteArrayClass()
        self.assertEqual(str(byte_array), 'ByteArray')
        self.assertEqual(repr(byte_array), 'ByteArray()')

    def test_timer_class(self):
        timer = TimerClass()
        self.assertEqual(str(timer), 'Timer')
        self.assertEqual(repr(timer), 'Timer()')

    def test_timer_event_class(self):
        timer_event = TimerEventClass()
        self.assertEqual(str(timer_event), 'TimerEvent')
        self.assertEqual(repr(timer_event), 'TimerEvent()')
        self.assertEqual(timer_event.type, 'timer')

    def test_builtin_classes(self):
        self.assertEqual(_builtin_classes[StringClass.name], StringClass)
        self.assertEqual(_builtin_classes[ByteArrayClass.name], ByteArrayClass)
        self.assertEqual(_builtin_classes[TimerClass.name], TimerClass)
        self.assertEqual(_builtin_classes[TimerEventClass.name], TimerEventClass)

if __name__ == '__main__':
    unittest.main()