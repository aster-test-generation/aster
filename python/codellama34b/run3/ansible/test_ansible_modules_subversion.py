import unittest
from ansible.modules.subversion import *



class TestSubversion(unittest.TestCase):
    def test_subversion(self):
        instance = Subversion(self)
        result = instance.subversion()
        self.assertEqual(result, None)

    def test_checkout(self):
        instance = svn.Subversion()
        result = instance.checkout()
        self.assertEqual(result, None)

    def test_export(self):
        instance = Subversion(self)
        result = instance.export()
        self.assertEqual(result, None)

    def test_switch(self):
        instance = Subversion.Subversion()
        result = instance.switch()
        self.assertEqual(result, None)

    def test_update(self):
        instance = Subversion
        result = instance.update()
        self.assertEqual(result, None)

    def test_revert(self):
        instance = Subversion(self.repo_path)
        result = instance.revert()
        self.assertEqual(result, None)

    def test_has_local_mods(self):
        instance = Subversion(self)
        result = instance.has_local_mods()
        self.assertEqual(result, None)

    def test_get_revision(self):
        instance = Subversion()
        result = instance.get_revision()
        self.assertEqual(result, None)

    def test_get_remote_revision(self):
        instance = Subversion()
        result = instance.get_remote_revision()
        self.assertEqual(result, None)

    def test_needs_update(self):
        instance = Subversion(self.url, self.username, self.password)
        result = instance.needs_update()
        self.assertEqual(result, None)

    def test_is_svn_repo(self):
        instance = Subversion(None)
        result = instance.is_svn_repo()
        self.assertEqual(result, None)

    def test_run_command(self):
        instance = Subversion(self)
        result = instance.run_command()
        self.assertEqual(result, None)

    def test_run_command_with_password(self):
        instance = Subversion
        result = instance.run_command_with_password()
        self.assertEqual(result, None)

    def test_run_command_with_password_stdin(self):
        instance = Subversion(path)
        result = instance.run_command_with_password_stdin()
        self.assertEqual(result, None)

    def test_run_command_with_password_stdin_fallback(self):
        instance = Subversion(None)
        result = instance.run_command_with_password_stdin_fallback()
        self.assertEqual(result, None)

    def test_run_command_with_password_stdin_fallback_pre_1_10(self):
        instance = Subversion()
        result = instance.run_command_with_password_stdin_fallback_pre_1_10()
        self.assertEqual(result, None)

    def test_run_command_with_password_stdin_fallback_pre_1_10_pre_1_9(self):
        instance = Subversion(None)
        result = instance.run_command_with_password_stdin_fallback_pre_1_10_pre_1_9()
        self.assertEqual(result, None)

    def test_run_command_with_password_stdin_fallback_pre_1_10_pre_1_9_pre_1_8(self):
        instance = Subversion(self.repo_path)
        result = instance.run_command_with_password_stdin_fallback_pre_1_10_pre_1_9_pre_1_8()
        self.assertEqual(result, None)

if __name__ == '__main__':
    unittest.main()