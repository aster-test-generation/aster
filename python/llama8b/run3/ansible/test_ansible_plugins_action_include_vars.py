import unittest
from ansible.module_utils.basic import *
from ansible.module_utils.six import string_types
from ansible.module_utils._text import to_native
from ansible.module_utils.six import PY2
from ansible.module_utils._text import to_text
from ansible.errors import AnsibleError
from ansible.plugins.action.include_vars import ActionModule
from unittest.mock import patch
import os
import re
import ansible.constants as C


class TestActionModule(unittest.TestCase):
    def setUp(self):
        self.module = ActionModule()

    def test_set_dir_defaults(self):
        self.module.depth = 0
        self.module.files_matching = 'files_matching'
        self.module.ignore_files = ['ignore_files']
        self.module._set_dir_defaults()
        self.assertEqual(self.module.matcher, re.compile(r'{0}'.format(self.module.files_matching)))
        self.assertEqual(self.module.ignore_files, ['ignore_files'])

    def test_set_args(self):
        self.module._task.args = {'dir': 'dir', 'depth': 1, 'files_matching': 'files_matching', 'ignore_files': ['ignore_files']}
        self.module._set_args()
        self.assertEqual(self.module.source_dir, 'dir')
        self.assertEqual(self.module.depth, 1)
        self.assertEqual(self.module.files_matching, 'files_matching')
        self.assertEqual(self.module.ignore_files, ['ignore_files'])

    def test_run(self):
        self.module._task.args = {'dir': 'dir', 'depth': 1, 'files_matching': 'files_matching', 'ignore_files': ['ignore_files']}
        self.module._set_args()
        with patch('ansible.module_utils._text.to_native') as mock_to_native:
            with patch('ansible.module_utils._text.to_text') as mock_to_text:
                with patch('ansible.module_utils.six.string_types') as mock_string_types:
                    with patch('ansible.module_utils.six.PY2') as mock_PY2:
                        with patch('ansible.module_utils._text.to_text') as mock_to_text:
                            self.module.run()
                            self.assertEqual(self.module.included_files, [])
                            self.assertEqual(self.module.ansible_included_var_files, [])
                            self.assertEqual(self.module.ansible_facts, {})

    def test_set_root_dir(self):
        self.module._task._role = 'role'
        self.module.source_dir = 'source_dir'
        self.module._set_root_dir()
        self.assertEqual(self.module.source_dir, 'role/source_dir')

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
        self.module._is_valid_file_ext('filename')
        self.assertFalse(self.module._is_valid_file_ext('filename'))

    def test_load_files(self):
        self.module._loader = 'loader'
        self.module._loader._get_file_contents = lambda x: ('b_data', True)
        self.module._load_files('filename')
        self.assertEqual(self.module.show_content, True)

    def test_load_files_in_dir(self):
        self.module.source_dir = 'source_dir'
        self.module._load_files_in_dir('root_dir', ['filename'])
        self.assertEqual(self.module.included_files, ['filename'])

    def test_private_method(self):
        self.module._private_method()
        self.assertEqual(self.module._private_method(), None)

    def test_protected_method(self):
        self.module._protected_method()
        self.assertEqual(self.module._protected_method(), None)

    def test_str_method(self):
        self.module.__str__()
        self.assertEqual(self.module.__str__(), 'ActionModule')

    def test_repr_method(self):
        self.module.__repr__()
        self.assertEqual(self.module.__repr__(), 'ActionModule()')

    def test_eq_method(self):
        self.module.__eq__(self.module)
        self.assertEqual(self.module.__eq__(self.module), True)

if __name__ == '__main__':
    unittest.main()