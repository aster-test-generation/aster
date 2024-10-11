import unittest
from ansible.modules.cron import CronTab


class TestCronTab(unittest.TestCase):
    def test_init(self):
        from unittest.mock import MagicMock
        user = 'testuser'
        cron_file = 'testfile'
        cron_tab = CronTab(module, user, cron_file)
        self.assertEqual(cron_tab.module, module)
        self.assertEqual(cron_tab.user, user)
        self.assertEqual(cron_tab.root, False)
        self.assertEqual(cron_tab.lines, None)
        self.assertEqual(cron_tab.ansible, '')
        self.assertEqual(cron_tab.n_existing, '')
        self.assertEqual(cron_tab.cron_cmd, module.get_bin_path('crontab', required=True))
        self.assertEqual(cron_tab.cron_file, '/etc/cron.d/testfile')
        self.assertEqual(cron_tab.b_cron_file, b'/etc/cron.d/testfile')

    def test_write(self):
        from unittest.mock import MagicMock
        cron_tab = CronTab(module)
        cron_tab.lines = ['test line 1', 'test line 2']
        cron_tab.write()
        module.run_command.assert_called_with(cron_tab._write_execute(path), use_unsafe_shell=True)
        os.unlink.assert_called_with(path)
        if rc != 0:
            module.fail_json.assert_called_with(msg=err)

if __name__ == '__main__':
    unittest.main()