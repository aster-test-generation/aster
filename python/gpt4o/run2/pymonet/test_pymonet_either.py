import unittest
from pymonet.either import Either, Left, Right


class TestEither(unittest.TestCase):
    def test_init(self):
        instance = Either(10)
        self.assertEqual(instance.value, 10)

    def test_eq(self):
        instance1 = Either(10)
        instance2 = Either(10)
        self.assertTrue(instance1 == instance2)

    def test_case_right(self):
        instance = Right(10)
        result = instance.case(lambda x: f"Error: {x}", lambda x: f"Success: {x}")
        self.assertEqual(result, "Success: 10")

    def test_case_left(self):
        instance = Left(10)
        result = instance.case(lambda x: f"Error: {x}", lambda x: f"Success: {x}")
        self.assertEqual(result, "Error: 10")

    def test_ap(self):
        instance = Right(10)
        applicative = Right(lambda x: x + 1)
        result = instance.ap(applicative)
        self.assertEqual(result.value, 11)

    def test_to_box(self):
        instance = Either(10)
        box = instance.to_box()
        self.assertEqual(box.value, 10)

    def test_to_try(self):
        instance = Right(10)
        try_instance = instance.to_try()
        self.assertTrue(try_instance.is_success)

    def test_to_lazy(self):
        instance = Either(10)
        lazy = instance.to_lazy()
        self.assertEqual(lazy.value, 10)

    def test_is_right(self):
        instance = Right(10)
        self.assertTrue(instance.is_right())

class TestLeft(unittest.TestCase):
    def test_map(self):
        instance = Left(10)
        result = instance.map(lambda x: x + 1)
        self.assertEqual(result.value, 10)

    def test_bind(self):
        instance = Left(10)
        result = instance.bind(lambda x: Right(x + 1))
        self.assertEqual(result.value, 10)

    def test_ap(self):
        instance = Left(10)
        monad = Right(lambda x: x + 1)
        result = instance.ap(monad)
        self.assertEqual(result.value, 10)

    def test_is_left(self):
        instance = Left(10)
        self.assertTrue(instance.is_left())

    def test_is_right(self):
        instance = Left(10)
        self.assertFalse(instance.is_right())

    def test_to_maybe(self):
        instance = Left(10)
        maybe = instance.to_maybe()
        self.assertTrue(maybe.is_nothing)

    def test_to_validation(self):
        instance = Left(10)
        validation = instance.to_validation()
        self.assertTrue(validation.is_fail())

class TestRight(unittest.TestCase):
    def test_map(self):
        instance = Right(10)
        result = instance.map(lambda x: x + 1)
        self.assertEqual(result.value, 11)

    def test_bind(self):
        instance = Right(10)
        result = instance.bind(lambda x: Right(x + 1))
        self.assertEqual(result.value, 11)

    def test_is_right(self):
        instance = Right(10)
        self.assertTrue(instance.is_right())

    def test_is_left(self):
        instance = Right(10)
        self.assertFalse(instance.is_left())

    def test_to_maybe(self):
        instance = Right(10)
        maybe = instance.to_maybe()
        self.assertTrue(maybe.isJust())

    def test_to_validation(self):
        instance = Right(10)
        validation = instance.to_validation()
        self.assertTrue(validation.is_success())

if __name__ == '__main__':
    unittest.main()