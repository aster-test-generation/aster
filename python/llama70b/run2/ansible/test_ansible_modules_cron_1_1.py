import unittest
from ansible.modules.cron import CronModule


class TestCronModule(unittest.TestCase):
    def test___init__(self):
        instance = CronModule(argument_spec=dict())
        self.assertIsInstance(instance, CronModule)

    def test___str__(self):
        instance = CronModule(argument_spec=dict())
        result = instance.__str__()
        self.assertIsInstance(result, str)

    def test___repr__(self):
        instance = CronModule(argument_spec=dict())
        result = instance.__repr__()
        self.assertIsInstance(result, str)

    def test_run(self):
        instance = CronModule(argument_spec=dict())
        result = instance.run()
        self.assertIsInstance(result, dict)

    def test_main(self):
        instance = CronModule(argument_spec=dict())
        result = instance.main()
        self.assertIsInstance(result, dict)

    def test__load_crontab(self):
        instance = CronModule(argument_spec=dict())
        result = instance._load_crontab()
        self.assertIsInstance(result, list)

    def test__write_crontab(self):
        instance = CronModule(argument_spec=dict())
        result = instance._write_crontab([])
        self.assertIsNone(result)

    def test__get_crontab_user(self):
        instance = CronModule(argument_spec=dict())
        result = instance._get_crontab_user()
        self.assertIsInstance(result, str)

    def test__get_crontab_env(self):
        instance = CronModule(argument_spec=dict())
        result = instance._get_crontab_env()
        self.assertIsInstance(result, dict)

    def test__crontab_line(self):
        instance = CronModule(argument_spec=dict())
        result = instance._crontab_line("minute", "hour", "job")
        self.assertIsInstance(result, str)

    def test__parse_crontab_line(self):
        instance = CronModule(argument_spec=dict())
        result = instance._parse_crontab_line("0 5,2 * * ls -alh > /dev/null")
        self.assertIsInstance(result, dict)

if __name__ == '__main__':
    unittest.main()