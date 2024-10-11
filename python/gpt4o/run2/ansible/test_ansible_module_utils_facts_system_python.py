import unittest
from ansible.module_utils.facts.system.python import PythonFactCollector, HAS_SSLCONTEXT
import sys


class TestPythonFactCollector(unittest.TestCase):
    def setUp(self):
        self.collector = PythonFactCollector()

    def test_collect(self):
        result = self.collector.collect()
        self.assertIn('python', result)
        self.assertIn('version', result['python'])
        self.assertEqual(result['python']['version']['major'], sys.version_info[0])
        self.assertEqual(result['python']['version']['minor'], sys.version_info[1])
        self.assertEqual(result['python']['version']['micro'], sys.version_info[2])
        self.assertEqual(result['python']['version']['releaselevel'], sys.version_info[3])
        self.assertEqual(result['python']['version']['serial'], sys.version_info[4])
        self.assertEqual(result['python']['version_info'], list(sys.version_info))
        self.assertEqual(result['python']['executable'], sys.executable)
        self.assertEqual(result['python']['has_sslcontext'], HAS_SSLCONTEXT)

    def test_collect_python_type_subversion(self):
        original_subversion = sys.subversion if hasattr(sys, 'subversion') else None
        sys.subversion = ('CPython', '', '')
        result = self.collector.collect()
        self.assertEqual(result['python']['type'], 'CPython')
        if original_subversion is None:
            del sys.subversion
        else:
            sys.subversion = original_subversion

    def test_collect_python_type_implementation(self):
        if hasattr(sys, 'subversion'):
            del sys.subversion
        original_implementation = sys.implementation if hasattr(sys, 'implementation') else None
        sys.implementation = type('MockImplementation', (object,), {'name': 'cpython'})()
        result = self.collector.collect()
        self.assertEqual(result['python']['type'], 'cpython')
        if original_implementation is None:
            del sys.implementation
        else:
            sys.implementation = original_implementation

    def test_collect_python_type_none(self):
        if hasattr(sys, 'subversion'):
            del sys.subversion
        if hasattr(sys, 'implementation'):
            del sys.implementation
        result = self.collector.collect()
        self.assertIsNone(result['python']['type'])

if __name__ == '__main__':
    unittest.main()