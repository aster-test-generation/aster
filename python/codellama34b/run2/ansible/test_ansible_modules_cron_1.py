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

    def test_is_special_name(self):
        instance = CronTab(None, None, None)
        result = instance.is_special_name()
        self.assertEqual(result, None)

    def test_is_special_frequency(self):
        instance = CronTab(None, None, None)
        result = instance.is_special_frequency()
        self.assertEqual(result, None)

    def test_is_number(self):
        instance = CronTab(None, None, None)
        result = instance.is_number()
        self.assertEqual(result, None)

    def test_is_range(self):
        instance = CronTab(None, None, None)
        result = instance.is_range()
        self.assertEqual(result, None)

    def test_is_step(self):
        instance = CronTab(None, None, None)
        result = instance.is_step()
        self.assertEqual(result, None)

    def test_is_range_step(self):
        instance = CronTab(None, None, None)
        result = instance.is_range_step()
        self.assertEqual(result, None)

    def test_is_special_range(self):
        instance = CronTab(None, None, None)
        result = instance.is_special_range()
        self.assertEqual(result, None)

    def test_is_special_range_step(self):
        instance = CronTab(None, None, None)
        result = instance.is_special_range_step()
        self.assertEqual(result, None)

    def test_is_month_special_range_step(self):
        instance = CronTab(None, None, None)
        result = instance.is_month_special_range_step()
        self.assertEqual(result, None)

    def test_is_month_special_range(self):
        instance = CronTab(None, None, None)
        result = instance.is_month_special_range()
        self.assertEqual(result, None)

    def test_is_month_step(self):
        instance = CronTab(None, None, None)
        result = instance.is_month_step()
        self.assertEqual(result, None)

if __name__ == '__main__':
    unittest.main()