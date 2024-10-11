import unittest
from mimesis.providers.address import Address


class TestAddress(unittest.TestCase):
    def test_street_number(self):
        address = Address()
        self.assertIsInstance(address.street_number(), str)
        self.assertGreaterEqual(int(address.street_number()), 1)
        self.assertLessEqual(int(address.street_number()), 1400)

    def test_street_name(self):
        address = Address()
        self.assertIsInstance(address.street_name(), str)

    def test_street_suffix(self):
        address = Address()
        self.assertIsInstance(address.street_suffix(), str)

    def test_address(self):
        address = Address()
        self.assertIsInstance(address.address(), str)

    def test_state(self):
        address = Address()
        self.assertIsInstance(address.state(), str)

    def test_region(self):
        address = Address()
        self.assertIsInstance(address.region(), str)

    def test_province(self):
        address = Address()
        self.assertIsInstance(address.province(), str)

    def test_federal_subject(self):
        address = Address()
        self.assertIsInstance(address.federal_subject(), str)

    def test_prefecture(self):
        address = Address()
        self.assertIsInstance(address.prefecture(), str)

    def test_postal_code(self):
        address = Address()
        self.assertIsInstance(address.postal_code(), str)

    def test_zip_code(self):
        address = Address()
        self.assertIsInstance(address.zip_code(), str)

    def test_country_code(self):
        address = Address()
        self.assertIsInstance(address.country_code(), str)

    def test_country(self):
        address = Address()
        self.assertIsInstance(address.country(), str)

    def test_city(self):
        address = Address()
        self.assertIsInstance(address.city(), str)

    def test_latitude(self):
        address = Address()
        self.assertIsInstance(address.latitude(), float)

    def test_longitude(self):
        address = Address()
        self.assertIsInstance(address.longitude(), float)

    def test_coordinates(self):
        address = Address()
        self.assertIsInstance(address.coordinates(), dict)

    def test_continent(self):
        address = Address()
        self.assertIsInstance(address.continent(), str)

    def test_calling_code(self):
        address = Address()
        self.assertIsInstance(address.calling_code(), str)

if __name__ == '__main__':
    unittest.main()