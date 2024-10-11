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

    def test_collect_fact_script_execution_failure(self):
        module = object()
        module.params = {'fact_path': '/path/to/facts/fact1.fact'}
        collector = LocalFactCollector()
        module.run_command = lambda x: (1, 'output', 'error')
        result = collector.collect(module)
        self.assertIn('fact1', result['local'])
        self.assertEqual(result['local']['fact1'], 'Failure executing fact script (/path/to/facts/fact1.fact), rc: 1, err: error')

    def test_collect_fact_script_execution_success(self):
        module = object()
        module.params = {'fact_path': '/path/to/facts/fact1.fact'}
        collector = LocalFactCollector()
        module.run_command = lambda x: (0, 'output', '')
        result = collector.collect(module)
        self.assertIn('fact1', result['local'])

    def test_collect_fact_script_not_executable(self):
        module = object()
        module.params = {'fact_path': '/path/to/facts/fact1.fact'}
        collector = LocalFactCollector()
        module.run_command = lambda x: (1, 'output', 'Permission denied')
        result = collector.collect(module)
        self.assertIn('fact1', result['local'])
        self.assertEqual(result['local']['fact1'], 'Permission denied')

    def test_collect_fact_script_invalid_json(self):
        module = object()
        module.params = {'fact_path': '/path/to/facts/fact1.fact'}
        collector = LocalFactCollector()
        module.run_command = lambda x: (0, '{"not json', '}')
        result = collector.collect(module)
        self.assertIn('fact1', result['local'])
        self.assertEqual(result['local']['fact1'], 'error loading fact - output of running "/path/to/facts/fact1.fact" was not utf-8')

    def test_collect_fact_script_invalid_ini(self):
        module = object()
        module.params = {'fact_path': '/path/to/facts/fact1.fact'}
        collector = LocalFactCollector()
        module.run_command = lambda x: (0, '[section\noption = value', '')
        result = collector.collect(module)
        self.assertIn('fact1', result['local'])
        self.assertEqual(result['local']['fact1'], 'error loading facts as JSON or ini - please check content: /path/to/facts/fact1.fact')

    def test_collect_fact_script_other_error(self):
        module = object()
        module.params = {'fact_path': '/path/to/facts/fact1.fact'}
        collector = LocalFactCollector()
        module.run_command = lambda x: (1, 'output', 'other error')
        result = collector.collect(module)
        self.assertIn('fact1', result['local'])
        self.assertEqual(result['local']['fact1'], 'other error')

if __name__ == '__main__':
    unittest.main()