import unittest
from youtube_dl.swfinterp import SWFInterpreter, _AVMClass, _Undefined, _read_int, _read_bytes, _read_byte, _read_string, _Multinam
from youtube_dl.swfinterp import ExtractorError


class TestSWFInterpreter(unittest.TestCase):
    def test_init(self):
        swf = SWFInterpreter(b'')
        self.assertEqual(swf._patched_functions, {(TimerClass, 'addEventListener'): lambda params: _Undefined()})
        self.assertEqual(swf.constant_ints, [0])
        self.assertEqual(swf.constant_uints, [0])
        self.assertEqual(swf.constant_strings, [''])
        self.assertEqual(swf.multinames, [''])
        self.assertEqual(swf.method_infos, [])
        self.assertEqual(swf.metadata_count, 0)
        self.assertEqual(swf.classes, [])
        self.assertEqual(swf._classes_by_name, {})
        self.assertEqual(swf._all_methods, [])

    def test_patch_function(self):
        swf = SWFInterpreter(b'')
        avm_class = _AVMClass('(no name idx)', 'String')
        swf.patch_function(avm_class, 'addEventListener', lambda params: 1)
        self.assertEqual(swf._patched_functions, {(avm_class, 'addEventListener'): lambda params: 1})

    def test_extract_class(self):
        swf = SWFInterpreter(b'')
        avm_class = _AVMClass('(no name idx)', 'String')
        swf._classes_by_name = {'String': avm_class}
        swf.extract_class('String')
        self.assertEqual(swf._classes_by_name, {'String': avm_class})

    def test_extract_function(self):
        swf = SWFInterpreter(b'')
        avm_class = _AVMClass('(no name idx)', 'String')
        swf._all_methods = [Method(b'code', 0)]
        swf.extract_function(avm_class, '$cinit')
        self.assertEqual(swf._all_methods[0].code, b'code')

    def test__read_int(self):
        swf = SWFInterpreter(b'')
        self.assertEqual(_read_int(swf, 0), 0)
        self.assertEqual(_read_int(swf, 1), 1)
        self.assertEqual(_read_int(swf, 2), 2)

    def test__read_bytes(self):
        swf = SWFInterpreter(b'')
        self.assertEqual(_read_bytes(swf, 0), b'')
        self.assertEqual(_read_bytes(swf, 1), b'\x00')

    def test__read_byte(self):
        swf = SWFInterpreter(b'')
        self.assertEqual(_read_byte(swf), 0)

    def test__read_string(self):
        swf = SWFInterpreter(b'')
        self.assertEqual(_read_string(swf), '')

    def test__Multiname(self):
        swm = _Multiname(0)
        self.assertEqual(swm.kind, 0)

    def test__AVMClass(self):
        avm = _AVMClass('(no name idx)', 'String')
        self.assertEqual(avm.name, '(no name idx)')
        self.assertEqual(avm.cname, 'String')

    def test__Undefined(self):
        undefined = _Undefined()
        self.assertEqual(undefined, _Undefined())

if __name__ == '__main__':
    unittest.main()