import unittest
from youtube_dl.swfinterp import AVMClass, Undefined


class TestAVMClass(unittest.TestCase):
    def test_make_object(self):
        avm_class = _AVMClass('(no name idx)', 'TestClass')
        obj = avm_class.make_object()
        self.assertIsInstance(obj, _AVMClass_Object)
        self.assertEqual(obj.class_name, avm_class.name)

    def test_register_methods(self):
        avm_class = _AVMClass('(no name idx)', 'TestClass')
        avm_class.register_methods({'method_one': 1, 'method_two': 2})
        self.assertEqual(len(avm_class.method_names), 2)
        self.assertEqual(len(avm_class.method_idxs), 2)
        self.assertEqual(len(avm_class.methods), 2)
        self.assertEqual(len(avm_class.method_pyfunctions), 2)

    def test_register_methods_with_same_name(self):
        avm_class = _AVMClass('(no name idx)', 'TestClass')
        with self.assertRaises(ValueError):
            avm_class.register_methods({'method_one': 1, 'method_one': 2})

class TestUndefined(unittest.TestCase):
    def test_undefined_instance(self):
        undefined = _Undefined()
        self.assertIsInstance(undefined, _Undefined)
        self.assertEqual(str(undefined), 'undefined')
        self.assertEqual(repr(undefined), 'undefined')
        self.assertFalse(undefined)
        self.assertTrue(not undefined)

if __name__ == '__main__':
    unittest.main()