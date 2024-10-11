import unittest
from pymonet.task import Task


class TestTask(unittest.TestCase):
    def test_init(self):
        task = Task(lambda _, resolve: resolve(5))
        self.assertEqual(task.fork(lambda x: x, lambda x: x), 5)

    def test_of(self):
        task = Task.of(5)
        self.assertEqual(task.fork(lambda x: x, lambda x: x), 5)

    def test_reject(self):
        task = Task.reject(5)
        self.assertEqual(task.fork(lambda x: x, lambda x: x), 5)

    def test_map(self):
        task = Task(lambda _, resolve: resolve(5)).map(lambda x: x + 1)
        self.assertEqual(task.fork(lambda x: x, lambda x: x), 6)

    def test_bind(self):
        task = Task(lambda _, resolve: resolve(5)).bind(lambda x: Task(lambda _, resolve: resolve(x + 1)))
        self.assertEqual(task.fork(lambda x: x, lambda x: x), 6)

if __name__ == '__main__':
    unittest.main()