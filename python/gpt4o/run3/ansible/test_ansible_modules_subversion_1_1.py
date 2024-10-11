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

    def test_exec_with_error(self):
        self.module.run_command.return_value = (1, '', 'error')
        result = self.svn._exec(['info'], check_returncode=False)
        self.assertEqual(result, 1)

    def test_is_svn_repo(self):
        self.svn._exec = MagicMock(return_value=0)
        result = self.svn.is_svn_repo()
        self.assertTrue(result)

    def test_is_svn_repo_false(self):
        self.svn._exec = MagicMock(return_value=1)
        result = self.svn.is_svn_repo()
        self.assertFalse(result)

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

    def test_switch_false(self):
        self.svn._exec = MagicMock(return_value=['No changes'])
        result = self.svn.switch()
        self.assertFalse(result)

    def test_update(self):
        self.svn._exec = MagicMock(return_value=['A file'])
        result = self.svn.update()
        self.assertTrue(result)

    def test_update_false(self):
        self.svn._exec = MagicMock(return_value=['No changes'])
        result = self.svn.update()
        self.assertFalse(result)

    def test_revert(self):
        self.svn._exec = MagicMock(return_value=['Reverted file'])
        result = self.svn.revert()
        self.assertFalse(result)

    def test_revert_false(self):
        self.svn._exec = MagicMock(return_value=['No changes'])
        result = self.svn.revert()
        self.assertTrue(result)

    def test_get_revision(self):
        self.svn._exec = MagicMock(return_value=['Revision: 1234', 'URL: svn+ssh://an.example.org/path/to/repo'])
        self.svn.REVISION_RE = r'Revision: \d+'
        result = self.svn.get_revision()
        self.assertEqual(result, ('Revision: 1234', 'URL: svn+ssh://an.example.org/path/to/repo'))

    def test_get_revision_no_match(self):
        self.svn._exec = MagicMock(return_value=['No revision info'])
        self.svn.REVISION_RE = r'Revision: \d+'
        result = self.svn.get_revision()
        self.assertEqual(result, ('Unable to get revision', 'Unable to get URL'))

class TestSubversion(unittest.TestCase):
    def setUp(self):
        self.module = MagicMock(spec=AnsibleModule)
        self.svn = Subversion(
            module=self.module,
            dest='/path/to/dest',
            repo='http://example.com/repo',
            revision='HEAD',
            username='user',
            password='pass',
            svn_path='/usr/bin/svn',
            validate_certs=True
        )

    def test_has_option_password_from_stdin(self):
        self.module.run_command.return_value = (0, '1.10.0', '')
        result = self.svn.has_option_password_from_stdin()
        self.assertTrue(result)

    def test_exec(self):
        self.module.run_command.return_value = (0, 'output\nline2', '')
        result = self.svn._exec(['info'])
        self.assertEqual(result, ['output', 'line2'])

    def test_exec_with_password_from_stdin(self):
        self.svn.has_option_password_from_stdin = MagicMock(return_value=True)
        self.module.run_command.return_value = (0, 'output\nline2', '')
        result = self.svn._exec(['info'])
        self.assertEqual(result, ['output', 'line2'])

    def test_is_svn_repo(self):
        self.svn._exec = MagicMock(return_value=0)
        result = self.svn.is_svn_repo()
        self.assertTrue(result)

    def test_checkout(self):
        self.svn._exec = MagicMock()
        self.svn.checkout(force=True)
        self.svn._exec.assert_called_with(['checkout', '--force', '-r', 'HEAD', 'http://example.com/repo', '/path/to/dest'])

    def test_export(self):
        self.svn._exec = MagicMock()
        self.svn.export(force=True)
        self.svn._exec.assert_called_with(['export', '--force', '-r', 'HEAD', 'http://example.com/repo', '/path/to/dest'])

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
        self.assertFalse(result)

    def test_get_revision(self):
        self.svn._exec = MagicMock(return_value=['Revision: 1234', 'URL: http://example.com/repo'])
        self.svn.REVISION_RE = r'Revision:\s+(\d+)'
        result = self.svn.get_revision()
        self.assertEqual(result, ('Revision: 1234', 'URL: http://example.com/repo'))

if __name__ == '__main__':
    unittest.main()