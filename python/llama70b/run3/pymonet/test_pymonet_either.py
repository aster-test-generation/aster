import unittest
from pymonet.either import Either, Left, Right


class TestEither(unittest.TestCase):
    def test_init(self):
        either = Either(42)
        self.assertEqual(either.value, 42)

    def test_eq(self):
        either1 = Either(42)
        either2 = Either(42)
        self.assertTrue(either1 == either2)

    def test_case(self):
        either = Either(42)
        result = either.case(lambda x: x + 1, lambda x: x * 2)
        self.assertEqual(result, 84)

    def test_ap(self):
        either = Either(42)
        applicative = Either(lambda x: x + 1)
        result = either.ap(applicative)
        self.assertEqual(result.value, 43)

    def test_to_box(self):
        either = Either(42)
        box = either.to_box()
        self.assertEqual(box.value, 42)

    def test_to_try(self):
        either = Either(42)
        try_ = either.to_try()
        self.assertEqual(try_.value, 42)

    def test_to_lazy(self):
        either = Either(42)
        lazy = either.to_lazy()
        self.assertEqual(lazy(), 42)

    def test_is_right(self):
        either = Either(42)
        self.assertTrue(either.is_right())

class TestLeft(unittest.TestCase):
    def test_init(self):
        left = Left(42)
        self.assertEqual(left.value, 42)

    def test_map(self):
        left = Left(42)
        result = left.map(lambda x: x + 1)
        self.assertEqual(result.value, 42)

    def test_bind(self):
        left = Left(42)
        result = left.bind(lambda x: x + 1)
        self.assertEqual(result.value, 42)

    def test_ap(self):
        left = Left(42)
        monad = Either(lambda x: x + 1)
        result = left.ap(monad)
        self.assertEqual(result.value, 42)

    def test_is_left(self):
        left = Left(42)
        self.assertTrue(left.is_left())

    def test_is_right(self):
        left = Left(42)
        self.assertFalse(left.is_right())

    def test_to_maybe(self):
        left = Left(42)
        maybe = left.to_maybe()
        self.assertIsNone(maybe.value)

    def test_to_validation(self):
        left = Left(42)
        validation = left.to_validation()
        self.assertEqual(validation.errors, [42])

class TestRight(unittest.TestCase):
    def test_init(self):
        right = Right(42)
        self.assertEqual(right.value, 42)

    def test_map(self):
        right = Right(42)
        result = right.map(lambda x: x + 1)
        self.assertEqual(result.value, 43)

    def test_bind(self):
        right = Right(42)
        result = right.bind(lambda x: x + 1)
        self.assertEqual(result, 43)

    def test_is_right(self):
        right = Right(42)
        self.assertTrue(right.is_right())

    def test_is_left(self):
        right = Right(42)
        self.assertFalse(right.is_left())

    def test_to_maybe(self):
        right = Right(42)
        maybe = right.to_maybe()
        self.assertEqual(maybe.value, 42)

    def test_to_validation(self):
        right = Right(42)
        validation = right.to_validation()
        self.assertEqual(validation.value, 42)

if __name__ == '__main__':
    unittest.main()