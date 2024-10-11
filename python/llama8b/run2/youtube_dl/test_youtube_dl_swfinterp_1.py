import unittest
from youtube_dl.swfinterp import SWFInterpreter


class TestSWFInterpreter(unittest.TestCase):
    def test_init(self):
        swf = SWFInterpreter(b'')
        self.assertEqual(swf._patched_functions, {(TimerClass, 'addEventListener'): lambda params: undefined})

    def test_extract_function(self):
        swf = SWFInterpreter(b'')
        avm_class = _AVMClass('(no name idx)', 'String')
        func_name = 'String'
        result = swf.extract_function(avm_class, func_name)
        self.assertEqual(result, undefined)

    def test_method_body_count(self):
        swf = SWFInterpreter(b'')
        self.assertEqual(swf.method_body_count, 0)

    def test_all_methods(self):
        swf = SWFInterpreter(b'')
        self.assertEqual(swf._all_methods, [])

    def test_classes_by_name(self):
        swf = SWFInterpreter(b'')
        self.assertEqual(swf._classes_by_name, {})

    def test_make_object(self):
        swf = SWFInterpreter(b'')
        avm_class = _AVMClass('(no name idx)', 'String')
        result = swf.make_object()
        self.assertEqual(result, undefined)

    def test_avm_class(self):
        swf = SWFInterpreter(b'')
        avm_class = _AVMClass('(no name idx)', 'String')
        self.assertEqual(avm_class.name, '(no name idx)')
        self.assertEqual(avm_class.cname, 'String')

    def test_avm_class_object(self):
        swf = SWFInterpreter(b'')
        avm_class = _AVMClass('(no name idx)', 'String')
        result = swf.make_object()
        self.assertEqual(result, undefined)

    def test_extract_function_private(self):
        swf = SWFInterpreter(b'')
        avm_class = _AVMClass('(no name idx)', 'String')
        func_name = '_private_method'
        with self.assertRaises(AttributeError):
            swf.extract_function(avm_class, func_name)

    def test_extract_function_protected(self):
        swf = SWFInterpreter(b'')
        avm_class = _AVMClass('(no name idx)', 'String')
        func_name = '_protected_method'
        with self.assertRaises(AttributeError):
            swf.extract_function(avm_class, func_name)

    def test_extract_function_magic(self):
        swf = SWFInterpreter(b'')
        avm_class = _AVMClass('(no name idx)', 'String')
        func_name = '__init__'
        with self.assertRaises(AttributeError):
            swf.extract_function(avm_class, func_name)

if __name__ == '__main__':
    unittest.main()