import unittest
from youtube_dl.swfinterp import SWFInterpreter


class TestSWFInterpreter(unittest.TestCase):
    def test_init(self):
        file_contents = b''
        swf_interpreter = SWFInterpreter(file_contents)
        self.assertEqual(swf_interpreter._patched_functions, {(TimerClass, 'addEventListener'): lambda params: undefined})

    def test_patch_function(self):
        swf_interpreter = SWFInterpreter(b'')
        avm_class = _AVMClass('(no name idx)', 'String')
        func_name = 'addEventListener'
        f = lambda params: undefined
        swf_interpreter.patch_function(avm_class, func_name, f)
        self.assertEqual(swf_interpreter._patched_functions, {(avm_class, func_name): f})

    def test_extract_class(self):
        swf_interpreter = SWFInterpreter(b'')
        class_name = '(no name idx)'
        res = swf_interpreter.extract_class(class_name)
        self.assertIsInstance(res, _AVMClass)

    def test_extract_function(self):
        swf_interpreter = SWFInterpreter(b'')
        avm_class = _AVMClass('(no name idx)', 'String')
        func_name = '$cinit'
        res = swf_interpreter.extract_function(avm_class, func_name)
        self.assertEqual(res, self._all_methods[avm_class.cinit_idx])

    def test__init__(self):
        swf_interpreter = SWFInterpreter(b'')
        self.assertEqual(swf_interpreter._patched_functions, {(TimerClass, 'addEventListener'): lambda params: undefined})

    def test__str__(self):
        swf_interpreter = SWFInterpreter(b'')
        self.assertEqual(str(swf_interpreter), 'SWFInterpreter')

    def test__repr__(self):
        swf_interpreter = SWFInterpreter(b'')
        self.assertEqual(repr(swf_interpreter), 'SWFInterpreter({})')

    def test__eq__(self):
        swf_interpreter1 = SWFInterpreter(b'')
        swf_interpreter2 = SWFInterpreter(b'')
        self.assertEqual(swf_interpreter1, swf_interpreter2)

if __name__ == '__main__':
    unittest.main()