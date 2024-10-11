import unittest
from ansible.plugins.callback.junit import *


class TestTaskData(unittest.TestCase):
    def test_init(self):
        task_data = TaskData('uuid', 'name', 'path', 'play', 'action')
        self.assertEqual(task_data.uuid, 'uuid')
        self.assertEqual(task_data.name, 'name')
        self.assertEqual(task_data.path, 'path')
        self.assertEqual(task_data.play, 'play')
        self.assertEqual(task_data.action, 'action')
        self.assertIsNotNone(task_data.start)
        self.assertDictEqual(task_data.host_data, {})

    def test_add_host(self):
        task_data = TaskData('uuid', 'name', 'path', 'play', 'action')
        host = HostData('host_uuid', 'host_name', 'host_result', 'host_status')
        task_data.add_host(host)
        self.assertDictEqual(task_data.host_data, {'host_uuid': host})

if __name__ == '__main__':
    unittest.main()