import unittest
from pypara.accounting.journaling import Direction, JournalEntry, Posting, ReadJournalEntries


class TestDirectionEnum(unittest.TestCase):
    def test_INC_value(self):
        self.assertEqual(Direction.INC.value, 1)

    def test_DEC_value(self):
        self.assertEqual(Direction.DEC.value, -1)

    def test_of_INC(self):
        self.assertEqual(Direction.of(Quantity(1)), Direction.INC)

    def test_of_DEC(self):
        self.assertEqual(Direction.of(Quantity(-1)), Direction.DEC)

class TestPosting(unittest.TestCase):
    def test_init(self):
        posting = Posting(JournalEntry("desc"), datetime.date(2022, 1, 1), Account("acc"), Direction.INC, Amount(10))
        self.assertEqual(posting.journal.description, "desc")
        self.assertEqual(posting.date, datetime.date(2022, 1, 1))
        self.assertEqual(posting.account.name, "acc")
        self.assertEqual(posting.direction, Direction.INC)
        self.assertEqual(posting.amount, Amount(10))

    def test_is_debit(self):
        posting = Posting(JournalEntry("desc"), datetime.date(2022, 1, 1), Account("acc", AccountType.ASSETS), Direction.INC, Amount(10))
        self.assertTrue(posting.is_debit)

    def test_is_credit(self):
        posting = Posting(JournalEntry("desc"), datetime.date(2022, 1, 1), Account("acc", AccountType.REVENUES), Direction.DEC, Amount(10))
        self.assertTrue(posting.is_credit)

class TestJournalEntry(unittest.TestCase):
    def test_init(self):
        journal_entry = JournalEntry(datetime.date(2022, 1, 1), "desc", "source")
        self.assertEqual(journal_entry.date, datetime.date(2022, 1, 1))
        self.assertEqual(journal_entry.description, "desc")
        self.assertEqual(journal_entry.source, "source")
        self.assertEqual(journal_entry.guid, makeguid())

    def test_increments(self):
        journal_entry = JournalEntry(datetime.date(2022, 1, 1), "desc", "source")
        posting1 = Posting(journal_entry, datetime.date(2022, 1, 1), Account("acc1"), Direction.INC, Amount(10))
        posting2 = Posting(journal_entry, datetime.date(2022, 1, 1), Account("acc2"), Direction.DEC, Amount(10))
        journal_entry.postings = [posting1, posting2]
        self.assertEqual(list(journal_entry.increments), [posting1])

    def test_decrements(self):
        journal_entry = JournalEntry(datetime.date(2022, 1, 1), "desc", "source")
        posting1 = Posting(journal_entry, datetime.date(2022, 1, 1), Account("acc1"), Direction.INC, Amount(10))
        posting2 = Posting(journal_entry, datetime.date(2022, 1, 1), Account("acc2"), Direction.DEC, Amount(10))
        journal_entry.postings = [posting1, posting2]
        self.assertEqual(list(journal_entry.decrements), [posting2])

    def test_debits(self):
        journal_entry = JournalEntry(datetime.date(2022, 1, 1), "desc", "source")
        posting1 = Posting(journal_entry, datetime.date(2022, 1, 1), Account("acc1", AccountType.ASSETS), Direction.INC, Amount(10))
        posting2 = Posting(journal_entry, datetime.date(2022, 1, 1), Account("acc2", AccountType.REVENUES), Direction.DEC, Amount(10))
        journal_entry.postings = [posting1, posting2]
        self.assertEqual(list(journal_entry.debits), [posting1])

    def test_credits(self):
        journal_entry = JournalEntry(datetime.date(2022, 1, 1), "desc", "source")
        posting1 = Posting(journal_entry, datetime.date(2022, 1, 1), Account("acc1", AccountType.ASSETS), Direction.INC, Amount(10))
        posting2 = Posting(journal_entry, datetime.date(2022, 1, 1), Account("acc2", AccountType.REVENUES), Direction.DEC, Amount(10))
        journal_entry.postings = [posting1, posting2]
        self.assertEqual(list(journal_entry.credits), [posting2])

if __name__ == '__main__':
    unittest.main()