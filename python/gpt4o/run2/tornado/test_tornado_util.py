import unittest
from tornado.util import *


class TestTimeoutError(unittest.TestCase):
    def test_timeout_error(self):
        with self.assertRaises(TimeoutError):
            raise TimeoutError()

class TestObjectDict(unittest.TestCase):
    def test_getattr(self):
        obj = ObjectDict()
        obj['key'] = 'value'
        self.assertEqual(obj.key, 'value')

    def test_getattr_key_error(self):
        obj = ObjectDict()
        with self.assertRaises(AttributeError):
            _ = obj.non_existent_key

    def test_setattr(self):
        obj = ObjectDict()
        obj.key = 'value'
        self.assertEqual(obj['key'], 'value')

class TestGzipDecompressor(unittest.TestCase):
    def test_init(self):
        decompressor = GzipDecompressor()
        self.assertIsInstance(decompressor.decompressobj, zlib.Decompress)

    def test_decompress(self):
        decompressor = GzipDecompressor()
        compressed_data = zlib.compress(b"test data")
        decompressed_data = decompressor.decompress(compressed_data)
        self.assertEqual(decompressed_data, b"test data")

    def test_unconsumed_tail(self):
        decompressor = GzipDecompressor()
        self.assertEqual(decompressor.unconsumed_tail, b'')

    def test_flush(self):
        decompressor = GzipDecompressor()
        self.assertEqual(decompressor.flush(), b'')

class TestImportObject(unittest.TestCase):
    def test_import_builtin(self):
        self.assertIs(import_object('os'), os)

    def test_import_module(self):
        self.assertIs(import_object('os.path'), os.path)

    def test_import_error(self):
        with self.assertRaises(ImportError):
            import_object('non.existent.module')

class TestExecIn(unittest.TestCase):
    def test_exec_in(self):
        glob = {}
        loc = {}
        exec_in("a = 1", glob, loc)
        self.assertEqual(loc['a'], 1)

class TestRaiseExcInfo(unittest.TestCase):
    def test_raise_exc_info(self):
        try:
            raise ValueError("test")
        except ValueError as e:
            exc_info = (type(e), e, e.__traceback__)
            with self.assertRaises(ValueError):
                raise_exc_info(exc_info)

class TestErrnoFromException(unittest.TestCase):
    def test_errno_from_exception_with_errno(self):
        class CustomException(Exception):
            def __init__(self, errno):
                self.errno = errno

        e = CustomException(5)
        self.assertEqual(errno_from_exception(e), 5)

    def test_errno_from_exception_with_args(self):
        e = ValueError(5)
        self.assertEqual(errno_from_exception(e), 5)

    def test_errno_from_exception_none(self):
        e = ValueError()
        self.assertIsNone(errno_from_exception(e))

class TestReUnescape(unittest.TestCase):
    def test_re_unescape(self):
        self.assertEqual(re_unescape(r'\\n'), r'\n')

    def test_re_unescape_error(self):
        with self.assertRaises(ValueError):
            re_unescape(r'\a')

class TestConfigurable(unittest.TestCase):
    class TestConfigurable(Configurable):
        @classmethod
        def configurable_base(cls):
            return cls

        @classmethod
        def configurable_default(cls):
            return cls

    def test_new(self):
        instance = self.TestConfigurable()
        self.assertIsInstance(instance, self.TestConfigurable)

    def test_configure(self):
        self.TestConfigurable.configure(self.TestConfigurable)
        self.assertEqual(self.TestConfigurable.configured_class(), self.TestConfigurable)

    def test_save_restore_configuration(self):
        saved = self.TestConfigurable._save_configuration()
        self.TestConfigurable._restore_configuration(saved)
        self.assertEqual(self.TestConfigurable._save_configuration(), saved)

class TestArgReplacer(unittest.TestCase):
    def test_get_old_value(self):
        def func(a, b, c):
            pass

        replacer = ArgReplacer(func, 'b')
        self.assertEqual(replacer.get_old_value((1, 2, 3), {}), 2)

    def test_replace(self):
        def func(a, b, c):
            pass

        replacer = ArgReplacer(func, 'b')
        old_value, args, kwargs = replacer.replace(4, (1, 2, 3), {})
        self.assertEqual(old_value, 2)
        self.assertEqual(args, [1, 4, 3])

class TestTimdeltaToSeconds(unittest.TestCase):
    def test_timedelta_to_seconds(self):
        import datetime
        td = datetime.timedelta(seconds=5)
        self.assertEqual(timedelta_to_seconds(td), 5)

class TestWebsocketMaskPython(unittest.TestCase):
    def test_websocket_mask_python(self):
        mask = b'\x01\x02\x03\x04'
        data = b'\x05\x06\x07\x08'
        self.assertEqual(_websocket_mask_python(mask, data), b'\x04\x04\x04\x0c')

class TestDoctests(unittest.TestCase):
    def test_doctests(self):
        suite = doctests()
        self.assertIsInstance(suite, unittest.TestSuite)

if __name__ == '__main__':
    unittest.main()