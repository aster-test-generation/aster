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
        self.assertEqual(either.case(lambda x: x + 1, lambda x: x * 2), 2)

    def test_either_ap(self):
        either = Either(1)
        applicative = Either(lambda x: x + 1)
        self.assertEqual(either.ap(applicative), Either(2))

    def test_either_to_box(self):
        either = Either(1)
        self.assertEqual(either.to_box(), Box(1))

    def test_either_to_try(self):
        either = Either(1)
        self.assertEqual(either.to_try(), Try(1, is_success=True))

    def test_either_to_lazy(self):
        either = Either(1)
        self.assertEqual(either.to_lazy(), Lazy(lambda: 1))

    def test_either_is_right(self):
        either = Either(1)
        self.assertTrue(either.is_right())

class TestLeft(unittest.TestCase):
    def test_left_map(self):
        left = Left(1)
        self.assertEqual(left.map(lambda x: x + 1), Left(1))

    def test_left_bind(self):
        left = Left(1)
        self.assertEqual(left.bind(lambda x: x + 1), Left(1))

    def test_left_ap(self):
        left = Left(1)
        applicative = Left(lambda x: x + 1)
        self.assertEqual(left.ap(applicative), Left(1))

    def test_left_is_left(self):
        left = Left(1)
        self.assertTrue(left.is_left())

    def test_left_is_right(self):
        left = Left(1)
        self.assertFalse(left.is_right())

    def test_left_to_maybe(self):
        left = Left(1)
        self.assertEqual(left.to_maybe(), Maybe.nothing())

    def test_left_to_validation(self):
        left = Left(1)
        self.assertEqual(left.to_validation(), Validation.fail([1]))

class TestRight(unittest.TestCase):
    def test_right_map(self):
        right = Right(1)
        self.assertEqual(right.map(lambda x: x + 1), Right(2))

    def test_right_bind(self):
        right = Right(1)
        self.assertEqual(right.bind(lambda x: x + 1), Right(2))

    def test_right_is_right(self):
        right = Right(1)
        self.assertTrue(right.is_right())

    def test_right_is_left(self):
        right = Right(1)
        self.assertFalse(right.is_left())

    def test_right_to_maybe(self):
        right = Right(1)
        self.assertEqual(right.to_maybe(), Maybe.just(1))

    def test_right_to_validation(self):
        right = Right(1)
        self.assertEqual(right.to_validation(), Validation.success(1))

if __name__ == '__main__':
    unittest.main()