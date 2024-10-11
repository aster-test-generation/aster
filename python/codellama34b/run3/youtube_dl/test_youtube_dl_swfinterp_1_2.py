import unittest
from youtube_dl.swfinterp import _read_int


class Test_ScopeDict(unittest.TestCase):
    def test_init(self):
        avm_class = _AVMClass('(no name idx)', 'String')
        instance = _ScopeDict(avm_class)
        self.assertEqual(instance.avm_class, avm_class)

    def test_repr(self):
        avm_class = _AVMClass('(no name idx)', 'String')
        instance = _ScopeDict(avm_class)
        result = instance.__repr__()
        self.assertEqual(result, 'String__Scope({})')

class Test_builtin_classes(unittest.TestCase):
    def test_StringClass(self):
        result = StringClass.name
        self.assertEqual(result, 'String')

    def test_ByteArrayClass(self):
        result = ByteArrayClass.name
        self.assertEqual(result, 'ByteArray')

    def test_TimerClass(self):
        result = TimerClass.name
        self.assertEqual(result, 'Timer')

    def test_TimerEventClass(self):
        result = TimerEventClass.name
        self.assertEqual(result, 'TimerEvent')

class Test_u32(unittest.TestCase):
    def test_u32(self):
        result = _u32(1)
        self.assertEqual(result, 1)

class Test_undefined(unittest.TestCase):
    def test_undefined(self):
        result = undefined
        self.assertEqual(result, undefined)

if __name__ == '__main__':
    unittest.main()