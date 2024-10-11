import unittest
from unittest.mock import patch
from ansible.plugins.callback.yajl import CallbackBase, TaskDat
from ansible.module_utils._text import to_bytes, to_text
from ansible.utils._junit_xml import TestCase, TestError, TestFailure, TestSuite, TestSuites


class TestCallbackBase(unittest.TestCase):
    def test_init(self):
        callback = CallbackBase()
        self.assertEqual(callback._output_dir, '~/.ansible.log')
        self.assertFalse(callback._task_class)
        self.assertEqual(callback._task_relative_path, 'none')
        self.assertFalse(callback._fail_on_change)
        self.assertFalse(callback._fail_on_ignore)
        self.assertTrue(callback._include_setup_tasks_in_report)
        self.assertFalse(callback._hide_task_arguments)
        self.assertEqual(callback._test_case_prefix, '')

    def test_output_dir(self):
        callback = CallbackBase()
        callback._output_dir = 'new_dir'
        self.assertEqual(callback._output_dir, 'new_dir')

    def test_task_class(self):
        callback = CallbackBase()
        callback._task_class = True
        self.assertTrue(callback._task_class)

    def test_task_relative_path(self):
        callback = CallbackBase()
        callback._task_relative_path = 'new_path'
        self.assertEqual(callback._task_relative_path, 'new_path')

    def test_fail_on_change(self):
        callback = CallbackBase()
        callback._fail_on_change = True
        self.assertTrue(callback._fail_on_change)

    def test_fail_on_ignore(self):
        callback = CallbackBase()
        callback._fail_on_ignore = True
        self.assertTrue(callback._fail_on_ignore)

    def test_include_setup_tasks_in_report(self):
        callback = CallbackBase()
        callback._include_setup_tasks_in_report = False
        self.assertFalse(callback._include_setup_tasks_in_report)

    def test_hide_task_arguments(self):
        callback = CallbackBase()
        callback._hide_task_arguments = True
        self.assertTrue(callback._hide_task_arguments)

    def test_test_case_prefix(self):
        callback = CallbackBase()
        callback._test_case_prefix = 'new_prefix'
        self.assertEqual(callback._test_case_prefix, 'new_prefix')

    def test_task_data_init(self):
        task_data = TaskData('uuid', 'name', 'path', 'play', 'action')
        self.assertEqual(task_data.uuid, 'uuid')
        self.assertEqual(task_data.name, 'name')
        self.assertEqual(task_data.path, 'path')
        self.assertEqual(task_data.play, 'play')
        self.assertEqual(task_data.action, 'action')
        self.assertIsNone(task_data.start)
        self.assertEqual(task_data.host_data, {})

    def test_task_data_add_host(self):
        task_data = TaskData('uuid', 'name', 'path', 'play', 'action')
        host = object()
        task_data.add_host(host)
        self.assertIn(host.uuid, task_data.host_data)
        self.assertEqual(task_data.host_data[host.uuid], host)

    def test_task_data_add_host_duplicate(self):
        task_data = TaskData('uuid', 'name', 'path', 'play', 'action')
        host1 = object()
        host2 = object()
        task_data.add_host(host1)
        with self.assertRaises(Exception):
            task_data.add_host(host2)

    def test_task_data_add_host_included(self):
        task_data = TaskData('uuid', 'name', 'path', 'play', 'action')
        host = object()
        host.status = 'included'
        task_data.add_host(host)
        self.assertIn(host.uuid, task_data.host_data)
        self.assertEqual(task_data.host_data[host.uuid].result, '%s\n%s' % (host.result, host.result))

    def test_task_data_add_host_exception(self):
        task_data = TaskData('uuid', 'name', 'path', 'play', 'action')
        host = object()
        host.status = 'excluded'
        with self.assertRaises(Exception):
            task_data.add_host(host)

if __name__ == '__main__':
    unittest.main()