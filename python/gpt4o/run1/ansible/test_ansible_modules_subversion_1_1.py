from ansible.modules.subversion import LooseVersion
import unittest
from unittest.mock import MagicMock, patch
from ansible.modules.subversion import Subversion
from ansible.module_utils.basic import AnsibleModule


class TestSubversion(unittest.TestCase):
    def setUp(self):
        self.module = MagicMock(spec=AnsibleModule)
        self.svn = Subversion(
            module=self.module,
            dest='/path/to/dest',
            repo='svn+ssh://an.example.org/path/to/repo',
            revision='HEAD',
            username='user',
            password='pass',
            svn_path='/usr/bin/svn',
            validate_certs=True
        )

    def test_init(self):
        self.assertEqual(self.svn.dest, '/path/to/dest')
        self.assertEqual(self.svn.repo, 'svn+ssh://an.example.org/path/to/repo')
        self.assertEqual(self.svn.revision, 'HEAD')
        self.assertEqual(self.svn.username, 'user')
        self.assertEqual(self.svn.password, 'pass')
        self.assertEqual(self.svn.svn_path, '/usr/bin/svn')
        self.assertTrue(self.svn.validate_certs)

    @patch('ansible.modules.subversion.LooseVersion')
    def test_has_option_password_from_stdin(self, mock_loose_version):
        self.module.run_command.return_value = (0, '1.10.0', '')
        mock_loose_version.return_value = LooseVersion('1.10.0')
        result = self.svn.has_option_password_from_stdin()
        self.assertTrue(result)

    @patch('ansible.modules.subversion.LooseVersion')
    def test_has_option_password_from_stdin_false(self, mock_loose_version):
        self.module.run_command.return_value = (0, '1.9.0', '')
        mock_loose_version.return_value = LooseVersion('1.9.0')
        result = self.svn.has_option_password_from_stdin()
        self.assertTrue(result)

    def test_exec(self):
        self.module.run_command.return_value = (0, 'output', '')
        result = self.svn._exec(['info', '--xml'])
        self.assertEqual(result, ['output'])

    def test_exec_with_password_from_stdin(self):
        self.svn.has_option_password_from_stdin = MagicMock(return_value=True)
        self.module.run_command.return_value = (0, 'output', '')
        result = self.svn._exec(['info'])
        self.assertEqual(result, ['output'])

    def test_is_svn_repo(self):
        self.svn._exec = MagicMock(return_value=0)
        result = self.svn.is_svn_repo()
        self.assertTrue(result)

    def test_checkout(self):
        self.svn._exec = MagicMock()
        self.svn.checkout(force=True)
        self.svn._exec.assert_called_with(['checkout', '--force', '-r', 'HEAD', 'svn+ssh://an.example.org/path/to/repo', '/path/to/dest'])

    def test_export(self):
        self.svn._exec = MagicMock()
        self.svn.export(force=True)
        self.svn._exec.assert_called_with(['export', '--force', '-r', 'HEAD', 'svn+ssh://an.example.org/path/to/repo', '/path/to/dest'])

    def test_switch(self):
        self.svn._exec = MagicMock(return_value=['A file'])
        result = self.svn.switch()
        self.assertTrue(result)

    def test_update(self):
        self.svn._exec = MagicMock(return_value=['A file'])
        result = self.svn.update()
        self.assertTrue(result)

    def test_revert(self):
        self.svn._exec = MagicMock(return_value=['Reverted file'])
        result = self.svn.revert()
        self.assertTrue(result is True)

    def test_get_revision(self):
        self.svn._exec = MagicMock(return_value=['URL: svn+ssh://an.example.org/path/to/repo', 'Revision: 1234'])
        self.svn.REVISION_RE = r'Revision: (\d+)'
        result = self.svn.get_revision()
        self.assertEqual(result, ('Revision: 1234', 'URL: svn+ssh://an.example.org/path/to/repo'))

if __name__ == '__main__':
    unittest.main()