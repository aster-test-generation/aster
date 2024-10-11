import unittest
from pypara.accounting.journaling import *


class TestDirection(unittest.TestCase):
    def test_of(self):
        result = Direction.of(1)
        self.assertEqual(result, Direction.INC)

    def test_of(self):
        result = Direction.of(1)
        self.assertEqual(result, Direction.DEC)

class TestPosting(unittest.TestCase):
    def test_is_debit(self):
        journal = JournalEntry(datetime.date(2022, 1, 1), "test", "test")
        result = Posting(journal, datetime.date(2022, 1, 1), Account(AccountType.ASSETS, "test"), Direction.INC, 1)
        self.assertTrue(result.is_debit)

    def test_is_credit(self):
        journal = JournalEntry(datetime.date(2022, 1, 1), "test", "test")
        result = Posting(journal, datetime.date(2022, 1, 1), Account(AccountType.ASSETS, "test"), Direction.INC, 1)
        self.assertFalse(result.is_credit)

class TestJournalEntry(unittest.TestCase):
    def test_increments(self):
        journal = JournalEntry(datetime.date(2022, 1, 1), "test", "test")
        result = journal.increments()
        self.assertEqual(result, [])

    def test_decrements(self):
        journal = JournalEntry(datetime.date(2022, 1, 1), "test", "test")
        result = journal.decrements()
        self.assertEqual(result, [])

    def test_debits(self):
        journal = JournalEntry(datetime.date(2022, 1, 1), "test", "test")
        result = journal.debits()
        self.assertEqual(result, [])

    def test_credits(self):
        journal = JournalEntry(datetime.date(2022, 1, 1), "test", "test")
        result = journal.credits()
        self.assertEqual(result, [])

    def test_post(self):
        journal = JournalEntry(datetime.date(2022, 1, 1), "test", "test")
        result = journal.post(datetime.date(2022, 1, 1), Account(AccountType.ASSETS, "test"), 1)
        self.assertEqual(result.postings, [Posting(journal, datetime.date(2022, 1, 1), Account(AccountType.ASSETS, "test"), Direction.INC, 1)])

    def test_validate(self):
        journal = JournalEntry(datetime.date(2022, 1, 1), "test", "test")
        journal.post(datetime.date(2022, 1, 1), Account(AccountType.ASSETS, "test"), 1)
        journal.post(datetime.date(2022, 1, 1), Account(AccountType.ASSETS, "test"), -1)
        result = journal.validate()
        self.assertEqual(result, None)

class TestReadJournalEntries(unittest.TestCase):
    def test_call(self):
        result = ReadJournalEntries(datetime.date(2022, 1, 1), datetime.date(2022, 1, 1))
        self.assertEqual(result, [])

if __name__ == '__main__':
    unittest.main()