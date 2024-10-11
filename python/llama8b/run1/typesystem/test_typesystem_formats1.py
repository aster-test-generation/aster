import unittest
from typesystem.formats import DateFormat, TimeFormat, DateTimeFormat, UUIDFormat

class TestDateFormat(unittest.TestCase):
    def test_is_native_type(self):
        date_format = DateFormat()
        self.assertTrue(date_format.is_native_type(datetime.date(2022, 1, 1)))

    def test_validate(self):
        date_format = DateFormat()
        self.assertEqual(date_format.validate("2022-01-01"), datetime.date(2022, 1, 1))

    def test_serialize(self):
        date_format = DateFormat()
        self.assertEqual(date_format.serialize(datetime.date(2022, 1, 1)), "2022-01-01")

    def test_validate_invalid_date(self):
        date_format = DateFormat()
        with self.assertRaises(ValidationError):
            date_format.validate("invalid_date")

    def test_serialize_none(self):
        date_format = DateFormat()
        self.assertIsNone(date_format.serialize(None))

class TestTimeFormat(unittest.TestCase):
    def test_is_native_type(self):
        time_format = TimeFormat()
        self.assertTrue(time_format.is_native_type(datetime.time(12, 30)))

    def test_validate(self):
        time_format = TimeFormat()
        self.assertEqual(time_format.validate("12:30"), datetime.time(12, 30))

    def test_serialize(self):
        time_format = TimeFormat()
        self.assertEqual(time_format.serialize(datetime.time(12, 30)), "12:30:00")

    def test_validate_invalid_time(self):
        time_format = TimeFormat()
        with self.assertRaises(ValidationError):
            time_format.validate("invalid_time")

    def test_serialize_none(self):
        time_format = TimeFormat()
        self.assertIsNone(time_format.serialize(None))

class TestDateTimeFormat(unittest.TestCase):
    def test_is_native_type(self):
        date_time_format = DateTimeFormat()
        self.assertTrue(date_time_format.is_native_type(datetime.datetime(2022, 1, 1, 12, 30)))

    def test_validate(self):
        date_time_format = DateTimeFormat()
        self.assertEqual(date_time_format.validate("2022-01-01T12:30"), datetime.datetime(2022, 1, 1, 12, 30))

    def test_serialize(self):
        date_time_format = DateTimeFormat()
        self.assertEqual(date_time_format.serialize(datetime.datetime(2022, 1, 1, 12, 30)), "2022-01-01T12:30:00")

    def test_validate_invalid_date_time(self):
        date_time_format = DateTimeFormat()
        with self.assertRaises(ValidationError):
            date_time_format.validate("invalid_date_time")

    def test_serialize_none(self):
        date_time_format = DateTimeFormat()
        self.assertIsNone(date_time_format.serialize(None))

class TestUUIDFormat(unittest.TestCase):
    def test_is_native_type(self):
        uuid_format = UUIDFormat()
        self.assertTrue(uuid_format.is_native_type(uuid.UUID("12345678-1234-1234-1234-123456789012")))

    def test_validate(self):
        uuid_format = UUIDFormat()
        self.assertEqual(uuid_format.validate("12345678-1234-1234-1234-123456789012"), uuid.UUID("12345678-1234-1234-1234-123456789012"))

    def test_serialize(self):
        uuid_format = UUIDFormat()
        self.assertEqual(uuid_format.serialize(uuid.UUID("12345678-1234-1234-1234-123456789012")), "12345678-1234-1234-1234-123456789012")

    def test_validate_invalid_uuid(self):
        uuid_format = UUIDFormat()
        with self.assertRaises(ValidationError):
            uuid_format.validate("invalid_uuid")

    def test_serialize_none(self):
        uuid_format = UUIDFormat()
        self.assertIsNone(uuid_format.serialize(None))

if __name__ == '__main__':
    unittest.main()