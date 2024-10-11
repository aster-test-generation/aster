import unittest
from pymonet.maybe import Maybe


class TestMaybe(unittest.TestCase):
    def test_init(self):
        m = Maybe(1, False)
        self.assertEqual(m.value, 1)
        self.assertFalse(m.is_nothing)

    def test_eq(self):
        m1 = Maybe(1, False)
        m2 = Maybe(1, False)
        m3 = Maybe(2, False)
        m4 = Maybe(1, True)
        m5 = Maybe(2, True)
        self.assertEqual(m1, m2)
        self.assertNotEqual(m1, m3)
        self.assertNotEqual(m1, m4)
        self.assertNotEqual(m4, m6)

    def test_just(self):
        m = Maybe.just(1)
        self.assertEqual(m.value, 1)
        self.assertFalse(m.is_nothing)

    def test_nothing(self):
        m = Maybe.nothing()
        self.assertIsNone(m.value)
        self.assertTrue(m.is_nothing)

    def test_map(self):
        m = Maybe.just(1)
        m2 = m.map(lambda x: x + 1)
        self.assertEqual(m2.value, 2)
        self.assertFalse(m2.is_nothing)

    def test_bind(self):
        m = Maybe.just(1)
        m2 = m.bind(lambda x: Maybe.just(x + 1))
        self.assertEqual(m2.value, 2)
        self.assertFalse(m2.is_nothing)

    def test_ap(self):
        m = Maybe.just(lambda x: x + 1)
        m2 = Maybe.just(1)
        m3 = m.ap(m2)
        self.assertEqual(m3.value, 2)
        self.assertFalse(m3.is_nothing)

    def test_filter(self):
        m = Maybe.just(1)
        m2 = m.filter(lambda x: x > 0)
        self.assertEqual(m2.value, 1)
        self.assertFalse(m2.is_nothing)

    def test_get_or_else(self):
        m = Maybe.just(1)
        m2 = m.get_or_else(0)
        self.assertEqual(m2, 1)

    def test_to_either(self):
        m = Maybe.just(1)
        e = m.to_either()
        self.assertEqual(e.value, 1)

    def test_to_box(self):
        m = Maybe.just(1)
        b = m.to_box()
        self.assertEqual(b.value, 1)

    def test_to_lazy(self):
        m = Maybe.just(1)
        l = m.to_lazy()
        self.assertEqual(l.value, 1)

    def test_to_try(self):
        m = Maybe.just(1)
        t = m.to_try()
        self.assertEqual(t.value, 1)

    def test_to_validation(self):
        m = Maybe.just(1)
        v = m.to_validation()
        self.assertEqual(v.value, 1)

class TestMaybe(unittest.TestCase):
    def test_just(self):
        maybe = Maybe.just(5)
        self.assertEqual(maybe.value, 5)
        self.assertFalse(maybe.is_nothing)

    def test_nothing(self):
        maybe = Maybe.nothing()
        self.assertTrue(maybe.is_nothing)

    def test_map(self):
        maybe = Maybe.just(5)
        result = maybe.map(lambda x: x * 2)
        self.assertEqual(result.value, 10)
        self.assertFalse(result.is_nothing)

        maybe = Maybe.nothing()
        result = maybe.map(lambda x: x * 2)
        self.assertTrue(result.is_nothing)

    def test_bind(self):
        maybe = Maybe.just(5)
        result = maybe.bind(lambda x: Maybe.just(x * 2))
        self.assertEqual(result.value, 10)
        self.assertFalse(result.is_nothing)

        maybe = Maybe.nothing()
        result = maybe.bind(lambda x: Maybe.just(x * 2))
        self.assertTrue(result.is_nothing)

    def test_ap(self):
        maybe = Maybe.just(lambda x: x * 2)
        applicative = Maybe.just(5)
        result = maybe.ap(applicative)
        self.assertEqual(result.value, 10)
        self.assertFalse(result.is_nothing)

        maybe = Maybe.nothing()
        applicative = Maybe.just(5)
        result = maybe.ap(applicative)
        self.assertTrue(result.is_nothing)

    def test_filter(self):
        maybe = Maybe.just(5)
        result = maybe.filter(lambda x: x > 3)
        self.assertEqual(result.value, 5)
        self.assertFalse(result.is_nothing)

        maybe = Maybe.just(2)
        result = maybe.filter(lambda x: x > 3)
        self.assertTrue(result.is_nothing)

        maybe = Maybe.nothing()
        result = maybe.filter(lambda x: x > 3)
        self.assertTrue(result.is_nothing)

    def test_get_or_else(self):
        maybe = Maybe.just(5)
        result = maybe.get_or_else(10)
        self.assertEqual(result, 5)

        maybe = Maybe.nothing()
        result = maybe.get_or_else(10)
        self.assertEqual(result, 10)

    def test_to_either(self):
        maybe = Maybe.just(5)
        result = maybe.to_either()
        self.assertEqual(result.value, 5)

        maybe = Maybe.nothing()
        result = maybe.to_either()
        self.assertEqual(result.value, None)

    def test_to_box(self):
        maybe = Maybe.just(5)
        result = maybe.to_box()
        self.assertEqual(result.value, 5)

        maybe = Maybe.nothing()
        result = maybe.to_box()
        self.assertEqual(result.value, None)

    def test_to_lazy(self):
        maybe = Maybe.just(5)
        result = maybe.to_lazy()
        self.assertEqual(result.value, 5)

        maybe = Maybe.nothing()
        result = maybe.to_lazy()
        self.assertEqual(result.value, None)

    def test_to_try(self):
        maybe = Maybe.just(5)
        result = maybe.to_try()
        self.assertEqual(result.value, 5)
        self.assertTrue(result.is_success)

        maybe = Maybe.nothing()
        result = maybe.to_try()
        self.assertEqual(result.value, None)
        self.assertFalse(result.is_success)

    def test_to_validation(self):
        maybe = Maybe.just(5)
        result = maybe.to_validation()
        self.assertEqual(result.value, 5)

        maybe = Maybe.nothing()
        result = maybe.to_validation()
        self.assertEqual(result.value, None)

if __name__ == '__main__':
    unittest.main()