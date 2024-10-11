import unittest
from ansible.executor.stats import AggregateStats
from ansible.module_utils.common._collections_compat import MutableMapping
from ansible.utils.vars import merge_hash


class TestAggregateStats(unittest.TestCase):
    def setUp(self):
        self.stats = AggregateStats()

    def test_init(self):
        self.assertIsInstance(self.stats.processed, dict)
        self.assertIsInstance(self.stats.failures, dict)
        self.assertIsInstance(self.stats.ok, dict)
        self.assertIsInstance(self.stats.dark, dict)
        self.assertIsInstance(self.stats.changed, dict)
        self.assertIsInstance(self.stats.skipped, dict)
        self.assertIsInstance(self.stats.rescued, dict)
        self.assertIsInstance(self.stats.ignored, dict)
        self.assertIsInstance(self.stats.custom, dict)

    def test_increment(self):
        self.stats.increment('ok', 'host1')
        self.assertEqual(self.stats.ok['host1'], 1)
        self.assertEqual(self.stats.processed['host1'], 1)

    def test_decrement(self):
        self.stats.increment('ok', 'host1')
        self.stats.decrement('ok', 'host1')
        self.assertEqual(self.stats.ok['host1'], 0)

    def test_decrement_below_zero(self):
        self.stats.decrement('ok', 'host1')
        self.assertEqual(self.stats.ok['host1'], 0)

    def test_summarize(self):
        self.stats.increment('ok', 'host1')
        summary = self.stats.summarize('host1')
        self.assertEqual(summary['ok'], 1)
        self.assertEqual(summary['failures'], 0)
        self.assertEqual(summary['unreachable'], 0)
        self.assertEqual(summary['changed'], 0)
        self.assertEqual(summary['skipped'], 0)
        self.assertEqual(summary['rescued'], 0)
        self.assertEqual(summary['ignored'], 0)

    def test_set_custom_stats(self):
        self.stats.set_custom_stats('custom_stat', 5, 'host1')
        self.assertEqual(self.stats.custom['host1']['custom_stat'], 5)

    def test_set_custom_stats_default_host(self):
        self.stats.set_custom_stats('custom_stat', 5)
        self.assertEqual(self.stats.custom['_run']['custom_stat'], 5)

    def test_update_custom_stats(self):
        self.stats.set_custom_stats('custom_stat', 5, 'host1')
        self.stats.update_custom_stats('custom_stat', 3, 'host1')
        self.assertEqual(self.stats.custom['host1']['custom_stat'], 8)

    def test_update_custom_stats_new_stat(self):
        self.stats.update_custom_stats('custom_stat', 5, 'host1')
        self.assertEqual(self.stats.custom['host1']['custom_stat'], 5)

    def test_update_custom_stats_incompatible_type(self):
        self.stats.set_custom_stats('custom_stat', 5, 'host1')
        result = self.stats.update_custom_stats('custom_stat', {}, 'host1')
        self.assertIsNone(result)

    def test_update_custom_stats_merge_hash(self):
        self.stats.set_custom_stats('custom_stat', {'key1': 'value1'}, 'host1')
        self.stats.update_custom_stats('custom_stat', {'key2': 'value2'}, 'host1')
        self.assertEqual(self.stats.custom['host1']['custom_stat'], {'key1': 'value1', 'key2': 'value2'})

class TestAggregateStats(unittest.TestCase):
    def setUp(self):
        self.stats = AggregateStats()

    def test_init(self):
        self.assertIsInstance(self.stats.processed, dict)
        self.assertIsInstance(self.stats.failures, dict)
        self.assertIsInstance(self.stats.ok, dict)
        self.assertIsInstance(self.stats.dark, dict)
        self.assertIsInstance(self.stats.changed, dict)
        self.assertIsInstance(self.stats.skipped, dict)
        self.assertIsInstance(self.stats.rescued, dict)
        self.assertIsInstance(self.stats.ignored, dict)
        self.assertIsInstance(self.stats.custom, dict)

    def test_increment(self):
        self.stats.increment('ok', 'host1')
        self.assertEqual(self.stats.ok['host1'], 1)
        self.stats.increment('ok', 'host1')
        self.assertEqual(self.stats.ok['host1'], 2)

    def test_decrement(self):
        self.stats.ok['host1'] = 2
        self.stats.decrement('ok', 'host1')
        self.assertEqual(self.stats.ok['host1'], 1)
        self.stats.decrement('ok', 'host1')
        self.assertEqual(self.stats.ok['host1'], 0)
        self.stats.decrement('ok', 'host1')
        self.assertEqual(self.stats.ok['host1'], 0)

    def test_summarize(self):
        self.stats.ok['host1'] = 1
        self.stats.failures['host1'] = 2
        summary = self.stats.summarize('host1')
        self.assertEqual(summary, {
            'ok': 1,
            'failures': 2,
            'unreachable': 0,
            'changed': 0,
            'skipped': 0,
            'rescued': 0,
            'ignored': 0
        })

    def test_set_custom_stats(self):
        self.stats.set_custom_stats('custom_stat', 5, 'host1')
        self.assertEqual(self.stats.custom['host1']['custom_stat'], 5)
        self.stats.set_custom_stats('custom_stat', 10, 'host1')
        self.assertEqual(self.stats.custom['host1']['custom_stat'], 10)

    def test_update_custom_stats(self):
        self.stats.update_custom_stats('custom_stat', 5, 'host1')
        self.assertEqual(self.stats.custom['host1']['custom_stat'], 5)
        self.stats.update_custom_stats('custom_stat', 10, 'host1')
        self.assertEqual(self.stats.custom['host1']['custom_stat'], 15)
        self.stats.update_custom_stats('custom_stat', {'key': 'value'}, 'host1')
        self.assertEqual(self.stats.custom['host1']['custom_stat'], {'key': 'value'})

    def test_update_custom_stats_merge_hash(self):
        self.stats.update_custom_stats('custom_stat', {'key1': 'value1'}, 'host1')
        self.stats.update_custom_stats('custom_stat', {'key2': 'value2'}, 'host1')
        self.assertEqual(self.stats.custom['host1']['custom_stat'], {'key1': 'value1', 'key2': 'value2'})

if __name__ == '__main__':
    unittest.main()