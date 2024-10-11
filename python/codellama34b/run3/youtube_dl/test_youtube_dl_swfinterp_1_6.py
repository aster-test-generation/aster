import unittest
from youtube_dl.swfinterp import _read_int


class TestSWFInterpreter(unittest.TestCase):
    def test_init(self):
        instance = SWFInterpreter(b'')
        self.assertEqual(instance.constant_ints, [0])
        self.assertEqual(instance.constant_uints, [0])
        self.assertEqual(instance.constant_strings, [''])
        self.assertEqual(instance.multinames, [''])
        self.assertEqual(instance._classes_by_name, {})
        self.assertEqual(instance._all_methods, [])

    def test_patch_function(self):
        instance = SWFInterpreter(b'')
        avm_class = _AVMClass('(no name idx)', 'String')
        func_name = 'func_name'
        f = lambda params: undefined
        instance.patch_function(avm_class, func_name, f)
        self.assertEqual(instance._patched_functions[avm_class, func_name], f)

    def test_extract_class(self):
        instance = SWFInterpreter(b'')
        class_name = 'class_name'
        call_cinit = True
        res = instance.extract_class(class_name, call_cinit)
        self.assertEqual(res, self._classes_by_name[class_name])

if __name__ == '__main__':
    unittest.main()