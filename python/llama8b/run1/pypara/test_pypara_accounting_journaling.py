from pypara.accounting.journaling import AccountType
import unittest
from pypara.accounting.journaling import JournalEntry, Posting, Direction, Account
from datetime import date
from pypara.accounting.journaling import isum
from pypara.accounting.journaling import Direction, JournalEntry, Posting, ReadJournalEntries
from pypara.accounting.journaling import Account, AccountType
from pypara.accounting.journaling import makeguid


class TestJournalEntry(unittest.TestCase):
    def test_init(self):
        je = JournalEntry(date(2022, 1, 1), "Test", Account("Test Account", AccountType.ASSETS))
        self.assertEqual(je.date, date(2022, 1, 1))
        self.assertEqual(je.description, "Test")
        self.assertEqual(je.source, "Test Account")
        self.assertEqual(len(je.postings), 0)

    def test_post(self):
        je = JournalEntry(date(2022, 1, 1), "Test", Account("Test Account", AccountType.ASSETS))
        je.post(date(2022, 1, 1), Account("Test Account", AccountType.ASSETS), 100)
        self.assertEqual(len(je.postings), 1)
        self.assertEqual(je.postings[0].amount, 100)

    def test_validate(self):
        je = JournalEntry(date(2022, 1, 1), "Test", Account("Test Account", AccountType.ASSETS))
        je.post(date(2022, 1, 1), Account("Test Account", AccountType.ASSETS), 100)
        je.post(date(2022, 1, 1), Account("Test Account", AccountType.LIABILITIES), -100)
        je.validate()

    def test_str(self):
        je = JournalEntry(date(2022, 1, 1), "Test", Account("Test Account", AccountType.ASSETS))
        self.assertEqual(str(je), "JournalEntry(date(2022, 1, 1), 'Test', Account('Test Account', AccountType.ASSETS))")

    def test_repr(self):
        je = JournalEntry(date(2022, 1, 1), "Test", Account("Test Account", AccountType.ASSETS))
        self.assertEqual(repr(je), "JournalEntry(date(2022, 1, 1), 'Test', Account('Test Account', AccountType.ASSETS))")

    def test_eq(self):
        je1 = JournalEntry(date(2022, 1, 1), "Test", Account("Test Account", AccountType.ASSETS))
        je2 = JournalEntry(date(2022, 1, 1), "Test", Account("Test Account", AccountType.ASSETS))
        self.assertEqual(je1, je2)

    def test_debits(self):
        je = JournalEntry(date(2022, 1, 1), "Test", Account("Test Account", AccountType.ASSETS))
        je.post(date(2022, 1, 1), Account("Test Account", AccountType.ASSETS), 100)
        je.post(date(2022, 1, 1), Account("Test Account", AccountType.LIABILITIES), -100)
        self.assertEqual(list(je.debits), [je.postings[0]])

    def test_credits(self):
        je = JournalEntry(date(2022, 1, 1), "Test", Account("Test Account", AccountType.ASSETS))
        je.post(date(2022, 1, 1), Account("Test Account", AccountType.ASSETS), 100)
        je.post(date(2022, 1, 1), Account("Test Account", AccountType.LIABILITIES), -100)
        self.assertEqual(list(je.credits), [je.postings[1]])

    def test_increments(self):
        je = JournalEntry(date(2022, 1, 1), "Test", Account("Test Account", AccountType.ASSETS))
        je.post(date(2022, 1, 1), Account("Test Account", AccountType.ASSETS), 100)
        je.post(date(2022, 1, 1), Account("Test Account", AccountType.LIABILITIES), -100)
        self.assertEqual(list(je.increments), [je.postings[0]])

    def test_decrements(self):
        je = JournalEntry(date(2022, 1, 1), "Test", Account("Test Account", AccountType.ASSETS))
        je.post(date(2022, 1, 1), Account("Test Account", AccountType.ASSETS), 100)
        je.post(date(2022, 1, 1), Account("Test Account", AccountType.LIABILITIES), -100)
        self.assertEqual(list(je.decrements), [je.postings[1]])

class TestDirection(unittest.TestCase):
    def test_direction_of(self):
        self.assertEqual(Direction.of(1).name, 'INC')
        self.assertEqual(Direction.of(-1).name, 'DEC')

class TestPosting(unittest.TestCase):
    def test_posting_init(self):
        posting = Posting(None, date(2022, 1, 1), Account('Account1', AccountType.ASSETS), Direction.INC, Amount(100))
        self.assertEqual(posting.journal, None)
        self.assertEqual(posting.date, date(2022, 1, 1))
        self.assertEqual(posting.account, Account('Account1', AccountType.ASSETS))
        self.assertEqual(posting.direction, Direction.INC)
        self.assertEqual(posting.amount, Amount(100))

    def test_posting_is_debit(self):
        posting = Posting(None, date(2022, 1, 1), Account('Account1', AccountType.ASSETS), Direction.INC, Amount(100))
        self.assertTrue(posting.is_debit)

    def test_posting_is_credit(self):
        posting = Posting(None, date(2022, 1, 1), Account('Account1', AccountType.REVENUES), Direction.DEC, Amount(100))
        self.assertTrue(posting.is_credit)

class TestJournalEntry(unittest.TestCase):
    def test_journal_entry_init(self):
        journal_entry = JournalEntry(date(2022, 1, 1), 'Description', None)
        self.assertEqual(journal_entry.date, date(2022, 1, 1))
        self.assertEqual(journal_entry.description, 'Description')
        self.assertEqual(journal_entry.source, None)
        self.assertEqual(journal_entry.postings, [])

    def test_journal_entry_post(self):
        journal_entry = JournalEntry(date(2022, 1, 1), 'Description', None)
        posting = journal_entry.post(date(2022, 1, 1), Account('Account1', AccountType.ASSETS), Amount(100))
        self.assertEqual(len(journal_entry.postings), 1)
        self.assertEqual(posting.journal, journal_entry)
        self.assertEqual(posting.date, date(2022, 1, 1))
        self.assertEqual(posting.account, Account('Account1', AccountType.ASSETS))
        self.assertEqual(posting.direction, Direction.INC)
        self.assertEqual(posting.amount, Amount(100))

    def test_journal_entry_validate(self):
        journal_entry = JournalEntry(date(2022, 1, 1), 'Description', None)
        posting1 = journal_entry.post(date(2022, 1, 1), Account('Account1', AccountType.ASSETS), Amount(100))
        posting2 = journal_entry.post(date(2022, 1, 1), Account('Account2', AccountType.REVENUES), Amount(100))
        journal_entry.validate()

class TestReadJournalEntries(unittest.TestCase):
    def test_read_journal_entries(self):
        class MockReadJournalEntries(ReadJournalEntries):
            def __call__(self, period: DateRange) -> Iterable[JournalEntry]:
                return [JournalEntry(date(2022, 1, 1), 'Description', None)]
        read_journal_entries = MockReadJournalEntries()
        journal_entries = list(read_journal_entries(DateRange(date(2022, 1, 1), date(2022, 1, 1))))
        self.assertEqual(len(journal_entries), 1)

if __name__ == '__main__':
    unittest.main()