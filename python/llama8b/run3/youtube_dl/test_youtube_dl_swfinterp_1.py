import unittest
from youtube_dl.swfinterp import SWFInterpreter


class TestSWFInterpreter(unittest.TestCase):
    def test_init(self):
        swf = SWFInterpreter(b'')
        self.assertEqual(swf._patched_functions, {(TimerClass, 'addEventListener'): lambda params: undefined})
        self.assertEqual(swf._classes_by_name, {})
        self.assertEqual(swf._all_methods, [])

    def test_extract_function(self):
        swf = SWFInterpreter(b'')
        avm_class = object()
        func_name = 'func_name'
        result = swf.extract_function(avm_class, func_name)
        self.assertEqual(result, None)

    def test_method_one(self):
        swf = SWFInterpreter(b'')
        avm_class = object()
        func_name = 'method_one'
        result = swf.extract_function(avm_class, func_name)
        self.assertEqual(result, None)

    def test_method_two(self):
        swf = SWFInterpreter(b'')
        avm_class = object()
        func_name = 'method_two'
        result = swf.extract_function(avm_class, func_name)
        self.assertEqual(result, None)

    def test_protected_method(self):
        swf = SWFInterpreter(b'')
        avm_class = object()
        func_name = '_protected_method'
        result = swf.extract_function(avm_class, func_name)
        self.assertEqual(result, None)

    def test_private_method(self):
        swf = SWFInterpreter(b'')
        avm_class = object()
        func_name = '__private_method'
        result = swf.extract_function(avm_class, func_name)
        self.assertEqual(result, None)

    def test_str_method(self):
        swf = SWFInterpreter(b'')
        avm_class = object()
        result = str(swf)
        self.assertEqual(result, 'SWFInterpreter')

    def test_repr_method(self):
        swf = SWFInterpreter(b'')
        avm_class = object()
        result = repr(swf)
        self.assertEqual(result, 'SWFInterpreter({})')

    def test_eq_method(self):
        swf1 = SWFInterpreter(b'')
        swf2 = SWFInterpreter(b'')
        self.assertEqual(swf1, swf2)

    def test_ne_method(self):
        swf1 = SWFInterpreter(b'')
        swf2 = object()
        self.assertNotEqual(swf1, swf2)

if __name__ == '__main__':
    unittest.main()