import unittest
from unittest.mock import MagicMock, patch
from ansible.modules.lineinfile import write_changes
import tempfile
import os

class TestWriteChanges(unittest.TestCase):
    @patch('ansible.modules.lineinfile.tempfile.mkstemp')
    @patch('ansible.modules.lineinfile.os.fdopen')
    @patch('ansible.modules.lineinfile.to_bytes')
    @patch('ansible.modules.lineinfile.to_native')
    @patch('ansible.modules.lineinfile.os.path.realpath')
    def test_write_changes_no_validate(self, mock_realpath, mock_to_native, mock_to_bytes, mock_fdopen, mock_mkstemp):
        # Setup
        module = MagicMock()
        module.tmpdir = '/tmp'
        module.params = {'validate': None, 'unsafe_writes': False}
        b_lines = [b'line1\n', b'line2\n']
        dest = '/path/to/dest'
        
        tmpfd = 123
        tmpfile = '/tmp/tmpfile'
        mock_mkstemp.return_value = (tmpfd, tmpfile)
        mock_fdopen.return_value.__enter__.return_value = MagicMock()
        
        # Call the function
        write_changes(module, b_lines, dest)
        
        # Assertions
        mock_mkstemp.assert_called_once_with(dir=module.tmpdir)
        mock_fdopen.assert_called_once_with(tmpfd, 'wb')
        mock_fdopen.return_value.__enter__.return_value.writelines.assert_called_once_with(b_lines)
        module.atomic_move.assert_called_once_with(tmpfile, mock_to_native.return_value, unsafe_writes=module.params['unsafe_writes'])
        mock_to_bytes.assert_called_once_with(dest, errors='surrogate_or_strict')
        mock_realpath.assert_called_once_with(mock_to_bytes.return_value, errors='surrogate_or_strict')
        mock_to_native.assert_called_once_with(mock_realpath.return_value, errors='surrogate_or_strict')

    @patch('ansible.modules.lineinfile.tempfile.mkstemp')
    @patch('ansible.modules.lineinfile.os.fdopen')
    @patch('ansible.modules.lineinfile.to_bytes')
    @patch('ansible.modules.lineinfile.to_native')
    @patch('ansible.modules.lineinfile.os.path.realpath')
    def test_write_changes_with_validate_success(self, mock_realpath, mock_to_native, mock_to_bytes, mock_fdopen, mock_mkstemp):
        # Setup
        module = MagicMock()
        module.tmpdir = '/tmp'
        module.params = {'validate': 'echo %s', 'unsafe_writes': False}
        b_lines = [b'line1\n', b'line2\n']
        dest = '/path/to/dest'
        
        tmpfd = 123
        tmpfile = '/tmp/tmpfile'
        mock_mkstemp.return_value = (tmpfd, tmpfile)
        mock_fdopen.return_value.__enter__.return_value = MagicMock()
        module.run_command.return_value = (0, 'output', 'error')
        
        # Call the function
        write_changes(module, b_lines, dest)
        
        # Assertions
        mock_mkstemp.assert_called_once_with(dir=module.tmpdir)
        mock_fdopen.assert_called_once_with(tmpfd, 'wb')
        mock_fdopen.return_value.__enter__.return_value.writelines.assert_called_once_with(b_lines)
        module.run_command.assert_called_once_with(mock_to_bytes.return_value)
        module.atomic_move.assert_called_once_with(tmpfile, mock_to_native.return_value, unsafe_writes=module.params['unsafe_writes'])
        mock_to_bytes.assert_any_call('echo /tmp/tmpfile', errors='surrogate_or_strict')
        mock_to_bytes.assert_any_call(dest, errors='surrogate_or_strict')
        mock_realpath.assert_called_once_with(mock_to_bytes.return_value, errors='surrogate_or_strict')
        mock_to_native.assert_called_once_with(mock_realpath.return_value, errors='surrogate_or_strict')

    @patch('ansible.modules.lineinfile.tempfile.mkstemp')
    @patch('ansible.modules.lineinfile.os.fdopen')
    @patch('ansible.modules.lineinfile.to_bytes')
    @patch('ansible.modules.lineinfile.to_native')
    @patch('ansible.modules.lineinfile.os.path.realpath')
    def test_write_changes_with_validate_failure(self, mock_realpath, mock_to_native, mock_to_bytes, mock_fdopen, mock_mkstemp):
        # Setup
        module = MagicMock()
        module.tmpdir = '/tmp'
        module.params = {'validate': 'echo %s', 'unsafe_writes': False}
        b_lines = [b'line1\n', b'line2\n']
        dest = '/path/to/dest'
        
        tmpfd = 123
        tmpfile = '/tmp/tmpfile'
        mock_mkstemp.return_value = (tmpfd, tmpfile)
        mock_fdopen.return_value.__enter__.return_value = MagicMock()
        module.run_command.return_value = (1, 'output', 'error')
        
        # Call the function
        with self.assertRaises(Exception) as context:
            write_changes(module, b_lines, dest)
        
        # Assertions
        self.assertTrue('failed to validate' in str(context.exception))
        mock_mkstemp.assert_called_once_with(dir=module.tmpdir)
        mock_fdopen.assert_called_once_with(tmpfd, 'wb')
        mock_fdopen.return_value.__enter__.return_value.writelines.assert_called_once_with(b_lines)
        module.run_command.assert_called_once_with(mock_to_bytes.return_value)
        module.fail_json.assert_called_once_with(msg='failed to validate: rc:1 error:error')
        mock_to_bytes.assert_any_call('echo /tmp/tmpfile', errors='surrogate_or_strict')
        mock_to_bytes.assert_any_call(dest, errors='surrogate_or_strict')
        mock_realpath.assert_not_called()
        mock_to_native.assert_not_called()

if __name__ == '__main__':
    unittest.main()