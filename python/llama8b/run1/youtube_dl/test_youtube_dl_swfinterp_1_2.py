import unittest
from youtube_dl.swfinterp import _ScopeDict, _Undefined, _AVMClass, _read_int, compat_str, compat_struct_unpack, ExtractorErro
from youtube_dl.swfinterp import StringClass, ByteArrayClass, TimerClass, TimerEventClass


class TestScopeDict(unittest.TestCase):
    def test_init(self):
        scope_dict = _ScopeDict(StringClass)
        self.assertIsInstance(scope_dict, dict)
        self.assertEqual(scope_dict.avm_class, StringClass)

    def test_repr(self):
        scope_dict = _ScopeDict(StringClass)
        result = scope_dict.__repr__()
        self.assertEqual(result, 'String__Scope({})')

class TestUndefined(unittest.TestCase):
    def test_repr(self):
        undefined = _Undefined()
        result = undefined.__repr__()
        self.assertEqual(result, 'Undefined()')

class TestAVMClass(unittest.TestCase):
    def test_repr(self):
        avm_class = _AVMClass('(no name idx)', 'String')
        result = avm_class.__repr__()
        self.assertEqual(result, 'AVMClass("(no name idx)", "String")')

class TestReadInt(unittest.TestCase):
    def test_read_int(self):
        result = _read_int(b'\x00\x01\x02\x03')
        self.assertEqual(result, 0x030201)

class TestCompatStr(unittest.TestCase):
    def test_compat_str(self):
        result = compat_str(b'\x00\x01\x02\x03')
        self.assertEqual(result, '\x00\x01\x02\x03')

class TestCompatStructUnpack(unittest.TestCase):
    def test_compat_struct_unpack(self):
        result = compat_struct_unpack('<I', b'\x00\x01\x02\x03')
        self.assertEqual(result, (0x030201,))

class TestExtractorError(unittest.TestCase):
    def test_extractor_error(self):
        error = ExtractorError('Error message')
        self.assertEqual(str(error), 'Error message')

class TestStringClass(unittest.TestCase):
    def test_repr(self):
        string_class = StringClass
        result = string_class.__repr__()
        self.assertEqual(result, 'String')

class TestByteArrayClass(unittest.TestCase):
    def test_repr(self):
        byte_array_class = ByteArrayClass
        result = byte_array_class.__repr__()
        self.assertEqual(result, 'ByteArray')

class TestTimerClass(unittest.TestCase):
    def test_repr(self):
        timer_class = TimerClass
        result = timer_class.__repr__()
        self.assertEqual(result, 'Timer')

class TestTimerEventClass(unittest.TestCase):
    def test_repr(self):
        timer_event_class = TimerEventClass
        result = timer_event_class.__repr__()
        self.assertEqual(result, 'TimerEvent')

if __name__ == '__main__':
    unittest.main()