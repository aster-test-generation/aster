import unittest
from pymonet.task import Task


class TestTask(unittest.TestCase):
    def test_init(self):
        task = Task(lambda _, resolve: resolve(1))
        self.assertIsInstance(task, Task)

    def test_of(self):
        task = Task.of(1)
        self.assertIsInstance(task, Task)

    def test_reject(self):
        task = Task.reject(1)
        self.assertIsInstance(task, Task)

    def test_map(self):
        task = Task(lambda _, resolve: resolve(1)).map(lambda x: x + 1)
        self.assertIsInstance(task, Task)

    def test_bind(self):
        task = Task(lambda _, resolve: resolve(1)).bind(lambda x: Task(lambda _, resolve: resolve(x + 1)))
        self.assertIsInstance(task, Task)

class TestTask(unittest.TestCase):
    def test_init(self):
        task = Task(lambda _, resolve: resolve(1))
        self.assertEqual(task.fork(lambda x: x, lambda x: x), 1)

    def test_of(self):
        task = Task.of(1)
        self.assertEqual(task.fork(lambda x: x, lambda x: x), 1)

    def test_reject(self):
        task = Task.reject(1)
        self.assertEqual(task.fork(lambda x: x, lambda x: x), 1)

    def test_map(self):
        task = Task(lambda _, resolve: resolve(1)).map(lambda x: x + 1)
        self.assertEqual(task.fork(lambda x: x, lambda x: x), 2)

    def test_bind(self):
        task = Task(lambda _, resolve: resolve(1)).bind(lambda x: Task(lambda _, resolve: resolve(x + 1)))
        self.assertEqual(task.fork(lambda x: x, lambda x: x), 2)

if __name__ == '__main__':
    unittest.main()