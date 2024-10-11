import unittest
from tqdm.contrib.utils_worker import MonoWorker


class TestMonoWorker(unittest.TestCase):
    def test_init(self):
        instance = MonoWorker()
        self.assertIsInstance(instance.pool, ThreadPoolExecutor)
        self.assertIsInstance(instance.futures, deque)

    def test_submit(self):
        instance = MonoWorker()
        def func(x):
            return x + 1
        future = instance.submit(func, 1)
        self.assertIsInstance(future, ThreadPoolExecutor._Future)

    def test_submit_maxlen_reached(self):
        instance = MonoWorker()
        def func(x):
            return x + 1
        for _ in range(2):
            instance.submit(func, 1)
        with self.assertRaises(Exception):
            instance.submit(func, 1)

    def test_submit_cancel_waiting(self):
        instance = MonoWorker()
        def func(x):
            return x + 1
        future1 = instance.submit(func, 1)
        future2 = instance.submit(func, 2)
        instance.submit(func, 3)
        self.assertTrue(future2.cancelled())

    def test_str_method(self):
        instance = MonoWorker()
        result = instance.__str__()
        self.assertIsInstance(result, str)

    def test_repr_method(self):
        instance = MonoWorker()
        result = instance.__repr__()
        self.assertIsInstance(result, str)

    def test_eq_method(self):
        instance1 = MonoWorker()
        instance2 = MonoWorker()
        self.assertNotEqual(instance1, instance2)

if __name__ == '__main__':
    unittest.main()