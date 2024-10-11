import unittest
from ansible.executor.powershell.module_manifest import *


class TestPSModuleDepFinder(unittest.TestCase):
    def test_scan_module(self):
        instance = PSModuleDepFinder()
        module_data = b'module_data'
        fqn = 'fqn'
        wrapper = True
        powershell = True
        instance.scan_module(module_data, fqn, wrapper, powershell)

    def test_scan_exec_script(self):
        instance = PSModuleDepFinder()
        name = 'name'
        instance.scan_exec_script(name)

    def test_add_module(self):
        instance = PSModuleDepFinder()
        name = 'name'
        ext = '.psm1'
        fqn = 'fqn'
        optional = True
        wrapper = True
        instance._add_module(name, ext, fqn, optional, wrapper)

    def test_parse_version_match(self):
        instance = PSModuleDepFinder()
        match = 'match'
        attribute = 'attribute'
        instance._parse_version_match(match, attribute)

if __name__ == '__main__':
    unittest.main()