import re
import unittest
from ansible.executor.powershell.module_manifest import PSModuleDepFinder


class TestPSModuleDepFinder(unittest.TestCase):
    def setUp(self):
        self.finder = PSModuleDepFinder()

    def test_scan_module_powershell(self):
        module_data = b"""
        using Ansible.ModuleUtils.Common;
        using System.Collections.Generic;
        using System.Management.Automation;
        using System.Text.RegularExpressions;
        """
        self.finder.scan_module(module_data, powershell=True)
        self.assertIn('Ansible.ModuleUtils.Common', self.finder.ps_modules.keys())
        self.assertIn('System.Collections.Generic', self.finder.ps_modules)
        self.assertIn('System.Management.Automation', self.finder.ps_modules)
        self.assertIn('System.Text.RegularExpressions', self.finder.ps_modules)

    def test_scan_module_csharp(self):
        module_data = b"""
        using Ansible.ModuleUtils.Common;
        using System.Collections.Generic;
        using System.Management.Automation;
        using System.Text.RegularExpressions;
        """
        self.finder.scan_module(module_data, powershell=False)
        self.assertIn('Ansible.ModuleUtils.Common', self.finder.module_utils)
        self.assertIn('System.Collections.Generic', self.finder.cs_utils_module)
        self.assertIn('System.Management.Automation', self.finder.cs_utils_module)
        self.assertIn('System.Text.RegularExpressions', self.finder.cs_utils_module)

    def test_scan_exec_script(self):
        name = 'example_script'
        data = b"""
        $script = {
            Write-Host "Hello, world!"
        }
        """
        self.finder._get_local_path(name)
        self.assertIn(name, self.finder.exec_scripts)
        self.assertEqual(self.finder.exec_scripts[name], data)

    def test_add_module_powershell(self):
        name = 'Ansible.ModuleUtils.Common'
        ext = '.psm1'
        fqn = 'Ansible.ModuleUtils.Common'
        optional = False
        self.finder._add_module(name, ext, fqn, True)
        self.assertIn(name, self.finder.ps_modules)

    def test_add_module_csharp(self):
        name = 'Ansible.ModuleUtils.Common'
        ext = '.cs'
        fqn = 'Ansible.ModuleUtils.Common'
        optional = False
        self.finder._add_module(name, ext, fqn, optional, wrapper=False)
        self.assertIn(name, self.finder.cs_utils_wrapper)

    def test_parse_version_match(self):
        match = re.match(r'^\s*#requires -Version\s+(\d+\.\d+)', '#requires -Version 3.0')
        self.finder._parse_version_match(match, 'ps_version')
        self.assertEqual(self.finder.ps_version, '3.0')

if __name__ == '__main__':
    unittest.main()