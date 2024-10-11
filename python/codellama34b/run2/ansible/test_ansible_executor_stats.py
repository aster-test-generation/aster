import unittest
from ansible.executor.stats import *


class TestAggregateStats(unittest.TestCase):
    def test_init(self):
        instance = AggregateStats()
        self.assertEqual(instance.processed, {})
        self.assertEqual(instance.failures, {})
        self.assertEqual(instance.ok, {})
        self.assertEqual(instance.dark, {})
        self.assertEqual(instance.changed, {})
        self.assertEqual(instance.skipped, {})
        self.assertEqual(instance.rescued, {})
        self.assertEqual(instance.ignored, {})
        self.assertEqual(instance.custom, {})

    def test_increment(self):
        instance = AggregateStats()
        instance.increment('ok', 'host')
        self.assertEqual(instance.processed, {'host': 1})
        self.assertEqual(instance.ok, {'host': 1})

    def test_decrement(self):
        instance = AggregateStats()
        instance.decrement('ok', 'host')
        self.assertEqual(instance.processed, {'host': 0})
        self.assertEqual(instance.ok, {'host': 0})

    def test_summarize(self):
        instance = AggregateStats()
        result = instance.summarize('host')
        self.assertEqual(result, {'ok': 0, 'failures': 0, 'unreachable': 0, 'changed': 0, 'skipped': 0, 'rescued': 0, 'ignored': 0})

    def test_set_custom_stats(self):
        instance = AggregateStats()
        instance.set_custom_stats('which', 'what', 'host')
        self.assertEqual(instance.custom, {'host': {'which': 'what'}})

    def test_update_custom_stats(self):
        instance = AggregateStats()
        instance.update_custom_stats('which', 'what', 'host')
        self.assertEqual(instance.custom, {'host': {'which': 'what'}})


if __name__ == '__main__':
    unittest.main()