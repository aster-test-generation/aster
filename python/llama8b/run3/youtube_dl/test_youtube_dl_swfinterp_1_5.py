import unittest
from youtube_dl.swfinterp import _Undefined, _AVMClass, _read_int, _builtin_classe


class TestUndefined(unittest.TestCase):
    def test_init(self):
        instance = _Undefined()
        self.assertEqual(instance, _Undefined())

    def test_bool(self):
        instance = _Undefined()
        self.assertFalse(instance)

    def test_hash(self):
        instance = _Undefined()
        self.assertEqual(hash(instance), 0)

    def test_str(self):
        instance = _Undefined()
        self.assertEqual(str(instance), 'undefined')

class TestAVMClass(unittest.TestCase):
    def test_init(self):
        instance = _AVMClass('(no name idx)', 'String')
        self.assertEqual(instance.name, '(no name idx)')
        self.assertEqual(instance.cls, 'String')

class TestReadInt(unittest.TestCase):
    def test_read_int(self):
        result = _read_int(b'\x00\x00\x00\x01')
        self.assertEqual(result, 1)

class TestBuiltinClasses(unittest.TestCase):
    def test_get_builtins(self):
        self.assertEqual(_builtin_classes, {StringClass.name: StringClass, ByteArrayClass.name: ByteArrayClass, TimerClass.name: TimerClass, TimerEventClass.name: TimerEventClass})

if __name__ == '__main__':
    unittest.main()