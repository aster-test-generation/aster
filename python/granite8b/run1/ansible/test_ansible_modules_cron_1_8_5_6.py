import unittest
from ansible.modules.cron import CronTab


class TestCronTab(unittest.TestCase):
    def test_cron_tab_init(self):
        cron_tab = CronTab(module=None, user='test_user', cron_file='test_cron_file')
        self.assertEqual(cron_tab.user, 'test_user')
        self.assertEqual(cron_tab.cron_file, '/etc/cron.d/test_cron_file')

    def test_cron_tab_remove_job_file(self):
        cron_tab = CronTab(module=None, user='test_user', cron_file='test_cron_file')
        self.assertTrue(cron_tab.remove_job_file())

if __name__ == '__main__':
    unittest.main()