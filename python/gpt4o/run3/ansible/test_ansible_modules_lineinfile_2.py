import unittest
from unittest.mock import MagicMock, patch
from ansible.modules.lineinfile import absent


class TestLineInFileModule(unittest.TestCase):

    def setUp(self):
        self.module = MagicMock()
        self.module._diff = False
        self.module.check_mode = False
        self.module.exit_json = MagicMock()
        self.module.fail_json = MagicMock()
        self.module.backup_local = MagicMock(return_value='backup_path')

    @patch('ansible.modules.lineinfile.to_bytes', side_effect=lambda x, errors: x.encode())
    @patch('ansible.modules.lineinfile.to_native', side_effect=lambda x: x.decode())
    def test_absent_file_not_present(self, mock_to_bytes, mock_to_native):
        self.module._diff = False
        absent(self.module, 'nonexistent_file', None, None, None, False)
        self.module.exit_json.assert_called_once_with(changed=False, msg='file not present')

    @patch('ansible.modules.lineinfile.to_bytes', side_effect=lambda x, errors: x.encode())
    @patch('ansible.modules.lineinfile.to_native', side_effect=lambda x: x.decode())
    @patch('os.path.exists', return_value=True)
    @patch('builtins.open', new_callable=unittest.mock.mock_open, read_data=b"line1\nline2\nline3\n")
    def test_absent_with_regexp(self, mock_open, mock_exists, mock_to_bytes, mock_to_native):
        self.module._diff = True
        absent(self.module, 'testfile', 'line2', None, None, False)
        self.module.exit_json.assert_called_once()
        args, kwargs = self.module.exit_json.call_args
        self.assertTrue(kwargs['changed'])
        self.assertEqual(kwargs['found'], 1)
        self.assertIn('line(s) removed', kwargs['msg'])

    @patch('ansible.modules.lineinfile.to_bytes', side_effect=lambda x, errors: x.encode())
    @patch('ansible.modules.lineinfile.to_native', side_effect=lambda x: x.decode())
    @patch('os.path.exists', return_value=True)
    @patch('builtins.open', new_callable=unittest.mock.mock_open, read_data=b"line1\nline2\nline3\n")
    def test_absent_with_search_string(self, mock_open, mock_exists, mock_to_bytes, mock_to_native):
        self.module._diff = True
        absent(self.module, 'testfile', None, 'line2', None, False)
        self.module.exit_json.assert_called_once()
        args, kwargs = self.module.exit_json.call_args
        self.assertTrue(kwargs['changed'])
        self.assertEqual(kwargs['found'], 1)
        self.assertIn('line(s) removed', kwargs['msg'])

    @patch('ansible.modules.lineinfile.to_bytes', side_effect=lambda x, errors: x.encode())
    @patch('ansible.modules.lineinfile.to_native', side_effect=lambda x: x.decode())
    @patch('os.path.exists', return_value=True)
    @patch('builtins.open', new_callable=unittest.mock.mock_open, read_data=b"line1\nline2\nline3\n")
    def test_absent_with_line(self, mock_open, mock_exists, mock_to_bytes, mock_to_native):
        self.module._diff = True
        absent(self.module, 'testfile', None, None, 'line2', False)
        self.module.exit_json.assert_called_once()
        args, kwargs = self.module.exit_json.call_args
        self.assertTrue(kwargs['changed'])
        self.assertEqual(kwargs['found'], 1)
        self.assertIn('line(s) removed', kwargs['msg'])

    @patch('ansible.modules.lineinfile.to_bytes', side_effect=lambda x, errors: x.encode())
    @patch('ansible.modules.lineinfile.to_native', side_effect=lambda x: x.decode())
    @patch('os.path.exists', return_value=True)
    @patch('builtins.open', new_callable=unittest.mock.mock_open, read_data=b"line1\nline2\nline3\n")
    def test_absent_with_backup(self, mock_open, mock_exists, mock_to_bytes, mock_to_native):
        self.module._diff = True
        absent(self.module, 'testfile', 'line2', None, None, True)
        self.module.exit_json.assert_called_once()
        args, kwargs = self.module.exit_json.call_args
        self.assertTrue(kwargs['changed'])
        self.assertEqual(kwargs['found'], 1)
        self.assertIn('line(s) removed', kwargs['msg'])
        self.assertEqual(kwargs['backup'], 'backup_path')

if __name__ == '__main__':
    unittest.main()