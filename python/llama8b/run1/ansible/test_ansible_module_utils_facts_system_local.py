import unittest
from ansible.module_utils.facts.system.local import LocalFactCollector


class TestLocalFactCollector(unittest.TestCase):
    def test_collect(self):
        module = object()
        module.params = {'fact_path': '/path/to/facts'}
        collector = LocalFactCollector()
        result = collector.collect(module)
        self.assertIsInstance(result, dict)
        self.assertIn('local', result)

    def test_collect_no_fact_path(self):
        module = object()
        collector = LocalFactCollector()
        result = collector.collect(module)
        self.assertEqual(result, {})

    def test_collect_fact_path_not_exists(self):
        module = object()
        module.params = {'fact_path': '/non/existent/path'}
        collector = LocalFactCollector()
        result = collector.collect(module)
        self.assertEqual(result, {})

    def test_collect_fact_script_failure(self):
        module = object()
        module.params = {'fact_path': '/path/to/facts/fact1.fact'}
        collector = LocalFactCollector()
        module.run_command = lambda *args: (1, 'output', 'error')
        result = collector.collect(module)
        self.assertIn('fact1', result['local'])
        self.assertEqual(result['local']['fact1'], 'Failure executing fact script (/path/to/facts/fact1.fact), rc: 1, err: output')

    def test_collect_fact_script_error(self):
        module = object()
        module.params = {'fact_path': '/path/to/facts/fact1.fact'}
        collector = LocalFactCollector()
        module.run_command = lambda *args: (0, 'output', 'error')
        result = collector.collect(module)
        self.assertIn('fact1', result['local'])
        self.assertEqual(result['local']['fact1'], 'error loading fact - output of running "/path/to/facts/fact1.fact" was not utf-8')

    def test_collect_fact_json_error(self):
        module = object()
        module.params = {'fact_path': '/path/to/facts/fact1.fact'}
        collector = LocalFactCollector()
        module.run_command = lambda *args: (0, '{"not": "json"}', '')
        result = collector.collect(module)
        self.assertIn('fact1', result['local'])
        self.assertEqual(result['local']['fact1'], "Failed to convert (/path/to/facts/fact1.fact) to JSON: Failed to parse JSON: Expecting value: line 1 column 1 (char 0)")

    def test_collect_fact_ini_error(self):
        module = object()
        module.params = {'fact_path': '/path/to/facts/fact1.fact'}
        collector = LocalFactCollector()
        module.run_command = lambda *args: (0, '[section]\nkey=value', '')
        result = collector.collect(module)
        self.assertIn('fact1', result['local'])
        self.assertEqual(result['local']['fact1'], "error loading facts as JSON or ini - please check content: /path/to/facts/fact1.fact")

    def test_str_method(self):
        collector = LocalFactCollector()
        result = str(collector)
        self.assertEqual(result, 'LocalFactCollector')

    def test_repr_method(self):
        collector = LocalFactCollector()
        result = repr(collector)
        self.assertEqual(result, 'LocalFactCollector()')

if __name__ == '__main__':
    unittest.main()