import unittest
from tqdm.contrib.utils_worker import MonoWorker
from concurrent.futures import ThreadPoolExecutor
from collections import deque


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
        self.assertEqual(future.result(), 2)
        
        future = instance.submit(dummy_func, 2)
        self.assertEqual(future.result(), 3)
        
        future = instance.submit(dummy_func, 3)
        self.assertEqual(future.result(), 4)
        
        self.assertEqual(len(instance.futures), 2)

    def test_submit_with_exception(self):
        instance = MonoWorker()
        
        def dummy_func(x):
            raise ValueError("Test Exception")
        
        future = instance.submit(dummy_func, 1)
        self.assertIsNone(future)

if __name__ == '__main__':
    unittest.main()