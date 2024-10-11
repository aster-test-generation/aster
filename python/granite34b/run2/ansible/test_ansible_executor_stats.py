import unittest
from ansible.executor.stats import AggregateStats


class TestAggregateStats(unittest.TestCase):
    def setUp(self):
        self.stats = AggregateStats()

    def test_increment(self):
        self.stats.increment('ok', 'host1')
        self.assertEqual(self.stats.ok['host1'], 1)

    def test_decrement(self):
        self.stats.increment('ok', 'host1')
        self.stats.decrement('ok', 'host1')
        self.assertEqual(self.stats.ok['host1'], 0)

    def test_summarize(self):
        self.stats.increment('ok', 'host1')
        self.stats.increment('failures', 'host1')
        self.stats.increment('dark', 'host1')
        self.stats.increment('changed', 'host1')
        self.stats.increment('skipped', 'host1')
        self.stats.increment('rescued', 'host1')
        self.stats.increment('ignored', 'host1')
        summary = self.stats.summarize('host1')
        self.assertEqual(summary['ok'], 1)
        self.assertEqual(summary['failures'], 1)
        self.assertEqual(summary['unreachable'], 1)
        self.assertEqual(summary['changed'], 1)
        self.assertEqual(summary['skipped'], 1)
        self.assertEqual(summary['rescued'], 1)
        self.assertEqual(summary['ignored'], 1)

    def test_set_custom_stats(self):
        self.stats.set_custom_stats('custom_stat', 'value', 'host1')
        self.assertEqual(self.stats.custom['host1']['custom_stat'], 'value')

    def test_update_custom_stats(self):
        self.stats.set_custom_stats('custom_stat', 'value1', 'host1')
        self.stats.update_custom_stats('custom_stat', 'value2', 'host1')
        self.assertEqual(self.stats.custom['host1']['custom_stat'], 'value1value2')

if __name__ == '__main__':
    unittest.main()