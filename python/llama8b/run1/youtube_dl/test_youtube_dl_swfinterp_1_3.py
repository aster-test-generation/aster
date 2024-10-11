import unittest
from youtube_dl.swfinterp import _AVMClass, _AVMClass_Object, _Undefined, _ScopeDict
from youtube_dl.swfinterp import _read_int


class TestAVMClass(unittest.TestCase):
    def test_init(self):
        avm_class = _AVMClass(1, 'Test')
        self.assertEqual(avm_class.name_idx, 1)
        self.assertEqual(avm_class.name, 'Test')
        self.assertEqual(avm_class.method_names, {})
        self.assertEqual(avm_class.method_idxs, {})
        self.assertEqual(avm_class.methods, {})
        self.assertEqual(avm_class.method_pyfunctions, {})
        self.assertEqual(avm_class.static_properties, {})
        self.assertEqual(avm_class.variables, _ScopeDict(avm_class))
        self.assertEqual(avm_class.constants, {})

    def test_make_object(self):
        avm_class = _AVMClass(1, 'Test')
        object = avm_class.make_object()
        self.assertIsInstance(object, _AVMClass_Object)

    def test_repr(self):
        avm_class = _AVMClass(1, 'Test')
        self.assertEqual(repr(avm_class), '_AVMClass(Test)')

    def test_register_methods(self):
        avm_class = _AVMClass(1, 'Test')
        methods = {'method1': 1, 'method2': 2}
        avm_class.register_methods(methods)
        self.assertEqual(avm_class.method_names, methods)
        self.assertEqual(avm_class.method_idxs, dict(((idx, name) for name, idx in methods.items())))

class TestAVMClassObject(unittest.TestCase):
    def test_init(self):
        avm_class = _AVMClass(1, 'Test')
        object = avm_class.make_object()
        self.assertIsInstance(object, _AVMClass_Object)

class TestUndefined(unittest.TestCase):
    def test_init(self):
        undefined = _Undefined()
        self.assertEqual(undefined, _Undefined())

class TestScopeDict(unittest.TestCase):
    def test_init(self):
        scope_dict = _ScopeDict(_AVMClass(1, 'Test'))
        self.assertIsInstance(scope_dict, _ScopeDict)

class TestReadInt(unittest.TestCase):
    def test_read_int(self):
        result = _read_int(b'\x00\x01\x02\x03')
        self.assertEqual(result, 0x030201)

if __name__ == '__main__':
    unittest.main()