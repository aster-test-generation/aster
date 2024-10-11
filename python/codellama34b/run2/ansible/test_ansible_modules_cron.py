import unittest
from ansible.modules.cron import *



class TestCronTab(unittest.TestCase):
    def test_init(self):
        instance = CronTab(module)
        self.assertEqual(instance.module, None)
        self.assertEqual(instance.user, None)
        self.assertEqual(instance.root, None)
        self.assertEqual(instance.lines, None)
        self.assertEqual(instance.ansible, None)
        self.assertEqual(instance.n_existing, None)
        self.assertEqual(instance.cron_cmd, None)
        self.assertEqual(instance.cron_file, None)

    def test_read(self):
        instance = CronTab(module)
        instance.read()
        self.assertEqual(instance.lines, None)

    def test_read_user_execute(self):
        instance = CronTab(module)
        result = instance._read_user_execute()
        self.assertEqual(result, None)

    def test_write(self):
        instance = CronTab(module)
        instance.write()
        self.assertEqual(instance.lines, None)

    def test_write_user_execute(self):
        instance = CronTab(module)
        result = instance._write_user_execute()
        self.assertEqual(result, None)

    def test_remove(self):
        instance = CronTab(module)
        instance.remove()
        self.assertEqual(instance.lines, None)

    def test_remove_user_execute(self):
        instance = CronTab(module=module)
        result = instance._remove_user_execute()
        self.assertEqual(result, None)

    def test_get_cron_entry(self):
        instance = CronTab(module)
        result = instance.get_cron_entry()
        self.assertEqual(result, None)

    def test_get_cron_job(self):
        instance = CronTab(module)
        result = instance.get_cron_job()
        self.assertEqual(result, None)

    def test_get_cron_env(self):
        instance = CronTab(module)
        result = instance.get_cron_env()
        self.assertEqual(result, None)

    def test_get_cron_entry_as_string(self):
        instance = CronTab(module)
        result = instance.get_cron_entry_as_string()
        self.assertEqual(result, None)

    def test_get_cron_job_as_string(self):
        instance = CronTab(module)
        result = instance.get_cron_job_as_string()
        self.assertEqual(result, None)

    def test_get_cron_env_as_string(self):
        instance = CronTab(module)
        result = instance.get_cron_env_as_string()
        self.assertEqual(result, None)

    def test_add_env(self):
        instance = CronTab(module)
        instance.add_env()
        self.assertEqual(instance.lines, None)

    def test_add_job(self):
        instance = CronTab(module)
        instance.add_job()
        self.assertEqual(instance.lines, None)

    def test_add_entry(self):
        instance = CronTab(module)
        instance.add_entry()
        self.assertEqual(instance.lines, None)

    def test_update_env(self):
        instance = CronTab(module)
        instance.update_env()
        self.assertEqual(instance.lines, None)

    def test_update_job(self):
        instance = CronTab(module)
        instance.update_job()
        self.assertEqual(instance.lines, None)

    def test_update_entry(self):
        instance = CronTab(module=module)
        instance.update_entry()
        self.assertEqual(instance.lines, None)

    def test_remove_env(self):
        instance = CronTab(module)
        instance.remove_env()
        self.assertEqual(instance.lines, None)

if __name__ == '__main__':
    unittest.main()