import unittest
from youtube_dl.swfinterp import _AVMClass_Object, _AVMClass, _Undefined, _read_int


class TestAVMClassObject(unittest.TestCase):
    def test_init(self):
        avm_class = _AVMClass('test_name', 'test_super')
        instance = _AVMClass_Object(avm_class)
        self.assertEqual(instance.avm_class, avm_class)

    def test_repr(self):
        avm_class = _AVMClass('test_name', 'test_super')
        instance = _AVMClass_Object(avm_class)
        result = instance.__repr__()
        self.assertEqual(result, 'test_name')

class TestAVMClass(unittest.TestCase):
    def test_init(self):
        avm_class = _AVMClass('test_name', 'test_super')
        self.assertEqual(avm_class.name, 'test_name')
        self.assertEqual(avm_class.super_name, 'test_super')

    def test_repr(self):
        avm_class = _AVMClass('test_name', 'test_super')
        result = avm_class.__repr__()
        self.assertEqual(result, 'test_name')

class TestUndefined(unittest.TestCase):
    def test_repr(self):
        undefined_instance = _Undefined()
        result = undefined_instance.__repr__()
        self.assertEqual(result, 'undefined')

if __name__ == '__main__':
    unittest.main()