import unittest
from tqdm.contrib.utils_worker import MonoWorker


class TestMonoWorker(unittest.TestCase):
    def test_init(self):
        worker = MonoWorker()
        self.assertIsInstance(worker.pool, ThreadPoolExecutor)
        self.assertIsInstance(worker.futures, deque)

    def test_submit(self):
        worker = MonoWorker()
        def test_func(x):
            return x * 2
        future = worker.submit(test_func, 3)
        self.assertIsInstance(future, concurrent.futures.Future)

    def test_submit_cancel(self):
        worker = MonoWorker()
        def test_func(x):
            return x * 2
        future = worker.submit(test_func, 3)
        future.cancel()
        self.assertTrue(future.cancelled())

    def test_submit_running(self):
        worker = MonoWorker()
        def test_func(x):
            return x * 2
        future = worker.submit(test_func, 3)
        self.assertFalse(future.done())
        future.result()
        self.assertTrue(future.done())

    def test_submit_max_workers(self):
        worker = MonoWorker()
        def test_func(x):
            return x * 2
        for i in range(2):
            worker.submit(test_func, i)
        self.assertEqual(len(worker.futures), 2)

    def test_submit_max_workers_overflow(self):
        worker = MonoWorker()
        def test_func(x):
            return x * 2
        for i in range(3):
            worker.submit(test_func, i)
        self.assertEqual(len(worker.futures), 2)

    def test_submit_exception(self):
        worker = MonoWorker()
        def test_func(x):
            raise ValueError("Test exception")
        with self.assertRaises(ValueError):
            worker.submit(test_func, 3)

    def test_str(self):
        worker = MonoWorker()
        self.assertEqual(str(worker), "MonoWorker")

    def test_repr(self):
        worker = MonoWorker()
        self.assertEqual(repr(worker), "MonoWorker()")

if __name__ == '__main__':
    unittest.main()