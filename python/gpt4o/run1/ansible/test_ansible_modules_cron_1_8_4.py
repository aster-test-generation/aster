import unittest
from unittest.mock import MagicMock, patch
from ansible.modules.cron import CronTab


class TestCronTab(unittest.TestCase):
    def setUp(self):
        self.module = MagicMock()
        self.module.get_bin_path.return_value = '/usr/bin/crontab'
        self.cron_tab = CronTab(self.module)

    def test_init(self):
        self.assertEqual(self.cron_tab.module, self.module)
        self.assertEqual(self.cron_tab.user, None)
        self.assertEqual(self.cron_tab.root, os.getuid() == 0)
        self.assertEqual(self.cron_tab.lines, None)
        self.assertEqual(self.cron_tab.ansible, '')
        self.assertEqual(self.cron_tab.n_existing, '')
        self.assertEqual(self.cron_tab.cron_cmd, '/usr/bin/crontab')
        self.assertEqual(self.cron_tab.cron_file, None)

    def test_init_with_cron_file(self):
        cron_file = '/etc/cron.d/test'
        cron_tab = CronTab(self.module, cron_file=cron_file)
        self.assertEqual(cron_tab.cron_file, cron_file)
        self.assertEqual(cron_tab.b_cron_file, to_bytes(cron_file, errors='surrogate_or_strict'))

    def test_init_with_relative_cron_file(self):
        cron_file = 'test'
        cron_tab = CronTab(self.module, cron_file=cron_file)
        self.assertEqual(cron_tab.cron_file, '/etc/cron.d/test')
        self.assertEqual(cron_tab.b_cron_file, os.path.join(b'/etc/cron.d', to_bytes(cron_file, errors='surrogate_or_strict')))

    def test_do_remove_job(self):
        result = self.cron_tab.do_remove_job([], 'comment', 'job')
        self.assertIsNone(result)

if __name__ == '__main__':
    unittest.main()