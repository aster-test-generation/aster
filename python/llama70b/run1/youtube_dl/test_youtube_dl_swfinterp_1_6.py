import unittest
from youtube_dl.swfinterp import SWFInterpreter, _Undefined, _AVMClass, MethodInfo, Method, _read_in


class TestSWFInterpreter(unittest.TestCase):
    def test_init(self):
        interpreter = SWFInterpreter(b'\x00' * 100)
        self.assertIsNotNone(interpreter)

    def test_patch_function(self):
        interpreter = SWFInterpreter(b'\x00' * 100)
        avm_class = _AVMClass(0, 'TestClass')
        interpreter.patch_function(avm_class, 'test_func', lambda: None)
        self.assertIn((avm_class, 'test_func'), interpreter._patched_functions)

    def test_extract_class(self):
        interpreter = SWFInterpreter(b'\x00' * 100)
        avm_class = _AVMClass(0, 'TestClass')
        interpreter._classes_by_name['TestClass'] = avm_class
        extracted_class = interpreter.extract_class('TestClass')
        self.assertEqual(extracted_class, avm_class)

    def test_extract_class_nonexistent(self):
        interpreter = SWFInterpreter(b'\x00' * 100)
        with self.assertRaises(ExtractorError):
            interpreter.extract_class('NonExistentClass')

    def test_private_method__patched_functions(self):
        interpreter = SWFInterpreter(b'\x00' * 100)
        self.assertIsNotNone(interpreter._SWFInterpreter__patched_functions)

    def test_private_method__classes_by_name(self):
        interpreter = SWFInterpreter(b'\x00' * 100)
        self.assertIsNotNone(interpreter._SWFInterpreter__classes_by_name)

    def test_magic_method__str__(self):
        interpreter = SWFInterpreter(b'\x00' * 100)
        self.assertEqual(str(interpreter), 'SWFInterpreter')

    def test_magic_method__repr__(self):
        interpreter = SWFInterpreter(b'\x00' * 100)
        self.assertEqual(repr(interpreter), 'SWFInterpreter(...)')

    def test_magic_method__eq__(self):
        interpreter1 = SWFInterpreter(b'\x00' * 100)
        interpreter2 = SWFInterpreter(b'\x00' * 100)
        self.assertNotEqual(interpreter1, interpreter2)

class TestUndefined(unittest.TestCase):
    def test_undefined(self):
        undefined = _Undefined()
        self.assertIsNone(undefined)

class TestAVMClass(unittest.TestCase):
    def test_avm_class(self):
        avm_class = _AVMClass(0, 'TestClass')
        self.assertIsNotNone(avm_class)

class TestMethodInfo(unittest.TestCase):
    def test_method_info(self):
        method_info = MethodInfo(True, False)
        self.assertIsNotNone(method_info)

class TestMethod(unittest.TestCase):
    def test_method(self):
        method = Method(b'\x00' * 10, 2)
        self.assertIsNotNone(method)

if __name__ == '__main__':
    unittest.main()