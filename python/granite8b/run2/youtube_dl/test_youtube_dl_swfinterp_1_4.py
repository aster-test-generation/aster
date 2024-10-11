import unittest
from youtube_dl.swfinterp import *


class TestMultiname(unittest.TestCase):
    def test_multiname_kind(self):
        multiname = _Multiname(0x07)
        self.assertEqual(multiname.kind, 0x07)

class TestStringClass(unittest.TestCase):
    def test_string_class(self):
        string_class = StringClass()
        self.assertEqual(string_class.name, '(no name idx)')
        self.assertEqual(string_class.super_name, ' flash.utils. flash.display. flash.events. Object')

class TestByteArrayClass(unittest.TestCase):
    def test_byte_array_class(self):
        byte_array_class = ByteArrayClass()
        self.assertEqual(byte_array_class.name, '(no name idx)')
        self.assertEqual(byte_array_class.super_name, ' flash.utils. flash.display. flash.events. Object')

class TestTimerClass(unittest.TestCase):
    def test_timer_class(self):
        timer_class = TimerClass()
        self.assertEqual(timer_class.name, '(no name idx)')
        self.assertEqual(timer_class.super_name, ' flash.events. EventDispatcher')

class TestTimerEventClass(unittest.TestCase):
    def test_timer_event_class(self):
        timer_event_class = TimerEventClass()
        self.assertEqual(timer_event_class.name, '(no name idx)')
        self.assertEqual(timer_event_class.super_name, ' flash.events. Event')

class TestUndefined(unittest.TestCase):
    def test_undefined(self):
        self.assertIsInstance(undefined, _Undefined)

if __name__ == '__main__':
    unittest.main()