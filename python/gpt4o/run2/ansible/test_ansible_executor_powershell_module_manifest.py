import unittest
from ansible.executor.powershell.module_manifest import _slurp, _strip_comments, _create_powershell_wrapper
from ansible.errors import AnsibleError
import os
import base64
import json
import random


class TestModuleManifest(unittest.TestCase):

    def setUp(self):
        self.test_path = "test_file.txt"
        with open(self.test_path, "w") as f:
            f.write("test content")

    def tearDown(self):
        if os.path.exists(self.test_path):
            os.remove(self.test_path)

    def test_slurp_file_exists(self):
        result = _slurp(self.test_path)
        self.assertEqual(result, b"test content")

    def test_slurp_file_not_exists(self):
        with self.assertRaises(AnsibleError):
            _slurp("non_existent_file.txt")

    def test_strip_comments(self):
        source = b"""
        # This is a comment
        <#
        This is a block comment
        #>
        This is code
        """
        expected_result = b"This is code"
        result = _strip_comments(source)
        self.assertEqual(result, expected_result)

    def test_create_powershell_wrapper(self):
        b_module_data = b"test module data"
        module_path = "test_module_path"
        module_args = {}
        environment = {}
        async_timeout = 0
        become = False
        become_method = None
        become_user = None
        become_password = None
        become_flags = None
        substyle = "script"
        task_vars = {}
        module_fqn = "test_module_fqn"

        result = _create_powershell_wrapper(
            b_module_data, module_path, module_args, environment, async_timeout, become,
            become_method, become_user, become_password, become_flags, substyle, task_vars, module_fqn
        )
        self.assertIsInstance(result, bytes)

if __name__ == '__main__':
    unittest.main()