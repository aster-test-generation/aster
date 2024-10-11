import unittest
from unittest.mock import MagicMock, patch
from ansible.plugins.callback.default import CallbackModule, COMPAT_OPTIONS


class TestCallbackModule(unittest.TestCase):

    def setUp(self):
        self.callback = CallbackModule()
        self.callback._display = MagicMock()
        self.callback._play = MagicMock()
        self.callback._play.strategy = 'linear'
        self.callback._last_task_name = None
        self.callback._last_task_banner = None

    def test_init(self):
        self.assertIsNotNone(self.callback._play)
        self.assertIsNone(self.callback._last_task_banner)
        self.assertIsNone(self.callback._last_task_name)
        self.assertEqual(self.callback._task_type_cache, {})

    def test_set_options(self):
        self.callback.get_option = MagicMock(side_effect=lambda x: True)
        self.callback.set_options(load_name='default')
        for option, _ in COMPAT_OPTIONS:
            self.assertTrue(getattr(self.callback, option))

    def test_v2_runner_on_failed(self):
        result = MagicMock()
        result._result = {}
        result._task = MagicMock()
        result._task._uuid = 'uuid'
        result._task.action = 'action'
        self.callback._clean_results = MagicMock()
        self.callback._print_task_banner = MagicMock()
        self.callback._handle_exception = MagicMock()
        self.callback._handle_warnings = MagicMock()
        self.callback._dump_results = MagicMock(return_value='dumped_results')
        self.callback.get_option = MagicMock(return_value=True)
        self.callback.v2_runner_on_failed(self.callback, result)
        self.callback._display.display.assert_called_with('fatal: [None]: FAILED! => dumped_results', color='red', stderr=False)

    def test_v2_runner_on_ok(self):
        result = MagicMock()
        result._result = {'changed': True}
        result._task = MagicMock()
        result._task._uuid = 'uuid'
        self.callback._print_task_banner = MagicMock()
        self.callback._handle_warnings = MagicMock()
        self.callback._clean_results = MagicMock()
        self.callback._run_is_verbose = MagicMock(return_value=False)
        self.callback.v2_runner_on_ok(result)
        self.callback._display.display.assert_called_with("changed: [<MagicMock name='mock._host.get_name()' id='140311829044656'> -> <MagicMock name='mock._task.delegate_to' id='140311821312368'>]", color='yellow')

    def test_v2_runner_on_skipped(self):
        result = MagicMock()
        result._result = {}
        result._task = MagicMock()
        result._task._uuid = 'uuid'
        result._host = MagicMock()
        result._host.get_name = MagicMock(return_value='host_name')
        self.callback._clean_results = MagicMock()
        self.callback._print_task_banner = MagicMock()
        self.callback._dump_results = MagicMock(return_value='dumped_results')
        self.callback._run_is_verbose = MagicMock(return_value=True)
        self.callback.v2_runner_on_skipped(result, display_skipped_hosts=True)
        self.callback._display.display.assert_called_with('skipping: [host_name] => dumped_results', color='blue')

    def test_v2_runner_on_unreachable(self):
        result = MagicMock()
        result._result = {}
        result._task = MagicMock()
        result._task._uuid = 'uuid'
        self.callback._print_task_banner = MagicMock()
        self.callback._dump_results = MagicMock(return_value='dumped_results')
        self.callback.v2_runner_on_failed(result)
        self.callback._display.display.assert_called_with('fatal: [None]: UNREACHABLE! => dumped_results', color='red', stderr=False)

    def test_v2_playbook_on_no_hosts_matched(self):
        self.callback.v2_playbook_on_no_hosts_matched()
        self.callback._display.display.assert_called_with('skipping: no hosts matched', color='cyan')

    def test_v2_playbook_on_no_hosts_remaining(self):
        self.callback.v2_playbook_on_no_hosts_remaining()
        self.callback._display.banner.assert_called_with('NO MORE HOSTS LEFT')

    def test_v2_playbook_on_task_start(self):
        task = MagicMock()
        self.callback._task_start = MagicMock()
        self.callback.v2_playbook_on_task_start(task, is_conditional=True)
        self.callback._task_start.assert_called_with(task, prefix='TASK')

    def test_task_start(self):
        task = MagicMock()
        task._uuid = 'uuid'
        task.get_name = MagicMock(return_value='task_name')
        self.callback._print_task_banner = MagicMock()
        self.callback.v2_runner_on_skipped(result)
        self.assertEqual(self.callback._last_task_name, 'task_name')

    def test_print_task_banner(self):
        task = MagicMock()
        task._uuid = 'uuid'
        task.get_name = MagicMock(return_value='task_name')
        task.no_log = False
        task.check_mode = False
        task.args = {'arg1': 'value1'}
        self.callback._task_type_cache = {'uuid': 'TASK'}
        self.callback._display.verbosity = 1
        self.callback._print_task_path = MagicMock()
        self.callback._print_task_banner(task)
        self.callback._display.banner.assert_called_with('TASK [task_name]')

    def test_v2_playbook_on_cleanup_task_start(self):
        task = MagicMock()
        self.callback._task_start = MagicMock()
        self.callback.v2_playbook_on_cleanup_task_start(task)
        self.callback._task_start.assert_called_with(task, prefix='CLEANUP TASK')

    def test_v2_playbook_on_handler_task_start(self):
        task = MagicMock()
        self.callback._task_start = MagicMock()
        self.callback.v2_playbook_on_handler_task_start(task)
        self.callback._task_start.assert_called_with(task, prefix='RUNNING HANDLER')

    def test_v2_runner_on_start(self):
        host = 'host'
        task = 'task'
        self.callback.get_option = MagicMock(return_value=True)
        self.callback.v2_runner_on_start(host, task)
        self.callback._display.display.assert_called_with(' [started task on host]', color='green')

    def test_v2_playbook_on_play_start(self):
        play = MagicMock()
        play.get_name = MagicMock(return_value='play_name')
        play.check_mode = False
        self.callback.v2_playbook_on_play_start(play)
        self.callback._display.banner.assert_called_with('PLAY [play_name]')

    def test_v2_on_file_diff(self):
        result = MagicMock()
        result._task = MagicMock()
        result._task._uuid = 'uuid'
        result._result = {'diff': 'diff', 'changed': True}
        self.callback._get_diff = MagicMock(return_value='diff')
        self.callback._print_task_banner = MagicMock()
        self.callback.v2_on_file_diff(result)
        self.callback._display.display.assert_called_with('diff')

    def test_v2_runner_item_on_ok(self):
        result = MagicMock()
        result._result = {'changed': True}
        result._task = MagicMock()
        result._task._uuid = 'uuid'
        self.callback._print_task_banner = MagicMock()
        self.callback._get_item_label = MagicMock(return_value='item_label')
        self.callback._clean_results = MagicMock()
        self.callback._run_is_verbose = MagicMock(return_value=False)
        self.callback.v2_runner_item_on_ok(result)
        self.callback._display.display.assert_called_with("changed: [<MagicMock name='mock._host.get_name()' id='140311826498128'> -> <MagicMock name='mock._task.delegate_to' id='140311826281328'>] => (item=item_label)", color='yellow')

    def test_v2_runner_item_on_failed(self):
        result = MagicMock()
        result._result = {}
        result._task = MagicMock()
        result._task._uuid = 'uuid'
        self.callback._print_task_banner = MagicMock()
        self.callback._get_item_label = MagicMock(return_value='item_label')
        self.callback._clean_results = MagicMock()
        self.callback._handle_exception = MagicMock()
        self.callback._handle_warnings = MagicMock()
        self.callback._dump_results = MagicMock(return_value='dumped_results')
        self.callback.v2_runner_on_failed(result)
        self.callback._display.display.assert_called_with('failed: [None] (item=item_label) => dumped_results', color='red', stderr=False)

    def test_v2_runner_item_on_skipped(self):
        result = MagicMock()
        result._result = {}
        result._task = MagicMock()
        result._task._uuid = 'uuid'
        result._host = MagicMock()
        result._host.get_name = MagicMock(return_value='host_name')
        self.callback._print_task_banner = MagicMock()
        self.callback._get_item_label = MagicMock(return_value='item_label')
        self.callback._clean_results = MagicMock()
        self.callback._dump_results = MagicMock(return_value='dumped_results')
        self.callback._run_is_verbose = MagicMock(return_value=True)
        self.callback.v2_runner_on_skipped(result)
        self.callback._display.display.assert_called_with('skipping: [host_name] => (item=item_label) => dumped_results', color='blue')

    def test_v2_playbook_on_include(self):
        included_file = MagicMock()
        included_file._filename = 'filename'
        included_file._hosts = [MagicMock(name='host1'), MagicMock(name='host2')]
        included_file._vars = {}
        self.callback._get_item_label = MagicMock(return_value='item_label')
        self.callback.v2_playbook_on_include(included_file.name)
        self.callback._display.display.assert_called_with('included: filename for host1, host2 => (item=item_label)', color='blue')

if __name__ == '__main__':
    unittest.main()