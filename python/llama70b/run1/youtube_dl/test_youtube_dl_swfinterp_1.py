import unittest
from youtube_dl.swfinterp import SWFInterpreter, _Undefined, _AVMClass, _Multiname, _read_in


class TestSWFInterpreter(unittest.TestCase):
    def test_init(self):
        interpreter = SWFInterpreter(b'')
        self.assertIsInstance(interpreter, SWFInterpreter)

    def test_extract_function(self):
        interpreter = SWFInterpreter(b'')
        avm_class = _AVMClass('(no name idx)', 'TestClass')
        func_name = 'test_func'
        result = interpreter.extract_function(avm_class, func_name)
        self.assertIsInstance(result, callable)

    def test_private_method(self):
        interpreter = SWFInterpreter(b'')
        result = interpreter._SWFInterpreter__patched_functions
        self.assertIsInstance(result, dict)

    def test_protected_method(self):
        interpreter = SWFInterpreter(b'')
        result = interpreter._parse_traits_info()
        self.assertIsInstance(result, tuple)

    def test_magic_method_str(self):
        interpreter = SWFInterpreter(b'')
        result = str(interpreter)
        self.assertIsInstance(result, str)

    def test_magic_method_repr(self):
        interpreter = SWFInterpreter(b'')
        result = repr(interpreter)
        self.assertIsInstance(result, str)

    def test_magic_method_eq(self):
        interpreter1 = SWFInterpreter(b'')
        interpreter2 = SWFInterpreter(b'')
        result = interpreter1 == interpreter2
        self.assertIsInstance(result, bool)

if __name__ == '__main__':
    unittest.main()