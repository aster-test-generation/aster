import unittest
from youtube_dl.swfinterp import _u32, _read_int, StringClass, ByteArrayClass, TimerClass, TimerEventClass, _builtin_classes, undefined, _AVMClass, _AVMClass_Object, _ScopeDict


class TestSwfInterp(unittest.TestCase):
    def test_u32(self):
        self.assertEqual(_u32(b'\x00\x00\x00\x01'), 1)
        self.assertEqual(_u32(b'\x00\x00\x01\x00'), 256)
        self.assertEqual(_u32(b'\x00\x01\x00\x00'), 65536)
        self.assertEqual(_u32(b'\x01\x00\x00\x00'), 16777216)

    def test_read_int(self):
        self.assertEqual(_read_int(b'\x00\x00\x00\x01'), 1)
        self.assertEqual(_read_int(b'\x00\x00\x01\x00'), 256)
        self.assertEqual(_read_int(b'\x00\x01\x00\x00'), 65536)
        self.assertEqual(_read_int(b'\x01\x00\x00\x00'), 16777216)

    def test_string_class(self):
        string_class = StringClass()
        self.assertEqual(string_class.name, 'String')
        self.assertEqual(string_class.name_idx, '(no name idx)')
        self.assertEqual(string_class.static_properties, {})
        self.assertEqual(string_class.variables, {})
        self.assertEqual(string_class.constants, {})

    def test_byte_array_class(self):
        byte_array_class = ByteArrayClass()
        self.assertEqual(byte_array_class.name, 'ByteArray')
        self.assertEqual(byte_array_class.name_idx, '(no name idx)')
        self.assertEqual(byte_array_class.static_properties, {})
        self.assertEqual(byte_array_class.variables, {})
        self.assertEqual(byte_array_class.constants, {})

    def test_timer_class(self):
        timer_class = TimerClass()
        self.assertEqual(timer_class.name, 'Timer')
        self.assertEqual(timer_class.name_idx, '(no name idx)')
        self.assertEqual(timer_class.static_properties, {})
        self.assertEqual(timer_class.variables, {})
        self.assertEqual(timer_class.constants, {})

    def test_timer_event_class(self):
        timer_event_class = TimerEventClass()
        self.assertEqual(timer_event_class.name, 'TimerEvent')
        self.assertEqual(timer_event_class.name_idx, '(no name idx)')
        self.assertEqual(timer_event_class.static_properties, {'TIMER': 'timer'})
        self.assertEqual(timer_event_class.variables, {})
        self.assertEqual(timer_event_class.constants, {})

    def test_builtin_classes(self):
        self.assertEqual(_builtin_classes, {'String': StringClass, 'ByteArray': ByteArrayClass, 'Timer': TimerClass, 'TimerEvent': TimerEventClass})

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
        self.assertEqual(avm_class.variables, {})
        self.assertEqual(avm_class.constants, {})

    def test_avm_class_object(self):
        avm_

if __name__ == '__main__':
    unittest.main()