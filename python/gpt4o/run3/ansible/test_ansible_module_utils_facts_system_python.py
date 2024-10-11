import unittest
import sys
from ansible.module_utils.facts.system.python import PythonFactCollector, HAS_SSLCONTEXT


class TestPythonFactCollector(unittest.TestCase):
    def setUp(self):
        self.collector = PythonFactCollector()

    def test_collect(self):
        result = self.collector.collect()
        expected_version_info = {
            'major': sys.version_info[0],
            'minor': sys.version_info[1],
            'micro': sys.version_info[2],
            'releaselevel': sys.version_info[3],
            'serial': sys.version_info[4]
        }
        self.assertEqual(result['python']['version'], expected_version_info)

    def test_collect_version_info(self):
        result = self.collector.collect()
        self.assertEqual(result['python']['version_info'], list(sys.version_info))

    def test_collect_executable(self):
        result = self.collector.collect()
        self.assertEqual(result['python']['executable'], sys.executable)

    def test_collect_has_sslcontext(self):
        result = self.collector.collect()
        self.assertEqual(result['python']['has_sslcontext'], HAS_SSLCONTEXT)

    def test_collect_type(self):
        result = self.collector.collect()
        if hasattr(sys, 'subversion'):
            expected_type = sys.subversion[0]
        elif hasattr(sys, 'implementation'):
            expected_type = sys.implementation.name
        else:
            expected_type = None
        self.assertEqual(result['python']['type'], expected_type)

    def test_name(self):
        self.assertEqual(self.collector.name, 'python')

    def test_fact_ids(self):
        self.assertEqual(self.collector._fact_ids, set())

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

    def test_collect_with_subversion(self):
        original_subversion = getattr(sys, 'subversion', None)
        sys.subversion = ('CPython', '', '')
        result = self.collector.collect()
        self.assertEqual(result['python']['type'], 'CPython')
        if original_subversion is None:
            del sys.subversion
        else:
            sys.subversion = original_subversion

    def test_collect_with_implementation(self):
        original_subversion = getattr(sys, 'subversion', None)
        original_implementation = getattr(sys, 'implementation', None)
        if hasattr(sys, 'subversion'):
            del sys.subversion
        sys.implementation = type('MockImplementation', (object,), {'name': 'cpython'})()
        result = self.collector.collect()
        self.assertEqual(result['python']['type'], 'cpython')
        if original_subversion is not None:
            sys.subversion = original_subversion
        if original_implementation is not None:
            sys.implementation = original_implementation

    def test_collect_with_no_type(self):
        original_subversion = getattr(sys, 'subversion', None)
        original_implementation = getattr(sys, 'implementation', None)
        if hasattr(sys, 'subversion'):
            del sys.subversion
        if hasattr(sys, 'implementation'):
            del sys.implementation
        result = self.collector.collect()
        self.assertIsNone(result['python']['type'])
        if original_subversion is not None:
            sys.subversion = original_subversion
        if original_implementation is not None:
            sys.implementation = original_implementation

if __name__ == '__main__':
    unittest.main()