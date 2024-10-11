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
        result = _strip_comments(source)
        self.assertEqual(result, b"        This is code")

    def test_create_powershell_wrapper(self):
        b_module_data = b"module data"
        module_path = "module_path"
        module_args = {"arg1": "value1"}
        environment = {"env1": "value1"}
        async_timeout = 10
        become = True
        become_method = "runas"
        become_user = "user"
        become_password = "password"
        become_flags = ["flag1"]
        substyle = "powershell"
        task_vars = {"var1": "value1"}
        module_fqn = "module_fqn"

        result = PSModuleDepFinder._create_powershell_wrapper(
            b_module_data, module_path, module_args, environment, async_timeout, become,
            become_method, become_user, become_password, become_flags, substyle, task_vars, module_fqn
        )

        self.assertIsInstance(result, bytes)

if __name__ == '__main__':
    unittest.main()