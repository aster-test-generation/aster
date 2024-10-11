from ansible.module_utils.facts.system.python import HAS_SSLCONTEXT
import unittest
from ansible.module_utils.facts.system.python import PythonFactCollector


class TestPythonFactCollector(unittest.TestCase):
    def test_collect(self):
        collector = PythonFactCollector()
        result = collector.collect()
        self.assertIn('python', result)
        self.assertIn('version', result['python'])
        self.assertIn('version_info', result['python'])
        self.assertIn('executable', result['python'])
        self.assertIn('has_sslcontext', result['python'])
        self.assertIn('type', result['python'])

    def test_collect_sslcontext(self):
        collector = PythonFactCollector()
        result = collector.collect()
        self.assertEqual(result['python']['has_sslcontext'], HAS_SSLCONTEXT)

    def test_collect_type(self):
        collector = PythonFactCollector()
        result = collector.collect()
        self.assertIn('type', result['python'])
        self.assertTrue(result['python']['type'] is not None)

if __name__ == '__main__':
    unittest.main()