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
        self.assertIn('type', facts['python'])

    def test_collect_version_info(self):
        collector = PythonFactCollector()
        facts = collector.collect()
        self.assertIsInstance(facts['python']['version_info'], list)
        self.assertEqual(len(facts['python']['version_info']), 4)

    def test_collect_executable(self):
        collector = PythonFactCollector()
        facts = collector.collect()
        self.assertIsInstance(facts['python']['executable'], str)

    def test_collect_has_sslcontext(self):
        collector = PythonFactCollector()
        facts = collector.collect()
        self.assertIsInstance(facts['python']['has_sslcontext'], bool)

    def test_collect_type(self):
        collector = PythonFactCollector()
        facts = collector.collect()
        self.assertIsInstance(facts['python']['type'], str)

    def test_str_method(self):
        collector = PythonFactCollector()
        result = str(collector)
        self.assertEqual(result, 'PythonFactCollector')

    def test_repr_method(self):
        collector = PythonFactCollector()
        result = repr(collector)
        self.assertEqual(result, 'PythonFactCollector()')

    def test_eq_method(self):
        collector1 = PythonFactCollector()
        collector2 = PythonFactCollector()
        self.assertEqual(collector1, collector2)

if __name__ == '__main__':
    unittest.main()