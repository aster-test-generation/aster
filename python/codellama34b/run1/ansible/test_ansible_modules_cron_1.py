import unittest
from ansible.modules.cron import *



class TestCronModule(unittest.TestCase):
    def test_cron_module(self):
        instance = cron.CronModule()
        result = instance.run_command(["ls", "-l"])
        self.assertEqual(result, 0)

    def test_cron_module_fail(self):
        instance = cron.CronModule()
        result = instance.run_command(["ls", "-l"], check_rc=True)
        self.assertEqual(result, 1)

    def test_cron_module_fail_msg(self):
        instance = cron.CronModule()
        result = instance.run_command(["ls", "-l"], check_rc=True, msg="test")
        self.assertEqual(result, 1)

    def test_cron_module_fail_msg_rc(self):
        instance = cron.CronModule()
        result = instance.run_command(["ls", "-l"], check_rc=True, msg="test", rc=1)
        self.assertEqual(result, 1)

    def test_cron_module_fail_msg_rc_out(self):
        from cron import CronModule
        result = instance.run_command(["ls", "-l"], check_rc=True, msg="test", rc=1, out=1)
        self.assertEqual(result, 1)

    def test_cron_module_fail_msg_rc_out_err(self):
        from cron import CronModule
        result = instance.run_command(["ls", "-l"], check_rc=True, msg="test", rc=1, out=1, err=1)
        self.assertEqual(result, 1)

    def test_cron_module_fail_msg_rc_out_err_in(self):
        from cron import CronModule
        result = instance.run_command(["ls", "-l"], check_rc=True, msg="test", rc=1, out=1, err=1, in_data="test")
        self.assertEqual(result, 1)

    def test_cron_module_fail_msg_rc_out_err_in_creates(self):
        from cron import CronModule
        result = instance.run_command(["ls", "-l"], check_rc=True, msg="test", rc=1, out=1, err=1, in_data="test", creates="/tmp/test")
        self.assertEqual(result, 1)

    def test_cron_module_fail_msg_rc_out_err_in_creates_removes(self):
        from cron import CronModule
        result = instance.run_command(["ls", "-l"], check_rc=True, msg="test", rc=1, out=1, err=1, in_data="test", creates="/tmp/test", removes="/tmp/test")
        self.assertEqual(result, 1)

    def test_cron_module_fail_msg_rc_out_err_in_creates_removes_chdir(self):
        instance = cron.CronModule()
        result = instance.run_command(["ls", "-l"], check_rc=True, msg="test", rc=1, out=1, err=1, in_data="test", creates="/tmp/test", removes="/tmp/test", chdir="/tmp/test")
        self.assertEqual(result, 1)

    def test_cron_module_fail_msg_rc_out_err_in_creates_removes_chdir_stdin_open_binary(self):
        instance = cron.CronModule()
        result = instance.run_command(["ls", "-l"], check_rc=True, msg="test", rc=1, out=1, err=1, in_data="test", creates="/tmp/test", removes="/tmp/test", chdir="/tmp/test", stdin_open=True, binary_data=True)
        self.assertEqual(result, 1)

if __name__ == '__main__':
    unittest.main()