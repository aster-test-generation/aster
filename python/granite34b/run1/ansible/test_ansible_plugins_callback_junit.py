import unittest
from ansible.plugins.callback.junit import TaskData


class TestTaskData(unittest.TestCase):
    def test_init(self):
        uuid = '12345'
        name = 'test_task'
        path = '/path/to/test_task'
        play = 'test_play'
        action = 'test_action'
        task_data = TaskData(uuid, name, path, play, action)
        self.assertEqual(task_data.uuid, uuid)
        self.assertEqual(task_data.name, name)
        self.assertEqual(task_data.path, path)
        self.assertEqual(task_data.play, play)
        self.assertEqual(task_data.action, action)
        self.assertIsNotNone(task_data.start)
        self.assertDictEqual(task_data.host_data, {})

    def test_add_host(self):
        uuid = '12345'
        name = 'test_task'
        path = '/path/to/test_task'
        play = 'test_play'
        action = 'test_action'
        task_data = TaskData(uuid, name, path, play, action)
        host_uuid = '67890'
        host_name = 'test_host'
        host_result = 'test_result'
        host_status = 'ok'
        host = HostData(host_uuid, host_name, host_result, host_status)
        task_data.add_host(host)
        self.assertDictEqual(task_data.host_data, {host_uuid: host})

if __name__ == '__main__':
    unittest.main()