import unittest
from youtube_dl.swfinterp import SWFInterpreter


class TestSWFInterpreter(unittest.TestCase):
    def test_init(self):
        swf = SWFInterpreter(b'')
        self.assertEqual(swf._patched_functions, {(TimerClass, 'addEventListener'): lambda params: undefined})
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
        swf.patch_function(TimerClass, 'addEventListener', lambda params: None)
        self.assertEqual(swf._patched_functions, {(TimerClass, 'addEventListener'): lambda params: None})

    def test_extract_class(self):
        swf = SWFInterpreter(b'')
        res = swf.extract_class('String')
        self.assertIsInstance(res, _AVMClass)
        self.assertEqual(res.name, 'String')
        self.assertEqual(res.cname, 'String')

    def test_extract_function(self):
        swf = SWFInterpreter(b'')
        res = swf.extract_function(TimerClass, 'addEventListener')
        self.assertEqual(res, lambda params: undefined)

    def test_parse_traits_info(self):
        swf = SWFInterpreter(b'')
        methods, constants = swf.parse_traits_info()
        self.assertIsInstance(methods, dict)
        self.assertIsNone(constants)

    def test_class_count(self):
        swf = SWFInterpreter(b'')
        swf.class_count = 1
        self.assertEqual(swf.classes, [TimerClass])

    def test_method_count(self):
        swf = SWFInterpreter(b'')
        swf.method_count = 1
        self.assertEqual(swf.method_infos, [MethodInfo(NEED_ARGUMENTS, NEED_REST)])

    def test_metadata_count(self):
        swf = SWFInterpreter(b'')
        swf.metadata_count = 1
        self.assertEqual(swf.metadata_count, 1)

    def test_script_count(self):
        swf = SWFInterpreter(b'')
        swf.script_count = 1
        self.assertEqual(swf.script_count, 1)

    def test_method_body_count(self):
        swf = SWFInterpreter(b'')
        swf.method_body_count = 1
        self.assertEqual(swf.method_body_count, 1)

    def test_all_methods(self):
        swf = SWFInterpreter(b'')
        swf._all_methods = [Method(b'', 0)]
        self.assertEqual(swf._all_methods, [Method(b'', 0)])

    def test_classes_by_name(self):
        swf = SWFInterpreter(b'')
        swf._classes_by_name = {TimerClass.name: TimerClass}
        self.assertEqual(swf._classes_by_name, {TimerClass.name: TimerClass})

    def test_patch_function_private(self):
        swf = SWFInterpreter(b'')
        swf._patched_functions = {(TimerClass, 'addEventListener'): lambda params: undefined}
        self.assertEqual(swf._patched_functions, {(TimerClass, 'addEventListener'): lambda params: undefined})

    def test_patch_function_protected(self):
        swf = SWFInterpreter(b'')
        swf._patched_functions = {(TimerClass, 'addEventListener'): lambda params: undefined}
        self.assertEqual(swf._patched_functions, {(TimerClass, 'addEventListener'): lambda params: undefined})

    def test_patch_function_magic(self):
        swf = SWFInterpreter(b'')
        swf._patched_functions = {(TimerClass, 'addEventListener'): lambda params: undefined}
        self.assertEqual(swf._patched_functions, {(TimerClass, 'addEventListener'): lambda params: undefined})

if __name__ == '__main__':
    unittest.main()