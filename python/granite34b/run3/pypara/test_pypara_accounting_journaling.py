import unittest
from pypara.accounting.journaling import Direction, JournalEntry, Posting, ReadJournalEntries
from pypara.commons.numbers import Amount, Quantity
from pypara.commons.others import Guid, makeguid
from pypara.commons.zeitgeist import DateRange
from pypara.accounting.accounts import Account, AccountType


class TestDirection(unittest.TestCase):
    def test_of(self):
        self.assertEqual(Direction.of(Quantity(10)), Direction.DEC)
        self.assertEqual(Direction.of(Quantity(-10)), Direction.DEC)

class TestPosting(unittest.TestCase):
    def test_is_debit(self):
        account = Account("Test Account", AccountType.ASSETS)
        posting = Posting(JournalEntry(datetime.date.today(), "Test Description", None), datetime.date.today(), account, Direction.INC, Amount(100))
        self.assertTrue(posted.is_debit)

    def test_is_credit(self):
        account = Account("Test Account", AccountType.ASSETS)
        posted = Posting(JournalEntry(datetime.date.today(), "Test Description", None), datetime.date.today(), account, Direction.INC, Amount(100))
        self.assertFalse(posted.is_credit)

class TestJournalEntry(unittest.TestCase):
    def test_post(self):
        from datetime import date
        account = Account("Test Account", AccountType.ASSETS)
        entry.post(datetime.date.today(), account, Quantity(100))
        self.assertEqual(len(entry.postings), 1)

    def test_validate(self):
        from datetime import date
        account1 = Account("Test Account 1", AccountType.ASSETS)
        account2 = Account("Test Account 2", AccountType.LIABILITIES)
        entry.post(datetime.date.today(), account1, Quantity(100))
        entry.post(datetime.date.today(), account2, Quantity(-100))
        entry.validate()

class TestReadJournalEntries(unittest.TestCase):
    def test_call(self):
        class MockReadJournalEntries(ReadJournalEntries):
            def __call__(self, period: DateRange) -> Iterable[JournalEntry]:
                return []

        read_entries = MockReadJournalEntries()
        self.assertEqual(list(read_entries(DateRange(datetime.date.today(), datetime.date.today()))), [])

if __name__ == '__main__':
    unittest.main()