import unittest
from mimesis.providers.address import Address


class TestAddress(unittest.TestCase):
    def setUp(self):
        self.address = Address()

    def test_street_number(self):
        self.assertIsInstance(self.address.street_number(), str)

    def test_street_name(self):
        self.assertIsInstance(self.address.street_name(), str)

    def test_street_suffix(self):
        self.assertIsInstance(self.address.street_suffix(), str)

    def test_address(self):
        self.assertIsInstance(self.address.address(), str)

    def test_state(self):
        self.assertIsInstance(self.address.state(), str)

    def test_region(self):
        self.assertIsInstance(self.address.region(), str)

    def test_province(self):
        self.assertIsInstance(self.address.province(), str)

    def test_federal_subject(self):
        self.assertIsInstance(self.address.federal_subject(), str)

    def test_prefecture(self):
        self.assertIsInstance(self.address.prefecture(), str)

    def test_postal_code(self):
        self.assertIsInstance(self.address.postal_code(), str)

    def test_zip_code(self):
        self.assertIsInstance(self.address.zip_code(), str)

    def test_country_code(self):
        self.assertIsInstance(self.address.country_code(), str)

    def test_country(self):
        self.assertIsInstance(self.address.country(), str)

    def test_city(self):
        self.assertIsInstance(self.address.city(), str)

    def test_latitude(self):
        self.assertIsInstance(self.address.latitude(), float)

    def test_longitude(self):
        self.assertIsInstance(self.address.longitude(), float)

    def test_coordinates(self):
        self.assertIsInstance(self.address.coordinates(), dict)

    def test_continent(self):
        self.assertIsInstance(self.address.continent(), str)

    def test_calling_code(self):
        self.assertIsInstance(self.address.calling_code(), str)

if __name__ == '__main__':
    unittest.main()