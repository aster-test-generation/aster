import unittest
from pymonet.either import Either, Left, Right


class TestEither(unittest.TestCase):
    def test_init(self):
        left = Left(1)
        right = Right(2)
        self.assertEqual(left.value, 1)
        self.assertEqual(right.value, 2)

    def test_eq(self):
        left1 = Left(1)
        left2 = Left(1)
        right1 = Right(2)
        right2 = Right(2)
        self.assertEqual(left1, left2)
        self.assertEqual(right1, right2)
        self.assertNotEqual(left1, right1)

    def test_case(self):
        left = Left(1)
        right = Right(2)
        self.assertEqual(left.case(lambda x: x + 1, lambda x: x - 1), 2)
        self.assertEqual(right.case(lambda x: x + 1, lambda x: x - 1), 1)

    def test_ap(self):
        left = Left(1)
        right = Right(2)
        self.assertEqual(left.ap(right), Left(1))
        self.assertEqual(right.ap(left), Left(1))
        self.assertEqual(right.ap(right), Right(4))

    def test_to_box(self):
        left = Left(1)
        right = Right(2)
        self.assertEqual(left.to_box(), Box(1, 2))
        self.assertEqual(right.to_box(), Box(2))

    def test_to_try(self):
        left = Left(1)
        right = Right(2)
        self.assertEqual(left.to_try(), Try(1, is_success=False))
        self.assertEqual(right.to_try(), Try(2, is_success=True))

    def test_to_lazy(self):
        left = Left(1)
        right = Right(2)
        self.assertEqual(left.to_lazy().get(), 1)
        self.assertEqual(right.to_lazy().get(), 2)

    def test_is_right(self):
        left = Left(1)
        right = Right(2)
        self.assertFalse(left.is_right())
        self.assertTrue(right.is_right())

    def test_map(self):
        left = Left(1)
        right = Right(2)
        self.assertEqual(left.map(lambda x: x + 1), Left(1))
        self.assertEqual(right.map(lambda x: x + 1), Right(3))

    def test_bind(self):
        left = Left(1)
        right = Right(2)
        self.assertEqual(left.bind(lambda x: x + 1), Left(1))
        self.assertEqual(right.bind(lambda x: x + 1), Right(4))

    def test_is_left(self):
        left = Left(1)
        right = Right(2)
        self.assertTrue(left.is_left())
        self.assertFalse(right.is_left())

    def test_to_maybe(self):
        left = Left(1)
        right = Right(2)
        self.assertEqual(left.to_maybe(), Maybe.nothing())
        self.assertEqual(right.to_maybe(), Maybe.just(2))

    def test_to_validation(self):
        left = Left(1)
        right = Right(2)
        self.assertEqual(left.to_validation(), Validation.fail([1]))
        self.assertEqual(right.to_validation(), Validation.success(2))

class TestEither(unittest.TestCase):
    def test_eq(self):
        self.assertEqual(Either(1), Either(1))
        self.assertNotEqual(Either(1), Either(2))

    def test_case(self):
        self.assertEqual(Either(1).case(lambda x: x + 1, lambda x: x - 1), 0)
        self.assertEqual(Either(1).case(lambda x: x + 1, lambda x: x - 1), 0)

    def test_ap(self):
        self.assertEqual(Either(1).ap(Either(lambda x: x + 1)), Either(2))
        self.assertEqual(Either(1).ap(Either(lambda x: x + 1)), Either(2))

    def test_to_box(self):
        self.assertEqual(Either(1).to_box(), Box(1))
        self.assertEqual(Either(1).to_box(), Box(1))

    def test_to_try(self):
        self.assertEqual(Either(1).to_try(), Try(1, is_success=True))
        self.assertEqual(Either(1).to_try(), Try(1, is_success=True))

    def test_to_lazy(self):
        self.assertEqual(Either(1).to_lazy(), Lazy(lambda: 1))
        self.assertEqual(Either(1).to_lazy(), Lazy(lambda: 1))

    def test_is_right(self):
        self.assertTrue(Either(1).is_right())
        self.assertFalse(Either(1).is_right())

class TestLeft(unittest.TestCase):
    def test_map(self):
        self.assertEqual(Left(1).map(lambda x: x + 1), Left(1))
        self.assertEqual(Left(1).map(lambda x: x + 1), Left(1))

    def test_bind(self):
        self.assertEqual(Left(1).bind(lambda x: x + 1), Left(1))
        self.assertEqual(Left(1).bind(lambda x: x + 1), Left(1))

    def test_ap(self):
        self.assertEqual(Left(1).ap(Either(lambda x: x + 1)), Left(1))
        self.assertEqual(Left(1).ap(Either(lambda x: x + 1)), Left(1))

    def test_is_left(self):
        self.assertTrue(Left(1).is_left())
        self.assertFalse(Left(1).is_left())

    def test_is_right(self):
        self.assertFalse(Left(1).is_right())
        self.assertTrue(Left(1).is_right())

    def test_to_maybe(self):
        self.assertEqual(Left(1).to_maybe(), Maybe.nothing())
        self.assertEqual(Left(1).to_maybe(), Maybe.nothing())

    def test_to_validation(self):
        self.assertEqual(Left(1).to_validation(), Validation.fail([1]))
        self.assertEqual(Left(1).to_validation(), Validation.fail([1]))

class TestRight(unittest.TestCase):
    def test_map(self):
        self.assertEqual(Right(1).map(lambda x: x + 1), Right(2))
        self.assertEqual(Right(1).map(lambda x: x + 1), Right(2))

    def test_bind(self):
        self.assertEqual(Right(1).bind(lambda x: x + 1), 2)
        self.assertEqual(Right(1).bind(lambda x: x + 1), 2)

    def test_is_right(self):
        self.assertTrue(Right(1).is_right())
        self.assertFalse(Right(1).is_right())

    def test_is_left(self):
        self.assertFalse(Right(1).is_left())
        self.assertTrue(Right(1).is_left())

    def test_to_maybe(self):
        self.assertEqual(Right(1).to_maybe(), Maybe.just(1))
        self.assertEqual(Right(1).to_maybe(), Maybe.just(1))

if __name__ == '__main__':
    unittest.main()