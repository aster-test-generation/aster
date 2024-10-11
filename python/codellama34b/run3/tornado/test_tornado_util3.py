import unittest
from tornado.util import *

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

if __name__ == '__main__':
    unittest.main()