import unittest
from youtube_dl.swfinterp import _AVMClass_Object, _AVMClass, _Undefined, _read_in
from youtube_dl.swfinterp import StringClass, ByteArrayClass, TimerClass, TimerEventClass


class TestAVMClassObject(unittest.TestCase):
    def test_init(self):
        avm_class = _AVMClass('(no name idx)', 'String')
        instance = _AVMClass_Object(avm_class)
        self.assertEqual(instance.avm_class, avm_class)

    def test_repr(self):
        avm_class = _AVMClass('(no name idx)', 'String')
        instance = _AVMClass_Object(avm_class)
        result = instance.__repr__()
        self.assertEqual(result, '%s' % instance)

class TestAVMClass(unittest.TestCase):
    def test_init(self):
        avm_class = _AVMClass('(no name idx)', 'String')
        self.assertEqual(avm_class.name, '(no name idx)')
        self.assertEqual(avm_class.type, 'String')

class TestUndefined(unittest.TestCase):
    def test_init(self):
        undefined = _Undefined()
        self.assertEqual(undefined, _Undefined())

class TestReadInt(unittest.TestCase):
    def test_read_int(self):
        result = _read_int(b'\x00\x00\x00\x01')
        self.assertEqual(result, 1)

class TestStringClass(unittest.TestCase):
    def test_init(self):
        string_class = StringClass
        self.assertEqual(string_class.name, 'String')

class TestByteArrayClass(unittest.TestCase):
    def test_init(self):
        byte_array_class = ByteArrayClass
        self.assertEqual(byte_array_class.name, 'ByteArray')

class TestTimerClass(unittest.TestCase):
    def test_init(self):
        timer_class = TimerClass
        self.assertEqual(timer_class.name, 'Timer')

class TestTimerEventClass(unittest.TestCase):
    def test_init(self):
        timer_event_class = TimerEventClass
        self.assertEqual(timer_event_class.name, 'TimerEvent')
        self.assertEqual(timer_event_class.properties, {'TIMER': 'timer'})

if __name__ == '__main__':
    unittest.main()