import unittest
from ansible.module_utils.basic import *
from ansible.module_utils._text import to_native
from ansible.module_utils.six import string_types
from ansible.module_utils.vars import combine_vars
from ansible.constants import C
from ansible.errors import AnsibleError
from ansible.plugins.action.include_vars import ActionModule
from unittest.mock import patch, Mock
import os
import re
import ansible.utils.vars as vars


class TestActionModule(unittest.TestCase):
    def setUp(self):
        self.module = ActionModule()

    def test_set_dir_defaults(self):
        self.module.depth = None
        self.module.files_matching = None
        self.module.ignore_files = None
        self.module._set_dir_defaults()
        self.assertEqual(self.module.depth, 0)
        self.assertEqual(self.module.files_matching, None)
        self.assertEqual(self.module.ignore_files, [])

    def test_set_args(self):
        self.module._task.args = {'dir': 'dir', 'file': 'file', 'depth': 1, 'files_matching': 'files_matching', 'ignore_files': ['ignore_files']}
        self.module._set_args()
        self.assertEqual(self.module.source_dir, 'dir')
        self.assertEqual(self.module.source_file, 'file')
        self.assertEqual(self.module.depth, 1)
        self.assertEqual(self.module.files_matching, 'files_matching')
        self.assertEqual(self.module.ignore_files, ['ignore_files'])

    def test_run(self):
        self.module._task.args = {'dir': 'dir', 'file': 'file', 'depth': 1, 'files_matching': 'files_matching', 'ignore_files': ['ignore_files']}
        self.module._set_args()
        self.module.run()
        self.assertEqual(self.module.included_files, [])
        self.assertEqual(self.module.ansible_facts, {})

    def test_set_root_dir(self):
        self.module._task._role = Mock()
        self.module._task._role._role_path = 'role_path'
        self.module.source_dir = 'source_dir'
        self.module._set_root_dir()
        self.assertEqual(self.module.source_dir, 'role_path/source_dir')

    def test_traverse_dir_depth(self):
        self.module.source_dir = 'source_dir'
        self.module.depth = 1
        self.module._traverse_dir_depth()
        self.assertEqual(self.module.current_depth, 1)

    def test_ignore_file(self):
        self.module.ignore_files = ['ignore_files']
        self.module._ignore_file('filename')
        self.assertTrue(self.module._ignore_file('filename'))

    def test_is_valid_file_ext(self):
        self.module.valid_extensions = ['yaml', 'yml', 'json']
        self.module._is_valid_file_ext('filename.yaml')
        self.assertTrue(self.module._is_valid_file_ext('filename.yaml'))

    def test_load_files(self):
        self.module._loader = Mock()
        self.module._loader._get_file_contents = Mock(return_value=('b_data', True))
        self.module._load_files('filename')
        self.module._loader._get_file_contents.assert_called_once_with('filename')

    def test_load_files_in_dir(self):
        self.module.source_dir = 'source_dir'
        self.module.files_matching = 'files_matching'
        self.module.ignore_unknown_extensions = True
        self.module._load_files_in_dir('root_dir', ['filename'])
        self.assertEqual(self.module.included_files, ['filename'])

    def test_eq(self):
        self.module1 = ActionModule()
        self.module2 = ActionModule()
        self.assertEqual(self.module1, self.module2)

    def test_str(self):
        self.assertEqual(str(self.module), 'ActionModule')

    def test_repr(self):
        self.assertEqual(repr(self.module), 'ActionModule()')

if __name__ == '__main__':
    unittest.main()