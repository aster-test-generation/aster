import unittest
from ansible.modules.cron import *



class TestCronTab(unittest.TestCase):
    def test_init(self):
        instance = CronTab(None, None, None)
        self.assertEqual(instance.module, None)
        self.assertEqual(instance.user, None)
        self.assertEqual(instance.root, None)
        self.assertEqual(instance.lines, None)
        self.assertEqual(instance.ansible, None)
        self.assertEqual(instance.n_existing, None)
        self.assertEqual(instance.cron_cmd, None)
        self.assertEqual(instance.cron_file, None)
        self.assertEqual(instance.b_cron_file, None)

    def test_read(self):
        instance = CronTab(None, None, None)
        instance.read()
        self.assertEqual(instance.lines, None)

    def test_write(self):
        instance = CronTab(None, None, None)
        instance.write()
        self.assertEqual(instance.lines, None)

    def test_add_job(self):
        instance = CronTab(None, None, None)
        instance.add_job()
        self.assertEqual(instance.lines, None)

    def test_remove_job(self):
        instance = CronTab(None, None, None)
        instance.remove_job()
        self.assertEqual(instance.lines, None)

    def test_update_job(self):
        instance = CronTab(None, None, None)
        instance.update_job()
        self.assertEqual(instance.lines, None)

    def test_flush_jobs(self):
        instance = CronTab(None, None, None)
        instance.flush_jobs()
        self.assertEqual(instance.lines, None)

    def test_get_job(self):
        instance = CronTab(None, None, None)
        instance.get_job()
        self.assertEqual(instance.lines, None)

    def test_get_cron_jobs(self):
        instance = CronTab(None, None, None)
        instance.get_cron_jobs()
        self.assertEqual(instance.lines, None)

    def test_get_cron_env(self):
        instance = CronTab(None, None, None)
        instance.get_cron_env()
        self.assertEqual(instance.lines, None)

    def test_get_cron_lines(self):
        instance = CronTab(None, None, None)
        instance.get_cron_lines()
        self.assertEqual(instance.lines, None)

    def test_get_cron_tempfile(self):
        instance = CronTab(None, None, None)
        instance.get_cron_tempfile()
        self.assertEqual(instance.lines, None)

    def test_get_cron_entry(self):
        instance = CronTab(None, None, None)
        instance.get_cron_entry()
        self.assertEqual(instance.lines, None)

    def test_get_cron_entry_with_name(self):
        instance = CronTab(None, None, None)
        instance.get_cron_entry_with_name()
        self.assertEqual(instance.lines, None)

    def test_get_cron_entry_with_special_time(self):
        instance = CronTab(None, None, None)
        instance.get_cron_entry_with_special_time()
        self.assertEqual(instance.lines, None)

    def test_get_cron_entry_with_special_time_and_name(self):
        instance = CronTab(None, None, None)
        instance.get_cron_entry_with_special_time_and_name()
        self.assertEqual(instance.lines, None)

if __name__ == '__main__':
    unittest.main()