import unittest
from youtube_dl.swfinterp import _Multiname, _AVMClass, _Undefined, _read_in


class TestMultiname(unittest.TestCase):
    def test_init(self):
        instance = _Multiname(0x1)
        self.assertEqual(instance.kind, 0x1)

    def test_repr(self):
        instance = _Multiname(0x2)
        result = instance.__repr__()
        self.assertEqual(result, '[MULTINAME kind: 0x2]')

class TestAVMClass(unittest.TestCase):
    def test_init(self):
        instance = _AVMClass('(no name idx)', 'String')
        self.assertEqual(instance.name, '(no name idx)')
        self.assertEqual(instance.class_name, 'String')

class TestUndefined(unittest.TestCase):
    def test_init(self):
        instance = _Undefined()
        self.assertEqual(instance, _Undefined())

class TestReadInt(unittest.TestCase):
    def test_read_int(self):
        result = _read_int(b'\x00\x01\x02\x03')
        self.assertEqual(result, 0x030201)

if __name__ == '__main__':
    unittest.main()