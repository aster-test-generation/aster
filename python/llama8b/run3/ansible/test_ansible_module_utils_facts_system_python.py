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

    def test_collect_module(self):
        collector = PythonFactCollector()
        result = collector.collect(module='test_module')
        self.assertIn('python', result)
        self.assertIn('version', result['python'])
        self.assertIn('version_info', result['python'])
        self.assertIn('executable', result['python'])
        self.assertIn('has_sslcontext', result['python'])
        self.assertIn('type', result['python'])

    def test_collect_collected_facts(self):
        collector = PythonFactCollector()
        collected_facts = {'fact1': 'value1', 'fact2': 'value2'}
        result = collector.collect(collected_facts=collected_facts)
        self.assertIn('python', result)
        self.assertIn('version', result['python'])
        self.assertIn('version_info', result['python'])
        self.assertIn('executable', result['python'])
        self.assertIn('has_sslcontext', result['python'])
        self.assertIn('type', result['python'])
        self.assertIn('fact1', collected_facts)
        self.assertIn('fact2', collected_facts)

    def test_init(self):
        collector = PythonFactCollector()
        self.assertEqual(collector.name, 'python')

    def test_str(self):
        collector = PythonFactCollector()
        result = str(collector)
        self.assertEqual(result, 'PythonFactCollector')

    def test_repr(self):
        collector = PythonFactCollector()
        result = repr(collector)
        self.assertEqual(result, 'PythonFactCollector()')

    def test_eq(self):
        collector1 = PythonFactCollector()
        collector2 = PythonFactCollector()
        self.assertEqual(collector1, collector2)

if __name__ == '__main__':
    unittest.main()