import unittest
from youtube_dl.swfinterp import _read_int


class TestUndefined(unittest.TestCase):
    def test_init(self):
        instance = _Undefined()
        self.assertEqual(instance.__bool__(), False)
        self.assertEqual(instance.__hash__(), 0)
        self.assertEqual(instance.__str__(), 'undefined')

class TestStringClass(unittest.TestCase):
    def test_init(self):
        instance = StringClass()
        self.assertEqual(instance.name, '(no name idx)')
        self.assertEqual(instance.superclass, None)
        self.assertEqual(instance.class_name, 'String')

class TestByteArrayClass(unittest.TestCase):
    def test_init(self):
        instance = ByteArrayClass()
        self.assertEqual(instance.name, '(no name idx)')
        self.assertEqual(instance.superclass, None)
        self.assertEqual(instance.class_name, 'ByteArray')

class TestTimerClass(unittest.TestCase):
    def test_init(self):
        instance = TimerClass()
        self.assertEqual(instance.name, '(no name idx)')
        self.assertEqual(instance.superclass, None)
        self.assertEqual(instance.class_name, 'Timer')

class TestTimerEventClass(unittest.TestCase):
    def test_init(self):
        instance = TimerEventClass()
        self.assertEqual(instance.name, '(no name idx)')
        self.assertEqual(instance.superclass, None)
        self.assertEqual(instance.class_name, 'TimerEvent')
        self.assertEqual(instance.fields, {'TIMER': 'timer'})

class TestBuiltinClasses(unittest.TestCase):
    def test_init(self):
        self.assertEqual(_builtin_classes[StringClass.name], StringClass)
        self.assertEqual(_builtin_classes[ByteArrayClass.name], ByteArrayClass)
        self.assertEqual(_builtin_classes[TimerClass.name], TimerClass)
        self.assertEqual(_builtin_classes[TimerEventClass.name], TimerEventClass)

class TestU32(unittest.TestCase):
    def test_init(self):
        self.assertEqual(_u32, _read_int)

if __name__ == '__main__':
    unittest.main()