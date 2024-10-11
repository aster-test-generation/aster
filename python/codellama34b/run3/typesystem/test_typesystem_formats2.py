
import unittest
from typesystem.formats import *

class TestBaseFormat(unittest.TestCase):
    def test_validation_error(self):
        instance = BaseFormat()
        result = instance.validation_error("format")
        self.assertEqual(result.text, "Must be a valid date format.")
        self.assertEqual(result.code, "format")

    def test_is_native_type(self):
        instance = BaseFormat()
        result = instance.is_native_type(datetime.date(2022, 1, 1))
        self.assertEqual(result, False)

    def test_validate(self):
        instance = BaseFormat()
        result = instance.validate(datetime.date(2022, 1, 1))
        self.assertEqual(result, datetime.date(2022, 1, 1))

    def test_serialize(self):
        instance = BaseFormat()
        result = instance.serialize(datetime.date(2022, 1, 1))
        self.assertEqual(result, "2022-01-01")

class TestDateFormat(unittest.TestCase):
    def test_is_native_type(self):
        instance = DateFormat()
        result = instance.is_native_type(datetime.date(2022, 1, 1))
        self.assertEqual(result, True)

    def test_validate(self):
        instance = DateFormat()
        result = instance.validate("2022-01-01")
        self.assertEqual(result, datetime.date(2022, 1, 1))

    def test_serialize(self):
        instance = DateFormat()
        result = instance.serialize(datetime.date(2022, 1, 1))
        self.assertEqual(result, "2022-01-01")

class TestTimeFormat(unittest.TestCase):
    def test_is_native_type(self):
        instance = TimeFormat()
        result = instance.is_native_type(datetime.time(12, 30, 0))
        self.assertEqual(result, True)

    def test_validate(self):
        instance = TimeFormat()
        result = instance.validate("12:30:00")
        self.assertEqual(result, datetime.time(12, 30, 0))

    def test_serialize(self):
        instance = TimeFormat()
        result = instance.serialize(datetime.time(12, 30, 0))
        self.assertEqual(result, "12:30:00")

class TestDateTimeFormat(unittest.TestCase):
    def test_is_native_type(self):
        instance = DateTimeFormat()
        result = instance.is_native_type(datetime.datetime(2022, 1, 1, 12, 30, 0))
        self.assertEqual(result, True)

    def test_validate(self):
        instance = DateTimeFormat()
        result = instance.validate("2022-01-01T12:30:00")
        self.assertEqual(result, datetime.datetime(2022, 1, 1, 12, 30, 0))

    def test_serialize(self):
        instance = DateTimeFormat()
        result = instance.serialize(datetime.datetime(2022, 1, 1, 12, 30, 0))
        self.assertEqual(result, "2022-01-01T12:30:00")

class TestUUIDFormat(unittest.TestCase):
    def test_is_native_type(self):
        instance = UUIDFormat()
        result = instance.is_native_type(uuid.UUID(int=1))
        self.assertEqual(result, True)

if __name__ == '__main__':
    unittest.main()