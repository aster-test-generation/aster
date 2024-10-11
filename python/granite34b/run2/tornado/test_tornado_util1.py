import unittest
from tornado.util import (
    bytes_type,
    unicode_type,
    basestring_type,
    is_finalizing,
    TimeoutError,
    ObjectDict,
    GzipDecompressor,
    import_object,
    exec_in,
    raise_exc_info,
    errno_from_exception,
    re_unescape,
    Configurable,
    ArgReplacer,
    timedelta_to_seconds,
    _websocket_mask_python,
    _websocket_mask,
    doctests,
)

class TestTornadoUtil(unittest.TestCase):
    def test_bytes_type(self):
        self.assertEqual(bytes_type, bytes)

    def test_unicode_type(self):
        self.assertEqual(unicode_type, str)

    def test_basestring_type(self):
        self.assertEqual(basestring_type, str)

    def test_is_finalizing(self):
        self.assertFalse(is_finalizing())

    def test_TimeoutError(self):
        try:
            raise TimeoutError()
        except TimeoutError:
            pass

    def test_ObjectDict(self):
        obj = ObjectDict(key="value")
        self.assertEqual(obj.key, "value")

    def test_GzipDecompressor(self):
        decompressor = GzipDecompressor()
        self.assertEqual(decompressor.decompress(b"data"), b"decompressed_data")

    def test_import_object(self):
        obj = import_object("module.Class")
        self.assertEqual(obj.__class__.__name__, "Class")

    def test_exec_in(self):
        exec_in("x = 1", {})
        self.assertEqual(x, 1)

    def test_raise_exc_info(self):
        try:
            raise_exc_info((Exception, Exception("error"), None))
        except Exception as e:
            self.assertEqual(str(e), "error")

    def test_errno_from_exception(self):
        self.assertEqual(errno_from_exception(Exception("error")), None)

    def test_re_unescape(self):
        self.assertEqual(re_unescape(r"\a"), "a")

    def test_Configurable(self):
        class TestConfigurable(Configurable):
            @classmethod
            def configurable_base(cls):
                return cls

            @classmethod
            def configurable_default(cls):
                return cls

        instance = TestConfigurable()
        self.assertEqual(instance.__class__.__name__, "TestConfigurable")

    def test_ArgReplacer(self):
        def func(x):
            return x + 1

        replacer = ArgReplacer(func, "x")
        old_value, args, kwargs = replacer.replace(2, (1,), {})
        self.assertEqual(old_value, 1)
        self.assertEqual(args, (2,))
        self.assertEqual(kwargs, {})

    def test_timedelta_to_seconds(self):
        self.assertEqual(timedelta_to_seconds(timedelta(days=1)), 86400)

    def test_websocket_mask(self):
        self.assertEqual(_websocket_mask(b"mask", b"data"), b"masked_data")

if __name__ == '__main__':
    unittest.main()