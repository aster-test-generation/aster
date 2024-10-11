import unittest
from youtube_dl.swfinterp import _AVMClass, _AVMClass_Object, _ScopeDict, _read_int


class TestAVMClass(unittest.TestCase):
    def setUp(self):
        self.avm_class = _AVMClass(1, 'TestClass')

    def test_init(self):
        self.assertEqual(self.avm_class.name_idx, 1)
        self.assertEqual(self.avm_class.name, 'TestClass')
        self.assertEqual(self.avm_class.static_properties, {})
        self.assertIsInstance(self.avm_class.variables, _ScopeDict)
        self.assertEqual(self.avm_class.constants, {})

    def test_make_object(self):
        obj = self.avm_class.make_object()
        self.assertIsInstance(obj, _AVMClass_Object)
        self.assertEqual(obj._class, self.avm_class)

    def test_repr(self):
        self.assertEqual(repr(self.avm_class), '_AVMClass(TestClass)')

    def test_register_methods(self):
        methods = {'method1': 1, 'method2': 2}
        self.avm_class.register_methods(methods)
        self.assertEqual(self.avm_class.method_names, methods)
        self.assertEqual(self.avm_class.method_idxs, {1: 'method1', 2: 'method2'})

class TestAVMClassObject(unittest.TestCase):
    def setUp(self):
        self.avm_class = _AVMClass(1, 'TestClass')
        self.avm_class_object = _AVMClass_Object(self.avm_class)

    def test_init(self):
        self.assertEqual(self.avm_class_object._class, self.avm_class)

class TestScopeDict(unittest.TestCase):
    def setUp(self):
        self.avm_class = _AVMClass(1, 'TestClass')
        self.scope_dict = _ScopeDict(self.avm_class)

    def test_init(self):
        self.assertEqual(self.scope_dict._class, self.avm_class)
        self.assertEqual(self.scope_dict._dict, {})

if __name__ == '__main__':
    unittest.main()