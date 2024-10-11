import unittest
from unittest.mock import patch, Mock
from ansible.plugins.callback import CallbackBase 
from ansible.module_utils._text import to_bytes, to_text
from ansible import constants as C


class TestTaskData(unittest.TestCase):
    def test_init(self):
        task_data = TaskData('uuid', 'name', 'path', 'play', 'action')
        self.assertEqual(task_data.uuid, 'uuid')
        self.assertEqual(task_data.name, 'name')
        self.assertEqual(task_data.path, 'path')
        self.assertEqual(task_data.play, 'play')
        self.assertEqual(task_data.action, 'action')
        self.assertIsNone(task_data.start)
        self.assertEqual(task_data.host_data, {})

    def test_add_host(self):
        task_data = TaskData('uuid', 'name', 'path', 'play', 'action')
        host = Mock(uuid='host_uuid', status='included')
        task_data.add_host(host)
        self.assertIn('host_uuid', task_data.host_data)
        self.assertEqual(task_data.host_data['host_uuid'].result, '%s\n%s' % ('', host.result))

class TestCallbackBase(unittest.TestCase):
    def test_init(self):
        callback = CallbackBase()
        self.assertEqual(callback._output_dir, '~/.ansible.log')
        self.assertFalse(callback._task_class)
        self.assertIsNone(callback._task_relative_path)
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

class TestTestCase(unittest.TestCase):
    def test_init(self):
        test_case = TestCase('name', 'result', 'duration')
        self.assertEqual(test_case.name, 'name')
        self.assertEqual(test_case.result, 'result')
        self.assertEqual(test_case.duration, 'duration')

    def test_str(self):
        test_case = TestCase('name', 'result', 'duration')
        self.assertEqual(str(test_case), 'name')

    def test_repr(self):
        test_case = TestCase('name', 'result', 'duration')
        self.assertEqual(repr(test_case), 'TestCase(name=name, result=result, duration=duration)')

class TestTestError(unittest.TestCase):
    def test_init(self):
        test_error = TestError('message')
        self.assertEqual(test_error.message, 'message')

    def test_str(self):
        test_error = TestError('message')
        self.assertEqual(str(test_error), 'message')

    def test_repr(self):
        test_error = TestError('message')
        self.assertEqual(repr(test_error), 'TestError(message=message)')

class TestTestFailure(unittest.TestCase):
    def test_init(self):
        test_failure = TestFailure('message', 'expected')
        self.assertEqual(test_failure.message, 'message')
        self.assertEqual(test_failure.expected, 'expected')

    def test_str(self):
        test_failure = TestFailure('message', 'expected')
        self.assertEqual(str(test_failure), 'message')

    def test_repr(self):
        test_failure = TestFailure('message', 'expected')
        self.assertEqual(repr(test_failure), 'TestFailure(message=message, expected=expected)')

class TestTestSuite(unittest.TestCase):
    def test_init(self):
        test_suite = TestSuite('name')
        self.assertEqual(test_suite.name, 'name')

    def test_str(self):
        test_suite = TestSuite('name')
        self.assertEqual(str(test_suite), 'name')

if __name__ == '__main__':
    unittest.main()