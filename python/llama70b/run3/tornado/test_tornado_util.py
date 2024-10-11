from tornado.util import _websocket_mask
import unittest
from tornado.util import *
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
        e = TimeoutError()
        self.assertIsInstance(e, Exception)

class TestObjectDict(unittest.TestCase):
    def test_init(self):
        d = ObjectDict()
        self.assertIsInstance(d, dict)

    def test_getattr(self):
        d = ObjectDict({'foo': 'bar'})
        self.assertEqual(d.foo, 'bar')

    def test_setattr(self):
        d = ObjectDict()
        d.foo = 'bar'
        self.assertEqual(d['foo'], 'bar')

class TestGzipDecompressor(unittest.TestCase):
    def test_init(self):
        d = GzipDecompressor()
        self.assertIsInstance(d.decompressobj, zlib.decompressobj)

    def test_decompress(self):
        d = GzipDecompressor()
        data = b'hello'
        decompressed = d.decompress(data)
        self.assertEqual(decompressed, data)

    def test_unconsumed_tail(self):
        d = GzipDecompressor()
        data = b'hello'
        d.decompress(data)
        self.assertEqual(d.unconsumed_tail, b'')

    def test_flush(self):
        d = GzipDecompressor()
        data = b'hello'
        d.decompress(data)
        self.assertEqual(d.flush(), b'')

class TestImportObject(unittest.TestCase):
    def test_import_object(self):
        obj = import_object('tornado.util')
        self.assertEqual(obj.__name__, 'util')

class TestExecIn(unittest.TestCase):
    def test_exec_in(self):
        code = 'x = 5'
        glob = {}
        exec_in(code, glob)
        self.assertEqual(glob['x'], 5)

class TestRaiseExcInfo(unittest.TestCase):
    def test_raise_exc_info(self):
        exc_info = (ValueError, ValueError('test'), None)
        with self.assertRaises(ValueError):
            raise_exc_info(exc_info)

class TestErrnoFromException(unittest.TestCase):
    def test_errno_from_exception(self):
        e = OSError(1, 'test')
        self.assertEqual(errno_from_exception(e), 1)

class TestReUnescape(unittest.TestCase):
    def test_re_unescape(self):
        s = r'\x61'
        self.assertEqual(re_unescape(s), 'a')

class TestConfigurable(unittest.TestCase):
    def test_configurable_base(self):
        c = Configurable()
        with self.assertRaises(NotImplementedError):
            c.configurable_base()

    def test_configurable_default(self):
        c = Configurable()
        with self.assertRaises(NotImplementedError):
            c.configurable_default()

    def test_initialize(self):
        c = Configurable()
        c.initialize()

    def test_configure(self):
        c = Configurable()
        c.configure('tornado.util.Configurable', foo='bar')

    def test_configured_class(self):
        c = Configurable()
        with self.assertRaises(ValueError):
            c.configured_class()

class TestArgReplacer(unittest.TestCase):
    def test_init(self):
        f = lambda x: x
        r = ArgReplacer(f, 'x')
        self.assertEqual(r.name, 'x')

    def test_get_old_value(self):
        f = lambda x: x
        r = ArgReplacer(f, 'x')
        args = [1]
        kwargs = {}
        self.assertEqual(r.get_old_value(args, kwargs), 1)

    def test_replace(self):
        f = lambda x: x
        r = ArgReplacer(f, 'x')
        args = [1]
        kwargs = {}
        old_value, new_args, new_kwargs = r.replace(2, args, kwargs)
        self.assertEqual(old_value, 1)
        self.assertEqual(new_args, [2])
        self.assertEqual(new_kwargs, {})

class TestTimedeltaToSeconds(unittest.TestCase):
    def test_timedelta_to_seconds(self):
        from datetime import timedelta
        td = timedelta(seconds=5)
        self.assertEqual(timedelta_to_seconds(td), 5)

class TestWebSocketMask(unittest.TestCase):
    def test_websocket_mask(self):
        mask = b'\x01\x02\x03\x04'
        data = b'hello'
        self.assertEqual(_websocket_mask(mask, data), b'\x05\x07\x09\x0b\x0d')

class TestDoctests(unittest.TestCase):
    def test_doctests(self):
        suite = doctests()
        self.assertIsInstance(suite, unittest.TestSuite)

class TestObjectDict(unittest.TestCase):
    def test_getattr(self):
        d = ObjectDict({'a': 1, 'b': 2})
        self.assertEqual(d.a, 1)
        self.assertEqual(d.b, 2)

    def test_setattr(self):
        d = ObjectDict({'a': 1, 'b': 2})
        d.c = 3
        self.assertEqual(d.c, 3)

    def test_getattr_missing(self):
        d = ObjectDict({'a': 1, 'b': 2})
        with self.assertRaises(AttributeError):
            d.c

class TestExecIn(unittest.TestCase):
    def test_exec_in(self):
        code = 'x = 1'
        glob = {}
        exec_in(code, glob)
        self.assertEqual(glob['x'], 1)

class TestRaiseExcInfo(unittest.TestCase):
    def test_raise_exc_info(self):
        exc_info = (None, ValueError('test'), None)
        with self.assertRaises(ValueError):
            raise_exc_info(exc_info)

class TestConfigurable(unittest.TestCase):
    def test_configurable_base(self):
        with self.assertRaises(NotImplementedError):
            Configurable.configurable_base()

    def test_configurable_default(self):
        with self.assertRaises(NotImplementedError):
            Configurable.configurable_default()

    def test_initialize(self):
        c = Configurable()
        c.initialize()

    def test_configure(self):
        c = Configurable()
        c.configure('tornado.util.Configurable', foo='bar')
        self.assertEqual(c.configurable_base().__impl_class, Configurable)
        self.assertEqual(c.configurable_base().__impl_kwargs, {'foo': 'bar'})

    def test_configured_class(self):
        c = Configurable()
        c.configure('tornado.util.Configurable', foo='bar')
        self.assertEqual(c.configured_class(), Configurable)

    def test_save_restore_configuration(self):
        c = Configurable()
        c.configure('tornado.util.Configurable', foo='bar')
        saved = c._save_configuration()
        c._restore_configuration(saved)
        self.assertEqual(c.configurable_base().__impl_class, Configurable)
        self.assertEqual(c.configurable_base().__impl_kwargs, {'foo': 'bar'})

class TestArgReplacer(unittest.TestCase):
    def test_init(self):
        a = ArgReplacer(lambda x: x, 'x')
        self.assertEqual(a.name, 'x')

    def test_get_old_value(self):
        a = ArgReplacer(lambda x: x, 'x')
        args = [1, 2]
        kwargs = {'x': 3}
        self.assertEqual(a.get_old_value(args, kwargs), 3)

    def test_replace(self):
        a = ArgReplacer(lambda x: x, 'x')
        args = [1, 2]
        kwargs = {'x': 3}
        old_value, new_args, new_kwargs = a.replace(4, args, kwargs)
        self.assertEqual(old_value, 3)
        self.assertEqual(new_args, [1, 2])
        self.assertEqual(new_kwargs, {'x': 4})

class TestTimedeltaToSeconds(unittest.TestCase):
    def test_timedelta_to_seconds(self):
        from datetime import timedelta
        td = timedelta(seconds=1)
        self.assertEqual(timedelta_to_seconds(td), 1)


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

class TestObjectDict(unittest.TestCase):
    def test_getattr(self):
        d = ObjectDict({'a': 1, 'b': 2})
        self.assertEqual(d.a, 1)
        self.assertEqual(d.b, 2)
        with self.assertRaises(AttributeError):
            d.c

    def test_setattr(self):
        d = ObjectDict({'a': 1, 'b': 2})
        d.c = 3
        self.assertEqual(d.c, 3)
        self.assertIn('c', d)

class TestGzipDecompressor(unittest.TestCase):
    def test_init(self):
        g = GzipDecompressor()
        self.assertIsNotNone(g.decompressobj)

    def test_decompress(self):
        g = GzipDecompressor()
        data = b'hello'
        decompressed = g.decompress(data)
        self.assertEqual(decompressed, data)

    def test_unconsumed_tail(self):
        g = GzipDecompressor()
        data = b'hello'
        g.decompress(data)
        self.assertEqual(g.unconsumed_tail, b'')

    def test_flush(self):
        g = GzipDecompressor()
        data = b'hello'
        g.decompress(data)
        self.assertEqual(g.flush(), b'')

class TestImportObject(unittest.TestCase):
    def test_import_object(self):
        obj = import_object('tornado.util')
        self.assertIsNotNone(obj)

class TestExecIn(unittest.TestCase):
    def test_exec_in(self):
        code = 'x = 1'
        glob = {'x': 0}
        exec_in(code, glob)
        self.assertEqual(glob['x'], 1)

class TestReUnescape(unittest.TestCase):
    def test_re_unescape(self):
        s = r'\a'
        self.assertEqual(re_unescape(s), 'a')

class TestConfigurable(unittest.TestCase):
    def test_configurable_base(self):
        with self.assertRaises(NotImplementedError):
            Configurable.configurable_base()

    def test_configurable_default(self):
        with self.assertRaises(NotImplementedError):
            Configurable.configurable_default()

    def test_initialize(self):
        c = Configurable()
        c.initialize()

    def test_configure(self):
        c = Configurable()
        c.configure('tornado.util.Configurable', foo='bar')

    def test_configured_class(self):
        c = Configurable()
        self.assertIs(c.configured_class(), Configurable)

    def test_save_configuration(self):
        c = Configurable()
        saved = c._save_configuration()
        self.assertIsNotNone(saved)

    def test_restore_configuration(self):
        c = Configurable()
        saved = c._save_configuration()
        c._restore_configuration(saved)

class TestArgReplacer(unittest.TestCase):
    def test_init(self):
        a = ArgReplacer(lambda x: x, 'x')
        self.assertIsNotNone(a.arg_pos)

    def test_get_old_value(self):
        a = ArgReplacer(lambda x: x, 'x')
        self.assertIsNone(a.get_old_value([], {}))

    def test_replace(self):
        a = ArgReplacer(lambda x: x, 'x')
        old_value, args, kwargs = a.replace(1, [2], {'y': 3})
        self.assertEqual(old_value, 2)
        self.assertEqual(args, [1])
        self.assertEqual(kwargs, {'y': 3})

class TestTimedeltaToSeconds(unittest.TestCase):
    def test_timedelta_to_seconds(self):
        from datetime import timedelta
        td = timedelta(seconds=1)
        self.assertEqual(timedelta_to_seconds(td), 1)

class TestWebsocketMask(unittest.TestCase):
    def test_websocket_mask(self):
        mask = b'\x01\x02\x03\x04'
        data = b'hello'
        self.assertEqual(_websocket_mask(mask, data), b'\x09\x07\x0b\x0d\x0f')

if __name__ == '__main__':
    unittest.main()