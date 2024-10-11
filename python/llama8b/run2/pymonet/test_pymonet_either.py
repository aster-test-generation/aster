import unittest
from pymonet.either import Either, Left, Right


class TestEither(unittest.TestCase):
    def test_init(self):
        either = Either(1)
        self.assertEqual(either.value, 1)

    def test_eq(self):
        left1 = Left(1)
        left2 = Left(1)
        right1 = Right(1)
        right2 = Right(1)
        self.assertTrue(left1 == left2)
        self.assertFalse(left1 == right1)
        self.assertFalse(left1 == right2)

    def test_case(self):
        left = Left(1)
        right = Right(1)
        def error(x):
            return x * 2
        def success(x):
            return x * 3
        self.assertEqual(left.case(error, success), 2)
        self.assertEqual(right.case(error, success), 3)

    def test_ap(self):
        right = Right(1)
        applicative = lambda x: x * 2
        self.assertEqual(right.ap(applicative), 2)

    def test_to_box(self):
        right = Right(1)
        from pymonet.box import Box
        self.assertIsInstance(right.to_box(), Box)

    def test_to_try(self):
        right = Right(1)
        from pymonet.monad_try import Try
        self.assertIsInstance(right.to_try(), Try)

    def test_to_lazy(self):
        right = Right(1)
        from pymonet.lazy import Lazy
        self.assertIsInstance(right.to_lazy(), Lazy)

    def test_is_right(self):
        left = Left(1)
        right = Right(1)
        self.assertFalse(left.is_right())
        self.assertTrue(right.is_right())

    def test_is_left(self):
        left = Left(1)
        right = Right(1)
        self.assertTrue(left.is_left())
        self.assertFalse(right.is_left())

    def test_to_maybe(self):
        left = Left(1)
        right = Right(1)
        from pymonet.maybe import Maybe
        self.assertEqual(left.to_maybe(), Maybe.nothing())
        self.assertEqual(right.to_maybe(), Maybe.just(1))

    def test_to_validation(self):
        left = Left(1)
        right = Right(1)
        from pymonet.validation import Validation
        self.assertEqual(left.to_validation(), Validation.fail([1]))
        self.assertEqual(right.to_validation(), Validation.success(1))

class TestLeft(unittest.TestCase):
    def test_map(self):
        left = Left(1)
        self.assertEqual(left.map(lambda x: x * 2), Left(1))

    def test_bind(self):
        left = Left(1)
        self.assertEqual(left.bind(lambda x: x * 2), Left(1))

    def test_ap(self):
        left = Left(1)
        applicative = lambda x: x * 2
        self.assertEqual(left.ap(applicative), Left(1))

    def test_is_left(self):
        left = Left(1)
        self.assertTrue(left.is_left())

    def test_is_right(self):
        left = Left(1)
        self.assertFalse(left.is_right())

    def test_to_maybe(self):
        left = Left(1)
        from pymonet.maybe import Maybe
        self.assertEqual(left.to_maybe(), Maybe.nothing())

    def test_to_validation(self):
        left = Left(1)
        from pymonet.validation import Validation
        self.assertEqual(left.to_validation(), Validation.fail([1]))

class TestRight(unittest.TestCase):
    def test_map(self):
        right = Right(1)
        self.assertEqual(right.map(lambda x: x * 2), Right(2))

    def test_bind(self):
        right = Right(1)
        self.assertEqual(right.bind(lambda x: x * 2), 2)

    def test_is_right(self):
        right = Right(1)
        self.assertTrue(right.is_right())

    def test_is_left(self):
        right = Right(1)
        self.assertFalse(right.is_left())

    def test_to_maybe(self):
        right = Right(1)
        from pymonet.maybe import Maybe
        self.assertEqual(right.to_maybe(), Maybe.just(1))

    def test_to_validation(self):
        right = Right(1)
        from pymonet.validation import Validation
        self.assertEqual(right.to_validation(), Validation.success(1))

if __name__ == '__main__':
    unittest.main()