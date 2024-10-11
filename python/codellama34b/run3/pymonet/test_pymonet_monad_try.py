import unittest
from pymonet.monad_try import *


class TestTry(unittest.TestCase):
    def test_init(self):
        instance = Try(1, True)
        self.assertEqual(instance.value, 1)
        self.assertEqual(instance.is_success, True)

    def test_eq(self):
        instance = Try(1, True)
        self.assertEqual(instance, Try(1, True))

    def test_str(self):
        instance = Try(1, True)
        self.assertEqual(str(instance), 'Try[value=1, is_success=True]')

    def test_of(self):
        instance = Try.of(lambda x: x, 1)
        self.assertEqual(instance, Try(1, True))

    def test_map(self):
        instance = Try(1, True)
        result = instance.map(lambda x: x + 1)
        self.assertEqual(result, Try(2, True))

    def test_bind(self):
        instance = Try(1, True)
        result = instance.bind(lambda x: Try(x + 1, True))
        self.assertEqual(result, Try(2, True))

    def test_on_success(self):
        instance = Try(1, True)
        result = instance.on_success(lambda x: x + 1)
        self.assertEqual(result, Try(1, True))

    def test_on_fail(self):
        instance = Try(1, False)
        result = instance.on_fail(lambda x: x + 1)
        self.assertEqual(result, Try(1, False))

    def test_filter(self):
        instance = Try(1, True)
        result = instance.filter(lambda x: x > 0)
        self.assertEqual(result, Try(1, True))

    def test_get(self):
        instance = Try(1, True)
        result = instance.get()
        self.assertEqual(result, 1)

    def test_get_or_else(self):
        instance = Try(1, True)
        result = instance.get_or_else(0)
        self.assertEqual(result, 1)

if __name__ == '__main__':
    unittest.main()