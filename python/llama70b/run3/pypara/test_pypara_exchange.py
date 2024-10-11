import unittest
from pypara.exchange import FXRate, FXRateLookupError, FXRateService, Currency, Date


class TestFXRateLookupError(unittest.TestCase):
    def test_init(self):
        ccy1 = Currency("USD")
        ccy2 = Currency("EUR")
        asof = Date(2022, 1, 1)
        error = FXRateLookupError(ccy1, ccy2, asof)
        self.assertEqual(error.ccy1, ccy1)
        self.assertEqual(error.ccy2, ccy2)
        self.assertEqual(error.asof, asof)
        self.assertEqual(str(error), "Foreign exchange rate for USD/EUR not found as of 2022-01-01")

class TestFXRate(unittest.TestCase):
    def test_init(self):
        ccy1 = Currency("USD")
        ccy2 = Currency("EUR")
        date = Date(2022, 1, 1)
        value = Decimal("1.2345")
        rate = FXRate(ccy1, ccy2, date, value)
        self.assertEqual(rate.ccy1, ccy1)
        self.assertEqual(rate.ccy2, ccy2)
        self.assertEqual(rate.date, date)
        self.assertEqual(rate.value, value)

    def test_invert(self):
        ccy1 = Currency("USD")
        ccy2 = Currency("EUR")
        date = Date(2022, 1, 1)
        value = Decimal("1.2345")
        rate = FXRate(ccy1, ccy2, date, value)
        inverted_rate = ~rate
        self.assertEqual(inverted_rate.ccy1, ccy2)
        self.assertEqual(inverted_rate.ccy2, ccy1)
        self.assertEqual(inverted_rate.date, date)
        self.assertEqual(inverted_rate.value, value ** -1)

    def test_of(self):
        ccy1 = Currency("USD")
        ccy2 = Currency("EUR")
        date = Date(2022, 1, 1)
        value = Decimal("1.2345")
        rate = FXRate.of(ccy1, ccy2, date, value)
        self.assertEqual(rate.ccy1, ccy1)
        self.assertEqual(rate.ccy2, ccy2)
        self.assertEqual(rate.date, date)
        self.assertEqual(rate.value, value)

    def test_of_invalid_input(self):
        with self.assertRaises(ValueError):
            FXRate.of("USD", Currency("EUR"), Date(2022, 1, 1), Decimal("1.2345"))
        with self.assertRaises(ValueError):
            FXRate.of(Currency("USD"), "EUR", Date(2022, 1, 1), Decimal("1.2345"))
        with self.assertRaises(ValueError):
            FXRate.of(Currency("USD"), Currency("EUR"), "2022-01-01", Decimal("1.2345"))
        with self.assertRaises(ValueError):
            FXRate.of(Currency("USD"), Currency("EUR"), Date(2022, 1, 1), "1.2345")
        with self.assertRaises(ValueError):
            FXRate.of(Currency("USD"), Currency("USD"), Date(2022, 1, 1), Decimal("1.2345"))
        with self.assertRaises(ValueError):
            FXRate.of(Currency("USD"), Currency("EUR"), Date(2022, 1, 1), Decimal("0"))

class TestFXRateService(unittest.TestCase):
    def test_init(self):
        service = FXRateService()
        self.assertIsInstance(service, FXRateService)

    def test_query(self):
        service = FXRateService()
        with self.assertRaises(NotImplementedError):
            service.query(Currency("USD"), Currency("EUR"), Date(2022, 1, 1))

    def test_queries(self):
        service = FXRateService()
        with self.assertRaises(NotImplementedError):
            service.queries([(Currency("USD"), Currency("EUR"), Date(2022, 1, 1))])

if __name__ == '__main__':
    unittest.main()