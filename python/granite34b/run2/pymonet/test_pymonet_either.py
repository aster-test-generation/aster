import unittest
from pymonet.either import Left, Right


class TestEither(unittest.TestCase):
    def test_init(self):
        left = Left(1)
        right = Right(2)
        self.assertEqual(left.value, 1)
        self.assertEqual(right.value, 2)

    def test_eq(self):
        left1 = Left(1)
        left2 = Left(1)
        right1 = Right(2)
        right2 = Right(2)
        self.assertEqual(left1, left2)
        self.assertEqual(right1, right2)
        self.assertNotEqual(left1, right1)

    def test_case(self):
        left = Left(1)
        right = Right(2)
        self.assertEqual(left.case(lambda x: x + 1, lambda x: x - 1), 2)
        self.assertEqual(right.case(lambda x: x + 1, lambda x: x - 1), 1)

    def test_ap(self):
        left = Left(1)
        right = Right(2)
        self.assertEqual(left.ap(right).value, 1)
        self.assertEqual(right.ap(left).value, 1)
        self.assertEqual(right.ap(right).value, 4)

    def test_to_box(self):
        left = Left(1)
        right = Right(2)
        self.assertEqual(left.to_box().value, 1)
        self.assertEqual(right.to_box().value, 2)

    def test_to_try(self):
        left = Left(1)
        right = Right(2)
        self.assertEqual(left.to_try().value, 1)
        self.assertEqual(right.to_try().value, 2)

    def test_to_lazy(self):
        left = Left(1)
        right = Right(2)
        self.assertEqual(left.to_lazy().value, 1)
        self.assertEqual(right.to_lazy().value, 2)

    def test_is_right(self):
        left = Left(1)
        right = Right(2)
        self.assertFalse(left.is_right())
        self.assertTrue(right.is_right())

    def test_map(self):
        left = Left(1)
        right = Right(2)
        self.assertEqual(left.map(lambda x: x + 1).value, 1)
        self.assertEqual(right.map(lambda x: x + 1).value, 3)

    def test_bind(self):
        left = Left(1)
        right = Right(2)
        self.assertEqual(left.bind(lambda x: x + 1).value, 1)
        self.assertEqual(right.bind(lambda x: x + 1).value, 4)

    def test_ap(self):
        left = Left(1)
        right = Right(2)
        self.assertEqual(left.ap(right).value, 1)
        self.assertEqual(right.ap(left).value, 1)
        self.assertEqual(right.ap(right).value, 8)

    def test_is_left(self):
        left = Left(1)
        right = Right(2)
        self.assertTrue(left.is_left())
        self.assertFalse(right.is_left())

    def test_to_maybe(self):
        left = Left(1)
        right = Right(2)
        self.assertEqual(left.to_maybe(), Maybe.just(None))
        self.assertEqual(right.to_maybe(), 2)

    def test_to_validation(self):
        left = Left(1)
        right = Right(2)
        self.assertEqual(left.to_validation().value, 1)
        self.assertEqual(right.to_validation().value, 2)

if __name__ == '__main__':
    unittest.main()