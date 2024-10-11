import unittest
from codetiming._timers import *


class TestTimers(unittest.TestCase):
    def test_add(self):
        instance = Timers()
        instance.add("test", 1)
        self.assertEqual(instance._timings["test"], [1])
        self.assertEqual(instance.data["test"], 1)

    def test_clear(self):
        instance = Timers()
        instance.add("test", 1)
        instance.clear()
        self.assertEqual(instance._timings, {})
        self.assertEqual(instance.data, {})

    def test_apply(self):
        instance = Timers()
        instance.add("test", 1)
        result = instance.apply(len, name="test")
        self.assertEqual(result, 1)

    def test_count(self):
        instance = Timers()
        instance.add("test", 1)
        result = instance.count("test")
        self.assertEqual(result, 1)

    def test_total(self):
        instance = Timers()
        instance.add("test", 1)
        result = instance.total("test")
        self.assertEqual(result, 1)

    def test_min(self):
        instance = Timers()
        instance.add("test", 1)
        result = instance.min("test")
        self.assertEqual(result, 1)

    def test_max(self):
        instance = Timers()
        instance.add("test", 1)
        result = instance.max("test")
        self.assertEqual(result, 1)

    def test_mean(self):
        instance = Timers()
        instance.add("test", 1)
        result = instance.mean("test")
        self.assertEqual(result, 1)

    def test_median(self):
        instance = Timers()
        instance.add("test", 1)
        result = instance.median("test")
        self.assertEqual(result, 1)

    def test_stdev(self):
        instance = Timers()
        instance.add("test", 1)
        result = instance.stdev("test")
        self.assertEqual(result, np.nan)


if __name__ == '__main__':
    unittest.main()