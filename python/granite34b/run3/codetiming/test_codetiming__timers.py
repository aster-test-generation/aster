import statistics
import unittest
from codetiming._timers import Timers


class TestTimers(unittest.TestCase):
    def setUp(self):
        self.timers = Timers()

    def test_init(self):
        self.assertIsInstance(self.timers, Timers)
        self.assertIsInstance(self.timers.data, dict)
        self.assertIsInstance(self.timers._timings, dict)

    def test_add(self):
        self.timers.add('test', 1.2345)
        self.assertEqual(self.timers.data['test'], 1.2345)
        self.assertEqual(self.timers._timings['test'], [1.2345])

    def test_clear(self):
        self.timers.add('test', 1.2345)
        self.timers.clear()
        self.assertEqual(self.timers.data, {})
        self.assertEqual(self.timers._timings, {})

    def test_setitem(self):
        with self.assertRaises(TypeError):
            self.timers['test'] = 1.2345

    def test_apply(self):
        self.timers._timings['test'] = [1.2345, 2.3456, 3.4567]
        self.assertEqual(self.timers.apply(len, 'test'), 3)
        self.assertEqual(self.timers.apply(sum, 'test'), 7.0367999999999995)
        self.assertEqual(self.timers.apply(min, 'test'), 1.2345)
        self.assertEqual(self.timers.apply(max, 'test'), 3.4567)
        self.assertEqual(self.timers.apply(statistics.mean, 'test'), 2.3456)
        self.assertEqual(self.timers.apply(statistics.median, 'test'), 2.3456)
        self.assertEqual(self.timers.apply(statistics.stdev, 'test'), 0.9999999999999999)

    def test_count(self):
        self.timers._timings['test'] = [1.2345, 2.3456, 3.4567]
        self.assertEqual(self.timers.count('test'), 3)

    def test_total(self):
        self.timers._timings['test'] = [1.2345, 2.3456, 3.4567]
        self.assertEqual(self.timers.total('test'), 7.0367999999999995)

    def test_min(self):
        self.timers._timings['test'] = [1.2345, 2.3456, 3.4567]
        self.assertEqual(self.timers.min('test'), 1.2345)

    def test_max(self):
        self.timers._timings['test'] = [1.2345, 2.3456, 3.4567]
        self.assertEqual(self.timers.max('test'), 3.4567)

    def test_mean(self):
        self.timers._timings['test'] = [1.2345, 2.3456, 3.4567]
        self.assertEqual(self.timers.mean('test'), 2.3456)

    def test_median(self):
        self.timers._timings['test'] = [1.2345, 2.3456, 3.4567]
        self.assertEqual(self.timers.median('test'), 2.3456)

    def test_stdev(self):
        self.timers._timings['test'] = [1.2345, 2.3456, 3.4567]
        self.assertEqual(self.timers.stdev('test'), 1.1111000000000002)

class TestTimers(unittest.TestCase):
    def setUp(self):
        self.timers = Timers()

    def test_init(self):
        self.assertDictEqual(self.timers.data, {})
        self.assertDictEqual(self.timers._timings, {})

    def test_add(self):
        self.timers.add('test', 1.234)
        self.assertEqual(self.timers.data['test'], 1.234)
        self.assertListEqual(self.timers._timings['test'], [1.234])

    def test_clear(self):
        self.timers.add('test', 1.234)
        self.timers.clear()
        self.assertDictEqual(self.timers.data, {})
        self.assertDictEqual(self.timers._timings, {})

    def test_setitem(self):
        with self.assertRaises(TypeError):
            self.timers['test'] = 1.234

    def test_apply(self):
        self.timers.add('test', 1.234)
        self.assertEqual(self.timers.apply(len, 'test'), 1)
        self.assertEqual(self.timers.apply(sum, 'test'), 1.234)

    def test_count(self):
        self.assertEqual(self.timers.count('test'), 0)
        self.timers.add('test', 1.234)
        self.assertEqual(self.timers.count('test'), 1)

    def test_total(self):
        self.assertEqual(self.timers.total('test'), 0)
        self.timers.add('test', 1.234)
        self.assertEqual(self.timers.total('test'), 1.234)

    def test_min(self):
        self.assertEqual(self.timers.min('test'), 0)
        self.timers.add('test', 1.234)
        self.assertEqual(self.timers.min('test'), 1.234)

    def test_max(self):
        self.assertEqual(self.timers.max('test'), 0)
        self.timers.add('test', 1.234)
        self.assertEqual(self.timers.max('test'), 1.234)

    def test_mean(self):
        self.assertEqual(self.timers.mean('test'), 0)
        self.timers.add('test', 1.234)
        self.assertEqual(self.timers.mean('test'), 1.234)

    def test_median(self):
        self.assertEqual(self.timers.median('test'), 0)
        self.timers.add('test', 1.234)
        self.assertEqual(self.timers.median('test'), 1.234)

    def test_stdev(self):
        self.assertTrue(math.isnan(self.timers.stdev('test')))
        self.timers.add('test', 1.234)
        self.assertTrue(math.isnan(self.timers.stdev('test')))

if __name__ == '__main__':
    unittest.main()