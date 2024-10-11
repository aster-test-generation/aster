import unittest
from unittest import TestCase
from pymonet.maybe import Maybe


class TestMaybe(TestCase):
    def test_init(self):
        m = Maybe(5, False)
        self.assertEqual(m.value, 5)
        self.assertFalse(m.is_nothing)

    def test_eq(self):
        m1 = Maybe(5, False)
        m2 = Maybe(5, False)
        m3 = Maybe(6, False)
        m4 = Maybe(5, True)
        m5 = Maybe(6, True)
        self.assertEqual(m1, m2)
        self.assertNotEqual(m1, m3)
        self.assertNotEqual(m1, m4)
        self.assertNotEqual(m4.value, m5.value)

    def test_just(self):
        m = Maybe.just(5)
        self.assertEqual(m.value, 5)
        self.assertFalse(m.is_nothing)

    def test_nothing(self):
        m = Maybe.nothing()
        self.assertIsNone(m.value)
        self.assertTrue(m.is_nothing)

    def test_map(self):
        m = Maybe.just(5)
        m2 = m.map(lambda x: x + 1)
        self.assertEqual(m2.value, 6)
        self.assertFalse(m2.is_nothing)
        m3 = m.map(lambda x: x + 2)
        self.assertEqual(m3.value, 7)
        self.assertFalse(m3.is_nothing)
        m4 = Maybe.nothing().map(lambda x: x + 1)
        self.assertIsNone(m4)
        self.assertTrue(m4.is_nothing)

    def test_bind(self):
        m = Maybe.just(5)
        m2 = m.bind(lambda x: Maybe.just(x + 1))
        self.assertEqual(m2.value, 6)
        self.assertFalse(m2.is_nothing)
        m3 = m.bind(lambda x: Maybe.just(x + 2))
        self.assertEqual(m3.value, 7)
        self.assertFalse(m3.is_nothing)
        m4 = Maybe.nothing().bind(lambda x: Maybe.just(x + 1))
        self.assertIsNone(m4)
        self.assertTrue(m4.is_nothing)

    def test_ap(self):
        m = Maybe.just(5)
        m2 = Maybe.just(lambda x: x + 1)
        m3 = m2.ap(m)
        self.assertEqual(m3.value, 6)
        self.assertFalse(m3.is_nothing)
        m4 = Maybe.just(lambda x: x + 2)
        m5 = m.ap(m4)
        self.assertEqual(m5.value, 7)
        self.assertFalse(m5.is_nothing)
        m6 = Maybe.nothing().ap(m2)
        self.assertIsNone(m6.value)
        self.assertTrue(m6.is_nothing)
        m7 = Maybe.just(lambda x: x + 1)
        m8 = Maybe.nothing().ap(m7)
        self.assertIsNone(m8.value)
        self.assertTrue(m8.is_nothing)

    def test_filter(self):
        m = Maybe.just(5)
        m2 = m.filter(lambda x: x > 4)
        self.assertEqual(m2.value, 5)
        self.assertFalse(m2.is_nothing)
        m3 = m.filter(lambda x: x > 5)
        self.assertIsNone(m3)
        self.assertTrue(m3.is_nothing)
        m4 = Maybe.nothing().filter(lambda x: x > 4)
        self.assertIsNone(m4.value)
        self.assertTrue(m4.is_nothing)

    def test_get_or_else(self):
        m = Maybe.just(5)
        self.assertEqual(m.get_or_else(10), 5)
        m2 = Maybe.nothing()
        self.assertEqual(m2.get_or_else(10), 10)


def test_just():
    assert Maybe.just(1).value == 1
    assert Maybe.just(1).is_nothing == False

def test_nothing():
    assert Maybe.nothing().value is None
    assert Maybe.nothing().is_nothing == True

def test_map():
    assert Maybe.just(1).map(lambda x: x + 1).value == 2
    assert Maybe.just(1).map(lambda x: x + 1).is_nothing == False
    assert Maybe.nothing().map(lambda x: x + 1).is_nothing == True

def test_bind():
    assert Maybe.just(1).bind(lambda x: Maybe.just(x + 1)).value == 2
    assert Maybe.just(1).bind(lambda x: Maybe.just(x + 1)).is_nothing == False
    assert Maybe.nothing().bind(lambda x: Maybe.just(x + 1)).is_nothing == True

def test_ap():
    assert Maybe.just(1).ap(Maybe.just(lambda x: x + 1)).value == 2
    assert Maybe.just(1).ap(Maybe.just(lambda x: x + 1)).is_nothing == False
    assert Maybe.nothing().ap(Maybe.just(lambda x: x + 1)).is_nothing == True

def test_filter():
    assert Maybe.just(1).filter(lambda x: x > 0).value == 1
    assert Maybe.just(1).filter(lambda x: x > 0).is_nothing == False
    assert Maybe.just(1).filter(lambda x: x < 0).is_nothing == True
    assert Maybe.nothing().filter(lambda x: x > 0).is_nothing == True

def test_get_or_else():
    assert Maybe.just(1).get_or_else(0) == 1
    assert Maybe.nothing().get_or_else(0) == 0

def test_to_either():
    from pymonet.either import Left, Right
    assert Maybe.just(1).to_either() == Right(1)
    assert Maybe.nothing().to_either() == Left(None)

def test_to_box():
    from pymonet.box import Box
    assert Maybe.just(1).to_box().value == 1
    assert Maybe.nothing().to_box().value is None

def test_to_lazy():
    from pymonet.lazy import Lazy
    assert Maybe.just(1).to_lazy().value == 1
    assert Maybe.nothing().to_lazy().value is None

def test_to_try():
    from pymonet.monad_try import Try
    assert Maybe.just(1).to_try().value == 1
    assert Maybe.just(1).to_try().is_success == True
    assert Maybe.nothing().to_try().is_success == False

if __name__ == '__main__':
    unittest.main()