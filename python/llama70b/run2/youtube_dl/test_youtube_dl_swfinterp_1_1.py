import unittest
from youtube_dl.swfinterp import AVMClass as _AVMClass, AVMClass_Object as _AVMClass_Object, builtin_classes as _builtin_classes, undefined, u32 as _u32, StringClass, ByteArrayClass, TimerClass, TimerEventClas


class Test_AVMClass(unittest.TestCase):
    def test_init(self):
        avm_class = _AVMClass('(no name idx)', 'TestClass')
        self.assertEqual(avm_class.name, 'TestClass')

    def test_name(self):
        avm_class = _AVMClass('(no name idx)', 'TestClass')
        self.assertEqual(avm_class.name, 'TestClass')

class Test_AVMClass_Object(unittest.TestCase):
    def test_init(self):
        avm_class = _AVMClass('(no name idx)', 'TestClass')
        obj = _AVMClass_Object(avm_class)
        self.assertEqual(obj.avm_class, avm_class)

    def test_repr(self):
        avm_class = _AVMClass('(no name idx)', 'TestClass')
        obj = _AVMClass_Object(avm_class)
        self.assertEqual(obj.__repr__(), '%s' % avm_class.name)

class Test_builtin_classes(unittest.TestCase):
    def test_builtin_classes(self):
        self.assertIn('String', _builtin_classes)
        self.assertIn('ByteArray', _builtin_classes)
        self.assertIn('Timer', _builtin_classes)
        self.assertIn('TimerEvent', _builtin_classes)

class Test_undefined(unittest.TestCase):
    def test_undefined(self):
        self.assertIsInstance(undefined, _Undefined)

class Test_u32(unittest.TestCase):
    def test_u32(self):
        # assuming _read_int is implemented correctly
        self.assertEqual(_u32(b'\x01\x00\x00\x00'), 1)

class Test_StringClass(unittest.TestCase):
    def test_init(self):
        string_class = StringClass
        self.assertEqual(string_class.name, 'String')

class Test_ByteArrayClass(unittest.TestCase):
    def test_init(self):
        byte_array_class = ByteArrayClass
        self.assertEqual(byte_array_class.name, 'ByteArray')

class Test_TimerClass(unittest.TestCase):
    def test_init(self):
        timer_class = TimerClass
        self.assertEqual(timer_class.name, 'Timer')

class Test_TimerEventClass(unittest.TestCase):
    def test_init(self):
        timer_event_class = TimerEventClass
        self.assertEqual(timer_event_class.name, 'TimerEvent')

if __name__ == '__main__':
    unittest.main()