import unittest
from pymonet.either import Either, Left, Right


class TestEither(unittest.TestCase):
    def test_either_init(self):
        either = Either(1)
        self.assertEqual(either.value, 1)

    def test_either_eq(self):
        either1 = Either(1)
        either2 = Either(1)
        either3 = Either(2)
        self.assertEqual(either1, either2)
        self.assertNotEqual(either1, either3)

    def test_either_case(self):
        either = Either(1)
        self.assertEqual(either.case(lambda x: x + 1, lambda x: x - 1), 2)

    def test_either_ap(self):
        either = Either(1)
        self.assertEqual(either.ap(Either(lambda x: x + 1)), Either(3))

    def test_either_to_box(self):
        either = Either(1)
        self.assertEqual(either.to_box().value, 1)

    def test_either_to_try(self):
        either = Either(1)
        self.assertEqual(either.to_try().value, 1)
        either = Either(Exception("error"))
        self.assertFalse(either.to_try().is_success)

    def test_either_to_lazy(self):
        either = Either(1)
        self.assertEqual(either.to_lazy().value, 1)

    def test_either_is_right(self):
        either = Either(1)
        self.assertEqual(either.is_right(), True)
        either = Left(1)
        self.assertFalse(either.is_right())

    def test_either_is_left(self):
        either = Either(1)
        self.assertTrue(either.is_left())
        either = Left(1)
        self.assertTrue(either.is_left())

    def test_left_map(self):
        left = Left(1)
        self.assertEqual(left.map(lambda x: x + 1).value, 1)

    def test_left_bind(self):
        left = Left(1)
        self.assertEqual(left.bind(lambda x: Right(x + 1)).value, 1)

    def test_left_ap(self):
        left = Left(1)
        self.assertEqual(left.ap(Either(lambda x: x + 1)).value, 1)

    def test_left_to_maybe(self):
        left = Left(1)
        self.assertEqual(left.to_maybe().value, 1)

    def test_left_to_validation(self):
        left = Left(1)
        self.assertEqual(left.to_validation().value, [1])

    def test_right_map(self):
        right = Right(1)
        self.assertEqual(right.map(lambda x: x + 1).value, 2)

    def test_right_bind(self):
        right = Right(1)
        self.assertEqual(right.bind(lambda x: Right(x + 1)).value, 2)

    def test_right_to_maybe(self):
        right = Right(1)
        self.assertEqual(right.to_maybe().value, 1)

    def test_right_to_validation(self):
        right = Right(1)
        self.assertEqual(right.to_validation().value, 1)

class TestEither(unittest.TestCase):
    def test_either_init(self):
        either = Either(1)
        self.assertEqual(either.value, 1)

    def test_either_eq(self):
        either1 = Either(1)
        either2 = Either(1)
        either3 = Either(2)
        self.assertEqual(either1, either2)
        self.assertNotEqual(either1, either3)

    def test_either_case(self):
        either = Either(1)
        self.assertEqual(either.case(lambda x: x + 1, lambda x: x - 1), 0)

    def test_either_ap(self):
        either = Either(1)
        self.assertEqual(either.ap(Either(lambda x: x + 1)), Either(2))

    def test_either_to_box(self):
        either = Either(1)
        self.assertEqual(either.to_box().value, 1)

    def test_either_to_try(self):
        either = Either(1)
        self.assertEqual(either.to_try().value, 1)

    def test_either_to_lazy(self):
        either = Either(1)
        self.assertEqual(either.to_lazy().value, 1)

    def test_either_is_right(self):
        either = Either(1)
        self.assertTrue(either.is_right())

class TestLeft(unittest.TestCase):
    def test_left_map(self):
        left = Left(1)
        self.assertEqual(left.map(lambda x: x + 1).value, 1)

    def test_left_bind(self):
        left = Left(1)
        self.assertEqual(left.bind(lambda x: Right(x + 1)).value, 1)

    def test_left_ap(self):
        left = Left(1)
        self.assertEqual(left.ap(Either(lambda x: x + 1)).value, 1)

    def test_left_is_left(self):
        left = Left(1)
        self.assertTrue(left.is_left())

    def test_left_is_right(self):
        left = Left(1)
        self.assertFalse(left.is_right())

    def test_left_to_maybe(self):
        left = Left(1)
        self.assertEqual(left.to_maybe().value, None)

    def test_left_to_validation(self):
        left = Left(1)
        self.assertEqual(left.to_validation().value, [1])

class TestRight(unittest.TestCase):
    def test_right_map(self):
        right = Right(1)
        self.assertEqual(right.map(lambda x: x + 1).value, 2)

    def test_right_bind(self):
        right = Right(1)
        self.assertEqual(right.bind(lambda x: Right(x + 1)).value, 2)

    def test_right_is_right(self):
        right = Right(1)
        self.assertTrue(right.is_right())

    def test_right_is_left(self):
        right = Right(1)
        self.assertFalse(right.is_left())

    def test_right_to_maybe(self):
        right = Right(1)
        self.assertEqual(right.to_maybe().value, 1)

    def test_right_to_validation(self):
        right = Right(1)
        self.assertEqual(right.to_validation().value, 1)

if __name__ == '__main__':
    unittest.main()