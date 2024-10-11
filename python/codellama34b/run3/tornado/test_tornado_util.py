import unittest
from tornado.util import *



class TestTimeoutError(unittest.TestCase):
    def test_TimeoutError(self):
        instance = TimeoutError()
        self.assertIsInstance(instance, Exception)

class TestObjectDict(unittest.TestCase):
    def test_ObjectDict(self):
        instance = ObjectDict()
        self.assertIsInstance(instance, Dict)

    def test_getattr(self):
        instance = ObjectDict()
        result = instance.getattr(1)
        self.assertEqual(result, 2)

    def test_setattr(self):
        instance = ObjectDict()
        result = instance.setattr(1)
        self.assertEqual(result, 2)

class TestGzipDecompressor(unittest.TestCase):
    def test_GzipDecompressor(self):
        instance = GzipDecompressor()
        self.assertIsInstance(instance, object)

    def test_decompress(self):
        instance = GzipDecompressor()
        result = instance.decompress(1)
        self.assertEqual(result, 2)

    def test_unconsumed_tail(self):
        instance = GzipDecompressor()
        result = instance.unconsumed_tail
        self.assertEqual(result, 3)

    def test_flush(self):
        instance = GzipDecompressor()
        result = instance.flush()
        self.assertEqual(result, 4)

class TestImportObject(unittest.TestCase):
    def test_import_object(self):
        result = import_object(1)
        self.assertEqual(result, 2)

class TestExecIn(unittest.TestCase):
    def test_exec_in(self):
        result = exec_in(1, 2, 3)
        self.assertEqual(result, 4)

class TestRaiseExcInfo(unittest.TestCase):
    def test_raise_exc_info(self):
        result = raise_exc_info(1)
        self.assertEqual(result, 2)

class TestErrnoFromException(unittest.TestCase):
    def test_errno_from_exception(self):
        result = errno_from_exception(1)
        self.assertEqual(result, 2)

class TestReUnescape(unittest.TestCase):
    def test_re_unescape(self):
        result = re_unescape(1)
        self.assertEqual(result, 2)

class TestConfigurable(unittest.TestCase):
    def test_Configurable(self):
        instance = Configurable()
        self.assertIsInstance(instance, object)

    def test_configurable_base(self):
        result = Configurable.configurable_base()
        self.assertEqual(result, 1)

    def test_configurable_default(self):
        result = Configurable.configurable_default()
        self.assertEqual(result, 2)

    def test__initialize(self):
        instance = Configurable()
        result = instance._initialize()
        self.assertEqual(result, 3)

    def test_initialize(self):
        instance = Configurable()
        result = instance.initialize()
        self.assertEqual(result, 4)

    def test_configure(self):
        result = Configurable.configure(1, 2)
        self.assertEqual(result, 5)

    def test_configured_class(self):
        result = Configurable.configured_class()
        self.assertEqual(result, 6)

    def test__save_configuration(self):
        result = Configurable._save_configuration()
        self.assertEqual(result, 7)

    def test__restore_configuration(self):
        result = Configurable._restore_configuration(1)
        self.assertEqual(result, 8)

class TestArgReplacer(unittest.TestCase):
    def test_ArgReplacer(self):
        instance = ArgReplacer(1, 2)
        self.assertIsInstance(instance, object)


class TestTimeoutError(unittest.TestCase):
    def test_timeout_error(self):
        instance = TimeoutError()
        self.assertEqual(instance.args, ())

class TestObjectDict(unittest.TestCase):
    def test_object_dict(self):
        instance = ObjectDict()
        self.assertEqual(instance.args, ())

class TestGzipDecompressor(unittest.TestCase):
    def test_gzip_decompressor(self):
        instance = GzipDecompressor()
        self.assertEqual(instance.args, ())

class TestImportObject(unittest.TestCase):
    def test_import_object(self):
        result = import_object("tornado.util")
        self.assertEqual(result, tornado.util)

class TestExecIn(unittest.TestCase):
    def test_exec_in(self):
        glob = {}
        loc = {}
        exec_in("exec_in", glob, loc)
        self.assertEqual(glob["exec_in"], "exec_in")
        self.assertEqual(loc["exec_in"], "exec_in")

class TestRaiseExcInfo(unittest.TestCase):
    def test_raise_exc_info(self):
        exc_info = (None, None, None)
        raise_exc_info(exc_info)
        self.assertEqual(exc_info, (None, None, None))

class TestErrnoFromException(unittest.TestCase):
    def test_errno_from_exception(self):
        e = Exception()
        result = errno_from_exception(e)
        self.assertEqual(result, None)

class TestConfigurable(unittest.TestCase):
    def test_configurable(self):
        instance = Configurable()
        self.assertEqual(instance.args, ())

class TestArgReplacer(unittest.TestCase):
    def test_arg_replacer(self):
        def func(a, b):
            pass
        instance = ArgReplacer(func, "a")
        self.assertEqual(instance.args, ())

class TestTimedeltaToSeconds(unittest.TestCase):
    def test_timedelta_to_seconds(self):
        td = datetime.timedelta(seconds=1)
        result = timedelta_to_seconds(td)
        self.assertEqual(result, 1)

class TestWebsocketMask(unittest.TestCase):
    def test_websocket_mask(self):
        mask = b"1234"
        data = b"1234"
        result = _websocket_mask(mask, data)
        self.assertEqual(result, b"1234")

class TestDoctests(unittest.TestCase):
    def test_doctests(self):
        result = doctests()
        self.assertEqual(result, None)

class TestTimeoutError(unittest.TestCase):
    def test_TimeoutError(self):
        result = TimeoutError()
        self.assertIsNotNone(result)

class TestObjectDict(unittest.TestCase):
    def test_ObjectDict(self):
        result = ObjectDict()
        self.assertIsNotNone(result)

class TestGzipDecompressor(unittest.TestCase):
    def test_GzipDecompressor(self):
        result = GzipDecompressor()
        self.assertIsNotNone(result)

    def test_decompress(self):
        result = GzipDecompressor()
        self.assertIsNotNone(result)

    def test_unconsumed_tail(self):
        result = GzipDecompressor()
        self.assertIsNotNone(result)

    def test_flush(self):
        result = GzipDecompressor()
        self.assertIsNotNone(result)

class TestImportObject(unittest.TestCase):
    def test_import_object(self):
        result = import_object("tornado.util")
        self.assertIsNotNone(result)

class TestExecIn(unittest.TestCase):
    def test_exec_in(self):
        result = exec_in("tornado.util", {})
        self.assertIsNotNone(result)

class TestRaiseExcInfo(unittest.TestCase):
    def test_raise_exc_info(self):
        result = raise_exc_info(None)
        self.assertIsNotNone(result)

class TestErrnoFromException(unittest.TestCase):
    def test_errno_from_exception(self):
        result = errno_from_exception(None)
        self.assertIsNotNone(result)

class TestReUnescape(unittest.TestCase):
    def test_re_unescape(self):
        result = re_unescape("tornado.util")
        self.assertIsNotNone(result)

class TestConfigurable(unittest.TestCase):
    def test_Configurable(self):
        result = Configurable()
        self.assertIsNotNone(result)

    def test_configurable_base(self):
        result = Configurable.configurable_base()
        self.assertIsNotNone(result)

    def test_configurable_default(self):
        result = Configurable.configurable_default()
        self.assertIsNotNone(result)

    def test__initialize(self):
        result = Configurable._initialize()
        self.assertIsNotNone(result)

    def test_initialize(self):
        result = Configurable.initialize()
        self.assertIsNotNone(result)

    def test_configure(self):
        result = Configurable.configure(None)
        self.assertIsNotNone(result)

    def test_configured_class(self):
        result = Configurable.configured_class()
        self.assertIsNotNone(result)

    def test__save_configuration(self):
        result = Configurable._save_configuration()
        self.assertIsNotNone(result)

    def test__restore_configuration(self):
        result = Configurable._restore_configuration(None)
        self.assertIsNotNone(result)

class TestArgReplacer(unittest.TestCase):
    def test_ArgReplacer(self):
        result = ArgReplacer(None, "tornado.util")
        self.assertIsNotNone(result)

    def test_get_old_value(self):
        result = ArgReplacer(None, "tornado.util").get_old_value(None, None)
        self.assertIsNotNone(result)

    def test_replace(self):
        result = ArgReplacer(None, "tornado.util").replace(None, None, None)
        self.assertIsNotNone(result)


class TestTimeoutError(unittest.TestCase):
    def test_TimeoutError(self):
        result = TimeoutError()
        self.assertEqual(result, TimeoutError)

class TestObjectDict(unittest.TestCase):
    def test_ObjectDict(self):
        result = ObjectDict()
        self.assertEqual(result, ObjectDict)

class TestGzipDecompressor(unittest.TestCase):
    def test_GzipDecompressor(self):
        result = GzipDecompressor()
        self.assertEqual(result, GzipDecompressor)

class TestImportObject(unittest.TestCase):
    def test_import_object(self):
        result = import_object("tornado.util")
        self.assertEqual(result, import_object)

class TestExecIn(unittest.TestCase):
    def test_exec_in(self):
        result = exec_in("tornado.util", "tornado.util")
        self.assertEqual(result, exec_in)

class TestRaiseExcInfo(unittest.TestCase):
    def test_raise_exc_info(self):
        result = raise_exc_info("tornado.util")
        self.assertEqual(result, raise_exc_info)

class TestErrnoFromException(unittest.TestCase):
    def test_errno_from_exception(self):
        result = errno_from_exception("tornado.util")
        self.assertEqual(result, errno_from_exception)

class TestReUnescape(unittest.TestCase):
    def test_re_unescape(self):
        result = re_unescape("tornado.util")
        self.assertEqual(result, re_unescape)

class TestConfigurable(unittest.TestCase):
    def test_Configurable(self):
        result = Configurable()
        self.assertEqual(result, Configurable)

class TestArgReplacer(unittest.TestCase):
    def test_ArgReplacer(self):
        result = ArgReplacer("tornado.util", "tornado.util")
        self.assertEqual(result, ArgReplacer)

class TestTimedeltaToSeconds(unittest.TestCase):
    def test_timedelta_to_seconds(self):
        result = timedelta_to_seconds("tornado.util")
        self.assertEqual(result, timedelta_to_seconds)

class TestWebsocketMask(unittest.TestCase):
    def test_websocket_mask(self):
        result = _websocket_mask("tornado.util", "tornado.util")
        self.assertEqual(result, _websocket_mask)

class TestDoctests(unittest.TestCase):
    def test_doctests(self):
        result = doctests()
        self.assertEqual(result, doctests)

class TestExecIn(unittest.TestCase):
    def test_exec_in(self):
        glob = {}
        loc = {}
        code = "a = 1"
        exec_in(code, glob, loc)
        self.assertEqual(glob["a"], 1)

class TestRaiseExcInfo(unittest.TestCase):
    def test_raise_exc_info(self):
        exc_info = (None, None, None)
        with self.assertRaises(TypeError):
            raise_exc_info(exc_info)

class TestReUnescape(unittest.TestCase):
    def test_re_unescape(self):
        s = "\\n"
        result = re_unescape(s)
        self.assertEqual(result, "\n")

class TestArgReplacer(unittest.TestCase):
    def test_arg_replacer(self):
        func = lambda x: x
        name = "x"
        instance = ArgReplacer(func, name)
        self.assertEqual(instance.args, ())

class TestTimedeltaToSeconds(unittest.TestCase):
    def test_timedelta_to_seconds(self):
        td = datetime.timedelta(days=1)
        result = timedelta_to_seconds(td)
        self.assertEqual(result, 86400)

class TestDoctests(unittest.TestCase):
    def test_doctests(self):
        result = doctests()
        self.assertEqual(result.countTestCases(), 1)

if __name__ == '__main__':
    unittest.main()