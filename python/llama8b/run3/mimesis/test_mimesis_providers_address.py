import unittest
from mimesis.providers.address import Address


class TestAddress(unittest.TestCase):
    def test_init(self):
        address = Address()
        self.assertIsNotNone(address._datafile)
        self.assertIsNotNone(address._pull)

    def test_street_number(self):
        address = Address()
        result = address.street_number()
        self.assertIsInstance(result, str)
        self.assertGreater(int(result), 0)

    def test_street_name(self):
        address = Address()
        result = address.street_name()
        self.assertIsInstance(result, str)

    def test_street_suffix(self):
        address = Address()
        result = address.street_suffix()
        self.assertIsInstance(result, str)

    def test_address(self):
        address = Address()
        result = address.address()
        self.assertIsInstance(result, str)

    def test_state(self):
        address = Address()
        result = address.state()
        self.assertIsInstance(result, str)

    def test_region(self):
        address = Address()
        result = address.region()
        self.assertIsInstance(result, str)

    def test_province(self):
        address = Address()
        result = address.province()
        self.assertIsInstance(result, str)

    def test_federal_subject(self):
        address = Address()
        result = address.federal_subject()
        self.assertIsInstance(result, str)

    def test_prefecture(self):
        address = Address()
        result = address.prefecture()
        self.assertIsInstance(result, str)

    def test_postal_code(self):
        address = Address()
        result = address.postal_code()
        self.assertIsInstance(result, str)

    def test_zip_code(self):
        address = Address()
        result = address.zip_code()
        self.assertIsInstance(result, str)

    def test_country_code(self):
        address = Address()
        result = address.country_code()
        self.assertIsInstance(result, str)

    def test_country(self):
        address = Address()
        result = address.country()
        self.assertIsInstance(result, str)

    def test_city(self):
        address = Address()
        result = address.city()
        self.assertIsInstance(result, str)

    def test_latitude(self):
        address = Address()
        result = address.latitude()
        self.assertIsInstance(result, (str, float))

    def test_longitude(self):
        address = Address()
        result = address.longitude()
        self.assertIsInstance(result, (str, float))

    def test_coordinates(self):
        address = Address()
        result = address.coordinates()
        self.assertIsInstance(result, dict)

    def test_continent(self):
        address = Address()
        result = address.continent()
        self.assertIsInstance(result, str)

    def test_calling_code(self):
        address = Address()
        result = address.calling_code()
        self.assertIsInstance(result, str)

if __name__ == '__main__':
    unittest.main()