import unittest
from youtube_dl.swfinterp import *


class TestSWFInterp(unittest.TestCase):
    def test_u32(self):
        self.assertEqual(_u32(b'\x00\x01\x02\x03'), 0x03020100)

    def test_string_class(self):
        string_class = _AVMClass('(no name idx)', 'String')
        self.assertEqual(string_class.name, 'String')
        self.assertEqual(string_class.base, None)
        self.assertEqual(string_class.methods, {})
        self.assertEqual(string_class.static_methods, {})
        self.assertEqual(string_class.instance_methods, {})

    def test_byte_array_class(self):
        byte_array_class = _AVMClass('(no name idx)', 'ByteArray')
        self.assertEqual(byte_array_class.name, 'ByteArray')
        self.assertEqual(byte_array_class.base, None)
        self.assertEqual(byte_array_class.methods, {})
        self.assertEqual(byte_array_class.static_methods, {})
        self.assertEqual(byte_array_class.instance_methods, {})

    def test_timer_class(self):
        timer_class = _AVMClass('(no name idx)', 'Timer')
        self.assertEqual(timer_class.name, 'Timer')
        self.assertEqual(timer_class.base, None)
        self.assertEqual(timer_class.methods, {})
        self.assertEqual(timer_class.static_methods, {})
        self.assertEqual(timer_class.instance_methods, {})

    def test_timer_event_class(self):
        timer_event_class = _AVMClass('(no name idx)', 'TimerEvent', {'TIMER': 'timer'})
        self.assertEqual(timer_event_class.name, 'TimerEvent')
        self.assertEqual(timer_event_class.base, None)
        self.assertEqual(timer_event_class.methods, {})
        self.assertEqual(timer_event_class.static_methods, {})
        self.assertEqual(timer_event_class.instance_methods, {})

    def test_undefined(self):
        self.assertFalse(bool(undefined))
        self.assertEqual(hash(undefined), 0)
        self.assertEqual(str(undefined), 'undefined')

if __name__ == '__main__':
    unittest.main()