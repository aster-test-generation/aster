import unittest
from youtube_dl.swfinterp import _AVMClass, _AVMClass_Object, _Undefined, _ScopeDict
from youtube_dl.swfinterp import _read_int


class TestAVMClass(unittest.TestCase):
    def test_init(self):
        avm_class = _AVMClass(1, 'TestClass')
        self.assertEqual(avm_class.name_idx, 1)
        self.assertEqual(avm_class.name, 'TestClass')
        self.assertEqual(avm_class.method_names, {})
        self.assertEqual(avm_class.method_idxs, {})
        self.assertEqual(avm_class.methods, {})
        self.assertEqual(avm_class.method_pyfunctions, {})
        self.assertEqual(avm_class.static_properties, {})
        self.assertEqual(avm_class.variables, _ScopeDict(avm_class))
        self.assertEqual(avm_class.constants, {})

    def test_make_object(self):
        avm_class = _AVMClass(1, 'TestClass')
        object = avm_class.make_object()
        self.assertIsInstance(object, _AVMClass_Object)

    def test_repr(self):
        avm_class = _AVMClass(1, 'TestClass')
        self.assertEqual(repr(avm_class), '_AVMClass(TestClass)')

    def test_register_methods(self):
        avm_class = _AVMClass(1, 'TestClass')
        methods = {'method1': 1, 'method2': 2}
        avm_class.register_methods(methods)
        self.assertEqual(avm_class.method_names, methods)
        self.assertEqual(avm_class.method_idxs, dict(((idx, name) for name, idx in methods.items())))

    def test_private_method(self):
        avm_class = _AVMClass(1, 'TestClass')
        _read_int(1)  # Call private method

    def test_protected_method(self):
        avm_class = _AVMClass(1, 'TestClass')
        _ = avm_class._AVMClass__make_object()  # Call protected method

if __name__ == '__main__':
    unittest.main()