
import unittest
from typesystem.formats import *

class TestBaseFormat(unittest.TestCase):
    def test_validation_error(self):
        instance = BaseFormat()
        result = instance.validation_error("code")
        self.assertEqual(result.text, "Must be a valid date format.")
        self.assertEqual(result.code, "code")

    def test_is_native_type(self):
        instance = BaseFormat()
        result = instance.is_native_type("value")
        self.assertEqual(result, False)

    def test_validate(self):
        instance = BaseFormat()
        result = instance.validate("value")
        self.assertEqual(result, NotImplementedError())

    def test_serialize(self):
        instance = BaseFormat()
        result = instance.serialize("obj")
        self.assertEqual(result, NotImplementedError())

class TestDateFormat(unittest.TestCase):
    def test_validation_error(self):
        instance = DateFormat()
        result = instance.validation_error("code")
        self.assertEqual(result.text, "Must be a valid date format.")
        self.assertEqual(result.code, "code")

    def test_is_native_type(self):
        instance = DateFormat()
        result = instance.is_native_type("value")
        self.assertEqual(result, False)

    def test_validate(self):
        instance = DateFormat()
        result = instance.validate("value")
        self.assertEqual(result, NotImplementedError())

    def test_serialize(self):
        instance = DateFormat()
        result = instance.serialize("obj")
        self.assertEqual(result, NotImplementedError())

class TestTimeFormat(unittest.TestCase):
    def test_validation_error(self):
        instance = TimeFormat()
        result = instance.validation_error("code")
        self.assertEqual(result.text, "Must be a valid time format.")
        self.assertEqual(result.code, "code")

    def test_is_native_type(self):
        instance = TimeFormat()
        result = instance.is_native_type("value")
        self.assertEqual(result, False)

    def test_validate(self):
        instance = TimeFormat()
        result = instance.validate("value")
        self.assertEqual(result, NotImplementedError())

    def test_serialize(self):
        instance = TimeFormat()
        result = instance.serialize("obj")
        self.assertEqual(result, NotImplementedError())

class TestDateTimeFormat(unittest.TestCase):
    def test_validation_error(self):
        instance = DateTimeFormat()
        result = instance.validation_error("code")
        self.assertEqual(result.text, "Must be a valid datetime format.")
        self.assertEqual(result.code, "code")

    def test_is_native_type(self):
        instance = DateTimeFormat()
        result = instance.is_native_type("value")
        self.assertEqual(result, False)

    def test_validate(self):
        instance = DateTimeFormat()
        result = instance.validate("value")
        self.assertEqual(result, NotImplementedError())

    def test_serialize(self):
        instance = DateTimeFormat()
        result = instance.serialize("obj")
        self.assertEqual(result, NotImplementedError())

class TestUUIDFormat(unittest.TestCase):
    def test_validation_error(self):
        instance = UUIDFormat()
        result = instance.validation_error("code")
        self.assertEqual(result.text, "Must be valid UUID format.")
        self.assertEqual(result.code, "code")

    def test_is_native_type(self):
        instance = UUIDFormat()
        result = instance.is_native_type("value")
        self.assertEqual(result, False)

    def test_validate(self):
        instance = UUIDFormat()
        result = instance.validate("value")
        self.assertEqual(result, NotImplementedError())

if __name__ == '__main__':
    unittest.main()