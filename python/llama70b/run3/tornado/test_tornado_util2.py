import unittest
from tornado.util import (
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
    doctests,
)

class TestTimeoutError(unittest.TestCase):
    def test_init(self):
        e = TimeoutError("test error")
        self.assertEqual(str(e), "test error")

class TestObjectDict(unittest.TestCase):
    def test_getattr(self):
        obj = ObjectDict({"a": 1, "b": 2})
        self.assertEqual(obj.a, 1)
        self.assertEqual(obj.b, 2)

    def test_setattr(self):
        obj = ObjectDict({"a": 1, "b": 2})
        obj.c = 3
        self.assertEqual(obj.c, 3)

class TestGzipDecompressor(unittest.TestCase):
    def test_init(self):
        decompressor = GzipDecompressor()
        self.assertIsNotNone(decompressor.decompressobj)

    def test_decompress(self):
        decompressor = GzipDecompressor()
        data = b"hello world"
        decompressed = decompressor.decompress(data)
        self.assertEqual(decompressed, data)

    def test_unconsumed_tail(self):
        decompressor = GzipDecompressor()
        data = b"hello world"
        decompressor.decompress(data)
        self.assertEqual(decompressor.unconsumed_tail, b"")

    def test_flush(self):
        decompressor = GzipDecompressor()
        data = b"hello world"
        decompressor.decompress(data)
        self.assertEqual(decompressor.flush(), b"")

class TestImportObject(unittest.TestCase):
    def test_import_object(self):
        obj = import_object("tornado.util")
        self.assertIsNotNone(obj)

class TestExecIn(unittest.TestCase):
    def test_exec_in(self):
        code = "x = 1"
        glob = {"x": 0}
        exec_in(code, glob)
        self.assertEqual(glob["x"], 1)

class TestRaiseExcInfo(unittest.TestCase):
    def test_raise_exc_info(self):
        exc_info = (ValueError, ValueError("test error"), None)
        with self.assertRaises(ValueError):
            raise_exc_info(exc_info)

class TestErrnoFromException(unittest.TestCase):
    def test_errno_from_exception(self):
        e = OSError(1, "test error")
        self.assertEqual(errno_from_exception(e), 1)

class TestReUnescape(unittest.TestCase):
    def test_re_unescape(self):
        s = r"hello\ world"
        self.assertEqual(re_unescape(s), "hello world")

class TestConfigurable(unittest.TestCase):
    def test_configurable_base(self):
        configurable = Configurable()
        with self.assertRaises(NotImplementedError):
            configurable.configurable_base()

    def test_configurable_default(self):
        configurable = Configurable()
        with self.assertRaises(NotImplementedError):
            configurable.configurable_default()

    def test_initialize(self):
        configurable = Configurable()
        configurable.initialize()

    def test_configure(self):
        configurable = Configurable()
        configurable.configure("tornado.util.Configurable", foo="bar")

    def test_configured_class(self):
        configurable = Configurable()
        self.assertIsNotNone(configurable.configured_class())

class TestArgReplacer(unittest.TestCase):
    def test_init(self):
        arg_replacer = ArgReplacer(lambda x: x, "x")
        self.assertIsNotNone(arg_replacer.arg_pos)

    def test_get_old_value(self):
        arg_replacer = ArgReplacer(lambda x: x, "x")
        args = [1, 2, 3]
        kwargs = {"x": 4}
        self.assertEqual(arg_replacer.get_old_value(args, kwargs), 4)

    def test_replace(self):
        arg_replacer = ArgReplacer(lambda x: x, "x")
        args = [1, 2, 3]
        kwargs = {"x": 4}
        old_value, new_args, new_kwargs = arg_replacer.replace(5, args, kwargs)
        self.assertEqual(old_value, 4)
        self.assertEqual(new_args, [1, 2, 3])
        self.assertEqual(new_kwargs, {"x": 5})

class TestTimedeltaToSeconds(unittest.TestCase):
    def test_timedelta_to_seconds(self):
        from datetime import timedelta
        td = timedelta(seconds=10)
        self.assertEqual(timedelta_to_seconds(td), 10)

class TestWebsocketMask(unittest.TestCase):
    def test_websocket_mask_python(self):
        mask = b"abcd"
        data = b"hello world"
        self.assertEqual(_websocket_mask_python(mask, data), b"\x05\x06\x07\x08\x09\x0a\x0b\x0c")

if __name__ == '__main__':
    unittest.main()