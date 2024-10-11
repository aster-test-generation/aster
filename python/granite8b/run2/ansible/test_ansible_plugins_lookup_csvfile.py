import csv
import unittest
from ansible.plugins.lookup.csvfile import CSVRecoder, CSVReader, LookupModule


class TestCSVRecoder(unittest.TestCase):
    def test_csv_recoder(self):
        f = open('test.csv', 'w')
        f.write('a,b\n')
        f.write('1,2\n')
        f.write('3,4\n')
        f.close()

        f = open('test.csv', 'rb')
        recoder = CSVRecoder(f)
        reader = csv.reader(recoder)
        for row in reader:
            self.assertEqual(row[0], 'a')
            self.assertEqual(row[1], 'b')
            self.assertEqual(row[2], '1')
            self.assertEqual(row[3], '2')
            self.assertEqual(row[4], '3')
            self.assertEqual(row[5], '4')

class TestCSVReader(unittest.TestCase):
    def test_csv_reader(self):
        f = open('test.csv', 'w')
        f.write('a,b\n')
        f.write('1,2\n')
        f.write('3,4\n')
        f.close()

        f = open('test.csv', 'rb')
        reader = CSVReader(f)
        for row in reader:
            self.assertEqual(row[0], '1')
            self.assertEqual(row[1], '2')
            self.assertEqual(row[2], '3')
            self.assertEqual(row[3], '4')

class TestLookupModule(unittest.TestCase):
    def test_read_csv(self):
        f = open('test.csv', 'w')
        f.write('a,b\n')
        f.write('1,2\n')
        f.write('3,4\n')
        f.close()

        lookup = LookupModule()
        result = lookup.read_csv('test.csv', 'a', ',', 'utf-8', None, 1)
        self.assertEqual(result, '1')

if __name__ == '__main__':
    unittest.main()