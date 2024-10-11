import unittest
from ansible.executor.stats import AggregateStats


class TestAggregateStats(unittest.TestCase):
    def test_init(self):
        stats = AggregateStats()
        self.assertEqual(stats.processed, {})
        self.assertEqual(stats.failures, {})
        self.assertEqual(stats.ok, {})
        self.assertEqual(stats.dark, {})
        self.assertEqual(stats.changed, {})
        self.assertEqual(stats.skipped, {})
        self.assertEqual(stats.rescued, {})
        self.assertEqual(stats.ignored, {})
        self.assertEqual(stats.custom, {})

    def test_increment(self):
        stats = AggregateStats()
        stats.increment('ok', 'host1')
        self.assertEqual(stats.ok, {'host1': 1})
        stats.increment('ok', 'host1')
        self.assertEqual(stats.ok, {'host1': 2})

    def test_decrement(self):
        stats = AggregateStats()
        stats.decrement('ok', 'host1')
        self.assertEqual(stats.ok, {'host1': 0})
        stats.decrement('ok', 'host1')
        self.assertEqual(stats.ok, {})

    def test_summarize(self):
        stats = AggregateStats()
        stats.ok['host1'] = 1
        stats.failures['host1'] = 2
        stats.dark['host1'] = 3
        stats.changed['host1'] = 4
        stats.skipped['host1'] = 5
        stats.rescued['host1'] = 6
        stats.ignored['host1'] = 7
        result = stats.summarize('host1')
        self.assertEqual(result, {'ok': 1, 'failures': 2, 'unreachable': 3, 'changed': 4, 'skipped': 5, 'rescued': 6, 'ignored': 7})

    def test_set_custom_stats(self):
        stats = AggregateStats()
        stats.set_custom_stats('custom_key', 'custom_value', 'host1')
        self.assertEqual(stats.custom, {'host1': {'custom_key': 'custom_value'}})

    def test_update_custom_stats(self):
        stats = AggregateStats()
        stats.update_custom_stats('custom_key', {'key1': 'value1', 'key2': 'value2'}, 'host1')
        self.assertEqual(stats.custom, {'host1': {'custom_key': {'key1': 'value1', 'key2': 'value2'}}})

    def test_str(self):
        stats = AggregateStats()
        result = str(stats)
        self.assertEqual(result, 'AggregateStats')

    def test_repr(self):
        stats = AggregateStats()
        result = repr(stats)
        self.assertEqual(result, 'AggregateStats()')

    def test_eq(self):
        stats1 = AggregateStats()
        stats2 = AggregateStats()
        self.assertEqual(stats1, stats2)

    def test_private_method(self):
        stats = AggregateStats()
        stats._AggregateStats__private_method = lambda x: x * 2
        result = stats._AggregateStats__private_method(3)
        self.assertEqual(result, 6)

    def test_protected_method(self):
        stats = AggregateStats()
        stats._increment = lambda x, y: y * 2
        result = stats._increment('ok', 3)
        self.assertEqual(result, 6)

if __name__ == '__main__':
    unittest.main()