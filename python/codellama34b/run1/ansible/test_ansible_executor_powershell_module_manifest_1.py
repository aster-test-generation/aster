import unittest
from ansible.executor.powershell.module_manifest import *



class TestPSModuleDepFinder(unittest.TestCase):
    def test_scan_module(self):
        instance = PSModuleDepFinder()
        module_data = b"test_data"
        fqn = "test_fqn"
        wrapper = False
        powershell = True
        result = instance.scan_module(module_data, fqn, wrapper, powershell)
        self.assertEqual(result, None)

    def test_scan_exec_script(self):
        instance = PSModuleDepFinder()
        name = "test_name"
        result = instance.scan_exec_script(name)
        self.assertEqual(result, None)

    def test_add_module(self):
        instance = PSModuleDepFinder()
        name = "test_name"
        ext = ".psm1"
        fqn = "test_fqn"
        optional = False
        wrapper = False
        result = instance._add_module(name, ext, fqn, optional, wrapper)
        self.assertEqual(result, None)

if __name__ == '__main__':
    unittest.main()