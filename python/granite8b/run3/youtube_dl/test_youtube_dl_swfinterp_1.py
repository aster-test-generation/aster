import unittest
from youtube_dl.swfinterp import _read_int


class TestSWFInterp(unittest.TestCase):
    def test_u32(self):
        self.assertEqual(_u32(b'\x00\x01\x02\x03'), 0x03020100)

    def test_string_class(self):
        string_class = StringClass()
        self.assertEqual(string_class.name, '(no name idx)')
        self.assertEqual(string_class.base, '(no base idx)')
        self.assertEqual(string_class.super, '(no super idx)')
        self.assertEqual(string_class.interface, '(no interface idx)')
        self.assertEqual(string_class.cinit, '(no cinit idx)')
        self.assertEqual(string_class.iinit, '(no iinit idx)')
        self.assertEqual(string_class.traits, '(no traits idx)')

    def test_byte_array_class(self):
        byte_array_class = ByteArrayClass()
        self.assertEqual(byte_array_class.name, '(no name idx)')
        self.assertEqual(byte_array_class.base, '(no base idx)')
        self.assertEqual(byte_array_class.super, '(no super idx)')
        self.assertEqual(byte_array_class.interface, '(no interface idx)')
        self.assertEqual(byte_array_class.cinit, '(no cinit idx)')
        self.assertEqual(byte_array_class.iinit, '(no iinit idx)')
        self.assertEqual(byte_array_class.traits, '(no traits idx)')

    def test_timer_class(self):
        timer_class = TimerClass()
        self.assertEqual(timer_class.name, '(no name idx)')
        self.assertEqual(timer_class.base, '(no base idx)')
        self.assertEqual(timer_class.super, '(no super idx)')
        self.assertEqual(timer_class.interface, '(no interface idx)')
        self.assertEqual(timer_class.cinit, '(no cinit idx)')
        self.assertEqual(timer_class.iinit, '(no iinit idx)')
        self.assertEqual(timer_class.traits, '(no traits idx)')

    def test_timer_event_class(self):
        timer_event_class = TimerEventClass()
        self.assertEqual(timer_event_class.name, '(no name idx)')
        self.assertEqual(timer_event_class.base, '(no base idx)')
        self.assertEqual(timer_event_class.super, '(no super idx)')
        self.assertEqual(timer_event_class.interface, '(no interface idx)')
        self.assertEqual(timer_event_class.cinit, '(no cinit idx)')
        self.assertEqual(timer_event_class.iinit, '(no iinit idx)')
        self.assertEqual(timer_event_class.traits, '(no traits idx)')

    def test_undefined(self):
        undefined = _Undefined()
        self.assertFalse(undefined)
        self.assertEqual(hash(undefined), 0)
        self.assertEqual(str(undefined), 'undefined')

if __name__ == '__main__':
    unittest.main()