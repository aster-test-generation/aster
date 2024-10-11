import unittest
from pysnooper.variables import BaseVariable, CommonVariable, Attrs, Keys, Indices, Exploding


class TestBaseVariable(unittest.TestCase):
    def test_init(self):
        source = 'x'
        exclude = ('y', 'z')
        variable = BaseVariable(source, exclude)
        self.assertEqual(variable.source, source)
        self.assertEqual(variable.exclude, exclude)
        self.assertEqual(variable.code.co_code, compile(source, '<variable>', 'eval').co_code)
        self.assertEqual(variable.unambiguous_source, '(x)')

    def test_items(self):
        frame = {'x': 1}
        variable = BaseVariable('x')
        items = list(variable.items(frame))
        self.assertEqual(items, [('x', '1')])

    def test_fingerprint(self):
        variable1 = BaseVariable('x')
        variable2 = BaseVariable('x')
        self.assertEqual(variable1._fingerprint, variable2._fingerprint)

    def test_hash(self):
        variable1 = BaseVariable('x')
        variable2 = BaseVariable('x')
        self.assertEqual(hash(variable1), hash(variable2))

    def test_eq(self):
        variable1 = BaseVariable('x')
        variable2 = BaseVariable('x')
        self.assertEqual(variable1, variable2)

class TestCommonVariable(unittest.TestCase):
    def test_items(self):
        frame = {'x': 1}
        variable = CommonVariable('x')
        items = list(variable.items(frame))
        self.assertEqual(items, [('x', '1')])

    def test_safe_keys(self):
        frame = {'x': 1}
        variable = CommonVariable('x')
        items = list(variable._safe_keys(frame))
        self.assertEqual(items, [])

    def test_keys(self):
        frame = {'x': 1}
        variable = CommonVariable('x')
        items = list(variable._keys(frame))
        self.assertEqual(items, [])

    def test_format_key(self):
        frame = {'x': 1}
        variable = CommonVariable('x')
        with self.assertRaises(NotImplementedError):
            variable._format_key(frame)

    def test_get_value(self):
        frame = {'x': 1}
        variable = CommonVariable('x')
        with self.assertRaises(NotImplementedError):
            variable._get_value(frame)

class TestAttrs(unittest.TestCase):
    def test_keys(self):
        frame = {'x': 1}
        variable = Attrs('x')
        items = list(variable._keys(frame))
        self.assertEqual(items, [])

    def test_format_key(self):
        frame = {'x': 1}
        variable = Attrs('x')
        key = 'y'
        formatted_key = variable._format_key(key)
        self.assertEqual(formatted_key, '.y')

    def test_get_value(self):
        frame = {'x': 1}
        variable = Attrs('x')
        key = 'y'
        with self.assertRaises(AttributeError):
            variable._get_value(frame, key)

class TestKeys(unittest.TestCase):
    def test_keys(self):
        frame = {'x': 1}
        variable = Keys('x')
        items = list(variable._keys(frame))
        self.assertEqual(items, [])

    def test_format_key(self):
        frame = {'x': 1}
        variable = Keys('x')
        key = 'y'
        formatted_key = variable._format_key(key)
        self.assertEqual(formatted_key, '[y]')

    def test_get_value(self):
        frame = {'x': 1}
        variable = Keys('x')
        key = 'y'
        with self.assertRaises(KeyError):
            variable._get_value(frame, key)

class TestIndices(unittest.TestCase):
    def test_keys(self):
        frame = {'x': 1}
        variable = Indices('x')
        items = list(variable._keys(frame))
        self.assertEqual(items, [])

    def test_format_key(self):
        frame = {'x': 1}
        variable = Indices('x')
        key = 'y'
        formatted_key = variable._format_key(key)
        self.assertEqual(formatted_key, '[y]')

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