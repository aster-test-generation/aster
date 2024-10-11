import unittest
from pypara.accounting.journaling import *



class TestDirection(unittest.TestCase):
    def test_of(self):
        result = Direction.of(Quantity(1))
        self.assertEqual(result, Direction.INC)

    def test_of_2(self):
        result = Direction.of(Quantity(-1))
        self.assertEqual(result, Direction.DEC)

class TestPosting(unittest.TestCase):
    def test_is_debit(self):
        import datetime
        result = Posting(journal, datetime.date(2022, 1, 1), Account(AccountType.ASSETS, "test"), Direction.INC, Amount(1)).is_debit
        self.assertEqual(result, True)

    def test_is_debit_2(self):
        journal = JournalEntry(datetime.date(2022, 1, 1), "test", "test")
        result = Posting(journal, datetime.date(2022, 1, 1), Account(AccountType.REVENUES, "test"), Direction.DEC, Amount(1)).is_debit
        self.assertEqual(result, False)

    def test_is_credit(self):
        journal = JournalEntry(datetime.date(2022, 1, 1), "test", "test")
        result = Posting(journal, datetime.date(2022, 1, 1), Account(AccountType.ASSETS, "test"), Direction.INC, Amount(1)).is_credit
        self.assertEqual(result, False)

    def test_is_credit_2(self):
        journal = JournalEntry(datetime.date(2022, 1, 1), "test", "test")
        result = Posting(journal, datetime.date(2022, 1, 1), Account(AccountType.REVENUES, "test"), Direction.DEC, Amount(1)).is_credit
        self.assertEqual(result, True)

class TestJournalEntry(unittest.TestCase):
    def test_increments(self):
        journal = JournalEntry(datetime.date(2022, 1, 1), "test", "test")
        result = journal.increments
        self.assertEqual(result, [])

    def test_decrements(self):
        journal = JournalEntry(datetime.date(2022, 1, 1), "test", "test")
        result = journal.decrements
        self.assertEqual(result, [])

    def test_debits(self):
        journal = JournalEntry(datetime.date(2022, 1, 1), "test", "test")
        result = journal.debits
        self.assertEqual(result, [])

    def test_credits(self):
        journal = JournalEntry(datetime.date(2022, 1, 1), "test", "test")
        result = journal.credits
        self.assertEqual(result, [])

    def test_post(self):
        journal = JournalEntry(datetime.date(2022, 1, 1), "test", "test")
        result = journal.post(datetime.date(2022, 1, 1), Account(AccountType.ASSETS, "test"), Quantity(1))
        self.assertEqual(result, journal)

    def test_validate(self):
        journal = JournalEntry(datetime.date(2022, 1, 1), "test", "test")
        result = journal.validate()
        self.assertEqual(result, None)


if __name__ == '__main__':
    unittest.main()