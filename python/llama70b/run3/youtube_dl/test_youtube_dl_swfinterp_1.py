import unittest
from youtube_dl.swfinterp import SWFInterpreter, AVMClass, Undefined, Multinam


class TestSWFInterpreter(unittest.TestCase):
    def test_init(self):
        interpreter = SWFInterpreter(b'\x00' * 100)
        self.assertIsInstance(interpreter, SWFInterpreter)

    def test_extract_function(self):
        interpreter = SWFInterpreter(b'\x00' * 100)
        avm_class = _AVMClass('(no name idx)', 'TestClass')
        func_name = 'test_func'
        resfunc = interpreter.extract_function(avm_class, func_name)
        self.assertIsInstance(resfunc, callable)

    def test_private_method__patched_functions(self):
        interpreter = SWFInterpreter(b'\x00' * 100)
        avm_class = _AVMClass('(no name idx)', 'TestClass')
        func_name = 'test_func'
        patched_func = lambda params: _Undefined()
        interpreter._SWFInterpreter__patched_functions[(avm_class, func_name)] = patched_func
        self.assertEqual(interpreter.extract_function(avm_class, func_name), patched_func)

    def test_protected_method_parse_traits_info(self):
        interpreter = SWFInterpreter(b'\x00' * 100)
        trait_name_idx = 1
        kind_full = 0x10
        attrs = kind_full >> 4
        methods = {}
        constants = None
        result = interpreter._parse_traits_info(trait_name_idx, kind_full, attrs)
        self.assertEqual(result, (methods, constants))

    def test_magic_method__str__(self):
        interpreter = SWFInterpreter(b'\x00' * 100)
        self.assertEqual(str(interpreter), 'SWFInterpreter')

    def test_magic_method__repr__(self):
        interpreter = SWFInterpreter(b'\x00' * 100)
        self.assertEqual(repr(interpreter), 'SWFInterpreter(0)')

class Test_AVMClass(unittest.TestCase):
    def test_init(self):
        avm_class = _AVMClass('(no name idx)', 'TestClass')
        self.assertIsInstance(avm_class, _AVMClass)

    def test_register_methods(self):
        avm_class = _AVMClass('(no name idx)', 'TestClass')
        trait_methods = {'test_method': 1}
        avm_class.register_methods(trait_methods)
        self.assertEqual(avm_class.methods, trait_methods)

class Test_Undefined(unittest.TestCase):
    def test_init(self):
        undefined = _Undefined()
        self.assertIsInstance(undefined, _Undefined)

    def test_str(self):
        undefined = _Undefined()
        self.assertEqual(str(undefined), 'undefined')

class Test_Multiname(unittest.TestCase):
    def test_init(self):
        multiname = _Multiname(7)
        self.assertIsInstance(multiname, _Multiname)

    def test_str(self):
        multiname = _Multiname(7)
        self.assertEqual(str(multiname), '<Multiname kind=7>')

if __name__ == '__main__':
    unittest.main()