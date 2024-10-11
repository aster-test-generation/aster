import unittest
from unittest.mock import MagicMock, call
from ansible.modules.cron import CronTab


class TestCronTab(unittest.TestCase):
    def test_init(self):
        module = MagicMock()
        user = 'test_user'
        cron_file = 'test_file'
        cron_tab = CronTab(module, user, cron_file)
        self.assertEqual(cron_tab.module, module)
        self.assertEqual(cron_tab.user, user)
        self.assertEqual(cron_tab.root, False)
        self.assertEqual(cron_tab.lines, None)
        self.assertEqual(cron_tab.ansible, '')
        self.assertEqual(cron_tab.n_existing, '')
        self.assertEqual(cron_tab.cron_cmd, module.get_bin_path('crontab', required=True))
        self.assertEqual(cron_tab.cron_file, '/etc/cron.d/test_file')
        self.assertEqual(cron_tab.b_cron_file, b'/etc/cron.d/test_file')

    def test_write(self):
        module = MagicMock()
        cron_tab = CronTab(module)
        cron_tab.render = MagicMock(return_value='test_render')
        cron_tab.write()
        module.assert_has_calls([
            call.get_bin_path('crontab', required=True),
            call.run_command(cron_tab._write_execute('test_file'), use_unsafe_shell=True)
        ])
        cron_tab.write(backup_file='test_backup_file')
        module.assert_has_calls([
            call.get_bin_path('crontab', required=True),
            call.run_command(cron_tab._write_execute('test_backup_file'), use_unsafe_shell=True)
        ])

if __name__ == '__main__':
    unittest.main()