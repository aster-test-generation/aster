import unittest
from unittest.mock import patch, MagicMock
from ansible.modules.subversion import main


class TestSubversionModule(unittest.TestCase):
    def setUp(self):
        self.module = MagicMock()
        self.module.params = {
            'dest': '/fake/path',
            'repo': 'svn://fake.repo',
            'revision': 'HEAD',
            'force': False,
            'username': 'user',
            'password': 'pass',
            'executable': '/usr/bin/svn',
            'export': False,
            'checkout': True,
            'update': True,
            'switch': True,
            'in_place': False,
            'validate_certs': False
        }
        self.svn = Subversion(self.module, '/fake/path', 'svn://fake.repo', 'HEAD', 'user', 'pass', '/usr/bin/svn', False)

    def test_init(self):
        self.assertEqual(self.svn.module, self.module)
        self.assertEqual(self.svn.dest, '/fake/path')
        self.assertEqual(self.svn.repo, 'svn://fake.repo')
        self.assertEqual(self.svn.revision, 'HEAD')
        self.assertEqual(self.svn.username, 'user')
        self.assertEqual(self.svn.password, 'pass')
        self.assertEqual(self.svn.svn_path, '/usr/bin/svn')
        self.assertEqual(self.svn.validate_certs, False)

    def test_is_svn_repo(self):
        with patch('os.path.exists', return_value=True):
            with patch('os.path.isdir', return_value=True):
                self.assertTrue(self.svn.is_svn_repo())

    def test_get_revision(self):
        with patch.object(self.svn, '_run_svn_command', return_value=('Revision: 1234', '', 0)):
            self.assertEqual(self.svn.get_revision(), '1234')

    def test_get_remote_revision(self):
        with patch.object(self.svn, '_run_svn_command', return_value=('Revision: 1234', '', 0)):
            self.assertEqual(self.svn.get_remote_revision(), '1234')

    def test_checkout(self):
        with patch.object(self.svn, '_run_svn_command', return_value=('', '', 0)):
            self.assertIsNone(self.svn.checkout())

    def test_export(self):
        with patch.object(self.svn, '_run_svn_command', return_value=('', '', 0)):
            self.assertIsNone(self.svn.export())

    def test_update(self):
        with patch.object(self.svn, '_run_svn_command', return_value=('', '', 0)):
            self.assertIsNone(self.svn.update())

    def test_switch(self):
        with patch.object(self.svn, '_run_svn_command', return_value=('', '', 0)):
            self.assertIsNone(self.svn.switch())

    def test_revert(self):
        with patch.object(self.svn, '_run_svn_command', return_value=('', '', 0)):
            self.assertIsNone(self.svn.revert())

    def test_has_local_mods(self):
        with patch.object(self.svn, '_run_svn_command', return_value=('M       file.txt', '', 0)):
            self.assertTrue(self.svn.has_local_mods())

    def test_needs_update(self):
        with patch.object(self.svn, '_run_svn_command', side_effect=[('Revision: 1234', '', 0), ('Revision: 1235', '', 0)]):
            self.assertEqual(self.svn.needs_update(), (True, '1234', '1235'))

    def test_run_svn_command(self):
        with patch('subprocess.Popen') as mock_popen:
            process_mock = MagicMock()
            attrs = {'communicate.return_value': ('output', 'error'), 'returncode': 0}
            process_mock.configure_mock(**attrs)
            mock_popen.return_value = process_mock
            self.assertEqual(self.svn._run_svn_command(['svn', 'info']), ('output', 'error', 0))

    def test_main(self):
        with patch('ansible.modules.subversion.AnsibleModule') as mock_module:
            mock_module.return_value = self.module
            with patch('ansible.modules.subversion.Subversion') as mock_svn:
                mock_svn.return_value = self.svn
                with patch.object(self.svn, 'is_svn_repo', return_value=True):
                    with patch.object(self.svn, 'get_revision', return_value='1234'):
                        with patch.object(self.svn, 'has_local_mods', return_value=False):
                            with patch.object(self.svn, 'update', return_value=None):
                                with patch.object(self.svn, 'switch', return_value=None):
                                    with patch.object(self.svn, 'revert', return_value=None):
                                        with patch.object(self.svn, 'checkout', return_value=None):
                                            with patch.object(self.svn, 'export', return_value=None):
                                                with patch('ansible.modules.subversion.os.path.exists', return_value=True):
                                                    main()
                                                    self.module.exit_json.assert_called()

if __name__ == '__main__':
    unittest.main()