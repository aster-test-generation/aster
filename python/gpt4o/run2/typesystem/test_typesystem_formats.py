import unittest
import datetime
import uuid
from typesystem.formats import BaseFormat, DateFormat, TimeFormat, DateTimeFormat, UUIDFormat
from typesystem.base import ValidationError


class TestBaseFormat(unittest.TestCase):
    def test_validation_error(self):
        instance = BaseFormat()
        instance.errors = {"test_code": "Test error message."}
        instance.some_attr = "some_value"
        error = instance.validation_error("test_code")
        self.assertIsInstance(error, ValidationError)
        self.assertEqual(error.message, "Test error message.")
        self.assertEqual(error.code, "test_code")

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

    def test_validate_valid_date(self):
        instance = DateFormat()
        result = instance.validate("2023-10-10")
        self.assertEqual(result, datetime.date(2023, 10, 10))

    def test_validate_invalid_format(self):
        instance = DateFormat()
        with self.assertRaises(ValidationError) as context:
            instance.validate("10-10-2023")
        self.assertEqual(str(context.exception), "Must be a valid date format.")

    def test_validate_invalid_date(self):
        instance = DateFormat()
        with self.assertRaises(ValidationError) as context:
            instance.validate("2023-02-30")
        self.assertEqual(str(context.exception), "Must be a real date.")

    def test_serialize(self):
        instance = DateFormat()
        date_obj = datetime.date(2023, 10, 10)
        self.assertEqual(instance.serialize(date_obj), "2023-10-10")
        self.assertIsNone(instance.serialize(None))

class TestTimeFormat(unittest.TestCase):
    def test_is_native_type(self):
        instance = TimeFormat()
        self.assertTrue(instance.is_native_type(datetime.time()))
        self.assertFalse(instance.is_native_type("12:00"))

    def test_validate_valid_time(self):
        instance = TimeFormat()
        result = instance.validate("12:30:45.123456")
        self.assertEqual(result, datetime.time(12, 30, 45, 123456))

    def test_validate_invalid_format(self):
        instance = TimeFormat()
        with self.assertRaises(ValidationError):
            instance.validate("12:30 PM")
        self.assertEqual(context.exception.text, "Must be a valid time format.")

    def test_validate_invalid_time(self):
        instance = TimeFormat()
        with self.assertRaises(ValidationError) as context:
            instance.validate("25:00")
        self.assertEqual(str(context.exception), "Must be a real time.")

    def test_serialize(self):
        instance = TimeFormat()
        time_obj = datetime.time(12, 30, 45, 123456)
        self.assertEqual(instance.serialize(time_obj), "12:30:45.123456")
        self.assertIsNone(instance.serialize(None))

class TestDateTimeFormat(unittest.TestCase):
    def test_is_native_type(self):
        instance = DateTimeFormat()
        self.assertTrue(instance.is_native_type(datetime.datetime.now()))
        self.assertFalse(instance.is_native_type("2023-10-10T12:00:00"))

    def test_validate_valid_datetime(self):
        instance = DateTimeFormat()
        result = instance.validate("2023-10-10T12:30:45.123456Z")
        self.assertEqual(result, datetime.datetime(2023, 10, 10, 12, 30, 45, 123456, tzinfo=datetime.timezone.utc))

    def test_validate_invalid_format(self):
        instance = DateTimeFormat()
        with self.assertRaises(ValidationError) as context:
            instance.validate("10-10-2023 12:30:45")
        self.assertEqual(str(context.exception), "Must be a valid datetime format.")

    def test_validate_invalid_datetime(self):
        instance = DateTimeFormat()
        with self.assertRaises(ValidationError) as context:
            instance.validate("2023-02-30T12:30:45")
        self.assertEqual(context.exception.message, "Must be a real datetime.")

    def test_serialize(self):
        instance = DateTimeFormat()
        datetime_obj = datetime.datetime(2023, 10, 10, 12, 30, 45, 123456, tzinfo=datetime.timezone.utc)
        self.assertEqual(instance.serialize(datetime_obj), "2023-10-10T12:30:45.123456Z")
        self.assertIsNone(instance.serialize(None))

class TestUUIDFormat(unittest.TestCase):
    def test_is_native_type(self):
        instance = UUIDFormat()
        self.assertTrue(instance.is_native_type(uuid.uuid4()))
        self.assertFalse(instance.is_native_type("123e4567-e89b-12d3-a456-426614174000"))

    def test_validate_valid_uuid(self):
        instance = UUIDFormat()
        valid_uuid = "123e4567-e89b-12d3-a456-426614174000"
        result = instance.validate(valid_uuid)
        self.assertEqual(result, uuid.UUID(valid_uuid))

    def test_validate_invalid_format(self):
        instance = UUIDFormat()
        with self.assertRaises(ValidationError) as context:
            instance.validate("invalid-uuid")
        self.assertEqual(str(context.exception), "Must be valid UUID format.")

    def test_serialize(self):
        instance = UUIDFormat()
        uuid_obj = uuid.UUID("123e4567-e89b-12d3-a456-426614174000")
        self.assertEqual(instance.serialize(uuid_obj), "123e4567-e89b-12d3-a456-426614174000")

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