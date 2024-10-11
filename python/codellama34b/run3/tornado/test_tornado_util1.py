import unittest
from tornado.util import *

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

if __name__ == '__main__':
    unittest.main()