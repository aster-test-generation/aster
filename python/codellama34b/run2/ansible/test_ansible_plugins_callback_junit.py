import unittest
from ansible.plugins.callback.yaml import *


class TestTaskData(unittest.TestCase):
    def test_init(self):
        uuid = "uuid"
        name = "name"
        path = "path"
        play = "play"
        action = "action"
        instance = TaskData(uuid, name, path, play, action)
        self.assertEqual(instance.uuid, uuid)
        self.assertEqual(instance.name, name)
        self.assertEqual(instance.path, path)
        self.assertEqual(instance.play, play)
        self.assertEqual(instance.start, None)
        self.assertEqual(instance.host_data, {})
        self.assertEqual(instance.action, action)

    def test_add_host(self):
        uuid = "uuid"
        name = "name"
        path = "path"
        play = "play"
        action = "action"
        instance = TaskData(uuid, name, path, play, action)
        host = HostData(uuid, name, path, play, action)
        instance.add_host(host)
        self.assertEqual(instance.host_data[host.uuid], host)


if __name__ == '__main__':
    unittest.main()