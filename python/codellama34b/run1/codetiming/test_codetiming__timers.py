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
        self.assertEqual(instance.apply(len, name="test"), 1)
        self.assertEqual(instance.apply(sum, name="test"), 1)
        self.assertEqual(instance.apply(lambda values: min(values or [0]), name="test"), 1)
        self.assertEqual(instance.apply(lambda values: max(values or [0]), name="test"), 1)
        self.assertEqual(instance.apply(lambda values: statistics.mean(values or [0]), name="test"), 1)
        self.assertEqual(instance.apply(lambda values: statistics.median(values or [0]), name="test"), 1)
        self.assertEqual(instance.apply(lambda values: statistics.stdev(values), name="test"), 0)

    def test_count(self):
        instance = Timers()
        instance.add("test", 1)
        self.assertEqual(instance.count("test"), 1)

    def test_total(self):
        instance = Timers()
        instance.add("test", 1)
        self.assertEqual(instance.total("test"), 1)

    def test_min(self):
        instance = Timers()
        instance.add("test", 1)
        self.assertEqual(instance.min("test"), 1)

    def test_max(self):
        instance = Timers()
        instance.add("test", 1)
        self.assertEqual(instance.max("test"), 1)

    def test_mean(self):
        instance = Timers()
        instance.add("test", 1)
        self.assertEqual(instance.mean("test"), 1)

    def test_median(self):
        instance = Timers()
        instance.add("test", 1)
        self.assertEqual(instance.median("test"), 1)

    def test_stdev(self):
        instance = Timers()
        instance.add("test", 1)
        self.assertEqual(instance.stdev("test"), 0)


if __name__ == '__main__':
    unittest.main()