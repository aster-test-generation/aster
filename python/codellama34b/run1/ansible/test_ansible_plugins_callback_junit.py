import time
import unittest
from ansible.plugins.callback.yaml import TaskData


class TestTaskData(unittest.TestCase):
    def test_init(self):
        instance = TaskData("uuid", "name", "path", "play", "action")
        self.assertEqual(instance.uuid, "uuid")
        self.assertEqual(instance.name, "name")
        self.assertEqual(instance.path, "path")
        self.assertEqual(instance.play, "play")
        self.assertEqual(instance.start, None)
        self.assertEqual(instance.host_data, {})
        self.assertEqual(instance.start, time.time())
        self.assertEqual(instance.action, "action")

    def test_add_host(self):
        instance = TaskData("uuid", "name", "path", "play", "action")
        host = "host"
        instance.add_host(host)
        self.assertEqual(instance.host_data, {})

if __name__ == '__main__':
    unittest.main()