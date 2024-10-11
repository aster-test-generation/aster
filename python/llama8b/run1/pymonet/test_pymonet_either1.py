import unittest
from pymonet.either import Either, Left, Right

class TestEither(unittest.TestCase):
    def test_init(self):
        either = Either(1)
        self.assertEqual(either.value, 1)

    def test_eq(self):
        left = Left(1)
        right = Right(1)
        self.assertTrue(left == left)
        self.assertFalse(left == right)

    def test_case(self):
        left = Left(1)
        right = Right(2)
        result = left.case(lambda x: x, lambda x: x)
        self.assertEqual(result, 1)
        result = right.case(lambda x: x, lambda x: x)
        self.assertEqual(result, 2)

    def test_ap(self):
        right = Right(2)
        applicative = lambda x: x * 2
        result = right.ap(applicative)
        self.assertEqual(result.value, 4)

    def test_to_box(self):
        right = Right(2)
        box = right.to_box()
        self.assertEqual(box.value, 2)

    def test_to_try(self):
        right = Right(2)
        try_ = right.to_try()
        self.assertEqual(try_.value, 2)

    def test_to_lazy(self):
        right = Right(2)
        lazy = right.to_lazy()
        self.assertEqual(lazy.value(), 2)

    def test_is_right(self):
        right = Right(2)
        self.assertTrue(right.is_right())
        left = Left(1)
        self.assertFalse(left.is_right())

    def test_is_left(self):
        left = Left(1)
        self.assertTrue(left.is_left())
        right = Right(2)
        self.assertFalse(right.is_left())

    def test_to_maybe(self):
        right = Right(2)
        maybe = right.to_maybe()
        self.assertEqual(maybe.value, 2)

    def test_to_validation(self):
        right = Right(2)
        validation = right.to_validation()
        self.assertEqual(validation.value, 2)

class TestLeft(unittest.TestCase):
    def test_map(self):
        left = Left(1)
        result = left.map(lambda x: x * 2)
        self.assertEqual(result.value, 1)

    def test_bind(self):
        left = Left(1)
        result = left.bind(lambda x: x * 2)
        self.assertEqual(result.value, 1)

    def test_ap(self):
        left = Left(1)
        applicative = lambda x: x * 2
        result = left.ap(applicative)
        self.assertEqual(result.value, 1)

    def test_is_left(self):
        left = Left(1)
        self.assertTrue(left.is_left())

    def test_is_right(self):
        left = Left(1)
        self.assertFalse(left.is_right())

    def test_to_maybe(self):
        left = Left(1)
        maybe = left.to_maybe()
        self.assertEqual(maybe.value, None)

    def test_to_validation(self):
        left = Left(1)
        validation = left.to_validation()
        self.assertEqual(validation.value, [1])

class TestRight(unittest.TestCase):
    def test_map(self):
        right = Right(2)
        result = right.map(lambda x: x * 2)
        self.assertEqual(result.value, 4)

    def test_bind(self):
        right = Right(2)
        result = right.bind(lambda x: x * 2)
        self.assertEqual(result, 4)

    def test_is_right(self):
        right = Right(2)
        self.assertTrue(right.is_right())

    def test_is_left(self):
        right = Right(2)
        self.assertFalse(right.is_left())

    def test_to_maybe(self):
        right = Right(2)
        maybe = right.to_maybe()
        self.assertEqual(maybe.value, 2)

    def test_to_validation(self):
        right = Right(2)
        validation = right.to_validation()
        self.assertEqual(validation.value, 2)

if __name__ == '__main__':
    unittest.main()