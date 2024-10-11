from pytutils.excs import contextmanager
import unittest
from pytutils.excs import ok


class TestOkContextManager(unittest.TestCase):
    def test_ok_context_manager_no_exception(self):
        with ok():
            pass
        self.assertTrue(True)  # No exception raised

    def test_ok_context_manager_with_exception(self):
        with self.assertRaises(Exception):
            with ok():
                raise Exception("Test exception")

    def test_ok_context_manager_with_allowed_exception(self):
        with ok(Exception):
            raise Exception("Test exception")
        self.assertTrue(True)  # No exception raised

    def test_ok_context_manager_with_disallowed_exception(self):
        with self.assertRaises(TypeError):
            with ok(Exception):
                raise TypeError("Test type error")

    def test_ok_context_manager_init(self):
        cm = ok()
        self.assertIsInstance(cm, type(contextmanager())

    def test_ok_context_manager_str(self):
        cm = ok()
        self.assertEqual(str(cm), "<contextlib._GeneratorContextManager object at ...>"

    def test_ok_context_manager_repr(self):
        cm = ok()
        self.assertEqual(str(cm), "<contextmanager ok at {}>".format(hex(id(cm)))

if __name__ == '__main__':
    unittest.main()