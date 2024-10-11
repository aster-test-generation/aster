import unittest
from tqdm.contrib.utils_worker import MonoWorker


class TestMonoWorker(unittest.TestCase):
    def test_submit(self):
        worker = MonoWorker()
        result = worker.submit(lambda x: x + 1, 1)
        self.assertEqual(result.result(), 2)

    def test_submit_private_method(self):
        worker = MonoWorker()
        result = worker._MonoWorker__submit(lambda x: x + 1, 1)
        self.assertEqual(result.result(), 2)

    def test_submit_protected_method(self):
        worker = MonoWorker()
        result = worker._MonoWorker__submit(lambda x: x + 1, 1)
        self.assertEqual(result.result(), 2)

    def test_submit_magic_method(self):
        worker = MonoWorker()
        result = worker.__submit(lambda x: x + 1, 1)
        self.assertEqual(result.result(), 2)

if __name__ == '__main__':
    unittest.main()