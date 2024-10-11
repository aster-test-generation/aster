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
from tornado.util import *
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
        self.assertEqual(import_object("module.Class"), module.Class)

    def test_exec_in(self):
        exec_in("x = 1", locals())
        x = 1

    def test_raise_exc_info(self):
        try:
            raise_exc_info((Exception, Exception("error"), None))
        except Exception as e:
            self.assertEqual(str(e), "error")

    def test_errno_from_exception(self):
        self.assertEqual(errno_from_exception(Exception("error")), 'error')

    def test_re_unescape(self):
        self.assertEqual(re_unescape("string"), "string")

    def test_Configurable(self):
        class TestConfigurable(Configurable):
            @classmethod
            def configurable_base(cls):
                return cls

            @classmethod
            def configurable_default(cls):
                return cls

        instance = TestConfigurable()
        self.assertEqual(instance.configured_class(), TestConfigurable)

    def test_ArgReplacer(self):
        def func(x):
            return x + 1

        replacer = ArgReplacer(func, "x")
        self.assertEqual(replacer.get_old_value((1,), {}), 1)

    def test_timedelta_to_seconds(self):
        self.assertEqual(timedelta_to_seconds(timedelta(days=1)), 86400)

    def test_websocket_mask(self):
        self.assertEqual(_websocket_mask(b"mask", b"data"), b"\t\x00\x07\n")


class TestTimeoutError(unittest.TestCase):
    def test_timeout_error(self):
        try:
            raise TimeoutError()
        except TimeoutError:
            pass
        else:
            self.fail("Expected TimeoutError")

class TestObjectDict(unittest.TestCase):
    def test_object_dict(self):
        d = ObjectDict(a=1, b=2)
        self.assertEqual(d.a, 1)
        self.assertEqual(d.b, 2)
        self.assertEqual(d.get("a"), 1)
        self.assertEqual(d.get("c"), None)
        d.c = 3
        self.assertEqual(d.c, 3)
        del d.c
        self.assertEqual(d.c, None)

class TestGzipDecompressor(unittest.TestCase):
    def test_gzip_decompressor(self):
        d = GzipDecompressor()
        self.assertEqual(d.decompress(b"test"), b"test")
        self.assertEqual(d.decompress(b"test"), b"test")
        self.assertEqual(d.unconsumed_tail, b"")
        self.assertEqual(d.flush(), b"")

class TestImportObject(unittest.TestCase):
    def test_import_object(self):
        self.assertEqual(import_object("os"), os)
        self.assertEqual(import_object("os.path"), os.path)
        with self.assertRaises(ImportError):
            import_object("does_not_exist")

class TestExecIn(unittest.TestCase):
    def test_exec_in(self):
        glob = {"a": 1}
        exec_in("a = 2", glob)
        self.assertEqual(glob["a"], 2)

class TestRaiseExcInfo(unittest.TestCase):
    def test_raise_exc_info(self):
        try:
            raise_exc_info((Exception, Exception("test"), None))
        except Exception as e:
            self.assertEqual(str(e), "test")
        else:
            self.fail("Expected Exception")


class TestTimeoutError(unittest.TestCase):
    def test_timeout_error(self):
        try:
            raise TimeoutError()
        except TimeoutError:
            self.assertTrue(True)
        else:
            self.assertTrue(False)

class TestObjectDict(unittest.TestCase):
    def test_object_dict(self):
        d = ObjectDict(a=1, b=2)
        self.assertEqual(d.a, 1)
        self.assertEqual(d.b, 2)
        self.assertEqual(d.get("a"), 1)
        self.assertEqual(d.get("c"), None)
        d.c = 3
        self.assertEqual(d.c, 3)
        del d.c
        self.assertEqual(d.get("c"), None)

class TestGzipDecompressor(unittest.TestCase):
    def test_gzip_decompressor(self):
        decompressor = GzipDecompressor()
        value = b"test"
        max_length = 100
        result = decompressor.decompress(value, max_length)
        self.assertEqual(result, b"test")

class TestImportObject(unittest.TestCase):
    def test_import_object(self):
        obj = import_object("tornado.util")
        self.assertEqual(obj, tornado.util)

class TestExecIn(unittest.TestCase):
    def test_exec_in(self):
        code = "x = 1"
        glob = {}
        exec_in(code, glob)
        self.assertEqual(glob["x"], 1)

class TestRaiseExcInfo(unittest.TestCase):
    def test_raise_exc_info(self):
        try:
            raise_exc_info((Exception, Exception("test"), None))
        except Exception as e:
            self.assertEqual(str(e), "test")
        else:
            self.assertTrue(False)

class TestErrnoFromException(unittest.TestCase):
    def test_errno_from_exception(self):
        e = Exception("test")
        self.assertEqual(errno_from_exception(e), None)

class TestReUnescape(unittest.TestCase):
    def test_re_unescape(self):
        s = "test"
        result = re_unescape(s)
        self.assertEqual(result, "test")

class TestConfigurable(unittest.TestCase):
    def test_configurable(self):
        base = Configurable.configurable_base()
        impl = Configurable.configured_class()
        self.assertEqual(impl, base)

class TestArgReplacer(unittest.TestCase):
    def test_arg_replacer(self):
        def func(x):
            return x + 1
        replacer = ArgReplacer(func, "x")
        old_value, args, kwargs = replacer.replace(2, (1,), {})
        self.assertEqual(old_value, 1)
        self.assertEqual(args, (2,))
        self.assertEqual(kwargs, {})

class TestTimeDeltaToSeconds(unittest.TestCase):
    def test_timedelta_to_seconds(self):
        td = datetime.timedelta(days=1, hours=2, minutes=3, seconds=4)
        result = timedelta_to_seconds(td)
        self.assertEqual(result, 1234)

class TestWebsocketMask(unittest.TestCase):
    def test_websocket_mask(self):
        mask = b"mask"
        data = b"data"
        result = _websocket_mask(mask, data)
        self.assertEqual(result, b"data")


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
        value = b"value"
        max_length = 100
        self.assertEqual(decompressor.decompress(value, max_length), b"")

    def test_import_object(self):
        name = "name"
        self.assertEqual(import_object(name), None)

    def test_exec_in(self):
        code = "code"
        glob = {}
        loc = {}
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

    def test_Configurable(self):
        class TestConfigurable(Configurable):
            def __init__(self):
                pass

            @classmethod
            def configurable_base(cls):
                pass

            @classmethod
            def configurable_default(cls):
                pass

        TestConfigurable()

    def test_ArgReplacer(self):
        def func(arg):
            pass

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