import unittest
import os
import time
import re
from ansible.module_utils.common.collections import ImmutableDict
from ansible.module_utils._text import to_bytes, to_text
from ansible.plugins.callback import CallbackBase
from ansible.utils._junit_xml import TestCase, TestError, TestFailure, TestSuite, TestSuites

__metaclass__ = type
DOCUMENTATION = '\n    name: junit\n    type: aggregate\n    short_description: write playbook output to a JUnit file.\n    version_added: historical\n    description:\n      - This callback writes playbook output to a JUnit formatted XML file.\n      - "Tasks show up in the report as follows:\n        \'ok\': pass\n        \'failed\' with \'EXPECTED FAILURE\' in the task name: pass\n        \'failed\' with \'TOGGLE RESULT\' in the task name: pass\n        \'ok\' with \'TOGGLE RESULT\' in the task name: failure\n        \'failed\' due to an exception: error\n        \'failed\' for other reasons: failure\n        \'skipped\': skipped"\n    options:\n      output_dir:\n        name: JUnit output dir\n        default: ~/.ansible.log\n        description: Directory to write XML files to.\n        env:\n          - name: JUNIT_OUTPUT_DIR\n      task_class:\n        name: JUnit Task class\n        default: False\n        description: Configure the output to be one class per yaml file\n        env:\n          - name: JUNIT_TASK_CLASS\n      task_relative_path:\n        name: JUnit Task relative path\n        default: none\n        description: Configure the output to use relative paths to given directory\n        version_added: "2.8"\n        env:\n          - name: JUNIT_TASK_RELATIVE_PATH\n      fail_on_change:\n        name: JUnit fail on change\n        default: False\n        description: Consider any tasks reporting "changed" as a junit test failure\n        env:\n          - name: JUNIT_FAIL_ON_CHANGE\n      fail_on_ignore:\n        name: JUnit fail on ignore\n        default: False\n        description: Consider failed tasks as a junit test failure even if ignore_on_error is set\n        env:\n          - name: JUNIT_FAIL_ON_IGNORE\n      include_setup_tasks_in_report:\n        name: JUnit include setup tasks in report\n        default: True\n        description: Should the setup tasks be included in the final report\n        env:\n          - name: JUNIT_INCLUDE_SETUP_TASKS_IN_REPORT\n      hide_task_arguments:\n        name: Hide the arguments for a task\n        default: False\n        description: Hide the arguments for a task\n        version_added: "2.8"\n        env:\n          - name: JUNIT_HIDE_TASK_ARGUMENTS\n      test_case_prefix:\n        name: Prefix to find actual test cases\n        default: <empty>\n        description: Consider a task only as test case if it has this value as prefix. Additionaly failing tasks are recorded as failed test cases.\n        version_added: "2.8"\n        env:\n          - name: JUNIT_TEST_CASE_PREFIX\n    requirements:\n      - enable in configuration\n'
class TaskData:
    def __init__(self, uuid, name, path, play, action):
        self.uuid = uuid
        self.name = name
        self.path = path
        self.play = play
        self.start = None
        self.host_data = {}
        self.start = time.time()
        self.action = action

if __name__ == '__main__':
    unittest.main()