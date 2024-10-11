import unittest
from youtube_dl.swfinterp import Multiname, Undefined, AVMClass, builtin_classes, u32, StringClass, ByteArrayClass, TimerClass, TimerEventClas


class TestMultiname(unittest.TestCase):
    def test_init(self):
        multiname = _Multiname(0x1234)
        self.assertEqual(multiname.kind, 0x1234)

    def test_repr(self):
        multiname = _Multiname(0x1234)
        self.assertEqual(repr(multiname), '[MULTINAME kind: 0x1234]')

class TestUndefined(unittest.TestCase):
    def test_init(self):
        undefined = _Undefined()
        self.assertIsInstance(undefined, _Undefined)

    def test_repr(self):
        undefined = _Undefined()
        self.assertEqual(repr(undefined), '<Undefined>')

class TestAVMClass(unittest.TestCase):
    def test_init(self):
        avm_class = _AVMClass('(no name idx)', 'TestClass')
        self.assertEqual(avm_class.name, 'TestClass')

    def test_name(self):
        avm_class = _AVMClass('(no name idx)', 'TestClass')
        self.assertEqual(avm_class.name, 'TestClass')

class TestBuiltinClasses(unittest.TestCase):
    def test_builtin_classes(self):
        self.assertIn('String', _builtin_classes)
        self.assertIn('ByteArray', _builtin_classes)
        self.assertIn('Timer', _builtin_classes)
        self.assertIn('TimerEvent', _builtin_classes)

class TestU32(unittest.TestCase):
    def test_u32(self):
        self.assertEqual(_u32(b'\x01\x02\x03\x04'), 0x01020304)

class TestStringClass(unittest.TestCase):
    def test_init(self):
        string_class = StringClass()
        self.assertIsInstance(string_class, _AVMClass)

class TestByteArrayClass(unittest.TestCase):
    def test_init(self):
        byte_array_class = ByteArrayClass()
        self.assertIsInstance(byte_array_class, _AVMClass)

class TestTimerClass(unittest.TestCase):
    def test_init(self):
        timer_class = TimerClass()
        self.assertIsInstance(timer_class, _AVMClass)

class TestTimerEventClass(unittest.TestCase):
    def test_init(self):
        timer_event_class = TimerEventClass()
        self.assertIsInstance(timer_event_class, _AVMClass)

if __name__ == '__main__':
    unittest.main()