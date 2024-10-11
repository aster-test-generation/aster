import unittest
from mimesis.providers.address import Address


class TestAddress(unittest.TestCase):
    def setUp(self):
        self.address = Address()

    def test_street_number(self):
        result = self.address.street_number()
        self.assertIsInstance(result, str)

    def test_street_name(self):
        result = self.address.street_name()
        self.assertIsInstance(result, str)

    def test_street_suffix(self):
        result = self.address.street_suffix()
        self.assertIsInstance(result, str)

    def test_address(self):
        result = self.address.address()
        self.assertIsInstance(result, str)

    def test_state(self):
        result = self.address.state()
        self.assertIsInstance(result, str)

    def test_region(self):
        result = self.address.region()
        self.assertIsInstance(result, str)

    def test_province(self):
        result = self.address.province()
        self.assertIsInstance(result, str)

    def test_federal_subject(self):
        result = self.address.federal_subject()
        self.assertIsInstance(result, str)

    def test_prefecture(self):
        result = self.address.prefecture()
        self.assertIsInstance(result, str)

    def test_postal_code(self):
        result = self.address.postal_code()
        self.assertIsInstance(result, str)

    def test_zip_code(self):
        result = self.address.zip_code()
        self.assertIsInstance(result, str)

    def test_country_code(self):
        result = self.address.country_code()
        self.assertIsInstance(result, str)

    def test_country(self):
        result = self.address.country()
        self.assertIsInstance(result, str)

    def test_city(self):
        result = self.address.city()
        self.assertIsInstance(result, str)

    def test_latitude(self):
        result = self.address.latitude()
        self.assertIsInstance(result, float)

    def test_longitude(self):
        result = self.address.longitude()
        self.assertIsInstance(result, float)

    def test_coordinates(self):
        result = self.address.coordinates()
        self.assertIsInstance(result, dict)

    def test_continent(self):
        result = self.address.continent()
        self.assertIsInstance(result, str)

    def test_calling_code(self):
        result = self.address.calling_code()
        self.assertIsInstance(result, str)

if __name__ == '__main__':
    unittest.main()