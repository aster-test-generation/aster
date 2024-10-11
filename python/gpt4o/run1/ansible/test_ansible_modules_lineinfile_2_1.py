import unittest
from unittest.mock import MagicMock, patch
from ansible.modules.lineinfile import write_changes
from ansible.module_utils.basic import AnsibleModule
from ansible.module_utils._text import to_bytes, to_native


class TestWriteChanges(unittest.TestCase):
    @patch('ansible.modules.lineinfile.tempfile.mkstemp')
    @patch('ansible.modules.lineinfile.os.fdopen')
    @patch('ansible.modules.lineinfile.os.path.realpath')
    @patch('ansible.modules.lineinfile.to_bytes')
    @patch('ansible.modules.lineinfile.to_native')
    @patch('ansible.modules.lineinfile.AnsibleModule.atomic_move')
    def test_write_changes_valid(self, mock_atomic_move, mock_to_native, mock_to_bytes, mock_realpath, mock_fdopen, mock_mkstemp):
        # Setup
        module = MagicMock()
        module.tmpdir = '/tmp'
        module.params = {'validate': None, 'unsafe_writes': False}
        b_lines = [b'line1\n', b'line2\n']
        dest = '/path/to/dest'
        
        tmpfd = 1
        tmpfile = '/tmp/tmpfile'
        mock_mkstemp.return_value = (tmpfd, tmpfile)
        mock_fdopen.return_value.__enter__.return_value = MagicMock()
        mock_realpath.return_value = '/real/path/to/dest'
        mock_to_bytes.side_effect = lambda x, errors=None: x.encode() if isinstance(x, str) else x
        mock_to_native.side_effect = lambda x, errors=None: x.decode() if isinstance(x, bytes) else x

        # Execute
        write_changes(module, b_lines, dest)

        # Verify
        mock_mkstemp.assert_called_once_with(dir=module.tmpdir)
        mock_fdopen.assert_called_once_with(tmpfd, 'wb')
        mock_fdopen.return_value.__enter__.return_value.writelines.assert_called_once_with(b_lines)
        mock_realpath.assert_called_once_with(b'/path/to/dest')
        mock_to_bytes.assert_any_call('/path/to/dest', errors='surrogate_or_strict')
        mock_to_native.assert_called_once_with('/real/path/to/dest', errors='surrogate_or_strict')
        mock_atomic_move.assert_called_once_with(tmpfile, '/real/path/to/dest', unsafe_writes=False)

    @patch('ansible.modules.lineinfile.tempfile.mkstemp')
    @patch('ansible.modules.lineinfile.os.fdopen')
    @patch('ansible.modules.lineinfile.os.path.realpath')
    @patch('ansible.modules.lineinfile.to_bytes')
    @patch('ansible.modules.lineinfile.to_native')
    @patch('ansible.modules.lineinfile.AnsibleModule.atomic_move')
    def test_write_changes_invalid(self, mock_atomic_move, mock_to_native, mock_to_bytes, mock_realpath, mock_fdopen, mock_mkstemp):
        # Setup
        module = MagicMock()
        module.tmpdir = '/tmp'
        module.params = {'validate': 'echo %s', 'unsafe_writes': False}
        b_lines = [b'line1\n', b'line2\n']
        dest = '/path/to/dest'
        
        tmpfd = 1
        tmpfile = '/tmp/tmpfile'
        mock_mkstemp.return_value = (tmpfd, tmpfile)
        mock_fdopen.return_value.__enter__.return_value = MagicMock()
        mock_realpath.return_value = '/real/path/to/dest'
        mock_to_bytes.side_effect = lambda x, errors=None: x.encode() if isinstance(x, str) else x
        mock_to_native.side_effect = lambda x, errors=None: x.decode() if isinstance(x, bytes) else x
        module.run_command.return_value = (1, '', 'error')

        # Execute
        with self.assertRaises(Exception):
            write_changes(module, b_lines, dest)

        # Verify
        self.assertTrue('failed to validate' in str(context.exception))
        mock_mkstemp.assert_called_once_with(dir=module.tmpdir)
        mock_fdopen.assert_called_once_with(tmpfd, 'wb')
        mock_fdopen.return_value.__enter__.return_value.writelines.assert_called_once_with(b_lines)
        mock_realpath.assert_called_once_with(b'/path/to/dest')
        mock_to_bytes.assert_any_call('/path/to/dest', errors='surrogate_or_strict')
        mock_to_native.assert_called_once_with(b'/real/path/to/dest', errors='surrogate_or_strict')
        module.run_command.assert_called_once_with(b'echo /tmp/tmpfile')
        mock_atomic_move.assert_not_called()

if __name__ == '__main__':
    unittest.main()