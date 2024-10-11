import unittest
from ansible.modules.cron import CronTab


class TestCronTab(unittest.TestCase):
    def test_init(self):
        cron_tab = CronTab(None)
        self.assertEqual(cron_tab.root, True)
        self.assertEqual(cron_tab.lines, None)
        self.assertEqual(cron_tab.ansible, '')
        self.assertEqual(cron_tab.n_existing, '')
        self.assertEqual(cron_tab.cron_cmd, 'crontab')
        self.assertEqual(cron_tab.cron_file, None)
        self.assertEqual(cron_tab.b_cron_file, None)

    def test_read(self):
        cron_tab = CronTab(None)
        cron_tab.read()
        self.assertIsNotNone(cron_tab.lines)
        self.assertGreater(len(cron_tab.lines), 0)

    def test_write_to_file(self):
        cron_tab = CronTab(None)
        cron_tab.write_to_file()
        self.assertEqual(cron_tab.lines, None)

    def test_set_file(self):
        cron_tab = CronTab(None)
        cron_tab.set_file('test_file')
        self.assertEqual(cron_tab.cron_file, 'test_file')
        self.assertEqual(cron_tab.b_cron_file, b'test_file')

    def test_set_user(self):
        cron_tab = CronTab(None)
        cron_tab.set_user('test_user')
        self.assertEqual(cron_tab.user, 'test_user')

    def test_set_tab(self):
        cron_tab = CronTab(None)
        cron_tab.set_tab()
        self.assertIsNotNone(cron_tab.lines)
        self.assertGreater(len(cron_tab.lines), 0)

    def test_set_env(self):
        cron_tab = CronTab(None)
        cron_tab.set_env()
        self.assertIsNotNone(cron_tab.lines)
        self.assertGreater(len(cron_tab.lines), 0)

    def test_set_special_time(self):
        cron_tab = CronTab(None)
        cron_tab.set_special_time()
        self.assertIsNotNone(cron_tab.lines)
        self.assertGreater(len(cron_tab.lines), 0)

    def test_set_cron_jobs(self):
        cron_tab = CronTab(None)
        cron_tab.set_cron_jobs()
        self.assertIsNotNone(cron_tab.lines)
        self.assertGreater(len(cron_tab.lines), 0)

    def test_set_all(self):
        cron_tab = CronTab(None)
        cron_tab.set_all()
        self.assertIsNotNone(cron_tab.lines)
        self.assertGreater(len(cron_tab.lines), 0)

    def test_get_cron_jobs(self):
        cron_tab = CronTab(None)
        cron_jobs = cron_tab.get_cron_jobs()
        self.assertIsNotNone(cron_jobs)
        self.assertGreater(len(cron_jobs), 0)

    def test_get_cron_job(self):
        cron_tab = CronTab(None)
        cron_job = cron_tab.get_cron_job(0)
        self.assertIsNotNone(cron_job)
        self.assertEqual(cron_job.name, 'Ansible Cron Job')

    def test_get_cron_job_by_name(self):
        cron_tab = CronTab(None)
        cron_job = cron_tab.get_cron_job_by_name('Ansible Cron Job')
        self.assertIsNotNone(cron_job)
        self.assertEqual(cron_job.name, 'Ansible Cron Job')

    def test_get_cron_job_by_name_not_found(self):
        cron_tab = CronTab(None)
        cron_job = cron_tab.get_cron_job_by_name('Not Found')
        self.assertIsNone(cron_job)

if __name__ == '__main__':
    unittest.main()