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
        version_info = python_facts['version_info']
        self.assertEqual(len(version_info), 5)
        self.assertEqual(version_info[0], 3)
        self.assertEqual(version_info[1], 8)
        self.assertEqual(version_info[2], 0)
        self.assertEqual(version_info[3], 'final')
        self.assertEqual(version_info[4], 0)
        self.assertIn('executable', python_facts)
        self.assertEqual(python_facts['executable'], sys.executable)
        self.assertIn('has_sslcontext', python_facts)
        self.assertEqual(python_facts['has_sslcontext'], HAS_SSLCONTEXT)
        self.assertIn('type', python_facts)
        self.assertEqual(python_facts['type'], sys.subversion[0])

if __name__ == '__main__':
    unittest.main()