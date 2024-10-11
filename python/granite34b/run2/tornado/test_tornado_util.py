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
    _websocket_mask_python,
    _websocket_mask,
    doctests,
)
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


class TestConfigurable(unittest.TestCase):
    def test_new(self):
        base = Configurable.configurable_base()
        init_kwargs = {}
        if Configurable is base:
            impl = Configurable.configured_class()
            if base.__impl_kwargs:
                init_kwargs.update(base.__impl_kwargs)
        else:
            impl = Configurable
        init_kwargs.update({})
        if impl.configurable_base() is not base:
            return impl(*(), **init_kwargs)
        instance = super(Configurable, cls).__new__(impl)
        instance.initialize(*(), **init_kwargs)
        return instance

    def test_configurable_base(self):
        raise NotImplementedError()

    def test_configurable_default(self):
        raise NotImplementedError()

    def test_initialize(self):
        pass

    def test_configure(self):
        base = Configurable.configurable_base()
        if isinstance(impl, str):
            impl = typing.cast(Type[Configurable], import_object(impl))
        if impl is not None and not issubclass(impl, Configurable):
            raise ValueError("Invalid subclass of Configurable")
        base.__impl_class = impl
        base.__impl_kwargs = kwargs

    def test_configured_class(self):
        base = Configurable.configurable_base()
        if base.__dict__.get("_Configurable__impl_class") is None:
            base.__impl_class = Configurable.configurable_default()
        if base.__impl_class is not None:
            return base.__impl_class
        else:
            raise ValueError("configured class not found")

    def test_save_configuration(self):
        base = Configurable.configurable_base()
        return (base.__impl_class, base.__impl_kwargs)

    def test_restore_configuration(self):
        base = Configurable.configurable_base()
        base.__impl_class = saved[0]
        base.__impl_kwargs = saved[1]

class TestArgReplacer(unittest.TestCase):
    def test_init(self):
        name = "test"
        try:
            arg_pos = self._getargnames(func).index(name)
        except ValueError:
            arg_pos = None
        replacer = ArgReplacer(func, name)
        self.assertEqual(replacer.name, name)
        self.assertEqual(replacer.arg_pos, arg_pos)

    def test_getargnames(self):
        func = lambda x, y: x + y
        arg_names = self._getargnames(func)
        self.assertEqual(arg_names, ["x", "y"])

    def test_get_old_value(self):
        name = "test"
        replacer = ArgReplacer(func, name)
        args = (1, 2)
        kwargs = {"test": 3}
        old_value = replacer.get_old_value(args, kwargs)
        self.assertEqual(old_value, 3)

    def test_replace(self):
        name = "test"
        replacer = ArgReplacer(func, name)
        new_value = 4
        args = (1, 2)
        kwargs = {"test": 3}
        old_value, new_args, new_kwargs = replacer.replace(new_value, args, kwargs)
        self.assertEqual(old_value, 3)
        self.assertEqual(new_args, (1, 4))
        self.assertEqual(new_kwargs, {"test": 4})

class TestDeltaTimeSeconds(unittest.TestCase):
    def test_timedelta_to_seconds(self):
        td = datetime.timedelta(days=1, hours=2, minutes=3, seconds=4)
        seconds = timedelta_to_seconds(td)
        self.assertEqual(seconds, 1234)

class TestWebsocketMask(unittest.TestCase):
    def test_websocket_mask_python(self):
        mask = b"mask"
        data = b"data"
        result = _websocket_mask_python(mask, data)
        self.assertEqual(result, b"masked_data")

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

class TestTimeoutError(unittest.TestCase):
    def test_timeout_error(self):
        try:
            raise TimeoutError()
        except TimeoutError as e:
            self.assertEqual(str(e), "Timeout")

class TestObjectDict(unittest.TestCase):
    def test_object_dict(self):
        d = ObjectDict(a=1, b=2)
        self.assertEqual(d.a, 1)
        self.assertEqual(d.b, 2)
        self.assertEqual(d.get("a"), 1)
        self.assertEqual(d.get("c"), None)
        d.c = 3
        self.assertEqual(d.c, 3)

class TestGzipDecompressor(unittest.TestCase):
    def test_gzip_decompressor(self):
        decompressor = GzipDecompressor()
        value = b"test"
        max_length = 100
        result = decompressor.decompress(value, max_length)
        self.assertEqual(result, b"test")

class TestImportObject(unittest.TestCase):
    def test_import_object(self):
        name = "tornado.util"
        result = import_object(name)
        self.assertEqual(result, tornado.util)

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

class TestErrnoFromException(unittest.TestCase):
    def test_errno_from_exception(self):
        e = Exception("test")
        result = errno_from_exception(e)
        self.assertEqual(result, None)

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

class TestTimedeltaToSeconds(unittest.TestCase):
    def test_timedelta_to_seconds(self):
        td = datetime.timedelta(days=1, hours=2, minutes=3, seconds=4)
        result = timedelta_to_seconds(td)
        self.assertEqual(result, 100000)

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