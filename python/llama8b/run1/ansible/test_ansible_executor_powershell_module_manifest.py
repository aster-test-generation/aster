import unittest
from ansible.executor.powershell.module_manifest import *
import base64
import json
import os
import random
import re
from ansible.module_utils._text import to_bytes, to_native, to_text
from ansible.module_utils.compat.version import LooseVersion
from ansible import constants as C
from ansible.errors import AnsibleError
from ansible.module_utils.compat.importlib import import_module
from ansible.plugins.loader import ps_module_utils_loader
from ansible.utils.collection_loader import resource_from_fqcr
from ansible.executor.powershell.module_manifest import _slurp, _strip_comments, _create_powershell_wrapper


class TestPowershellModuleManifest(unittest.TestCase):

    def test_slurp(self):
        path = 'path/to/module'
        with open(path, 'rb') as fd:
            data = fd.read()
        result = _slurp(path)
        self.assertEqual(result, data)

    def test_strip_comments(self):
        source = b'line 1\n# comment\nline 2\n'
        result = _strip_comments(source)
        self.assertEqual(result, b'line 1\nline 2\n')

    def test_create_powershell_wrapper(self):
        b_module_data = b'module data'
        module_path = 'module path'
        module_args = {'arg1': 'value1', 'arg2': 'value2'}
        environment = {'env1': 'value1', 'env2': 'value2'}
        async_timeout = 10
        become = True
        become_method = 'runas'
        become_user = 'user'
        become_password = 'password'
        become_flags = 'flags'
        substyle = 'powershell'
        task_vars = {'var1': 'value1', 'var2': 'value2'}
        module_fqn = 'module.fqn'
        result = _create_powershell_wrapper(b_module_data, module_path, module_args, environment, async_timeout, become, become_method, become_user, become_password, become_flags, substyle, task_vars, module_fqn)
        self.assertIsInstance(result, bytes)

if __name__ == '__main__':
    unittest.main()