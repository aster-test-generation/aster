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

    def test_str(self):
        ccy1 = Currency("USD")
        ccy2 = Currency("EUR")
        date = Date(2022, 1, 1)
        value = Decimal("1.2345")
        rate = FXRate(ccy1, ccy2, date, value)
        self.assertEqual(str(rate), "FXRate(USD, EUR, 2022-01-01, 1.2345)")

    def test_repr(self):
        ccy1 = Currency("USD")
        ccy2 = Currency("EUR")
        date = Date(2022, 1, 1)
        value = Decimal("1.2345")
        rate = FXRate(ccy1, ccy2, date, value)
        self.assertEqual(repr(rate), "FXRate(ccy1=USD, ccy2=EUR, date=2022-01-01, value=1.2345)")

class TestFXRateService(unittest.TestCase):
    def test_init(self):
        service = FXRateService()
        self.assertIsInstance(service, FXRateService)

    def test_query(self):
        service = FXRateService()
        ccy1 = Currency("USD")
        ccy2 = Currency("EUR")
        asof = Date(2022, 1, 1)
        with self.assertRaises(NotImplementedError):
            service.query(ccy1, ccy2, asof)

    def test_queries(self):
        service = FXRateService()
        queries = [(Currency("USD"), Currency("EUR"), Date(2022, 1, 1))]
        with self.assertRaises(NotImplementedError):
            service.queries(queries)

if __name__ == '__main__':
    unittest.main()