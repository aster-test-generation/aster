import unittest
from ansible.modules.cron import CronModule


class TestCronModule(unittest.TestCase):
    def test_cron_module_init(self):
        cron_module = CronModule()
        self.assertIsInstance(cron_module, CronModule)

    def test_cron_module_get_env_vars(self):
        cron_module = CronModule()
        cron_module.env_vars = {'PATH': '/usr/bin:/bin'}
        env_vars = cron_module.get_env_vars()
        self.assertEqual(env_vars, 'PATH=/usr/bin:/bin')

    def test_cron_module_get_cron_file(self):
        cron_module = CronModule()
        cron_file = cron_module.get_cron_file()
        self.assertEqual(cron_file, '/etc/cron.d/ansible')

    def test_cron_module_get_cron_lines(self):
        cron_module = CronModule()
        cron_module.env_vars = {'PATH': '/usr/bin:/bin'}
        cron_module.name = 'test_job'
        cron_module.minute = '0'
        cron_module.hour = '5,2'
        cron_module.job = 'ls -alh > /dev/null'
        cron_lines = cron_module.get_cron_lines()
        self.assertEqual(cron_lines, ['PATH=/usr/bin:/bin', '0 5,2 * * test_job ls -alh > /dev/null'])

    def test_cron_module_get_cron_lines_with_special_characters(self):
        cron_module = CronModule()
        cron_module.env_vars = {'PATH': '/usr/bin:/bin'}
        cron_module.name = 'test_job'
        cron_module.minute = '0'
        cron_module.hour = '5,2'
        cron_module.job = 'ls -alh > /dev/null'
        cron_module.special_time = '@reboot'
        cron_lines = cron_module.get_cron_lines()
        self.assertEqual(cron_lines, ['PATH=/usr/bin:/bin', '@reboot test_job ls -alh > /dev/null'])

    def test_cron_module_get_cron_lines_with_user(self):
        cron_module = CronModule()
        cron_module.env_vars = {'PATH': '/usr/bin:/bin'}
        cron_module.name = 'test_job'
        cron_module.minute = '0'
        cron_module.hour = '5,2'
        cron_module.job = 'ls -alh > /dev/null'
        cron_module.user = 'root'
        cron_lines = cron_module.get_cron_lines()
        self.assertEqual(cron_lines, ['PATH=/usr/bin:/bin', '0 5,2 * * root test_job ls -alh > /dev/null'])

    def test_cron_module_get_cron_lines_with_mailto(self):
        cron_module = CronModule()
        cron_module.env_vars = {'PATH': '/usr/bin:/bin'}
        cron_module.name = 'test_job'
        cron_module.minute = '0'
        cron_module.hour = '5,2'
        cron_module.job = 'ls -alh > /dev/null'
        cron_module.mailto = 'root@example.com'
        cron_lines = cron_module.get_cron_lines()
        self.assertEqual(cron_lines, ['PATH=/usr/bin:/bin', '0 5,2 * * root test_job ls -alh > /dev/null', 'MAILTO=root@example.com'])

if __name__ == '__main__':
    unittest.main()