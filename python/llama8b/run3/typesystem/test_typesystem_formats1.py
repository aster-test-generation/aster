import unittest
from typesystem.formats import DateFormat, TimeFormat, DateTimeFormat, UUIDFormat

class TestDateFormat(unittest.TestCase):
    def test_is_native_type(self):
        date = datetime.date(2022, 1, 1)
        format = DateFormat()
        self.assertTrue(format.is_native_type(date))

    def test_validate_valid_date(self):
        date = "2022-01-01"
        format = DateFormat()
        result = format.validate(date)
        self.assertIsInstance(result, datetime.date)

    def test_validate_invalid_date(self):
        date = "2022-13-01"
        format = DateFormat()
        with self.assertRaises(ValidationError):
            format.validate(date)

    def test_serialize_valid_date(self):
        date = datetime.date(2022, 1, 1)
        format = DateFormat()
        result = format.serialize(date)
        self.assertEqual(result, "2022-01-01")

    def test_serialize_none(self):
        format = DateFormat()
        result = format.serialize(None)
        self.assertIsNone(result)

class TestTimeFormat(unittest.TestCase):
    def test_is_native_type(self):
        time = datetime.time(12, 30, 0)
        format = TimeFormat()
        self.assertTrue(format.is_native_type(time))

    def test_validate_valid_time(self):
        time = "12:30:00"
        format = TimeFormat()
        result = format.validate(time)
        self.assertIsInstance(result, datetime.time)

    def test_validate_invalid_time(self):
        time = "12:30:60"
        format = TimeFormat()
        with self.assertRaises(ValidationError):
            format.validate(time)

    def test_serialize_valid_time(self):
        time = datetime.time(12, 30, 0)
        format = TimeFormat()
        result = format.serialize(time)
        self.assertEqual(result, "12:30:00")

    def test_serialize_none(self):
        format = TimeFormat()
        result = format.serialize(None)
        self.assertIsNone(result)

class TestDateTimeFormat(unittest.TestCase):
    def test_is_native_type(self):
        datetime = datetime.datetime(2022, 1, 1, 12, 30, 0)
        format = DateTimeFormat()
        self.assertTrue(format.is_native_type(datetime))

    def test_validate_valid_datetime(self):
        datetime = "2022-01-01T12:30:00"
        format = DateTimeFormat()
        result = format.validate(datetime)
        self.assertIsInstance(result, datetime.datetime)

    def test_validate_invalid_datetime(self):
        datetime = "2022-13-01T12:30:00"
        format = DateTimeFormat()
        with self.assertRaises(ValidationError):
            format.validate(datetime)

    def test_serialize_valid_datetime(self):
        datetime = datetime.datetime(2022, 1, 1, 12, 30, 0)
        format = DateTimeFormat()
        result = format.serialize(datetime)
        self.assertEqual(result, "2022-01-01T12:30:00")

    def test_serialize_none(self):
        format = DateTimeFormat()
        result = format.serialize(None)
        self.assertIsNone(result)

class TestUUIDFormat(unittest.TestCase):
    def test_is_native_type(self):
        uuid = uuid.UUID("12345678-1234-1234-1234-123456789012")
        format = UUIDFormat()
        self.assertTrue(format.is_native_type(uuid))

    def test_validate_valid_uuid(self):
        uuid = "12345678-1234-1234-1234-123456789012"
        format = UUIDFormat()
        result = format.validate(uuid)
        self.assertIsInstance(result, uuid.UUID)

    def test_validate_invalid_uuid(self):
        uuid = "12345678-1234-1234-1234-1234567890"
        format = UUIDFormat()
        with self.assertRaises(ValidationError):
            format.validate(uuid)

    def test_serialize_valid_uuid(self):
        uuid = uuid.UUID("12345678-1234-1234-1234-123456789012")
        format = UUIDFormat()
        result = format.serialize(uuid)
        self.assertEqual(result, "12345678-1234-1234-1234-123456789012")

    def test_serialize_none(self):
        format = UUIDFormat()
        result = format.serialize(None)
        self.assertIsNone(result)

if __name__ == '__main__':
    unittest.main()