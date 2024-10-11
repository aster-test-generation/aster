import unittest
from ansible.modules.subversion import *



class TestSubversion(unittest.TestCase):
    def test_get_remote_revision(self):
        instance = Subversion(None, None, None, None, None, None, None, None)
        result = instance.get_remote_revision()
        self.assertEqual(result, None)

    def test_has_local_mods(self):
        instance = Subversion(None, None, None, None, None, None, None, None)
        result = instance.has_local_mods()
        self.assertEqual(result, None)

    def test_needs_update(self):
        instance = Subversion(None, None, None, None, None, None, None, None)
        result = instance.needs_update()
        self.assertEqual(result, None)

    def test_get_revision(self):
        instance = Subversion(None, None, None, None, None, None, None, None)
        result = instance.get_revision()
        self.assertEqual(result, None)

    def test_exec(self):
        instance = Subversion(None, None, None, None, None, None, None, None)
        result = instance._exec(None)
        self.assertEqual(result, None)

    def test_init(self):
        instance = Subversion(None, None, None, None, None, None, None, None)
        result = instance.__init__(None, None, None, None, None, None, None, None)
        self.assertEqual(result, None)

    def test_main(self):
        result = main()
        self.assertEqual(result, None)

    def test_run_command(self):
        result = run_command()
        self.assertEqual(result, None)

    def test_run_command_check_rc(self):
        result = run_command_check_rc()
        self.assertEqual(result, None)

    def test_run_command_bare(self):
        result = run_command_bare()
        self.assertEqual(result, None)

    def test_run_command_bare_check_rc(self):
        result = run_command_bare_check_rc()
        self.assertEqual(result, None)

    def test_run_command_check_rc_custom(self):
        result = run_command_check_rc_custom()
        self.assertEqual(result, None)

    def test_run_command_check_rc_custom_ignore_errors(self):
        result = run_command_check_rc_custom_ignore_errors()
        self.assertEqual(result, None)

    def test_run_command_check_rc_custom_warn_only(self):
        result = run_command_check_rc_custom_warn_only()
        self.assertEqual(result, None)

    def test_run_command_check_rc_default(self):
        result = run_command_check_rc_default()
        self.assertEqual(result, None)

    def test_run_command_check_rc_default_ignore_errors(self):
        result = run_command_check_rc_default_ignore_errors()
        self.assertEqual(result, None)

    def test_run_command_check_rc_default_warn_only(self):
        result = run_command_check_rc_default_warn_only()
        self.assertEqual(result, None)

    def test_run_command_check_rc_ignore_errors(self):
        result = run_command_check_rc_ignore_errors()
        self.assertEqual(result, None)

    def test_run_command_check_rc_warn_only(self):
        result = run_command_check_rc_warn_only()
        self.assertEqual(result, None)

    def test_run_command_custom(self):
        result = run_command_custom()
        self.assertEqual(result, None)

if __name__ == '__main__':
    unittest.main()