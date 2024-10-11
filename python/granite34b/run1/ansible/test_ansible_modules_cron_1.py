import unittest
from unittest.mock import MagicMock
from ansible.modules.cron import CronTab


class TestCronTab(unittest.TestCase):
    def setUp(self):
        self.module = MagicMock()
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

    def test_read(self):
        self.cron.read()
        self.assertEqual(self.cron.lines, [])

    def test_do_remove_job(self):
        lines = ['# some comment', '0 5,2 * * ls -alh > /dev/null']
        comment = '# some comment'
        job = '0 5,2 * * ls -alh > /dev/null'
        result = self.cron.do_remove_job(lines, comment, job)
        self.assertEqual(result, None)

if __name__ == '__main__':
    unittest.main()