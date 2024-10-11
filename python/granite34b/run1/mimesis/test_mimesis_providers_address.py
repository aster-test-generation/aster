from mimesis.providers.address import COUNTRY_CODES
import unittest
from mimesis.providers.address import Address


class TestAddress(unittest.TestCase):
    def setUp(self):
        self.address = Address()

    def test_street_number(self):
        result = self.address.street_number()
        self.assertIsInstance(result, str)
        self.assertGreater(int(result), 0)
        self.assertLess(int(result), 1400)

    def test_street_name(self):
        result = self.address.street_name()
        self.assertIsInstance(result, str)
        self.assertIn(result, self.address._data['street']['name'])

    def test_street_suffix(self):
        result = self.address.street_suffix()
        self.assertIsInstance(result, str)
        self.assertIn(result, self.address._data['street']['suffix'])

    def test_address(self):
        result = self.address.address()
        self.assertIsInstance(result, str)
        self.assertIn(self.address.street_number(), result)
        self.assertIn(self.address.street_name(), result)
        self.assertIn(self.address.street_suffix(), result)

    def test_state(self):
        result = self.address.state()
        self.assertIsInstance(result, str)
        self.assertIn(result, self.address._data['state']['name'])

    def test_region(self):
        result = self.address.region()
        self.assertIsInstance(result, str)
        self.assertEqual(result, self.address.state())

    def test_province(self):
        result = self.address.province()
        self.assertIsInstance(result, str)
        self.assertEqual(result, self.address.state())

    def test_federal_subject(self):
        result = self.address.federal_subject()
        self.assertIsInstance(result, str)
        self.assertEqual(result, self.address.state())

    def test_prefecture(self):
        result = self.address.prefecture()
        self.assertIsInstance(result, str)
        self.assertEqual(result, self.address.state())

    def test_postal_code(self):
        result = self.address.postal_code()
        self.assertIsInstance(result, str)
        self.assertEqual(len(result), len(self.address._data['postal_code_fmt']))

    def test_zip_code(self):
        result = self.address.zip_code()
        self.assertIsInstance(result, str)
        self.assertEqual(result, self.address.postal_code())

    def test_country_code(self):
        result = self.address.country_code()
        self.assertIsInstance(result, str)
        self.assertIn(result, COUNTRY_CODES['a2'])

    def test_country(self):
        result = self.address.country()
        self.assertIsInstance(result, str)
        self.assertIn(result, self.address._data['country']['name'])

    def test_city(self):
        result = self.address.city()
        self.assertIsInstance(result, str)
        self.assertIn(result, self.address._data['city'])

    def test_latitude(self):
        result = self.address.latitude()
        self.assertIsInstance(result, float)
        self.assertGreaterEqual(result, -90)
        self.assertLessEqual(result, 90)

    def test_longitude(self):
        result = self.address.longitude()
        self.assertIsInstance(result, float)
        self.assertGreaterEqual(result, -180)
        self.assertLessEqual(result, 180)

    def test_coordinates(self):
        result = self.address.coordinates()
        self.assertIsInstance(result, dict)
        self.assertIn('latitude', result)
        self.assertIn('longitude', result)
        self.assertGreaterEqual(result['latitude'], -90)
        self.assertLessEqual(result['latitude'], 90)
        self.assertGreaterEqual(result['longitude'], -180)
        self.assertLessEqual(result['longitude'], 180)

    def test_continent(self):
        result = self.address.continent()
        self.assertIsInstance(result, str)
        self.assertIn(result, self.address._data['continent'])

if __name__ == '__main__':
    unittest.main()