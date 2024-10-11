import unittest
import datetime
from pypara.accounting.journaling import Direction, JournalEntry, Posting, ReadJournalEntries
from pypara.commons.numbers import Amount, Quantity, isum
from pypara.commons.others import Guid, makeguid
from pypara.commons.zeitgeist import DateRange
from pypara.accounting.accounts import Account, AccountType


class TestDirection(unittest.TestCase):
    def test_direction_of_positive_quantity(self):
        quantity = Quantity(5)
        result = Direction.of(quantity).is_zero()
        self.assertEqual(result, Direction.INC)

    def test_direction_of_negative_quantity(self):
        quantity = Quantity(-5)
        result = Direction.of(quantity).is_zero()
        self.assertEqual(result, Direction.DEC)

    def test_direction_of_zero_quantity(self):
        quantity = Quantity(0)
        with self.assertRaises(AssertionError):
            Direction.of(Quantity(quantity))

class TestPosting(unittest.TestCase):
    def setUp(self):
        self.journal = JournalEntry(datetime.date.today(), "Test Entry", "Test Source")
        self.account = ConcreteAccount("Test Account", AccountType.ASSETS)
        self.posting = Posting(self.journal, datetime.date.today(), self.account, Direction.INC, Amount(100))

    def test_is_debit(self):
        self.assertTrue(self.posting.is_debit)

    def test_is_credit(self):
        self.assertFalse(self.posting.is_credit)

class TestJournalEntry(unittest.TestCase):
    def setUp(self):
        self.journal_entry = JournalEntry(datetime.date.today(), "Test Entry", "Test Source")
        self.account = ConcreteAccount("Test Account", AccountType.ASSETS)

    def test_increments(self):
        self.journal_entry.post(datetime.date.today(), self.account, Quantity(5))
        increments = list(self.journal_entry.increments)
        self.assertEqual(len(increments), 1)

    def test_decrements(self):
        self.journal_entry.post(datetime.date.today(), self.account, Quantity(-5))
        decrements = list(self.journal_entry.decrements)
        self.assertEqual(len(decrements), 1)

    def test_debits(self):
        self.journal_entry.post(datetime.date.today(), self.account, Quantity(5))
        debits = list(self.journal_entry.debits)
        self.assertEqual(len(debits), 1)

    def test_credits(self):
        self.journal_entry.post(datetime.date.today(), self.account, Quantity(-5))
        credits = list(self.journal_entry.credits)
        self.assertEqual(len(credits), 1)

    def test_post(self):
        self.journal_entry.post(datetime.date.today(), self.account, Quantity(5))
        self.assertEqual(len(self.journal_entry.postings), 1)

    def test_validate_balanced(self):
        self.journal_entry.post(datetime.date.today(), self.account, Quantity(5))
        self.journal_entry.post(datetime.date.today(), self.account, Quantity(-5))
        self.journal_entry.validate()  # Should not raise an assertion error

    def test_validate_unbalanced(self):
        self.journal_entry.post(datetime.date.today(), self.account, Quantity(5))
        with self.assertRaises(AssertionError):
            self.journal_entry.validate()

if __name__ == '__main__':
    unittest.main()