import unittest
from pymonet.monad_try import Try


class TestTry(unittest.TestCase):
    def test_init(self):
        instance = Try(10, True)
        self.assertEqual(instance.value, 10)
        self.assertEqual(instance.is_success, True)

    def test_eq(self):
        instance1 = Try(10, True)
        instance2 = Try(10, True)
        instance3 = Try(20, False)
        self.assertTrue(instance1 == instance2)
        self.assertFalse(instance1 == instance3)

    def test_str(self):
        instance = Try(10, True)
        self.assertEqual(str(instance), 'Try[value=10, is_success=True]')

    def test_of_success(self):
        def fn(x):
            return x + 1
        instance = Try.of(fn, 10)
        self.assertEqual(instance, Try(11, True))

    def test_of_failure(self):
        def fn(x):
            raise ValueError("Error")
        instance = Try.of(fn, 10)
        self.assertEqual(instance.is_success, False)
        self.assertIsInstance(instance.value, ValueError)

    def test_map_success(self):
        instance = Try(10, True)
        result = instance.map(lambda x: x + 1)
        self.assertEqual(result, Try(11, True))

    def test_map_failure(self):
        instance = Try(10, False)
        result = instance.map(lambda x: x + 1)
        self.assertEqual(result, Try(10, False))

    def test_bind_success(self):
        instance = Try(10, True)
        result = instance.bind(lambda x: Try(x + 1, True))
        self.assertEqual(result, Try(11, True))

    def test_bind_failure(self):
        instance = Try(10, False)
        result = instance.bind(lambda x: Try(x + 1, True))
        self.assertEqual(result, instance)

    def test_on_success(self):
        instance = Try(10, True)
        result = []
        instance.on_success(lambda x: result.append(x))
        self.assertEqual(result, [10])

    def test_on_fail(self):
        instance = Try(10, False)
        result = []
        instance.on_fail(lambda x: result.append(x))
        self.assertEqual(result, [10])

    def test_filter_success(self):
        instance = Try(10, True)
        result = instance.filter(lambda x: x > 5)
        self.assertEqual(result, Try(10, True))

    def test_filter_failure(self):
        instance = Try(10, True)
        result = instance.filter(lambda x: x < 5)
        self.assertEqual(result, Try(10, False))

    def test_get(self):
        instance = Try(10, True)
        self.assertEqual(instance.get(), 10)

    def test_get_or_else_success(self):
        instance = Try(10, True)
        self.assertEqual(instance.get_or_else(20), 10)

    def test_get_or_else_failure(self):
        instance = Try(10, False)
        self.assertEqual(instance.get_or_else(20), 20)

if __name__ == '__main__':
    unittest.main()