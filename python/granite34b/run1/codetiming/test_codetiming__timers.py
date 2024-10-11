import unittest
from codetiming._timers import Timers


class TestTimers(unittest.TestCase):
    def test_init(self):
        timers = Timers()
        self.assertIsInstance(timers, Timers)
        self.assertIsInstance(timers.data, dict)
        self.assertIsInstance(timers._timings, dict)

    def test_add(self):
        timers = Timers()
        timers.add('test', 1.23)
        self.assertEqual(timers.data['test'], 1.23)
        self.assertEqual(timers._timings['test'], [1.23])

    def test_clear(self):
        timers = Timers()
        timers.add('test', 1.23)
        timers.clear()
        self.assertEqual(timers.data, {})
        self.assertEqual(timers._timings, {})

    def test_setitem(self):
        timers = Timers()
        with self.assertRaises(TypeError):
            timers['test'] = 1.23

    def test_apply(self):
        timers = Timers()
        timers.add('test', 1.23)
        self.assertEqual(timers.apply(len, 'test'), 1)
        self.assertEqual(timers.apply(sum, 'test'), 1.23)

    def test_count(self):
        timers = Timers()
        timers.add('test', 1.23)
        self.assertEqual(timers.count('test'), 1)

    def test_total(self):
        timers = Timers()
        timers.add('test', 1.23)
        self.assertEqual(timers.total('test'), 1.23)

    def test_min(self):
        timers = Timers()
        timers.add('test', 1.23)
        self.assertEqual(timers.min('test'), 1.23)

    def test_max(self):
        timers = Timers()
        timers.add('test', 1.23)
        self.assertEqual(timers.max('test'), 1.23)

    def test_mean(self):
        timers = Timers()
        timers.add('test', 1.23)
        self.assertEqual(timers.mean('test'), 1.23)

    def test_median(self):
        timers = Timers()
        timers.add('test', 1.23)
        self.assertEqual(timers.median('test'), 1.23)

    def test_stdev(self):
        timers = Timers()
        timers.add('test', 1.23)
        self.assertEqual(timers.stdev('test'), 0.0)

class TestTimers(unittest.TestCase):
    def setUp(self):
        self.timers = Timers()

    def test_add(self):
        self.timers.add('test', 1.0)
        self.assertEqual(self.timers['test'], 1.0)

    def test_clear(self):
        self.timers.add('test', 1.0)
        self.timers.clear()
        self.assertEqual(self.timers['test'], 0.0)

    def test_setitem(self):
        with self.assertRaises(TypeError):
            self.timers['test'] = 1.0

    def test_count(self):
        self.assertEqual(self.timers.count('test'), 0)

    def test_total(self):
        self.assertEqual(self.timers.total('test'), 0)

    def test_min(self):
        self.assertEqual(self.timers.min('test'), 0)

    def test_max(self):
        self.assertEqual(self.timers.max('test'), 0)

    def test_mean(self):
        self.assertEqual(self.timers.mean('test'), 0)

    def test_median(self):
        self.assertEqual(self.timers.median('test'), 0)

    def test_stdev(self):
        self.assertTrue(math.isnan(self.timers.stdev('test')))

if __name__ == '__main__':
    unittest.main()