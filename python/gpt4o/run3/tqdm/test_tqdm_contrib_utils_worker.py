import unittest
from concurrent.futures import ThreadPoolExecutor
from collections import deque
from tqdm.contrib.utils_worker import MonoWorker


class TestMonoWorker(unittest.TestCase):
    def test_init(self):
        instance = MonoWorker()
        self.assertIsInstance(instance.pool, ThreadPoolExecutor)
        self.assertIsInstance(instance.futures, deque)
        self.assertEqual(instance.futures.maxlen, 2)

    def test_submit(self):
        instance = MonoWorker()
        
        def dummy_func(x):
            return x + 1
        
        future = instance.submit(dummy_func, 1)
        self.assertIsNotNone(future)
        self.assertEqual(future.result(), 2)

    def test_submit_with_exception(self):
        instance = MonoWorker()
        
        def dummy_func(x):
            raise ValueError("Test Exception")
        
        future = instance.submit(dummy_func, 1)
        self.assertIsNone(future)

    def test_submit_with_full_queue(self):
        instance = MonoWorker()
        
        def dummy_func(x):
            return x + 1
        
        future1 = instance.submit(dummy_func, 1)
        future2 = instance.submit(dummy_func, 2)
        future3 = instance.submit(dummy_func, 3)
        
        self.assertEqual(len(instance.futures), 2)
        self.assertEqual(instance.futures[0].result(), 2)
        self.assertEqual(instance.futures[1].result(), 4)

if __name__ == '__main__':
    unittest.main()