import unittest
from mimesis.providers.address import Address
from mimesis.enums import CountryCode


class TestAddress(unittest.TestCase):
    def setUp(self):
        self.address = Address()

    def test_init(self):
        self.assertIsInstance(self.address, Address)

    def test_dd_to_dms(self):
        result = Address._dd_to_dms(45.123456, 'lt')
        self.assertEqual(result, "45º7'24.442\"N")

    def test_street_number(self):
        result = self.address.street_number(100)
        self.assertTrue(1 <= int(result) <= 100)

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

    def test_state_abbr(self):
        result = self.address.state(abbr=True)
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

    def test_country_code_a3(self):
        result = self.address.country_code(fmt=CountryCode.A3)
        self.assertIsInstance(result, str)

    def test_country(self):
        result = self.address.country()
        self.assertIsInstance(result, str)

    def test_country_allow_random(self):
        result = self.address.country(allow_random=True)
        self.assertIsInstance(result, str)

    def test_city(self):
        result = self.address.city()
        self.assertIsInstance(result, str)

    def test_get_fs(self):
        result = self.address._get_fs('lt')
        self.assertIsInstance(result, float)

    def test_get_fs_dms(self):
        result = self.address._get_fs('lt', dms=True)
        self.assertIsInstance(result, str)

    def test_latitude(self):
        result = self.address.latitude()
        self.assertIsInstance(result, float)

    def test_latitude_dms(self):
        result = self.address.latitude(dms=True)
        self.assertIsInstance(result, str)

    def test_longitude(self):
        result = self.address.longitude()
        self.assertIsInstance(result, float)

    def test_longitude_dms(self):
        result = self.address.longitude(dms=True)
        self.assertIsInstance(result, str)

    def test_coordinates(self):
        result = self.address.coordinates()
        self.assertIsInstance(result, dict)

    def test_coordinates_dms(self):
        result = self.address.coordinates(dms=True)
        self.assertIsInstance(result, dict)

    def test_continent(self):
        result = self.address.continent()
        self.assertIsInstance(result, str)

    def test_continent_code(self):
        result = self.address.continent(code=True)
        self.assertIsInstance(result, str)

    def test_calling_code(self):
        result = self.address.calling_code()
        self.assertIsInstance(result, str)

if __name__ == '__main__':
    unittest.main()