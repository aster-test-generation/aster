import unittest
from ansible.executor.powershell.module_manifest import *
import base64
import json
import os
import random
import re
from ansible.module_utils._text import to_bytes, to_native, to_text


class TestModuleManifest(unittest.TestCase):
    def test_slurp(self):
        path = 'path/to/module'
        with open(path, 'wb') as fd:
            fd.write(b'data')
        result = _slurp(path)
        self.assertEqual(result, b'data')

    def test_strip_comments(self):
        source = b'data\n# comment\n'
        result = _strip_comments(source)
        self.assertEqual(result, b'data\n')

    def test_create_powershell_wrapper(self):
        b_module_data = b'data'
        module_path = 'path/to/module'
        module_args = {'arg1': 'value1', 'arg2': 'value2'}
        environment = {'env1': 'value1', 'env2': 'value2'}
        async_timeout = 10
        become = True
        become_method = 'runas'
        become_user = 'user'
        become_password = 'password'
        become_flags = 'flags'
        substyle = 'script'
        task_vars = {}
        module_fqn = 'module.fqn'
        result = _create_powershell_wrapper(b_module_data, module_path, module_args, environment, async_timeout, become, become_method, become_user, become_password, become_flags, substyle, task_vars, module_fqn)
        self.assertIsInstance(result, bytes)

    def test_PSModuleDepFinder(self):
        finder = PSModuleDepFinder()
        self.assertIsInstance(finder, PSModuleDepFinder)

    def test_PSModuleDepFinder_scan_module(self):
        finder = PSModuleDepFinder()
        b_module_data = b'data'
        module_fqn = 'module.fqn'
        finder.scan_module(b_module_data, fqn=module_fqn, powershell=True)
        self.assertTrue(finder.powershell_modules)

    def test_PSModuleDepFinder_scan_exec_script(self):
        finder = PSModuleDepFinder()
        script = 'script'
        finder.scan_exec_script(script)
        self.assertIn(script, finder.exec_scripts)

    def test_PSModuleDepFinder_add_module(self):
        finder = PSModuleDepFinder()
        module_name = 'module.name'
        path = 'path/to/module'
        wrapper = False
        finder._add_module(module_name, path, None, wrapper)
        self.assertIn(module_name, finder.module_util_paths)

    def test_PSModuleDepFinder_get_min_ps_version(self):
        finder = PSModuleDepFinder()
        self.assertEqual(finder.get_min_ps_version(), LooseVersion('3.0'))

    def test_PSModuleDepFinder_get_min_os_version(self):
        finder = PSModuleDepFinder()
        self.assertEqual(finder.get_min_os_version(), LooseVersion('6.1'))

    def test_PSModuleDepFinder_get_become(self):
        finder = PSModuleDepFinder()
        self.assertFalse(finder.get_become())

    def test_PSModuleDepFinder_get_powershell_modules(self):
        finder = PSModuleDepFinder()
        self.assertEqual(finder.get_powershell_modules(), {})

    def test_PSModuleDepFinder_get_exec_scripts(self):
        finder = PSModuleDepFinder()
        self.assertEqual(finder.get_exec_scripts(), {})

    def test_PSModuleDepFinder_get_cs_utils_wrapper(self):
        finder = PSModuleDepFinder()
        self.assertEqual(finder.get_cs_utils_wrapper(), [])

    def test_PSModuleDepFinder_get_cs_utils_module(self):
        finder = PSModuleDepFinder()
        self.assertEqual(finder.get_cs_utils_module(), [])

if __name__ == '__main__':
    unittest.main()