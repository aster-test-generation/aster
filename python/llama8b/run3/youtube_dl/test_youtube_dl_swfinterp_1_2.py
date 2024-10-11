import unittest
from youtube_dl.swfinterp import _ScopeDict, _AVMClass, _Undefined, _u32, undefined
from youtube_dl.swfinterp import StringClass, ByteArrayClass, TimerClass, TimerEventClass


class TestScopeDict(unittest.TestCase):
    def test_init(self):
        scope_dict = _ScopeDict(StringClass)
        self.assertEqual(scope_dict.avm_class, StringClass)

    def test_repr(self):
        scope_dict = _ScopeDict(StringClass)
        result = scope_dict.__repr__()
        self.assertEqual(result, 'String__Scope({})')

class TestAVMClass(unittest.TestCase):
    def test_init(self):
        avm_class = _AVMClass('(no name idx)', 'String')
        self.assertEqual(avm_class.name, '(no name idx)')
        self.assertEqual(avm_class.type, 'String')

class TestUndefined(unittest.TestCase):
    def test_init(self):
        undefined_instance = _Undefined()
        self.assertEqual(undefined_instance, undefined)

class TestU32(unittest.TestCase):
    def test_read_int(self):
        result = _u32(b'\x00\x01\x02\x03')
        self.assertEqual(result, 0x03020100)

class TestBuiltInClasses(unittest.TestCase):
    def test_built_in_classes(self):
        self.assertEqual(StringClass.name, 'String')
        self.assertEqual(ByteArrayClass.name, 'ByteArray')
        self.assertEqual(TimerClass.name, 'Timer')
        self.assertEqual(TimerEventClass.name, 'TimerEvent')

if __name__ == '__main__':
    unittest.main()