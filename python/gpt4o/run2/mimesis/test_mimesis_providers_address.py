import unittest
from mimesis.providers.address import Address
from mimesis.enums import CountryCode


class TestAddress(unittest.TestCase):
    def setUp(self):
        self.address = Address()

    def test_init(self):
        self.assertEqual(self.address._datafile, 'address.json')

    def test_dd_to_dms(self):
        result = Address._dd_to_dms(45.123456, 'lt')
        self.assertEqual(result, "45º7'24.442\"N")

    def test_street_number(self):
        result = self.address.street_number(100)
        self.assertTrue(1 <= int(result) <= 100)

    def test_street_name(self):
        self.address._data = {'street': {'name': ['Main', 'Second']}}
        result = self.address.street_name()
        self.assertIn(result, ['Main', 'Second'])

    def test_street_suffix(self):
        self.address._data = {'street': {'suffix': ['St', 'Ave']}}
        result = self.address.street_suffix()
        self.assertIn(result, ['St', 'Ave'])

    def test_address(self):
        self.address._data = {
            'address_fmt': '{st_num} {st_name} {st_sfx}',
            'street': {'name': ['Main'], 'suffix': ['St']},
            'city': ['Tokyo']
        }
        self.address.locale = 'en'
        result = self.address.address()
        self.assertTrue(result.startswith('1 Main St'))

    def test_state(self):
        self.address._data = {'state': {'name': ['California'], 'abbr': ['CA']}}
        result = self.address.state()
        self.assertIn(result, ['California', 'CA'])

    def test_region(self):
        self.address._data = {'state': {'name': ['California'], 'abbr': ['CA']}}
        result = self.address.region()
        self.assertIn(result, ['California', 'CA'])

    def test_province(self):
        self.address._data = {'state': {'name': ['California'], 'abbr': ['CA']}}
        result = self.address.province()
        self.assertIn(result, ['California', 'CA'])

    def test_federal_subject(self):
        self.address._data = {'state': {'name': ['California'], 'abbr': ['CA']}}
        result = self.address.federal_subject()
        self.assertIn(result, ['California', 'CA'])

    def test_prefecture(self):
        self.address._data = {'state': {'name': ['California'], 'abbr': ['CA']}}
        result = self.address.prefecture()
        self.assertIn(result, ['California', 'CA'])

    def test_postal_code(self):
        self.address._data = {'postal_code_fmt': '#####'}
        result = self.address.postal_code()
        self.assertEqual(len(result), 5)

    def test_zip_code(self):
        self.address._data = {'postal_code_fmt': '#####'}
        result = self.address.zip_code()
        self.assertEqual(len(result), 5)

    def test_country_code(self):
        result = self.address.country_code(CountryCode.A2)
        self.assertIn(result, ['US', 'CA', 'GB'])

    def test_country(self):
        self.address._data = {'country': {'name': ['USA'], 'current_locale': 'USA'}}
        result = self.address.country()
        self.assertEqual(result, 'USA')

    def test_city(self):
        self.address._data = {'city': ['New York', 'Los Angeles']}
        result = self.address.city()
        self.assertIn(result, ['New York', 'Los Angeles'])

    def test_get_fs(self):
        result = self.address._get_fs('lt', dms=True)
        self.assertTrue(isinstance(result, str))

    def test_latitude(self):
        result = self.address.latitude(dms=True)
        self.assertTrue(isinstance(result, str))

    def test_longitude(self):
        result = self.address.longitude(dms=True)
        self.assertTrue(isinstance(result, str))

    def test_coordinates(self):
        result = self.address.coordinates(dms=True)
        self.assertTrue(isinstance(result, dict))
        self.assertIn('longitude', result)
        self.assertIn('latitude', result)

    def test_continent(self):
        self.address._data = {'continent': ['Asia', 'Europe']}
        result = self.address.continent()
        self.assertIn(result, ['Asia', 'Europe'])

    def test_calling_code(self):
        result = self.address.calling_code()
        self.assertTrue(result.startswith('+'))

if __name__ == '__main__':
    unittest.main()