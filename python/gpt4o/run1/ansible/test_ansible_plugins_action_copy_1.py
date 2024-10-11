import unittest
from unittest.mock import patch, MagicMock
from ansible.plugins.action.copy import ActionModule
from ansible.errors import AnsibleError


class TestActionModule(unittest.TestCase):
    def setUp(self):
        self.instance = ActionModule()
        self.instance._task = MagicMock()
        self.instance._task.args = {}
        self.instance._connection = MagicMock()
        self.instance._connection._shell = MagicMock()
        self.instance._connection._shell.path_has_trailing_slash = MagicMock(return_value=False)
        self.instance._connection._shell.join_path = MagicMock(return_value='/joined/path')
        self.instance._remote_expand_user = MagicMock(return_value='/remote/user/path')
        self.instance._copy_file = MagicMock(return_value={'changed': False})
        self.instance._execute_module = MagicMock(return_value={'changed': False})
        self.instance._ensure_invocation = MagicMock(return_value={})
        self.instance._remove_tmp_path = MagicMock()

    def test_init(self):
        self.assertIsInstance(self.instance, ActionModule)

    def test_run_no_src_or_content(self):
        self.instance._task.args = {'dest': '/some/dest'}
        result = self.instance._supports_async()
        self.assertTrue(result['failed'])
        self.assertEqual(result['msg'], 'src (or content) is required')

    def test_run_no_dest(self):
        self.instance._task.args = {'src': '/some/src'}
        self.instance._supports_async = False
        self.assertTrue(result['failed'])
        self.assertEqual(result['msg'], 'dest is required')

    def test_run_src_and_content(self):
        self.instance._task.args = {'src': '/some/src', 'content': 'some content', 'dest': '/some/dest'}
        result = self.instance._supports_async()
        self.assertTrue(result['failed'])
        self.assertEqual(result['msg'], 'src and content are mutually exclusive')

    def test_run_content_with_dir_as_dest(self):
        self.instance._task.args = {'content': 'some content', 'dest': '/some/dest/'}
        self.instance._supports_async = False
        self.assertTrue(result['failed'])
        self.assertEqual(result['msg'], 'can not use content with a dir as dest')

    @patch('ansible.plugins.action.copy.boolean', return_value=True)
    def test_run_remote_src(self, mock_boolean):
        self.instance._task.args = {'src': '/some/src', 'dest': '/some/dest', 'remote_src': True}
        result = self.instance._supports_async()
        self.instance._execute_module.assert_called_with(module_name='ansible.legacy.copy', task_vars={})
        self.assertEqual(result, self.instance._ensure_invocation({}))

    @patch('ansible.plugins.action.copy.boolean', return_value=False)
    @patch('ansible.plugins.action.copy.os.path.isdir', return_value=True)
    @patch('ansible.plugins.action.copy.to_bytes', return_value=b'/some/src')
    def test_run_local_src_directory(self, mock_to_bytes, mock_isdir, mock_boolean):
        self.instance._task.args = {'src': '/some/src', 'dest': '/some/dest'}
        self.instance._find_needle = MagicMock(return_value='/some/src')
        self.instance._connection._shell.path_has_trailing_slash = MagicMock(return_value=False)
        self.instance._walk_dirs = MagicMock(return_value={'files': [], 'directories': [], 'symlinks': []})
        self.instance._supports_async = False
        self.assertFalse(result['failed'])

    @patch('ansible.plugins.action.copy.boolean', return_value=False)
    @patch('ansible.plugins.action.copy.os.path.isdir', return_value=False)
    @patch('ansible.plugins.action.copy.to_bytes', return_value=b'/some/src')
    def test_run_local_src_file(self, mock_to_bytes, mock_isdir, mock_boolean):
        self.instance._task.args = {'src': '/some/src', 'dest': '/some/dest'}
        self.instance._find_needle = MagicMock(return_value='/some/src')
        result = self.instance._supports_async()
        self.assertFalse(result['failed'])

    def test_private_methods(self):
        with self.assertRaises(AttributeError):
            self.instance.__private_method()

    def test_protected_methods(self):
        with self.assertRaises(AttributeError):
            self.instance._protected_method()

if __name__ == '__main__':
    unittest.main()