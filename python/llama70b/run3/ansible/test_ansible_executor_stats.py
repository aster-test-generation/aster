import unittest
from ansible.executor.stats import AggregateStats, MutableMapping


class TestAggregateStats(unittest.TestCase):
    def test_init(self):
        instance = AggregateStats()
        self.assertIsInstance(instance.processed, dict)
        self.assertIsInstance(instance.failures, dict)
        self.assertIsInstance(instance.ok, dict)
        self.assertIsInstance(instance.dark, dict)
        self.assertIsInstance(instance.changed, dict)
        self.assertIsInstance(instance.skipped, dict)
        self.assertIsInstance(instance.rescued, dict)
        self.assertIsInstance(instance.ignored, dict)
        self.assertIsInstance(instance.custom, dict)

    def test_increment(self):
        instance = AggregateStats()
        instance.increment('ok', 'host1')
        self.assertEqual(instance.ok.get('host1', 0), 1)
        self.assertEqual(instance.processed.get('host1', 0), 1)

    def test_decrement(self):
        instance = AggregateStats()
        instance.increment('ok', 'host1')
        instance.decrement('ok', 'host1')
        self.assertEqual(instance.ok.get('host1', 0), 0)

    def test_summarize(self):
        instance = AggregateStats()
        instance.increment('ok', 'host1')
        instance.increment('failures', 'host1')
        result = instance.summarize('host1')
        self.assertEqual(result, {'ok': 1, 'failures': 1, 'unreachable': 0, 'changed': 0, 'skipped': 0, 'rescued': 0, 'ignored': 0})

    def test_set_custom_stats(self):
        instance = AggregateStats()
        instance.set_custom_stats('custom_stat', 'value', 'host1')
        self.assertEqual(instance.custom.get('host1', {}).get('custom_stat'), 'value')

    def test_update_custom_stats(self):
        instance = AggregateStats()
        instance.set_custom_stats('custom_stat', {'a': 1}, 'host1')
        instance.update_custom_stats('custom_stat', {'b': 2}, 'host1')
        self.assertEqual(instance.custom.get('host1', {}).get('custom_stat'), {'a': 1, 'b': 2})

    def test_private_method(self):
        instance = AggregateStats()
        result = instance._AggregateStats__private_method()  # no private methods in this class
        self.assertIsNone(result)  # or assertRaises( AttributeError )

    def test_protected_method(self):
        instance = AggregateStats()
        # no protected methods in this class
        self.assertRaises(AttributeError, getattr, instance, '_protected_method')

    def test_str_method(self):
        instance = AggregateStats()
        result = instance.__str__()
        self.assertIsInstance(result, str)

    def test_repr_method(self):
        instance = AggregateStats()
        result = instance.__repr__()
        self.assertIsInstance(result, str)

    def test_eq_method(self):
        instance1 = AggregateStats()
        instance2 = AggregateStats()
        self.assertEqual(instance1, instance2)

if __name__ == '__main__':
    unittest.main()