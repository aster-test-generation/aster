import unittest
from pymonet.validation import Validation

class TestValidation(unittest.TestCase):
    def test_init(self):
        instance = Validation(1, [])
        self.assertEqual(instance.value, 1)
        self.assertEqual(instance.errors, [])

    def test_eq(self):
        instance = Validation(1, [])
        self.assertEqual(instance, Validation(1, []))

    def test_str(self):
        instance = Validation(1, [])
        self.assertEqual(str(instance), 'Validation.success[1]')

    def test_repr(self):
        instance = Validation(1, [])
        self.assertEqual(repr(instance), 'Validation.success[1]')

    def test_is_success(self):
        instance = Validation(1, [])
        self.assertEqual(instance.is_success(), True)

    def test_is_fail(self):
        instance = Validation(1, [])
        self.assertEqual(instance.is_fail(), False)

    def test_map(self):
        instance = Validation(1, [])
        self.assertEqual(instance.map(lambda x: x + 1), Validation(2, []))

    def test_bind(self):
        instance = Validation(1, [])
        self.assertEqual(instance.bind(lambda x: Validation(x + 1, [])), Validation(2, []))

    def test_ap(self):
        instance = Validation(1, [])
        self.assertEqual(instance.ap(lambda x: Validation(x + 1, [])), Validation(2, []))

    def test_to_either(self):
        instance = Validation(1, [])
        from pymonet.either import Left, Right
        self.assertEqual(instance.to_either(), Right(1))

    def test_to_maybe(self):
        instance = Validation(1, [])
        from pymonet.maybe import Maybe
        self.assertEqual(instance.to_maybe(), Maybe.just(1))

    def test_to_box(self):
        instance = Validation(1, [])
        from pymonet.box import Box
        self.assertEqual(instance.to_box(), Box(1))

    def test_to_lazy(self):
        instance = Validation(1, [])
        from pymonet.lazy import Lazy
        self.assertEqual(instance.to_lazy(), Lazy(lambda: 1))

    def test_to_try(self):
        instance = Validation(1, [])
        from pymonet.monad_try import Try
        self.assertEqual(instance.to_try(), Try(1, is_success=True))

    def test_success(self):
        self.assertEqual(Validation.success(1), Validation(1, []))

    def test_fail(self):
        self.assertEqual(Validation.fail(1), Validation(None, [1]))

if __name__ == '__main__':
    unittest.main()