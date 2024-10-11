import unittest
from concurrent.futures import Future
from tqdm.contrib.utils_worker import MonoWorker


class TestMonoWorker(unittest.TestCase):
    def setUp(self):
        self.worker = MonoWorker()

    def test_init(self):
        self.assertIsInstance(self.worker.pool, ThreadPoolExecutor)
        self.assertIsInstance(self.worker.futures, deque)
        self.assertEqual(self.worker.futures.maxlen, 2)

    def test_submit_function(self):
        def dummy_func(x):
            return x + 1

        future = self.worker.submit(dummy_func, 1)
        self.assertIsInstance(future, Future)
        self.assertEqual(future.result(), 2)

    def test_submit_function_with_exception(self):
        def dummy_func(x):
            raise ValueError("Test Exception")

        future = self.worker.submit(dummy_func, 1)
        self.assertIsNone(future)

    def test_submit_function_with_full_queue(self):
        def dummy_func(x):
            return x + 1

        future1 = self.worker.submit(dummy_func, 1)
        future2 = self.worker.submit(dummy_func, 2)
        future3 = self.worker.submit(dummy_func, 3)

        self.assertEqual(len(self.worker.futures), 2)
        self.assertEqual(future1.result(), 2)
        self.assertEqual(future2.result(), 3)
        self.assertEqual(future3.result(), 4)

    def test_submit_function_with_cancelled_future(self):
        def dummy_func(x):
            return x + 1

        future1 = self.worker.submit(dummy_func, 1)
        future2 = self.worker.submit(dummy_func, 2)
        future2.cancel()
        future3 = self.worker.submit(dummy_func, 3)

        self.assertEqual(len(self.worker.futures), 2)
        self.assertEqual(future1.result(), 2)
        self.assertTrue(future2.cancelled())
        self.assertEqual(future3.result(), 4)

if __name__ == '__main__':
    unittest.main()