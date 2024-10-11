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
        stats.set_custom_stats('custom_stat', 'value', 'host1')
        self.assertEqual(stats.custom['host1']['custom_stat'], 'value')

    def test_update_custom_stats(self):
        stats = AggregateStats()
        stats.set_custom_stats('custom_stat', 'value1', 'host1')
        stats.update_custom_stats('custom_stat', 'value2', 'host1')
        self.assertEqual(stats.custom['host1']['custom_stat'], 'value1value2')

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
        stats.increment('failures', 'host2')
        self.assertEqual(stats.ok, {'host1': 1})
        self.assertEqual(stats.failures, {'host2': 1})

    def test_decrement(self):
        stats = AggregateStats()
        stats.increment('ok', 'host1')
        stats.decrement('ok', 'host1')
        self.assertEqual(stats.ok, {'host1': 0})

    def test_summarize(self):
        stats = AggregateStats()
        stats.increment('ok', 'host1')
        stats.increment('failures', 'host2')
        stats.increment('dark', 'host3')
        self.assertEqual(stats.summarize('host1'), {'ok': 1, 'failures': 0, 'unreachable': 0, 'changed': 0, 'skipped': 0, 'rescued': 0, 'ignored': 0})
        self.assertEqual(stats.summarize('host2'), {'ok': 0, 'failures': 1, 'unreachable': 0, 'changed': 0, 'skipped': 0, 'rescued': 0, 'ignored': 0})
        self.assertEqual(stats.summarize('host3'), {'ok': 0, 'failures': 0, 'unreachable': 1, 'changed': 0, 'skipped': 0, 'rescued': 0, 'ignored': 0})

    def test_set_custom_stats(self):
        stats = AggregateStats()
        stats.set_custom_stats('custom1', 'value1', 'host1')
        stats.set_custom_stats('custom2', 'value2', 'host2')
        self.assertEqual(stats.custom, {'host1': {'custom1': 'value1'}, 'host2': {'custom2': 'value2'}})

    def test_update_custom_stats(self):
        stats = AggregateStats()
        stats.set_custom_stats('custom1', 'value1', 'host1')
        stats.update_custom_stats('custom1', 'value2', 'host1')
        stats.update_custom_stats('custom2', 'value2', 'host2')
        self.assertEqual(stats.custom, {'host1': {'custom1': 'value1value2'}, 'host2': {'custom2': 'value2'}})

if __name__ == '__main__':
    unittest.main()