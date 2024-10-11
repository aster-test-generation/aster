import unittest
from unittest.mock import MagicMock, patch
from ansible.modules.cron import CronTab


class TestCronTab(unittest.TestCase):
    def setUp(self):
        self.module = MagicMock()
        self.module.get_bin_path.return_value = '/usr/bin/crontab'
        self.module.run_command.return_value = (0, '', '')
        self.module.selinux_enabled.return_value = False
        self.module.set_default_selinux_context.return_value = None

    def test_init(self):
        instance = CronTab(self.module, user='testuser', cron_file='/etc/cron.d/testfile')
        self.assertEqual(instance.user, 'testuser')
        self.assertEqual(instance.cron_file, '/etc/cron.d/testfile')

    def test_write_with_backup_file(self):
        instance = CronTab(self.module)
        with patch('builtins.open', unittest.mock.mock_open()) as mock_file:
            instance.write(backup_file='/tmp/backup')
            mock_file.assert_called_with('/tmp/backup', 'wb')

    def test_write_with_cron_file(self):
        instance = CronTab(self.module, cron_file='/etc/cron.d/testfile')
        with patch('builtins.open', unittest.mock.mock_open()) as mock_file:
            instance.write()
            mock_file.assert_called_with(b'/etc/cron.d/testfile', 'wb')

    def test_write_without_cron_file(self):
        instance = CronTab(self.module)
        with patch('tempfile.mkstemp', return_value=(1, '/tmp/crontab')) as mock_mkstemp, \
             patch('os.chmod') as mock_chmod, \
             patch('os.fdopen', unittest.mock.mock_open()) as mock_fdopen, \
             patch('os.unlink') as mock_unlink:
            instance.write()
            mock_mkstemp.assert_called_with(prefix='crontab')
            mock_chmod.assert_called_with('/tmp/crontab', int('0644', 8))
            mock_fdopen.assert_called_with(1, 'wb')
            mock_unlink.assert_called_with('/tmp/crontab')

    def test_write_with_selinux_enabled(self):
        self.module.selinux_enabled.return_value = True
        instance = CronTab(self.module, cron_file='/etc/cron.d/testfile')
        with patch('builtins.open', unittest.mock.mock_open()):
            instance.write()
            self.module.set_default_selinux_context.assert_called_with('/etc/cron.d/testfile', False)

    def test_write_execute(self):
        instance = CronTab(self.module)
        result = instance._write_execute('/tmp/crontab')
        self.assertEqual(result, '/usr/bin/crontab /tmp/crontab')

    def test_render(self):
        instance = CronTab(self.module)
        instance.lines = ['# Example cron job']
        result = instance.render()
        self.assertEqual(result, '# Example cron job\n')

    def test_read(self):
        instance = CronTab(self.module)
        with patch('builtins.open', unittest.mock.mock_open(read_data='# Example cron job')) as mock_file:
            instance.read()
            mock_file.assert_called_with('/etc/crontab', 'rb')
            self.assertEqual(instance.lines, ['# Example cron job'])

    def test_fail_json(self):
        instance = CronTab(self.module)
        with self.assertRaises(SystemExit):
            instance.module.fail_json(msg='Error message')

if __name__ == '__main__':
    unittest.main()