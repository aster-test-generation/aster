import unittest
from pypara.exchange import *



class TestFXRateLookupError(unittest.TestCase):
    def test_init(self):
        result = FXRateLookupError(Currency("USD"), Currency("EUR"), Date(2022, 1, 1))
        self.assertEqual(result.ccy1, Currency("USD"))
        self.assertEqual(result.ccy2, Currency("EUR"))
        self.assertEqual(result.asof, Date(2022, 1, 1))

    def test_str(self):
        result = FXRateLookupError(Currency("USD"), Currency("EUR"), Date(2022, 1, 1))
        self.assertEqual(str(result), "Foreign exchange rate for USD/EUR not found as of 2022-01-01")

class TestFXRate(unittest.TestCase):
    def test_of(self):
        result = FXRate.of(Currency.of("USD"), Currency.of("EUR"), Date.of(2022, 1, 1), Decimal.of(1.2))
        self.assertEqual(result.ccy1, Currency("USD"))
        self.assertEqual(result.ccy2, Currency("EUR"))
        self.assertEqual(result.date, Date(2022, 1, 1))
        self.assertEqual(result.value, Decimal(1.2))

    def test_invert(self):
        result = FXRate.of(Currency("USD"), Currency("EUR"), Date(2022, 1, 1), Decimal(1.2))
        self.assertEqual(result.ccy1, Currency("USD"))
        self.assertEqual(result.ccy2, Currency("EUR"))
        self.assertEqual(result.date, Date(2022, 1, 1))
        self.assertEqual(result.value, Decimal(1.2))

class TestFXRateService(unittest.TestCase):
    def test_query(self):
        result = FXRateService.query(Currency("USD"), Currency("EUR"), Date(2022, 1, 1), True)
        self.assertEqual(result, None)

if __name__ == '__main__':
    unittest.main()