import unittest
from youtube_dl.swfinterp import SWFInterpreter, _Undefined, _AVMClass, MethodInfo, Method, _read_in


class TestSWFInterpreter(unittest.TestCase):
    def test_init(self):
        instance = SWFInterpreter(b'\x00' * 100)
        self.assertIsInstance(instance, SWFInterpreter)

    def test_patch_function(self):
        instance = SWFInterpreter(b'\x00' * 100)
        avm_class = _AVMClass(0, 'TestClass')
        func_name = 'test_func'
        f = lambda: None
        instance.patch_function(avm_class, func_name, f)
        self.assertIn((avm_class, func_name), instance._patched_functions)

    def test_extract_class(self):
        instance = SWFInterpreter(b'\x00' * 100)
        class_name = 'TestClass'
        avm_class = _AVMClass(0, class_name)
        instance._classes_by_name[class_name] = avm_class
        result = instance.extract_class(class_name)
        self.assertEqual(result, avm_class)

    def test_extract_class_call_cinit(self):
        instance = SWFInterpreter(b'\x00' * 100)
        class_name = 'TestClass'
        avm_class = _AVMClass(0, class_name)
        avm_class.cinit_idx = 0
        instance._classes_by_name[class_name] = avm_class
        instance._all_methods = [Method(b'\x00' * 10, 0)]
        result = instance.extract_class(class_name, call_cinit=True)
        self.assertEqual(result, avm_class)

    def test_private_method__patched_functions(self):
        instance = SWFInterpreter(b'\x00' * 100)
        avm_class = _AVMClass(0, 'TestClass')
        func_name = 'test_func'
        f = lambda: None
        instance._SWFInterpreter__patched_functions[(avm_class, func_name)] = f
        self.assertIn((avm_class, func_name), instance._patched_functions)

    def test_protected_method_parse_traits_info(self):
        instance = SWFInterpreter(b'\x00' * 100)
        trait_name_idx = 0
        kind_full = 0
        result = instance._parse_traits_info(trait_name_idx, kind_full)
        self.assertIsInstance(result, tuple)

    def test_magic_method__str__(self):
        instance = SWFInterpreter(b'\x00' * 100)
        result = instance.__str__()
        self.assertIsInstance(result, str)

    def test_magic_method__repr__(self):
        instance = SWFInterpreter(b'\x00' * 100)
        result = instance.__repr__()
        self.assertIsInstance(result, str)

    def test_magic_method__eq__(self):
        instance1 = SWFInterpreter(b'\x00' * 100)
        instance2 = SWFInterpreter(b'\x00' * 100)
        result = instance1 == instance2
        self.assertIsInstance(result, bool)

if __name__ == '__main__':
    unittest.main()