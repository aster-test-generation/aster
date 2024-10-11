import unittest
from ansible.modules.cron import CronModule


class TestCronModule(unittest.TestCase):
    def test___init__(self):
        instance = CronModule()
        self.assertIsInstance(instance, CronModule)

    def test___str__(self):
        instance = CronModule()
        result = instance.__str__()
        self.assertIsInstance(result, str)

    def test___repr__(self):
        instance = CronModule()
        result = instance.__repr__()
        self.assertIsInstance(result, str)

    def test_run(self):
        instance = CronModule()
        result = instance.run({})
        self.assertIsInstance(result, dict)

    def test_main(self):
        instance = CronModule()
        result = instance.main()
        self.assertIsNone(result)

    def test__load_crontab(self):
        instance = CronModule()
        result = instance._load_crontab()
        self.assertIsInstance(result, list)

    def test__save_crontab(self):
        instance = CronModule()
        result = instance._save_crontab([])
        self.assertIsNone(result)

    def test__get_crontab_entry(self):
        instance = CronModule()
        result = instance._get_crontab_entry("test")
        self.assertIsInstance(result, str)

    def test__set_crontab_entry(self):
        instance = CronModule()
        result = instance._set_crontab_entry("test", "0 0 * * *")
        self.assertIsNone(result)

    def test__delete_crontab_entry(self):
        instance = CronModule()
        result = instance._delete_crontab_entry("test")
        self.assertIsNone(result)

if __name__ == '__main__':
    unittest.main()