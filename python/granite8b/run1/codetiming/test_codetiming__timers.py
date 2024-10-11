import unittest
from codetiming._timers import Timers


class TestTimers(unittest.TestCase):
    def test_add(self):
        timers = Timers()
        timers.add('test', 1)
        self.assertEqual(timers.data['test'], 1)

    def test_clear(self):
        timers = Timers()
        timers.add('test', 1)
        timers.clear()
        self.assertEqual(timers.data, {})

    def test_setitem(self):
        timers = Timers()
        with self.assertRaises(TypeError):
            timers['test'] = 1

    def test_apply(self):
        timers = Timers()
        timers.add('test', 1)
        timers.add('test', 2)
        self.assertEqual(timers.apply(sum, 'test'), 3)

    def test_count(self):
        timers = Timers()
        timers.add('test', 1)
        timers.add('test', 2)
        self.assertEqual(timers.count('test'), 2)

    def test_total(self):
        timers = Timers()
        timers.add('test', 1)
        timers.add('test', 2)
        self.assertEqual(timers.total('test'), 3)

    def test_min(self):
        timers = Timers()
        timers.add('test', 1)
        timers.add('test', 2)
        self.assertEqual(timers.min('test'), 1)

    def test_max(self):
        timers = Timers()
        timers.add('test', 1)
        timers.add('test', 2)
        self.assertEqual(timers.max('test'), 2)

    def test_mean(self):
        timers = Timers()
        timers.add('test', 1)
        timers.add('test', 2)
        self.assertEqual(timers.mean('test'), 1.5)

    def test_median(self):
        timers = Timers()
        timers.add('test', 1)
        timers.add('test', 2)
        self.assertEqual(timers.median('test'), 1.5)

    def test_stdev(self):
        timers = Timers()
        timers.add('test', 1)
        timers.add('test', 2)
        self.assertEqual(timers.stdev('test'), 0.5)

if __name__ == '__main__':
    unittest.main()