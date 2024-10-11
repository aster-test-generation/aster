import unittest
from unittest import TestCase
from pymonet.monad_try import Try


class MonadTryTest(TestCase):
    def test_init(self):
        t = Try(1, True)
        self.assertEqual(t.value, 1)
        self.assertTrue(t.is_success)

    def test_eq(self):
        t1 = Try(1, True)
        t2 = Try(1, True)
        t3 = Try(2, True)
        t4 = Try(1, False)
        self.assertEqual(t1, t2)
        self.assertNotEqual(t1, t3)
        self.assertNotEqual(t1, t4)

    def test_str(self):
        t1 = Try(1, True)
        t2 = Try(2, False)
        self.assertEqual(str(t1), "Try[value=1, is_success=True]")
        self.assertEqual(str(t2), "Try[value=2, is_success=False]")

    def test_of(self):
        t1 = Try.of(lambda x: x + 1, 1)
        t2 = Try.of(lambda x: x / 0, 1)
        self.assertEqual(t1.value, 2)
        self.assertTrue(t1.is_success)
        self.assertEqual(t2.value.args[0], "division by zero")
        self.assertFalse(t2.is_success)

    def test_map(self):
        t1 = Try(1, True)
        t2 = Try(2, False)
        t3 = t1.map(lambda x: x + 1)
        t4 = t2.map(lambda x: x + 1)
        self.assertEqual(t3.value, 2)
        self.assertTrue(t3.is_success)
        self.assertEqual(t4.value, 2)
        self.assertFalse(t4.is_success)

    def test_bind(self):
        t1 = Try(1, True)
        t2 = Try(2, False)
        t3 = t1.bind(lambda x: Try(x + 1, True))
        t4 = t2.bind(lambda x: Try(x + 1, True))
        self.assertEqual(t3.value, 2)
        self.assertTrue(t3.is_success)
        self.assertEqual(t4.value, 2)
        self.assertFalse(t4.is_success)

    def test_on_success(self):
        t1 = Try(1, True)
        t2 = Try(2, False)
        t1.on_success(lambda x: self.assertEqual(x, 1))
        t2.on_success(lambda x: self.fail("Callback should not be called"))

    def test_on_fail(self):
        t1 = Try(1, True)
        t2 = Try(2, False)
        t1.on_fail(lambda x: self.fail("Callback should not be called"))
        t2.on_fail(lambda x: self.assertEqual(x, 2))

    def test_filter(self):
        t1 = Try(1, True)
        t2 = Try(2, False)
        t3 = t1.filter(lambda x: x > 0)
        t4 = t2.filter(lambda x: x > 0)
        t5 = t1.filter(lambda x: x < 0)
        self.assertEqual(t3.value, 1)
        self.assertTrue(t3.is_success)
        self.assertEqual(t4.value, 2)
        self.assertFalse(t4.is_success)
        self.assertEqual(t5.value, 1)
        self.assertFalse(t5.is_success)

    def test_get(self):
        t1 = Try(1, True)
        t2 = Try(2, False)
        self.assertEqual(t1.get(), 1)
        self.assertRaises(Exception, t2.get)

    def test_get_or_else(self):
        t1 = Try(1, True)
        t2 = Try(2, False)
        self.assertEqual(t1.get_or_else(0), 1)
        self.assertEqual(t2.get_or_else(0), 0)

if __name__ == '__main__':
    unittest.main()