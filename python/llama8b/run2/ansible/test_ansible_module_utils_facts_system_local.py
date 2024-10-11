import unittest
from ansible.module_utils.facts.system.local import LocalFactCollector


class TestLocalFactCollector(unittest.TestCase):
    def test_collect(self):
        module = object()
        module.params = {'fact_path': '/path/to/facts'}
        local_facts = LocalFactCollector().collect(module)
        self.assertEqual(local_facts, {'local': {}})

    def test_collect_with_fact_path(self):
        module = object()
        module.params = {'fact_path': '/path/to/facts'}
        local_facts = LocalFactCollector().collect(module)
        self.assertEqual(local_facts, {'local': {}})

    def test_collect_with_fact_file(self):
        module = object()
        module.params = {'fact_path': '/path/to/facts/fact1.fact'}
        local_facts = LocalFactCollector().collect(module)
        self.assertEqual(local_facts, {'local': {'fact1': {}}})

    def test_collect_with_fact_file_failure(self):
        module = object()
        module.params = {'fact_path': '/path/to/facts/fact1.fact'}
        local_facts = LocalFactCollector().collect(module)
        self.assertEqual(local_facts, {'local': {'fact1': 'Failure executing fact script (/path/to/facts/fact1.fact), rc: 1, err: error'}})

    def test_collect_with_fact_file_error(self):
        module = object()
        module.params = {'fact_path': '/path/to/facts/fact1.fact'}
        local_facts = LocalFactCollector().collect(module)
        self.assertEqual(local_facts, {'local': {'fact1': 'error loading fact - output of running "/path/to/facts/fact1.fact" was not utf-8'}})

    def test_collect_with_fact_file_json(self):
        module = object()
        module.params = {'fact_path': '/path/to/facts/fact1.fact'}
        local_facts = LocalFactCollector().collect(module)
        self.assertEqual(local_facts, {'local': {'fact1': {'key': 'value'}}})

    def test_collect_with_fact_file_ini(self):
        module = object()
        module.params = {'fact_path': '/path/to/facts/fact1.fact'}
        local_facts = LocalFactCollector().collect(module)
        self.assertEqual(local_facts, {'local': {'fact1': {'section': {'option': 'value'}}}})

    def test_collect_with_fact_file_error_json(self):
        module = object()
        module.params = {'fact_path': '/path/to/facts/fact1.fact'}
        local_facts = LocalFactCollector().collect(module)
        self.assertEqual(local_facts, {'local': {'fact1': 'Failed to convert (/path/to/facts/fact1.fact) to JSON: error'}})

if __name__ == '__main__':
    unittest.main()