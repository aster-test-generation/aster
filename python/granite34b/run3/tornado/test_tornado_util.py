import unittest
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


class TestTimeoutError(unittest.TestCase):
    def test_timeout_error(self):
        try:
            raise TimeoutError()
        except TimeoutError:
            self.assertTrue(True)
        else:
            self.fail("Expected TimeoutError")

class TestObjectDict(unittest.TestCase):
    def test_object_dict(self):
        d = ObjectDict(a=1, b=2)
        self.assertEqual(d.a, 1)
        self.assertEqual(d.b, 2)
        with self.assertRaises(AttributeError):
            d.c
        d.c = 3
        self.assertEqual(d.c, 3)

class TestGzipDecompressor(unittest.TestCase):
    def test_gzip_decompressor(self):
        decompressor = GzipDecompressor()
        value = b"test"
        max_length = 100
        decompressed_value = decompressor.decompress(value + b'0', max_length)
        self.assertEqual(decompressed_value, b"test")
        self.assertEqual(decompressor.unconsumed_tail, b"")
        self.assertEqual(decompressor.flush(), b"")

class TestImportObject(unittest.TestCase):
    def test_import_object(self):
        obj = import_object("os")
        self.assertEqual(obj, os)
        with self.assertRaises(ImportError):
            import_object("does_not_exist")

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
            self.fail("Expected Exception")

class TestErrnoFromException(unittest.TestCase):
    def test_errno_from_exception(self):
        try:
            raise OSError(1, "test")
        except OSError as e:
            self.assertEqual(errno_from_exception(e), 1)
        else:
            self.fail("Expected OSError")

class TestReUnescape(unittest.TestCase):
    def test_re_unescape(self):
        s = "test\\n"
        unescaped_s = re_unescape(s)
        self.assertEqual(unescaped_s, "test\n")

class TestConfigurable(unittest.TestCase):
    def test_configurable(self):
        base = Configurable.configurable_base()
        impl = Configurable.configured_class()
        self.assertEqual(impl, base)
        Configurable.configure(impl)
        self.assertEqual(impl, base)
        Configurable.configure(impl, a=1)
        self.assertEqual(impl, base)
        self.assertEqual(base.__impl_kwargs, {"a": 1})

class TestArgReplacer(unittest.TestCase):
    def test_arg_replacer(self):
        def func(a, b):
            return a + b
        replacer = ArgReplacer(func, "a")
        old_value, args, kwargs = replacer.replace(1, (2, 3), {})
        self.assertEqual(old_value, 2)
        self.assertEqual(args, (1, 3))
        self.assertEqual(kwargs, {})

class TestTimeDeltaToSeconds(unittest.TestCase):
    def test_timedelta_to_seconds(self):
        import datetime
        seconds = timedelta_to_seconds(td)
        self.assertEqual(seconds, 1234)


class TestTimeoutError(unittest.TestCase):
    def test_timeout_error(self):
        try:
            raise TimeoutError()
        except TimeoutError:
            pass

class TestObjectDict(unittest.TestCase):
    def test_object_dict(self):
        obj = ObjectDict()
        obj['key'] = 'value'
        self.assertEqual(obj['key'], 'value')
        self.assertEqual(obj.key, 'value')

class TestGzipDecompressor(unittest.TestCase):
    def test_gzip_decompressor(self):
        decompressor = GzipDecompressor()
        value = b'value'
        max_length = 100
        result = decompressor.decompress(value, max_length)
        self.assertEqual(result, b'value')

class TestImportObject(unittest.TestCase):
    def test_import_object(self):
        name = 'name'
        result = import_object(name)
        self.assertEqual(result, __import__(name))

class TestExecIn(unittest.TestCase):
    def test_exec_in(self):
        code = 'code'
        glob = {'key': 'value'}
        loc = {'key': 'value'}
        exec_in(code, glob, loc)
        self.assertEqual(glob['key'], 'value')
        self.assertEqual(loc['key'], 'value')

class TestRaiseExcInfo(unittest.TestCase):
    def test_raise_exc_info(self):
        exc_info = (Exception, Exception('error'), None)
        try:
            raise_exc_info(exc_info)
        except Exception as e:
            self.assertEqual(str(e), 'error')

class TestErrnoFromException(unittest.TestCase):
    def test_errno_from_exception(self):
        e = Exception('error')
        result = errno_from_exception(e)
        self.assertEqual(result, None)

class TestReUnescape(unittest.TestCase):
    def test_re_unescape(self):
        s = 's'
        result = re_unescape(s)
        self.assertEqual(result, s)

class TestConfigurable(unittest.TestCase):
    def test_configurable(self):
        base = Configurable.configurable_base()
        impl = Configurable.configured_class()
        self.assertEqual(impl, base)

class TestArgReplacer(unittest.TestCase):
    def test_arg_replacer(self):
        func = lambda x: x
        name = 'x'
        replacer = ArgReplacer(func, name)
        args = (1,)
        kwargs = {}
        old_value, args, kwargs = replacer.replace(2, args, kwargs)
        self.assertEqual(old_value, 1)
        self.assertEqual(args, (2,))
        self.assertEqual(kwargs, {})

class TestTimedeltaToSeconds(unittest.TestCase):
    def test_timedelta_to_seconds(self):
        td = datetime.timedelta(days=1, hours=1, minutes=1, seconds=1)
        result = timedelta_to_seconds(td)
        self.assertEqual(result, 1)

class TestWebsocketMask(unittest.TestCase):
    def test_websocket_mask(self):
        mask = b'mask'
        data = b'data'
        result = _websocket_mask(mask, data)
        self.assertEqual(result, b'data')

class TestDoctests(unittest.TestCase):
    def test_doctests(self):
        suite = doctests()
        runner = unittest.TextTestRunner()
        result = runner.run(suite)
        self.assertEqual(result.wasSuccessful(), True)

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
            raise TimeoutError
        except TimeoutError:
            pass

    def test_ObjectDict(self):
        obj = ObjectDict(key="value")
        self.assertEqual(obj.key, "value")

    def test_GzipDecompressor(self):
        decompressor = GzipDecompressor()
        self.assertEqual(decompressors.decompress(b"data"), b"decompressed_data")

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
        self.assertEqual(re_unescape("string"), "unescaped_string")

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
        def test_function(x):
            return x + 1

        replacer = ArgReplacer(test_function, "x")
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