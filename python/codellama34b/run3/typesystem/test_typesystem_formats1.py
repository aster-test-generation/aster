
import unittest
from typesystem.formats import *

class TestBaseFormat(unittest.TestCase):
    def test_validation_error(self):
        instance = BaseFormat()
        result = instance.validation_error("format")
        self.assertEqual(result.code, "format")
        self.assertEqual(result.text, "Must be a valid date format.")

    def test_is_native_type(self):
        instance = BaseFormat()
        result = instance.is_native_type("2022-01-01")
        self.assertEqual(result, False)

    def test_validate(self):
        instance = BaseFormat()
        result = instance.validate("2022-01-01")
        self.assertEqual(result, "2022-01-01")

    def test_serialize(self):
        instance = BaseFormat()
        result = instance.serialize("2022-01-01")
        self.assertEqual(result, "2022-01-01")

class TestDateFormat(unittest.TestCase):
    def test_validation_error(self):
        instance = DateFormat()
        result = instance.validation_error("format")
        self.assertEqual(result.code, "format")
        self.assertEqual(result.text, "Must be a valid date format.")

    def test_is_native_type(self):
        instance = DateFormat()
        result = instance.is_native_type("2022-01-01")
        self.assertEqual(result, False)

    def test_validate(self):
        instance = DateFormat()
        result = instance.validate("2022-01-01")
        self.assertEqual(result, datetime.date(2022, 1, 1))

    def test_serialize(self):
        instance = DateFormat()
        result = instance.serialize("2022-01-01")
        self.assertEqual(result, "2022-01-01")

class TestTimeFormat(unittest.TestCase):
    def test_validation_error(self):
        instance = TimeFormat()
        result = instance.validation_error("format")
        self.assertEqual(result.code, "format")
        self.assertEqual(result.text, "Must be a valid time format.")

    def test_is_native_type(self):
        instance = TimeFormat()
        result = instance.is_native_type("2022-01-01")
        self.assertEqual(result, False)

    def test_validate(self):
        instance = TimeFormat()
        result = instance.validate("2022-01-01")
        self.assertEqual(result, datetime.time(2022, 1, 1))

    def test_serialize(self):
        instance = TimeFormat()
        result = instance.serialize("2022-01-01")
        self.assertEqual(result, "2022-01-01")

class TestDateTimeFormat(unittest.TestCase):
    def test_validation_error(self):
        instance = DateTimeFormat()
        result = instance.validation_error("format")
        self.assertEqual(result.code, "format")
        self.assertEqual(result.text, "Must be a valid datetime format.")

    def test_is_native_type(self):
        instance = DateTimeFormat()
        result = instance.is_native_type("2022-01-01")
        self.assertEqual(result, False)

    def test_validate(self):
        instance = DateTimeFormat()
        result = instance.validate("2022-01-01")
        self.assertEqual(result, datetime.datetime(2022, 1, 1))

    def test_serialize(self):
        instance = DateTimeFormat()
        result = instance.serialize("2022-01-01")
        self.assertEqual(result, "2022-01-01")

if __name__ == '__main__':
    unittest.main()