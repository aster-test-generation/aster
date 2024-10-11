import unittest
from pypara.exchange import *


class TestFXRate(unittest.TestCase):
    def test_of(self):
        rate = FXRate.of("USD", "EUR", date(2023, 1, 1), Decimal(1.2))
        self.assertEqual(rate.ccy1, Currency("USD"))
        self.assertEqual(rate.ccy2, Currency("EUR"))
        self.assertEqual(rate.date, date(2023, 1, 1))
        self.assertEqual(rate.value, Decimal(1.2))

    def test_invert(self):
        rate = FXRate("USD", "EUR", date(2023, 1, 1), Decimal(1.2))
        inverted_rate = ~rate
        self.assertEqual(inverted_rate.ccy1, Currency("EUR"))
        self.assertEqual(inverted_rate.ccy2, Currency("USD"))
        self.assertEqual(inverted_rate.date, date(2023, 1, 1))
        self.assertEqual(inverted_rate.value, Decimal(1/1.2))

class TestFXRateService(unittest.TestCase):
    def test_query(self):
        class MockFXRateService(FXRateService):
            def query(self, ccy1, ccy2, asof, strict=False):
                return FXRate(ccy1, ccy2, asof, Decimal(1.2))
        service = MockFXRateService.return_value
        rate = service.query(Currency("USD"), Currency("EUR"), date(2023, 1, 1))
        self.assertEqual(rate.ccy1, Currency("USD"))
        self.assertEqual(rate.ccy2, Currency("EUR"))
        self.assertEqual(rate.date, date(2023, 1, 1))
        self.assertEqual(rate.value, Decimal(1.2))

    def test_queries(self):
        class MockFXRateService(FXRateService):
            def queries(self, queries, strict=False):
                return [FXRate(ccy1, ccy2, asof, Decimal(1.2)) for ccy1, ccy2, asof in queries]
        service = MockFXRateService.return_value
        queries = [(Currency("USD"), Currency("EUR"), date(2023, 1, 1)), (Currency("EUR"), Currency("USD"), date(2023, 1, 2))]
        rates = service.queries(queries)
        self.assertEqual(rates[0].ccy1, Currency("USD"))
        self.assertEqual(rates[0].ccy2, Currency("EUR"))
        self.assertEqual(rates[0].date, date(2023, 1, 1))
        self.assertEqual(rates[0].value, Decimal(1.2))
        self.assertEqual(rates[1].ccy1, Currency("EUR"))
        self.assertEqual(rates[1].ccy2, Currency("USD"))
        self.assertEqual(rates[1].date, date(2023, 1, 2))
        self.assertEqual(rates[1].value, Decimal(1.2))

if __name__ == '__main__':
    unittest.main()