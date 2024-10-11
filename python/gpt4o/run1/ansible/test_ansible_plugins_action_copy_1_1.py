import unittest
from unittest.mock import MagicMock, patch
from ansible.plugins.action.copy import ActionModule
from ansible.errors import AnsibleFileNotFound


class TestActionModule(unittest.TestCase):
    def setUp(self):
        self.action_module = ConcreteActionModule()
        self.action_module._task = MagicMock()
        self.action_module._task.args = {}
        self.action_module._play_context = MagicMock()
        self.action_module._play_context.no_log = False
        self.action_module._play_context.diff = False
        self.action_module._play_context.check_mode = False
        self.action_module._loader = MagicMock()
        self.action_module._connection = MagicMock()
        self.action_module._connection._shell = MagicMock()
        self.action_module._connection._shell.tmpdir = '/tmp'
        self.action_module._connection._shell.path_has_trailing_slash = MagicMock(return_value=False)
        self.action_module._connection._shell.join_path = MagicMock(side_effect=lambda *args: '/'.join(args))

    def test_ensure_invocation(self):
        result = {}
        self.action_module._ensure_invocation(result)
        self.assertIn('invocation', result)

    def test_copy_file_not_found(self):
        self.action_module._loader.get_real_file = MagicMock(side_effect=AnsibleFileNotFound('file not found'))
        result = self.action_module._copy_file('source_full', 'source_rel', None, None, 'dest', {}, False)
        self.assertTrue(result['failed'])

    def test_copy_file_with_content_and_dir_as_dest(self):
        self.action_module._connection._shell.path_has_trailing_slash = MagicMock(return_value=True)
        self.action_module._execute_remote_stat = MagicMock(return_value={'exists': True, 'isdir': True})
        result = self.action_module._copy_file('source_full', 'source_rel', 'content', 'content_tempfile', 'dest', {}, False)
        self.assertTrue(result['failed'])

    def test_copy_file_no_force(self):
        self.action_module._execute_remote_stat = MagicMock(return_value={'exists': True, 'isdir': False, 'checksum': 'checksum'})
        self.action_module._loader.get_real_file = MagicMock(return_value='source_full')
        result = self.action_module._copy_file('source_full', 'source_rel', None, None, 'dest', {}, False)
        self.assertIsNone(result)

    def test_copy_file_with_diff(self):
        self.action_module._execute_remote_stat = MagicMock(return_value={'exists': False, 'isdir': False, 'checksum': 'checksum'})
        self.action_module._loader.get_real_file = MagicMock(return_value='source_full')
        self.action_module._play_context.diff = True
        self.action_module._get_diff_data = MagicMock(return_value='diff_data')
        result = self.action_module._copy_file('source_full', 'source_rel', None, None, 'dest', {}, False)
        self.assertIn('diff', result)

    def test_create_content_tempfile(self):
        content = 'test content'
        with patch('tempfile.mkstemp', return_value=(1, 'tempfile')), patch('os.fdopen', return_value=MagicMock()) as mock_fdopen:
            result = self.action_module._create_content_tempfile(content)
            self.assertEqual(result, 'tempfile')
            mock_fdopen().write.assert_called_with(content.encode())

    def test_remove_tempfile_if_content_defined(self):
        with patch('os.remove') as mock_remove:
            self.action_module._remove_tempfile_if_content_defined('content', 'tempfile')
            mock_remove.assert_called_with('tempfile')

if __name__ == '__main__':
    unittest.main()