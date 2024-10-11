import unittest
from youtube_dl.swfinterp import _Multiname, _Undefined, _AVMClass, compat_str, compat_struct_unpack, ExtractorError
from youtube_dl.swfinterp import StringClass, ByteArrayClass, TimerClass, TimerEventClass


class TestMultiname(unittest.TestCase):
    def test_init(self):
        instance = _Multiname(1)
        self.assertEqual(instance.kind, 1)

    def test_repr(self):
        instance = _Multiname(1)
        result = instance.__repr__()
        self.assertEqual(result, '[MULTINAME kind: 0x1]')

class TestUndefined(unittest.TestCase):
    def test_init(self):
        instance = _Undefined()
        self.assertEqual(instance, _Undefined())

class TestAVMClass(unittest.TestCase):
    def test_init(self):
        instance = _AVMClass('(no name idx)', 'String')
        self.assertEqual(instance.name, '(no name idx)')
        self.assertEqual(instance.class_name, 'String')

class TestReadInt(unittest.TestCase):
    def test_read_int(self):
        result = _read_int(b'\x00\x01\x02\x03')
        self.assertEqual(result, 0x010203)

class TestCompatStr(unittest.TestCase):
    def test_compat_str(self):
        result = compat_str(b'\x00\x01\x02\x03')
        self.assertEqual(result, '\x00\x01\x02\x03')

class TestCompatStructUnpack(unittest.TestCase):
    def test_compat_struct_unpack(self):
        result = compat_struct_unpack('<II', b'\x00\x01\x02\x03')
        self.assertEqual(result, (0, 1, 2, 3))

class TestExtractorError(unittest.TestCase):
    def test_extractor_error(self):
        error = ExtractorError('Error message')
        self.assertEqual(str(error), 'Error message')

class TestStringClass(unittest.TestCase):
    def test_init(self):
        instance = StringClass
        self.assertEqual(instance.name, 'String')

class TestByteArrayClass(unittest.TestCase):
    def test_init(self):
        instance = ByteArrayClass
        self.assertEqual(instance.name, 'ByteArray')

class TestTimerClass(unittest.TestCase):
    def test_init(self):
        instance = TimerClass
        self.assertEqual(instance.name, 'Timer')

class TestTimerEventClass(unittest.TestCase):
    def test_init(self):
        instance = TimerEventClass
        self.assertEqual(instance.name, 'TimerEvent')

if __name__ == '__main__':
    unittest.main()