import unittest
from pymonet.task import Task


class TestTask(unittest.TestCase):
    def test_init(self):
        task = Task(lambda _, resolve: resolve(1))
        self.assertEqual(task.fork(lambda _, resolve: resolve(1)).result(), 1)

    def test_of(self):
        task = Task.of(1)
        self.assertEqual(task.fork(lambda _, resolve: resolve(1)).result(), 1)

    def test_reject(self):
        task = Task.reject(1)
        self.assertEqual(task.fork(lambda reject, _: reject(1)).result(), 1)

    def test_map(self):
        task = Task.of(1).map(lambda x: x + 1)
        self.assertEqual(task.fork(lambda _, resolve: resolve(2)).result(), 2)

    def test_bind(self):
        task = Task.of(1).bind(lambda x: Task.of(x + 1))
        self.assertEqual(task.fork(lambda _, resolve: resolve(2)).result(), 2)

    def test_str(self):
        task = Task.of(1)
        self.assertEqual(str(task), "Task")

    def test_repr(self):
        task = Task.of(1)
        self.assertEqual(repr(task), "Task(lambda _, resolve: resolve(1))")

    def test_eq(self):
        task1 = Task.of(1)
        task2 = Task.of(1)
        self.assertTrue(task1 == task2)

    def test_ne(self):
        task1 = Task.of(1)
        task2 = Task.of(2)
        self.assertFalse(task1 != task2)

if __name__ == '__main__':
    unittest.main()