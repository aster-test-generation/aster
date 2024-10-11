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
        self.assertEqual(instance.is_right(), True)

class TestLeft(unittest.TestCase):
    def test_map(self):
        instance = Left(1)
        self.assertEqual(instance.map(lambda x: x), Left(1))

    def test_bind(self):
        instance = Left(1)
        self.assertEqual(instance.bind(lambda x: x), Left(1))

    def test_ap(self):
        instance = Left(1)
        self.assertEqual(instance.ap(Either(1)), Left(1))

    def test_is_left(self):
        instance = Left(1)
        self.assertEqual(instance.is_left(), True)

    def test_is_right(self):
        instance = Left(1)
        self.assertEqual(instance.is_right(), False)

    def test_to_maybe(self):
        instance = Left(1)
        self.assertEqual(instance.to_maybe(), Maybe.nothing())

    def test_to_validation(self):
        instance = Left(1)
        self.assertEqual(instance.to_validation(), Validation.fail([1]))

class TestRight(unittest.TestCase):
    def test_map(self):
        instance = Right(1)
        self.assertEqual(instance.map(lambda x: x), Right(1))

    def test_bind(self):
        instance = Right(1)
        self.assertEqual(instance.bind(lambda x: x), 1)

    def test_is_right(self):
        instance = Right(1)
        self.assertEqual(instance.is_right(), True)

    def test_is_left(self):
        instance = Right(1)
        self.assertEqual(instance.is_left(), False)

    def test_to_maybe(self):
        instance = Right(1)
        self.assertEqual(instance.to_maybe(), Maybe.just(1))

    def test_to_validation(self):
        instance = Right(1)
        self.assertEqual(instance.to_validation(), Validation.success(1))

if __name__ == '__main__':
    unittest.main()