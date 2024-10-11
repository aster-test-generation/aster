import unittest
from codetiming._timers import Timers


class TestTimers(unittest.TestCase):
    def test_init(self):
        timers = Timers()
        self.assertIsInstance(timers, Timers)

    def test_add(self):
        timers = Timers()
        timers.add("test", 1.0)
        self.assertIn("test", timers.data)
        self.assertEqual(timers.data["test"], 1.0)

    def test_clear(self):
        timers = Timers()
        timers.add("test", 1.0)
        timers.clear()
        self.assertEqual(timers.data, {})

    def test_setitem(self):
        timers = Timers()
        with self.assertRaises(TypeError):
            timers["test"] = 1.0

    def test_apply(self):
        timers = Timers()
        timers.add("test", 1.0)
        timers.add("test", 2.0)
        result = timers.apply(sum, "test")
        self.assertEqual(result, 3.0)

    def test_count(self):
        timers = Timers()
        timers.add("test", 1.0)
        timers.add("test", 2.0)
        result = timers.count("test")
        self.assertEqual(result, 2)

    def test_total(self):
        timers = Timers()
        timers.add("test", 1.0)
        timers.add("test", 2.0)
        result = timers.total("test")
        self.assertEqual(result, 3.0)

    def test_min(self):
        timers = Timers()
        timers.add("test", 1.0)
        timers.add("test", 2.0)
        result = timers.min("test")
        self.assertEqual(result, 1.0)

    def test_max(self):
        timers = Timers()
        timers.add("test", 1.0)
        timers.add("test", 2.0)
        result = timers.max("test")
        self.assertEqual(result, 2.0)

    def test_mean(self):
        timers = Timers()
        timers.add("test", 1.0)
        timers.add("test", 2.0)
        result = timers.mean("test")
        self.assertEqual(result, 1.5)

    def test_median(self):
        timers = Timers()
        timers.add("test", 1.0)
        timers.add("test", 2.0)
        result = timers.median("test")
        self.assertEqual(result, 1.5)

    def test_stdev(self):
        timers = Timers()
        timers.add("test", 1.0)
        timers.add("test", 2.0)
        result = timers.stdev("test")
        self.assertAlmostEqual(result, 0.7071067811865475)

    def test_str(self):
        timers = Timers()
        result = str(timers)
        self.assertEqual(result, "Timers({})")

    def test_repr(self):
        timers = Timers()
        result = repr(timers)
        self.assertEqual(result, "Timers({})")

    def test_eq(self):
        timers1 = Timers()
        timers2 = Timers()
        self.assertEqual(timers1, timers2)

    def test_private_method(self):
        timers = Timers()
        result = timers._Timers__init__([])  # private method
        self.assertIsNone(result)

if __name__ == '__main__':
    unittest.main()