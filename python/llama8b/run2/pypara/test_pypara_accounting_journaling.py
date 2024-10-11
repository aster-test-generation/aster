import unittest
from pypara.accounting.journaling import JournalEntry, Posting, Direction, Account, AccountType, isum
from datetime import date
from commons.numbers import Amoun
from ..commons.others import Guid


class TestJournalEntry(unittest.TestCase):
    def test_init(self):
        je = JournalEntry(date(2022, 1, 1), "Test", object())
        self.assertEqual(je.date, date(2022, 1, 1))
        self.assertEqual(je.description, "Test")
        self.assertEqual(je.source, object())
        self.assertEqual(len(je.postings), 0)
        self.assertEqual(je.guid, Guid())

    def test_post(self):
        je = JournalEntry(date(2022, 1, 1), "Test", object())
        je.post(date(2022, 1, 1), Account("Test", AccountType.ASSETS), Amount(100))
        self.assertEqual(len(je.postings), 1)
        self.assertEqual(je.postings[0].journal, je)
        self.assertEqual(je.postings[0].date, date(2022, 1, 1))
        self.assertEqual(je.postings[0].account, Account("Test", AccountType.ASSETS))
        self.assertEqual(je.postings[0].direction, Direction.INC)
        self.assertEqual(je.postings[0].amount, Amount(100))

    def test_validate(self):
        je = JournalEntry(date(2022, 1, 1), "Test", object())
        je.post(date(2022, 1, 1), Account("Test", AccountType.ASSETS), Amount(100))
        je.post(date(2022, 1, 1), Account("Test", AccountType.LIABILITIES), Amount(100))
        je.validate()
        self.assertTrue(True)

    def test_str(self):
        je = JournalEntry(date(2022, 1, 1), "Test", object())
        self.assertEqual(str(je), "JournalEntry")

    def test_repr(self):
        je = JournalEntry(date(2022, 1, 1), "Test", object())
        self.assertEqual(repr(je), "JournalEntry(2022-01-01)")

    def test_eq(self):
        je1 = JournalEntry(date(2022, 1, 1), "Test", object())
        je2 = JournalEntry(date(2022, 1, 1), "Test", object())
        self.assertEqual(je1, je2)

class TestPosting(unittest.TestCase):
    def test_init(self):
        je = JournalEntry(date(2022, 1, 1), "Test", object())
        p = Posting(je, date(2022, 1, 1), Account("Test", AccountType.ASSETS), Direction.INC, Amount(100))
        self.assertEqual(p.journal, je)
        self.assertEqual(p.date, date(2022, 1, 1))
        self.assertEqual(p.account, Account("Test", AccountType.ASSETS))
        self.assertEqual(p.direction, Direction.INC)
        self.assertEqual(p.amount, Amount(100))

    def test_is_debit(self):
        p = Posting(JournalEntry(date(2022, 1, 1), "Test", object()), date(2022, 1, 1), Account("Test", AccountType.ASSETS), Direction.INC, Amount(100))
        self.assertTrue(p.is_debit)

    def test_is_credit(self):
        p = Posting(JournalEntry(date(2022, 1, 1), "Test", object()), date(2022, 1, 1), Account("Test", AccountType.LIABILITIES), Direction.DEC, Amount(100))
        self.assertTrue(p.is_credit)

if __name__ == '__main__':
    unittest.main()