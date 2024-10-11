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
        result = worker.submit(func, 1)
        self.assertEqual(result.result(), 2)

    def test_submit_with_kwargs(self):
        worker = MonoWorker()
        func = lambda x, y: x + y
        result = worker.submit(func, 1, y=2)
        self.assertEqual(result.result(), 3)

    def test_submit_with_exception(self):
        worker = MonoWorker()
        func = lambda x: 1 / x
        result = worker.submit(func, 0)
        with self.assertRaises(ZeroDivisionError):
            result.result()

    def test_submit_with_cancel(self):
        worker = MonoWorker()
        func = lambda x: x ** 2
        result = worker.submit(func, 3)
        worker.futures.popleft().cancel()
        with self.assertRaises(Exception):
            result.result()

if __name__ == '__main__':
    unittest.main()