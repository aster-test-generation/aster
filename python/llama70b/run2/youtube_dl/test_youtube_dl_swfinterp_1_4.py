import unittest
from youtube_dl.swfinterp import (_Multiname, _AVMClass, _Undefined, _u32, StringClass, ByteArrayClass, TimerClass, TimerEventClass, _builtin_classes)

class TestMultiname(unittest.TestCase):

    def test_init(self):
        multiname = _Multiname(0x1234)
        self.assertEqual(multiname.kind, 0x1234)

    def test_repr(self):
        multiname = _Multiname(0x1234)
        self.assertEqual(repr(multiname), '[MULTINAME kind: 0x1234]')

class TestAVMClass(unittest.TestCase):
    def test_init(self):
        avm_class = _AVMClass('(no name idx)', 'TestClass')
        self.assertEqual(avm_class.name, 'TestClass')

    def test_str(self):
        avm_class = _AVMClass('(no name idx)', 'TestClass')
        self.assertEqual(str(avm_class), 'TestClass')

    def test_repr(self):
        avm_class = _AVMClass('(no name idx)', 'TestClass')
        self.assertEqual(repr(avm_class), '_AVMClass(name=TestClass)')

class TestUndefined(unittest.TestCase):
    def test_init(self):
        undefined = _Undefined()
        self.assertIsInstance(undefined, _Undefined)

    def test_str(self):
        undefined = _Undefined()
        self.assertEqual(str(undefined), 'undefined')

    def test_repr(self):
        undefined = _Undefined()
        self.assertEqual(repr(undefined), '_Undefined()')

class TestU32(unittest.TestCase):
    def test_u32(self):
        self.assertEqual(_u32(b'\x01\x02\x03\x04'), 0x01020304)

class TestReadInt(unittest.TestCase):
    def test_read_int(self):
        self.assertEqual(_read_int(b'\x01\x02\x03\x04'), 0x01020304)

class TestStringClass(unittest.TestCase):
    def test_init(self):
        string_class = StringClass()
        self.assertIsInstance(string_class, _AVMClass)

    def test_str(self):
        string_class = StringClass()
        self.assertEqual(str(string_class), 'String')

class TestByteArrayClass(unittest.TestCase):
    def test_init(self):
        byte_array_class = ByteArrayClass()
        self.assertIsInstance(byte_array_class, _AVMClass)

    def test_str(self):
        byte_array_class = ByteArrayClass()
        self.assertEqual(str(byte_array_class), 'ByteArray')

class TestTimerClass(unittest.TestCase):
    def test_init(self):
        timer_class = TimerClass()
        self.assertIsInstance(timer_class, _AVMClass)

    def test_str(self):
        timer_class = TimerClass()
        self.assertEqual(str(timer_class), 'Timer')

class TestTimerEventClass(unittest.TestCase):
    def test_init(self):
        timer_event_class = TimerEventClass()
        self.assertIsInstance(timer_event_class, _AVMClass)

    def test_str(self):
        timer_event_class = TimerEventClass()
        self.assertEqual(str(timer_event_class), 'TimerEvent')

class TestBuiltinClasses(unittest.TestCase):
    def test_builtin_classes(self):
        self.assertEqual(_builtin_classes, {
            'String': StringClass,
            'ByteArray': ByteArrayClass,
            'Timer': TimerClass,
            'TimerEvent': TimerEventClass,
        })

if __name__ == '__main__':
    unittest.main()