import unittest
from pymonet.validation import Validation

class TestValidation(unittest.TestCase):
    def test_init(self):
        v = Validation(1, [2, 3])
        self.assertEqual(v.value, 1)
        self.assertEqual(v.errors, [2, 3])

    def test_eq(self):
        v1 = Validation(1, [2, 3])
        v2 = Validation(1, [2, 3])
        v3 = Validation(2, [2, 3])
        v4 = Validation(1, [4, 5])
        self.assertEqual(v1, v2)
        self.assertNotEqual(v1, v3)
        self.assertNotEqual(v1, v4)

    def test_str(self):
        v1 = Validation(1, [])
        v2 = Validation(1, [2, 3])
        self.assertEqual(str(v1), 'Validation.success[1]')
        self.assertEqual(str(v2), 'Validation.fail[1, [2, 3]]')

    def test_success(self):
        v = Validation.success(1)
        self.assertEqual(v.value, 1)
        self.assertEqual(v.errors, [])

    def test_fail(self):
        v = Validation.fail([2, 3])
        self.assertEqual(v.value, None)
        self.assertEqual(v.errors, [2, 3])

    def test_is_success(self):
        v1 = Validation(1, [])
        v2 = Validation(1, [2, 3])
        self.assertTrue(v1.is_success())
        self.assertFalse(v2.is_success())

    def test_is_fail(self):
        v1 = Validation(1, [])
        v2 = Validation(1, [2, 3])
        self.assertFalse(v1.is_fail())
        self.assertTrue(v2.is_fail())

    def test_map(self):
        v1 = Validation(1, [])
        v2 = v1.map(lambda x: x + 1)
        self.assertEqual(v2.value, 2)
        self.assertEqual(v2.errors, [])

    def test_bind(self):
        v1 = Validation(1, [])
        v2 = v1.bind(lambda x: Validation(x + 1, []))
        self.assertEqual(v2.value, 2)
        self.assertEqual(v2.errors, [])

    def test_ap(self):
        v1 = Validation(1, [])
        v2 = Validation(lambda x: x + 1, [])
        v3 = v1.ap(v2)
        self.assertEqual(v3.value, 2)
        self.assertEqual(v3.errors, [])

    def test_to_either(self):
        from pymonet.either import Right, Left
        v1 = Validation(1, [])
        v2 = Validation(1, [2, 3])
        self.assertEqual(v1.to_either(), Right(1))
        self.assertEqual(v2.to_either(), Left([2, 3]))

    def test_to_maybe(self):
        from pymonet.maybe import Just, Nothing
        v1 = Validation(1, [])
        v2 = Validation(1, [2, 3])
        self.assertEqual(v1.to_maybe(), Just(1))
        self.assertEqual(v2.to_maybe(), Nothing())

    def test_to_box(self):
        from pymonet.box import Box
        v1 = Validation(1, [])
        v2 = Validation(1, [2, 3])
        self.assertEqual(v1.to_box(), Box(1))
        self.assertEqual(v2.to_box(), Box(1))

    def test_to_lazy(self):
        from pymonet.lazy import Lazy
        v1 = Validation(1, [])
        v2 = Validation(1, [2, 3])
        self.assertEqual(v1.to_lazy().force(), 1)
        self.assertEqual(v2.to_lazy().force(), 1)

if __name__ == '__main__':
    unittest.main()