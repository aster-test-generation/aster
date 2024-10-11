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
        self.assertEqual(instance.ansible, None)
        self.assertEqual(instance.n_existing, None)

    def test_write(self):
        instance = CronTab(None, None, None)
        instance.write()
        self.assertEqual(instance.lines, None)
        self.assertEqual(instance.ansible, None)
        self.assertEqual(instance.n_existing, None)

    def test_add_job(self):
        instance = CronTab(None, None, None)
        instance.add_job()
        self.assertEqual(instance.lines, None)
        self.assertEqual(instance.ansible, None)
        self.assertEqual(instance.n_existing, None)

    def test_remove_job(self):
        instance = CronTab(None, None, None)
        instance.remove_job()
        self.assertEqual(instance.lines, None)
        self.assertEqual(instance.ansible, None)
        self.assertEqual(instance.n_existing, None)

    def test_flush_jobs(self):
        instance = CronTab(None, None, None)
        instance.flush_jobs()
        self.assertEqual(instance.lines, None)
        self.assertEqual(instance.ansible, None)
        self.assertEqual(instance.n_existing, None)

    def test_get_cron_job(self):
        instance = CronTab(None, None, None)
        instance.get_cron_job()
        self.assertEqual(instance.lines, None)
        self.assertEqual(instance.ansible, None)
        self.assertEqual(instance.n_existing, None)

    def test_get_cron_jobs(self):
        instance = CronTab(None, None, None)
        instance.get_cron_jobs()
        self.assertEqual(instance.lines, None)
        self.assertEqual(instance.ansible, None)
        self.assertEqual(instance.n_existing, None)

    def test_get_cron_env(self):
        instance = CronTab(None, None, None)
        instance.get_cron_env()
        self.assertEqual(instance.lines, None)
        self.assertEqual(instance.ansible, None)
        self.assertEqual(instance.n_existing, None)

    def test_get_cron_envs(self):
        instance = CronTab(None, None, None)
        instance.get_cron_envs()
        self.assertEqual(instance.lines, None)
        self.assertEqual(instance.ansible, None)
        self.assertEqual(instance.n_existing, None)

    def test_add_env(self):
        instance = CronTab(None, None, None)
        instance.add_env()
        self.assertEqual(instance.lines, None)
        self.assertEqual(instance.ansible, None)
        self.assertEqual(instance.n_existing, None)

if __name__ == '__main__':
    unittest.main()