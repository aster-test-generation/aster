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
        class_name = 'TestClass'
        avm_class = _AVMClass(0, class_name)
        interpreter._classes_by_name[class_name] = avm_class
        extracted_class = interpreter.extract_class(class_name)
        self.assertEqual(extracted_class, avm_class)

    def test_extract_class_nonexistent(self):
        interpreter = SWFInterpreter(b'\x00' * 100)
        class_name = 'NonExistentClass'
        with self.assertRaises(ExtractorError):
            interpreter.extract_class(class_name)

    def test_private_method__patched_functions(self):
        interpreter = SWFInterpreter(b'\x00' * 100)
        self.assertIsNotNone(interpreter._patched_functions)

    def test_private_method__classes_by_name(self):
        interpreter = SWFInterpreter(b'\x00' * 100)
        self.assertIsNotNone(interpreter._classes_by_name)

    def test_private_method__all_methods(self):
        interpreter = SWFInterpreter(b'\x00' * 100)
        self.assertIsNotNone(interpreter._all_methods)

    def test_magic_method__str__(self):
        interpreter = SWFInterpreter(b'\x00' * 100)
        self.assertIsNotNone(str(interpreter))

    def test_magic_method__repr__(self):
        interpreter = SWFInterpreter(b'\x00' * 100)
        self.assertIsNotNone(repr(interpreter))

class TestMethodInfo(unittest.TestCase):
    def test_init(self):
        method_info = MethodInfo(True, False)
        self.assertIsNotNone(method_info)

class TestMethod(unittest.TestCase):
    def test_init(self):
        method = Method(b'\x00' * 100, 10)
        self.assertIsNotNone(method)

class TestUndefined(unittest.TestCase):
    def test_init(self):
        undefined = _Undefined()
        self.assertIsNotNone(undefined)

class TestAVMClass(unittest.TestCase):
    def test_init(self):
        avm_class = _AVMClass(0, 'TestClass')
        self.assertIsNotNone(avm_class)

if __name__ == '__main__':
    unittest.main()