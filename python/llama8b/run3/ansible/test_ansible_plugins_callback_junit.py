import unittest
from unittest.mock import patch
from ansible.plugins.callback import CallbackBas
from ansible.module_utils._text import to_bytes, to_text
from ansible.utils._junit_xml import TestCase, TestError, TestFailure, TestSuite, TestSuites


class TestCallbackBase(unittest.TestCase):
    def test_init(self):
        instance = CallbackBase()
        self.assertEqual(instance._output_dir, '~/.ansible.log')
        self.assertFalse(instance._task_class)
        self.assertEqual(instance._task_relative_path, 'none')
        self.assertFalse(instance._fail_on_change)
        self.assertFalse(instance._fail_on_ignore)
        self.assertTrue(instance._include_setup_tasks_in_report)
        self.assertFalse(instance._hide_task_arguments)
        self.assertEqual(instance._test_case_prefix, '')

    def test_start(self):
        instance = CallbackBase()
        with patch.object(instance, '_write_xml') as mock_write_xml:
            instance.start('play', 'task')
            mock_write_xml.assert_called_once()

    def test_add_task(self):
        instance = CallbackBase()
        task = TaskData('uuid', 'name', 'path', 'play', 'action')
        instance.add_task(task)
        self.assertEqual(instance._tasks, [task])

    def test_add_host(self):
        instance = CallbackBase()
        task = TaskData('uuid', 'name', 'path', 'play', 'action')
        host = {'uuid': 'uuid', 'name': 'name', 'status': 'included', 'result': 'result'}
        instance.add_host(host, task)
        self.assertEqual(instance._hosts[host['uuid']].result, 'result\nresult')

    def test_end(self):
        instance = CallbackBase()
        with patch.object(instance, '_write_xml') as mock_write_xml:
            instance.end()
            mock_write_xml.assert_called_once()

    def test__write_xml(self):
        instance = CallbackBase()
        with patch('ansible.utils._junit_xml.TestSuites') as mock_TestSuites:
            instance._write_xml()
            mock_TestSuites.assert_called_once()

    def test__write_xml_with_tasks(self):
        instance = CallbackBase()
        task1 = TaskData('uuid1', 'name1', 'path1', 'play1', 'action1')
        task2 = TaskData('uuid2', 'name2', 'path2', 'play2', 'action2')
        instance._tasks = [task1, task2]
        with patch('ansible.utils._junit_xml.TestSuites') as mock_TestSuites:
            instance._write_xml()
            mock_TestSuites.assert_called_once()

    def test__write_xml_with_hosts(self):
        instance = CallbackBase()
        task = TaskData('uuid', 'name', 'path', 'play', 'action')
        host1 = {'uuid': 'uuid1', 'name': 'name1', 'status': 'included', 'result': 'result1'}
        host2 = {'uuid': 'uuid2', 'name': 'name2', 'status': 'excluded', 'result': 'result2'}
        instance._hosts = {host1['uuid']: host1, host2['uuid']: host2}
        with patch('ansible.utils._junit_xml.TestSuites') as mock_TestSuites:
            instance._write_xml()
            mock_TestSuites.assert_called_once()

    def test__str__(self):
        instance = CallbackBase()
        self.assertEqual(instance.__str__(), 'CallbackBase')

    def test__repr__(self):
        instance = CallbackBase()
        self.assertEqual(instance.__repr__(), 'CallbackBase()')

    def test__eq__(self):
        instance1 = CallbackBase()
        instance2 = CallbackBase()
        self.assertEqual(instance1, instance2)

if __name__ == '__main__':
    unittest.main()