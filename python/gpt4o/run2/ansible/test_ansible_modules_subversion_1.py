import unittest
from unittest.mock import MagicMock, patch
from ansible.modules.subversion import Subversion


class TestSubversion(unittest.TestCase):
    def setUp(self):
        self.module = MagicMock()
        self.dest = '/path/to/dest'
        self.repo = 'svn+ssh://an.example.org/path/to/repo'
        self.revision = 'HEAD'
        self.username = 'user'
        self.password = 'pass'
        self.svn_path = '/usr/bin/svn'
        self.validate_certs = True
        self.instance = Subversion(self.module, self.dest, self.repo, self.revision, self.username, self.password, self.svn_path, self.validate_certs)

    def test_init(self):
        self.assertEqual(self.instance.module, self.module)
        self.assertEqual(self.instance.dest, self.dest)
        self.assertEqual(self.instance.repo, self.repo)
        self.assertEqual(self.instance.revision, self.revision)
        self.assertEqual(self.instance.username, self.username)
        self.assertEqual(self.instance.password, self.password)
        self.assertEqual(self.instance.svn_path, self.svn_path)
        self.assertEqual(self.instance.validate_certs, self.validate_certs)

    @patch('ansible.modules.subversion.Subversion._exec')
    def test_get_remote_revision(self, mock_exec):
        mock_exec.return_value = ['Revision: 1234']
        self.instance.REVISION_RE = r'Revision: (\d+)'
        result = self.instance.get_remote_revision()
        self.assertEqual(result, '1234')

    @patch('ansible.modules.subversion.Subversion._exec')
    def test_get_remote_revision_no_match(self, mock_exec):
        mock_exec.return_value = ['No revision info']
        self.instance.REVISION_RE = r'Revision: (\d+)'
        result = self.instance.get_remote_revision()
        self.assertEqual(result, 'Unable to get remote revision')

    @patch('ansible.modules.subversion.Subversion._exec')
    def test_has_local_mods(self, mock_exec):
        mock_exec.return_value = [' M file1', 'A  file2']
        result = self.instance.has_local_mods()
        self.assertTrue(result)

    @patch('ansible.modules.subversion.Subversion._exec')
    def test_has_local_mods_no_mods(self, mock_exec):
        mock_exec.return_value = ['? file1', 'X  file2']
        result = self.instance.has_local_mods()
        self.assertFalse(result)

    @patch('ansible.modules.subversion.Subversion.get_revision')
    @patch('ansible.modules.subversion.Subversion._exec')
    def test_needs_update(self, mock_exec, mock_get_revision):
        mock_get_revision.return_value = ('Revision: 1234', 'url')
        mock_exec.return_value = ['Revision: 1235']
        self.instance.REVISION_RE = r'Revision: (\d+)'
        result = self.instance.needs_update()
        self.assertEqual(result, (True, 'Revision: 1234', '1235'))

    @patch('ansible.modules.subversion.Subversion.get_revision')
    @patch('ansible.modules.subversion.Subversion._exec')
    def test_needs_update_no_update(self, mock_exec, mock_get_revision):
        mock_get_revision.return_value = ('Revision: 1235', 'url')
        mock_exec.return_value = ['Revision: 1234']
        self.instance.REVISION_RE = r'Revision: (\d+)'
        result = self.instance.needs_update()
        self.assertEqual(result, (False, 'Revision: 1235', '1234'))

    @patch('ansible.modules.subversion.Subversion._exec')
    def test_exec(self, mock_exec):
        mock_exec.return_value = ['output']
        result = self.instance._exec(['status'])
        self.assertEqual(result, ['output'])

if __name__ == '__main__':
    unittest.main()