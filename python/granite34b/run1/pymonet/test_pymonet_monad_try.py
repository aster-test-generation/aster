import unittest
from pymonet.monad_try import Try


class MonadTryTestCase(unittest.TestCase):
    def test_init(self):
        try_instance = Try(1, True)
        self.assertEqual(try_instance.value, 1)
        self.assertTrue(try_instance.is_success)

    def test_eq(self):
        try_instance1 = Try(1, True)
        try_instance2 = Try(1, True)
        self.assertEqual(try_instance1, try_instance2)

    def test_str(self):
        try_instance = Try(1, True)
        self.assertEqual(str(try_instance), 'Try[value=1, is_success=True]')

    def test_of(self):
        def add(x, y):
            return x + y
        try_instance = Try.of(add, 1, 2)
        self.assertEqual(try_instance.value, 3)
        self.assertTrue(try_instance.is_success)

    def test_map(self):
        try_instance = Try(1, True)
        result = try_instance.map(lambda x: x + 1)
        self.assertEqual(result.value, 2)
        self.assertTrue(result.is_success)

    def test_bind(self):
        try_instance = Try(1, True)
        result = try_instance.bind(lambda x: Try(x + 1, True))
        self.assertEqual(result.value, 2)
        self.assertTrue(result.is_success)

    def test_on_success(self):
        try_instance = Try(1, True)
        result = try_instance.on_success(lambda x: x + 1)
        self.assertEqual(result.value, 1)
        self.assertTrue(result.is_success)

    def test_on_fail(self):
        try_instance = Try(1, True)
        result = try_instance.on_fail(lambda x: x + 1)
        self.assertEqual(result.value, 1)
        self.assertTrue(result.is_success)

    def test_filter(self):
        try_instance = Try(1, True)
        result = try_instance.filter(lambda x: x > 0)
        self.assertEqual(result.value, 1)
        self.assertTrue(result.is_success)

    def test_get(self):
        try_instance = Try(1, True)
        self.assertEqual(try_instance.get(), 1)

    def test_get_or_else(self):
        try_instance = Try(1, True)
        self.assertEqual(try_instance.get_or_else(0), 1)

if __name__ == '__main__':
    unittest.main()