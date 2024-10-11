import unittest
from tornado.util import *


class TestTimeoutError(unittest.TestCase):
    def test_TimeoutError(self):
        instance = TimeoutError()
        self.assertEqual(instance.__class__.__name__, "TimeoutError")

class TestObjectDict(unittest.TestCase):
    def test_ObjectDict(self):
        instance = ObjectDict()
        self.assertEqual(instance.__class__.__name__, "ObjectDict")

class TestGzipDecompressor(unittest.TestCase):
    def test_GzipDecompressor(self):
        instance = GzipDecompressor()
        self.assertEqual(instance.__class__.__name__, "GzipDecompressor")

class TestImportObject(unittest.TestCase):
    def test_import_object(self):
        result = import_object("tornado.util")
        self.assertEqual(result.__name__, "tornado.util")

class TestExecIn(unittest.TestCase):
    def test_exec_in(self):
        glob = {}
        loc = {}
        exec_in("a = 1", glob, loc)
        self.assertEqual(glob["a"], 1)

class TestRaiseExcInfo(unittest.TestCase):
    def test_raise_exc_info(self):
        try:
            raise Exception("test")
        except Exception as e:
            import sys
        raise_exc_info(exc_info)

class TestErrnoFromException(unittest.TestCase):
    def test_errno_from_exception(self):
        e = Exception("test")
        result = errno_from_exception(e)
        self.assertEqual(result, 'test')

class TestReUnescape(unittest.TestCase):
    def test_re_unescape(self):
        s = "\\\\"
        result = re_unescape(s)
        self.assertEqual(result, "\\")

class TestConfigurable(unittest.TestCase):
    def test_Configurable(self):
        instance = Configurable(10, 20)
        self.assertEqual(instance.__class__.__name__, "Configurable")

class TestArgReplacer(unittest.TestCase):
    def test_ArgReplacer(self):
        def test_func(a, b, c):
            pass
        instance = ArgReplacer(test_func, "b")
        self.assertEqual(instance.__class__.__name__, "ArgReplacer")

class TestTimedeltaToSeconds(unittest.TestCase):
    def test_timedelta_to_seconds(self):
        from datetime import datetime, timedelta
        result = timedelta_to_seconds(td)
        self.assertEqual(result, 86400)

class TestWebsocketMask(unittest.TestCase):
    def test_websocket_mask(self):
        mask = b"1234"
        data = b"1234"
        result = websocket_mask(mask, data)
        self.assertEqual(result, b"1234")

class TestDoctests(unittest.TestCase):
    def test_doctests(self):
        result = doctests()
        self.assertEqual(result.__class__.__name__, "_DocTestSuite")

class TestTimeoutError(unittest.TestCase):
    def test_timeout_error(self):
        self.assertRaises(TimeoutError, TimeoutError)

class TestObjectDict(unittest.TestCase):
    def test_object_dict(self):
        self.assertRaises(TypeError, ObjectDict, 1)

class TestGzipDecompressor(unittest.TestCase):
    def test_gzip_decompressor(self):
        self.assertRaises(TypeError, GzipDecompressor, 1)

class TestImportObject(unittest.TestCase):
    def test_import_object(self):
        self.assertRaises(ImportError, import_object, 1)

class TestExecIn(unittest.TestCase):
    def test_exec_in(self):
        self.assertRaises(TypeError, exec_in, 1, 1, 1)

class TestRaiseExcInfo(unittest.TestCase):
    def test_raise_exc_info(self):
        self.assertRaises(TypeError, raise_exc_info, 1)

class TestErrnoFromException(unittest.TestCase):
    def test_errno_from_exception(self):
        self.assertRaises(ValueError, errno_from_exception, 1)

class TestReUnescape(unittest.TestCase):
    def test_re_unescape(self):
        self.assertRaises(ValueError, re_unescape, 1)

class TestConfigurable(unittest.TestCase):
    def test_configurable(self):
        self.assertRaises(NotImplementedError, Configurable.configurable_base)

class TestArgReplacer(unittest.TestCase):
    def test_arg_replacer(self):
        self.assertRaises(ValueError, ArgReplacer, 1, 1)

class TestTimedeltaToSeconds(unittest.TestCase):
    def test_timedelta_to_seconds(self):
        self.assertRaises(TypeError, timedelta_to_seconds, 1)

class TestWebsocketMask(unittest.TestCase):
    def test_websocket_mask(self):
        self.assertRaises(TypeError, _websocket_mask, 1, 1)

class TestDoctests(unittest.TestCase):
    def test_doctests(self):
        self.assertRaises(TypeError, doctests)

if __name__ == '__main__':
    unittest.main()