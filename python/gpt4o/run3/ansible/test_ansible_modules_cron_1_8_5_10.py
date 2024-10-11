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
        cron = CronTab(self.module, cron_file='/etc/cron.d/test')
        self.assertEqual(cron.cron_file, '/etc/cron.d/test')
        self.assertEqual(cron.b_cron_file, b'/etc/cron.d/test')

    def test_get_jobnames(self):
        self.cron.lines = ['#Ansible: test', '#Ansible: another_test']
        self.cron.ansible = '#Ansible: '
        jobnames = self.cron.get_jobnames()
        self.assertEqual(jobnames, ['test', 'another_test'])

    @patch('ansible.modules.cron.os.getuid', return_value=0)
    def test_root_user(self, mock_getuid):
        cron = CronTab(self.module)
        self.assertTrue(cron.root)

    @patch('ansible.modules.cron.os.getuid', return_value=1000)
    def test_non_root_user(self, mock_getuid):
        cron = CronTab(self.module)
        self.assertFalse(cron.root)

    def test_read(self):
        with patch('builtins.open', unittest.mock.mock_open(read_data='#Ansible: test\n#Ansible: another_test')):
            self.cron.read()
            self.assertEqual(self.cron.lines, ['#Ansible: test', '#Ansible: another_test'])

class TestCronTab(unittest.TestCase):
    def setUp(self):
        self.module = MagicMock()
        self.module.get_bin_path.return_value = '/usr/bin/crontab'
        self.cron_file = '/etc/cron.d/test_cron'
        self.user = 'test_user'
        self.crontab = CronTab(self.module, user=self.user, cron_file=self.cron_file)

    def test_init(self):
        self.assertEqual(self.crontab.module, self.module)
        self.assertEqual(self.crontab.user, self.user)
        self.assertTrue(self.crontab.root)
        self.assertIsNone(self.crontab.lines)
        self.assertEqual(self.crontab.ansible, '')
        self.assertEqual(self.crontab.n_existing, '')
        self.assertEqual(self.crontab.cron_cmd, '/usr/bin/crontab')
        self.assertEqual(self.crontab.cron_file, self.cron_file)
        self.assertEqual(self.crontab.b_cron_file, b'/etc/cron.d/test_cron')

    def test_get_jobnames(self):
        self.crontab.lines = ['#Ansible: test_job', '#Ansible: another_job']
        self.crontab.ansible = '#Ansible: '
        jobnames = self.crontab.get_jobnames()
        self.assertEqual(jobnames, ['test_job', 'another_job'])

    @patch('os.path.isabs')
    @patch('os.path.join')
    def test_init_with_relative_cron_file(self, mock_join, mock_isabs):
        mock_isabs.return_value = False
        mock_join.side_effect = lambda *args: '/'.join(args)
        crontab = CronTab(self.module, user=self.user, cron_file='relative_cron')
        self.assertEqual(crontab.cron_file, '/etc/cron.d/relative_cron')
        self.assertEqual(crontab.b_cron_file, b'/etc/cron.d/relative_cron')

    @patch('os.path.isabs')
    def test_init_with_absolute_cron_file(self, mock_isabs):
        mock_isabs.return_value = True
        crontab = CronTab(self.module, user=self.user, cron_file='/absolute/path/to/cron')
        self.assertEqual(crontab.cron_file, '/absolute/path/to/cron')
        self.assertEqual(crontab.b_cron_file, b'/absolute/path/to/cron')

    def test_read(self):
        with patch('builtins.open', unittest.mock.mock_open(read_data='#Ansible: test_job\n#Ansible: another_job')) as mock_file:
            self.crontab.read()
            self.assertEqual(self.crontab.lines, ['#Ansible: test_job', '#Ansible: another_job'])
            mock_file.assert_called_once_with(self.cron_file, 'r')

if __name__ == '__main__':
    unittest.main()