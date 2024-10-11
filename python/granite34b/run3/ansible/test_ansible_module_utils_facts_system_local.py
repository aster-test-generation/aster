import unittest
from unittest.mock import MagicMock
import os
from ansible.module_utils.facts.system.local import LocalFactCollector


class TestLocalFactCollector(unittest.TestCase):
    def test_collect_without_module(self):
        collector = LocalFactCollector()
        result = collector.collect()
        self.assertEqual(result, {'local': {}})

    def test_collect_with_module(self):
        collector = LocalFactCollector()
        module = MagicMock()
        module.params = {'fact_path': '/path/to/facts'}
        result = collector.collect(module=module)
        self.assertEqual(result, {'local': {}})

    def test_collect_with_module_and_fact_path(self):
        collector = LocalFactCollector()
        module = MagicMock()
        module.params = {'fact_path': '/path/to/facts'}
        os.makedirs('/path/to/facts', exist_ok=True)
        with open('/path/to/facts/test.fact', 'w') as f:
            f.write('{"key": "value"}')
        result = collector.collect(module=module)
        self.assertEqual(result, {'local': {'test': {'key': 'value'}}})
        os.remove('/path/to/facts/test.fact')
        os.rmdir('/path/to/facts')

if __name__ == '__main__':
    unittest.main()