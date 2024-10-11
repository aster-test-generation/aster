import unittest
from pymonet.task import Task


class TestTask(unittest.TestCase):
    def test_init(self):
        task = Task(lambda _, resolve: resolve(1))
        self.assertIsNotNone(task.fork)

    def test_of(self):
        task = Task.of(1)
        self.assertIsNotNone(task.fork)

    def test_reject(self):
        task = Task.reject(1)
        self.assertIsNotNone(task.fork)

    def test_map(self):
        task = Task.of(1)
        mapped_task = task.map(lambda x: x + 1)
        self.assertIsNotNone(mapped_task.fork)

    def test_bind(self):
        task = Task.of(1)
        bound_task = task.bind(lambda x: Task.of(x + 1))
        self.assertIsNotNone(bound_task.fork)

    def test_private_init(self):
        task = Task.__init__(Task, lambda _, resolve: resolve(1))
        self.assertIsNotNone(task.fork)

    def test_str_method(self):
        task = Task.of(1)
        result = task.__str__()
        self.assertIsInstance(result, str)

    def test_repr_method(self):
        task = Task.of(1)
        result = task.__repr__()
        self.assertIsInstance(result, str)

    def test_eq_method(self):
        task1 = Task.of(1)
        task2 = Task.of(1)
        self.assertTrue(task1 == task2)

if __name__ == '__main__':
    unittest.main()