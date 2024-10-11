import unittest
from youtube_dl.swfinterp import _read_int


class Test_Multiname(unittest.TestCase):
    def test_multiname(self):
        multiname = _Multiname(0)
        self.assertEqual(repr(multiname), '[MULTINAME kind: 0x0]')

class Test_StringClass(unittest.TestCase):
    def test_string_class(self):
        string_class = StringClass()
        self.assertEqual(string_class.name, '(no name idx)')

class Test_ByteArrayClass(unittest.TestCase):
    def test_byte_array_class(self):
        byte_array_class = ByteArrayClass()
        self.assertEqual(byte_array_class.name, '(no name idx)')

class Test_TimerClass(unittest.TestCase):
    def test_timer_class(self):
        timer_class = TimerClass()
        self.assertEqual(timer_class.name, '(no name idx)')

class Test_TimerEventClass(unittest.TestCase):
    def test_timer_event_class(self):
        timer_event_class = TimerEventClass()
        self.assertEqual(timer_event_class.name, '(no name idx)')

class Test_Undefined(unittest.TestCase):
    def test_undefined(self):
        self.assertEqual(undefined, _Undefined())

if __name__ == '__main__':
    unittest.main()