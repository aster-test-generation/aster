import unittest
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
        self.assertEqual(cron_tab.cron_file, os.path.join('/etc/cron.d', cron_file))
        self.assertEqual(cron_tab.b_cron_file, os.path.join(b'/etc/cron.d', to_bytes(cron_file, errors='surrogate_or_strict')))

    def test_remove_job_file(self):
        cron_tab = CronTab(None)
        cron_tab.cron_file = 'test_file'
        os.remove = MagicMock(return_value=True)
        self.assertTrue(cron_tab.remove_job_file())
        os.remove.assert_called_with('test_file')

if __name__ == '__main__':
    unittest.main()