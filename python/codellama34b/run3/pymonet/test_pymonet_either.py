import unittest
from pymonet.either import *


class TestEither(unittest.TestCase):
    def test_init(self):
        instance = Either(1)
        self.assertEqual(instance.value, 1)

    def test_eq(self):
        instance = Either(1)
        self.assertEqual(instance.__eq__(Either(1)), True)

    def test_case(self):
        instance = Either(1)
        self.assertEqual(instance.case(lambda x: x, lambda x: x), 1)

    def test_ap(self):
        instance = Either(1)
        self.assertEqual(instance.ap(Either(1)), Either(1))

    def test_to_box(self):
        instance = Either(1)
        self.assertEqual(instance.to_box(), Box(1))

    def test_to_try(self):
        instance = Either(1)
        self.assertEqual(instance.to_try(), Try(1, is_success=True))

    def test_to_lazy(self):
        instance = Either(1)
        self.assertEqual(instance.to_lazy(), Lazy(lambda: 1))

    def test_is_right(self):
        instance = Either(1)
        self.assertEqual(instance.is_right(), None)

    def test_left_map(self):
        instance = Left(1)
        self.assertEqual(instance.map(lambda x: x), Left(1))

    def test_left_bind(self):
        instance = Left(1)
        self.assertEqual(instance.bind(lambda x: x), Left(1))

    def test_left_ap(self):
        instance = Left(1)
        self.assertEqual(instance.ap(Left(1)), Left(1))

    def test_left_is_left(self):
        instance = Left(1)
        self.assertEqual(instance.is_left(), True)

    def test_left_is_right(self):
        instance = Left(1)
        self.assertEqual(instance.is_right(), False)

    def test_left_to_maybe(self):
        instance = Left(1)
        self.assertEqual(instance.to_maybe(), Maybe.just(instance))

    def test_left_to_validation(self):
        instance = Left(1)
        self.assertEqual(instance.to_validation(), Validation.fail([1]))

    def test_right_map(self):
        instance = Right(1)
        self.assertEqual(instance.map(lambda x: x), Right(1))

    def test_right_bind(self):
        instance = Right(1)
        self.assertEqual(instance.bind(lambda x: x), 1)

    def test_right_is_left(self):
        instance = Right(1)
        self.assertEqual(instance.is_left(), False)

    def test_right_is_right(self):
        instance = Right(1)
        self.assertEqual(instance.is_right(), True)

    def test_right_to_maybe(self):
        instance = Right(1)
        self.assertEqual(instance.to_maybe(), Just(1))

    def test_right_to_validation(self):
        instance = Right(1)
        self.assertEqual(instance.to_validation(), Success(1))

if __name__ == '__main__':
    unittest.main()