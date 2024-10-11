import unittest
from ansible.module_utils.facts.system.python import PythonFactCollector


class TestPythonFactCollector(unittest.TestCase):
    def test_collect(self):
        collector = PythonFactCollector()
        facts = collector.collect()
        self.assertIn('python', facts)
        python_facts = facts['python']
        self.assertIn('version', python_facts)
        version_facts = python_facts['version']
        self.assertIn('major', version_facts)
        self.assertEqual(version_facts['major'], 3)
        self.assertIn('minor', version_facts)
        self.assertEqual(version_facts['minor'], 11)
        self.assertIn('micro', version_facts)
        self.assertEqual(version_facts['micro'], 0)
        self.assertIn('releaselevel', version_facts)
        self.assertEqual(version_facts['releaselevel'], 'final')
        self.assertIn('serial', version_facts)
        self.assertEqual(version_facts['serial'], 0)
        self.assertIn('version_info', python_facts)
        self.assertEqual(python_facts['version_info'], [3, 8, 0, 'final', 0])
        self.assertIn('executable', python_facts)
        self.assertEqual(python_facts['executable'], '/usr/bin/python3')
        self.assertIn('has_sslcontext', python_facts)
        self.assertTrue(python_facts['has_sslcontext'])
        self.assertIn('type', python_facts)
        self.assertEqual(python_facts['type'], 'CPython')

if __name__ == '__main__':
    unittest.main()