import math
import unittest
from codetiming._timers import Timers


class TestTimers(unittest.TestCase):
    def setUp(self):
        self.timers = Timers()

    def test_init(self):
        self.assertIsInstance(self.timers, Timers)
        self.assertEqual(self.timers._timings, {})

    def test_add(self):
        self.timers.add("test", 1.0)
        self.assertEqual(self.timers._timings["test"], [1.0])
        self.assertEqual(self.timers.data["test"], 1.0)

    def test_clear(self):
        self.timers.add("test", 1.0)
        self.timers.clear()
        self.assertEqual(self.timers._timings, {})
        self.assertEqual(self.timers.data, {})

    def test_setitem(self):
        with self.assertRaises(TypeError):
            self.timers["test"] = 1.0

    def test_apply(self):
        self.timers.add("test", 1.0)
        result = self.timers.apply(sum, "test")
        self.assertEqual(result, 1.0)

    def test_apply_key_error(self):
        with self.assertRaises(KeyError):
            self.timers.apply(sum, "nonexistent")

    def test_count(self):
        self.timers.add("test", 1.0)
        result = self.timers.count("test")
        self.assertEqual(result, 1)

    def test_total(self):
        self.timers.add("test", 1.0)
        self.timers.add("test", 2.0)
        result = self.timers.total("test")
        self.assertEqual(result, 3.0)

    def test_min(self):
        self.timers.add("test", 1.0)
        self.timers.add("test", 2.0)
        result = self.timers.min("test")
        self.assertEqual(result, 1.0)

    def test_max(self):
        self.timers.add("test", 1.0)
        self.timers.add("test", 2.0)
        result = self.timers.max("test")
        self.assertEqual(result, 2.0)

    def test_mean(self):
        self.timers.add("test", 1.0)
        self.timers.add("test", 2.0)
        result = self.timers.mean("test")
        self.assertEqual(result, 1.5)

    def test_median(self):
        self.timers.add("test", 1.0)
        self.timers.add("test", 2.0)
        result = self.timers.median("test")
        self.assertEqual(result, 1.5)

    def test_stdev(self):
        self.timers.add("test", 1.0)
        self.timers.add("test", 2.0)
        result = self.timers.stdev("test")
        self.assertAlmostEqual(result, 0.7071067811865476)

    def test_stdev_single_value(self):
        self.timers.add("test", 1.0)
        result = self.timers.stdev("test")
        self.assertTrue(math.isnan(result))

    def test_stdev_key_error(self):
        with self.assertRaises(KeyError):
            self.timers.stdev("nonexistent")

if __name__ == '__main__':
    unittest.main()