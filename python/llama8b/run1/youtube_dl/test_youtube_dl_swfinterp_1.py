import unittest
from youtube_dl.swfinterp import SWFInterpreter


class TestSWFInterpreter(unittest.TestCase):
    def test_init(self):
        swf = SWFInterpreter(b'')
        self.assertEqual(swf._patched_functions, {(TimerClass, 'addEventListener'): lambda params: undefined})
        self.assertEqual(swf._classes_by_name, {})
        self.assertEqual(swf._all_methods, [])

    def test_extract_function(self):
        swf = SWFInterpreter(b'')
        avm_class = _AVMClass('(no name idx)', 'String')
        func_name = 'method_one'
        self.assertRaises(ExtractorError, swf.extract_function, avm_class, func_name)

    def test_patch_function(self):
        swf = SWFInterpreter(b'')
        avm_class = _AVMClass('(no name idx)', 'String')
        func_name = 'method_one'
        swf._patched_functions[(avm_class, func_name)] = lambda params: 'patched'
        self.assertEqual(swf.extract_function(avm_class, func_name), 'patched')

    def test_method_body(self):
        swf = SWFInterpreter(b'')
        avm_class = _AVMClass('(no name idx)', 'String')
        method_body = [1, 2, 3]
        swf._all_methods.append(Method(method_body, 0))
        self.assertEqual(swf.extract_function(avm_class, 'method_one')([1, 2]), 3)

    def test_avm_class(self):
        swf = SWFInterpreter(b'')
        avm_class = _AVMClass('(no name idx)', 'String')
        self.assertEqual(avm_class.name, '(no name idx)')
        self.assertEqual(avm_class.cname, 'String')
        self.assertEqual(avm_class.variables, {})

    def test_avm_class_object(self):
        swf = SWFInterpreter(b'')
        avm_class = _AVMClass('(no name idx)', 'String')
        avm_class_object = _AVMClass_Object(avm_class)
        self.assertEqual(avm_class_object.avm_class, avm_class)

    def test_scope_dict(self):
        swf = SWFInterpreter(b'')
        scope_dict = _ScopeDict({'a': 1, 'b': 2})
        self.assertEqual(scope_dict['a'], 1)
        self.assertEqual(scope_dict['b'], 2)

    def test_multiname(self):
        swf = SWFInterpreter(b'')
        multiname = _Multiname(1, 'String')
        self.assertEqual(multiname.kind, 1)
        self.assertEqual(multiname.name, 'String')

    def test_timer_class(self):
        swf = SWFInterpreter(b'')
        timer_class = TimerClass
        self.assertEqual(timer_class.name, '(no name idx)')
        self.assertEqual(timer_class.cname, 'Timer')

    def test_timer_event_class(self):
        swf = SWFInterpreter(b'')
        timer_event_class = TimerEventClass
        self.assertEqual(timer_event_class.name, '(no name idx)')
        self.assertEqual(timer_event_class.cname, 'TimerEvent')

    def test_builtin_classes(self):
        swf = SWFInterpreter(b'')
        self.assertEqual(_builtin_classes, {StringClass.name: StringClass, ByteArrayClass.name: ByteArrayClass, TimerClass.name: TimerClass, TimerEventClass.name: TimerEventClass})

    def test_undefined(self):
        swf = SWFInterpreter(b'')
        self.assertEqual(undefined, 'undefined')

    def test_compat_str(self):
        swf = SWFInterpreter(b'')
        self.assertEqual(compat_str('hello'), 'hello')

    def test_int(self):
        swf = SWFInterpreter(b'')
        self.assertEqual(int(1), 1)

    def test_float(self):
        swf = SWFInterpreter(b'')
        self.assertEqual(float(1.0), 1.0)

if __name__ == '__main__':
    unittest.main()