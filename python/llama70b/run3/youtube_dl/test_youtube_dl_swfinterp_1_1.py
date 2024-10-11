import unittest
from youtube_dl.swfinterp import AVMClass as _AVMClass, AVMClass_Object as _AVMClass_Object, builtin_classes as _builtin_classes, undefined, u32 as _u3


class Test_AVMClass(unittest.TestCase):
    def test_init(self):
        avm_class = _AVMClass('(no name idx)', 'TestClass')
        self.assertEqual(avm_class.name, 'TestClass')

    def test_repr(self):
        avm_class = _AVMClass('(no name idx)', 'TestClass')
        self.assertEqual(repr(avm_class), '_AVMClass((no name idx), TestClass)')

class Test_AVMClass_Object(unittest.TestCase):
    def test_init(self):
        avm_class = _AVMClass('(no name idx)', 'TestClass')
        obj = _AVMClass_Object(avm_class)
        self.assertEqual(obj.avm_class, avm_class)

    def test_repr(self):
        avm_class = _AVMClass('(no name idx)', 'TestClass')
        obj = _AVMClass_Object(avm_class)
        self.assertEqual(repr(obj), '%s' % avm_class)

class Test_builtin_classes(unittest.TestCase):
    def test_builtin_classes(self):
        self.assertEqual(len(_builtin_classes), 4)
        self.assertIn('String', _builtin_classes)
        self.assertIn('ByteArray', _builtin_classes)
        self.assertIn('Timer', _builtin_classes)
        self.assertIn('TimerEvent', _builtin_classes)

class Test_undefined(unittest.TestCase):
    def test_undefined(self):
        self.assertEqual(undefined, _Undefined())

class Test_u32(unittest.TestCase):
    def test_u32(self):
        self.assertEqual(_u32, _read_int)

if __name__ == '__main__':
    unittest.main()