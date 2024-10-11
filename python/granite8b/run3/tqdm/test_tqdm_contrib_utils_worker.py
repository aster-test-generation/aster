import unittest
from tqdm.contrib.utils_worker import MonoWorker


class TestMonoWorker(unittest.TestCase):
    def test_init(self):
        instance = MonoWorker()
        self.assertEqual(instance.pool._max_workers, 1)
        self.assertEqual(len(instance.futures), 2)

    def test_submit(self):
        instance = MonoWorker()
        def func():
            pass
        future = instance.submit(func)
        self.assertEqual(len(instance.futures), 1)
        self.assertTrue(future.cancel())
        self.assertEqual(len(instance.futures), 0)

if __name__ == '__main__':
    unittest.main()