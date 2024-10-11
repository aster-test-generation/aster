import unittest
from ansible.module_utils.facts.system.local import LocalFactCollector
from unittest.mock import Mock


class TestLocalFactCollector(unittest.TestCase):
    def test_collect(self):
        collector = LocalFactCollector()
        result = collector.collect()
        self.assertIsInstance(result, dict)
        self.assertIn('local', result)
        self.assertIsInstance(result['local'], dict)

    def test_collect_with_module(self):
        collector = LocalFactCollector()
        module = Mock()
        result = collector.collect(module)
        self.assertIsInstance(result, dict)
        self.assertIn('local', result)
        self.assertIsInstance(result['local'], dict)

    def test_collect_with_fact_path(self):
        collector = LocalFactCollector()
        module = Mock()
        module.params = {'fact_path': '/path/to/facts'}
        result = collector.collect(module)
        self.assertIsInstance(result, dict)
        self.assertIn('local', result)
        self.assertIsInstance(result['local'], dict)

    def test_collect_with_failed_fact_script(self):
        collector = LocalFactCollector()
        module = Mock()
        module.params = {'fact_path': '/path/to/facts'}
        result = collector.collect(module)
        self.assertIsInstance(result, dict)
        self.assertIn('local', result)
        self.assertIsInstance(result['local'], dict)
        self.assertIn('fact_base', result['local']['vars'])
        self.assertEqual(result['local']['fact_base'], 'error loading fact - output of running "/path/to/facts/fact_base.fact" was not utf-8')

    def test_collect_with_failed_fact_script_execution(self):
        collector = LocalFactCollector()
        module = Mock()
        module.params = {'fact_path': '/path/to/facts'}
        result = collector.collect(module)
        self.assertIsInstance(result, dict)
        self.assertIn('local', result)
        self.assertIsInstance(result['local'], dict)
        self.assertIn('fact_base', result['local']['vars'])
        self.assertEqual(result['local']['fact_base'], 'Failure executing fact script ("/path/to/facts/fact_base.fact"), rc: 1, err: ')

    def test_collect_with_valid_fact_script(self):
        collector = LocalFactCollector()
        module = Mock()
        module.params = {'fact_path': '/path/to/facts'}
        result = collector.collect(module)
        self.assertIsInstance(result, dict)
        self.assertIn('local', result)
        self.assertIsInstance(result['local'], dict)
        self.assertIn('fact_base', result['local']['vars'])
        self.assertEqual(result['local']['fact_base'], {'fact': 'value'})

if __name__ == '__main__':
    unittest.main()