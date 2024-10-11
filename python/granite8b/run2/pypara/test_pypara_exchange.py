import unittest
from pypara.exchange import FXRate, FXRateLookupError, FXRateService


class TestFXRate(unittest.TestCase):
    def test_of(self):
        rate = FXRate.of(Currency.USD, Currency.EUR, Date(2023, 1, 1), Decimal("1.20"))
        self.assertEqual(rate.ccy1, Currency("USD"))
        self.assertEqual(rate.ccy2, Currency("EUR"))
        self.assertEqual(rate.date, Date(2023, 1, 1))
        self.assertEqual(rate.value, Decimal("1.20"))

    def test_invert(self):
        rate = FXRate.of(Currency.USD, Currency.EUR, Date(2023, 1, 1), Decimal("1.20"))
        inverted = ~rate
        self.assertEqual(inverted.ccy1, Currency("EUR"))
        self.assertEqual(inverted.ccy2, Currency("USD"))
        self.assertEqual(inverted.date, Date(2023, 1, 1))
        self.assertEqual(inverted.value, Decimal("0.833333333333333"))

class TestFXRateLookupError(unittest.TestCase):
    def test_init(self):
        error = FXRateLookupError(Currency("USD"), Currency("EUR"), Date(2023, 1, 1))
        self.assertEqual(error.ccy1, Currency("USD"))
        self.assertEqual(error.ccy2, Currency("EUR"))
        self.assertEqual(error.asof, Date(2023, 1, 1))
        self.assertEqual(str(error), "Foreign exchange rate for USD/EUR not found as of 2023-01-01")

class TestFXRateService(unittest.TestCase):
    def test_query(self):
        service = FXRateService()
        rate = service.query(Currency("USD"), Currency("EUR"), Date(2023, 1, 1))
        self.assertIsNotNone(rate)
        self.assertEqual(rate.ccy1, Currency("USD"))
        self.assertEqual(rate.ccy2, Currency("EUR"))
        self.assertEqual(rate.date, Date(2023, 1, 1))
        self.assertTrue(rate.value > ZERO)

    def test_queries(self):
        service = FXRateService()
        rates = service.queries([(Currency("USD"), Currency("EUR"), Date(2023, 1, 1)), (Currency("EUR"), Currency("USD"), Date(2023, 1, 1))])
        self.assertEqual(len(rates), 2)
        self.assertIsNotNone(rates[0])
        self.assertIsNotNone(rates[1])
        self.assertEqual(rates[0].ccy1, Currency("USD"))
        self.assertEqual(rates[0].ccy2, Currency("EUR"))
        self.assertEqual(rates[0].date, Date(2023, 1, 1))
        self.assertEqual(rates[1].ccy1, Currency("EUR"))
        self.assertEqual(rates[1].ccy2, Currency("USD"))
        self.assertEqual(rates[1].date, Date(2023, 1, 1))
        self.assertTrue(rates[0].value > ZERO)
        self.assertTrue(rates[1].value > ZERO)

if __name__ == '__main__':
    unittest.main()