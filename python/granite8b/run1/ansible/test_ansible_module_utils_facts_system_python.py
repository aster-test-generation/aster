import unittest
from ansible.module_utils.facts.system.python import PythonFactCollector


class TestPythonFactCollector(unittest.TestCase):
    def test_collect(self):
        collector = PythonFactCollector()
        facts = collector.collect()
        self.assertIn('python', facts)
        self.assertIn('version', facts['python'])
        self.assertIn('major', facts['python']['version'])
        self.assertIn('minor', facts['python']['version'])
        self.assertIn('micro', facts['python']['version'])
        self.assertIn('releaselevel', facts['python']['version'])
        self.assertIn('serial', facts['python']['version'])
        self.assertIn('version_info', facts['python'])
        self.assertIn('executable', facts['python'])
        self.assertIn('has_sslcontext', facts['python'])
        self.assertIn('type', facts['python'])

    def test_collect_private_methods(self):
        collector = PythonFactCollector()
        facts = collector.collect()
        self.assertIn('python', facts)
        self.assertIn('version', facts['python'])
        self.assertIn('major', facts['python']['version'])
        self.assertIn('minor', facts['python']['version'])
        self.assertIn('micro', facts['python']['version'])
        self.assertIn('releaselevel', facts['python']['version'])
        self.assertIn('serial', facts['python']['version'])
        self.assertIn('version_info', facts['python'])
        self.assertIn('executable', facts['python'])
        self.assertIn('has_sslcontext', facts['python'])
        self.assertIn('type', facts['python'])

    def test_collect_protected_methods(self):
        collector = PythonFactCollector()
        facts = collector.collect()
        self.assertIn('python', facts)
        self.assertIn('version', facts['python'])
        self.assertIn('major', facts['python']['version'])
        self.assertIn('minor', facts['python']['version'])
        self.assertIn('micro', facts['python']['version'])
        self.assertIn('releaselevel', facts['python']['version'])
        self.assertIn('serial', facts['python']['version'])
        self.assertIn('version_info', facts['python'])
        self.assertIn('executable', facts['python'])
        self.assertIn('has_sslcontext', facts['python'])
        self.assertIn('type', facts['python'])

    def test_collect_magic_methods(self):
        collector = PythonFactCollector()
        facts = collector.collect()
        self.assertIn('python', facts)
        self.assertIn('version', facts['python'])
        self.assertIn('major', facts['python']['version'])
        self.assertIn('minor', facts['python']['version'])
        self.assertIn('micro', facts['python']['version'])
        self.assertIn('releaselevel', facts['python']['version'])
        self.assertIn('serial', facts['python']['version'])
        self.assertIn('version_info', facts['python'])
        self.assertIn('executable', facts['python'])
        self.assertIn('has_sslcontext', facts['python'])
        self.assertIn('type', facts['python'])

if __name__ == '__main__':
    unittest.main()