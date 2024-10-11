import os
import time
import re
from ansible.module_utils.common.collections import ImmutableDict
from ansible.module_utils._text import to_bytes, to_text
from ansible.plugins.callback import CallbackBase
from ansible.utils._junit_xml import TestCase, TestError, TestFailure, TestSuite, TestSuites

__metaclass__ = type

class TestTaskData:
    def test_init(self):
        task_data = TaskData('123', 'Test Task', '/path/to/task.yml', 'Test Play', 'action')
        assert task_data.uuid == '123'
        assert task_data.name == 'Test Task'
        assert task_data.path == '/path/to/task.yml'
        assert task_data.play == 'Test Play'
        assert task_data.start is not None
        assert task_data.host_data == {}
        assert task_data.action == 'action'

    def test_add_host(self):
        task_data = TaskData('123', 'Test Task', '/path/to/task.yml', 'Test Play', 'action')
        host = HostData('456', 'Test Host', 'ok', 'result')
        task_data.add_host(host)
        assert task_data.host_data['456'] == host


if __name__ == '__main__':
    unittest.main()