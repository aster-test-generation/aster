import unittest
from ansible.modules.cron import CronModule


class TestCronModule(unittest.TestCase):
    def test___init__(self):
        instance = CronModule()
        self.assertIsInstance(instance, CronModule)

    def test___str__(self):
        instance = CronModule()
        result = instance.__str__()
        self.assertEqual(result, "CronModule")

    def test___repr__(self):
        instance = CronModule()
        result = instance.__repr__()
        self.assertEqual(result, "CronModule()")

    def test_run(self):
        instance = CronModule()
        result = instance.run()
        self.assertEqual(result, {'changed': False, 'failed': False})

    def test_main(self):
        instance = CronModule()
        result = instance.main()
        self.assertEqual(result, {'changed': False, 'failed': False})

    def test__load_crontab(self):
        instance = CronModule()
        result = instance._load_crontab()
        self.assertEqual(result, [])

    def test__save_crontab(self):
        instance = CronModule()
        result = instance._save_crontab([])
        self.assertEqual(result, True)

    def test__get_crontab(self):
        instance = CronModule()
        result = instance._get_crontab()
        self.assertEqual(result, [])

    def test__set_crontab(self):
        instance = CronModule()
        result = instance._set_crontab([])
        self.assertEqual(result, True)

    def test__del_crontab(self):
        instance = CronModule()
        result = instance._del_crontab([])
        self.assertEqual(result, True)

if __name__ == '__main__':
    unittest.main()