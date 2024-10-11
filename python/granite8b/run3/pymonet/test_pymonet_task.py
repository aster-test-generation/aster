import unittest
from pymonet.task import Task


class TestTask(unittest.TestCase):
    def test_of(self):
        task = Task.of(1)
        result = task.fork(lambda x: x + 1, lambda x: x - 1)
        self.assertEqual(result, 1)

    def test_reject(self):
        task = Task.reject(1)
        result = task.fork(lambda x: x + 1, lambda x: x - 1)
        self.assertEqual(result, -1)

    def test_map(self):
        task = Task.of(1).map(lambda x: x + 1)
        result = task.fork(lambda x: x + 1, lambda x: x - 1)
        self.assertEqual(result, 2)

    def test_bind(self):
        task = Task.of(1).bind(lambda x: Task.of(x + 1))
        result = task.fork(lambda x: x + 1, lambda x: x - 1)
        self.assertEqual(result, 2)

if __name__ == '__main__':
    unittest.main()