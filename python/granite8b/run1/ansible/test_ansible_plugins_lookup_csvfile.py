import csv
import unittest
from ansible.plugins.lookup.csvfile import CSVReader, CSVRecoder, LookupModule


class TestCSVRecoder(unittest.TestCase):
    def test_csv_recoder(self):
        f = open('test.csv', 'w')
        f.write('a,b\n')
        f.write('1,2\n')
        f.close()
        f = open('test.csv', 'rb')
        recoder = CSVRecoder(f, encoding='utf-8')
        reader = csv.reader(recoder)
        row = next(reader)
        self.assertEqual(row[0], 'a')
        self.assertEqual(row[1], 'b')
        f.close()

class TestCSVReader(unittest.TestCase):
    def test_csv_reader(self):
        f = open('test.csv', 'w')
        f.write('a,b\n')
        f.write('1,2\n')
        f.close()
        f = open('test.csv', 'rb')
        reader = CSVReader(f, delimiter=',', encoding='utf-8')
        row = next(reader)
        self.assertEqual(row[0], 'a')
        self.assertEqual(row[1], 'b')
        f.close()

class TestLookupModule(unittest.TestCase):
    def test_read_csv(self):
        f = open('test.csv', 'w')
        f.write('a,b\n')
        f.write('1,2\n')
        f.close()
        lookup_module = LookupModule()
        result = lookup_module.read_csv('test.csv', 'a', ',', encoding='utf-8', dflt=None, col=1)
        self.assertEqual(result, '1')
        f.close()

if __name__ == '__main__':
    unittest.main()