import unittest
from unittest.mock import MagicMock
from ansible.modules.cron import CronTab


class TestCronTab(unittest.TestCase):
    def test_init(self):
        module = MagicMock()
        user = 'testuser'
        cron_file = 'testfile'
        cron_tab = CronTab(module, user, cron_file)
        self.assertEqual(cron_tab.module, module)
        self.assertEqual(cron_tab.user, user)
        self.assertEqual(cron_tab.root, False)
        self.assertEqual(cron_tab.lines, None)
        self.assertEqual(cron_tab.ansible, '')
        self.assertEqual(cron_tab.n_existing, '')
        self.assertEqual(cron_tab.cron_cmd, module.get_bin_path('crontab', required=True))
        self.assertEqual(cron_tab.cron_file, '/etc/cron.d/testfile')
        self.assertEqual(cron_tab.b_cron_file, b'/etc/cron.d/testfile')

    def test_read(self):
        module = MagicMock()
        user = 'testuser'
        cron_file = 'testfile'
        cron_tab = CronTab(module, user, cron_file)
        cron_tab.read()
        self.assertEqual(cron_tab.lines, [])

    def test_write(self):
        module = MagicMock()
        user = 'testuser'
        cron_file = 'testfile'
        cron_tab = CronTab(module, user, cron_file)
        cron_tab.write()
        module.assert_called_with(
            cmd=f'crontab -l -u {user}',
            executable='/bin/sh',
            stdin_add_newline=False,
            removes=cron_tab.cron_file,
            warn=False,
            rc_dep=None,
            no_log=False,
            input_data=None,
            environment=None,
            complex_args=None,
            path_prefix=None,
            cwd=None,
            umask=None,
            executable_env=None,
            encoding=None,
            errors=None,
            shebang=None,
            timeout=None,
            reset_system_locale=True,
            exclude_args=None,
        )

    def test_do_comment(self):
        module = MagicMock()
        user = 'testuser'
        cron_file = 'testfile'
        cron_tab = CronTab(module, user, cron_file)
        name = 'testname'
        ansiblename = cron_tab.do_comment(name)
        self.assertEqual(ansiblename, '# Ansible: ' + name)

    def test_do_uncomment(self):
        module = MagicMock()
        user = 'testuser'
        cron_file = 'testfile'
        cron_tab = CronTab(module, user, cron_file)
        name = 'testname'
        ansiblename = '# Ansible: ' + name
        uncommentedname = cron_tab.do_uncomment(ansiblename)
        self.assertEqual(uncommentedname, name)

    def test_is_special(self):
        module = MagicMock()
        user = 'testuser'
        cron_file = 'testfile'
        cron_tab = CronTab(module, user, cron_file)
        name = '@reboot'
        result = cron_tab.is_special(name)
        self.assertEqual(result, True)

    def test_is_comment(self):
        module = MagicMock()
        user = 'testuser'
        cron_file = 'testfile'
        cron_tab = CronTab(module, user, cron_file)
        line = '# test line'
        result = cron_tab.is_comment(line)
        self.assertEqual(result, True)

    def test_is_ansiblename(self):
        module = MagicMock()
        user = 'testuser'
        cron_file = 'testfile'
        cron_tab = CronTab(module, user, cron_file)
        line = '# Ansible: test line'
        result = cron_tab.is_ansiblename(line)
        self.assertEqual(result, True)

    def test_is_job(self):
        module = MagicMock()
        user = 'testuser'
        cron_file = 'testfile'
        cron_tab = CronTab(module, user, cron_file)
        line = 'test line'
        result = cron_tab.is_job(line)
        self.assertEqual(result, True)

if __name__ == '__main__':
    unittest.main()