import unittest
from tqdm.contrib.utils_worker import *


class TestMonoWorker(unittest.TestCase):
    def test_init(self):
        instance = MonoWorker()
        self.assertEqual(instance.pool.max_workers, 1)
        self.assertEqual(instance.futures.maxlen, 2)

    def test_submit(self):
        instance = MonoWorker()
        result = instance.submit(lambda x: x, 1)
        self.assertEqual(result.result(), 1)

if __name__ == '__main__':
    unittest.main()