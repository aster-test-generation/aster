import unittest
from ansible.executor.stats import AggregateStats


class TestAggregateStats(unittest.TestCase):
    def test_increment(self):
        stats = AggregateStats()
        stats.increment('ok', 'host1')
        self.assertEqual(stats.ok['host1'], 1)
        stats.increment('failures', 'host1')
        self.assertEqual(stats.failures['host1'], 1)
        stats.increment('dark', 'host1')
        self.assertEqual(stats.dark['host1'], 1)
        stats.increment('changed', 'host1')
        self.assertEqual(stats.changed['host1'], 1)
        stats.increment('skipped', 'host1')
        self.assertEqual(stats.skipped['host1'], 1)
        stats.increment('rescued', 'host1')
        self.assertEqual(stats.rescued['host1'], 1)
        stats.increment('ignored', 'host1')
        self.assertEqual(stats.ignored['host1'], 1)

    def test_decrement(self):
        stats = AggregateStats()
        stats.decrement('ok', 'host1')
        self.assertEqual(stats.ok['host1'], 0)
        stats.decrement('failures', 'host1')
        self.assertEqual(stats.failures['host1'], 0)
        stats.decrement('dark', 'host1')
        self.assertEqual(stats.dark['host1'], 0)
        stats.decrement('changed', 'host1')
        self.assertEqual(stats.changed['host1'], 0)
        stats.decrement('skipped', 'host1')
        self.assertEqual(stats.skipped['host1'], 0)
        stats.decrement('rescued', 'host1')
        self.assertEqual(stats.rescued['host1'], 0)
        stats.decrement('ignored', 'host1')
        self.assertEqual(stats.ignored['host1'], 0)

    def test_summarize(self):
        stats = AggregateStats()
        stats.increment('ok', 'host1')
        stats.increment('failures', 'host1')
        stats.increment('dark', 'host1')
        stats.increment('changed', 'host1')
        stats.increment('skipped', 'host1')
        stats.increment('rescued', 'host1')
        stats.increment('ignored', 'host1')
        self.assertEqual(stats.summarize('host1'), {
            'ok': 1,
            'failures': 1,
            'unreachable': 1,
            'changed': 1,
            'skipped': 1,
            'rescued': 1,
            'ignored': 1
        })

    def test_set_custom_stats(self):
        stats = AggregateStats()
        stats.set_custom_stats('test', 1, 'host1')
        self.assertEqual(stats.custom['host1']['test'], 1)

    def test_update_custom_stats(self):
        stats = AggregateStats()
        stats.update_custom_stats('test', 1, 'host1')
        self.assertEqual(stats.custom['host1']['test'], 1)
        stats.update_custom_stats('test', 2, 'host1')
        self.assertEqual(stats.custom['host1']['test'], 3)
        stats.update_custom_stats('test', {'a': 1}, 'host1')
        self.assertEqual(stats.custom['host1']['test'], {'a': 1})

if __name__ == '__main__':
    unittest.main()