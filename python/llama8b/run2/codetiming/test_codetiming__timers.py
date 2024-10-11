import statistics
import collections
import unittest
from codetiming._timers import Timers


class TestTimers(unittest.TestCase):
    def test_init(self):
        timers = Timers()
        self.assertIsInstance(timers, Timers)
        self.assertIsInstance(timers.data, dict)
        self.assertIsInstance(timers._timings, collections.defaultdict)

    def test_add(self):
        timers = Timers()
        timers.add('test', 1.0)
        self.assertIn('test', timers.data)
        self.assertEqual(timers.data['test'], 1.0)
        timers.add('test', 2.0)
        self.assertEqual(timers.data['test'], 3.0)

    def test_clear(self):
        timers = Timers()
        timers.add('test', 1.0)
        timers.clear()
        self.assertNotIn('test', timers.data)

    def test_setitem(self):
        timers = Timers()
        with self.assertRaises(TypeError):
            timers['test'] = 1.0

    def test_apply(self):
        timers = Timers()
        timers.add('test', 1.0)
        timers.add('test', 2.0)
        self.assertEqual(timers.apply(len, 'test'), 2)
        self.assertEqual(timers.apply(sum, 'test'), 3)
        self.assertEqual(timers.apply(lambda values: min(values or [0]), 'test'), 1.0)
        self.assertEqual(timers.apply(lambda values: max(values or [0]), 'test'), 2.0)
        self.assertAlmostEqual(timers.apply(lambda values: statistics.mean(values or [0]), 'test'), 1.5)
        self.assertEqual(timers.apply(lambda values: statistics.median(values or [0]), 'test'), 1.0)
        with self.assertRaises(KeyError):
            timers.apply(len, 'nonexistent')

    def test_count(self):
        timers = Timers()
        timers.add('test', 1.0)
        timers.add('test', 2.0)
        self.assertEqual(timers.count('test'), 2)

    def test_total(self):
        timers = Timers()
        timers.add('test', 1.0)
        timers.add('test', 2.0)
        self.assertEqual(timers.total('test'), 3)

    def test_min(self):
        timers = Timers()
        timers.add('test', 1.0)
        timers.add('test', 2.0)
        self.assertEqual(timers.min('test'), 1.0)

    def test_max(self):
        timers = Timers()
        timers.add('test', 1.0)
        timers.add('test', 2.0)
        self.assertEqual(timers.max('test'), 2.0)

    def test_mean(self):
        timers = Timers()
        timers.add('test', 1.0)
        timers.add('test', 2.0)
        self.assertAlmostEqual(timers.mean('test'), 1.5)

    def test_median(self):
        timers = Timers()
        timers.add('test', 1.0)
        timers.add('test', 2.0)
        self.assertEqual(timers.median('test'), 1.0)

    def test_stdev(self):
        timers = Timers()
        timers.add('test', 1.0)
        timers.add('test', 2.0)
        self.assertAlmostEqual(timers.stdev('test'), 0.5)

    def test_str(self):
        timers = Timers()
        self.assertEqual(str(timers), 'Timers({})'.format(timers.data))

    def test_repr(self):
        timers = Timers()
        self.assertEqual(repr(timers), 'Timers({})'.format(timers.data))

    def test_eq(self):
        timers1 = Timers()
        timers2 = Timers()
        self.assertEqual(timers1, timers2)
        timers1.add('test', 1.0)
        self.assertNotEqual(timers1, timers2)
        timers2.add('test', 1.0)
        self.assertEqual(timers1, timers2)

class TestTimers(unittest.TestCase):
    def test_init(self):
        timers = Timers()
        self.assertIsInstance(timers, Timers)
        self.assertIsInstance(timers.data, dict)
        self.assertIsInstance(timers._timings, collections.defaultdict)

    def test_add(self):
        timers = Timers()
        timers.add('test', 1.0)
        self.assertEqual(timers.data['test'], 1.0)
        self.assertEqual(len(timers._timings['test']), 1)

    def test_clear(self):
        timers = Timers()
        timers.add('test', 1.0)
        timers.clear()
        self.assertEqual(timers.data, {})
        self.assertEqual(timers._timings, collections.defaultdict(list))

    def test_setitem(self):
        timers = Timers()
        with self.assertRaises(TypeError):
            timers['test'] = 1.0

    def test_apply(self):
        timers = Timers()
        timers.add('test', 1.0)
        self.assertEqual(timers.apply(len, 'test'), 1)
        self.assertEqual(timers.apply(sum, 'test'), 1)
        self.assertEqual(timers.apply(min, 'test'), 1)
        self.assertEqual(timers.apply(max, 'test'), 1)
        self.assertAlmostEqual(timers.apply(statistics.mean, 'test'), 1)
        self.assertEqual(timers.apply(statistics.median, 'test'), 1)
        self.assertAlmostEqual(timers.apply(statistics.stdev, 'test'), 0)

    def test_count(self):
        timers = Timers()
        timers.add('test', 1.0)
        self.assertEqual(timers.count('test'), 1)

    def test_total(self):
        timers = Timers()
        timers.add('test', 1.0)
        self.assertEqual(timers.total('test'), 1)

    def test_min(self):
        timers = Timers()
        timers.add('test', 1.0)
        self.assertEqual(timers.min('test'), 1)

    def test_max(self):
        timers = Timers()
        timers.add('test', 1.0)
        self.assertEqual(timers.max('test'), 1)

    def test_mean(self):
        timers = Timers()
        timers.add('test', 1.0)
        self.assertAlmostEqual(timers.mean('test'), 1)

    def test_median(self):
        timers = Timers()
        timers.add('test', 1.0)
        self.assertEqual(timers.median('test'), 1)

    def test_stdev(self):
        timers = Timers()
        timers.add('test', 1.0)
        self.assertAlmostEqual(timers.stdev('test'), 0)

    def test_non_existent_name(self):
        timers = Timers()
        with self.assertRaises(KeyError):
            timers.apply(len, 'non_existent_name')

if __name__ == '__main__':
    unittest.main()