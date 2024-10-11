import unittest
from tqdm.contrib.utils_worker import MonoWorker


class TestMonoWorker(unittest.TestCase):
    def test_init(self):
        instance = MonoWorker()
        self.assertEqual(instance.pool.max_workers, 1)
        self.assertEqual(len(instance.futures), 0)

    def test_submit(self):
        instance = MonoWorker()
        result = instance.submit(lambda x: x, 1)
        self.assertEqual(result.result(), 1)

    def test_submit_cancel(self):
        instance = MonoWorker()
        instance.futures.append(1)
        instance.futures.append(2)
        result = instance.submit(lambda x: x, 3)
        self.assertEqual(result.result(), 3)
        self.assertEqual(len(instance.futures), 2)
        self.assertEqual(instance.futures[0], 1)
        self.assertEqual(instance.futures[1], 3)

    def test_submit_cancel_running(self):
        instance = MonoWorker()
        instance.futures.append(1)
        instance.futures.append(2)
        result = instance.submit(lambda x: x, 3)
        self.assertEqual(result.result(), 3)
        self.assertEqual(len(instance.futures), 2)
        self.assertEqual(instance.futures[0], 1)
        self.assertEqual(instance.futures[1], 3)

    def test_submit_cancel_waiting(self):
        instance = MonoWorker()
        instance.futures.append(1)
        instance.futures.append(2)
        result = instance.submit(lambda x: x, 3)
        self.assertEqual(result.result(), 3)
        self.assertEqual(len(instance.futures), 2)
        self.assertEqual(instance.futures[0], 1)
        self.assertEqual(instance.futures[1], 3)

    def test_submit_exception(self):
        instance = MonoWorker()
        result = instance.submit(lambda x: x, 1)
        self.assertEqual(result.result(), 1)

    def test_submit_exception_cancel(self):
        instance = MonoWorker()
        instance.futures.append(1)
        instance.futures.append(2)
        result = instance.submit(lambda x: x, 3)
        self.assertEqual(result.result(), 3)
        self.assertEqual(len(instance.futures), 2)
        self.assertEqual(instance.futures[0], 1)
        self.assertEqual(instance.futures[1], 3)

    def test_submit_exception_cancel_running(self):
        instance = MonoWorker()
        instance.futures.append(1)
        instance.futures.append(2)
        result = instance.submit(lambda x: x, 3)
        self.assertEqual(result.result(), 3)
        self.assertEqual(len(instance.futures), 2)
        self.assertEqual(instance.futures[0], 1)
        self.assertEqual(instance.futures[1], 3)

    def test_submit_exception_cancel_waiting(self):
        instance = MonoWorker()
        instance.futures.append(1)
        instance.futures.append(2)
        result = instance.submit(lambda x: x, 3)
        self.assertEqual(result.result(), 3)
        self.assertEqual(len(instance.futures), 2)
        self.assertEqual(instance.futures[0], 1)
        self.assertEqual(instance.futures[1], 3)


if __name__ == '__main__':
    unittest.main()