import unittest
from ansible.modules.cron import CronTab
from ansible.module_utils.basic import AnsibleModule
from ansible.module_utils.common.text.converters import to_bytes
from ansible.module_utils.six.moves import shlex_quote
from tempfile import NamedTemporaryFile
from os import path, getuid
from io import BytesIO


class TestCronTab(unittest.TestCase):
    def setUp(self):
        self.module = AnsibleModule()
        self.cron_tab = CronTab(self.module)

    def test_init(self):
        self.assertEqual(self.cron_tab.module, self.module)
        self.assertIsNone(self.cron_tab.user)
        self.assertFalse(self.cron_tab.root)
        self.assertIsNone(self.cron_tab.lines)
        self.assertEqual(self.cron_tab.cron_cmd, self.module.get_bin_path('crontab', required=True))

    def test_read(self):
        with NamedTemporaryFile() as f:
            f.write(b'0 5,2 * * ls -alh > /dev/null')
            f.seek(0)
            self.cron_tab.cron_file = f.name
            self.cron_tab.read()
            self.assertEqual(self.cron_tab.lines, [b'0 5,2 * * ls -alh > /dev/null'])

    def test_write(self):
        with NamedTemporaryFile() as f:
            self.cron_tab.lines = [b'0 5,2 * * ls -alh > /dev/null']
            self.cron_tab.write(backup_file=f.name)
            self.assertTrue(path.exists(f.name))

    def test_render(self):
        self.cron_tab.lines = [b'0 5,2 * * ls -alh > /dev/null']
        result = self.cron_tab.render()
        self.assertEqual(result, b'0 5,2 * * ls -alh > /dev/null')

    def test__write_execute(self):
        with BytesIO() as f:
            self.cron_tab._write_execute(f)
            self.assertEqual(f.getvalue(), b'crontab -u root -e\n0 5,2 * * ls -alh > /dev/null\n')

    def test_set_default_selinux_context(self):
        self.cron_tab.set_default_selinux_context('/path/to/file', False)

    def test_module_run_command(self):
        with BytesIO() as f:
            self.module.run_command(f, use_unsafe_shell=True)
            self.assertEqual(f.getvalue(), b'')

    def test_module_fail_json(self):
        self.module.fail_json(msg='Error message')

    def test_module_set_default_selinux_context(self):
        self.cron_tab.module.set_default_selinux_context('/path/to/file', False)

    def test_module_run_command_use_unsafe_shell(self):
        with BytesIO() as f:
            self.module.run_command(f, use_unsafe_shell=True)
            self.assertEqual(f.getvalue(), b'')

    def test_module_fail_json_msg(self):
        self.module.fail_json(msg='Error message')

    def test_module_get_bin_path(self):
        self.assertEqual(self.module.get_bin_path('crontab', required=True), 'crontab')

    def test_module_get_bin_path_required(self):
        self.module.get_bin_path('crontab', required=True)

    def test_module_get_bin_path_required_false(self):
        self.module.get_bin_path('crontab', required=False)

    def test_module_get_bin_path_required_true(self):
        self.module.get_bin_path('crontab', required=True)

    def test_module_get_bin_path_required_false_true(self):
        self.module.get_bin_path('crontab', required=False)

    def test_module_get_bin_path_required_true_true(self):
        self.module.get_bin_path('crontab', required=True)

    def test_module_get_bin_path_required_false_false(self):
        self.module.get_bin_path('crontab', required=False)

    def test_module_get_bin_path_required_true_false(self):
        self.module.get_bin_path('crontab', required=True)

    def test_module_get_bin_path_required_false_true(self):
        self.module.get_bin_path('crontab', required=False)

    def test_module_get_bin_path_required_true_true(self):
        self.module.get_bin_path('crontab', required=True)

    def test_module_get_bin_path_required_false_false(self):
        self.module.get_bin_path('crontab', required=False)

    def test_module_get_bin_path_required_true_false(self):
        self.module.get_bin_path('crontab', required=True)

    def test_module_get_bin_path_required_false_true(self):
        self.module.get_bin_path('crontab', required=False)

    def test_module_get_bin_path_required_true_true(self):
        self.module.get_bin_path('crontab', required=True)

    def test_module_get_bin_path_required_false_false(self):
        self.module.get_bin_path('crontab', required=False)

if __name__ == '__main__':
    unittest.main()