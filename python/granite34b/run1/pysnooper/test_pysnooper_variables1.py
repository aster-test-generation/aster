import unittest
from pysnooper.variables import BaseVariable, CommonVariable, Attrs, Keys, Indices, Exploding

class TestBaseVariable(unittest.TestCase):
    def test_init(self):
        source = "x + 1"
        exclude = ("x",)
        instance = BaseVariable(source, exclude)
        self.assertEqual(instance.source, source)
        self.assertEqual(instance.exclude, exclude)
        self.assertEqual(instance.code.co_code, compile(source, "<variable>", "eval").co_code)
        self.assertEqual(instance.unambiguous_source, f"({source})")

    def test_items(self):
        frame = {"x": 1}
        instance = BaseVariable("x")
        result = instance.items(frame)
        self.assertEqual(result, [("x", "1")])

    def test__fingerprint(self):
        instance = BaseVariable("x")
        self.assertEqual(instance._fingerprint, (BaseVariable, "x", ()))

    def test___hash__(self):
        instance = BaseVariable("x")
        self.assertEqual(hash(instance), hash((BaseVariable, "x", ())))

    def test___eq__(self):
        instance1 = BaseVariable("x")
        instance2 = BaseVariable("x")
        self.assertEqual(instance1, instance2)

class TestCommonVariable(unittest.TestCase):
    def test__items(self):
        main_value = 1
        instance = CommonVariable("x")
        result = instance._items(main_value)
        self.assertEqual(result, [("x", "1")])

    def test__safe_keys(self):
        main_value = 1
        instance = CommonVariable("x")
        result = list(instance._safe_keys(main_value))
        self.assertEqual(result, [])

    def test__keys(self):
        main_value = 1
        instance = CommonVariable("x")
        result = list(instance._keys(main_value))
        self.assertEqual(result, [])

    def test__format_key(self):
        key = 1
        instance = CommonVariable("x")
        with self.assertRaises(NotImplementedError):
            instance._format_key(key)

    def test__get_value(self):
        main_value = 1
        key = 1
        instance = CommonVariable("x")
        with self.assertRaises(NotImplementedError):
            instance._get_value(main_value, key)

class TestAttrs(unittest.TestCase):
    def test__keys(self):
        main_value = 1
        instance = Attrs("x")
        result = list(instance._keys(main_value))
        self.assertEqual(result, [])

    def test__format_key(self):
        key = 1
        instance = Attrs("x")
        result = instance._format_key(key)
        self.assertEqual(result, ".1")

    def test__get_value(self):
        main_value = 1
        key = 1
        instance = Attrs("x")
        with self.assertRaises(AttributeError):
            instance._get_value(main_value, key)

class TestKeys(unittest.TestCase):
    def test__keys(self):
        main_value = 1
        instance = Keys("x")
        result = list(instance._keys(main_value))
        self.assertEqual(result, [])

    def test__format_key(self):
        key = 1
        instance = Keys("x")
        result = instance._format_key(key)
        self.assertEqual(result, "[1]")

    def test__get_value(self):
        main_value = 1
        key = 1
        instance = Keys("x")
        with self.assertRaises(TypeError):
            instance._get_value(main_value, key)

class TestIndices(unittest.TestCase):
    def test__keys(self):
        main_value = 1
        instance = Indices("x")
        result = list(instance._keys(main_value))
        self.assertEqual(result, [])

    def test___getitem__(self):
        instance = Indices("x")
        result = instance[1:2]
        self.assertEqual(result._slice, slice(1, 2))


if __name__ == '__main__':
    unittest.main()