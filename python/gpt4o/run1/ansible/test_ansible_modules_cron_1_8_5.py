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
        self.assertIsNone(self.cron_tab.user)
        self.assertTrue(self.cron_tab.root)
        self.assertIsNone(self.cron_tab.lines)
        self.assertEqual(self.cron_tab.cron_cmd, '/usr/bin/crontab')
        self.assertIsNone(self.cron_tab.cron_file)

    def test_init_with_user(self):
        cron_tab = CronTab(self.module, user='testuser')
        self.assertEqual(cron_tab.user, 'testuser')

    def test_init_with_cron_file(self):
        with patch('os.path.isabs', return_value=True):
            cron_tab = CronTab(self.module, cron_file='/etc/cron.d/testfile')
            self.assertEqual(cron_tab.cron_file, '/etc/cron.d/testfile')

    def test_init_with_relative_cron_file(self):
        with patch('os.path.isabs', return_value=False):
            cron_tab = CronTab(self.module, cron_file='testfile')
            self.assertEqual(cron_tab.cron_file, '/etc/cron.d/testfile')

    def test_render(self):
        self.cron_tab.lines = ['* * * * * /bin/true']
        result = self.cron_tab.render()
        self.assertEqual(result, '* * * * * /bin/true\n')

    def test_render_empty(self):
        self.cron_tab.lines = []
        result = self.cron_tab.render()
        self.assertEqual(result, '')

    def test_render_with_multiple_lines(self):
        self.cron_tab.lines = ['* * * * * /bin/true', '0 0 * * * /bin/false']
        result = self.cron_tab.render()
        self.assertEqual(result, '* * * * * /bin/true\n0 0 * * * /bin/false\n')

if __name__ == '__main__':
    unittest.main()