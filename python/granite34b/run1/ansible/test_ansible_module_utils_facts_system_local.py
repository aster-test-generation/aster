import unittest
from unittest.mock import MagicMock
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
        import os
        with open('/path/to/facts/test.fact', 'w') as f:
            f.write('{"test": "value"}')
        result = collector.collect(module=module)
        self.assertEqual(result, {'local': {'test': {'test': 'value'}}})

    def test_collect_with_module_and_fact_path_and_executable_fact(self):
        collector = LocalFactCollector()
        module = MagicMock()
        module.params = {'fact_path': '/path/to/facts'}
        import os
        with open('/path/to/facts/test.fact', 'w') as f:
            f.write('{"test": "value"}')
        os.chmod('/path/to/facts/test.fact', 0o755)
        result = collector.collect(module=module)
        self.assertEqual(result, {'local': {'test': {'test': 'value'}}})

    def test_collect_with_module_and_fact_path_and_invalid_json(self):
        collector = LocalFactCollector()
        module = MagicMock()
        module.params = {'fact_path': '/path/to/facts'}
        import os
        with open('/path/to/facts/test.fact', 'w') as f:
            f.write('invalid json')
        result = collector.collect(module=module)
        self.assertEqual(result, {'local': {'test': 'error loading fact - output of running "/path/to/facts/test.fact" was not utf-8'}})

    def test_collect_with_module_and_fact_path_and_invalid_ini(self):
        collector = LocalFactCollector()
        module = MagicMock()
        module.params = {'fact_path': '/path/to/facts'}
        import os
        with open('/path/to/facts/test.fact', 'w') as f:
            f.write('[test]\ninvalid = ini')
        result = collector.collect(module=module)
        self.assertEqual(result, {'local': {'test': 'error loading facts as JSON or ini - please check content: /path/to/facts/test.fact'}})

    def test_collect_with_module_and_fact_path_and_invalid_fact_file(self):
        collector = LocalFactCollector()
        module = MagicMock()
        module.params = {'fact_path': '/path/to/facts'}
        import os
        with open('/path/to/facts/test.fact', 'w') as f:
            f.write('invalid fact file')
        result = collector.collect(module=module)
        self.assertEqual(result, {'local': {'test': 'Failed to convert (/path/to/facts/test.fact) to JSON: Expecting value: line 1 column 1 (char 0)'}})

if __name__ == '__main__':
    unittest.main()