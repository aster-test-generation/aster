import unittest
from tornado.util import ObjectDict, GzipDecompressor, import_object, exec_in, raise_exc_info, errno_from_exception, re_unescape, Configurable, ArgReplacer, timedelta_to_seconds, _websocket_mask, doctests

class TestObjectDict(unittest.TestCase):
    def test_get_attr(self):
        obj = ObjectDict(a=1, b=2)
        self.assertEqual(obj.a, 1)
        self.assertEqual(obj.b, 2)

    def test_set_attr(self):
        obj = ObjectDict()
        obj.a = 1
        self.assertEqual(obj.a, 1)

    def test_del_attr(self):
        obj = ObjectDict(a=1)
        del obj.a
        with self.assertRaises(AttributeError):
            obj.a

class TestGzipDecompressor(unittest.TestCase):
    def test_decompress(self):
        decomp = GzipDecompressor()
        compressed_data = b'\x1f\x8b\x08\x00\x00\x00\x00\x00\x00\xff\x01\x00\x00\xff\xff\x00\x00\x00'
        decompressed_data = decomp.decompress(compressed_data)
        self.assertEqual(decompressed_data, b'\x01\x00\x00\xff\xff')

    def test_flush(self):
        decomp = GzipDecompressor()
        compressed_data = b'\x1f\x8b\x08\x00\x00\x00\x00\x00\x00\xff\x01\x00\x00\xff\xff\x00\x00\x00'
        decompressed_data = decomp.decompress(compressed_data)
        self.assertEqual(decompressed_data, b'\x01\x00\x00\xff\xff')
        flushed_data = decomp.flush()
        self.assertEqual(flushed_data, b'')

class TestImportObject(unittest.TestCase):
    def test_import_object(self):
        obj = import_object('tornado.util')
        self.assertEqual(obj, util)

class TestExecIn(unittest.TestCase):
    def test_exec_in(self):
        glob = {}
        exec_in('a = 1', glob)
        self.assertEqual(glob['a'], 1)

class TestRaiseExcInfo(unittest.TestCase):
    def test_raise_exc_info(self):
        try:
            raise ValueError('test')
        except ValueError:
            exc_info = sys.exc_info()
        raise_exc_info(exc_info)

class TestErrnoFromException(unittest.TestCase):
    def test_errno_from_exception(self):
        e = OSError(1, 'test')
        self.assertEqual(errno_from_exception(e), 1)


if __name__ == '__main__':
    unittest.main()