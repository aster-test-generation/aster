import unittest
from codetiming._timers import Timers

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