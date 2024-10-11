import unittest
from pypara.exchange import *


class TestFXRate(unittest.TestCase):
    def test_init(self):
        rate = FXRate(Currency("USD"), Currency("EUR"), date(2023, 1, 1), Decimal(1.2))
        self.assertEqual(rate.ccy1, Currency("USD"))
        self.assertEqual(rate.ccy2, Currency("EUR"))
        self.assertEqual(rate.date, date(2023, 1, 1))
        self.assertEqual(rate.value, Decimal(1.2))

    def test_invert(self):
        rate = FXRate(Currency("USD"), Currency("EUR"), date(2023, 1, 1), Decimal(1.2))
        inverted_rate = ~rate
        self.assertEqual(inverted_rate.ccy1, Currency("EUR"))
        self.assertEqual(inverted_rate.ccy2, Currency("USD"))
        self.assertEqual(inverted_rate.date, date(2023, 1, 1))
        self.assertEqual(inverted_rate.value, Decimal(1/1.2))

    def test_of(self):
        rate = FXRate.of(Currency("USD"), Currency("EUR"), date(2023, 1, 1), Decimal(1.2))
        self.assertEqual(rate.ccy1, Currency("USD"))
        self.assertEqual(rate.ccy2, Currency("EUR"))
        self.assertEqual(rate.date, date(2023, 1, 1))
        self.assertEqual(rate.value, Decimal(1.2))

class TestFXRateService(unittest.TestCase):
    def test_query(self):
        service = FXRateService()
        rate = service.query(Currency("USD"), Currency("EUR"), date(2023, 1, 1))
        self.assertIsInstance(rate, FXRate)
        self.assertEqual(rate.ccy1, Currency("USD"))
        self.assertEqual(rate.ccy2, Currency("EUR"))
        self.assertEqual(rate.date, date(2023, 1, 1))
        self.assertIsInstance(rate.value, Decimal)

    def test_queries(self):
        service = FXRateService()
        queries = [(Currency("USD"), Currency("EUR"), date(2023, 1, 1)), (Currency("EUR"), Currency("USD"), date(2023, 1, 1))]
        rates = service.queries(queries)
        for rate in rates:
            self.assertIsInstance(rate, FXRate)
            self.assertIn((rate.ccy1, rate.ccy2, rate.date), queries)
            self.assertIsInstance(rate.value, Decimal)

if __name__ == '__main__':
    unittest.main()