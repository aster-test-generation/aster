import unittest
import os
import tempfile
from unittest.mock import MagicMock, patch
from ansible.modules.lineinfile import write_changes
from ansible.module_utils.basic import AnsibleModule
from ansible.module_utils._text import to_bytes, to_native


class TestWriteChanges(unittest.TestCase):
    def setUp(self):
        self.module = MagicMock(spec=AnsibleModule)
        self.module.tmpdir = tempfile.gettempdir()
        self.module.params = {
            'validate': None,
            'unsafe_writes': False
        }
        self.b_lines = [b"line1\n", b"line2\n"]
        self.dest = os.path.join(tempfile.gettempdir(), "testfile.txt")

    @patch('ansible.modules.lineinfile.tempfile.mkstemp')
    @patch('ansible.modules.lineinfile.os.fdopen')
    @patch('ansible.modules.lineinfile.to_bytes')
    @patch('ansible.modules.lineinfile.to_native')
    @patch('ansible.modules.lineinfile.os.path.realpath')
    @patch('ansible.modules.lineinfile.os.path.realpath')
    def test_write_changes_no_validate(self, mock_realpath, mock_to_native, mock_to_bytes, mock_fdopen, mock_mkstemp):
        mock_mkstemp.return_value = (1, self.dest)
        mock_fdopen.return_value.__enter__.return_value = MagicMock()
        mock_to_bytes.side_effect = lambda x, errors='surrogate_or_strict': x.encode()
        mock_to_native.side_effect = lambda x, errors='surrogate_or_strict': x.decode()
        mock_realpath.side_effect = lambda x, errors='surrogate_or_strict': x

        write_changes(self.module, self.b_lines, self.dest)

        mock_fdopen.assert_called_once_with(1, 'wb')
        mock_fdopen.return_value.__enter__.return_value.writelines.assert_called_once_with(self.b_lines)
        self.module.atomic_move.assert_called_once_with(self.dest, self.dest, unsafe_writes=False)

    @patch('ansible.modules.lineinfile.tempfile.mkstemp')
    @patch('ansible.modules.lineinfile.os.fdopen')
    @patch('ansible.modules.lineinfile.to_bytes')
    @patch('ansible.modules.lineinfile.to_native')
    @patch('ansible.modules.lineinfile.os.path.realpath')
    @patch('ansible.modules.lineinfile.os.path.realpath')
    def test_write_changes_with_validate_success(self, mock_realpath, mock_to_native, mock_to_bytes, mock_fdopen, mock_mkstemp):
        self.module.params['validate'] = 'echo %s'
        mock_mkstemp.return_value = (1, self.dest)
        mock_fdopen.return_value.__enter__.return_value = MagicMock()
        mock_to_bytes.side_effect = lambda x, errors='surrogate_or_strict': x.encode()
        mock_to_native.side_effect = lambda x, errors='surrogate_or_strict': x.decode()
        mock_realpath.side_effect = lambda x, errors='surrogate_or_strict': x

        self.module.run_command.return_value = (0, '', '')

        write_changes(self.module, self.b_lines, self.dest)

        mock_fdopen.assert_called_once_with(1, 'wb')
        mock_fdopen.return_value.__enter__.return_value.writelines.assert_called_once_with(self.b_lines)
        self.module.run_command.assert_called_once_with(b'echo ' + self.dest.encode())
        self.module.atomic_move.assert_called_once_with(self.dest, self.dest, unsafe_writes=False)

    @patch('ansible.modules.lineinfile.tempfile.mkstemp')
    @patch('ansible.modules.lineinfile.os.fdopen')
    @patch('ansible.modules.lineinfile.to_bytes')
    @patch('ansible.modules.lineinfile.to_native')
    @patch('ansible.modules.lineinfile.os.path.realpath')
    @patch('ansible.modules.lineinfile.os.path.realpath')
    def test_write_changes_with_validate_failure(self, mock_realpath, mock_to_native, mock_to_bytes, mock_fdopen, mock_mkstemp):
        self.module.params['validate'] = 'echo %s'
        mock_mkstemp.return_value = (1, self.dest)
        mock_fdopen.return_value.__enter__.return_value = MagicMock()
        mock_to_bytes.side_effect = lambda x, errors='surrogate_or_strict': x.encode()
        mock_to_native.side_effect = lambda x, errors='surrogate_or_strict': x.decode()
        mock_realpath.side_effect = lambda x, errors='surrogate_or_strict': x

        self.module.run_command.return_value = (1, '', 'error')

        with self.assertRaises(Exception):
            write_changes(self.module, self.b_lines, self.dest)

        mock_fdopen.assert_called_once_with(1, 'wb')
        mock_fdopen.return_value.__enter__.return_value.writelines.assert_called_once_with(self.b_lines)
        self.module.run_command.assert_called_once_with(b'echo ' + self.dest.encode())
        self.module.fail_json.assert_called_once_with(msg='failed to validate: rc:1 error:error')

if __name__ == '__main__':
    unittest.main()