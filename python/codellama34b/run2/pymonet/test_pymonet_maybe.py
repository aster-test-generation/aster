import unittest
from pymonet.maybe import Maybe



class TestMaybe(unittest.TestCase):
    def test_init(self):
        instance = Maybe(1, False)
        self.assertEqual(instance.is_nothing, False)
        self.assertEqual(instance.value, 1)

    def test_just(self):
        result = Maybe.just(1)
        self.assertEqual(result.is_nothing, False)
        self.assertEqual(result.value, 1)

    def test_nothing(self):
        result = Maybe.nothing()
        self.assertEqual(result.is_nothing, True)
        self.assertEqual(result.value, 10)

    def test_eq(self):
        instance = Maybe(1, False)
        self.assertEqual(instance, Maybe(1, False))
        self.assertNotEqual(instance, Maybe(2, False))
        self.assertNotEqual(instance, Maybe(1, True))

    def test_map(self):
        instance = Maybe.just(1)
        result = instance.map(lambda x: x + 1)
        self.assertEqual(result, Maybe.just(2))

        instance = Maybe.nothing()
        result = instance.map(lambda x: x + 1)
        self.assertEqual(result, Maybe.nothing())

    def test_bind(self):
        instance = Maybe.just(1)
        result = instance.bind(lambda x: Maybe.just(x + 1))
        self.assertEqual(result, Maybe.just(2))

        instance = Maybe.nothing()
        result = instance.bind(lambda x: Maybe.just(x + 1))
        self.assertEqual(result, Maybe.nothing())

    def test_ap(self):
        instance = Maybe.just(1)
        result = instance.ap(Maybe.just(lambda x: x + 1))
        self.assertEqual(result, Maybe.just(2))

        instance = Maybe.nothing()
        result = instance.ap(Maybe.just(lambda x: x + 1))
        self.assertEqual(result, Maybe.nothing())

    def test_filter(self):
        instance = Maybe.just(1)
        result = instance.filter(lambda x: x > 0)
        self.assertEqual(result, Maybe.just(1))

        instance = Maybe.just(1)
        result = instance.filter(lambda x: x < 0)
        self.assertEqual(result, Maybe.nothing())

        instance = Maybe.nothing()
        result = instance.filter(lambda x: x > 0)
        self.assertEqual(result, Maybe.nothing())

    def test_get_or_else(self):
        instance = Maybe.just(1)
        result = instance.get_or_else(0)
        self.assertEqual(result, 1)

        instance = Maybe.nothing()
        result = instance.get_or_else(0)
        self.assertEqual(result, 0)

    def test_to_either(self):
        instance = Maybe.just(1)
        result = instance.to_either()
        from pymonet.either import Right
        self.assertEqual(result, Right(1))

        instance = Maybe.nothing()
        result = instance.to_either()
        from pymonet.either import Left
        self.assertEqual(result, Left(None))

    def test_to_box(self):
        instance = Maybe.just(1)
        result = instance.to_box()
        from pymonet.box import Box
        self.assertEqual(result, Box(1))

        instance = Maybe.nothing()
        result = instance.to_box()
        from pymonet.box import Box
        self.assertEqual(result, Box(None))

if __name__ == '__main__':
    unittest.main()