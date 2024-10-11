import unittest
from ansible.modules.cron import CronTab


class TestCronTab(unittest.TestCase):
    def test_init(self):
        from unittest.mock import MagicMock
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
        from unittest.mock import MagicMock
        cron_tab = CronTab(module)
        cron_tab.lines = ['test_line1', 'test_line2']
        cron_tab.write()
        module.run_command.assert_called_with('crontab -l > /tmp/crontab.Ansibletmp', use_unsafe_shell=True)
        module.fail_json.assert_not_called()
        module.set_default_selinux_context.assert_not_called()

if __name__ == '__main__':
    unittest.main()