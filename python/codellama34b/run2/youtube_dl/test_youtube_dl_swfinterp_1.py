import unittest
from youtube_dl.swfinterp import _read_int



class TestSWFInterpreter(unittest.TestCase):
    def test_extract_function(self):
        file_contents = ''
        interpreter = SWFInterpreter(file_contents)
        avm_class = ''
        func_name = ''
        resfunc = interpreter.extract_function(avm_class, func_name)
        self.assertEqual(resfunc, '')

if __name__ == '__main__':
    unittest.main()