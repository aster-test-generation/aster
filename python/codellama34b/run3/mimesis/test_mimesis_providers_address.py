import unittest
from mimesis.providers.address import Address


class TestAddress(unittest.TestCase):
    def test_street_number(self):
        instance = Address()
        result = instance.street_number()
        self.assertIsInstance(result, str)
    def test_street_name(self):
        instance = Address()
        result = instance.street_name()
        self.assertIsInstance(result, str)
    def test_street_suffix(self):
        instance = Address()
        result = instance.street_suffix()
        self.assertIsInstance(result, str)
    def test_address(self):
        instance = Address()
        result = instance.address()
        self.assertIsInstance(result, str)
    def test_state(self):
        instance = Address()
        result = instance.state()
        self.assertIsInstance(result, str)
    def test_region(self):
        instance = Address()
        result = instance.region()
        self.assertIsInstance(result, str)
    def test_province(self):
        instance = Address()
        result = instance.province()
        self.assertIsInstance(result, str)
    def test_federal_subject(self):
        instance = Address()
        result = instance.federal_subject()
        self.assertIsInstance(result, str)
    def test_prefecture(self):
        instance = Address()
        result = instance.prefecture()
        self.assertIsInstance(result, str)
    def test_postal_code(self):
        instance = Address()
        result = instance.postal_code()
        self.assertIsInstance(result, str)
    def test_zip_code(self):
        instance = Address()
        result = instance.zip_code()
        self.assertIsInstance(result, str)
    def test_country_code(self):
        instance = Address()
        result = instance.country_code()
        self.assertIsInstance(result, str)
    def test_country(self):
        instance = Address()
        result = instance.country()
        self.assertIsInstance(result, str)
    def test_city(self):
        instance = Address()
        result = instance.city()
        self.assertIsInstance(result, str)
    def test_latitude(self):
        instance = Address()
        result = instance.latitude()
        self.assertIsInstance(result, float)
    def test_longitude(self):
        instance = Address()
        result = instance.longitude()
        self.assertIsInstance(result, float)
    def test_coordinates(self):
        instance = Address()
        result = instance.coordinates()
        self.assertIsInstance(result, dict)
    def test_continent(self):
        instance = Address()
        result = instance.continent()
        self.assertIsInstance(result, str)
    def test_calling_code(self):
        instance = Address()
        result = instance.calling_code()
        self.assertIsInstance(result, str)


if __name__ == '__main__':
    unittest.main()