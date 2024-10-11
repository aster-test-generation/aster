import unittest
from pymonet.either import *



class TestEither(unittest.TestCase):
    def test_either_init(self):
        instance = Either(1)
        self.assertEqual(instance.value, 1)

    def test_either_eq(self):
        instance = Either(1)
        result = instance.__eq__(Either(1))
        self.assertEqual(result, True)

    def test_either_case(self):
        instance = Either(1)
        result = instance.case(lambda x: x + 1, lambda x: x * 2)
        self.assertEqual(result, 2)

    def test_either_ap(self):
        instance = Either(1)
        result = instance.map(Either(2))
        self.assertEqual(result, Either(2))

    def test_either_to_box(self):
        instance = Either(1)
        result = instance.to_box()
        self.assertEqual(result, Box(1))

    def test_either_to_try(self):
        instance = Either(1)
        result = instance.to_try()
        self.assertEqual(result, Success(1))

    def test_either_to_lazy(self):
        instance = Either(1)
        result = instance.to_lazy()
        self.assertEqual(result, Lazy(lambda: 1))

    def test_either_is_right(self):
        instance = Either(1)
        result = instance.is_right()
        self.assertEqual(result, None)

    def test_left_init(self):
        instance = Left(1)
        self.assertEqual(instance.value, 1)

    def test_left_map(self):
        instance = Left(1)
        result = instance.map(lambda x: x + 1)
        self.assertEqual(result, Left(1))

    def test_left_bind(self):
        instance = Left(1)
        result = instance.bind(lambda x: x + 1)
        self.assertEqual(result, Left(1))

    def test_left_ap(self):
        instance = Left(1)
        result = instance.ap(Left(2))
        self.assertEqual(result, Left(1))

    def test_left_is_left(self):
        instance = Left(1)
        result = instance.is_left()
        self.assertEqual(result, True)

    def test_left_is_right(self):
        instance = Left(1)
        result = instance.is_right()
        self.assertEqual(result, False)

    def test_left_to_maybe(self):
        instance = Left(1)
        result = instance.to_maybe()
        self.assertEqual(result, Nothing())

    def test_left_to_validation(self):
        instance = Left(1)
        result = instance.to_validation()
        self.assertEqual(result, Validation.fail([1]))

    def test_right_init(self):
        instance = Right(1)
        self.assertEqual(instance.value, 1)

    def test_right_map(self):
        instance = Right(1)
        result = instance.map(lambda x: x + 1)
        self.assertEqual(result, Right(2))

    def test_right_bind(self):
        instance = Right(1)
        result = instance.bind(lambda x: x + 1)
        self.assertEqual(result, 2)

    def test_right_ap(self):
        instance = Right(1)
        result = instance.ap(Right(lambda x: x + 1))
        self.assertEqual(result, Right(2))

    def test_right_is_left(self):
        instance = Right(1)
        result = instance.is_left()
        self.assertEqual(result, False)

if __name__ == '__main__':
    unittest.main()