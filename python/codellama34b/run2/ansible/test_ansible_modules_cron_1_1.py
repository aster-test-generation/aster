import unittest
from ansible.modules.cron import *



class TestCronModule(unittest.TestCase):
    def test_cron_module(self):
        from cron import CronModule
        result = instance.run_command(["ls", "-l"])
        self.assertEqual(result, 0)

    def test_cron_module_fail(self):
        instance = cron.CronModule()
        result = instance.run_command(["ls", "-l"])
        self.assertNotEqual(result, 1)

    def test_cron_module_fail_msg(self):
        from cron import CronModule
        result = instance.run_command(["ls", "-l"])
        self.assertNotEqual(result, "ls: cannot access 'ls': No such file or directory")

    def test_cron_module_fail_rc(self):
        from cron import CronModule
        result = instance.run_command(["ls", "-l"])
        self.assertNotEqual(result, 2)

    def test_cron_module_fail_stdout(self):
        instance = cron.CronModule()
        result = instance.run_command(["ls", "-l"])
        self.assertNotEqual(result, "ls: cannot access 'ls': No such file or directory")

    def test_cron_module_fail_stderr(self):
        from cron import CronModule
        result = instance.run_command(["ls", "-l"])
        self.assertNotEqual(result, "ls: cannot access 'ls': No such file or directory")

    def test_cron_module_fail_cmd(self):
        instance = cron.CronModule()
        result = instance.run_command(["ls", "-l"])
        self.assertNotEqual(result, "ls -l")

    def test_cron_module_fail_creates(self):
        from cron import CronModule
        result = instance.run_command(["ls", "-l"])
        self.assertNotEqual(result, "ls: cannot access 'ls': No such file or directory")

    def test_cron_module_fail_removes(self):
        from cron import CronModule
        result = instance.run_command(["ls", "-l"])
        self.assertNotEqual(result, "ls: cannot access 'ls': No such file or directory")

    def test_cron_module_fail_chdir(self):
        instance = cron.CronModule()
        result = instance.run_command(["ls", "-l"])
        self.assertNotEqual(result, "ls: cannot access 'ls': No such file or directory")

    def test_cron_module_fail_stdin(self):
        instance = cron.CronModule()
        result = instance.run_command(["ls", "-l"])
        self.assertNotEqual(result, "ls: cannot access 'ls': No such file or directory")

    def test_cron_module_fail_stdin_add_newlines(self):
        instance = cron.CronModule()
        result = instance.run_command(["ls", "-l"])
        self.assertNotEqual(result, "ls: cannot access 'ls': No such file or directory")

    def test_cron_module_fail_strip_empty_ends(self):
        from cron import CronModule
        result = instance.run_command(["ls", "-l"])
        self.assertNotEqual(result, "ls: cannot access 'ls': No such file or directory")

    def test_cron_module_fail_clean_args(self):
        from cron import CronModule
        result = instance.run_command(["ls", "-l"])
        self.assertNotEqual(result, "ls: cannot access 'ls': No such file or directory")

    def test_cron_module_fail_clean_kwargs(self):
        from cron import CronModule
        result = instance.run_command(["ls", "-l"])
        self.assertNotEqual(result, "ls: cannot access 'ls': No such file or directory")

if __name__ == '__main__':
    unittest.main()