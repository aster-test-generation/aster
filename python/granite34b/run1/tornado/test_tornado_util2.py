import unittest
from tornado.util import *

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


if __name__ == '__main__':
    unittest.main()