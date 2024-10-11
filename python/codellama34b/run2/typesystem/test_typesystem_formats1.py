import unittest
from typesystem.formats import *

class TestBaseFormat(unittest.TestCase):
    def test_validation_error(self):
        instance = BaseFormat()
        result = instance.validation_error("code")
        self.assertEqual(result, ValidationError(text="", code="code"))

    def test_is_native_type(self):
        instance = BaseFormat()
        result = instance.is_native_type("value")
        self.assertEqual(result, False)

    def test_validate(self):
        instance = BaseFormat()
        result = instance.validate("value")
        self.assertEqual(result, None)

    def test_serialize(self):
        instance = BaseFormat()
        result = instance.serialize("obj")
        self.assertEqual(result, None)

class TestDateFormat(unittest.TestCase):
    def test_is_native_type(self):
        instance = DateFormat()
        result = instance.is_native_type("value")
        self.assertEqual(result, False)

    def test_validate(self):
        instance = DateFormat()
        result = instance.validate("value")
        self.assertEqual(result, None)

    def test_serialize(self):
        instance = DateFormat()
        result = instance.serialize("obj")
        self.assertEqual(result, None)

class TestTimeFormat(unittest.TestCase):
    def test_is_native_type(self):
        instance = TimeFormat()
        result = instance.is_native_type("value")
        self.assertEqual(result, False)

    def test_validate(self):
        instance = TimeFormat()
        result = instance.validate("value")
        self.assertEqual(result, None)

    def test_serialize(self):
        instance = TimeFormat()
        result = instance.serialize("obj")
        self.assertEqual(result, None)

class TestDateTimeFormat(unittest.TestCase):
    def test_is_native_type(self):
        instance = DateTimeFormat()
        result = instance.is_native_type("value")
        self.assertEqual(result, False)

    def test_validate(self):
        instance = DateTimeFormat()
        result = instance.validate("value")
        self.assertEqual(result, None)

    def test_serialize(self):
        instance = DateTimeFormat()
        result = instance.serialize("obj")
        self.assertEqual(result, None)

class TestUUIDFormat(unittest.TestCase):
    def test_is_native_type(self):
        instance = UUIDFormat()
        result = instance.is_native_type("value")
        self.assertEqual(result, False)

    def test_validate(self):
        instance = UUIDFormat()
        result = instance.validate("value")
        self.assertEqual(result, None)

    def test_serialize(self):
        instance = UUIDFormat()
        result = instance.serialize("obj")
        self.assertEqual(result, None)

if __name__ == '__main__':
    unittest.main()