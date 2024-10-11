import unittest
from pymonet.monad_try import Try


class TestTry(unittest.TestCase):
    def test_init(self):
        try_instance = Try(1, True)
        self.assertEqual(try_instance.value, 1)
        self.assertEqual(try_instance.is_success, True)

    def test_eq(self):
        try_instance_1 = Try(1, True)
        try_instance_2 = Try(1, True)
        self.assertEqual(try_instance_1, try_instance_2)

    def test_str(self):
        try_instance = Try(1, True)
        self.assertEqual(str(try_instance), 'Try[value=1, is_success=True]')

    def test_of(self):
        try_instance = Try.of(lambda x: x + 1, 1)
        self.assertEqual(try_instance.value, 2)
        self.assertEqual(try_instance.is_success, True)

    def test_of_with_exception(self):
        try_instance = Try.of(lambda x: x + 1, 'a')
        self.assertIsInstance(try_instance.value, Exception)
        self.assertEqual(try_instance.is_success, False)

    def test_map(self):
        try_instance = Try(1, True).map(lambda x: x + 1)
        self.assertEqual(try_instance.value, 2)
        self.assertEqual(try_instance.is_success, True)

    def test_bind(self):
        try_instance = Try(1, True).bind(lambda x: Try(x + 1, True))
        self.assertEqual(try_instance.value, 2)
        self.assertEqual(try_instance.is_success, True)

    def test_on_success(self):
        called = False
        def success_callback(value):
            nonlocal called
            called = True
            self.assertEqual(value, 1)
        Try(1, True).on_success(success_callback)
        self.assertTrue(called)

    def test_on_fail(self):
        called = False
        def fail_callback(value):
            nonlocal called
            called = True
            self.assertIsInstance(value, Exception)
        Try(1, True).on_fail(fail_callback)
        self.assertFalse(called)

    def test_filter(self):
        try_instance = Try(1, True).filter(lambda x: x > 0)
        self.assertEqual(try_instance.value, 1)
        self.assertEqual(try_instance.is_success, True)

    def test_get(self):
        try_instance = Try(1, True)
        self.assertEqual(try_instance.get(), 1)

    def test_get_or_else(self):
        try_instance = Try(1, True)
        self.assertEqual(try_instance.get_or_else(2), 1)
        try_instance = Try(1, False)
        self.assertEqual(try_instance.get_or_else(2), 2)

if __name__ == '__main__':
    unittest.main()