import os
import unittest
from tornado.util import ObjectDict, GzipDecompressor, import_object, exec_in, raise_exc_info, errno_from_exception, _re_unescape_replacement, re_unescape, Configurable, ArgReplacer, timedelta_to_seconds, _websocket_mask


class TestObjectDict(unittest.TestCase):
    def test_getattr(self):
        obj = ObjectDict()
        obj['a'] = 1
        self.assertEqual(obj.a, 1)
        with self.assertRaises(AttributeError):
            obj.b

    def test_setattr(self):
        obj = ObjectDict()
        obj.a = 1
        self.assertEqual(obj['a'], 1)
        obj['b'] = 2
        self.assertEqual(obj.b, 2)

    def test_delattr(self):
        obj = ObjectDict()
        obj.a = 1
        del obj.a
        with self.assertRaises(AttributeError):
            obj.a

class TestGzipDecompressor(unittest.TestCase):
    def test_decompress(self):
        decompressor = GzipDecompressor()
        compressed_data = b'H4sIAAAAAAAEAO29B2AcSZYlJi9tynt/Sv8Pending+eHh9/f3++7wDHpforeM'
        decompressed_data = decompressor.decompress(compressed_data)
        self.assertEqual(decompressed_data, b'Hello, world!')

    def test_flush(self):
        decompressor = GzipDecompressor()
        compressed_data = b'H4sIAAAAAAAEAO29B2AcSZYlJi9tynt/Sv8Pending+eHh9/f3++7wDHpforeM'
        decompressed_data = decompressor.decompress(compressed_data)
        self.assertEqual(decompressor.flush(), b'')

class TestImportObject(unittest.TestCase):
    def test_import_module(self):
        obj = import_object('os')
        self.assertEqual(obj, os)

    def test_import_class(self):
        obj = import_object('tornado.util.ObjectDict')
        self.assertEqual(obj, ObjectDict)

    def test_import_function(self):
        obj = import_object('tornado.util.re_unescape')
        self.assertEqual(obj, re_unescape)

class TestExecIn(unittest.TestCase):
    def test_exec_in(self):
        glob = {}
        exec_in('x = 1', glob)
        self.assertEqual(glob['x'], 1)

class TestRaiseExcInfo(unittest.TestCase):
    def test_raise_exc_info(self):
        try:
            raise Exception('test')
        except Exception as e:
            raise_exc_info((type(e), e, None))

class TestErrnoFromException(unittest.TestCase):
    def test_errno_from_exception(self):
        e = OSError(1, 'test')
        self.assertEqual(errno_from_exception(e), 1)


if __name__ == '__main__':
    unittest.main()