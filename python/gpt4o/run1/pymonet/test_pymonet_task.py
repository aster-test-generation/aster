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
        task.fork(lambda x: result.append(f"rejected: {x}"), lambda x: result.append(f"resolved: {x}"))
        self.assertEqual(result, ["resolved: 10"])

    def test_reject(self):
        task = Task.reject(20)
        result = []
        task.fork(lambda x: result.append(f"rejected: {x}"), lambda x: result.append(f"resolved: {x}"))
        self.assertEqual(result, ["rejected: 20"])

    def test_map(self):
        task = Task.of(10).map(lambda x: x + 5)
        result = []
        task.fork(lambda x: result.append(f"rejected: {x}"), lambda x: result.append(f"resolved: {x}"))
        self.assertEqual(result, ["resolved: 15"])

    def test_bind(self):
        task = Task.of(10).bind(lambda x: Task.of(x + 5))
        result = []
        task.fork(lambda x: result.append(f"rejected: {x}"), lambda x: result.append(f"resolved: {x}"))
        self.assertEqual(result, ["resolved: 15"])

if __name__ == '__main__':
    unittest.main()