import unittest
import os
import tempfile
from unittest.mock import MagicMock, patch
from ansible.modules.replace import write_changes


class TestWriteChanges(unittest.TestCase):
    def setUp(self):
        self.module = MagicMock()
        self.module.tmpdir = tempfile.gettempdir()
        self.module.params = {
            'validate': None,
            'unsafe_writes': False
        }

    @patch('os.fdopen')
    @patch('tempfile.mkstemp')
    def test_write_changes_no_validate(self, mock_mkstemp, mock_fdopen):
        mock_mkstemp.return_value = (1, 'tempfile')
        mock_file = MagicMock()
        mock_fdopen.return_value = mock_file

        write_changes(self.module, b'contents', 'path')

        mock_mkstemp.assert_called_once_with(dir=self.module.tmpdir)
        mock_fdopen.assert_called_once_with(1, 'wb')
        mock_file.write.assert_called_once_with(b'contents')
        mock_file.close.assert_called_once()
        self.module.atomic_move.assert_called_once_with('tempfile', 'path', unsafe_writes=False)

    @patch('os.fdopen')
    @patch('tempfile.mkstemp')
    def test_write_changes_with_validate_success(self, mock_mkstemp, mock_fdopen):
        self.module.params['validate'] = 'validate %s'
        mock_mkstemp.return_value = (1, 'tempfile')
        mock_file = MagicMock()
        mock_fdopen.return_value = mock_file
        self.module.run_command.return_value = (0, 'output', 'error')

        write_changes(self.module, b'contents', 'path')

        mock_mkstemp.assert_called_once_with(dir=self.module.tmpdir)
        mock_fdopen.assert_called_once_with(1, 'wb')
        mock_file.write.assert_called_once_with(b'contents')
        mock_file.close.assert_called_once()
        self.module.run_command.assert_called_once_with('validate tempfile')
        self.module.atomic_move.assert_called_once_with('tempfile', 'path', unsafe_writes=False)

    @patch('os.fdopen')
    @patch('tempfile.mkstemp')
    def test_write_changes_with_validate_failure(self, mock_mkstemp, mock_fdopen):
        self.module.params['validate'] = 'validate %s'
        mock_mkstemp.return_value = (1, 'tempfile')
        mock_file = MagicMock()
        mock_fdopen.return_value = mock_file
        self.module.run_command.return_value = (1, 'output', 'error')

        with self.assertRaises(Exception):
            write_changes(self.module, b'contents', 'path')

        self.assertTrue('failed to validate' in str(context.exception))
        mock_mkstemp.assert_called_once_with(dir=self.module.tmpdir)
        mock_fdopen.assert_called_once_with(1, 'wb')
        mock_file.write.assert_called_once_with(b'contents')
        mock_file.close.assert_called_once()
        self.module.run_command.assert_called_once_with('validate tempfile')
        self.module.fail_json.assert_called_once_with(msg='failed to validate: rc:1 error:error')

if __name__ == '__main__':
    unittest.main()