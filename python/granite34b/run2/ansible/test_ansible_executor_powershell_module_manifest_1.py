import re
import unittest
from ansible.executor.powershell.module_manifest import PSModuleDepFinder


class TestPSModuleDepFinder(unittest.TestCase):
    def test_scan_module(self):
        module_data = b"""
        using Ansible.ModuleUtils.Common;
        using Ansible.ModuleUtils.Common.RMConnectionInfo;
        using System.Collections.Generic;
        using System.Management.Automation;
        using System.Text.RegularExpressions;
        """
        finder = PSModuleDepFinder()
        finder.scan_module(module_data)
        self.assertIn('Ansible.ModuleUtils.Common', finder.ps_modules.keys())
        self.assertIn('Ansible.ModuleUtils.Common.RMConnectionInfo', finder.ps_modules)
        self.assertIn('System.Collections.Generic', finder.ps_modules)
        self.assertIn('System.Management.Automation', finder.ps_modules)
        self.assertIn('System.Text.RegularExpressions', finder.ps_modules)

    def test_scan_exec_script(self):
        name = 'example_script'
        finder = PSModuleDepFinder()
        finder.scan_exec_script(name)
        self.assertIn(name, finder.exec_scripts)

    def test_add_module(self):
        name = 'Ansible.ModuleUtils.Common'
        ext = '.cs'
        fqn = 'Ansible.ModuleUtils.Common'
        optional = False
        finder = PSModuleDepFinder()
        finder._add_module(name, ext, fqn, optional=True)
        self.assertIn(name, finder.cs_utils_module)

    def test_parse_version_match(self):
        match = re.match(r'^\s*#requires -version ([0-9]+(\.[0-9]+)?)\s*$', '#requires -version 3.0')
        finder = PSModuleDepFinder()
        finder._parse_version_match(match, 'ps_version')
        self.assertEqual(finder.ps_version, '3.0')

if __name__ == '__main__':
    unittest.main()