import unittest
from ansible.modules.cron import CronTab

class TestCronTab(unittest.TestCase):
    def test_init(self):
        module = None
        user = 'root'
        cron_file = '/etc/cron.d/test'
        cron_tab = CronTab(module, user, cron_file)
        self.assertEqual(cron_tab.module, module)
        self.assertEqual(cron_tab.user, user)
        self.assertEqual(cron_tab.root, True)
        self.assertEqual(cron_tab.lines, None)
        self.assertEqual(cron_tab.ansible, '')
        self.assertEqual(cron_tab.n_existing, '')
        self.assertEqual(cron_tab.cron_cmd, '/usr/bin/crontab')
        self.assertEqual(cron_tab.cron_file, '/etc/cron.d/test')
        self.assertEqual(cron_tab.b_cron_file, b'/etc/cron.d/test')

    def test_find_job(self):
        name = 'test_job'
        job = '0 5,2 * * ls -alh > /dev/null'
        cron_tab = CronTab(None)
        cron_tab.lines = [
            '# Ansible: test_job',
            '0 5,2 * * ls -alh > /dev/null',
            '# Ansible: another_job',
            '0 5,2 * * ls -alh > /dev/null'
        ]
        result = cron_tab.find_job(name, job)
        self.assertEqual(result, ['# Ansible: test_job', '0 5,2 * * ls -alh > /dev/null', True])

if __name__ == '__main__':
    unittest.main()