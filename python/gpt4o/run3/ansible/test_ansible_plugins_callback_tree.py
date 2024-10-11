import unittest
from unittest.mock import patch, MagicMock
from ansible.plugins.callback.tree import CallbackModule
from ansible.constants import TREE_DIR
from ansible.utils.path import unfrackpath


class TestCallbackModule(unittest.TestCase):
    def setUp(self):
        self.callback = CallbackModule()
        self.callback._display = MagicMock()

    @patch('ansible.plugins.callback.tree.unfrackpath')
    def test_set_options_with_tree_dir(self, mock_unfrackpath):
        mock_unfrackpath.return_value = '/mocked/path'
        self.callback.set_options(load_name='default')
        self.assertEqual(self.callback.tree, '/mocked/path')

    @patch('ansible.plugins.callback.tree.unfrackpath')
    def test_set_options_without_tree_dir(self, mock_unfrackpath):
        mock_unfrackpath.return_value = None
        self.callback.get_option = MagicMock(return_value='/default/path')
        with self.assertRaises(OSError):
        self.assertEqual(self.callback.tree, '/default/path')

    @patch('ansible.plugins.callback.tree.makedirs_safe')
    @patch('ansible.plugins.callback.tree.to_bytes')
    @patch('ansible.plugins.callback.tree.to_text')
    def test_write_tree_file_success(self, mock_to_text, mock_to_bytes, mock_makedirs_safe):
        mock_to_bytes.side_effect = lambda x: x.encode()
        mock_to_text.side_effect = lambda x: x.decode()
        self.callback.tree = '/mocked/tree'
        with patch('builtins.open', unittest.mock.mock_open()) as mock_file:
            self.callback.write_tree_file('hostname', 'buffer')
            mock_file.assert_called_once_with(b'/mocked/tree/hostname', 'wb+')
            mock_file().write.assert_called_once_with(b'buffer')

    @patch('ansible.plugins.callback.tree.makedirs_safe')
    @patch('ansible.plugins.callback.tree.to_bytes')
    @patch('ansible.plugins.callback.tree.to_text')
    def test_write_tree_file_makedirs_exception(self, mock_to_text, mock_to_bytes, mock_makedirs_safe):
        mock_to_bytes.side_effect = lambda x: x.encode()
        mock_to_text.side_effect = OSError("mocked error")
        mock_makedirs_safe.side_effect = OSError('mocked error')
        self.callback.tree = '/mocked/tree'
        self.callback.write_tree_file('hostname', 'buffer')
        self.callback._display.warning.assert_called_once_with(
            u"Unable to access or create the configured directory (/mocked/tree): mocked error"
        )

    @patch('ansible.plugins.callback.tree.makedirs_safe')
    @patch('ansible.plugins.callback.tree.to_bytes')
    @patch('ansible.plugins.callback.tree.to_text')
    def test_write_tree_file_open_exception(self, mock_to_text, mock_to_bytes, mock_makedirs_safe):
        mock_to_bytes.side_effect = lambda x: x.encode()
        mock_to_text.side_effect = lambda x: x.decode('utf-8')
        self.callback.tree = '/mocked/tree'
        with patch('builtins.open', side_effect=OSError('mocked error')):
            self.callback.write_tree_file('hostname', 'buffer')
            self.callback._display.warning.assert_called_once_with(
                u"Unable to write to hostname's file: mocked error"
            )

    @patch.object(CallbackModule, 'write_tree_file')
    @patch.object(CallbackModule, '_dump_results')
    def test_result_to_tree(self, mock_dump_results, mock_write_tree_file):
        mock_result = MagicMock()
        mock_result._host.get_name.return_value = 'hostname'
        mock_result._result = 'result'
        mock_dump_results.return_value = 'dumped_result'
        self.callback.result_to_tree(mock_result)
        mock_write_tree_file.assert_called_once_with('hostname', 'dumped_result')

    @patch.object(CallbackModule, 'result_to_tree')
    def test_v2_runner_on_ok(self, mock_result_to_tree):
        mock_result = MagicMock()
        self.callback.v2_runner_on_ok(mock_result)
        mock_result_to_tree.assert_called_once_with(mock_result)

    @patch.object(CallbackModule, 'result_to_tree')
    def test_v2_runner_on_failed(self, mock_result_to_tree):
        mock_result = MagicMock()
        self.callback.v2_runner_on_failed(mock_result)
        mock_result_to_tree.assert_called_once_with(mock_result)

    @patch.object(CallbackModule, 'result_to_tree')
    def test_v2_runner_on_unreachable(self, mock_result_to_tree):
        mock_result = MagicMock()
        self.callback.v2_runner_on_unreachable(mock_result)
        mock_result_to_tree.assert_called_once_with(mock_result)

if __name__ == '__main__':
    unittest.main()