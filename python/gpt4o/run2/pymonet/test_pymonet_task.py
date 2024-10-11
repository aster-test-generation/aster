import unittest
from pymonet.task import Task


class TestTask(unittest.TestCase):
    def test_init(self):
        def dummy_fork(reject, resolve):
            pass
        task = Task(dummy_fork)
        self.assertEqual(task.fork, dummy_fork)

    def test_of(self):
        task = Task.of(10)
        result = []
        task.fork(lambda x: result.append(f"reject: {x}"), lambda x: result.append(f"resolve: {x}"))
        self.assertEqual(result, ["resolve: 10"])

    def test_reject(self):
        task = Task.reject(20)
        result = []
        task.fork(lambda x: result.append(f"reject: {x}"), lambda x: result.append(f"resolve: {x}"))
        self.assertEqual(result, ["reject: 20"])

    def test_map(self):
        task = Task.of(10).map(lambda x: x + 5)
        result = []
        task.fork(lambda x: result.append(f"reject: {x}"), lambda x: result.append(f"resolve: {x}"))
        self.assertEqual(result, ["resolve: 15"])

    def test_bind(self):
        def task_fn(x):
            return Task.of(x * 2)
        task = Task.of(10).bind(task_fn)
        result = []
        task.fork(lambda x: result.append(f"reject: {x}"), lambda x: result.append(f"resolve: {x}"))
        self.assertEqual(result, ["resolve: 20"])

if __name__ == '__main__':
    unittest.main()