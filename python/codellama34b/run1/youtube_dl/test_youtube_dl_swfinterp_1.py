import unittest
from youtube_dl.swfinterp import _read_int


class TestSWFInterpreter(unittest.TestCase):
    def test_extract_function(self):
        file_contents = b''
        interpreter = SWFInterpreter(file_contents)
        avm_class = _AVMClass('(no name idx)', 'String')
        func_name = 'func_name'
        res = interpreter.extract_function(avm_class, func_name)
        self.assertEqual(res, undefined)

    def test_init(self):
        file_contents = b''
        interpreter = SWFInterpreter(file_contents)
        self.assertEqual(interpreter._patched_functions, {(TimerClass, 'addEventListener'): lambda params: undefined})
        self.assertEqual(interpreter.constant_ints, [0])
        self.assertEqual(interpreter.constant_uints, [0])
        self.assertEqual(interpreter.constant_strings, [''])
        self.assertEqual(interpreter.multinames, [''])
        self.assertEqual(interpreter._classes_by_name, dict(((c.name, c) for c in [])))
        self.assertEqual(interpreter._all_methods, [])

    def test_constant_ints(self):
        file_contents = b''
        interpreter = SWFInterpreter(file_contents)
        self.assertEqual(interpreter.constant_ints, [0])

    def test_constant_uints(self):
        file_contents = b''
        interpreter = SWFInterpreter(file_contents)
        self.assertEqual(interpreter.constant_uints, [0])

    def test_constant_strings(self):
        file_contents = b''
        interpreter = SWFInterpreter(file_contents)
        self.assertEqual(interpreter.constant_strings, [''])

    def test_multinames(self):
        file_contents = b''
        interpreter = SWFInterpreter(file_contents)
        self.assertEqual(interpreter.multinames, [''])

    def test_classes_by_name(self):
        file_contents = b''
        interpreter = SWFInterpreter(file_contents)
        self.assertEqual(interpreter._classes_by_name, dict(((c.name, c) for c in [])))

    def test_all_methods(self):
        file_contents = b''
        interpreter = SWFInterpreter(file_contents)
        self.assertEqual(interpreter._all_methods, [])

    def test_patched_functions(self):
        file_contents = b''
        interpreter = SWFInterpreter(file_contents)
        self.assertEqual(interpreter._patched_functions, {(TimerClass, 'addEventListener'): lambda params: undefined})


if __name__ == '__main__':
    unittest.main()