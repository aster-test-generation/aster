import unittest
from ansible.modules.subversion import Subversion


class TestSubversion(unittest.TestCase):
    def setUp(self):
        self.module = AnsibleModule(argument_spec=argument_spec)
        self.dest = '/path/to/checkout'
        self.repo = 'svn+ssh://an.example.org/path/to/repo'
        self.revision = 'HEAD'
        self.username = 'user'
        self.password = 'password'
        self.svn_path = 'svn'
        self.validate_certs = True

    def test_has_option_password_from_stdin(self):
        subversion = Subversion(self.module, self.dest, self.repo, self.revision, self.username, self.password, self.svn_path, self.validate_certs)
        self.assertTrue(subversion.has_option_password_from_stdin())

    def test_exec(self):
        subversion = Subversion(self.module, self.dest, self.repo, self.revision, self.username, self.password, self.svn_path, self.validate_certs)
        self.assertEqual(subversion._exec(['command']), ['output'])

    def test_is_svn_repo(self):
        subversion = Subversion(self.module, self.dest, self.repo, self.revision, self.username, self.password, self.svn_path, self.validate_certs)
        self.assertTrue(subversion.is_svn_repo())

    def test_checkout(self):
        subversion = Subversion(self.module, self.dest, self.repo, self.revision, self.username, self.password, self.svn_path, self.validate_certs)
        subversion.checkout(force=True)

    def test_export(self):
        subversion = Subversion(self.module, self.dest, self.repo, self.revision, self.username, self.password, self.svn_path, self.validate_certs)
        subversion.export(force=True)

    def test_switch(self):
        subversion = Subversion(self.module, self.dest, self.repo, self.revision, self.username, self.password, self.svn_path, self.validate_certs)
        self.assertTrue(subversion.switch())

    def test_update(self):
        subversion = Subversion(self.module, self.dest, self.repo, self.revision, self.username, self.password, self.svn_path, self.validate_certs)
        self.assertTrue(subversion.update())

    def test_revert(self):
        subversion = Subversion(self.module, self.dest, self.repo, self.revision, self.username, self.password, self.svn_path, self.validate_certs)
        self.assertTrue(subversion.revert())

    def test_get_revision(self):
        subversion = Subversion(self.module, self.dest, self.repo, self.revision, self.username, self.password, self.svn_path, self.validate_certs)
        self.assertEqual(subversion.get_revision(), ('revision', 'url'))

if __name__ == '__main__':
    unittest.main()