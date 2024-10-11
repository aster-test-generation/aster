import unittest
from youtube_dl.swfinterp import Multiname, Undefined, AVMClass, builtin_classes, u32, StringClass, ByteArrayClass, TimerClass, TimerEventClas


class TestMultiname(unittest.TestCase):
    def test_init(self):
        multiname = _Multiname(0x1234)
        self.assertEqual(multiname.kind, 0x1234)

    def test_repr(self):
        multiname = _Multiname(0x1234)
        self.assertEqual(multiname.__repr__(), '[MULTINAME kind: 0x1234]')

class TestUndefined(unittest.TestCase):
    def test_init(self):
        undefined = _Undefined()
        self.assertIsInstance(undefined, _Undefined)

    def test_repr(self):
        undefined = _Undefined()
        self.assertEqual(undefined.__repr__(), '<Undefined>')

class TestAVMClass(unittest.TestCase):
    def test_init(self):
        avm_class = _AVMClass('(no name idx)', 'String')
        self.assertEqual(avm_class.name, '(no name idx)')
        self.assertEqual(avm_class.base, 'String')

class TestBuiltinClasses(unittest.TestCase):
    def test_builtin_classes(self):
        self.assertIn('String', _builtin_classes)
        self.assertIn('ByteArray', _builtin_classes)
        self.assertIn('Timer', _builtin_classes)
        self.assertIn('TimerEvent', _builtin_classes)

class TestU32(unittest.TestCase):
    def test_u32(self):
        self.assertEqual(_u32(0x1234), 0x1234)

class TestStringClass(unittest.TestCase):
    def test_init(self):
        string_class = StringClass
        self.assertEqual(string_class.name, '(no name idx)')
        self.assertEqual(string_class.base, 'String')

class TestByteArrayClass(unittest.TestCase):
    def test_init(self):
        byte_array_class = ByteArrayClass
        self.assertEqual(byte_array_class.name, '(no name idx)')
        self.assertEqual(byte_array_class.base, 'ByteArray')

class TestTimerClass(unittest.TestCase):
    def test_init(self):
        timer_class = TimerClass
        self.assertEqual(timer_class.name, '(no name idx)')
        self.assertEqual(timer_class.base, 'Timer')

class TestTimerEventClass(unittest.TestCase):
    def test_init(self):
        timer_event_class = TimerEventClass
        self.assertEqual(timer_event_class.name, '(no name idx)')
        self.assertEqual(timer_event_class.base, 'TimerEvent')
        self.assertIn('TIMER', timer_event_class.attributes)
        self.assertEqual(timer_event_class.attributes['TIMER'], 'timer')

if __name__ == '__main__':
    unittest.main()