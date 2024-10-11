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
        self.assertIsInstance(result, object)
        self.assertEqual(worker.futures, deque([result], 2))

if __name__ == '__main__':
    unittest.main()