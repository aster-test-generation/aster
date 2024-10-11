import unittest
from youtube_dl.swfinterp import _u32, _read_int, StringClass, ByteArrayClass, TimerClass, TimerEventClass, _builtin_classes, undefined, _AVMClass, _ScopeDict, _AVMClass_Object


class TestSwfInterp(unittest.TestCase):
    def test_u32(self):
        self.assertEqual(_u32(b'\x01\x02\x03\x04'), 16909060)

    def test_read_int(self):
        self.assertEqual(_read_int(b'\x01\x02\x03\x04'), 16909060)

    def test_string_class(self):
        string_class = StringClass
        self.assertEqual(string_class.name_idx, '(no name idx)')
        self.assertEqual(string_class.name, 'String')
        self.assertEqual(string_class.static_properties, {})
        self.assertEqual(string_class.variables, _ScopeDict(string_class))
        self.assertEqual(string_class.constants, {})

    def test_byte_array_class(self):
        byte_array_class = ByteArrayClass
        self.assertEqual(byte_array_class.name_idx, '(no name idx)')
        self.assertEqual(byte_array_class.name, 'ByteArray')
        self.assertEqual(byte_array_class.static_properties, {})
        self.assertEqual(byte_array_class.variables, _ScopeDict(byte_array_class))
        self.assertEqual(byte_array_class.constants, {})

    def test_timer_class(self):
        timer_class = TimerClass
        self.assertEqual(timer_class.name_idx, '(no name idx)')
        self.assertEqual(timer_class.name, 'Timer')
        self.assertEqual(timer_class.static_properties, {})
        self.assertEqual(timer_class.variables, _ScopeDict(timer_class))
        self.assertEqual(timer_class.constants, {})

    def test_timer_event_class(self):
        timer_event_class = TimerEventClass
        self.assertEqual(timer_event_class.name_idx, '(no name idx)')
        self.assertEqual(timer_event_class.name, 'TimerEvent')
        self.assertEqual(timer_event_class.static_properties, {'TIMER': 'timer'})
        self.assertEqual(timer_event_class.variables, _ScopeDict(timer_event_class))
        self.assertEqual(timer_event_class.constants, {})

    def test_builtin_classes(self):
        self.assertEqual(_builtin_classes, {StringClass.name: StringClass, ByteArrayClass.name: ByteArrayClass, TimerClass.name: TimerClass, TimerEventClass.name: TimerEventClass})

    def test_undefined(self):
        self.assertEqual(undefined, _Undefined())

    def test_avm_class(self):
        avm_class = _AVMClass('(no name idx)', 'TestClass')
        self.assertEqual(avm_class.name_idx, '(no name idx)')
        self.assertEqual(avm_class.name, 'TestClass')
        self.assertEqual(avm_class.method_names, {})
        self.assertEqual(avm_class.method_idxs, {})
        self.assertEqual(avm_class.methods, {})
        self.assertEqual(avm_class.method_pyfunctions, {})
        self.assertEqual(avm_class.static_properties, {})
        self.assertEqual(avm_class.variables, _ScopeDict(avm_class))
        self.assertEqual(avm_class.constants, {})

    def test_scope_dict(self):
        scope_dict = _ScopeDict(_AVMClass('(no name idx)', 'TestClass'))
        self.assertEqual(scope_dict.class_object, _AVMClass('(no name idx)', 'TestClass'))
        self.assertEqual(scope_dict.parent, None)
        self.assertEqual(scope_dict.properties, {})

    def test_avm_class_object(self):
        avm_class_object = _AVMClass_Object(_AVMClass('(no name idx)', 'TestClass'))
        self.assertEqual(avm_class_object.class_object, _AVMClass('(no name idx)', 'TestClass'))
        self.assertEqual(avm_class_object.parent, None)
        self.assertEqual(avm_class_object.properties, {})

if __name__ == '__main__':
    unittest.main()