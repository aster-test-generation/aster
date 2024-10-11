import unittest
from ansible.module_utils.facts.system.date_time import DateTimeFactCollector


class TestDateTimeFactCollector(unittest.TestCase):
    def test_collect(self):
        collector = DateTimeFactCollector()
        result = collector.collect()
        self.assertIsInstance(result, dict)
        self.assertIn('date_time', result)
        self.assertIsInstance(result['date_time'], dict)
        self.assertGreater(len(result['date_time']), 0)

    def test_collect_with_module(self):
        collector = DateTimeFactCollector()
        module = object()
        result = collector.collect(module=module)
        self.assertIsInstance(result, dict)
        self.assertIn('date_time', result)
        self.assertIsInstance(result['date_time'], dict)
        self.assertGreater(len(result['date_time']), 0)

    def test_collect_with_collected_facts(self):
        collector = DateTimeFactCollector()
        collected_facts = object()
        result = collector.collect(collected_facts=collected_facts)
        self.assertIsInstance(result, dict)
        self.assertIn('date_time', result)
        self.assertIsInstance(result['date_time'], dict)
        self.assertGreater(len(result['date_time']), 0)

    def test_collect_with_module_and_collected_facts(self):
        collector = DateTimeFactCollector()
        module = object()
        collected_facts = object()
        result = collector.collect(module=module, collected_facts=collected_facts)
        self.assertIsInstance(result, dict)
        self.assertIn('date_time', result)
        self.assertIsInstance(result['date_time'], dict)
        self.assertGreater(len(result['date_time']), 0)

if __name__ == '__main__':
    unittest.main()