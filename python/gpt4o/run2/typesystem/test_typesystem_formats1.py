import unittest
import datetime
import uuid
from typesystem.formats import BaseFormat, DateFormat, TimeFormat, DateTimeFormat, UUIDFormat
from typesystem.base import ValidationError

class TestBaseFormat(unittest.TestCase):
    def test_validation_error(self):
        instance = BaseFormat()
        instance.errors = {"test_code": "Error message with {attribute}."}
        instance.attribute = "value"
        error = instance.validation_error("test_code")
        self.assertIsInstance(error, ValidationError)
        self.assertEqual(error.text, "Error message with value.")

    def test_is_native_type(self):
        instance = BaseFormat()
        with self.assertRaises(NotImplementedError):
            instance.is_native_type("test")

    def test_validate(self):
        instance = BaseFormat()
        with self.assertRaises(NotImplementedError):
            instance.validate("test")

    def test_serialize(self):
        instance = BaseFormat()
        with self.assertRaises(NotImplementedError):
            instance.serialize("test")

class TestDateFormat(unittest.TestCase):
    def test_is_native_type(self):
        instance = DateFormat()
        self.assertTrue(instance.is_native_type(datetime.date.today()))
        self.assertFalse(instance.is_native_type("2023-10-10"))

    def test_validate(self):
        instance = DateFormat()
        self.assertEqual(instance.validate("2023-10-10"), datetime.date(2023, 10, 10))
        with self.assertRaises(ValidationError):
            instance.validate("invalid-date")

    def test_serialize(self):
        instance = DateFormat()
        self.assertEqual(instance.serialize(datetime.date(2023, 10, 10)), "2023-10-10")
        self.assertIsNone(instance.serialize(None))

class TestTimeFormat(unittest.TestCase):
    def test_is_native_type(self):
        instance = TimeFormat()
        self.assertTrue(instance.is_native_type(datetime.time(12, 0)))
        self.assertFalse(instance.is_native_type("12:00"))

    def test_validate(self):
        instance = TimeFormat()
        self.assertEqual(instance.validate("12:00"), datetime.time(12, 0))
        with self.assertRaises(ValidationError):
            instance.validate("invalid-time")

    def test_serialize(self):
        instance = TimeFormat()
        self.assertEqual(instance.serialize(datetime.time(12, 0)), "12:00:00")
        self.assertIsNone(instance.serialize(None))

class TestDateTimeFormat(unittest.TestCase):
    def test_is_native_type(self):
        instance = DateTimeFormat()
        self.assertTrue(instance.is_native_type(datetime.datetime.now()))
        self.assertFalse(instance.is_native_type("2023-10-10T12:00:00"))

    def test_validate(self):
        instance = DateTimeFormat()
        self.assertEqual(instance.validate("2023-10-10T12:00:00Z"), datetime.datetime(2023, 10, 10, 12, 0, tzinfo=datetime.timezone.utc))
        with self.assertRaises(ValidationError):
            instance.validate("invalid-datetime")

    def test_serialize(self):
        instance = DateTimeFormat()
        self.assertEqual(instance.serialize(datetime.datetime(2023, 10, 10, 12, 0, tzinfo=datetime.timezone.utc)), "2023-10-10T12:00:00Z")
        self.assertIsNone(instance.serialize(None))

class TestUUIDFormat(unittest.TestCase):
    def test_is_native_type(self):
        instance = UUIDFormat()
        self.assertTrue(instance.is_native_type(uuid.uuid4()))
        self.assertFalse(instance.is_native_type("123e4567-e89b-12d3-a456-426614174000"))

    def test_validate(self):
        instance = UUIDFormat()
        valid_uuid = "123e4567-e89b-12d3-a456-426614174000"
        self.assertEqual(instance.validate(valid_uuid), uuid.UUID(valid_uuid))
        with self.assertRaises(ValidationError):
            instance.validate("invalid-uuid")

    def test_serialize(self):
        instance = UUIDFormat()
        valid_uuid = uuid.UUID("123e4567-e89b-12d3-a456-426614174000")
        self.assertEqual(instance.serialize(valid_uuid), "123e4567-e89b-12d3-a456-426614174000")

if __name__ == '__main__':
    unittest.main()