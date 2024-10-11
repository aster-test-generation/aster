import unittest
from pymonet.either import Either, Left, Right

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