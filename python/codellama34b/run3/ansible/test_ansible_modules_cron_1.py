import unittest
from ansible.modules.cron import *



class TestCronModule(unittest.TestCase):
    def test_cron_module(self):
        from cron import CronModule
        result = instance.run_command(["ls", "-l"])
        self.assertEqual(result, 0)

    def test_cron_module_fail(self):
        from cron import CronModule
        result = instance.run_command(["ls", "-l"])
        self.assertNotEqual(result, 1)

    def test_cron_module_fail_msg(self):
        from cron import CronModule
        result = instance.run_command(["ls", "-l"])
        self.assertNotEqual(result, 1)

    def test_cron_module_fail_rc(self):
        instance = cron.CronModule()
        result = instance.run_command(["ls", "-l"])
        self.assertNotEqual(result, 1)

    def test_cron_module_fail_stdout(self):
        instance = cron.CronModule()
        result = instance.run_command(["ls", "-l"])
        self.assertNotEqual(result, 1)

    def test_cron_module_fail_stderr(self):
        instance = cron.CronModule()
        result = instance.run_command(["ls", "-l"])
        self.assertNotEqual(result, 1)

    def test_cron_module_fail_cmd(self):
        instance = cron.CronModule()
        result = instance.run_command(["ls", "-l"])
        self.assertNotEqual(result, 1)

    def test_cron_module_fail_creates(self):
        from cron import CronModule
        result = instance.run_command(["ls", "-l"])
        self.assertNotEqual(result, 1)

    def test_cron_module_fail_removes(self):
        from cron import CronModule
        result = instance.run_command(["ls", "-l"])
        self.assertNotEqual(result, 1)

    def test_cron_module_fail_chdir(self):
        from cron import CronModule
        result = instance.run_command(["ls", "-l"])
        self.assertNotEqual(result, 1)

    def test_cron_module_fail_stdin(self):
        instance = Cron()
        result = instance.run_command(["ls", "-l"])
        self.assertNotEqual(result, 1)

    def test_cron_module_fail_stdin_add_newline(self):
        from cron import CronModule
        result = instance.run_command(["ls", "-l"])
        self.assertNotEqual(result, 1)

    def test_cron_module_fail_executable(self):
        instance = cron.CronModule()
        result = instance.run_command(["ls", "-l"])
        self.assertNotEqual(result, 1)

    def test_cron_module_fail_path_prefix(self):
        from cron import CronModule
        result = instance.run_command(["ls", "-l"])
        self.assertNotEqual(result, 1)

    def test_cron_module_fail_use_unsafe_shell(self):
        instance = cron_module.CronModule()
        result = instance.run_command(["ls", "-l"])
        self.assertNotEqual(result, 1)

    def test_cron_module_fail_warn(self):
        instance = cron.CronModule()
        result = instance.run_command(["ls", "-l"])
        self.assertNotEqual(result, 1)

    def test_cron_module_fail_strip_empty_ends(self):
        instance = cron.CronModule()
        result = instance.run_command(["ls", "-l"])
        self.assertNotEqual(result, 1)

    def test_cron_module_fail_args(self):
        from cron import CronModule
        result = instance.run_command(["ls", "-l"])
        self.assertNotEqual(result, 1)

if __name__ == '__main__':
    unittest.main()