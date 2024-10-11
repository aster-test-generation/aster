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
        try_instance3 = Try(2, True)
        try_instance4 = Try(1, False)
        self.assertEqual(try_instance1, try_instance2)
        self.assertNotEqual(try_instance1, try_instance3)
        self.assertNotEqual(try_instance1, try_instance4)

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
        def square(x):
            return x * x
        result = try_instance.map(square)
        self.assertEqual(result.value, 1)
        self.assertTrue(result.is_success)

    def test_bind(self):
        try_instance = Try(1, True)
        def square(x):
            return Try(x * x, True)
        result = try_instance.bind(square)
        self.assertEqual(result.value, 1)
        self.assertTrue(result.is_success)

    def test_on_success(self):
        try_instance = Try(1, True)
        def callback(x):
            pass
        result = try_instance.on_success(callback)
        self.assertEqual(result.value, 1)
        self.assertTrue(result.is_success)

    def test_on_fail(self):
        try_instance = Try(1, True)
        def callback(x):
            pass
        result = try_instance.on_fail(callback)
        self.assertEqual(result.value, 1)
        self.assertTrue(result.is_success)

    def test_filter(self):
        try_instance = Try(1, True)
        def is_even(x):
            return x % 2 == 0
        result = try_instance.filter(is_even)
        self.assertEqual(result.value, 1)
        self.assertTrue(result.is_success)

    def test_get(self):
        try_instance = Try(1, True)
        self.assertEqual(try_instance.get(), 1)

    def test_get_or_else(self):
        try_instance = Try(1, True)
        self.assertEqual(try_instance.get_or_else(0), 1)


def test_try_of():
    def divide(x, y):
        return x / y
    result = Try.of(divide, 10, 2)
    assert result.value == 5
    assert result.is_success

def test_try_map():
    result = Try(10, True).map(lambda x: x + 1)
    assert result.value == 11
    assert result.is_success

def test_try_bind():
    result = Try(10, True).bind(lambda x: Try(x + 1, True))
    assert result.value == 11
    assert result.is_success

def test_try_on_success():
    called = False
    def callback(value):
        nonlocal called
        called = True
    result = Try(10, True).on_success(callback)
    assert called

def test_try_on_fail():
    called = False
    def callback(value):
        nonlocal called
        called = True
    result = Try(10, True).on_fail(callback)
    assert not called

def test_try_filter():
    result = Try(10, True).filter(lambda x: x > 5)
    assert result.value == 10
    assert result.is_success

def test_try_get():
    result = Try(10, True).get()
    assert result == 10

def test_try_get_or_else():
    result = Try(10, True).get_or_else(0)
    assert result == 10

def test_try_eq():
    result1 = Try(10, True)
    result2 = Try(10, True)
    assert result1 == result2

if __name__ == '__main__':
    unittest.main()