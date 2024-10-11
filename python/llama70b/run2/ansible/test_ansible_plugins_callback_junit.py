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
        with self.assertRaises(AttributeError):
            task_data.__private_method()

    def test_str_method(self):
        task_data = TaskData('uuid', 'name', 'path', 'play', 'action')
        self.assertEqual(str(task_data), 'TaskData(uuid, name, path, play, action)')

    def test_repr_method(self):
        task_data = TaskData('uuid', 'name', 'path', 'play', 'action')
        self.assertEqual(repr(task_data), 'TaskData(uuid, name, path, play, action)')

class TestCallbackBase(unittest.TestCase):
    def test_init(self):
        callback_base = CallbackBase()
        self.assertIsNotNone(callback_base)

    def test_private_method(self):
        callback_base = CallbackBase()
        with self.assertRaises(AttributeError):
            callback_base.__private_method()

    def test_str_method(self):
        callback_base = CallbackBase()
        self.assertEqual(str(callback_base), 'CallbackBase')

    def test_repr_method(self):
        callback_base = CallbackBase()
        self.assertEqual(repr(callback_base), 'CallbackBase')

class MockHost:
    def __init__(self, uuid, name, status, result):
        self.uuid = uuid
        self.name = name
        self.status = status
        self.result = result

if __name__ == '__main__':
    unittest.main()