import unittest
from ansible.executor.powershell.module_manifest import *


class TestPSModuleDepFinder(unittest.TestCase):
    def test_scan_module(self):
        instance = PSModuleDepFinder()
        instance.scan_module(b'')
        self.assertEqual(instance.ps_modules, dict())
        self.assertEqual(instance.exec_scripts, dict())
        self.assertEqual(instance.cs_utils_wrapper, dict())
        self.assertEqual(instance.cs_utils_module, dict())
        self.assertEqual(instance.ps_version, None)
        self.assertEqual(instance.os_version, None)
        self.assertEqual(instance.become, False)

    def test_scan_exec_script(self):
        instance = PSModuleDepFinder()
        instance.scan_exec_script('')
        self.assertEqual(instance.exec_scripts, dict())

    def test_add_module(self):
        instance = PSModuleDepFinder()
        instance._add_module('', '', '', False, wrapper=False)
        self.assertEqual(instance.ps_modules, dict())
        self.assertEqual(instance.exec_scripts, dict())
        self.assertEqual(instance.cs_utils_wrapper, dict())
        self.assertEqual(instance.cs_utils_module, dict())
        self.assertEqual(instance.ps_version, None)
        self.assertEqual(instance.os_version, None)
        self.assertEqual(instance.become, False)

    def test_parse_version_match(self):
        instance = PSModuleDepFinder()
        instance._parse_version_match('', '')
        self.assertEqual(instance.ps_modules, dict())
        self.assertEqual(instance.exec_scripts, dict())
        self.assertEqual(instance.cs_utils_wrapper, dict())
        self.assertEqual(instance.cs_utils_module, dict())
        self.assertEqual(instance.ps_version, None)
        self.assertEqual(instance.os_version, None)
        self.assertEqual(instance.become, False)

if __name__ == '__main__':
    unittest.main()