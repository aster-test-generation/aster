import unittest
from youtube_dl.swfinterp import _read_int


class TestSwfInterp(unittest.TestCase):
    def test_u32(self):
        self.assertEqual(_u32(b'\x01\x02\x03\x04'), 16909060)

    def test_read_int(self):
        self.assertEqual(_read_int(b'\x01\x02\x03\x04'), 16909060)

    def test_string_class(self):
        string = StringClass()
        self.assertEqual(string.name, '(no name idx)')
        self.assertEqual(string.namespace, 'String')

    def test_byte_array_class(self):
        byte_array = ByteArrayClass()
        self.assertEqual(byte_array.name, '(no name idx)')
        self.assertEqual(byte_array.namespace, 'ByteArray')

    def test_timer_class(self):
        timer = TimerClass()
        self.assertEqual(timer.name, '(no name idx)')
        self.assertEqual(timer.namespace, 'Timer')

    def test_timer_event_class(self):
        timer_event = TimerEventClass()
        self.assertEqual(timer_event.name, '(no name idx)')
        self.assertEqual(timer_event.namespace, 'TimerEvent')
        self.assertEqual(timer_event.events, {'TIMER': 'timer'})

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