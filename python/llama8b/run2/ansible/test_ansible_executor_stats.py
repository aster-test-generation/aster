import unittest
from ansible.executor.stats import AggregateStats


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
        instance.increment('ok', 'host1')
        self.assertEqual(instance.ok, {'host1': 1})
        instance.increment('ok', 'host1')
        self.assertEqual(instance.ok, {'host1': 2})

    def test_decrement(self):
        instance = AggregateStats()
        instance.decrement('ok', 'host1')
        self.assertEqual(instance.ok, {'host1': 0})
        instance.decrement('ok', 'host1')
        self.assertEqual(instance.ok, {'host1': -1})

    def test_summarize(self):
        instance = AggregateStats()
        instance.ok['host1'] = 1
        instance.failures['host1'] = 2
        instance.dark['host1'] = 3
        instance.changed['host1'] = 4
        instance.skipped['host1'] = 5
        instance.rescued['host1'] = 6
        instance.ignored['host1'] = 7
        result = instance.summarize('host1')
        self.assertEqual(result, {'ok': 1, 'failures': 2, 'unreachable': 3, 'changed': 4, 'skipped': 5, 'rescued': 6, 'ignored': 7})

    def test_set_custom_stats(self):
        instance = AggregateStats()
        instance.set_custom_stats('custom_stat', 'value', 'host1')
        self.assertEqual(instance.custom, {'host1': {'custom_stat': 'value'}})

    def test_update_custom_stats(self):
        instance = AggregateStats()
        instance.update_custom_stats('custom_stat', 'value', 'host1')
        self.assertEqual(instance.custom, {'host1': {'custom_stat': 'value'}})
        instance.update_custom_stats('custom_stat', {'key': 'value'}, 'host1')
        self.assertEqual(instance.custom, {'host1': {'custom_stat': {'key': 'value'}}})

    def test_str(self):
        instance = AggregateStats()
        self.assertEqual(str(instance), 'AggregateStats')

    def test_repr(self):
        instance = AggregateStats()
        self.assertEqual(repr(instance), 'AggregateStats()')

    def test_eq(self):
        instance1 = AggregateStats()
        instance2 = AggregateStats()
        self.assertEqual(instance1, instance2)

if __name__ == '__main__':
    unittest.main()