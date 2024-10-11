import unittest
from mimesis.providers.address import Address


class TestAddress(unittest.TestCase):
    def setUp(self):
        self.address = Address()

    def test_street_number(self):
        self.assertGreaterEqual(self.address.street_number(), 1)
        self.assertLessEqual(self.address.street_number(), 1400)

    def test_street_name(self):
        self.assertIn(self.address.street_name(), self.address._data['street']['name'])

    def test_street_suffix(self):
        self.assertIn(self.address.street_suffix(), self.address._data['street']['suffix'])

    def test_address(self):
        fmt = self.address._data['address_fmt']
        st_num = self.address.street_number()
        st_name = self.address.street_name()
        if self.address.locale in SHORTENED_ADDRESS_FMT:
            self.assertEqual(self.address.address(), fmt.format(st_num=st_num, st_name=st_name))
        if self.address.locale == 'ja':
            self.assertEqual(self.address.address(), fmt.format(self.address.random.choice(self.address._data['city']), *self.address.random.randints(amount=3, a=1, b=100)))
        self.assertEqual(self.address.address(), fmt.format(st_num=st_num, st_name=st_name, st_sfx=self.address.street_suffix()))

    def test_state(self):
        self.assertIn(self.address.state(), self.address._data['state']['name'])

    def test_region(self):
        self.assertEqual(self.address.region(), self.address.state())

    def test_province(self):
        self.assertEqual(self.address.province(), self.address.state())

    def test_federal_subject(self):
        self.assertEqual(self.address.federal_subject(), self.address.state())

    def test_prefecture(self):
        self.assertEqual(self.address.prefecture(), self.address.state())

    def test_postal_code(self):
        self.assertEqual(len(self.address.postal_code()), 5)

    def test_zip_code(self):
        self.assertEqual(self.address.zip_code(), self.address.postal_code())

    def test_country_code(self):
        self.assertIn(self.address.country_code(), COUNTRY_CODES['A2'])

    def test_country(self):
        self.assertIn(self.address.country(), self.address._data['country']['name'])

    def test_city(self):
        self.assertIn(self.address.city(), self.address._data['city'])

    def test_latitude(self):
        self.assertGreaterEqual(self.address.latitude(), -90)
        self.assertLessEqual(self.address.latitude(), 90)

    def test_longitude(self):
        self.assertGreaterEqual(self.address.longitude(), -180)
        self.assertLessEqual(self.address.longitude(), 180)

    def test_coordinates(self):
        coords = self.address.coordinates()
        self.assertGreaterEqual(coords['longitude'], -180)
        self.assertLessEqual(coords['longitude'], 180)
        self.assertGreaterEqual(coords['latitude'], -90)
        self.assertLessEqual(coords['latitude'], 90)

    def test_continent(self):
        self.assertIn(self.address.continent(), CONTINENT_CODES)

if __name__ == '__main__':
    unittest.main()