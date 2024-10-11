from mimesis.providers.address import CountryCode
import unittest
from mimesis.providers.address import Address


class TestAddress(unittest.TestCase):
    def test_street_number(self):
        instance = Address()
        result = instance.street_number(1000)
        self.assertEqual(result, '1000')

    def test_street_name(self):
        instance = Address()
        result = instance.street_name()
        self.assertEqual(result, 'street_name')

    def test_street_suffix(self):
        instance = Address()
        result = instance.street_suffix()
        self.assertEqual(result, 'street_suffix')

    def test_address(self):
        instance = Address()
        result = instance.address()
        self.assertEqual(result, 'address_fmt')

    def test_state(self):
        instance = Address()
        result = instance.state(True)
        self.assertEqual(result, 'state_abbr')

    def test_region(self):
        instance = Address()
        result = instance.region(True)
        self.assertEqual(result, 'state_abbr')

    def test_province(self):
        instance = Address()
        result = instance.province(True)
        self.assertEqual(result, 'state_abbr')

    def test_federal_subject(self):
        instance = Address()
        result = instance.federal_subject(True)
        self.assertEqual(result, 'state_abbr')

    def test_prefecture(self):
        instance = Address()
        result = instance.prefecture(True)
        self.assertEqual(result, 'state_abbr')

    def test_postal_code(self):
        instance = Address()
        result = instance.postal_code()
        self.assertEqual(result, 'postal_code_fmt')

    def test_zip_code(self):
        instance = Address()
        result = instance.zip_code()
        self.assertEqual(result, 'postal_code_fmt')

    def test_country_code(self):
        instance = Address()
        result = instance.country_code(CountryCode.A2)
        self.assertEqual(result, 'country_code')

    def test_country(self):
        instance = Address()
        result = instance.country(True)
        self.assertEqual(result, 'country_name')

    def test_city(self):
        instance = Address()
        result = instance.city()
        self.assertEqual(result, 'city')

    def test_latitude(self):
        instance = Address()
        result = instance.latitude(True)
        self.assertEqual(result, 'dd_to_dms')

    def test_longitude(self):
        instance = Address()
        result = instance.longitude(True)
        self.assertEqual(result, 'dd_to_dms')

    def test_coordinates(self):
        instance = Address()
        result = instance.coordinates(True)
        self.assertEqual(result, {'longitude': 'dd_to_dms', 'latitude': 'dd_to_dms'})

    def test_continent(self):
        instance = Address()
        result = instance.continent(True)
        self.assertEqual(result, 'continent_code')

    def test_calling_code(self):
        instance = Address()
        result = instance.calling_code()
        self.assertEqual(result, 'calling_code')


if __name__ == '__main__':
    unittest.main()