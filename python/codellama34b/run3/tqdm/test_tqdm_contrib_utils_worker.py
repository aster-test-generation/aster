import unittest
from tqdm.contrib.utils_worker import MonoWorker


class TestMonoWorker(unittest.TestCase):
    def test_init(self):
        instance = MonoWorker()
        self.assertEqual(instance.pool, ThreadPoolExecutor(max_workers=1))
        self.assertEqual(instance.futures, deque([], 2))

    def test_submit(self):
        instance = MonoWorker()
        result = instance.submit(func, *args, **kwargs)
        self.assertEqual(result, waiting)

    def test_private_method(self):
        instance = MonoWorker()
        result = instance._MonoWorker__private_method(self, z)
        self.assertEqual(result, z ** 2)

    def test_protected_method(self):
        instance = MonoWorker()
        result = instance._MonoWorker__protected_method(self, z)
        self.assertEqual(result, z + 3)

    def test_str_method(self):
        instance = MonoWorker()
        result = instance.__str__()
        self.assertEqual(result, "MonoWorker")

    def test_repr_method(self):
        instance = MonoWorker()
        result = instance.__repr__()
        self.assertEqual(result, "MonoWorker(1)")

if __name__ == '__main__':
    unittest.main()