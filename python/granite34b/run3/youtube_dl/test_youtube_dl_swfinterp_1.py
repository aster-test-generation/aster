import unittest
from youtube_dl.swfinterp import SWFInterpreter as _read_int


class TestSWFInterpreter(unittest.TestCase):
    def test_init(self):
        file_contents = b'example_file_contents'
        interpreter = SWFInterpreter(file_contents)
        self.assertIsInstance(interpreter, SWFInterpreter)

    def test_extract_function(self):
        file_contents = b'example_file_contents'
        interpreter = SWFInterpreter(file_contents)
        avm_class = _AVMClass('example_class_name', 'ExampleClass')
        func_name = 'example_function_name'
        result = interpreter.extract_function(avm_class, func_name)
        self.assertIsNotNone(result)

if __name__ == '__main__':
    unittest.main()