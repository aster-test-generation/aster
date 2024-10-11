import unittest
from ansible.executor.stats import AggregateStats


class TestAggregateStats(unittest.TestCase):
    def test_increment(self):
        stats = AggregateStats()
        stats.increment('ok', 'host1')
        stats.increment('failures', 'host2')
        stats.increment('dark', 'host1')
        stats.increment('changed', 'host2')
        stats.increment('skipped', 'host1')
        stats.increment('rescued', 'host2')
        stats.increment('ignored', 'host1')

        self.assertEqual(stats.processed, {'host1': 2, 'host2': 2})
        self.assertEqual(stats.failures, {'host2': 1})
        self.assertEqual(stats.ok, {'host1': 1})
        self.assertEqual(stats.dark, {'host1': 1})
        self.assertEqual(stats.changed, {'host2': 1})
        self.assertEqual(stats.skipped, {'host1': 1})
        self.assertEqual(stats.rescued, {'host2': 1})
        self.assertEqual(stats.ignored, {'host1': 1})

    def test_decrement(self):
        stats = AggregateStats()
        stats.increment('ok', 'host1')
        stats.increment('failures', 'host2')
        stats.increment('dark', 'host1')
        stats.increment('changed', 'host2')
        stats.increment('skipped', 'host1')
        stats.increment('rescued', 'host2')
        stats.increment('ignored', 'host1')

        stats.decrement('ok', 'host1')
        stats.decrement('failures', 'host2')
        stats.decrement('dark', 'host1')
        stats.decrement('changed', 'host2')
        stats.decrement('skipped', 'host1')
        stats.decrement('rescued', 'host2')
        stats.decrement('ignored', 'host1')

        self.assertEqual(stats.processed, {'host1': 0, 'host2': 0})
        self.assertEqual(stats.failures, {'host2': 0})
        self.assertEqual(stats.ok, {'host1': 0})
        self.assertEqual(stats.dark, {'host1': 0})
        self.assertEqual(stats.changed, {'host2': 0})
        self.assertEqual(stats.skipped, {'host1': 0})
        self.assertEqual(stats.rescued, {'host2': 0})
        self.assertEqual(stats.ignored, {'host1': 0})

    def test_summarize(self):
        stats = AggregateStats()
        stats.increment('ok', 'host1')
        stats.increment('failures', 'host2')
        stats.increment('dark', 'host1')
        stats.increment('changed', 'host2')
        stats.increment('skipped', 'host1')
        stats.increment('rescued', 'host2')
        stats.increment('ignored', 'host1')

        self.assertEqual(stats.summarize('host1'), {
            'ok': 1,
            'failures': 0,
            'unreachable': 1,
            'changed': 0,
            'skipped': 1,
            'rescued': 0,
            'ignored': 1,
        })

        self.assertEqual(stats.summarize('host2'), {
            'ok': 0,
            'failures': 1,
            'unreachable': 0,
            'changed': 1,
            'skipped': 0,
            'rescued': 1,
            'ignored': 0,
        })

    def test_set_custom_stats(self):
        stats = AggregateStats()
        stats.set_custom_stats('foo', 'bar', 'host1')
        stats.set_custom_stats('foo', 'baz', 'host2')
        stats.set_custom_stats('bar', 'baz', 'host1')

        self.assertEqual(stats.custom, {
            'host1': {'foo': 'bar', 'bar': 'baz'},
            'host2': {'foo': 'baz'},
            '_run': {},
        })

if __name__ == '__main__':
    unittest.main()