import unittest
from ansible.plugins.callback import juni


class TestTaskData(unittest.TestCase):
    def test_init(self):
        task_data = TaskData('uuid', 'name', 'path', 'play', 'action')
        self.assertEqual(task_data.uuid, 'uuid')
        self.assertEqual(task_data.name, 'name')
        self.assertEqual(task_data.path, 'path')
        self.assertEqual(task_data.play, 'play')
        self.assertEqual(task_data.action, 'action')
        self.assertIsNotNone(task_data.start)

    def test_add_host(self):
        task_data = TaskData('uuid', 'name', 'path', 'play', 'action')
        host = MockHost('host_uuid', 'host_name', 'included', 'result')
        task_data.add_host(host)
        self.assertIn('host_uuid', task_data.host_data)
        self.assertEqual(task_data.host_data['host_uuid'].result, 'result')

    def test_add_host_duplicate(self):
        task_data = TaskData('uuid', 'name', 'path', 'play', 'action')
        host1 = MockHost('host_uuid', 'host_name', 'included', 'result1')
        host2 = MockHost('host_uuid', 'host_name', 'included', 'result2')
        task_data.add_host(host1)
        with self.assertRaises(Exception):
            task_data.add_host(host2)

    def test_private_method(self):
        task_data = TaskData('uuid', 'name', 'path', 'play', 'action')
        result = task_data._TaskData__init__('uuid', 'name', 'path', 'play', 'action')
        self.assertIsNone(result)

class TestCallbackBase(unittest.TestCase):
    def test_init(self):
        callback = CallbackBase()
        self.assertIsNotNone(callback)

    def test_str_method(self):
        callback = CallbackBase()
        result = callback.__str__()
        self.assertEqual(result, '')

    def test_repr_method(self):
        callback = CallbackBase()
        result = callback.__repr__()
        self.assertEqual(result, '')

class MockHost:
    def __init__(self, uuid, name, status, result):
        self.uuid = uuid
        self.name = name
        self.status = status
        self.result = result

if __name__ == '__main__':
    unittest.main()