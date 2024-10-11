import unittest
from ansible.modules.cron import CronTab


class TestCronTab(unittest.TestCase):
    def setUp(self):
        self.module = mock.MagicMock()
        self.cron = CronTab(self.module)

    def test_init(self):
        self.assertEqual(self.cron.module, self.module)
        self.assertEqual(self.cron.user, None)
        self.assertEqual(self.cron.root, True)
        self.assertEqual(self.cron.lines, None)
        self.assertEqual(self.cron.ansible, '')
        self.assertEqual(self.cron.n_existing, '')
        self.assertEqual(self.cron.cron_cmd, 'crontab')
        self.assertEqual(self.cron.cron_file, None)

    def test_add_job(self):
        name = 'test_job'
        job = 'test_command'
        self.cron.add_job(name, job)
        self.assertEqual(self.cron.lines[-2], '# %s' % name)
        self.assertEqual(self.cron.lines[-1], '%s' % job)

if __name__ == '__main__':
    unittest.main()