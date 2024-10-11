import unittest
from unittest.mock import MagicMock, patch
from ansible.modules.subversion import Subversion


class TestSubversion(unittest.TestCase):
    def setUp(self):
        self.module = MagicMock()
        self.dest = "/path/to/dest"
        self.repo = "svn+ssh://an.example.org/path/to/repo"
        self.revision = "HEAD"
        self.username = "user"
        self.password = "pass"
        self.svn_path = "/usr/bin/svn"
        self.validate_certs = True
        self.svn = Subversion(self.module, self.dest, self.repo, self.revision, self.username, self.password, self.svn_path, self.validate_certs)

    def test_init(self):
        self.assertEqual(self.svn.module, self.module)
        self.assertEqual(self.svn.dest, self.dest)
        self.assertEqual(self.svn.repo, self.repo)
        self.assertEqual(self.svn.revision, self.revision)
        self.assertEqual(self.svn.username, self.username)
        self.assertEqual(self.svn.password, self.password)
        self.assertEqual(self.svn.svn_path, self.svn_path)
        self.assertEqual(self.svn.validate_certs, self.validate_certs)

    @patch('ansible.modules.subversion.Subversion._exec')
    def test_get_remote_revision(self, mock_exec):
        mock_exec.return_value = ["Path: .", "URL: svn+ssh://an.example.org/path/to/repo", "Revision: 123"]
        result = self.svn.get_remote_revision()
        self.assertEqual(result, "123")

    @patch('ansible.modules.subversion.Subversion._exec')
    def test_get_remote_revision_no_match(self, mock_exec):
        mock_exec.return_value = ["Path: .", "URL: svn+ssh://an.example.org/path/to/repo"]
        result = self.svn.get_remote_revision()
        self.assertEqual(result, "Unable to get remote revision")

    @patch('ansible.modules.subversion.Subversion._exec')
    def test_has_local_mods(self, mock_exec):
        mock_exec.return_value = ["M       file1", "?       file2"]
        result = self.svn.has_local_mods()
        self.assertTrue(result)

    @patch('ansible.modules.subversion.Subversion._exec')
    def test_has_local_mods_no_mods(self, mock_exec):
        mock_exec.return_value = ["?       file2"]
        result = self.svn.has_local_mods()
        self.assertFalse(result)

    @patch('ansible.modules.subversion.Subversion.get_revision')
    @patch('ansible.modules.subversion.Subversion._exec')
    def test_needs_update(self, mock_exec, mock_get_revision):
        mock_get_revision.return_value = ("Revision: 122", "URL: svn+ssh://an.example.org/path/to/repo")
        mock_exec.return_value = ["Path: .", "URL: svn+ssh://an.example.org/path/to/repo", "Revision: 123"]
        result = self.svn.needs_update()
        self.assertEqual(result, (True, "Revision: 122", "123"))

    @patch('ansible.modules.subversion.Subversion.get_revision')
    @patch('ansible.modules.subversion.Subversion._exec')
    def test_needs_update_no_update(self, mock_exec, mock_get_revision):
        mock_get_revision.return_value = ("Revision: 123", "URL: svn+ssh://an.example.org/path/to/repo")
        mock_exec.return_value = ["Path: .", "URL: svn+ssh://an.example.org/path/to/repo", "Revision: 123"]
        result = self.svn.needs_update()
        self.assertEqual(result, (False, "Revision: 123", "123"))

    @patch('ansible.modules.subversion.Subversion._exec')
    def test_exec(self, mock_exec):
        mock_exec.return_value = ["output"]
        result = self.svn._exec(["status"])
        self.assertEqual(result, ["output"])

if __name__ == '__main__':
    unittest.main()