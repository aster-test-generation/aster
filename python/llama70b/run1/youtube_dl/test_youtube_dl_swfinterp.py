import unittest
from youtube_dl.swfinterp import _read_in


class Test_SWFinterp(unittest.TestCase):
    def test__extract_tags(self):
        file_contents = b'WS' + b'\x00' * 10
        result = list(_extract_tags(file_contents))
        self.assertEqual(len(result), 1)

    def test__read_int(self):
        reader = io.BytesIO(b'\x01\x02\x03\x04\x05')
        result = _read_int(reader)
        self.assertEqual(result, 0x0102030405)

    def test__u30(self):
        reader = io.BytesIO(b'\x01\x02\x03\x04\x05')
        result = _u30(reader)
        self.assertEqual(result, 0x0102030405)

    def test__s32(self):
        reader = io.BytesIO(b'\x01\x02\x03\x04')
        result = _s32(reader)
        self.assertEqual(result, 0x01020304)

    def test__s24(self):
        reader = io.BytesIO(b'\x01\x02\x03')
        result = _s24(reader)
        self.assertEqual(result, 0x010203)

    def test__read_string(self):
        reader = io.BytesIO(b'\x05hello')
        result = _read_string(reader)
        self.assertEqual(result, 'hello')

    def test__read_bytes(self):
        reader = io.BytesIO(b'hello')
        result = _read_bytes(5, reader)
        self.assertEqual(result, b'hello')

    def test__read_byte(self):
        reader = io.BytesIO(b'\x01')
        result = _read_byte(reader)
        self.assertEqual(result, 0x01)

    def test_AVMClass_init(self):
        avm_class = _AVMClass('(no name idx)', 'String')
        self.assertEqual(avm_class.name, '(no name idx)')
        self.assertEqual(avm_class.super_name, 'String')

    def test_Undefined_init(self):
        undefined_obj = _Undefined()
        self.assertEqual(undefined_obj.name, 'undefined')

    def test_builtin_classes(self):
        self.assertEqual(len(_builtin_classes), 4)
        self.assertIn('String', _builtin_classes)
        self.assertIn('ByteArray', _builtin_classes)
        self.assertIn('Timer', _builtin_classes)
        self.assertIn('TimerEvent', _builtin_classes)

if __name__ == '__main__':
    unittest.main()