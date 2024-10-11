import unittest
from youtube_dl.swfinterp import SWFInterpreter, _Undefined, AVMClass, Multinam


class TestSWFInterpreter(unittest.TestCase):
    def test_init(self):
        interpreter = SWFInterpreter(b'\x00' * 1024)
        self.assertIsInstance(interpreter, SWFInterpreter)

    def test_extract_function(self):
        interpreter = SWFInterpreter(b'\x00' * 1024)
        avm_class = _AVMClass('(no name idx)', 'TestClass')
        func_name = 'test_func'
        func = interpreter.extract_function(avm_class, func_name)
        self.assertIsInstance(func, callable)

    def test__patched_functions(self):
        interpreter = SWFInterpreter(b'\x00' * 1024)
        avm_class = _AVMClass('(no name idx)', 'TestClass')
        func_name = 'test_func'
        interpreter._patched_functions[(avm_class, func_name)] = lambda params: _Undefined()
        self.assertIn((avm_class, func_name), interpreter._patched_functions)

    def test_classes_by_name(self):
        interpreter = SWFInterpreter(b'\x00' * 1024)
        avm_class = _AVMClass('(no name idx)', 'TestClass')
        interpreter._classes_by_name[avm_class.name] = avm_class
        self.assertIn(avm_class.name, interpreter._classes_by_name)

    def test_all_methods(self):
        interpreter = SWFInterpreter(b'\x00' * 1024)
        method = interpreter._all_methods[0]
        self.assertIsInstance(method, tuple)

    def test_constant_ints(self):
        interpreter = SWFInterpreter(b'\x00' * 1024)
        self.assertIsInstance(interpreter.constant_ints, list)

    def test_constant_uints(self):
        interpreter = SWFInterpreter(b'\x00' * 1024)
        self.assertIsInstance(interpreter.constant_uints, list)

    def test_constant_strings(self):
        interpreter = SWFInterpreter(b'\x00' * 1024)
        self.assertIsInstance(interpreter.constant_strings, list)

    def test_multinames(self):
        interpreter = SWFInterpreter(b'\x00' * 1024)
        self.assertIsInstance(interpreter.multinames, list)

    def test__str__(self):
        interpreter = SWFInterpreter(b'\x00' * 1024)
        self.assertIsInstance(str(interpreter), str)

    def test__repr__(self):
        interpreter = SWFInterpreter(b'\x00' * 1024)
        self.assertIsInstance(repr(interpreter), str)

    def test__eq__(self):
        interpreter1 = SWFInterpreter(b'\x00' * 1024)
        interpreter2 = SWFInterpreter(b'\x00' * 1024)
        self.assertFalse(interpreter1 == interpreter2)

if __name__ == '__main__':
    unittest.main()