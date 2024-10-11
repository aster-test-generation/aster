import unittest
from youtube_dl.swfinterp import _read_int



class TestSWFInterpreter(unittest.TestCase):
    def test_init(self):
        file_contents = b'test'
        instance = SWFInterpreter(file_contents)
        self.assertEqual(instance._patched_functions, {(TimerClass, 'addEventListener'): lambda params: undefined})

    def test_patch_function(self):
        instance = SWFInterpreter(b'test')
        avm_class = _AVMClass('(no name idx)', 'String')
        func_name = 'test'
        f = lambda params: undefined
        instance.patch_function(avm_class, func_name, f)
        self.assertEqual(instance._patched_functions, {(TimerClass, 'addEventListener'): lambda params: undefined, (avm_class, func_name): f})

if __name__ == '__main__':
    unittest.main()