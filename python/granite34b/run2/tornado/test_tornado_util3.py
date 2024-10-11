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

    def test_timeout_error(self):
        try:
            raise TimeoutError
        except TimeoutError:
            pass

    def test_object_dict(self):
        obj = ObjectDict()
        obj.key = "value"
        self.assertEqual(obj.key, "value")

    def test_gzip_decompressor(self):
        decompressor = GzipDecompressor()
        value = b"value"
        max_length = 100
        self.assertEqual(decompressor.decompress(value, max_length), b"")

    def test_import_object(self):
        name = "name"
        self.assertEqual(import_object(name), None)

    def test_exec_in(self):
        code = "code"
        glob = {}
        loc = None
        exec_in(code, glob, loc)

    def test_raise_exc_info(self):
        exc_info = (None, None, None)
        raise_exc_info(exc_info)

    def test_errno_from_exception(self):
        e = Exception()
        self.assertEqual(errno_from_exception(e), None)

    def test_re_unescape(self):
        s = "s"
        self.assertEqual(re_unescape(s), s)

    def test_configurable(self):
        base = Configurable.configurable_base()
        self.assertEqual(base, None)

    def test_arg_replacer(self):
        func = lambda x: x
        name = "name"
        replacer = ArgReplacer(func, name)
        args = [1]
        kwargs = {}
        old_value, args, kwargs = replacer.replace(2, args, kwargs)
        self.assertEqual(old_value, 1)
        self.assertEqual(args, [2])
        self.assertEqual(kwargs, {})

    def test_timedelta_to_seconds(self):
        td = 1
        self.assertEqual(timedelta_to_seconds(td), 1)

    def test_websocket_mask(self):
        mask = b"mask"
        data = b"data"
        self.assertEqual(_websocket_mask(mask, data), b"")

if __name__ == '__main__':
    unittest.main()