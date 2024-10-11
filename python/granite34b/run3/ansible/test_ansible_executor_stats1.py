import unittest
from ansible.executor.stats import AggregateStats

class TestAggregateStats(unittest.TestCase):
    def test_increment(self):
        stats = AggregateStats()
        stats.increment('ok', 'host1')
        self.assertEqual(stats.ok['host1'], 1)

    def test_decrement(self):
        stats = AggregateStats()
        stats.increment('ok', 'host1')
        stats.decrement('ok', 'host1')
        self.assertEqual(stats.ok['host1'], 0)

    def test_summarize(self):
        stats = AggregateStats()
        stats.increment('ok', 'host1')
        stats.increment('failures', 'host1')
        stats.increment('dark', 'host1')
        stats.increment('changed', 'host1')
        stats.increment('skipped', 'host1')
        stats.increment('rescued', 'host1')
        stats.increment('ignored', 'host1')
        summary = stats.summarize('host1')
        self.assertEqual(summary['ok'], 1)
        self.assertEqual(summary['failures'], 1)
        self.assertEqual(summary['unreachable'], 1)
        self.assertEqual(summary['changed'], 1)
        self.assertEqual(summary['skipped'], 1)
        self.assertEqual(summary['rescued'], 1)
        self.assertEqual(summary['ignored'], 1)

    def test_set_custom_stats(self):
        stats = AggregateStats()
        stats.set_custom_stats('custom_stat', 'value')
        self.assertEqual(stats.custom['_run']['custom_stat'], 'value')

    def test_update_custom_stats(self):
        stats = AggregateStats()
        stats.set_custom_stats('custom_stat', 'value1')
        stats.update_custom_stats('custom_stat', 'value2')
        self.assertEqual(stats.custom['_run']['custom_stat'], 'value1value2')

if __name__ == '__main__':
    unittest.main()