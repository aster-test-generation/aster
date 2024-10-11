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

    @patch('os.path.exists', return_value=True)
    def test_is_svn_repo(self, mock_exists):
        self.svn._run = MagicMock(return_value=(0, ''))
        result = self.svn.is_svn_repo()
        self.assertTrue(result)

    @patch('os.path.exists', return_value=False)
    def test_is_svn_repo_not_exists(self, mock_exists):
        result = self.svn.is_svn_repo()
        self.assertFalse(result)

    def test_get_revision(self):
        self.svn._run = MagicMock(return_value=(0, 'Revision: 1234\n'))
        result = self.svn.get_revision()
        self.assertEqual(result, '1234')

    def test_get_remote_revision(self):
        self.svn._run = MagicMock(return_value=(0, 'Revision: 5678\n'))
        result = self.svn.get_remote_revision()
        self.assertEqual(result, '5678')

    def test_checkout(self):
        self.svn._run = MagicMock(return_value=(0, ''))
        result = self.svn.checkout()
        self.assertIsNone(result)

    def test_export(self):
        self.svn._run = MagicMock(return_value=(0, ''))
        result = self.svn.export()
        self.assertIsNone(result)

    def test_update(self):
        self.svn._run = MagicMock(return_value=(0, ''))
        result = self.svn.update()
        self.assertIsNone(result)

    def test_switch(self):
        self.svn._run = MagicMock(return_value=(0, ''))
        result = self.svn.switch()
        self.assertIsNone(result)

    def test_revert(self):
        self.svn._run = MagicMock(return_value=(0, ''))
        result = self.svn.revert()
        self.assertIsNone(result)

    def test_has_local_mods(self):
        self.svn._run = MagicMock(return_value=(0, 'M       modified_file\n'))
        result = self.svn.has_local_mods()
        self.assertTrue(result)

    def test_needs_update(self):
        self.svn._run = MagicMock(return_value=(0, 'Status against revision: 1234\n'))
        result = self.svn.needs_update()
        self.assertEqual(result, (False, '1234', '1234'))

    def test_run(self):
        self.svn._run = MagicMock(return_value=(0, ''))
        result = self.svn._run(['svn', 'info'])
        self.assertEqual(result, (0, ''))

    @patch('ansible.modules.subversion.AnsibleModule')
    def test_main(self, mock_module):
        mock_module.return_value = self.module
        with patch('ansible.modules.subversion.Subversion') as mock_svn:
            mock_svn.return_value = self.svn
            main()
            self.module.exit_json.assert_called()

if __name__ == '__main__':
    unittest.main()