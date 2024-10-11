import unittest
from pymonet.either import Either, Left, Right


class TestEither(unittest.TestCase):
    def test_either_init(self):
        either = Either(1)
        self.assertEqual(either.value, 1)

    def test_either_eq(self):
        either1 = Either(1)
        either2 = Either(1)
        self.assertEqual(either1, either2)

    def test_either_case(self):
        either = Either(1)
        result = either.case(lambda x: x + 1, lambda x: x - 1)
        self.assertEqual(result, 0)

    def test_either_ap(self):
        either = Either(1)
        applicative = Either(lambda x: x + 1)
        result = either.ap(applicative)
        self.assertEqual(result.value, 2)

    def test_either_to_box(self):
        either = Either(1)
        box = either.to_box()
        self.assertEqual(box.value, 1)

    def test_either_to_try(self):
        either = Either(1)
        try_ = either.to_try()
        self.assertEqual(try_.value, 1)
        self.assertTrue(try_.is_success)

    def test_either_to_lazy(self):
        either = Either(1)
        lazy = either.to_lazy()
        self.assertEqual(lazy.value, 1)

    def test_either_is_right(self):
        either = Either(1)
        self.assertTrue(either.is_right())

class TestLeft(unittest.TestCase):
    def test_left_map(self):
        left = Left(1)
        result = left.map(lambda x: x + 1)
        self.assertEqual(result.value, 1)

    def test_left_bind(self):
        left = Left(1)
        result = left.bind(lambda x: Right(x + 1))
        self.assertEqual(result.value, 1)

    def test_left_ap(self):
        left = Left(1)
        applicative = Left(lambda x: x + 1)
        result = left.ap(applicative)
        self.assertEqual(result.value, 1)

    def test_left_is_left(self):
        left = Left(1)
        self.assertTrue(left.is_left())

    def test_left_is_right(self):
        left = Left(1)
        self.assertFalse(left.is_right())

    def test_left_to_maybe(self):
        left = Left(1)
        maybe = left.to_maybe()
        self.assertEqual(maybe.value, None)

    def test_left_to_validation(self):
        left = Left(1)
        validation = left.to_validation()
        self.assertEqual(validation.value, [1])

class TestRight(unittest.TestCase):
    def test_right_map(self):
        right = Right(1)
        result = right.map(lambda x: x + 1)
        self.assertEqual(result.value, 2)

    def test_right_bind(self):
        right = Right(1)
        result = right.bind(lambda x: Right(x + 1))
        self.assertEqual(result.value, 2)

    def test_right_is_right(self):
        right = Right(1)
        self.assertTrue(right.is_right())

    def test_right_is_left(self):
        right = Right(1)
        self.assertFalse(right.is_left())

    def test_right_to_maybe(self):
        right = Right(1)
        maybe = right.to_maybe()
        self.assertEqual(maybe.value, 1)

    def test_right_to_validation(self):
        right = Right(1)
        validation = right.to_validation()
        self.assertEqual(validation.value, 1)

if __name__ == '__main__':
    unittest.main()