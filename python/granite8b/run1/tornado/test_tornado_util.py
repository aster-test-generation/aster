import sys
import unittest
from tornado.util import ObjectDict, GzipDecompressor, import_object, exec_in, raise_exc_info, errno_from_exception, re_unescape, Configurable, ArgReplacer, timedelta_to_seconds, _websocket_mask, doctests


class TestObjectDict(unittest.TestCase):
    def test_getattr(self):
        d = ObjectDict()
        d['foo'] = 'bar'
        self.assertEqual(d.foo, 'bar')

    def test_setattr(self):
        d = ObjectDict()
        d.foo = 'bar'
        self.assertEqual(d['foo'], 'bar')

class TestGzipDecompressor(unittest.TestCase):
    def test_decompress(self):
        decompressor = GzipDecompressor()
        compressed_data = b'x\x9c\x01\x02\x03\x00\x00\x0b'
        decompressed_data = decompressor.decompress(compressed_data)
        self.assertEqual(decompressed_data, b'\x01\x02\x03')

    def test_unconsumed_tail(self):
        decompressor = GzipDecompressor()
        compressed_data = b'x\x9c\x01\x02\x03\x00\x00\x0b'
        decompressor.decompress(compressed_data)
        self.assertEqual(decompressor.unconsumed_tail, b'\x00\x00\x0b')

    def test_flush(self):
        decompressor = GzipDecompressor()
        compressed_data = b'x\x9c\x01\x02\x03\x00\x00\x0b'
        decompressor.decompress(compressed_data + b'extra')
        flushed_data = decompressor.flush()
        self.assertEqual(flushed_data, b'')

class TestImportObject(unittest.TestCase):
    def test_import_module(self):
        module = import_object('os')
        self.assertEqual(module.__name__, 'os')

    def test_import_class(self):
        obj = import_object('tornado.util.ObjectDict')
        self.assertEqual(obj.__name__, 'ObjectDict')

    def test_import_function(self):
        func = import_object('tornado.util.re_unescape')
        self.assertEqual(func.__name__, 're_unescape')

class TestExecIn(unittest.TestCase):
    def test_exec_in_global(self):
        glob = {}
        exec_in('x = 1', glob)
        self.assertEqual(glob['x'], 1)

    def test_exec_in_local(self):
        glob = {}
        loc = {}
        exec_in('x = 1', glob, loc)
        self.assertEqual(loc['x'], 1)

class TestRaiseExcInfo(unittest.TestCase):
    def test_raise_exc_info(self):
        try:
            raise Exception('test')
        except Exception as e:
            raise_exc_info(sys.exc_info())

class TestErrnoFromException(unittest.TestCase):
    def test_errno_from_exception(self):
        e = OSError(1, 'test')
        self.assertEqual(errno_from_exception(e), 1)


if __name__ == '__main__':
    unittest.main()