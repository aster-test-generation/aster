import unittest
from mimesis.providers.choice import Choice



class TestChoice(unittest.TestCase):
    def test_init(self):
        instance = Choice()
        self.assertIsInstance(instance, Choice)

    def test_call(self):
        instance = Choice()
        result = instance([1, 2, 3], 2, True)
        self.assertEqual(result, [1, 2])

    def test_private_call(self):
        instance = Choice()
        result = instance._Choice__call__([1, 2, 3], 2, True)
        self.assertEqual(result, [1, 2])

    def test_str_method(self):
        instance = Choice()
        result = instance.__str__()
        self.assertEqual(result, 'Choice')

    def test_repr_method(self):
        instance = Choice()
        result = instance.__repr__()
        self.assertEqual(result, 'Choice')

    def test_eq_method(self):
        instance = Choice()
        result = instance.__eq__([1, 2, 3], 2, True)
        self.assertEqual(result, [1, 2])

    def test_ne_method(self):
        instance = Choice()
        result = instance.__ne__([1, 2, 3], 2, True)
        self.assertEqual(result, [1, 2])

    def test_lt_method(self):
        instance = Choice()
        result = instance.__lt__([1, 2, 3], 2, True)
        self.assertEqual(result, [1, 2])

    def test_le_method(self):
        instance = Choice()
        result = instance.__le__([1, 2, 3], 2, True)
        self.assertEqual(result, [1, 2])

    def test_gt_method(self):
        instance = Choice()
        result = instance.__gt__([1, 2, 3], 2, True)
        self.assertEqual(result, [1, 2])

    def test_ge_method(self):
        instance = Choice()
        result = instance.__ge__([1, 2, 3], 2, True)
        self.assertEqual(result, [1, 2])

    def test_hash_method(self):
        instance = Choice()
        result = instance.__hash__()
        self.assertEqual(result, 0)

    def test_bool_method(self):
        instance = Choice()
        result = instance.__bool__()
        self.assertEqual(result, False)

    def test_len_method(self):
        instance = Choice()
        result = instance.__len__()
        self.assertEqual(result, 0)

    def test_getitem_method(self):
        instance = Choice()
        result = instance.__getitem__([1, 2, 3], 2, True)
        self.assertEqual(result, [1, 2])

    def test_setitem_method(self):
        instance = Choice()
        result = instance.__setitem__([1, 2, 3], 2, True)
        self.assertEqual(result, [1, 2])

    def test_delitem_method(self):
        instance = Choice()
        result = instance.__delitem__([1, 2, 3], 2, True)
        self.assertEqual(result, [1, 2])

    def test_iter_method(self):
        instance = Choice()
        result = instance.__iter__()
        self.assertEqual(result, [])

    def test_contains_method(self):
        instance = Choice()
        result = instance.__contains__([1, 2, 3], 2, True)
        self.assertEqual(result, [1, 2])

if __name__ == '__main__':
    unittest.main()