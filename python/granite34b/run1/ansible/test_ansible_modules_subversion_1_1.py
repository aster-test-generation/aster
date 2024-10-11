import unittest
from ansible.modules.subversion import Subversion


class TestSubversion(unittest.TestCase):
    def setUp(self):
        from unittest.mock import MagicMock
        self.dest = '/path/to/dest'
        self.repo = 'svn+ssh://an.example.org/path/to/repo'
        self.revision = 'HEAD'
        self.username = 'user'
        self.password = 'password'
        self.svn_path = '/path/to/svn'
        self.validate_certs = True
        self.subversion = Subversion(self.module, self.dest, self.repo, self.revision, self.username, self.password, self.svn_path, self.validate_certs)

    def test_has_option_password_from_stdin(self):
        self.subversion.has_option_password_from_stdin()
        self.module.run_command.assert_called_with([self.svn_path, '--version', '--quiet'], check_rc=True)

    def test_is_svn_repo(self):
        self.subversion.is_svn_repo()
        self.subversion._exec.assert_called_with(['info', self.dest], check_rc=False)

    def test_checkout(self):
        self.subversion.checkout(force=True)
        self.subversion._exec.assert_called_with(['checkout', '--force', '-r', self.revision, self.repo, self.dest])

    def test_export(self):
        self.subversion.export(force=True)
        self.subversion._exec.assert_called_with(['export', '--force', '-r', self.revision, self.repo, self.dest])

    def test_switch(self):
        self.subversion.switch()
        self.subversion._exec.assert_called_with(['switch', '--revision', self.revision, self.repo, self.dest])

    def test_update(self):
        self.subversion.update()
        self.subversion._exec.assert_called_with(['update', '-r', self.revision, self.dest])

    def test_revert(self):
        self.subversion.revert()
        self.subversion._exec.assert_called_with(['revert', '-R', self.dest])

    def test_get_revision(self):
        self.subversion.get_revision()
        self.subversion._exec.assert_called_with(['info', self.dest])

if __name__ == '__main__':
    unittest.main()