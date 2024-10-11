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
        if cron_file:
            if os.path.isabs(cron_file):
                self.assertEqual(cron_tab.cron_file, cron_file)
                self.assertEqual(cron_tab.b_cron_file, to_bytes(cron_file, errors='surrogate_or_strict'))
            else:
                self.assertEqual(cron_tab.cron_file, os.path.join('/etc/cron.d', cron_file))
                self.assertEqual(cron_tab.b_cron_file, os.path.join(b'/etc/cron.d', to_bytes(cron_file, errors='surrogate_or_strict')))
        else:
            self.assertEqual(cron_tab.cron_file, None)
        cron_tab.read()

    def test_remove_job_file(self):
        cron_tab = CronTab(None, None, None)
        cron_tab.cron_file = 'test_file'
        cron_tab.b_cron_file = to_bytes('test_file', errors='surrogate_or_strict')
        os.unlink(cron_tab.cron_file)
        result = cron_tab.remove_job_file()
        self.assertTrue(result)

if __name__ == '__main__':
    unittest.main()