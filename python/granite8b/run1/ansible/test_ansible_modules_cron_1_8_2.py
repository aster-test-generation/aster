import unittest
from ansible.modules.cron import CronTab


class TestCronTab(unittest.TestCase):
    def test_do_add_job(self):
        cron_tab = CronTab(None)
        lines = []
        cron_tab.do_add_job(lines, '# comment', 'command')
        self.assertEqual(lines, ['# comment', 'command'])

    def test_read(self):
        cron_tab = CronTab(None)
        cron_tab.read()
        self.assertIsNotNone(cron_tab.lines)

    def test_write(self):
        cron_tab = CronTab(None)
        cron_tab.write()
        self.assertIsNotNone(cron_tab.lines)

    def test_write_to_file(self):
        cron_tab = CronTab(None)
        cron_tab.write_to_file()
        self.assertIsNotNone(cron_tab.lines)

    def test_find_job(self):
        cron_tab = CronTab(None)
        job = cron_tab.find_job(name='test', user='test')
        self.assertIsNone(job)

    def test_find_job_by_id(self):
        cron_tab = CronTab(None)
        job = cron_tab.find_job_by_id(1)
        self.assertIsNone(job)

    def test_find_job_by_comment(self):
        cron_tab = CronTab(None)
        job = cron_tab.find_job_by_comment('test')
        self.assertIsNone(job)

    def test_add_job(self):
        cron_tab = CronTab(None)
        job = cron_tab.add_job(name='test', user='test', minute='*')
        self.assertIsNotNone(job)

    def test_remove_job(self):
        cron_tab = CronTab(None)
        job = cron_tab.remove_job(name='test', user='test')
        self.assertIsNone(job)

    def test_remove_job_by_id(self):
        cron_tab = CronTab(None)
        job = cron_tab.remove_job_by_id(1)
        self.assertIsNone(job)

    def test_remove_job_by_comment(self):
        cron_tab = CronTab(None)
        job = cron_tab.remove_job_by_comment('test')
        self.assertIsNone(job)

    def test_add_cron_file(self):
        cron_tab = CronTab(None)
        cron_file = cron_tab.add_cron_file(name='test')
        self.assertIsNotNone(cron_file)

    def test_remove_cron_file(self):
        cron_tab = CronTab(None)
        cron_file = cron_tab.remove_cron_file(name='test')
        self.assertIsNone(cron_file)

    def test_add_cron_job(self):
        cron_tab = CronTab(None)
        cron_job = cron_tab.add_cron_job(name='test', user='test', minute='*')
        self.assertIsNotNone(cron_job)

    def test_remove_cron_job(self):
        cron_tab = CronTab(None)
        cron_job = cron_tab.remove_cron_job(name='test', user='test')
        self.assertIsNone(cron_job)

    def test_remove_cron_job_by_id(self):
        cron_tab = CronTab(None)
        cron_job = cron_tab.remove_cron_job_by_id(1)
        self.assertIsNone(cron_job)

    def test_remove_cron_job_by_comment(self):
        cron_tab = CronTab(None)
        cron_job = cron_tab.remove_cron_job_by_comment('test')
        self.assertIsNone(cron_job)

    def test_add_cron_env(self):
        cron_tab = CronTab(None)
        cron_env = cron_tab.add_cron_env(name='test', value='test')
        self.assertIsNotNone(cron_env)

if __name__ == '__main__':
    unittest.main()