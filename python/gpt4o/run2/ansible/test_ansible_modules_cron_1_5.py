import unittest
import os
import tempfile
from unittest.mock import MagicMock, patch
from ansible.modules.cron import CronTab
from ansible.module_utils.basic import AnsibleModule


class TestCronTab(unittest.TestCase):
    def setUp(self):
        self.module = MagicMock(spec=AnsibleModule)
        self.module.get_bin_path.return_value = '/usr/bin/crontab'
        self.module.run_command.return_value = (0, '', '')
        self.module.selinux_enabled.return_value = False
        self.module.set_default_selinux_context.return_value = None

    def test_init_with_cron_file(self):
        instance = CronTab(self.module, cron_file='/etc/cron.d/test')
        self.assertEqual(instance.cron_file, '/etc/cron.d/test')

    def test_init_without_cron_file(self):
        instance = CronTab(self.module)
        self.assertIsNone(instance.cron_file)

    def test_write_with_backup_file(self):
        instance = CronTab(self.module)
        with tempfile.NamedTemporaryFile(delete=False) as tmpfile:
            backup_file = tmpfile.name
        instance.render = MagicMock(return_value='test content')
        instance.write(backup_file=backup_file)
        with open(backup_file, 'rb') as f:
            content = f.read()
        self.assertEqual(content, b'test content')
        os.remove(backup_file)

    def test_write_without_backup_file(self):
        instance = CronTab(self.module)
        instance.render = MagicMock(return_value='test content')
        with patch('tempfile.mkstemp', return_value=(None, '/tmp/test_crontab')):
            with patch('os.fdopen', return_value=open('/tmp/test_crontab', 'wb')) as mock_fdopen:
                instance.write()
                mock_fdopen().write.assert_called_with(b'test content')
        os.remove('/tmp/test_crontab')

    def test_write_with_cron_file(self):
        instance = CronTab(self.module, cron_file='/etc/cron.d/test')
        instance.render = MagicMock(return_value='test content')
        with patch('builtins.open', unittest.mock.mock_open()) as mock_file:
            instance.write()
            mock_file().write.assert_called_with(b'test content')

    def test_write_execute(self):
        instance = CronTab(self.module)
        result = instance._write_execute('/tmp/test_crontab')
        self.assertIn('/usr/bin/crontab', result)

    def test_selinux_enabled(self):
        instance = CronTab(self.module, cron_file='/etc/cron.d/test')
        instance.write()
        self.module.set_default_selinux_context.assert_called_with('/etc/cron.d/test', False)

    def test_fail_json_on_error(self):
        self.module.run_command.return_value = (1, '', 'error')
        instance = CronTab(self.module)
        with self.assertRaises(Exception):
            instance.write()

if __name__ == '__main__':
    unittest.main()