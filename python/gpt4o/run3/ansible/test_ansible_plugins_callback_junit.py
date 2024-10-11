import unittest
import time
from ansible.plugins.callback.junit import TaskData


class MockHost:
    def __init__(self, uuid, status, result, name):
        self.uuid = uuid
        self.status = status
        self.result = result
        self.name = name

class TestTaskData(unittest.TestCase):
    def setUp(self):
        self.task_data = TaskData(uuid="1234", name="test_task", path="/path/to/task", play="test_play", action="test_action")

    def test_init(self):
        self.assertEqual(self.task_data.uuid, "1234")
        self.assertEqual(self.task_data.name, "test_task")
        self.assertEqual(self.task_data.path, "/path/to/task")
        self.assertEqual(self.task_data.play, "test_play")
        self.assertEqual(self.task_data.action, "test_action")
        self.assertIsNotNone(self.task_data.start)
        self.assertEqual(self.task_data.host_data, {})

    def test_add_host_new(self):
        host = MockHost(uuid="host1", status="ok", result="result1", name="host1")
        self.task_data.add_host(host)
        self.assertIn("host1", self.task_data.host_data)
        self.assertEqual(self.task_data.host_data["host1"], host)

    def test_add_host_included(self):
        host1 = MockHost(uuid="host1", status="included", result="result1", name="host1")
        host2 = MockHost(uuid="host1", status="included", result="result2", name="host1")
        self.task_data.add_host(host1)
        self.task_data.add_host(host2)
        self.assertIn("host1", self.task_data.host_data)
        self.assertEqual(self.task_data.host_data["host1"].result, "result1\nresult2")

    def test_add_host_duplicate(self):
        host1 = MockHost(uuid="host1", status="ok", result="result1", name="host1")
        host2 = MockHost(uuid="host1", status="ok", result="result2", name="host1")
        self.task_data.add_host(host1)
        with self.assertRaises(Exception) as context:
            self.task_data.add_host(host2)
        self.assertTrue('duplicate host callback' in str(context.exception))

if __name__ == '__main__':
    unittest.main()