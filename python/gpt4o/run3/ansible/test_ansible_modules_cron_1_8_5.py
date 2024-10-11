from ansible.modules.cron import to_bytes
import os
import unittest
from unittest.mock import MagicMock, patch
from ansible.modules.cron import CronTab


class TestCronTab(unittest.TestCase):
    def setUp(self):
        self.module = MagicMock()
        self.module.get_bin_path.return_value = '/usr/bin/crontab'
        self.cron = CronTab(self.module)

    def test_init(self):
        self.assertEqual(self.cron.module, self.module)
        self.assertEqual(self.cron.user, None)
        self.assertEqual(self.cron.root, os.getuid() == 0)
        self.assertEqual(self.cron.lines, None)
        self.assertEqual(self.cron.ansible, '')
        self.assertEqual(self.cron.n_existing, '')
        self.assertEqual(self.cron.cron_cmd, '/usr/bin/crontab')
        self.assertEqual(self.cron.cron_file, None)

    def test_init_with_cron_file(self):
        cron_file = '/etc/cron.d/test'
        cron = CronTab(self.module, cron_file=cron_file)
        self.assertEqual(cron.cron_file, cron_file)
        self.assertEqual(cron.b_cron_file, to_bytes(cron_file, errors='surrogate_or_strict'))

    def test_init_with_relative_cron_file(self):
        cron_file = 'test'
        cron = CronTab(self.module, cron_file=cron_file)
        self.assertEqual(cron.cron_file, '/etc/cron.d/test')
        self.assertEqual(cron.b_cron_file, os.path.join(b'/etc/cron.d', to_bytes(cron_file, errors='surrogate_or_strict')))

    def test_render(self):
        self.cron.lines = ['0 5,2 * * * ls -alh > /dev/null']
        result = self.cron.render()
        self.assertEqual(result, '0 5,2 * * * ls -alh > /dev/null\n')

    def test_render_empty(self):
        self.cron.lines = []
        result = self.cron.render()
        self.assertEqual(result, '')

    @patch('ansible.modules.cron.os.getuid', return_value=0)
    def test_root_user(self, mock_getuid):
        cron = CronTab(self.module)
        self.assertTrue(cron.root)

    @patch('ansible.modules.cron.os.getuid', return_value=1000)
    def test_non_root_user(self, mock_getuid):
        cron = CronTab(self.module)
        self.assertFalse(cron.root)

if __name__ == '__main__':
    unittest.main()