import unittest
from youtube_dl.swfinterp import SWFInterpreter



class TestSWFInterpreter(unittest.TestCase):
    def test_init(self):
        file_contents = 'file_contents'
        instance = SWFInterpreter(file_contents)
        self.assertEqual(instance._patched_functions, {(TimerClass, 'addEventListener'): lambda params: undefined})
        self.assertEqual(instance.constant_ints, [0])
        self.assertEqual(instance.constant_uints, [0])
        self.assertEqual(instance.multinames, [''])
        self.assertEqual(instance._classes_by_name, dict(((c.name, c) for c in classes)))
        self.assertEqual(instance._all_methods, [])

    def test_extract_function(self):
        avm_

if __name__ == '__main__':
    unittest.main()