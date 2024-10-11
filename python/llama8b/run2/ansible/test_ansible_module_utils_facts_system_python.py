from ansible.module_utils.facts.system.python import HAS_SSLCONTEXT
import sys
import unittest
from ansible.module_utils.facts.system.python import PythonFactCollector


class TestPythonFactCollector(unittest.TestCase):
    def test_collect(self):
        collector = PythonFactCollector()
        facts = collector.collect()
        self.assertIn('python', facts)
        self.assertIn('version', facts['python'])
        self.assertIn('version_info', facts['python'])
        self.assertIn('executable', facts['python'])
        self.assertIn('has_sslcontext', facts['python'])

    def test_collect_version(self):
        collector = PythonFactCollector()
        facts = collector.collect()
        self.assertEqual(facts['python']['version']['major'], sys.version_info[0])
        self.assertEqual(facts['python']['version']['minor'], sys.version_info[1])
        self.assertEqual(facts['python']['version']['micro'], sys.version_info[2])
        self.assertEqual(facts['python']['version']['releaselevel'], sys.version_info[3])
        self.assertEqual(facts['python']['version']['serial'], sys.version_info[4])

    def test_collect_version_info(self):
        collector = PythonFactCollector()
        facts = collector.collect()
        self.assertEqual(facts['python']['version_info'], list(sys.version_info))

    def test_collect_executable(self):
        collector = PythonFactCollector()
        facts = collector.collect()
        self.assertEqual(facts['python']['executable'], sys.executable)

    def test_collect_has_sslcontext(self):
        collector = PythonFactCollector()
        facts = collector.collect()
        self.assertEqual(facts['python']['has_sslcontext'], HAS_SSLCONTEXT)

    def test_collect_type(self):
        collector = PythonFactCollector()
        facts = collector.collect()
        self.assertIn('type', facts['python'])
        self.assertEqual(facts['python']['type'], sys.subversion[0] if hasattr(sys, 'subversion') else sys.implementation.name if hasattr(sys, 'implementation') else None)

if __name__ == '__main__':
    unittest.main()