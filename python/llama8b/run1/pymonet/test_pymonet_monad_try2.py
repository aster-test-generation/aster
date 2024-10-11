import unittest
from pymonet.monad_try import Try

class TestTry(unittest.TestCase):
    def test_init(self):
        try_obj = Try(1, True)
        self.assertEqual(try_obj.value, 1)
        self.assertTrue(try_obj.is_success)

    def test_eq(self):
        try_obj1 = Try(1, True)
        try_obj2 = Try(1, True)
        self.assertTrue(try_obj1 == try_obj2)

    def test_str(self):
        try_obj = Try(1, True)
        self.assertEqual(str(try_obj), 'Try[value=1, is_success=True]')

    def test_of(self):
        def fn():
            return 1
        try_obj = Try.of(fn)
        self.assertTrue(try_obj.is_success)
        self.assertEqual(try_obj.value, 1)

    def test_of_failure(self):
        def fn():
            raise Exception('Error')
        try_obj = Try.of(fn)
        self.assertFalse(try_obj.is_success)

    def test_map(self):
        try_obj = Try(1, True)
        mapped_try_obj = try_obj.map(lambda x: x + 1)
        self.assertTrue(mapped_try_obj.is_success)
        self.assertEqual(mapped_try_obj.value, 2)

    def test_bind(self):
        try_obj = Try(1, True)
        def binder(x):
            return Try(x + 1, True)
        result = try_obj.bind(binder)
        self.assertTrue(result.is_success)
        self.assertEqual(result.value, 2)

    def test_on_success(self):
        try_obj = Try(1, True)
        def success_callback(x):
            self.assertEqual(x, 1)
        try_obj.on_success(success_callback)

    def test_on_fail(self):
        try_obj = Try(1, False)
        def fail_callback(x):
            self.assertEqual(x, 1)
        try_obj.on_fail(fail_callback)

    def test_filter(self):
        try_obj = Try(1, True)
        filtered_try_obj = try_obj.filter(lambda x: x > 0)
        self.assertTrue(filtered_try_obj.is_success)
        self.assertEqual(filtered_try_obj.value, 1)

    def test_filter_failure(self):
        try_obj = Try(1, True)
        filtered_try_obj = try_obj.filter(lambda x: x < 0)
        self.assertFalse(filtered_try_obj.is_success)

    def test_get(self):
        try_obj = Try(1, True)
        self.assertEqual(try_obj.get(), 1)

    def test_get_or_else(self):
        try_obj = Try(1, False)
        self.assertEqual(try_obj.get_or_else(2), 2)

if __name__ == '__main__':
    unittest.main()