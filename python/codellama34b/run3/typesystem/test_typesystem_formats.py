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
        result = instance.validate("2019-01-01")
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
        result = instance.validate("12:00:00")
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
        result = instance.validate("2020-01-01T00:00:00")
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
        result = instance.validate("12345678-1234-5678-1234-567812345678")
        self.assertEqual(result, None)
    def test_serialize(self):
        instance = UUIDFormat()
        result = instance.serialize("obj")
        self.assertEqual(result, 'obj')



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