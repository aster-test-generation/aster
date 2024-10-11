import unittest
from tqdm.contrib.utils_worker import MonoWorker


class TestMonoWorker(unittest.TestCase):
    def test_init(self):
        worker = MonoWorker()
        self.assertIsInstance(worker.pool, ThreadPoolExecutor)
        self.assertEqual(worker.pool._max_workers, 1)
        self.assertEqual(worker.futures, deque([], 2))

    def test_submit(self):
        worker = MonoWorker()
        func = lambda x: x + 1
        args = (1,)
        kwargs = {}
        future = worker.submit(func, *args, **kwargs)
        self.assertIsInstance(future, object)
        self.assertEqual(worker.futures, deque([future], 2))

if __name__ == '__main__':
    unittest.main()