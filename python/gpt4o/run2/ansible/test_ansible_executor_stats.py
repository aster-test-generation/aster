import unittest
from ansible.executor.stats import AggregateStats
from ansible.module_utils.common._collections_compat import MutableMapping


class TestAggregateStats(unittest.TestCase):
    def setUp(self):
        self.stats = AggregateStats()

    def test_init(self):
        self.assertEqual(self.stats.processed, {})
        self.assertEqual(self.stats.failures, {})
        self.assertEqual(self.stats.ok, {})
        self.assertEqual(self.stats.dark, {})
        self.assertEqual(self.stats.changed, {})
        self.assertEqual(self.stats.skipped, {})
        self.assertEqual(self.stats.rescued, {})
        self.assertEqual(self.stats.ignored, {})
        self.assertEqual(self.stats.custom, {})

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
        self.assertEqual(summary, {
            'ok': 1,
            'failures': 0,
            'unreachable': 0,
            'changed': 0,
            'skipped': 0,
            'rescued': 0,
            'ignored': 0
        })

    def test_set_custom_stats(self):
        self.stats.set_custom_stats('custom_stat', 5, 'host1')
        self.assertEqual(self.stats.custom['host1']['custom_stat'], 5)

    def test_update_custom_stats(self):
        self.stats.set_custom_stats('custom_stat', 5, 'host1')
        self.stats.update_custom_stats('custom_stat', 3, 'host1')
        self.assertEqual(self.stats.custom['host1']['custom_stat'], 8)

    def test_update_custom_stats_with_merge(self):
        self.stats.set_custom_stats('custom_stat', {'key1': 'value1'}, 'host1')
        self.stats.update_custom_stats('custom_stat', {'key2': 'value2'}, 'host1')
        self.assertEqual(self.stats.custom['host1']['custom_stat'], {'key1': 'value1', 'key2': 'value2'})

    def test_update_custom_stats_with_different_type(self):
        self.stats.set_custom_stats('custom_stat', 5, 'host1')
        result = self.stats.update_custom_stats('custom_stat', {'key': 'value'}, 'host1')
        self.assertIsNone(result)

class TestAggregateStats(unittest.TestCase):
    def setUp(self):
        self.stats = AggregateStats()

    def test_init(self):
        self.assertEqual(self.stats.processed, {})
        self.assertEqual(self.stats.failures, {})
        self.assertEqual(self.stats.ok, {})
        self.assertEqual(self.stats.dark, {})
        self.assertEqual(self.stats.changed, {})
        self.assertEqual(self.stats.skipped, {})
        self.assertEqual(self.stats.rescued, {})
        self.assertEqual(self.stats.ignored, {})
        self.assertEqual(self.stats.custom, {})

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
        self.assertEqual(summary, {
            'ok': 1,
            'failures': 0,
            'unreachable': 0,
            'changed': 0,
            'skipped': 0,
            'rescued': 0,
            'ignored': 0
        })

    def test_set_custom_stats(self):
        self.stats.set_custom_stats('custom_stat', 5, 'host1')
        self.assertEqual(self.stats.custom['host1']['custom_stat'], 5)

    def test_set_custom_stats_no_host(self):
        self.stats.set_custom_stats('custom_stat', 5)
        self.assertEqual(self.stats.custom['_run']['custom_stat'], 5)

    def test_update_custom_stats(self):
        self.stats.set_custom_stats('custom_stat', 5, 'host1')
        self.stats.update_custom_stats('custom_stat', 3, 'host1')
        self.assertEqual(self.stats.custom['host1']['custom_stat'], 8)

    def test_update_custom_stats_no_host(self):
        self.stats.set_custom_stats('custom_stat', 5)
        self.stats.update_custom_stats('custom_stat', 3)
        self.assertEqual(self.stats.custom['_run']['custom_stat'], 8)

    def test_update_custom_stats_new_stat(self):
        self.stats.update_custom_stats('custom_stat', 5, 'host1')
        self.assertEqual(self.stats.custom['host1']['custom_stat'], 5)

    def test_update_custom_stats_type_mismatch(self):
        self.stats.set_custom_stats('custom_stat', 5, 'host1')
        result = self.stats.update_custom_stats('custom_stat', 'string', 'host1')
        self.assertIsNone(result)

    def test_update_custom_stats_mutable_mapping(self):
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
        self.stats.dark['host1'] = 3
        self.stats.changed['host1'] = 4
        self.stats.skipped['host1'] = 5
        self.stats.rescued['host1'] = 6
        self.stats.ignored['host1'] = 7
        summary = self.stats.summarize('host1')
        self.assertEqual(summary, {
            'ok': 1,
            'failures': 2,
            'unreachable': 3,
            'changed': 4,
            'skipped': 5,
            'rescued': 6,
            'ignored': 7
        })

    def test_set_custom_stats(self):
        self.stats.set_custom_stats('custom_stat', 10, 'host1')
        self.assertEqual(self.stats.custom['host1']['custom_stat'], 10)
        self.stats.set_custom_stats('custom_stat', 20, 'host1')
        self.assertEqual(self.stats.custom['host1']['custom_stat'], 20)

    def test_update_custom_stats(self):
        self.stats.set_custom_stats('custom_stat', 10, 'host1')
        self.stats.update_custom_stats('custom_stat', 5, 'host1')
        self.assertEqual(self.stats.custom['host1']['custom_stat'], 15)
        self.stats.update_custom_stats('custom_stat', 5)
        self.assertEqual(self.stats.custom['_run']['custom_stat'], 5)

    def test_update_custom_stats_with_merge(self):
        self.stats.set_custom_stats('custom_stat', {'key1': 'value1'}, 'host1')
        self.stats.update_custom_stats('custom_stat', {'key2': 'value2'}, 'host1')
        self.assertEqual(self.stats.custom['host1']['custom_stat'], {'key1': 'value1', 'key2': 'value2'})

    def test_update_custom_stats_with_type_mismatch(self):
        self.stats.set_custom_stats('custom_stat', 10, 'host1')
        result = self.stats.update_custom_stats('custom_stat', {'key': 'value'}, 'host1')
        self.assertIsNone(result)

if __name__ == '__main__':
    unittest.main()