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
        mock_unfrackpath.return_value = '/mock/tree/dir'
        self.callback.set_options(load_name='default')
        self.assertEqual(self.callback.tree, '/mock/tree/dir')

    @patch('ansible.plugins.callback.tree.unfrackpath')
    def test_set_options_without_tree_dir(self, mock_unfrackpath):
        with patch('ansible.plugins.callback.tree.TREE_DIR', None):
            self.callback.get_option = MagicMock(return_value='/mock/option/dir')
            self.callback.set_options(load_name='default')
            self.assertEqual(self.callback.tree, '/mock/option/dir')

    @patch('ansible.plugins.callback.tree.makedirs_safe')
    @patch('ansible.plugins.callback.tree.to_bytes')
    @patch('builtins.open', new_callable=unittest.mock.mock_open)
    def test_write_tree_file_success(self, mock_open, mock_to_bytes, mock_makedirs_safe):
        mock_to_bytes.return_value = b'mock data'
        self.callback.tree = '/mock/tree/dir'
        self.callback.write_tree_file('hostname', 'mock data')
        mock_makedirs_safe.assert_called_once_with('/mock/tree/dir')
        mock_open.assert_called_once_with(b'mock data', 'wb+')
        mock_open().write.assert_called_once_with(b'mock data')

    @patch('ansible.plugins.callback.tree.makedirs_safe', side_effect=OSError('mock error'))
    @patch('ansible.plugins.callback.tree.to_bytes')
    def test_write_tree_file_makedirs_safe_error(self, mock_to_bytes, mock_makedirs_safe):
        mock_to_bytes.return_value = b'mock data'
        self.callback.tree = '/mock/tree/dir'
        self.callback.write_tree_file('hostname', 'mock data')
        self.callback._display.warning.assert_called_once_with(
            u"Unable to access or create the configured directory (/mock/tree/dir): mock error"
        )

    @patch('ansible.plugins.callback.tree.makedirs_safe')
    @patch('ansible.plugins.callback.tree.to_bytes')
    @patch('builtins.open', side_effect=OSError('mock error'))
    def test_write_tree_file_open_error(self, mock_open, mock_to_bytes, mock_makedirs_safe):
        mock_to_bytes.return_value = b'mock data'
        self.callback.tree = '/mock/tree/dir'
        self.callback.write_tree_file('hostname', 'mock data')
        self.callback._display.warning.assert_called_once_with(
            u"Unable to write to hostname's file: mock error"
        )

    @patch.object(CallbackModule, 'write_tree_file')
    @patch.object(CallbackModule, '_dump_results', return_value='mock result')
    def test_result_to_tree(self, mock_dump_results, mock_write_tree_file):
        mock_result = MagicMock()
        mock_result._host.get_name.return_value = 'mock_host'
        self.callback.result_to_tree(mock_result)
        mock_write_tree_file.assert_called_once_with('mock_host', 'mock result')

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