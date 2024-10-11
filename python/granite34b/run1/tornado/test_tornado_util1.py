import unittest
from tornado.util import *

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


if __name__ == '__main__':
    unittest.main()